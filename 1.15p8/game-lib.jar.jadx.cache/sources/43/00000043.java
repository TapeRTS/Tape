package com.corrodinggames.rts.gameFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.Toast;
import com.corrodinggames.rts.appFramework.ActivityC0112i;
import com.corrodinggames.rts.appFramework.C0086c;
import com.corrodinggames.rts.appFramework.gameView;
import com.corrodinggames.rts.game.System_Hcat;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.TextWrapper;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p026f.UnitGeoIndex;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.ModLoader.ModEngine;
import com.corrodinggames.rts.gameFramework.draw.Graphics;
import com.corrodinggames.rts.gameFramework.effect.EffectEngine;
import com.corrodinggames.rts.gameFramework.file.C0670a;
import com.corrodinggames.rts.gameFramework.gui.InterfaceEngine;
import com.corrodinggames.rts.gameFramework.gui.minimap_img;
import com.corrodinggames.rts.gameFramework.mission.MissionEngine;
import com.corrodinggames.rts.gameFramework.network.C0797n;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.network.mapType;
import com.corrodinggames.rts.gameFramework.p039j.C0831a;
import com.corrodinggames.rts.gameFramework.path.PathEngine;
import com.corrodinggames.rts.gameFramework.utility.ANRWatchDogThread;
import com.corrodinggames.rts.gameFramework.utility.AbstractC0929e;
import com.corrodinggames.rts.gameFramework.utility.C0904a;
import com.corrodinggames.rts.gameFramework.utility.C0934i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l.class */
public abstract class GameEngine {

    /* renamed from: ap */
    public Context f5815ap;

    /* renamed from: aq */
    public gameView gameViewA;

    /* renamed from: ar */
    public gameView f5817ar;

    /* renamed from: as */
    public boolean f5818as;

    /* renamed from: ax */
    public static Throwable f5805ax;

    /* renamed from: aA */
    public static boolean noBackground;

    /* renamed from: aB */
    public static boolean f5795aB;

    /* renamed from: aC */
    public static boolean f5796aC;

    /* renamed from: aD */
    public static boolean noResources;

    /* renamed from: aE */
    public static boolean disable_atlas;

    /* renamed from: aF */
    public static boolean CanvasGL;

    /* renamed from: aG */
    public static boolean printUnits;

    /* renamed from: aH */
    public static boolean outputUnitImages;

    /* renamed from: aI */
    public static boolean oldReplays;

    /* renamed from: aL */
    public static boolean noMods;

    /* renamed from: aR */
    public static boolean f5804aR;

    /* renamed from: aS */
    public boolean f5814aS;

    /* renamed from: bg */
    public static Class f5806bg;

    /* renamed from: bh */
    public static Graphics f5807bh;

    /* renamed from: bj */
    public boolean f5840bj;

    /* renamed from: bp */
    public boolean f5841bp;

    /* renamed from: bs */
    public Team playerTeam;

    /* renamed from: bv */
    public boolean editorMode;

    /* renamed from: bw */
    public boolean InvincibleUnits;

    /* renamed from: by */
    public int f5845by;

    /* renamed from: bz */
    public int f5846bz;

    /* renamed from: bA */
    public int f5819bA;

    /* renamed from: bB */
    public int f5820bB;

    /* renamed from: bC */
    public int f5821bC;

    /* renamed from: bD */
    public boolean f5822bD;

    /* renamed from: bJ */
    public int globalSeed;

    /* renamed from: bK */
    public C0934i f5824bK;

    /* renamed from: bL */
    public Map map;

    /* renamed from: bM */
    public AudioEngine audio;

    /* renamed from: bN */
    public MusicController musicController;

    /* renamed from: bO */
    public Graphics graphics;

    /* renamed from: bP */
    public CollisionEngine collisionEngine;

    /* renamed from: bQ */
    public SettingsEngine curSettings;

    /* renamed from: bR */
    public EffectEngine effects;

    /* renamed from: bS */
    public InterfaceEngine interfaceEngine;

    /* renamed from: bT */
    public InputController f5833bT;

    /* renamed from: bU */
    public PathEngine PathEngine;

    /* renamed from: bV */
    public GroupController groupController;

    /* renamed from: bW */
    public minimap_img f5836bW;

    /* renamed from: bX */
    public NetworkEngine networkEngine;

    /* renamed from: bY */
    public StatsHandler StatsHandler;

    /* renamed from: bZ */
    public ModEngine ModEngine;

    /* renamed from: ca */
    public GameSaver f5862ca;

    /* renamed from: cb */
    public ReplayEngine replayEngine;

    /* renamed from: cc */
    public UnitGeoIndex UnitGeoIndex;

    /* renamed from: cd */
    public C0651bl f5865cd;

    /* renamed from: ce */
    public MissionEngine f5866ce;

    /* renamed from: cf */
    public CommandController f5867cf;

    /* renamed from: ch */
    public float f5868ch;

    /* renamed from: ci */
    public float densityScale;

    /* renamed from: cj */
    public static Point f5808cj;

    /* renamed from: ck */
    public float f5870ck;

    /* renamed from: cl */
    public float f5871cl;

    /* renamed from: cn */
    public float f5872cn;

    /* renamed from: co */
    public float f5873co;

    /* renamed from: cp */
    public float f5874cp;

    /* renamed from: cq */
    public float f5875cq;

    /* renamed from: cr */
    public float f5876cr;

    /* renamed from: cs */
    public boolean f5877cs;

    /* renamed from: ct */
    public int f5878ct;

    /* renamed from: cu */
    public int f5879cu;

    /* renamed from: cv */
    public float viewpointX_rounded;

    /* renamed from: cw */
    public float viewpointY_rounded;

    /* renamed from: cx */
    public float f5882cx;

    /* renamed from: cy */
    public float f5883cy;

    /* renamed from: cz */
    public float f5884cz;

    /* renamed from: cA */
    public float f5847cA;

    /* renamed from: cB */
    public float f5848cB;

    /* renamed from: cC */
    public float f5849cC;

    /* renamed from: cD */
    public float f5850cD;

    /* renamed from: cE */
    public float f5851cE;

    /* renamed from: cF */
    public float f5852cF;

    /* renamed from: cG */
    public float f5853cG;

    /* renamed from: cH */
    public float f5854cH;

    /* renamed from: cI */
    public float f5855cI;

    /* renamed from: cQ */
    public boolean f5856cQ;

    /* renamed from: cR */
    public boolean f5857cR;

    /* renamed from: cS */
    public float f5858cS;

    /* renamed from: cT */
    public boolean f5859cT;

    /* renamed from: cY */
    public boolean f5860cY;

    /* renamed from: cZ */
    public float f5861cZ;

    /* renamed from: da */
    public float f5891da;

    /* renamed from: dl */
    public String f5892dl;

    /* renamed from: dm */
    public InputNetStream inputNetStream;

    /* renamed from: dn */
    public Paint f5894dn;

    /* renamed from: do */
    public Paint f5895do;

    /* renamed from: dp */
    public Paint f5896dp;

    /* renamed from: dw */
    public int f5897dw;

    /* renamed from: dA */
    float f5885dA;

    /* renamed from: dE */
    public String f5886dE;

    /* renamed from: dF */
    public String f5887dF;

    /* renamed from: dG */
    public String f5888dG;

    /* renamed from: dK */
    String f5889dK;

    /* renamed from: dL */
    String f5890dL;

    /* renamed from: e */
    private int f5898e;

    /* renamed from: dP */
    static byte[] f5809dP;

    /* renamed from: dS */
    static ANRWatchDogThread f5810dS;

    /* renamed from: dV */
    static boolean f5811dV;

    /* renamed from: dX */
    static boolean f5812dX;

    /* renamed from: dY */
    static boolean f5813dY;

    /* renamed from: an */
    protected static GameEngine gameEngine = null;

    /* renamed from: au */
    public static boolean isReleaseVersion = true;

    /* renamed from: av */
    public static boolean isTestingBuild = false;

    /* renamed from: aw */
    public static boolean f5902aw = false;

    /* renamed from: ay */
    public static boolean Replay_Debug = false;

    /* renamed from: az */
    public static boolean f5904az = false;

    /* renamed from: aJ */
    public static boolean steam = false;

    /* renamed from: aK */
    public static boolean sandbox = false;

    /* renamed from: aM */
    public static String f5907aM = null;

    /* renamed from: aN */
    public static boolean f5908aN = false;

    /* renamed from: aO */
    public static boolean postprocessing = false;

    /* renamed from: aP */
    public static boolean teamShaders = false;

    /* renamed from: aQ */
    public static String f5911aQ = null;

    /* renamed from: aT */
    public static boolean f5912aT = false;

    /* renamed from: aU */
    public static boolean isDedicatedServer = false;

    /* renamed from: aV */
    public static boolean isDebugBuild = false;

    /* renamed from: aW */
    public static boolean isPC_Device = false;

    /* renamed from: aX */
    public static boolean isJava = false;
    // lib gdx调试

    /* renamed from: aY */
    public static boolean isLibGDX = false;

    /* renamed from: aZ */
    public static boolean isIOS_Device = false;

    /* renamed from: ba */
    public static String f5919ba = null;

    /* renamed from: bb */
    public static boolean f5920bb = false;

    /* renamed from: bc */
    public static boolean f5921bc = true;

    /* renamed from: bd */
    public static boolean f5922bd = true;

    /* renamed from: be */
    public static boolean f5923be = false;

    /* renamed from: bf */
    public static boolean f5924bf = false;

    /* renamed from: dy */
    public static AbstractC0897o f5925dy = new C0957v();

    /* renamed from: dz */
    public static String BuildVersionRELEASE = Build.VERSION.RELEASE;

    /* renamed from: dO */
    public static boolean f5927dO = false;

    /* renamed from: dQ */
    static byte[] f5928dQ = new byte[1000];

    /* renamed from: dR */
    static byte[] f5929dR = new byte[1000];

    /* renamed from: dT */
    static boolean isANRDogOK = false;

    /* renamed from: dU */
    static int f5931dU = 0;

    /* renamed from: dW */
    static EnumC0903u f5932dW = null;

    /* renamed from: al */
    public final Object f5933al = new Object();

    /* renamed from: am */
    public final Object f5934am = new Object();

    /* renamed from: ao */
    public Context f5935ao = null;

    /* renamed from: at */
    public boolean f5936at = false;

    /* renamed from: bi */
    public boolean init_called = false;

    /* renamed from: bk */
    public boolean f5938bk = false;

    /* renamed from: bl */
    public boolean debugTempMode = false;

    /* renamed from: bm */
    public boolean f5940bm = false;

    /* renamed from: bn */
    public boolean triggerDebug = false;

    /* renamed from: bo */
    public boolean f5942bo = false;

    /* renamed from: bq */
    public boolean gameRunning = false;

    /* renamed from: br */
    public boolean f5944br = false;

    /* renamed from: bt */
    public float gameSpeed = 1.0f;

    /* renamed from: bu */
    public float f5946bu = -1.0f;

    /* renamed from: bx */
    public int frameNumber = 0;

    /* renamed from: bE */
    public boolean f5948bE = false;

    /* renamed from: bF */
    public volatile boolean f5949bF = false;

    /* renamed from: bG */
    public volatile boolean f5950bG = false;

    /* renamed from: bH */
    public volatile boolean f5951bH = false;

    /* renamed from: bI */
    public volatile boolean f5952bI = false;

    /* renamed from: cg */
    public boolean f5953cg = false;

    /* renamed from: cm */
    public float f5954cm = 1.0f;

    /* renamed from: cJ */
    public final Rect f5955cJ = new Rect();

    /* renamed from: cK */
    public final Rect f5956cK = new Rect();

    /* renamed from: cL */
    public final RectF f5957cL = new RectF();

    /* renamed from: cM */
    public final Rect f5958cM = new Rect();

    /* renamed from: cN */
    public final RectF f5959cN = new RectF();

    /* renamed from: cO */
    public final RectF f5960cO = new RectF();

    /* renamed from: cP */
    public final Rect f5961cP = new Rect();

    /* renamed from: cU */
    public float f5962cU = 1.0f;

    /* renamed from: cV */
    public boolean f5963cV = false;

    /* renamed from: cW */
    public float viewpointZoom = 1.0f;

    /* renamed from: cX */
    public float f5965cX = 1.0f;

    /* renamed from: db */
    public boolean f5966db = true;

    /* renamed from: dc */
    public boolean f5967dc = true;

    /* renamed from: dd */
    public boolean f5968dd = true;

    /* renamed from: de */
    public boolean f5969de = true;

    /* renamed from: df */
    public boolean f5970df = true;

    /* renamed from: dg */
    public boolean f5971dg = true;

    /* renamed from: dh */
    public float f5972dh = 0.0f;

    /* renamed from: di */
    public float f5973di = 0.0f;

    /* renamed from: dj */
    public boolean f5974dj = false;

    /* renamed from: dk */
    protected AndroidGameThread gameThread = null;

    /* renamed from: dq */
    public boolean f5976dq = false;

    /* renamed from: dr */
    public boolean f5977dr = false;

    /* renamed from: ds */
    public float f5978ds = 0.0f;

    /* renamed from: dt */
    public boolean f5979dt = false;

    /* renamed from: du */
    public boolean f5980du = false;

    /* renamed from: dv */
    public boolean f5981dv = false;

    /* renamed from: dx */
    public float f5982dx = 0.0f;

    /* renamed from: dB */
    boolean f5983dB = false;

    /* renamed from: dC */
    ArrayList f5984dC = new ArrayList();

    /* renamed from: dD */
    final Handler f5985dD = new Handler(Looper.m4602b());

    /* renamed from: a */
    private Runnable f5986a = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.l.1
        @Override // java.lang.Runnable
        public void run() {
            String str = GameEngine.this.f5886dE;
            try {
                if (str == null) {
                    GameEngine.log("Cannot show toast, no message");
                } else {
                    Toast.makeText(GameEngine.this.f5935ao, str, 1).show();
                }
            } catch (Exception e) {
                GameEngine.log("Error showing toast: " + ((Object) str));
                e.printStackTrace();
            }
        }
    };

    /* renamed from: b */
    private Runnable f5987b = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.l.2
        @Override // java.lang.Runnable
        public void run() {
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.gameFramework.l.2.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    GameEngine.this.f5841bp = false;
                }
            };
            DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: com.corrodinggames.rts.gameFramework.l.2.2
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    GameEngine.this.f5841bp = false;
                }
            };
            GameEngine.PrintLOG("showMessageBoxRunnable context:" + GameEngine.this.f5935ao.getClass().getName());
            try {
                new AlertDialog.Builder(GameEngine.this.f5935ao).setIcon(17301543).setTitle(GameEngine.this.f5887dF).setMessage(GameEngine.this.f5888dG).setOnCancelListener(onCancelListener).setPositiveButton("Ok", onClickListener).show();
            } catch (WindowManager.BadTokenException e) {
                GameEngine.log("Failed to show message: " + GameEngine.this.f5888dG);
                e.printStackTrace();
            }
        }
    };

    /* renamed from: dH */
    public AbstractC0896n f5988dH = null;

    /* renamed from: dI */
    transient String f5989dI = null;

    /* renamed from: dJ */
    Object f5990dJ = new Object();
    // 队伍相关需要注意

    /* renamed from: dM */
    public boolean[] f5991dM = new boolean[10];

    /* renamed from: dN */
    protected ConcurrentLinkedQueue f5992dN = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private boolean[] f5993c = new boolean[KeyEvent.m4551a() + 1];

    /* renamed from: d */
    private boolean[] f5994d = new boolean[KeyEvent.m4551a() + 1];

    /* renamed from: dZ */
    public byte f5995dZ = 42;

    /* renamed from: ea */
    public byte f5996ea = 42;

    /* renamed from: eb */
    public final C0899q f5997eb = new C0899q();

    /* renamed from: ec */
    public final C0899q f5998ec = new C0899q();

    /* renamed from: ed */
    public final C0899q f5999ed = new C0899q();

    /* renamed from: a */
    public abstract void mo895a(Context context);

    /* renamed from: a */
    public abstract boolean mo903a();

    /* renamed from: a */
    public abstract boolean mo880a(boolean z);

    /* renamed from: a */
    public abstract void mo896a(Activity activity, gameView gameview, boolean z);

    /* renamed from: b */
    public abstract void mo848b(int i, int i2);

    /* renamed from: c */
    public abstract int gameVersionInternal(boolean z);

    /* renamed from: k */
    public abstract boolean isBetaVersion();

    /* renamed from: l */
    public abstract boolean mo809l();

    /* renamed from: i */
    public abstract String mo818i();

    /* renamed from: j */
    public abstract String mo815j();

    /* renamed from: n */
    public abstract String getVersionNZ();

    /* renamed from: p */
    public abstract String getCurGameVersion();

    /* renamed from: q */
    public abstract String curBuildVersion();

    /* renamed from: o */
    public abstract void mo804o();

    /* renamed from: r */
    public abstract String gameVersion();

    /* renamed from: a */
    public abstract void mo878a(boolean z, boolean z2, EnumC0901s enumC0901s);

    /* renamed from: a */
    public abstract void mo879a(boolean z, EnumC0901s enumC0901s);

    /* renamed from: d */
    public abstract void mo834d();

    /* renamed from: t */
    public abstract void mo799t();

    /* renamed from: a */
    public abstract void mo900a(float f, int i);

    /* renamed from: b */
    public abstract void mo850b(float f, int i);

    /* renamed from: v */
    public abstract int mo798v();

    /* renamed from: b */
    public abstract int mo852b();

    /* renamed from: c */
    public abstract boolean mo842c();

    /* renamed from: b */
    public static boolean m846b(Context context) {
        String str;
        if (isDedicatedServer) {
            str = "dedicatedServer";
        } else {
            str = context.mo4793g().mo4792h();
        }
        Log.e("RustedWarfare", "packageName:" + str);
        if (str.contains("rtsdemo")) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public boolean m797w() {
        return this.f5857cR || this.f5858cS > 0.0f || this.f5859cT;
    }

    /* renamed from: x */
    public static final GameEngine getInstance() {
        return gameEngine;
    }

    /* renamed from: y */
    public static final boolean m795y() {
        return f5923be;
    }

    /* renamed from: z */
    public static final boolean m794z() {
        return f5924bf;
    }

    /* renamed from: c */
    public void m839c(Context context) {
        C0086c.m4438a(context);
        this.f5935ao = context;
    }

    /* renamed from: a */
    public static synchronized GameEngine m894a(Context context, AbstractC0896n abstractC0896n) {
        if (gameEngine != null) {
            if (abstractC0896n != null) {
                gameEngine.f5988dH = abstractC0896n;
            }
            gameEngine.m839c(context);
            return gameEngine;
        }
        gameEngine = f5925dy.mo435a(context);
        PrintLOG("Created new gameEngine of:" + gameEngine.getClass().getName());
        if (abstractC0896n != null) {
            gameEngine.f5988dH = abstractC0896n;
        }
        gameEngine.mo895a(context);
        return gameEngine;
    }

    public GameEngine(Context context) {
        Log.e("RustedWarfare", "GameEngine:GameEngine()");
        if (gameEngine != null) {
            throw new RuntimeException("gameEngine already created");
        }
        m839c(context);
        gameEngine = this;
    }

    protected void finalize() {
        Log.e("RustedWarfare", "GameEngine:finalize()");
        super.finalize();
    }

    /* renamed from: A */
    public boolean m929A() {
        return true;
    }

    /* renamed from: B */
    public void m928B() {
    }

    /* renamed from: C */
    public String getDeviceModel() {
        if (isPC()) {
            return "PC";
        }
        if (isIOS_Device) {
            String m1029a = C0831a.m1029a();
            if (m1029a != null) {
                return "IOS - " + m1029a;
            }
            return "IOS";
        } else if (isDedicatedServer) {
            return "SERVER";
        } else {
            return Build.MODEL;
        }
    }

    /* renamed from: D */
    public String getBuildVersion() {
        return BuildVersionRELEASE;
    }

    /* renamed from: E */
    public boolean m925E() {
        if (this.f5951bH) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public synchronized void m924F() {
        PrintLOG("--- setRunning ---");
        if (!isPC() && !isIOS_Device) {
            this.musicController.m2343h();
        }
        if (!isPC_Device && !f5920bb && this.gameThread == null) {
            this.gameThread = new AndroidGameThread();
            this.gameThread.m402a(true);
            this.gameThread.start();
        }
    }

    /* renamed from: G */
    public synchronized void m923G() {
        PrintLOG("--- setStoppedIfNotInGameThread ---");
        if (Thread.currentThread() != this.gameThread) {
            m922H();
        }
    }

    /* renamed from: H */
    public synchronized void m922H() {
        PrintLOG("--- setStopped ---");
        if (this.gameThread == null) {
            Log.e("RustedWarfare", "gameThread already null");
            return;
        }
        if (!isPC()) {
            this.musicController.pause();
        }
        this.gameThread.m402a(false);
        if (Thread.currentThread() != this.gameThread) {
            boolean z = true;
            while (z) {
                try {
                    this.gameThread.join();
                    z = false;
                } catch (InterruptedException e) {
                }
            }
            Log.e("RustedWarfare", "thread stop");
        } else {
            LogTrace("currentThread is game thread");
        }
        this.gameThread = null;
        if (this.gameViewA != null) {
            this.gameViewA.mo232n();
        }
        if (this.f5948bE) {
            Debug.stopMethodTracing();
        }
    }

    /* renamed from: I */
    public boolean m921I() {
        if (this.networkEngine == null || !this.networkEngine.networked || this.networkEngine.f5126F || this.replayEngine.isPlaying()) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public boolean isNetworked() {
        if (this.networkEngine == null) {
            return false;
        }
        return this.networkEngine.networked;
    }

    /* renamed from: K */
    public boolean m919K() {
        if (this.networkEngine == null) {
            return false;
        }
        return this.networkEngine.f5126F || this.networkEngine.networked || this.replayEngine.isPlaying();
    }

    /* renamed from: L */
    public boolean m918L() {
        if (this.networkEngine != null && !this.networkEngine.f5126F) {
            return !this.networkEngine.networked && !this.replayEngine.isPlaying();
        }
        return true;
    }

    /* renamed from: M */
    public void m917M() {
        this.f5877cs = false;
        if (this.f5882cx < 0.0f) {
            this.f5882cx = 0.0f;
            this.f5877cs = true;
        }
        if (this.f5883cy < 0.0f) {
            this.f5883cy = 0.0f;
            this.f5877cs = true;
        }
        if (this.map != null) {
            if (this.f5882cx > this.map.getWidthInPixels() - this.f5850cD) {
                this.f5882cx = this.map.getWidthInPixels() - this.f5850cD;
                this.f5877cs = true;
            }
            if (this.f5883cy > this.map.getHeightInPixels() - this.f5847cA) {
                this.f5883cy = this.map.getHeightInPixels() - this.f5847cA;
                this.f5877cs = true;
            }
            if (this.f5850cD > this.map.getWidthInPixels()) {
                this.f5882cx = (this.map.getWidthInPixels() / 2.0f) - (this.f5850cD / 2.0f);
                this.f5877cs = true;
            }
            if (this.f5847cA > this.map.getHeightInPixels()) {
                this.f5883cy = (this.map.getHeightInPixels() / 2.0f) - (this.f5847cA / 2.0f);
                this.f5877cs = true;
            }
        }
        m902a(this.f5882cx, this.f5883cy);
    }

    /* renamed from: a */
    public void m902a(float f, float f2) {
        this.f5882cx = f;
        this.f5883cy = f2;
        this.f5878ct = (int) this.f5882cx;
        this.f5879cu = (int) this.f5883cy;
        this.viewpointX_rounded = ((int) (this.f5882cx * this.viewpointZoom)) / this.viewpointZoom;
        this.viewpointY_rounded = ((int) (this.f5883cy * this.viewpointZoom)) / this.viewpointZoom;
        int i = 90;
        if (m795y()) {
            i = 210;
        }
        this.f5958cM.set((int) (this.f5882cx - i), (int) (this.f5883cy - i), (int) (this.f5882cx + this.f5884cz + i), (int) (this.f5883cy + this.f5847cA + i));
        this.f5959cN.m4651a(this.f5958cM);
        this.f5961cP.set((int) this.f5882cx, (int) this.f5883cy, (int) (this.f5882cx + this.f5884cz), (int) (this.f5883cy + this.f5847cA));
        this.f5960cO.m4652a((int) (this.f5882cx - 300), (int) (this.f5883cy - 300), (int) (this.f5882cx + this.f5884cz + 300), (int) (this.f5883cy + this.f5847cA + 300));
    }

    /* renamed from: b */
    public void m851b(float f, float f2) {
        m902a(f - (this.f5850cD / 2.0f), f2 - (this.f5847cA / 2.0f));
    }

    /* renamed from: d */
    public static boolean m832d(Context context) {
        if (isDedicatedServer) {
            return false;
        }
        if (Build.MODEL.equals("GT-I9100") || Build.MODEL.equals("GT-I9300")) {
            try {
                WifiInfo connectionInfo = ((WifiManager) context.mo4797c("wifi")).getConnectionInfo();
                if (connectionInfo != null) {
                    if ("BlueStacks".equals(connectionInfo.getSSID())) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* renamed from: N */
    public void m916N() {
        if (this.viewpointZoom != 1.0f) {
            this.graphics.mo224a(this.viewpointZoom, this.viewpointZoom);
        }
    }

    /* renamed from: O */
    public void m915O() {
        if (this.viewpointZoom != 1.0f) {
            this.graphics.mo224a(1.0f / this.viewpointZoom, 1.0f / this.viewpointZoom);
        }
    }

    /* renamed from: a */
    public static void m885a(String str, Exception exc) {
        PrintLOG(str);
        exc.printStackTrace();
    }

    /* renamed from: a */
    public static String m884a(String str, String str2) {
        if (f5904az && !str.contains("\u001b[0m")) {
            str = str2 + str + "\u001b[0m";
        }
        return str;
    }

    /* renamed from: a */
    public static void PrintLOG_err(String str) {
        PrintLOG(m884a("--- ERROR: " + str, "\u001b[31m"));
    }

    /* renamed from: b */
    public static void log(String str) {
        PrintLOG(m884a(str, "\u001b[33m"));
    }

    /* renamed from: a */
    public static void LogThrowable(String str, Throwable th) {
        log(str);
        PrintLOG(VariableScope.nullOrMissingString + th.toString());
        PrintLOG("cause:" + th.getCause());
        th.printStackTrace();
    }

    /* renamed from: c */
    public static void m838c(String str) {
        if (isJava) {
            Log.d("RustedWarfare", str);
        } else {
            Log.d("RustedWarfare", str);
        }
    }

    /* renamed from: d */
    public static void m831d(String str) {
        m838c(str);
    }

    /* renamed from: e */
    public static void PrintLOG(String str) {
        m838c(str);
    }

    /* renamed from: b */
    public static void log(String str, String str2) {
        m838c(str + ":" + str2);
    }

    /* renamed from: f */
    public static synchronized void m824f(String str) {
        m838c(str + " (at " + System.nanoTime() + ")");
    }

    /* renamed from: P */
    public static void m914P() {
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            PrintLOG(stackTraceElement.toString());
        }
    }

    /* renamed from: Q */
    public static String m913Q() {
        StackTraceElement[] stackTrace;
        String str = VariableScope.nullOrMissingString;
        for (int i = 0; i < new Throwable().getStackTrace().length; i++) {
            str = str + stackTrace[i].toString() + "\n";
        }
        return str;
    }

    /* renamed from: g */
    public static void LogTrace(String str) {
        log(str);
        m914P();
    }

    /* renamed from: R */
    public static long curTimeMs() {
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public static final boolean m897a(long j, long j2) {
        long curTimeMs = curTimeMs();
        if (j + j2 < curTimeMs || curTimeMs < j - 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public float densityScale() {
        float f = this.f5868ch;
        if (this.curSettings != null) {
            f = f * this.curSettings.renderDensity * this.curSettings.uiRenderScale;
            if (this.curSettings.renderDoubleScale) {
                return f / 2.0f;
            }
        }
        return f;
    }

    /* renamed from: e */
    public int m829e(float f) {
        return (int) ((f * this.densityScale) + 0.5f);
    }

    /* renamed from: a */
    public int m899a(int i) {
        return (int) ((i * this.densityScale) + 0.5f);
    }

    /* renamed from: T */
    public void m910T() {
        if (this.f5885dA != this.densityScale) {
            PrintLOG("Density size changed, refreshing fonts");
            synchronized (this.f5984dC) {
                Iterator it = this.f5984dC.iterator();
                while (it.hasNext()) {
                    ((C0894m) it.next()).m719a();
                }
            }
            this.f5885dA = this.densityScale;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public void m909U() {
        Iterator it = this.f5984dC.iterator();
        while (it.hasNext()) {
            this.graphics.mo209a(((C0894m) it.next()).paint);
        }
        this.f5983dB = true;
    }

    /* renamed from: a */
    public void m893a(Paint paint) {
        m892a(paint, 16.0f);
    }

    /* renamed from: a */
    public void m892a(Paint paint, float f) {
        C0894m c0894m = new C0894m(this);
        c0894m.f6141a = f;
        c0894m.paint = paint;
        c0894m.m719a();
        synchronized (this.f5984dC) {
            this.f5984dC.add(c0894m);
        }
        if (this.f5983dB) {
            this.graphics.mo209a(c0894m.paint);
        }
    }

    /* renamed from: h */
    public void m819h(String str) {
        m882a(str, true);
    }

    /* renamed from: a */
    public void m882a(String str, boolean z) {
        this.f5989dI = str;
        if (this.f5988dH != null) {
            this.f5988dH.mo107a(str, z);
        }
    }

    /* renamed from: V */
    public void m908V() {
        this.f5989dI = null;
    }

    /* renamed from: i */
    public void alertA(String str) {
        alert(str, 1);
    }

    /* renamed from: a */
    public void alert(String text, int i) {
        if (isDedicatedServer) {
            PrintLOG("alert:" + text);
        } else if (text == null) {
            LogTrace("Cannot show alert, no message text");
        } else {
            this.f5886dE = text;
            this.f5985dD.m4612a(this.f5986a);
        }
        if (this.f5988dH != null) {
            this.f5988dH.mo109a(text, i);
        }
    }

    /* renamed from: W */
    public boolean m907W() {
        if (this.f5988dH != null) {
            return this.f5988dH.mo103c();
        }
        return false;
    }

    /* renamed from: a */
    public void m886a(String str, TextWrapper textWrapper) {
        String str2 = null;
        if (textWrapper != null) {
            str2 = textWrapper.m3488b();
        }
        showMessageBox(str, str2);
    }

    /* renamed from: c */
    public void showMessageBox(String str, String str2) {
        if (this.f5988dH != null) {
            this.f5988dH.mo108a(str, str2);
        }
        if (isDedicatedServer) {
            if (this.f5988dH == null) {
                log("showMessageBox: not showing due to non-android:" + str2);
                return;
            }
            return;
        }
        this.f5841bp = true;
        this.f5887dF = str;
        this.f5888dG = str2;
        this.f5985dD.m4612a(this.f5987b);
    }

    /* renamed from: X */
    public void m906X() {
        synchronized (this.f5990dJ) {
            if (this.f5889dK != null) {
                showMessageBox(this.f5890dL, this.f5889dK);
                this.f5889dK = null;
                this.f5890dL = null;
            }
        }
    }

    /* renamed from: d */
    public void m830d(String str, String str2) {
        this.f5890dL = str;
        this.f5889dK = str2;
        if (isPC_Device) {
            m906X();
        } else {
            new Thread() { // from class: com.corrodinggames.rts.gameFramework.l.3
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        sleep(3000L);
                    } catch (InterruptedException e) {
                    }
                    GameEngine.this.m906X();
                }
            }.start();
        }
    }

    /* renamed from: Y */
    public boolean m905Y() {
        if (!this.f5818as && this.gameViewA.mo233m() != null) {
            return this.gameViewA.mo233m().m4405b();
        }
        return false;
    }

    /* renamed from: Z */
    public void m904Z() {
        if (this.gameViewA.mo233m() == null) {
            return;
        }
        this.gameViewA.mo233m().m4404c();
    }

    /* renamed from: aa */
    public int m877aa() {
        if (this.f5818as) {
            return 0;
        }
        return this.gameViewA.mo233m().m4408a();
    }

    /* renamed from: ab */
    public float m876ab() {
        return m849b(0);
    }

    /* renamed from: ac */
    public float m875ac() {
        return m841c(0);
    }

    /* renamed from: b */
    public float m849b(int i) {
        if (this.curSettings.renderDoubleScale) {
            return this.gameViewA.mo233m().m4403d()[i] / 2.0f;
        }
        return this.gameViewA.mo233m().m4403d()[i];
    }

    /* renamed from: c */
    public float m841c(int i) {
        if (this.curSettings.renderDoubleScale) {
            return this.gameViewA.mo233m().m4401f()[i] / 2.0f;
        }
        return this.gameViewA.mo233m().m4401f()[i];
    }

    /* renamed from: d */
    public int m833d(int i) {
        return this.gameViewA.mo233m().m4402e()[i];
    }

    /* renamed from: e */
    public boolean m828e(int i) {
        if (i != 1 && i != 2 && i != 3) {
            throw new RuntimeException("Unknown mouseButton:" + i);
        }
        if (m825f(i) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m825f(int i) {
        if (i == 0) {
            throw new RuntimeException("finding state of 0 doesn't make sense");
        }
        int[] m4402e = this.gameViewA.mo233m().m4402e();
        for (int i2 = 0; i2 < m4402e.length; i2++) {
            if (m4402e[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public boolean m822g(int i) {
        if (i < this.f5993c.length && i >= 0 && this.f5993c[i] && this.f5994d[i]) {
            this.f5994d[i] = false;
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m820h(int i) {
        if (i >= this.f5993c.length || i < 0) {
            return false;
        }
        return this.f5993c[i];
    }

    /* renamed from: a */
    public boolean m898a(int i, boolean z) {
        boolean z2 = true;
        boolean z3 = true;
        int m874ad = m874ad();
        if ((i & 2) != 0) {
            if ((m874ad & 2) == 0) {
                z2 = false;
            }
        } else if ((m874ad & 2) != 0) {
            z3 = false;
        }
        if ((i & 1) != 0) {
            if ((m874ad & 1) == 0) {
                z2 = false;
            }
        } else if ((m874ad & 1) != 0) {
            z3 = false;
        }
        if ((i & 4) != 0) {
            if ((m874ad & 4) == 0) {
                z2 = false;
            }
        } else if ((m874ad & 4) != 0) {
            z3 = false;
        }
        if (z) {
            return z2;
        }
        return z2 && z3;
    }

    /* renamed from: i */
    public boolean m817i(int i) {
        if (i == 59 || i == 60 || i == 113 || i == 114 || i == 57 || i == 58) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static String m814j(int i) {
        String str = VariableScope.nullOrMissingString;
        if ((i & 2) != 0) {
            str = str + "shift+";
        }
        if ((i & 1) != 0) {
            str = str + "ctrl+";
        }
        if ((i & 4) != 0) {
            str = str + "alt+";
        }
        return str;
    }

    /* renamed from: ad */
    public int m874ad() {
        int i = 0;
        if (m820h(59) || m820h(60)) {
            i = 0 + 2;
        }
        if (m820h(113) || m820h(114)) {
            i++;
        }
        if (m820h(57) || m820h(58)) {
            i += 4;
        }
        return i;
    }

    /* renamed from: c */
    public boolean m840c(int i, int i2) {
        boolean z = false;
        boolean z2 = false;
        if (i >= 0 && i < this.f5993c.length) {
            z = this.f5993c[i];
        }
        if (i2 >= 0 && i2 < this.f5993c.length) {
            z2 = this.f5993c[i2];
        }
        return z || z2;
    }

    /* renamed from: b */
    public void m847b(int i, boolean z) {
        if (i >= 0 && i < this.f5993c.length) {
            this.f5993c[i] = z;
            if (z) {
                this.f5994d[i] = z;
                return;
            }
            return;
        }
        PrintLOG("setKeyState: Key out of range:" + i);
    }

    /* renamed from: k */
    public void m811k(int i) {
        this.f5992dN.add(new C0902t(this, i));
    }

    /* renamed from: ae */
    public int m873ae() {
        return this.f5898e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: af */
    public void m872af() {
        this.f5898e = 0;
        while (true) {
            C0898p c0898p = (C0898p) this.f5992dN.poll();
            if (c0898p != null) {
                if (c0898p instanceof C0900r) {
                    C0900r c0900r = (C0900r) c0898p;
                    if (c0900r.f6148c >= this.f5993c.length || c0900r.f6148c < 0) {
                        log("updateKeyState", "keyCode (" + c0900r.f6148c + ") is out of range");
                    } else {
                        this.f5993c[c0900r.f6148c] = !c0900r.f6149d;
                        this.f5994d[c0900r.f6148c] = !c0900r.f6149d;
                    }
                } else if (c0898p instanceof C0902t) {
                    this.f5898e += ((C0902t) c0898p).f6154c;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public static String m813j(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: k */
    public static String m810k(String str) {
        int i;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            i = 0;
        } else {
            i = lastIndexOf + 1;
        }
        return str.substring(i);
    }

    /* renamed from: l */
    public static Integer m808l(String str) {
        String m810k = m810k(str);
        PrintLOG("getMapLevel for :" + str + " file:" + m810k);
        Matcher matcher = Pattern.compile("^l(\\d*);.*").matcher(m810k);
        if (matcher.matches()) {
            PrintLOG("getMapLevel:" + str + ":" + Integer.parseInt(matcher.group(1)));
            return Integer.valueOf(Integer.parseInt(matcher.group(1)));
        }
        return null;
    }

    /* renamed from: m */
    public static String m807m(String str) {
        GameEngine gameEngine2 = getInstance();
        Integer m808l = m808l(str);
        if (m808l == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        String substring = str.substring(0, lastIndexOf);
        String[] m2174a = C0670a.m2174a(substring, true);
        if (m2174a == null) {
            return null;
        }
        for (String str2 : m2174a) {
            Integer m808l2 = m808l(str2);
            if (m808l2 != null && m808l2.intValue() > m808l.intValue() && (!gameEngine2.f5936at || ActivityC0112i.m4418a(str2, substring + "/" + str2))) {
                return substring + "/" + str2;
            }
        }
        return null;
    }

    /* renamed from: ag */
    public String m871ag() {
        return this.f5892dl;
    }

    /* renamed from: ah */
    public String getMapNameE() {
        String str = this.f5892dl;
        if ((this.f5892dl == null || VariableScope.nullOrMissingString.equals(this.f5892dl)) && isNetworked()) {
            str = this.networkEngine.m1371j();
        }
        return ActivityC0112i.m4415e(ActivityC0112i.m4416d(str));
    }

    /* renamed from: ai */
    public String m869ai() {
        return ActivityC0112i.m4416d(this.f5892dl);
    }

    /* renamed from: aj */
    public mapType m868aj() {
        if (ActivityC0112i.m4413g(this.f5892dl)) {
            return mapType.customMap;
        }
        return mapType.skirmishMap;
    }

    /* renamed from: a */
    public static String m881a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String obj = stringWriter.toString();
        printWriter.close();
        return obj;
    }

    /* renamed from: b */
    public static String m843b(Throwable th) {
        String str;
        Throwable th2;
        String message = th.getMessage();
        if (message == null) {
            str = th.getClass().getName();
        } else {
            str = message.replace("java.lang.RuntimeException: ", VariableScope.nullOrMissingString).replace("java.lang.RuntimeException: ", VariableScope.nullOrMissingString);
        }
        Throwable th3 = th;
        while (true) {
            th2 = th3;
            if (th2 != null) {
                Throwable cause = th2.getCause();
                if (cause == null || cause == th || cause == th2) {
                    break;
                }
                th3 = cause;
            } else {
                break;
            }
        }
        if (th2 != null && th2 != th) {
            String message2 = th2.getMessage();
            if (message2 == null) {
                message2 = th2.getClass().getName();
            }
            if (!message2.equals(str)) {
                str = str + " caused by (" + message2 + ")";
            }
        }
        return str;
    }

    /* renamed from: ak */
    public static File m867ak() {
        C0670a.m2165d();
        String str = "/SD/rustedWarfare/crashes.txt";
        if (isNonDedicatedServer()) {
            str = "/SD/rustedWarfare/crashes.txt";
        }
        return new File(C0670a.m2162e(str));
    }

    /* renamed from: e */
    public static void m826e(String str, String str2) {
        try {
            PrintWriter printWriter = new PrintWriter(C0670a.m2178a(m867ak(), true));
            printWriter.write("\r\n" + str + " (at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + " - 1.15p8" + VariableScope.nullOrMissingString + ")\n");
            printWriter.write(str2 + "\r\n");
            printWriter.close();
        } catch (Throwable th) {
            PrintLOG("Exception in writeCrashToFile");
            th.printStackTrace();
        }
    }

    /* renamed from: al */
    public static void setupANRWatchDog() {
        if (!isTestingBuild || isDedicatedServer) {
            return;
        }
        if (f5810dS != null) {
            log("setupANRWatchDog: activeANRWatchDog!=null");
            return;
        }
        f5810dS = new ANRWatchDogThread(4000);
        f5810dS.m550a(new AbstractC0929e() { // from class: com.corrodinggames.rts.gameFramework.l.4
            @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC0929e
            /* renamed from: a */
            public void mo549a(C0904a c0904a) {
                if (GameEngine.isANRDogOK) {
                    GameEngine.log("activeANRWatchDog: ANR already detected");
                }
                GameEngine.isANRDogOK = true;
                GameEngine.log("activeANRWatchDog: ANR detected");
                String m881a = GameEngine.m881a(c0904a);
                C0797n.startErrorReport("detectedANR", m881a);
                try {
                    Thread.sleep(400L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(GameSaver.m411a("lastFreeze", VariableScope.nullOrMissingString, true));
                    PrintStream printStream = new PrintStream(fileOutputStream);
                    printStream.print(m881a);
                    printStream.close();
                    fileOutputStream.close();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        });
        f5810dS.start();
        log("setupANRWatchDog: running");
    }

    /* renamed from: am */
    public static void m865am() {
        if (f5809dP == null && isPC()) {
            f5809dP = new byte[2500000];
            f5809dP[0] = 2;
            f5809dP[f5809dP.length - 1] = 5;
        }
        if (f5796aC) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
            if (!(uncaughtExceptionHandler instanceof C0812i)) {
                Thread.currentThread().setUncaughtExceptionHandler(new C0812i(uncaughtExceptionHandler));
                return;
            }
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (!(defaultUncaughtExceptionHandler instanceof C0812i)) {
            Thread.setDefaultUncaughtExceptionHandler(new C0812i(defaultUncaughtExceptionHandler));
        }
    }

    /* renamed from: an */
    public boolean m864an() {
        return true;
    }

    /* renamed from: ao */
    public boolean m863ao() {
        return true;
    }

    /* renamed from: n */
    public static void m805n(String str) {
        GameEngine gameEngine2 = getInstance();
        if (gameEngine2 != null) {
            f5931dU++;
            if (f5931dU < 1000) {
                log("reportProblem: " + str);
            }
            if (f5931dU < 10) {
                gameEngine2.alert(str, 1);
            }
        }
    }

    /* renamed from: ap */
    public static boolean isNonDedicatedServer() {
        return !isDedicatedServer;
    }

    /* renamed from: aq */
    public static boolean isIOS() {
        return !isPC_Device || isIOS_Device;
    }

    /* renamed from: ar */
    public static boolean isPC() {
        return isPC_Device && !isIOS_Device;
    }

    /* renamed from: as */
    public static boolean isPC_() {
        return isPC_Device && !isIOS_Device;
    }

    /* renamed from: at */
    public static boolean m858at() {
        return isDedicatedServer && !isPC_Device;
    }

    /* renamed from: au */
    public boolean m857au() {
        return this.networkEngine.networked || this.replayEngine.isPlaying();
    }

    /* renamed from: a */
    public void m891a(Unit unit, float f) {
        this.f5836bW.m1801a((int) unit.x, (int) unit.y, f, unit);
        this.interfaceEngine.f4737f.m1951c(unit);
    }

    /* renamed from: av */
    public static void printSystemStatus() {
        System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : Long.valueOf(maxMemory)));
        System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());
    }

    /* renamed from: aw */
    public Context m855aw() {
        return this.f5935ao;
    }

    /* renamed from: f */
    public static void m823f(String str, String str2) {
        GameEngine gameEngine2 = getInstance();
        if (gameEngine2 == null) {
            return;
        }
        if (gameEngine2.interfaceEngine != null && gameEngine2.interfaceEngine.messageInterface != null) {
            gameEngine2.interfaceEngine.messageInterface.m1810a(str, str2);
        } else {
            LogTrace("addMessage: interfaceEngine/messageInterface==null");
        }
    }

    /* renamed from: a */
    public static void m890a(EnumC0903u enumC0903u, Throwable th) {
        f5928dQ = null;
        PrintLOG("reportCaughtOutOfMemory:" + f5932dW);
        if (f5932dW != null) {
            return;
        }
        f5932dW = enumC0903u;
        if (th != null) {
            m836c(th);
        }
        printSystemStatus();
    }

    /* renamed from: c */
    public static void m836c(Throwable th) {
        try {
            th.printStackTrace();
        } catch (Throwable th2) {
            PrintLOG("Failed to print stacktrace");
        }
    }

    /* renamed from: ax */
    public void m854ax() {
        if (f5812dX && !f5813dY) {
            f5813dY = true;
            String str = "Warning game has less than 5mb of free space remaining. A larger battle might cause a crash. ";
            int m1575g = this.ModEngine.m1575g();
            if (m1575g > 1) {
                str = str + "This is often caused by large mods, you currently have: " + m1575g + " mods loaded. ";
            }
            showMessageBox("Warning: Low memory detected", str);
        }
        if (!f5811dV && f5932dW != null) {
            PrintLOG("Showing out of memory message");
            f5811dV = true;
            String str2 = "trying to load data";
            if (f5932dW == EnumC0903u.gameImage) {
                str2 = "trying to load game textures";
            } else if (f5932dW == EnumC0903u.gameImageCreate) {
                str2 = "trying to create a texture";
            } else if (f5932dW == EnumC0903u.gameImageColor) {
                str2 = "trying to colour new texture";
            } else if (f5932dW == EnumC0903u.gameImageFogBuffer) {
                str2 = "trying to create texture buffer for on-screen fog fading";
            } else if (f5932dW == EnumC0903u.gameFont) {
                str2 = "trying to create game fonts";
            } else if (f5932dW == EnumC0903u.gameSound) {
                str2 = "trying to load game sounds";
            } else if (f5932dW == EnumC0903u.uiImage) {
                str2 = "trying to load UI textures";
            }
            String str3 = "The game ran out of memory " + str2 + ". ";
            int m1575g2 = this.ModEngine.m1575g();
            if (m1575g2 > 1) {
                str3 = str3 + "This is often caused by large mods, you currently have: " + m1575g2 + " mods. ";
            }
            if (isPC() && !System_Hcat.is64Bit) {
                str3 = str3 + "You are also using the 32 bit version, switching to the 64 bit version might help. ";
            }
            showMessageBox("Warning: Out Of Memory", str3);
        }
    }

    /* renamed from: ay */
    public void m853ay() {
        try {
            byte[] bArr = new byte[5000000];
            bArr[0] = this.f5995dZ;
            this.f5996ea = bArr[1];
        } catch (OutOfMemoryError e) {
            System.gc();
            PrintLOG("Low memory detected");
            e.printStackTrace();
            f5812dX = true;
        }
    }

    /* renamed from: a */
    public void m889a(Runnable runnable) {
        this.f5998ec.m713a(runnable);
    }

    /* renamed from: a */
    public final boolean m901a(float f, float f2, float f3) {
        return this.f5957cL.left < f + f3 && f - f3 < this.f5957cL.right && this.f5957cL.top < f2 + f3 && f2 - f3 < this.f5957cL.bottom;
    }

    /* renamed from: o */
    public static boolean m803o(String str) {
        if (f5911aQ == null) {
            return false;
        }
        return f5911aQ.contains(str);
    }
}
package com.corrodinggames.rts.game;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Debug;
import android.util.DisplayMetrics;
import android.util.Log;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.appFramework.gameView;
import com.corrodinggames.rts.appFramework.inGameActivity;
import com.corrodinggames.rts.game.ai.AI;
import com.corrodinggames.rts.game.map.C0173f;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Tree;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0433j;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadataFactory;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p026f.UnitGeoIndex;
import com.corrodinggames.rts.gameFramework.C0645bf;
import com.corrodinggames.rts.gameFramework.C0651bl;
import com.corrodinggames.rts.gameFramework.C0830j;
import com.corrodinggames.rts.gameFramework.CollisionEngine;
import com.corrodinggames.rts.gameFramework.CommandController;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EnumC0901s;
import com.corrodinggames.rts.gameFramework.Enum_draw;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.GameSaver;
import com.corrodinggames.rts.gameFramework.GroupController;
import com.corrodinggames.rts.gameFramework.InputController;
import com.corrodinggames.rts.gameFramework.ModLoader.ModEngine;
import com.corrodinggames.rts.gameFramework.MusicController;
import com.corrodinggames.rts.gameFramework.ReplayEngine;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.StateEngine;
import com.corrodinggames.rts.gameFramework.StatsHandler;
import com.corrodinggames.rts.gameFramework.debug.RunnableC0637a;
import com.corrodinggames.rts.gameFramework.draw.AbstractC0845k;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.C0842h;
import com.corrodinggames.rts.gameFramework.draw.C0844j;
import com.corrodinggames.rts.gameFramework.draw.C0850p;
import com.corrodinggames.rts.gameFramework.draw.C0852r;
import com.corrodinggames.rts.gameFramework.draw.Graphics;
import com.corrodinggames.rts.gameFramework.effect.C0661a;
import com.corrodinggames.rts.gameFramework.effect.C0662b;
import com.corrodinggames.rts.gameFramework.effect.EffectEngine;
import com.corrodinggames.rts.gameFramework.effect.Emitter;
import com.corrodinggames.rts.gameFramework.file.C0670a;
import com.corrodinggames.rts.gameFramework.gui.InterfaceEngine;
import com.corrodinggames.rts.gameFramework.gui.minimap_img;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.path.PathEngine;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import com.corrodinggames.rts.gameFramework.utility.C0934i;
import com.corrodinggames.rts.gameFramework.utility.C0942o;
import com.corrodinggames.rts.gameFramework.utility.C0946r;
import com.corrodinggames.rts.gameFramework.utility.C0947s;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.EnumC0945q;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.game.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/i.class */
public class System_Hcat extends GameEngine {

    /* renamed from: a */
    public static String verText;

    /* renamed from: b */
    public static boolean is64Bit;

    /* renamed from: c */
    public static boolean isMacOS;

    /* renamed from: d */
    int f1219d;

    /* renamed from: f */
    public static String f1196f = null;

    /* renamed from: g */
    public AbstractC0845k f1220g;

    /* renamed from: i */
    int f1221i;

    /* renamed from: j */
    String f1222j;

    /* renamed from: n */
    Paint f1223n;

    /* renamed from: o */
    Paint f1224o;

    /* renamed from: p */
    Paint f1225p;

    /* renamed from: q */
    Paint f1226q;

    /* renamed from: r */
    Paint f1227r;

    /* renamed from: z */
    Paint f1228z;

    /* renamed from: A */
    Paint f1197A;

    /* renamed from: B */
    Paint f1198B;

    /* renamed from: D */
    public C0645bf f1199D;

    /* renamed from: E */
    public StateEngine f1200E;

    /* renamed from: G */
    AbstractC0129a f1201G;

    /* renamed from: H */
    boolean f1202H;

    /* renamed from: I */
    boolean f1203I;

    /* renamed from: J */
    boolean f1204J;

    /* renamed from: K */
    boolean f1205K;

    /* renamed from: N */
    public float f1206N;

    /* renamed from: O */
    public float f1207O;

    /* renamed from: P */
    C0187j f1208P;

    /* renamed from: Q */
    Graphics f1209Q;

    /* renamed from: R */
    BitmapOrTexture f1210R;

    /* renamed from: S */
    BitmapOrTexture f1211S;

    /* renamed from: T */
    BitmapOrTexture f1212T;

    /* renamed from: ad */
    Timer f1213ad;

    /* renamed from: ae */
    boolean f1214ae;

    /* renamed from: ah */
    Unit f1215ah;

    /* renamed from: ai */
    Unit f1216ai;

    /* renamed from: aj */
    float f1217aj;

    /* renamed from: ak */
    boolean f1218ak;

    /* renamed from: e */
    public float f1229e = 1.0f;

    /* renamed from: h */
    ImageSave[] f1230h = new ImageSave[6];

    /* renamed from: k */
    public boolean f1231k = false;

    /* renamed from: l */
    public int f1232l = 0;

    /* renamed from: m */
    public ConcurrentLinkedQueue f1233m = new ConcurrentLinkedQueue();

    /* renamed from: s */
    int elapsedTime = 0;

    /* renamed from: t */
    int frameNum = 0;

    /* renamed from: u */
    int fps = 0;

    /* renamed from: v */
    float f1237v = 16.0f;

    /* renamed from: w */
    public String fpsText = "0fps";

    /* renamed from: x */
    Rect f1239x = new Rect();

    /* renamed from: y */
    public ArrayList f1240y = new ArrayList();

    /* renamed from: C */
    public Paint f1241C = new Paint();

    /* renamed from: F */
    public C0662b f1242F = new C0662b();

    /* renamed from: L */
    float f1243L = 0.0f;

    /* renamed from: M */
    public float f1244M = 1.0f;

    /* renamed from: U */
    float f1245U = 0.0f;

    /* renamed from: V */
    Rect f1246V = new Rect();

    /* renamed from: W */
    RectF f1247W = new RectF();

    /* renamed from: X */
    public BitmapOrTexture f1248X = null;

    /* renamed from: Y */
    C0947s f1249Y = new C0947s("allOnScreenObjects");

    /* renamed from: Z */
    C0947s f1250Z = new C0947s("allOnScreenObjectsDirty");

    /* renamed from: aa */
    Matrix f1251aa = new Matrix();

    /* renamed from: ab */
    public ArrayList f1252ab = new ArrayList();

    /* renamed from: ac */
    public ArrayList f1253ac = new ArrayList();

    /* renamed from: af */
    Object f1254af = new Object();

    /* renamed from: ag */
    int f1255ag = 0;

    public System_Hcat(Context context) {
        super(context);
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: a */
    public boolean mo903a() {
        if (this.interfaceEngine.f4756p) {
            return true;
        }
        if (this.f5988dH != null && this.f5988dH.mo104b()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: a */
    public boolean mo880a(boolean z) {
        if (!z || this.replayEngine.isPlaying()) {
            if (this.interfaceEngine.f4756p || this.f5841bp) {
                return true;
            }
            if (this.f5818as && !this.f5951bH) {
                return true;
            }
            if (this.f5949bF && this.f5988dH != null && this.f5988dH.mo104b()) {
                return true;
            }
        }
        if ((z && !this.networkEngine.gameHasStarted) || this.networkEngine.m1522F()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: b */
    public int mo852b() {
        return this.fps;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: c */
    public boolean mo842c() {
        return this.f1204J;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: a */
    public synchronized void mo895a(Context context) {
        Log.e("RustedWarfare", "--- ----------------- ----");
        Log.e("RustedWarfare", "--- GameEngine:init() ----");
        Log.e("RustedWarfare", "--- ----------------- ----");
        if (this.init_called) {
            Log.e("RustedWarfare", "GameEngine init has already been called");
            return;
        }
        GameEngine.PrintLOG("Version:" + getVersionNZ());
        if (m795y() && getClass().equals(System_Hcat.class)) {
            throw new RuntimeException("inSpace but class is:" + getClass());
        }
        System.gc();
        m819h("Asset Index");
        this.f5824bK = new C0934i(context);
        long tookTime = C0651bl.getTookTime();
        this.f5865cd = new C0651bl(this);
        this.f5865cd.m2275a(Enum_draw.f4170C);
        if (isDedicatedServer) {
            this.f5868ch = 1.0f;
        } else {
            DisplayMetrics displayMetrics = context.mo4795e().getDisplayMetrics();
            this.f5868ch = context.mo4795e().getDisplayMetrics().density;
            GameEngine.PrintLOG("densityScaleRaw: " + this.f5868ch);
            m4019a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        this.f5868ch *= this.f1229e;
        GameEngine.PrintLOG("densityScaleRaw*densityScaleMultiplier: " + this.f5868ch);
        if (GameEngine.m846b(context)) {
            this.f5936at = true;
        }
        this.f1201G = new C0165b();
        this.f5942bo = false;
        m819h("InputController");
        this.f5833bT = new InputController();
        this.f5833bT.m2389a();
        m819h("SettingsEngine");
        this.curSettings = SettingsEngine.getInstance(context);
        this.curSettings.loadMainExternalFolder(true);
        C0670a.m2172b();
        int i = 3;
        if (isIOS_Device) {
            i = 1;
        }
        if (this.curSettings.numIncompleteLoadAttempts > 1 || this.curSettings.numLoadsSinceRunningGameOrNormalExit > i) {
            this.f1202H = true;
            if (this.curSettings.numIncompleteLoadAttempts > 2 || this.curSettings.numLoadsSinceRunningGameOrNormalExit > 4) {
                this.curSettings.forceEnglish = true;
                this.f1203I = true;
            }
            if (this.curSettings.numIncompleteLoadAttempts > 3) {
                this.curSettings.newRender = false;
            }
            if (this.curSettings.numIncompleteLoadAttempts > 4 || this.curSettings.numLoadsSinceRunningGameOrNormalExit > 5) {
                GameEngine.PrintLOG("Extra safe mode");
                this.f1204J = true;
            }
            GameEngine.PrintLOG("starting game in save mode, numIncompleteLoadAttempts:" + this.curSettings.numIncompleteLoadAttempts + " numLoadsSinceRunningGameOrNormalExit:" + this.curSettings.numLoadsSinceRunningGameOrNormalExit);
        }
        this.curSettings.numLoadsSinceRunningGameOrNormalExit++;
        this.curSettings.numIncompleteLoadAttempts++;
        this.curSettings.save();
        RunnableC0637a.m2329a();
        this.densityScale = densityScale();
        GameEngine.PrintLOG("densityScale(): " + this.densityScale);
        long tookTime2 = C0651bl.getTookTime();
        LangLocale.init();
        C0651bl.m2274a("Locale.init took:", tookTime2);
        Team.initColors();
        this.f1223n = new Paint();
        this.f1224o = new Paint();
        this.f1224o.m4717a(255, 255, 255, 255);
        this.f1224o.mo935a(true);
        m892a(this.f1224o, 16.0f);
        this.f1225p = new Paint();
        this.f1225p.m4717a(255, 255, 255, 255);
        this.f1225p.mo935a(true);
        m892a(this.f1225p, 16.0f);
        this.f1226q = new Paint();
        this.f1226q.m4717a(100, 255, 0, 0);
        m892a(this.f1226q, 16.0f);
        this.f1227r = new Paint();
        this.f1227r.m4717a(100, 0, 255, 0);
        m892a(this.f1227r, 16.0f);
        this.f5894dn = new Paint();
        this.f5895do = new Paint();
        this.f5895do.m4714a(Paint.Align.f197b);
        this.f5895do.mo935a(true);
        this.f5895do.mo937a(Typeface.m4631a(Typeface.f243c, 0));
        m892a(this.f5895do, 16.0f);
        this.f5896dp = new Paint();
        this.f5896dp.m4717a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
        this.f5896dp.mo935a(true);
        this.f5896dp.m4714a(Paint.Align.f197b);
        m892a(this.f5896dp, 18.0f);
        this.f1228z = new Paint();
        this.f1228z.setColor(-1);
        this.f1228z.setAlpha(100);
        this.f1197A = new Paint();
        this.f1197A.setColor(-7829368);
        this.f1197A.setAlpha(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        this.f1197A.setStyle(Paint.Style.f217b);
        this.f1197A.setStrokeWidth(1.0f);
        long tookTime3 = C0651bl.getTookTime();
        m819h("AudioEngine");
        AudioEngine.m2413b();
        this.audio = new AudioEngine();
        this.audio.m2419a(context);
        C0651bl.m2274a("AudioEngine took:", tookTime3);
        m819h("MusicController");
        this.musicController = new MusicController();
        this.musicController.init(context);
        if (f5807bh != null) {
            PrintLOG("init(): using Graphics instance");
            this.graphics = f5807bh;
        } else if (f5806bg != null) {
            PrintLOG("init(): using GraphicsSlick2d");
            try {
                this.graphics = (Graphics) f5806bg.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        } else if (isDedicatedServer) {
            this.graphics = new C0852r();
        } else {
            this.graphics = new C0850p();
        }
        m819h("graphics.init");
        this.graphics.init(context);
        this.graphics.mo165b();
        C0830j.m1034a();
        m819h("Fonts");
        m909U();
        m819h("effects.init");
        this.effects = new EffectEngine();
        this.effects.init(context);
        m819h("minimapHandler");
        this.f5836bW = new minimap_img();
        this.f5836bW.m1798a(context);
        if (f5808cj != null) {
            GameEngine.PrintLOG("We have an initial screen size, can do early setup of image buffers");
            m819h("Map Buffers");
            mo848b(f5808cj.game, f5808cj.y);
            m4002h();
            Map.m4117e();
            this.f5836bW.m1785e();
        }
        m819h("PathEngine");
        this.PathEngine = new PathEngine();
        m819h("GroupController");
        this.groupController = new GroupController();
        m819h("CollisionEngine");
        this.collisionEngine = new CollisionEngine();
        m819h("InterfaceEngine");
        this.interfaceEngine = new InterfaceEngine();
        this.interfaceEngine.init(context);
        this.f1200E = StateEngine.init(context);
        m819h("NetworkEngine");
        this.networkEngine = new NetworkEngine();
        this.networkEngine.m1526B();
        m819h("StatsHandler");
        this.StatsHandler = new StatsHandler();
        m819h("ModEngine");
        this.ModEngine = new ModEngine();
        this.ModEngine.m1595a();
        if (this.f1202H) {
            this.ModEngine.m1577f();
        }
        m819h("CommandController");
        this.f5867cf = new CommandController();
        m819h("GameSaver");
        this.f5862ca = new GameSaver();
        m819h("ReplayEngine");
        this.replayEngine = new ReplayEngine();
        this.replayEngine.init(context);
        m819h("UnitGeoIndex");
        this.UnitGeoIndex = new UnitGeoIndex();
        m819h("Precalculating map fog");
        Map.m4128c();
        m819h("ScorchMark.load");
        ScorchMark.load();
        m819h("Projectile.load");
        Projectile.load();
        m819h("Emitter.load");
        Emitter.load();
        m819h("Unit.loadAllUnits");
        long tookTime4 = C0651bl.getTookTime();
        Unit.loadAllUnits();
        C0651bl.m2274a("loadAllUnits took:", tookTime4);
        m819h("Loading custom unit data");
        long tookTime5 = C0651bl.getTookTime();
        CustomUnitMetadataFactory.m3536g();
        m819h("getAllUnitsChecksum");
        C0651bl.m2274a("CustomUnits took:", tookTime5);
        long tookTime6 = C0651bl.getTookTime();
        this.f1219d = Unit.m3762bL();
        C0651bl.m2274a("allUnitsChecksum took:", tookTime6);
        this.f1198B = new Paint();
        this.f1198B.m4717a(50, 255, 255, 255);
        m928B();
        System.gc();
        this.init_called = true;
        GameEngine.PrintLOG("Init completed");
        C0651bl.m2274a("Loading took:", tookTime);
        this.f5865cd.m2270b(Enum_draw.f4170C);
        this.f5865cd.m2273a(true, true);
        long tookTime7 = C0651bl.getTookTime();
        m819h("Loading map data");
        if (!GameEngine.noBackground) {
            mo799t();
        }
        C0651bl.m2274a("loadAMenuMap took:", tookTime7);
        setupANRWatchDog();
        m819h("init complete");
        if (printUnits) {
            UnitType.m3703s();
            System.exit(0);
        }
        if (outputUnitImages) {
            UnitType.m3704r();
            System.exit(0);
        }
        this.f5840bj = true;
    }

    /* renamed from: a */
    public void m4019a(int i, int i2) {
        float m1691b = CommonUtils.m1691b(0.0f, 0.0f, i, i2) / 1131.0f;
        GameEngine.PrintLOG("defaultViewpointZoomDensity: " + m1691b);
        if (m1691b < 0.5f) {
            m1691b = 0.5f;
        }
        if (m1691b > 3.0f) {
            m1691b = 3.0f;
        }
        GameEngine.PrintLOG("defaultViewpointZoomDensity after limit: " + m1691b);
        this.f5965cX = 1.0f;
        if (CommonUtils.absf(m1691b - 1.0f) > 0.1d) {
            this.f5965cX = m1691b;
            if (this.f5965cX > 2.0f) {
                this.f5965cX = 2.0f;
            }
            if (this.f5965cX < 0.5f) {
                this.f5965cX = 0.5f;
            }
            this.viewpointZoom = this.f5962cU * this.f5965cX;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: d */
    public void mo834d() {
        m923G();
        m4005e();
    }

    /* renamed from: e */
    public void m4005e() {
        m4010b(false);
        this.f5950bG = false;
        this.f5951bH = false;
        this.f5949bF = false;
        this.f5841bp = false;
        this.interfaceEngine.f4756p = false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: a */
    public synchronized void mo879a(boolean z, EnumC0901s enumC0901s) {
        m923G();
        mo878a(z, false, enumC0901s);
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: a */
    public void mo878a(boolean z, boolean z2, EnumC0901s enumC0901s) {
        inGameActivity inGameActivity;
        m4010b(z2);
        this.f5942bo = false;
        System.gc();
        this.f5952bI = true;
        this.f5950bG = false;
        this.f5841bp = false;
        this.f5949bF = false;
        this.f5845by = 0;
        this.f5953cg = false;
        this.networkEngine.m1495a(1L);
        this.frameNumber = 0;
        this.globalSeed = 0;
        CommonUtils.m1750a();
        this.networkEngine.m1358q();
        if (!z2) {
            this.f5976dq = false;
            this.f5977dr = false;
            this.f5978ds = 0.0f;
            this.f5980du = false;
            this.f5979dt = false;
        }
        this.f1232l = 0;
        if (!z2) {
            this.f5962cU = 1.0f;
        }
        this.f5982dx = 0.0f;
        if (!this.replayEngine.isPlaying()) {
            if (!this.networkEngine.networked) {
                CustomUnitMetadataFactory.m3544b(true);
            } else {
                CustomUnitMetadataFactory.m3539d();
            }
        }
        if (!this.networkEngine.networked) {
            if (!this.replayEngine.isPlaying() && z) {
                this.playerTeam = new Player(0);
                this.playerTeam.playerName = "Player";
                for (int i = 1; i < 8; i++) {
                    new AI(i);
                }
                this.networkEngine.updateNamesOfAI();
            }
        } else {
            this.playerTeam = this.networkEngine.f5111z;
            if (this.playerTeam == null) {
                throw new RuntimeException("cannot find player's team");
            }
            if (this.playerTeam != Team.getTeam(this.playerTeam.teamID)) {
                GameEngine.LogTrace("Stale playerTeam");
            }
        }
        this.f5866ce = null;
        this.map = new Map();
        try {
            if (this.inputNetStream != null) {
                InputStream m1211w = this.inputNetStream.m1211w();
                try {
                    m1211w.reset();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.map.m4147a(m1211w, z2);
            } else {
                this.map.m4142a(m871ag(), z2);
            }
            if (!this.map.f776S) {
                PrintLOG("map did not load, returning");
                this.f5952bI = false;
                return;
            }
            this.f5821bC = this.curSettings.teamUnitCapSinglePlayer;
            if (this.f5821bC < 1) {
                this.f5821bC = 1;
            }
            this.f5820bB = this.f5821bC;
            this.map.f820F = false;
            if (!z2) {
                CustomUnitMetadata.m3134E();
            }
            if (!this.networkEngine.networked && !this.replayEngine.isPlaying()) {
                this.networkEngine.setup.incomeMultiplier = 1.0f;
                this.networkEngine.setup.randomSeed = CommonUtils.m1737a(1, 1000000000);
            }
            this.globalSeed = this.networkEngine.setup.randomSeed;
            PrintLOG("global Seed: " + this.globalSeed);
            if (this.networkEngine.networked) {
                if (!this.networkEngine.f5126F) {
                    this.f5820bB = this.networkEngine.f5155aL;
                    this.f5821bC = this.networkEngine.f5156aM;
                }
                GameEngine.PrintLOG("Unit cap is now: " + this.f5821bC);
                if (this.networkEngine.setup.fogMode == 0) {
                    this.map.f818D = false;
                    this.map.f819E = false;
                } else if (this.networkEngine.setup.fogMode == 1) {
                    this.map.f818D = true;
                    this.map.f819E = false;
                } else if (this.networkEngine.setup.fogMode == 2) {
                    this.map.f818D = true;
                    this.map.f819E = true;
                }
                this.map.f820F = this.networkEngine.setup.revealedMap;
                byte b = 10;
                if (this.networkEngine.setup.revealedMap) {
                    b = 10;
                }
                for (int i2 = 0; i2 < Team.playerNumMax; i2++) {
                    Team team = Team.getTeam(i2);
                    if (team != null) {
                        if (team.fogOfWar_map == null) {
                            GameEngine.PrintLOG("Fog null for team: " + team.teamID);
                        } else {
                            for (int i3 = 0; i3 < this.map.mapWidth; i3++) {
                                for (int i4 = 0; i4 < this.map.mapHeight; i4++) {
                                    team.fogOfWar_map[i3][i4] = b;
                                }
                            }
                        }
                    }
                }
                int startingCreditsVal = this.networkEngine.getStartingCreditsVal();
                for (int i5 = 0; i5 < Team.playerNumMax; i5++) {
                    Team team2 = Team.getTeam(i5);
                    if (team2 != null) {
                        team2.credits = startingCreditsVal;
                        if (team2.f1333t) {
                            if (!team2.aiDifficultyLocked) {
                                if (team2.aiDifficultyOverride != null) {
                                    team2.f1334u = team2.aiDifficultyOverride.intValue();
                                } else {
                                    team2.f1334u = this.networkEngine.setup.aiDifficulty;
                                }
                            } else {
                                team2.log("aiDifficulty is locked");
                            }
                        }
                        team2.f1288F = this.networkEngine.setup.sharedControl;
                        boolean z3 = false;
                        boolean z4 = false;
                        int startingUnits = this.networkEngine.setup.startingUnits;
                        if (team2.startingUnitOverride != null) {
                            startingUnits = team2.startingUnitOverride.intValue();
                        }
                        if (startingUnits != 1) {
                            boolean z5 = true;
                            boolean z6 = true;
                            Float placementLocation = null;
                            Float f = null;
                            Float f2 = null;
                            Float f3 = null;
                            if (startingUnits == 5 || startingUnits == 4 || startingUnits > 10) {
                                z6 = false;
                            }
                            if (startingUnits == 5 || startingUnits == 4 || startingUnits == 3 || startingUnits > 10) {
                                z5 = false;
                            }
                            if (startingUnits == 9) {
                                z6 = false;
                                z5 = false;
                            }
                            Iterator it = Unit.m3767bE().iterator();
                            while (it.hasNext()) {
                                Unit unit = (Unit) it.next();
                                if ((unit instanceof Unit) && !unit.dead && unit.team == team2) {
                                    if (unit.f1605bG && !z3) {
                                        z3 = true;
                                        placementLocation = Float.valueOf(unit.x);
                                        f = Float.valueOf(unit.y);
                                        if (!z5) {
                                            unit.m3745cg();
                                        }
                                    }
                                    if (unit.f1606bH && !z4) {
                                        z4 = true;
                                        f2 = Float.valueOf(unit.x);
                                        f3 = Float.valueOf(unit.y);
                                        if (!z6) {
                                            unit.m3745cg();
                                        }
                                    }
                                }
                            }
                            if (placementLocation == null) {
                                placementLocation = f2;
                                f = f3;
                            }
                            if (placementLocation == null) {
                                GameEngine.PrintLOG("placementLocation==null for team:" + team2.teamID);
                            } else {
                                float unit_x = placementLocation.floatValue();
                                float unit_y = f.floatValue();
                                if (startingUnits == 2) {
                                    for (int i6 = 0; i6 <= 2; i6++) {
                                        if (i6 != 1) {
                                            Unit createUnit = UnitType.f1711h.createUnit();
                                            createUnit.mo2537b(team2);
                                            createUnit.x = (unit_x - 50.0f) + (i6 * 50);
                                            createUnit.y = unit_y;
                                            Team.m3924c(createUnit);
                                        }
                                    }
                                    for (int i7 = 0; i7 <= 2; i7++) {
                                        Unit createUnit2 = UnitType.f1726w.createUnit();
                                        createUnit2.mo2537b(team2);
                                        createUnit2.x = (unit_x - 50.0f) + (i7 * 50);
                                        createUnit2.y = unit_y + 50.0f;
                                        Team.m3924c(createUnit2);
                                    }
                                } else if (startingUnits == 3 || startingUnits == 4) {
                                    for (int i8 = 0; i8 <= 2; i8++) {
                                        com.corrodinggames.rts.game.units.UnitType m3709a = UnitType.m3709a("combatEngineer");
                                        if (m3709a == null) {
                                            NetworkEngine.reportDesync("Could not find: combatEngineer on network.setup.startingUnits==3");
                                        } else {
                                            Unit createUnit3 = m3709a.createUnit();
                                            createUnit3.mo2537b(team2);
                                            createUnit3.x = (unit_x - 50.0f) + (i8 * 50);
                                            createUnit3.y = unit_y + 50.0f;
                                            Team.m3924c(createUnit3);
                                        }
                                    }
                                } else if (startingUnits == 5) {
                                    com.corrodinggames.rts.game.units.UnitType m3709a2 = UnitType.m3709a("experimentalSpider");
                                    if (m3709a2 == null) {
                                        NetworkEngine.reportDesync("Could not find: experimentalSpider on network.setup.startingUnits==5");
                                    } else {
                                        Unit unit2 = m3709a2.createUnit();
                                        unit2.mo2537b(team2);
                                        unit2.x = unit_x;
                                        unit2.y = unit_y;
                                        unit2.direction = 90.0f;
                                        unit2.height = 2.0f;
                                        unit2.mo3183cY();
                                        Team.m3924c(unit2);
                                    }
                                } else if (startingUnits != 9 && startingUnits > 10) {
                                    CustomUnitMetadata m3102c = CustomUnitMetadata.m3102c(startingUnits);
                                    if (m3102c == null) {
                                        NetworkEngine.reportDesync("Could not find starting unit on startingUnits==" + startingUnits);
                                    } else {
                                        Unit unit3 = m3102c.createUnit();
                                        unit3.mo2537b(team2);
                                        unit3.x = unit_x;
                                        unit3.y = unit_y;
                                        if (!unit3.mo2975bH()) {
                                            unit3.direction = 90.0f;
                                        }
                                        if (m3102c.core_startFallingWhenStartingUnit) {
                                            unit3.mo3183cY();
                                            if (unit3 instanceof C0433j) {
                                                ((C0433j) unit3).m3154dx();
                                            }
                                        }
                                        Team.m3924c(unit3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!z2 && (this.f5866ce == null || !this.f5866ce.f6085q)) {
                m902a(0.0f, 0.0f);
                int i9 = 0;
                int i10 = 0;
                boolean z7 = false;
                Iterator it2 = Unit.fastUnitList.iterator();
                while (it2.hasNext()) {
                    Unit unit4 = (Unit) it2.next();
                    if (unit4 instanceof Tree) {
                        i10++;
                    } else {
                        i9++;
                    }
                    if (unit4.team == this.playerTeam && unit4.f1606bH) {
                        m851b(unit4.x, unit4.y);
                        z7 = true;
                    }
                }
                if (!z7) {
                    Iterator it3 = Unit.fastUnitList.iterator();
                    while (it3.hasNext()) {
                        Unit unit5 = (Unit) it3.next();
                        if (unit5.team == this.playerTeam && !unit5.mo1774t() && !unit5.mo1773u()) {
                            m851b(unit5.x, unit5.y);
                        }
                    }
                }
                PrintLOG("there are " + i9 + " units on this map and " + i10 + " trees");
            }
            this.f1199D = StateEngine.init(this.f5935ao).m2291b(m871ag());
            this.PathEngine.m1105a(this.map, z2);
            this.f5836bW.m1797a(this.map, z2);
            this.f5867cf.m2262a();
            this.groupController.m2406a();
            if (!z2) {
                C0661a.m2255a();
            }
            this.f5862ca.m409a(z2);
            this.interfaceEngine.m1876a(z2);
            if (!z2) {
                this.interfaceEngine.m1817w();
                m4014az();
                if (this.editorMode) {
                    this.interfaceEngine.m1817w();
                }
            } else {
                this.interfaceEngine.m1817w();
            }
            this.UnitGeoIndex.m2783a(this.map);
            if (!z2) {
                this.musicController.m2349c();
            }
            this.StatsHandler.m2289a();
            Iterator it4 = Unit.fastUnitList.iterator();
            while (it4.hasNext()) {
                Unit unit6 = (Unit) it4.next();
                if (unit6 instanceof OrderableUnit) {
                    ((OrderableUnit) unit6).mo2491c(false);
                }
            }
            this.f1199D.f4139e = true;
            this.f1200E.m2296a(this.f5935ao);
            this.f5950bG = true;
            this.f5951bH = false;
            this.f5952bI = false;
            if (enumC0901s != EnumC0901s.f6150a && !this.curSettings.hasPlayedGameOrSeenHelp) {
                this.curSettings.hasPlayedGameOrSeenHelp = true;
                this.curSettings.save();
            }
            for (int i11 = 0; i11 < 5; i11++) {
                System.gc();
            }
            if (!GameEngine.isDedicatedServer) {
                Log.v("RustedWarfare", "getNativeHeapSize" + String.valueOf(Debug.getNativeHeapSize()));
                Log.v("RustedWarfare", "getNativeHeapAllocatedSize" + String.valueOf(Debug.getNativeHeapAllocatedSize()));
                Log.v("RustedWarfare", "getNativeHeapFreeSize" + String.valueOf(Debug.getNativeHeapFreeSize()));
                Log.v("RustedWarfare", "Runtime.getRuntime().maxMemory()" + String.valueOf(Runtime.getRuntime().maxMemory()));
            }
            if (this.gameThread != null) {
                this.gameThread.m403a();
            }
            this.f1243L = 0.0f;
            if (this.networkEngine.f5126F && this.networkEngine.networked) {
                GameEngine.PrintLOG("Disabling network for singleplayer");
                this.networkEngine.networked = false;
            }
            if (!m858at()) {
                if (enumC0901s == EnumC0901s.f6152c) {
                    GameEngine.PrintLOG("Not starting replay recording as we are loading a save");
                } else {
                    this.replayEngine.m2314a(z2);
                }
            }
            if (PathEngine.f5556m) {
            }
        } catch (C0173f e2) {
            e2.printStackTrace();
            alert("Error loading map: " + e2.getMessage(), 1);
            if (f5912aT) {
                GameEngine.PrintLOG("Crashing on allowed map error because automated testing is active");
                throw new RuntimeException(e2);
            }
            if (!this.networkEngine.networked && this.gameViewA != null && (inGameActivity = this.gameViewA.getInGameActivity()) != null) {
                inGameActivity.mo110m();
            }
            m826e("Map Load Warning", m881a(e2));
            this.f5952bI = false;
        }
    }

    /* renamed from: az */
    private void m4014az() {
        this.interfaceEngine.m1817w();
        Iterator it = Unit.fastUnitList.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit.team == this.playerTeam && (unit instanceof OrderableUnit) && unit.mo2560aj() && unit.isOnScreen() && unit.isActive() && !unit.mo1773u() && !unit.mo1774t()) {
                GameEngine.PrintLOG("selectAnyOnScreenBuilder: found builder");
                this.interfaceEngine.m1838j(unit);
                return;
            }
        }
        GameEngine.PrintLOG("selectAnyOnScreenBuilder: no builder found");
    }

    /* renamed from: b */
    public void m4010b(boolean z) {
        synchronized (this.f5933al) {
            if (this.gameViewA != null) {
                this.gameViewA.mo232n();
            }
            this.gameRunning = false;
            if (!z) {
                this.replayEngine.m2304f();
            }
            this.PathEngine.m1087c();
            C0942o m422dF = GameObject.m422dF();
            Iterator it = m422dF.iterator();
            while (it.hasNext()) {
                ((GameObject) it.next()).remove();
            }
            Unit.m3767bE();
            GameObject.m422dF();
            int size = m422dF.size();
            if (size != 0) {
                GameEngine.PrintLOG_err("SHOULD_NOT_HAPPEN: we still had " + size + " objects in gameObjectListForLogic after removeAll");
                Iterator it2 = m422dF.iterator();
                while (it2.hasNext()) {
                    GameObject gameObject = (GameObject) it2.next();
                    String str = "Object: " + gameObject.GameObjectID;
                    if (gameObject instanceof Unit) {
                        str = ((Unit) gameObject).m3740cz();
                    }
                    GameEngine.PrintLOG_err("Remaining object: " + str);
                }
                if (GameEngine.getInstance().m907W()) {
                    throw new RuntimeException("We still had " + size + " objects in gameObjectListForLogic after removeAll");
                }
            }
            Unit.m3767bE().clear();
            GameObject.m422dF().clear();
            this.f1249Y.clear();
            if (!isPC()) {
                this.musicController.pause();
            }
            this.effects.removeAll(z);
            if (this.map != null) {
                this.map.m4110g();
                this.map = null;
            }
            if (this.f5866ce != null) {
                this.f5866ce = null;
            }
            if (this.UnitGeoIndex != null) {
                this.UnitGeoIndex.m2780b();
            }
            this.f1215ah = null;
            this.f1216ai = null;
            this.f1232l = 0;
            Team.m3970R();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: a */
    public void mo900a(float f, int i) {
        synchronized (this.f5933al) {
            mo850b(f, i);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: b */
    public void mo850b(float f, int i) {
        ImageSave imageSave;
        if (this.frameNumber == 2) {
            m853ay();
        } else if (this.frameNumber % 10000 == 0 && this.frameNumber != 0) {
            m853ay();
        }
        if (f5908aN && !this.f5814aS && isNonDedicatedServer() && Debug.getNativeHeapAllocatedSize() > 209715200) {
            GameEngine.PrintLOG("getNativeHeapAllocatedSize: " + CommonUtils.m1642f((int) Debug.getNativeHeapAllocatedSize()));
            this.f5814aS = true;
        }
        m854ax();
        this.f5997eb.m714a();
        this.f5998ec.m712b();
        this.f5865cd.m2275a(Enum_draw.f4173a);
        this.gameViewA = this.f5817ar;
        if (!this.gameViewA.mo246b()) {
            return;
        }
        this.f5865cd.m2275a(Enum_draw.f4174b);
        while (this.f1233m.peek() != null) {
            ((Runnable) this.f1233m.poll()).run();
        }
        if (!this.f5950bG) {
            if (this.f5818as) {
                return;
            }
            Log.e("RustedWarfare", "game running without a loaded level!!!");
            stopAndClose();
            try {
                Thread.sleep(10L);
                return;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
        this.gameRunning = true;
        if (!this.f1205K && this.frameNumber > 5) {
            this.f1205K = true;
            boolean startSafeMode = false;
            if (this.curSettings.numIncompleteLoadAttempts > 1) {
                startSafeMode = true;
            }
            this.curSettings.numIncompleteLoadAttempts = 0;
            if (this.f1202H) {
                this.curSettings.numLoadsSinceRunningGameOrNormalExit = 0;
            }
            this.curSettings.save();
            if (this.f1202H && (this.f1203I || this.ModEngine.m1583c() > 0)) {
                if (startSafeMode) {
                    showMessageBox("Safe mode", "Started game in safe mode due to failed loading attempts. Mods have been disabled.");
                } else {
                    showMessageBox("Safe mode", "Started game in safe mode due to multiple loads without starting a game or exiting. Mods have been disabled.");
                }
            }
        }
        if (!this.f5951bH && this.f5950bG && this.curSettings.numLoadsSinceRunningGameOrNormalExit != 0) {
            this.curSettings.numLoadsSinceRunningGameOrNormalExit = 0;
            this.curSettings.save();
        }
        this.f5862ca.m408b();
        float f2 = this.f5962cU * this.f5965cX;
        if (f2 != this.viewpointZoom) {
            float f3 = (this.f5861cZ / this.viewpointZoom) + this.f5882cx;
            float f4 = (this.f5891da / this.viewpointZoom) + this.f5883cy;
            this.viewpointZoom = f2;
            m4002h();
            if (this.f5860cY) {
                m902a(this.f5882cx - (((this.f5861cZ / this.viewpointZoom) + this.f5882cx) - f3), this.f5883cy - (((this.f5891da / this.viewpointZoom) + this.f5883cy) - f4));
                this.f5860cY = false;
            }
        }
        if (this.f5875cq != 0.0f || this.f5876cr != 0.0f) {
            float f5 = 3.0f * f;
            float f6 = 0.0f;
            if (this.f5875cq > 0.0f) {
                f6 = CommonUtils.minf(this.f5875cq, f5);
            }
            if (this.f5875cq < 0.0f) {
                f6 = CommonUtils.maxf(this.f5875cq, -f5);
            }
            float f7 = f6 + (0.15f * this.f5875cq);
            float f8 = 0.0f;
            if (this.f5876cr > 0.0f) {
                f8 = CommonUtils.minf(this.f5876cr, f5);
            }
            if (this.f5876cr < 0.0f) {
                f8 = CommonUtils.maxf(this.f5876cr, -f5);
            }
            float f9 = f8 + (0.15f * this.f5876cr);
            if (CommonUtils.absf(this.f5875cq) <= f5) {
                f7 = this.f5875cq;
                this.f5875cq = 0.0f;
            } else {
                this.f5875cq -= f7;
            }
            if (CommonUtils.absf(this.f5876cr) <= f5) {
                f9 = this.f5876cr;
                this.f5876cr = 0.0f;
            } else {
                this.f5876cr -= f9;
            }
            this.f5882cx += f7;
            this.f5883cy += f9;
            m902a(this.f5882cx, this.f5883cy);
            m917M();
        }
        if (this.f5856cQ != this.f5857cR) {
            m4002h();
        }
        if (f > 3.0f) {
            f = 3.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (this.f5946bu >= 0.0f) {
            f = this.f5946bu;
        }
        this.f5819bA = (int) (this.f5819bA + (f * 16.666666f));
        m4007d(f);
        this.elapsedTime += i;
        this.frameNum++;
        if (this.frameNum >= 40) {
            if (this.elapsedTime == 0) {
                this.elapsedTime = 1;
            }
            this.fps = (int) (((this.frameNum * 1000) / this.elapsedTime) + 0.5f); // 计算公式fps = frameNum / elapsedTime;
            this.f1237v = this.elapsedTime / this.frameNum;
            this.elapsedTime = 0;
            this.frameNum = 0;
            if (this.curSettings.showFps) {
                this.fpsText = this.fps + "fps";
            }
        }
        m872af();
        for (int i2 = 0; i2 < this.f5991dM.length; i2++) {
            this.f5991dM[i2] = true;
        }
        this.f5972dh = CommonUtils.toZero(this.f5972dh, 0.1f * f);
        this.f5973di = CommonUtils.toZero(this.f5973di, 0.1f * f);
        this.f5972dh = CommonUtils.m1693b(this.f5972dh, 5.0f);
        this.f5973di = CommonUtils.m1693b(this.f5973di, 5.0f);
        this.interfaceEngine.m1922a(f);
        m917M();
        Map.m4117e();
        if (this.networkEngine.networked) {
            float f10 = f;
            if (this.replayEngine.f4101t != 1) {
                f10 *= this.replayEngine.f4101t;
            }
            this.networkEngine.m1500a(f10);
            if (!mo880a(true) && !this.networkEngine.f5051X) {
                this.f1243L += f10;
                while (true) {
                    if (this.f1243L <= this.networkEngine.m1501a()) {
                        break;
                    } else if (this.networkEngine.m1522F()) {
                        this.networkEngine.f5051X = true;
                        break;
                    } else {
                        this.f1243L -= this.networkEngine.m1501a();
                        this.networkEngine.m1498a(this.networkEngine.m1501a(), false);
                        if (this.networkEngine.f5051X) {
                            break;
                        }
                        updateAllGame(this.networkEngine.m1501a());
                    }
                }
                if (!this.networkEngine.isServer) {
                    if (this.networkEngine.f5074ae || this.networkEngine.f5072ac) {
                        if (this.networkEngine.f5074ae && this.networkEngine.f5072ac && this.frameNumber < (this.networkEngine.f5134W - this.networkEngine.f5048P) - 5) {
                            this.networkEngine.addDebugText("nearly within frame range");
                            this.networkEngine.f5074ae = false;
                        }
                        if (this.frameNumber > this.networkEngine.f5134W - 6) {
                            this.networkEngine.addDebugText("we have back within frame range");
                            this.networkEngine.f5074ae = false;
                            this.networkEngine.f5072ac = false;
                        }
                    }
                    if (!this.networkEngine.f5072ac && this.frameNumber < (this.networkEngine.f5134W - this.networkEngine.f5048P) - 10) {
                        this.networkEngine.addDebugText("we are slightly out of frame range, speeding up");
                        this.networkEngine.f5072ac = true;
                    }
                    if (!this.networkEngine.f5074ae && this.frameNumber < (this.networkEngine.f5134W - this.networkEngine.f5048P) - 30) {
                        this.networkEngine.addDebugText("we are out of frame range, fast forwarding");
                        this.networkEngine.f5074ae = true;
                    }
                    if (!this.networkEngine.f5074ae && this.networkEngine.f5072ac) {
                        this.networkEngine.f5073ad += f;
                        if (this.networkEngine.f5073ad > this.networkEngine.m1501a() * 3.0f) {
                            this.networkEngine.f5073ad = 0.0f;
                            this.networkEngine.m1498a(this.networkEngine.m1501a(), true);
                            if (!this.networkEngine.f5051X) {
                                updateAllGame(this.networkEngine.m1501a());
                            }
                        }
                    }
                    if (this.networkEngine.f5074ae) {
                        this.networkEngine.m1498a(this.networkEngine.m1501a(), true);
                        if (!this.networkEngine.f5051X) {
                            updateAllGame(this.networkEngine.m1501a());
                        }
                    }
                    if (this.frameNumber < this.networkEngine.f5134W - 90) {
                        this.networkEngine.m1498a(this.networkEngine.m1501a(), true);
                        if (!this.networkEngine.f5051X) {
                            updateAllGame(this.networkEngine.m1501a());
                        }
                    }
                    if (this.frameNumber < this.networkEngine.f5134W - 120) {
                        this.networkEngine.m1498a(this.networkEngine.m1501a(), true);
                        if (!this.networkEngine.f5051X) {
                            updateAllGame(this.networkEngine.m1501a());
                        }
                    }
                    if (this.frameNumber < this.networkEngine.f5134W - 600) {
                        this.networkEngine.m1498a(this.networkEngine.m1501a(), true);
                        if (!this.networkEngine.f5051X) {
                            updateAllGame(this.networkEngine.m1501a());
                        }
                    }
                }
            }
        } else if (this.replayEngine.m2303g()) {
            float f11 = f;
            if (this.replayEngine.f4101t != 1) {
                f11 *= this.replayEngine.f4101t;
            }
            if (this.gameSpeed != 1.0f) {
                f11 *= this.gameSpeed;
            }
            if (!mo880a(false)) {
                this.f1243L += f11;
                while (this.f1243L > this.networkEngine.m1501a()) {
                    this.f1243L -= this.networkEngine.m1501a();
                    if (this.networkEngine.m1522F()) {
                        break;
                    }
                    updateAllGame(this.networkEngine.m1501a());
                }
            }
            if (this.f1243L > 100.0f) {
                this.f1243L = 100.0f;
            }
            if (this.f1243L < 0.0f) {
                this.f1243L = 0.0f;
            }
        } else if (!mo880a(false)) {
            updateAllGame(f);
        }
        if (mo880a(false)) {
            try {
                Thread.sleep(2L);
            } catch (Exception e2) {
            }
        }
        this.PathEngine.m1107a(f);
        this.audio.m2412b(f);
        this.musicController.m2358a(f);
        this.f5833bT.m2383b();
        SteamEngine.m718a().mo281a(f);
        this.f5865cd.m2270b(Enum_draw.f4174b);
        this.f5865cd.m2275a(Enum_draw.f4175c);
        if (!this.f5981dv) {
            if (this.graphics.mo226a()) {
                m4015a((AbstractC0845k) null, f);
            } else if (this.gameViewA.mo230p()) {
                m4015a(this.gameViewA.mo244b(true), f);
            } else {
                gameView gameview = this.gameViewA;
                this.gameViewA.mo249a(f, i);
                if (gameview.mo243c() && !gameview.mo241e()) {
                    synchronized (gameview.mo239g()) {
                        if (gameview.mo243c() && !gameview.mo241e()) {
                            this.f5865cd.m2275a(Enum_draw.f4195w);
                            AbstractC0845k mo244b = gameview.mo244b(true);
                            this.f5865cd.m2270b(Enum_draw.f4195w);
                            if (!gameview.mo241e()) {
                                if (mo244b != null) {
                                    if (mo244b.mo976c()) {
                                        GameEngine.PrintLOG("gameengine draw: bufferedCanvas drawn on");
                                    }
                                    mo244b.mo982a(true);
                                }
                                if (mo244b == null) {
                                    GameEngine.m824f("GameEngine gameViewCanvas is null after lockCanvas - " + gameview.hashCode());
                                }
                                if (this.f5942bo) {
                                    if (this.f1220g == null) {
                                        log("recorder", "Now recording at:" + this.gameViewA.mo238h() + "," + this.gameViewA.mo237i());
                                        for (int i3 = 0; i3 < this.f1230h.length; i3++) {
                                            this.f1230h[i3] = new ImageSave(this);
                                            this.f1230h[i3].f1261a = Bitmap.m4772a(this.gameViewA.mo238h(), this.gameViewA.mo237i(), Bitmap.Config.f142b);
                                            this.f1230h[i3].f1261a.m4776a(0);
                                        }
                                        this.f1220g = new C0844j(new Canvas());
                                        this.f1221i = 0;
                                        this.f1222j = "/sdcard/rustedWarfare_recordings/" + System.currentTimeMillis() + "/";
                                        new File(this.f1222j).mkdirs();
                                    }
                                    long currentTimeMillis = System.currentTimeMillis();
                                    ImageSave imageSave2 = this.f1230h[this.f1221i];
                                    if (imageSave2.f1264d != null && imageSave2.f1264d.isAlive()) {
                                        imageSave2.f1264d.setPriority(10);
                                    }
                                    imageSave2.m3996a();
                                    log("screenshot", "bitmapFree took:" + (System.currentTimeMillis() - currentTimeMillis));
                                    this.f1220g.mo993a(this.f1230h[this.f1221i].f1261a);
                                    mo244b = this.f1220g;
                                } else {
                                    this.f1220g = null;
                                }
                                m4015a(mo244b, f);
                                if (this.f5942bo && (imageSave = this.f1230h[this.f1221i]) != null) {
                                    imageSave.f1262b = this.frameNumber;
                                    imageSave.f1264d = new Thread(imageSave);
                                    imageSave.f1264d.start();
                                    mo244b.mo992a(imageSave.f1261a, 0.0f, 0.0f, (Paint) null);
                                    this.f1221i++;
                                    if (this.f1221i >= this.f1230h.length) {
                                        this.f1221i = 0;
                                    }
                                }
                                this.graphics.mo187a((AbstractC0845k) null);
                            }
                            if (mo244b != null) {
                                try {
                                    gameview.mo248a(mo244b, true);
                                } catch (IllegalArgumentException e3) {
                                    e3.printStackTrace();
                                    GameEngine.m824f("GameEngine catch currentGameView - " + gameview.hashCode());
                                    GameEngine.m824f("GameEngine catch currentGameView.gameThreadSync - " + gameview.mo239g().hashCode());
                                    gameview.mo236j();
                                } catch (IllegalStateException e4) {
                                    e4.printStackTrace();
                                    GameEngine.m824f("GameEngine catch currentGameView - " + gameview.hashCode());
                                    GameEngine.m824f("GameEngine catch currentGameView.gameThreadSync - " + gameview.mo239g().hashCode());
                                }
                            }
                        }
                    }
                }
                this.gameViewA.mo245b(f, i);
            }
        }
        this.f5981dv = false;
        m908V();
        this.f5865cd.m2270b(Enum_draw.f4175c);
        if (this.f5980du) {
            this.f5980du = false;
            String str = null;
            if (m808l(this.f5892dl) != null) {
                str = m807m(this.f5892dl);
            }
            if (this.networkEngine.networked) {
                str = null;
                new C0186a().start();
            }
            if (str != null) {
                GameEngine.PrintLOG("gotoNextLevel: Loading next level: " + str);
                this.f5892dl = str;
                this.interfaceEngine.messageInterface.m1809b();
                mo878a(true, false, EnumC0901s.f6151b);
            } else {
                GameEngine.PrintLOG("gotoNextLevel: No next level, finishing");
                this.f5950bG = false;
                inGameActivity inGameActivity = this.gameViewA.getInGameActivity();
                if (inGameActivity != null) {
                    inGameActivity.mo4386b();
                    inGameActivity.mo110m();
                } else {
                    GameEngine.PrintLOG("gotoNextLevel: Error getInGameActivity==null");
                }
            }
        }
        if (!this.f5818as && this.f5948bE && !this.f1231k) {
            PrintLOG("starting method trace");
            Debug.startMethodTracing("lukeTrace", 110000000);
            this.f1231k = true;
        }
        this.f5949bF = true;
        this.f5999ed.m714a();
        this.f5865cd.m2270b(Enum_draw.f4173a);
        this.f5865cd.m2272b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.i$a */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/i$a.class */
    public class C0186a extends Thread {
        C0186a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            System_Hcat.this.networkEngine.disconnect("gotoNextLevel");
        }
    }

    /* renamed from: f */
    public void stopAndClose() {
        inGameActivity inGameActivity = this.gameViewA.getInGameActivity();
        if (inGameActivity != null) {
            if (!inGameActivity.m4805c()) {
                inGameActivity.mo4386b();
                return;
            } else {
                GameEngine.log("stopAndClose: inGameActivity is isFinishing");
                return;
            }
        }
        GameEngine.log("stopAndClose: Error getInGameActivity==null");
    }

    /* renamed from: a */
    public void updateAllGame(float f) {
        if (m857au() && f < 0.1f) {
            NetworkEngine.reportDesync("updateAllGame1: deltaSpeed:" + f + " frame:" + this.frameNumber + " network.currentStepRate:" + this.networkEngine.m1501a());
        }
        if (this.gameSpeed != 1.0f && !this.networkEngine.networked && !this.replayEngine.m2303g()) {
            f *= this.gameSpeed;
        }
        float f2 = f * this.f1244M;
        this.f1206N = f2 + 2.0f;
        this.f1207O = f2;
        this.networkEngine.m1433b(f2);
        this.f5845by = (int) (this.f5845by + (f2 * 16.666666f));
        this.f5867cf.m2258c();
        this.replayEngine.m2324a(f2);
        this.frameNumber++;
        Team.m3898g(f2);
        if (this.map != null) {
            this.map.m4116e(f2);
        }
        if (m857au() && f2 < 0.1f) {
            NetworkEngine.reportDesync("updateAllGame2: deltaSpeed:" + f2 + " frame:" + this.frameNumber);
        }
        Unit.m3767bE();
        C0942o m422dF = GameObject.m422dF();
        Object[] m506b = m422dF.m506b();
        int size = m422dF.size();
        boolean au = m857au();
        for (int i = 0; i < size; i++) {
            GameObject gameObject = (GameObject) m506b[i];
            if (au && f2 != this.f1207O) {
                NetworkEngine.m1384g("JIT bug detected, attempting to correct. before object:" + gameObject.GameObjectID + " frame:" + this.frameNumber + " deltaSpeed:" + f2);
                f2 = this.f1207O;
            }
            gameObject.update(f2);
        }
        if (m857au() && f2 < 0.1f) {
            NetworkEngine.reportDesync("updateAllGame3: deltaSpeed:" + f2 + " frame:" + this.frameNumber);
        }
        int size2 = m422dF.f6312a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0946r c0946r = (C0946r) m422dF.f6312a.get(i2);
            if (c0946r.f6322a == EnumC0945q.f6319a) {
                GameObject gameObject2 = (GameObject) c0946r.f6323b;
                if (!gameObject2.deleted) {
                    gameObject2.update(f2);
                }
            }
        }
        this.f5865cd.m2275a(Enum_draw.f4185m);
        this.UnitGeoIndex.m2789a();
        this.f5865cd.m2270b(Enum_draw.f4185m);
        OrderableUnit.m2479g(f2);
        C0433j.m3144s(f2);
        C0433j.m3223a(f2, 0);
        this.f1232l++;
        if (this.f1232l >= 1000) {
            this.f1232l = 0;
            int i3 = 0;
            Iterator it = Unit.m3767bE().iterator();
            while (it.hasNext()) {
                Unit unit = (Unit) it.next();
                if (unit.dead && !(unit instanceof Tree)) {
                    i3++;
                }
            }
            if (i3 > 70) {
                Iterator it2 = Unit.m3767bE().iterator();
                while (it2.hasNext()) {
                    Unit unit2 = (Unit) it2.next();
                    if ((unit2 instanceof Unit) && unit2.dead && !(unit2 instanceof Tree) && unit2.f1610bN < this.f5845by - 30000 && i3 > 70) {
                        unit2.remove();
                        i3--;
                    }
                }
            }
        }
        this.f5865cd.m2275a(Enum_draw.f4184l);
        Team.m3901f(f2);
        this.f5865cd.m2270b(Enum_draw.f4184l);
        C0661a.m2254a(f2);
        this.effects.m2239a(f2);
        this.f1242F.m2243a(f2);
        C0955y.m466a(f2);
        if (this.f5866ce != null) {
            this.f5866ce.m740c(f2);
        }
        this.f5865cd.m2275a(Enum_draw.f4187o);
        this.groupController.m2405a(f2);
        this.f5865cd.m2270b(Enum_draw.f4187o);
        this.f5865cd.m2275a(Enum_draw.f4186n);
        this.f5836bW.m1804a(f2);
        this.f5865cd.m2270b(Enum_draw.f4186n);
        this.PathEngine.m1092b(f2);
    }

    /* renamed from: a */
    public void m4015a(AbstractC0845k abstractC0845k, float f) {
        synchronized (this.f5934am) {
            m4011b(abstractC0845k, f);
        }
    }

    /* renamed from: a */
    public void m4017a(C0187j c0187j) {
        if (this.f1209Q != null) {
            throw new RuntimeException("Layer already enabled");
        }
        this.f1209Q = this.graphics;
        this.graphics = this.f1208P.f1258b;
    }

    /* renamed from: b */
    public void m4012b(C0187j c0187j) {
        this.graphics.mo130o();
        this.graphics = this.f1209Q;
        this.f1209Q = null;
    }

    /* renamed from: b */
    public void m4011b(AbstractC0845k abstractC0845k, float f) {
        if (abstractC0845k == null) {
            log("drawAll", "canvas is null, not may not be available yet");
        } else if (noResources) {
        } else {
            this.graphics.mo187a(abstractC0845k);
            this.graphics.mo200a(this.gameViewA.mo242d());
            this.graphics.mo140f();
            this.f5846bz++;
            C0842h.f5695D = 0.0f;
            float f2 = this.f5954cm;
            if (f2 != 1.0f) {
                this.graphics.mo137h();
                this.graphics.mo224a(f2, f2);
            }
            if (this.f5980du) {
                this.graphics.mo162b(Color.m4733a(0, 0, 0));
                this.graphics.drawText("Loading..", this.f5872cn, this.f5873co, this.f5896dp);
                return;
            }
            boolean z = postprocessing;
            if (z && m820h(48)) {
                z = false;
            }
            if (z) {
                if (this.f1208P == null) {
                    this.f1208P = new C0187j("assets/shaders/post_base.frag");
                }
                this.f1208P.m3997a(this.graphics);
                m4017a(this.f1208P);
                try {
                    this.graphics.mo162b(Color.m4733a(0, 0, 0));
                    this.f5865cd.m2275a(Enum_draw.f4176d);
                    m4008c((AbstractC0845k) null, f);
                    this.f5865cd.m2270b(Enum_draw.f4176d);
                    m4012b(this.f1208P);
                    this.f1208P.m3998a();
                    this.graphics.mo137h();
                    m916N();
                    this.effects.f4257l = this.f1208P.f1257a;
                    this.effects.m2227a(f, 101);
                    this.effects.f4257l = null;
                    this.graphics.mo136i();
                } catch (Throwable th) {
                    m4012b(this.f1208P);
                    throw th;
                }
            } else {
                this.f5865cd.m2275a(Enum_draw.f4176d);
                m4008c(abstractC0845k, f);
                this.f5865cd.m2270b(Enum_draw.f4176d);
            }
            if (!m797w()) {
                this.f5865cd.m2275a(Enum_draw.f4178f);
                m4006d(abstractC0845k, f);
                this.f5865cd.m2270b(Enum_draw.f4178f);
            }
            if (this.curSettings.showFps && this.f5858cS == 0.0f && !this.f5859cT) {
                this.graphics.drawText(this.fpsText, 100.0f, 35.0f, this.f1224o);
            }
            if (f1196f != null) {
                this.graphics.drawText(f1196f, 100.0f, 85.0f, this.f1224o);
            }
            if (!this.f5818as && (this.graphics.mo149c() != null || GameEngine.isPC_Device)) {
                this.interfaceEngine.m1859c(f);
            }
            C0433j.m3152dz();
            this.graphics.mo138g();
            if (f2 != 1.0f) {
                abstractC0845k.mo1001a();
            }
        }
    }

    /* renamed from: g */
    public boolean m4003g() {
        if (!this.curSettings.showUnitIcons) {
            return false;
        }
        if (this.viewpointZoom < 0.7d && this.f5850cD >= this.map.getWidthInPixels() - 5.0f && this.f5847cA >= this.map.getHeightInPixels() - 5.0f) {
            return true;
        }
        return m795y() ? ((double) this.viewpointZoom) < 0.1d : isPC() ? ((double) this.viewpointZoom) < 0.27d : ((double) this.viewpointZoom) < 0.4d;
    }

    /* renamed from: b */
    public void m4013b(float f) {
        boolean z = false;
        if (this.f5961cP.left < 0 || this.f5961cP.top < 0 || this.f5961cP.right > this.map.getWidthInPixels() || this.f5961cP.bottom > this.map.getHeightInPixels()) {
            z = true;
        }
        if (z) {
            this.graphics.mo162b(Color.m4733a(0, 0, 0));
        }
    }

    /* renamed from: c */
    public void m4009c(float f) {
    }

    /* renamed from: c */
    public void m4008c(AbstractC0845k abstractC0845k, float f) {
        if (!this.f5950bG) {
            return;
        }
        this.f5865cd.m2275a(Enum_draw.f4180h);
        this.f1250Z.m495b();
        this.f5897dw = 0;
        boolean z = false;
        GameObject[] m501a = Unit.fastGameObjectList.m501a();
        int size = GameObject.fastGameObjectList.size();
        for (int i = 0; i < size; i++) {
            GameObject gameObject = m501a[i];
            boolean z2 = gameObject.trailEffect;
            boolean mo426a = gameObject.mo426a(this);
            gameObject.trailEffect = mo426a;
            if (z2 != mo426a) {
                z = true;
            }
            if (mo426a) {
                this.f1250Z.m496a(gameObject);
            }
        }
        if (this.f1249Y.size() != this.f1250Z.size()) {
            z = true;
        }
        this.f5865cd.m2270b(Enum_draw.f4180h);
        this.f5865cd.m2275a(Enum_draw.f4181i);
        if (z) {
            C0947s c0947s = this.f1249Y;
            this.f1249Y = this.f1250Z;
            this.f1250Z = c0947s;
        }
        if (!m4003g()) {
            Collections.sort(this.f1249Y, GameObject.f6371dZ);
        }
        this.f5865cd.m2270b(Enum_draw.f4181i);
        this.f5865cd.m2275a(Enum_draw.f4189q);
        this.f5865cd.m2275a(Enum_draw.f4191s);
        this.graphics.mo137h();
        this.graphics.mo204a(this.f5955cJ);
        this.f5865cd.m2270b(Enum_draw.f4191s);
        this.f5865cd.m2275a(Enum_draw.f4190r);
        m4013b(f);
        this.f5865cd.m2270b(Enum_draw.f4190r);
        if (this.curSettings.renderFancyWater) {
            if (this.f1210R == null) {
                this.f1210R = this.graphics.loadImage(R.drawable.water_cloud);
            }
            if (this.f1211S == null) {
                this.f1211S = this.graphics.loadImage(R.drawable.water_layer1);
            }
            if (this.f1212T == null) {
                this.f1212T = this.graphics.loadImage(R.drawable.water_layer2);
            }
            this.f1246V.m4664a(this.f5955cJ);
            this.f1245U += 0.05f * f;
            if (this.f1245U > 100.0f) {
                this.f1245U -= 100.0f;
            }
            this.graphics.mo192a(this.f1210R, this.f1246V, (Paint) null, this.f5878ct / 6, this.f5879cu / 6, 1, 1);
            this.f1246V.m4664a(this.f5956cK);
            this.f1247W.m4651a(this.f5956cK);
            this.graphics.mo137h();
            m916N();
            this.graphics.mo189a(this.f1212T, this.f1247W, (Paint) null, this.f5878ct + this.f1245U, this.f5879cu + this.f1245U, 0, 0);
            this.graphics.mo189a(this.f1211S, this.f1247W, (Paint) null, this.f5878ct, this.f5879cu, 0, 0);
            this.graphics.mo136i();
        }
        this.f5865cd.m2275a(Enum_draw.f4192t);
        if (this.map != null && m864an()) {
            this.map.m4121d(f);
        }
        this.f5865cd.m2270b(Enum_draw.f4192t);
        m916N();
        this.graphics.mo204a(this.f5956cK);
        boolean m4003g = m4003g();
        this.PathEngine.m1086c(f);
        this.f5865cd.m2270b(Enum_draw.f4189q);
        GameObject[] m501a2 = this.f1249Y.m501a();
        int size2 = this.f1249Y.size();
        this.f5966db = true;
        this.f5967dc = true;
        this.f5969de = true;
        this.f5970df = true;
        this.f5971dg = true;
        this.f5968dd = false;
        if (GameEngine.postprocessing) {
            this.f5968dd = true;
        }
        if (this.viewpointZoom < 0.45d) {
            this.f5969de = false;
            this.f5966db = false;
            this.f5971dg = false;
        }
        if (this.viewpointZoom < 0.3d) {
            this.f5970df = false;
            this.f5967dc = false;
        }
        if (!m4003g) {
            for (int i2 = 0; i2 < size2; i2++) {
                GameObject gameObject2 = m501a2[i2];
                if (gameObject2.f6366ed == 0) {
                    gameObject2.draw(f);
                }
            }
        }
        C0661a.m2247b(f);
        this.f5865cd.m2275a(Enum_draw.f4179g);
        this.effects.m2227a(f, 1);
        this.f5865cd.m2270b(Enum_draw.f4179g);
        this.f5865cd.m2275a(Enum_draw.f4188p);
        if (m4003g) {
            if (this.interfaceEngine.m1827p() == 0) {
                Unit.f1565bA.m4717a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8);
                Unit.f1566bB.m4717a(255, 255, 255, 255);
            } else {
                Unit.f1565bA.m4717a(175, 175, 175, 175);
                Unit.f1566bB.m4717a(255, 255, 255, 255);
            }
            for (int i3 = 0; i3 < size2; i3++) {
                GameObject gameObject3 = m501a2[i3];
                if (!gameObject3.mo419f(f)) {
                    gameObject3.draw(f);
                }
            }
            for (int i4 = 0; i4 < size2; i4++) {
                GameObject gameObject4 = m501a2[i4];
                gameObject4.mo431a(f, true);
                gameObject4.mo418p(f);
            }
        } else {
            for (int i5 = 0; i5 < size2; i5++) {
                m501a2[i5].mo423d(f);
            }
            for (int i6 = 0; i6 < size; i6++) {
                GameObject gameObject5 = m501a[i6];
                if (!gameObject5.trailEffect) {
                    if (gameObject5 instanceof Unit) {
                        Unit unit = (Unit) gameObject5;
                        if (unit.selected) {
                            if (unit.team != this.playerTeam && !unit.m3746cd()) {
                            }
                        }
                    }
                }
                gameObject5.mo420e(f);
                if (!gameObject5.trailEffect) {
                    gameObject5.mo418p(f);
                }
            }
            for (int i7 = 0; i7 < size2; i7++) {
                GameObject gameObject6 = m501a2[i7];
                if (gameObject6.f6366ed != 0 && gameObject6.f6366ed != 10) {
                    gameObject6.draw(f);
                }
            }
            for (int i8 = 0; i8 < size2; i8++) {
                GameObject gameObject7 = m501a2[i8];
                gameObject7.mo431a(f, false);
                gameObject7.mo418p(f);
            }
            Team.m3895h(f);
        }
        this.f5969de = true;
        this.f5970df = true;
        this.f5865cd.m2270b(Enum_draw.f4188p);
        this.f5865cd.m2275a(Enum_draw.f4179g);
        this.effects.m2227a(f, 2);
        this.f5865cd.m2270b(Enum_draw.f4179g);
        for (int i9 = 0; i9 < size2; i9++) {
            GameObject gameObject8 = m501a2[i9];
            if (gameObject8.f6366ed == 10) {
                gameObject8.draw(f);
            }
        }
        this.f1242F.m2241b(f);
        if (this.f5866ce != null) {
            this.f5866ce.m755a(f);
        }
        m4009c(f);
        C0955y.m444b(f);
        this.UnitGeoIndex.m2776c(f);
        this.f5865cd.m2275a(Enum_draw.f4177e);
        this.graphics.mo136i();
        this.f5865cd.m2270b(Enum_draw.f4177e);
    }

    /* renamed from: d */
    public void m4006d(AbstractC0845k abstractC0845k, float f) {
        this.interfaceEngine.m1872b(f);
        if (this.f5866ce != null) {
            this.f5866ce.m744b(f);
        }
        this.f5836bW.m1784e(f);
        this.effects.m2217b(f);
        if (this.curSettings.showFps && this.f5858cS == 0.0f) {
            this.f5865cd.m2269c();
        }
        if (this.f5953cg) {
            this.graphics.drawText("Look Mode", this.f5872cn, this.f5873co, this.f5896dp);
        }
        if (this.f5940bm) {
            int i = 20;
            for (int i2 = 0; i2 < Team.playerNumMax; i2++) {
                Team team = Team.getTeam(i2);
                if (team != null && (team instanceof AI)) {
                    AI ai = (AI) team;
                    this.graphics.drawText(ai.teamID + "| c:" + ai.credits, 20.0f, i, this.f5894dn);
                    i += 20;
                }
            }
        }
    }

    /* renamed from: h */
    public void m4002h() {
        this.densityScale = densityScale();
        m910T();
        this.f5872cn = this.f5870ck / 2.0f;
        this.f5873co = this.f5871cl / 2.0f;
        this.f5874cp = (int) (this.f5871cl / 3.0f);
        float f = (int) (this.f5870ck / 3.0f);
        if (this.f5874cp > f) {
            this.f5874cp = f;
        }
        this.f5874cp = CommonUtils.m1692b(this.f5874cp, 60.0f, (int) (250.0f * this.densityScale));
        float f2 = this.f5882cx + this.f5854cH;
        float f3 = this.f5883cy + this.f5855cI;
        if (this.f5857cR) {
            this.f5851cE = this.f5870ck;
            this.f5852cF = this.f5870ck;
        } else {
            this.f5852cF = (this.f5870ck - this.f5874cp) + 1.0f;
            if (InterfaceEngine.f4743bz) {
                this.f5851cE = this.f5870ck;
            } else {
                this.f5851cE = this.f5852cF;
            }
        }
        if (this.f5851cE < 1.0f) {
            this.f5851cE = 1.0f;
        }
        if (this.f5852cF < 1.0f) {
            this.f5852cF = 1.0f;
        }
        if (this.f5856cQ != this.f5857cR) {
            if (!this.f5857cR) {
                f2 -= (this.f5874cp / 2.0f) / this.viewpointZoom;
            } else {
                f2 += (this.f5874cp / 2.0f) / this.viewpointZoom;
            }
        }
        this.f5856cQ = this.f5857cR;
        this.f5853cG = this.f5871cl;
        this.f5884cz = this.f5851cE / this.viewpointZoom;
        this.f5847cA = this.f5853cG / this.viewpointZoom;
        this.f5850cD = this.f5852cF / this.viewpointZoom;
        this.f5854cH = this.f5884cz / 2.0f;
        this.f5855cI = this.f5847cA / 2.0f;
        this.f5955cJ.set(0, 0, (int) this.f5851cE, (int) this.f5853cG);
        this.f5956cK.set(0, 0, ((int) this.f5884cz) + 1, ((int) this.f5847cA) + 1);
        this.f5957cL.m4652a(0.0f, 0.0f, this.f5884cz + 1.0f, this.f5847cA + 1.0f);
        m902a(f2 - this.f5854cH, f3 - this.f5855cI);
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: b */
    public void mo848b(int i, int i2) {
        m4018a(i, i2, 1.0f);
    }

    /* renamed from: a */
    public void m4018a(int i, int i2, float f) {
        this.f5870ck = i;
        this.f5871cl = i2;
        this.f5954cm = f;
        m4002h();
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: i */
    public String mo818i() {
        if (GameEngine.isJava) {
            return "com.corrodinggames.rts.java";
        }
        if (GameEngine.isLibGDX) {
            return "com.corrodinggames.rts.gdx";
        }
        if (isDedicatedServer) {
            return "com.corrodinggames.rts.server";
        }
        if (this.f5935ao == null) {
            return "<null context>";
        }
        return this.f5935ao.mo4792h();
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: j */
    public String mo815j() {
        if (GameEngine.isJava) {
            return "java";
        }
        if (GameEngine.isLibGDX) {
            return "java-gdx";
        }
        if (isDedicatedServer) {
            return "dedicatedServer";
        }
        if (this.f5935ao == null) {
            return "<null context>";
        }
        try {
            return this.f5935ao.mo4794f().getInstallerPackageName(mo818i());
        } catch (IllegalArgumentException e) {
            return "IllegalArgumentException: " + e.getMessage();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: k */
    public boolean isBetaVersion() {
        if (gameVersion().contains("p")) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: c */
    public int gameVersionInternal(boolean z) {
        if (isDedicatedServer || z) {
            return 170;
        }
        try {
            return this.f5935ao.mo4794f().getPackageInfo(this.f5935ao.mo4792h(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: l */
    public boolean mo809l() {
        if (!GameEngine.isIOS_Device) {
            if (m4001m() || isDebugBuild) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m4001m() {
        if (OrderableUnit.class.getSimpleName().equals("OrderableUnit")) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: n */
    public String getVersionNZ() {
        String version = getCurGameVersion();
        if ("1" != 0 && !VariableScope.nullOrMissingString.equals("1")) {
            version = version + "-1";
        }
        return version;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: o */
    public void mo804o() {
        verText = null;
        getCurGameVersion();
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: p */
    public String getCurGameVersion() {
        if (verText != null) {
            return verText;
        }
        String str = "v" + curBuildVersion();
        if (!GameEngine.isReleaseVersion || isDebugBuild) {
            str = "DEBUG BUILD - " + str;
        } else if (GameEngine.isTestingBuild) {
            str = "TESTING BUILD - " + str;
        } else if (str.contains("p")) {
            str = "BETA VERSION - " + str;
        }
        if (!GameEngine.isIOS_Device && m4001m()) {
            str = "RAW - " + str;
        }
        verText = str;
        return verText;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: q */
    public String curBuildVersion() {
        return "1.15p8";
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: r */
    public String gameVersion() {
        return "1.15p8";
    }

    /* renamed from: s */
    public synchronized void m4000s() {
        this.f1214ae = false;
        if (this.f1213ad != null) {
            this.f1213ad.cancel();
            this.f1213ad = null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: a */
    public synchronized void mo896a(Activity activity, gameView gameview, boolean z) {
        synchronized (this.f1254af) {
            if (!isDedicatedServer) {
                gameview.mo250a();
            }
            this.f5815ap = activity;
            this.f5818as = z;
            this.f5857cR = this.f5818as;
            if (z && !this.f5950bG && !this.f5952bI && !GameEngine.noBackground && !this.networkEngine.networked) {
                mo799t();
            }
            gameView gameview2 = this.f5817ar;
            if (this.gameViewA == null) {
                this.gameViewA = gameview;
            }
            this.f5817ar = gameview;
            if (gameview2 != null && gameview2 != gameview) {
                gameview2.mo234l();
            }
            if (gameview != null) {
                gameview.mo231o();
            }
            if (this.interfaceEngine != null) {
                this.interfaceEngine.m1849e();
            }
            m4000s();
            m924F();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: t */
    public synchronized void mo799t() {
        if (this.f1255ag > 20) {
            return;
        }
        int i = this.curSettings.nextBackgroundMap;
        this.curSettings.nextBackgroundMap++;
        if (this.curSettings.nextBackgroundMap > 3) {
            this.curSettings.nextBackgroundMap = 1;
        }
        this.curSettings.save();
        int m1687b = CommonUtils.m1687b(i, 1, 3);
        this.inputNetStream = null;
        this.f5892dl = "maps/menu_background/menu" + m1687b + ".tmx";
        try {
            Team.m3942b(10, true);
            for (int i2 = 0; i2 < Team.playerNumMax; i2++) {
                AI ai = new AI(i2);
                if (i2 == 0) {
                    this.playerTeam = ai;
                }
            }
            mo879a(false, EnumC0901s.f6150a);
            this.f5951bH = true;
            this.interfaceEngine.m1817w();
            if (!this.f5950bG) {
                GameEngine.LogTrace("Menu load failed");
                this.f1255ag++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    void m4007d(float f) {
        if (this.f5818as && !this.f5951bH) {
            if (this.f1216ai == null) {
                this.f1216ai = m3999u();
                if (this.f1215ah == this.f1216ai) {
                    this.f1216ai = null;
                }
            }
            if (this.f1215ah == null) {
                this.f1215ah = this.f1216ai;
                this.f1216ai = null;
            }
            if (this.f1217aj != 0.0f && this.f1216ai != null) {
                m4020a(f, this.f1216ai.x, this.f1216ai.y, this.f1217aj * 0.5f);
            }
            if (this.f1215ah != null) {
                boolean m4020a = m4020a(f, this.f1215ah.x, this.f1215ah.y, (1.0f - this.f1217aj) * 0.5f);
                if (CommonUtils.distanceSq(this.f5882cx + this.f5854cH, this.f5883cy + this.f5855cI, this.f1215ah.x, this.f1215ah.y) < 6400.0f) {
                    m4020a = true;
                }
                if (m4020a) {
                    this.f1218ak = true;
                }
            }
            if (this.f1218ak) {
                this.f1217aj += 0.01f * f;
                if (this.f1217aj >= 1.0f) {
                    this.f1217aj = 0.0f;
                    this.f1215ah = null;
                    this.f1218ak = false;
                }
            }
        }
    }

    /* renamed from: a */
    Unit m4016a(Team team) {
        int i = 0;
        Iterator it = Unit.fastUnitList.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (!unit.mo1773u() && (unit.team == team || team == null)) {
                i++;
            }
        }
        if (i > 0) {
            int m1737a = CommonUtils.m1737a(0, i - 1);
            int i2 = 0;
            Iterator it2 = Unit.fastUnitList.iterator();
            while (it2.hasNext()) {
                Unit unit2 = (Unit) it2.next();
                if (!unit2.mo1773u() && (unit2.team == team || team == null)) {
                    if (i2 == m1737a) {
                        return unit2;
                    }
                    i2++;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: u */
    Unit m3999u() {
        Unit m4016a = m4016a(this.playerTeam);
        if (m4016a != null) {
            return m4016a;
        }
        return m4016a((Team) null);
    }

    /* renamed from: a */
    public boolean m4020a(float f, float f2, float f3, float f4) {
        float m1659d = CommonUtils.m1659d(this.f5882cx + this.f5854cH, this.f5883cy + this.f5855cI, f2, f3);
        float distanceSq = CommonUtils.distanceSq(this.f5882cx + this.f5854cH, this.f5883cy + this.f5855cI, f2, f3);
        float f5 = f4 * f;
        float f6 = 15.0f;
        if (15.0f < f5 + 1.0f) {
            f6 = f5 + 1.0f;
        }
        if (distanceSq < f6 * f6 || this.f5877cs) {
            return true;
        }
        this.f5848cB += CommonUtils.cos(m1659d) * f5;
        this.f5849cC += CommonUtils.sin(m1659d) * f5;
        if (CommonUtils.absf(this.f5848cB) >= 1.0f || CommonUtils.absf(this.f5849cC) >= 1.0f) {
            this.f5882cx += this.f5848cB;
            this.f5883cy += this.f5849cC;
            this.f5848cB = 0.0f;
            this.f5849cC = 0.0f;
            m902a(this.f5882cx, this.f5883cy);
            return false;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    /* renamed from: v */
    public int mo798v() {
        return this.f1219d;
    }
}
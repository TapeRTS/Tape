package com.corrodinggames.rts.game;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
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
import com.corrodinggames.rts.appFramework.ActivityC0097g;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Tree;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p027f.C0538c;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0626a;
import com.corrodinggames.rts.gameFramework.C0636aa;
import com.corrodinggames.rts.gameFramework.C0638ac;
import com.corrodinggames.rts.gameFramework.C0648am;
import com.corrodinggames.rts.gameFramework.C0716ba;
import com.corrodinggames.rts.gameFramework.C0720be;
import com.corrodinggames.rts.gameFramework.C0721bf;
import com.corrodinggames.rts.gameFramework.C0722bg;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0736c;
import com.corrodinggames.rts.gameFramework.C0894j;
import com.corrodinggames.rts.gameFramework.C1122y;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EnumC0729bm;
import com.corrodinggames.rts.gameFramework.EnumC1063s;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p034c.RunnableC0737a;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p035d.C0742b;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p037f.C0802k;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0823a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p042j.C0907l;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0937h;
import com.corrodinggames.rts.gameFramework.p044l.C1026x;
import com.corrodinggames.rts.gameFramework.p044l.C1028z;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import com.corrodinggames.rts.gameFramework.utility.C1096i;
import com.corrodinggames.rts.gameFramework.utility.C1104o;
import com.corrodinggames.rts.gameFramework.utility.C1108r;
import com.corrodinggames.rts.gameFramework.utility.C1109s;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.EnumC1107q;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.game.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/i.class */
public class C0191i extends GameEngine {

    /* renamed from: a */
    public static String f1216a;

    /* renamed from: b */
    public static boolean f1217b;

    /* renamed from: c */
    public static boolean f1218c;

    /* renamed from: d */
    int f1219d;

    /* renamed from: e */
    public float f1220e;

    /* renamed from: f */
    public static String f1221f = null;

    /* renamed from: g */
    RunnableC0194k[] f1222g;

    /* renamed from: h */
    String f1223h;

    /* renamed from: i */
    public boolean f1224i;

    /* renamed from: j */
    public int f1225j;

    /* renamed from: k */
    public ConcurrentLinkedQueue f1226k;

    /* renamed from: l */
    Paint f1227l;

    /* renamed from: m */
    Paint f1228m;

    /* renamed from: n */
    Paint f1229n;

    /* renamed from: o */
    Paint f1230o;

    /* renamed from: p */
    Paint f1231p;

    /* renamed from: q */
    int f1232q;

    /* renamed from: r */
    int f1233r;

    /* renamed from: s */
    int f1234s;

    /* renamed from: t */
    float f1235t;

    /* renamed from: u */
    public String f1236u;

    /* renamed from: v */
    Rect f1237v;

    /* renamed from: w */
    public ArrayList f1238w;

    /* renamed from: x */
    Paint f1239x;

    /* renamed from: y */
    Paint f1240y;

    /* renamed from: z */
    Paint f1241z;

    /* renamed from: A */
    public Paint f1242A;

    /* renamed from: B */
    public C0721bf f1243B;

    /* renamed from: C */
    public C0720be f1244C;

    /* renamed from: D */
    public C0742b f1245D;

    /* renamed from: E */
    AbstractC0135a f1246E;

    /* renamed from: F */
    boolean f1247F;

    /* renamed from: G */
    float f1248G;

    /* renamed from: H */
    public float f1249H;

    /* renamed from: I */
    public float f1250I;

    /* renamed from: J */
    public float f1251J;

    /* renamed from: K */
    C0193j f1252K;

    /* renamed from: L */
    C0193j f1253L;

    /* renamed from: M */
    boolean f1254M;

    /* renamed from: N */
    InterfaceC1027y f1255N;

    /* renamed from: O */
    BitmapOrTexture f1256O;

    /* renamed from: P */
    BitmapOrTexture f1257P;

    /* renamed from: Q */
    BitmapOrTexture f1258Q;

    /* renamed from: R */
    float f1259R;

    /* renamed from: S */
    Rect f1260S;

    /* renamed from: T */
    RectF f1261T;

    /* renamed from: U */
    public BitmapOrTexture f1262U;

    /* renamed from: V */
    public BitmapOrTexture f1263V;

    /* renamed from: W */
    C1109s f1264W;

    /* renamed from: X */
    C1109s f1265X;

    /* renamed from: Y */
    Matrix f1266Y;

    /* renamed from: Z */
    public ArrayList f1267Z;

    /* renamed from: aa */
    public ArrayList f1268aa;

    /* renamed from: ab */
    Timer f1269ab;

    /* renamed from: ac */
    boolean f1270ac;

    /* renamed from: ad */
    Object f1271ad;

    /* renamed from: ae */
    int f1272ae;

    /* renamed from: af */
    Unit f1273af;

    /* renamed from: ag */
    Unit f1274ag;

    /* renamed from: ah */
    float f1275ah;

    /* renamed from: ai */
    boolean f1276ai;

    public C0191i(Context context) {
        super(context);
        this.f1220e = 1.0f;
        this.f1222g = new RunnableC0194k[6];
        this.f1224i = false;
        this.f1225j = 0;
        this.f1226k = new ConcurrentLinkedQueue();
        this.f1232q = 0;
        this.f1233r = 0;
        this.f1234s = 0;
        this.f1235t = 16.0f;
        this.f1236u = "0fps";
        this.f1237v = new Rect();
        this.f1238w = new ArrayList();
        this.f1242A = new Paint();
        this.f1245D = new C0742b();
        this.f1248G = 0.0f;
        this.f1249H = 1.0f;
        this.f1259R = 0.0f;
        this.f1260S = new Rect();
        this.f1261T = new RectF();
        this.f1262U = null;
        this.f1263V = null;
        this.f1264W = new C1109s("allOnScreenObjects");
        this.f1265X = new C1109s("allOnScreenObjectsDirty");
        this.f1266Y = new Matrix();
        this.f1267Z = new ArrayList();
        this.f1268aa = new ArrayList();
        this.f1271ad = new Object();
        this.f1272ae = 0;
    }

    /* renamed from: a */
    public boolean m6489a() {
        if (this.f6111bS.f5201p) {
            return true;
        }
        if (this.f6273dG != null && this.f6273dG.mo789b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m6478a(boolean z) {
        if (!z || this.f6120cb.m2635h()) {
            if (this.f6111bS.f5201p || this.f6092bp) {
                return true;
            }
            if (this.f6075aq && !this.f6237bH) {
                return true;
            }
            if (this.f6235bF && this.f6273dG != null && this.f6273dG.mo789b()) {
                return true;
            }
        }
        if ((z && !this.networkEngine.f5533bm) || this.networkEngine.m1794I()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public int m6474b() {
        return this.f1234s;
    }

    /* renamed from: c */
    public boolean m6467c() {
        return this.f6180eg;
    }

    /* renamed from: d */
    public boolean m6463d() {
        return this.f6181eh;
    }

    /* renamed from: a */
    public synchronized void m6482a(Context context) {
        Log.m7106d("RustedWarfare", "--- ----------------- ----");
        Log.m7106d("RustedWarfare", "--- GameEngine:init() ----");
        Log.m7106d("RustedWarfare", "--- ----------------- ----");
        if (this.f6223bi) {
            Log.m7106d("RustedWarfare", "GameEngine init has already been called");
            return;
        }
        GameEngine.PrintLog("Version:" + m6448q());
        if (m1233B() && getClass().equals(C0191i.class)) {
            throw new RuntimeException("inSpace but class is:" + getClass());
        }
        System.gc();
        m1118h("Asset Index");
        this.f6103bK = new C1096i(context);
        long m2612a = C0727bl.m2612a();
        this.f6122cd = new C0727bl(this);
        this.f6122cd.m2608a(EnumC0729bm.f4600C);
        if (f6199aU) {
            this.f6125ch = 1.0f;
        } else {
            DisplayMetrics displayMetrics = context.mo7346e().getDisplayMetrics();
            this.f6125ch = context.mo7346e().getDisplayMetrics().density;
            GameEngine.PrintLog("densityScaleRaw: " + this.f6125ch);
            m6485a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        this.f6125ch *= this.f1220e;
        GameEngine.PrintLog("densityScaleRaw*densityScaleMultiplier: " + this.f6125ch);
        if (GameEngine.m1146b(context)) {
            this.f6222ar = true;
        }
        this.f1246E = new C0171b();
        this.f6228bo = false;
        m1118h("InputController");
        this.f6112bT = new C0638ac();
        this.f6112bT.m2968a();
        m1118h("SettingsEngine");
        this.f6109bQ = SettingsEngine.getInstance(context);
        this.f6109bQ.loadMainExternalFolder(true);
        C0750a.m2458b();
        int i = 3;
        if (f6204aZ) {
            i = 1;
        }
        if (this.f6109bQ.numIncompleteLoadAttempts > 1 || this.f6109bQ.numLoadsSinceRunningGameOrNormalExit > i) {
            this.f6177ed = true;
            if (this.f6109bQ.numIncompleteLoadAttempts > 2 || this.f6109bQ.numLoadsSinceRunningGameOrNormalExit > 4) {
                this.f6109bQ.forceEnglish = true;
                this.f6178ee = true;
            }
            if (this.f6109bQ.numIncompleteLoadAttempts > 3) {
                this.f6109bQ.newRender = false;
            }
            if (this.f6109bQ.numIncompleteLoadAttempts > 4 || this.f6109bQ.numLoadsSinceRunningGameOrNormalExit > 5) {
                GameEngine.PrintLog("Extra safe mode");
                this.f6180eg = true;
            }
            if (this.f6109bQ.numIncompleteLoadAttempts > 5) {
                GameEngine.PrintLog("Extra safe mode x2");
                this.f6181eh = true;
            }
            if (this.f6109bQ.numIncompleteLoadAttempts > 6) {
                GameEngine.PrintLog("Extra safe mode x3");
                this.f6109bQ.newRender = false;
                this.f6109bQ.shaderEffects = false;
                this.f6109bQ.teamShaders = false;
            }
            if (this.f6109bQ.newRender && this.f6109bQ.numLoadsSinceRunningGameOrNormalExit > 15) {
                GameEngine.PrintLog("Disabling opengl mode");
                this.f6109bQ.newRender = false;
            }
            GameEngine.PrintLog("starting game in safe mode, numIncompleteLoadAttempts:" + this.f6109bQ.numIncompleteLoadAttempts + " numLoadsSinceRunningGameOrNormalExit:" + this.f6109bQ.numLoadsSinceRunningGameOrNormalExit);
        }
        if (f6195aO) {
            this.f6177ed = true;
            this.f6179ef = "<forced by command line>";
        }
        if (f6196aP) {
            this.f6177ed = true;
            this.f6180eg = true;
            this.f6181eh = true;
            this.f6179ef = "<forced by command line>";
        }
        this.f6109bQ.numLoadsSinceRunningGameOrNormalExit++;
        this.f6109bQ.numIncompleteLoadAttempts++;
        if (!this.f6109bQ.save() && f6204aZ) {
            GameEngine.PrintLog("starting game in safe mode, failed to save settings");
            this.f6179ef = "failing to write preferences data";
            this.f6177ed = true;
        }
        RunnableC0737a.m2587a();
        this.f6126ci = m1213V();
        GameEngine.PrintLog("densityScale(): " + this.f6126ci);
        long m2612a2 = C0727bl.m2612a();
        C0820a.m1891a();
        C0727bl.m2607a("Locale.init took:", m2612a2);
        Team.m6412I();
        this.f1227l = new Paint();
        this.f1228m = new Paint();
        this.f1228m.m7267a(255, 255, 255, 255);
        this.f1228m.m7248a(true);
        m1197a(this.f1228m, 16.0f);
        this.f1229n = new Paint();
        this.f1229n.m7267a(255, 255, 255, 255);
        this.f1229n.m7248a(true);
        m1197a(this.f1229n, 16.0f);
        this.f1230o = new Paint();
        this.f1230o.m7267a(100, 255, 0, 0);
        m1197a(this.f1230o, 16.0f);
        this.f1231p = new Paint();
        this.f1231p.m7267a(100, 0, 255, 0);
        m1197a(this.f1231p, 16.0f);
        this.f6161dm = new Paint();
        this.f6162dn = new Paint();
        this.f6162dn.m7263a(Paint.Align.CENTER);
        this.f6162dn.m7248a(true);
        this.f6162dn.m7258a(Typeface.m7174a(Typeface.f246c, 0));
        m1197a(this.f6162dn, 16.0f);
        this.f6163do = new Paint();
        this.f6163do.m7267a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
        this.f6163do.m7248a(true);
        this.f6163do.m7263a(Paint.Align.CENTER);
        m1197a(this.f6163do, 18.0f);
        this.f1239x = new Paint();
        this.f1239x.m7242b(-1);
        this.f1239x.m7237c(100);
        this.f1240y = new Paint();
        this.f1240y.m7242b(-7829368);
        this.f1240y.m7237c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        this.f1240y.m7260a(Paint.Style.STROKE);
        this.f1240y.m7270a(1.0f);
        long m2612a3 = C0727bl.m2612a();
        m1118h("AudioEngine");
        AudioEngine.m3000b();
        this.audio = new AudioEngine();
        this.audio.m3006a(context);
        C0727bl.m2607a("AudioEngine took:", m2612a3);
        m1118h("MusicController");
        this.f6106bN = new C0648am();
        this.f6106bN.m2931a(context);
        if (f6090bh != null) {
            PrintLog("init(): using Graphics instance");
            this.graphics = f6090bh;
        } else if (f6089bg != null) {
            PrintLog("init(): using GraphicsSlick2d");
            try {
                this.graphics = (InterfaceC1027y) f6089bg.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        } else if (f6199aU) {
            this.graphics = new C1028z();
        } else {
            this.graphics = new C1026x();
        }
        m1118h("graphics.init");
        this.graphics.mo925a(context);
        this.graphics.mo897b();
        C0894j.m1403a();
        m1118h("Fonts");
        m1211X();
        m1118h("effects.init");
        this.effects = new C0743c();
        this.effects.m2552a(context);
        m1118h("minimapHandler");
        this.f6115bW = new C0802k();
        this.f6115bW.m1940a(context);
        if (f6127cj != null) {
            GameEngine.PrintLog("We have an initial screen size, can do early setup of image buffers");
            m1118h("Map Buffers");
            m6471b(f6127cj.f224a, f6127cj.f225b);
            m6455j();
            C0173b.m6605d();
            C0173b.m6596f();
            this.f6115bW.m1927e();
            if (GameEngine.m1152az()) {
                m1118h("Setting up postprocessing");
                if (!m6457h()) {
                    GameEngine.PrintLog("Failed to setup postprocessing");
                }
            }
        }
        m1118h("PathEngine");
        this.f6113bU = new C0907l();
        m1118h("GroupController");
        this.f6114bV = new C0636aa();
        m1118h("CollisionEngine");
        this.f6108bP = new C0626a();
        m1118h("InterfaceEngine");
        this.f6111bS = new C0797f();
        this.f6111bS.m2050a(context);
        this.f1244C = C0720be.m2623c(context);
        m1118h("NetworkEngine");
        this.networkEngine = new C0831ad();
        this.networkEngine.m1798E();
        m1118h("StatsHandler");
        this.f6117bY = new C0722bg();
        m1118h("ModEngine");
        this.f6118bZ = new C0823a();
        this.f6118bZ.m1877a();
        if (this.f6177ed) {
            this.f6118bZ.m1855g();
        }
        m1118h("CommandController");
        this.f6124cf = new C0736c();
        m1118h("GameSaver");
        this.f6119ca = new C1122y();
        m1118h("ReplayEngine");
        this.f6120cb = new C0716ba();
        this.f6120cb.m2655a(context);
        m1118h("UnitGeoIndex");
        this.f6121cc = new C0538c();
        m1118h("Precalculating map fog");
        C0173b.m6611c();
        m1118h("ScorchMark.load");
        C0195l.m6428b();
        m1118h("Projectile.load");
        Projectile.m6501c();
        m1118h("Emitter.load");
        C0746f.m2513b();
        m1118h("Unit.loadAllUnits");
        long m2612a4 = C0727bl.m2612a();
        Unit.m5868bH();
        C0727bl.m2607a("loadAllUnits took:", m2612a4);
        m1118h("Loading custom unit data");
        long m2612a5 = C0727bl.m2612a();
        C0348af.m5387h();
        m1118h("getAllUnitsChecksum");
        C0727bl.m2607a("CustomUnits took:", m2612a5);
        long m2612a6 = C0727bl.m2612a();
        this.f1219d = Unit.m5864bM();
        C0727bl.m2607a("allUnitsChecksum took:", m2612a6);
        this.f1241z = new Paint();
        this.f1241z.m7267a(50, 255, 255, 255);
        m1230E();
        System.gc();
        this.f6223bi = true;
        GameEngine.PrintLog("Init completed");
        C0727bl.m2607a("Loading took:", m2612a);
        this.f6122cd.m2603b(EnumC0729bm.f4600C);
        this.f6122cd.m2606a(true, true);
        long m2612a7 = C0727bl.m2612a();
        m1118h("Loading map data");
        if (!GameEngine.noBackground) {
            m6442w();
        }
        C0727bl.m2607a("loadAMenuMap took:", m2612a7);
        m1118h("Last setup");
        m1163ao();
        this.networkEngine.m1629m();
        m1118h("init complete");
        if (f6083aE) {
            UnitType.m5728s();
            System.exit(0);
        }
        if (f6084aF) {
            UnitType.m5729r();
            System.exit(0);
        }
        this.f6091bj = true;
    }

    /* renamed from: a */
    public void m6485a(int i, int i2) {
        float m2314b = CommonUtils.m2314b(0.0f, 0.0f, i, i2) / 1131.0f;
        GameEngine.PrintLog("defaultViewpointZoomDensity: " + m2314b);
        if (m2314b < 0.5f) {
            m2314b = 0.5f;
        }
        if (m2314b > 3.0f) {
            m2314b = 3.0f;
        }
        GameEngine.PrintLog("defaultViewpointZoomDensity after limit: " + m2314b);
        this.f6251cX = 1.0f;
        if (CommonUtils.m2294c(m2314b - 1.0f) > 0.1d) {
            this.f6251cX = m2314b;
            if (this.f6251cX > 2.0f) {
                this.f6251cX = 2.0f;
            }
            if (this.f6251cX < 0.5f) {
                this.f6251cX = 0.5f;
            }
            this.f6250cW = this.f6248cU * this.f6251cX;
        }
    }

    /* renamed from: e */
    public void m6460e() {
        m1225J();
        m6459f();
    }

    /* renamed from: f */
    public void m6459f() {
        m6468b(false);
        this.f6236bG = false;
        this.f6237bH = false;
        this.f6235bF = false;
        this.f6092bp = false;
        this.f6111bS.f5201p = false;
    }

    /* renamed from: a */
    public synchronized void m6477a(boolean z, EnumC1063s enumC1063s) {
        m1225J();
        m6476a(z, false, enumC1063s);
    }

    /* renamed from: a */
    public void m6476a(boolean z, boolean z2, EnumC1063s enumC1063s) {
        ActivityC0097g mo6954i;
        m6468b(z2);
        this.f6228bo = false;
        System.gc();
        this.f6238bI = true;
        this.f6236bG = false;
        this.f6092bp = false;
        this.f6235bF = false;
        this.f6096by = 0;
        this.f6239cg = false;
        this.networkEngine.m1770a(1L);
        this.f6233bx = 0;
        this.f6102bJ = 0;
        CommonUtils.m2373a();
        this.networkEngine.m1618t();
        if (!z2) {
            this.f6261dp = false;
            this.f6262dq = false;
            this.f6263dr = 0.0f;
            this.f6265dt = false;
            this.f6264ds = false;
        }
        this.f1225j = 0;
        if (!z2) {
            this.f6248cU = 1.0f;
        }
        this.f6267dw = 0.0f;
        if (!this.f6120cb.m2635h()) {
            if (!this.networkEngine.f5564B) {
                C0348af.m5396b(true);
            } else {
                C0348af.m5391d();
            }
        }
        if (!this.networkEngine.f5564B) {
            if (!this.f6120cb.m2635h() && z) {
                this.f6093bs = new C0187e(0);
                this.f6093bs.f1315u = "Player";
                for (int i = 1; i < 8; i++) {
                    new C0136a(i);
                }
                this.networkEngine.m1712aq();
            }
        } else {
            this.f6093bs = this.networkEngine.f5483z;
            if (this.f6093bs == null) {
                throw new RuntimeException("cannot find player's team");
            }
            if (this.f6093bs != Team.m6317k(this.f6093bs.f1305k)) {
                GameEngine.m1120g("Stale playerTeam");
            }
        }
        this.f6123ce = null;
        this.f6104bL = new C0173b();
        try {
            if (this.f6160dl != null) {
                InputStream m1437w = this.f6160dl.m1437w();
                try {
                    m1437w.reset();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f6104bL.m6631a(m1437w, z2);
            } else {
                this.f6104bL.m6625a(m1168aj(), z2);
            }
            if (!this.f6104bL.f802W) {
                PrintLog("map did not load, returning");
                this.f6238bI = false;
                return;
            }
            this.f6100bC = this.f6109bQ.teamUnitCapSinglePlayer;
            if (this.f6100bC < 1) {
                this.f6100bC = 1;
            }
            this.f6099bB = this.f6100bC;
            this.f6104bL.f842G = false;
            Team.m6336e();
            if (!z2) {
                C0453l.m4775E();
            }
            if (!this.networkEngine.f5564B && !this.f6120cb.m2635h()) {
                this.networkEngine.f5597aO.f5655h = 1.0f;
                this.networkEngine.f5597aO.f5647q = CommonUtils.m2360a(1, 1000000000);
            }
            this.f6102bJ = this.networkEngine.f5597aO.f5647q;
            PrintLog("global Seed: " + this.f6102bJ);
            if (this.networkEngine.f5564B) {
                if (!this.networkEngine.f5565F) {
                    this.f6099bB = this.networkEngine.f5595aM;
                    this.f6100bC = this.networkEngine.f5596aN;
                }
                GameEngine.PrintLog("Unit cap is now: " + this.f6100bC);
                if (this.networkEngine.f5597aO.f5651d == 0) {
                    this.f6104bL.f840E = false;
                    this.f6104bL.f841F = false;
                } else if (this.networkEngine.f5597aO.f5651d == 1) {
                    this.f6104bL.f840E = true;
                    this.f6104bL.f841F = false;
                } else if (this.networkEngine.f5597aO.f5651d == 2) {
                    this.f6104bL.f840E = true;
                    this.f6104bL.f841F = true;
                }
                this.f6104bL.f842G = this.networkEngine.f5597aO.f5652e;
                byte b = 10;
                if (this.networkEngine.f5597aO.f5652e) {
                    b = 10;
                }
                for (int i2 = 0; i2 < Team.f1364c; i2++) {
                    Team m6317k = Team.m6317k(i2);
                    if (m6317k != null) {
                        if (m6317k.f1336M == null) {
                            GameEngine.PrintLog("Fog null for team: " + m6317k.f1305k);
                        } else {
                            for (int i3 = 0; i3 < this.f6104bL.f791C; i3++) {
                                for (int i4 = 0; i4 < this.f6104bL.f792D; i4++) {
                                    m6317k.f1336M[i3][i4] = b;
                                }
                            }
                        }
                    }
                }
                int m1633k = this.networkEngine.m1633k();
                for (int i5 = 0; i5 < Team.f1364c; i5++) {
                    Team m6317k2 = Team.m6317k(i5);
                    if (m6317k2 != null) {
                        m6317k2.f1309o = m1633k;
                        if (m6317k2.f1316v) {
                            if (!m6317k2.f1318x) {
                                if (m6317k2.f1319y != null) {
                                    m6317k2.f1317w = m6317k2.f1319y.intValue();
                                } else {
                                    m6317k2.f1317w = this.networkEngine.f5597aO.f5653f;
                                }
                            } else {
                                m6317k2.m6347c("aiDifficulty is locked");
                            }
                        }
                        m6317k2.f1331H = this.networkEngine.f5597aO.f5646l;
                        boolean z3 = false;
                        boolean z4 = false;
                        int i6 = this.networkEngine.f5597aO.f5654g;
                        if (m6317k2.f1320z != null) {
                            i6 = m6317k2.f1320z.intValue();
                        }
                        if (i6 != 1) {
                            boolean z5 = true;
                            boolean z6 = true;
                            Float f = null;
                            Float f2 = null;
                            Float f3 = null;
                            Float f4 = null;
                            if (i6 == 5 || i6 == 4 || i6 > 10) {
                                z6 = false;
                            }
                            if (i6 == 5 || i6 == 4 || i6 == 3 || i6 > 10) {
                                z5 = false;
                            }
                            if (i6 == 9) {
                                z6 = false;
                                z5 = false;
                            }
                            Iterator it = Unit.m5870bF().iterator();
                            while (it.hasNext()) {
                                Unit unit = (Unit) it.next();
                                if ((unit instanceof Unit) && !unit.isDead && unit.team == m6317k2) {
                                    if (unit.f1600bN && !z3) {
                                        z3 = true;
                                        f = Float.valueOf(unit.f6951ek);
                                        f2 = Float.valueOf(unit.f6952el);
                                        if (!z5) {
                                            unit.m5812ch();
                                        }
                                    }
                                    if (unit.f1601bO && !z4) {
                                        z4 = true;
                                        f3 = Float.valueOf(unit.f6951ek);
                                        f4 = Float.valueOf(unit.f6952el);
                                        if (!z6) {
                                            unit.m5812ch();
                                        }
                                    }
                                }
                            }
                            if (f == null) {
                                f = f3;
                                f2 = f4;
                            }
                            if (f == null) {
                                GameEngine.PrintLog("placementLocation==null for team:" + m6317k2.f1305k);
                            } else {
                                float floatValue = f.floatValue();
                                float floatValue2 = f2.floatValue();
                                if (i6 == 2) {
                                    for (int i7 = 0; i7 <= 2; i7++) {
                                        if (i7 != 1) {
                                            Unit mo5717a = UnitType.f1741h.mo5717a();
                                            mo5717a.mo3120b(m6317k2);
                                            mo5717a.f6951ek = (floatValue - 50.0f) + (i7 * 50);
                                            mo5717a.f6952el = floatValue2;
                                            Team.m6353c(mo5717a);
                                        }
                                    }
                                    for (int i8 = 0; i8 <= 2; i8++) {
                                        Unit mo5717a2 = UnitType.f1756w.mo5717a();
                                        mo5717a2.mo3120b(m6317k2);
                                        mo5717a2.f6951ek = (floatValue - 50.0f) + (i8 * 50);
                                        mo5717a2.f6952el = floatValue2 + 50.0f;
                                        Team.m6353c(mo5717a2);
                                    }
                                } else if (i6 == 3 || i6 == 4) {
                                    for (int i9 = 0; i9 <= 2; i9++) {
                                        InterfaceC0303as m5734a = UnitType.m5734a("combatEngineer");
                                        if (m5734a == null) {
                                            C0831ad.m1648g("Could not find: combatEngineer on network.setup.startingUnits==3");
                                        } else {
                                            Unit mo5717a3 = m5734a.mo5717a();
                                            mo5717a3.mo3120b(m6317k2);
                                            mo5717a3.f6951ek = (floatValue - 50.0f) + (i9 * 50);
                                            mo5717a3.f6952el = floatValue2 + 50.0f;
                                            Team.m6353c(mo5717a3);
                                        }
                                    }
                                } else if (i6 == 5) {
                                    InterfaceC0303as m5734a2 = UnitType.m5734a("experimentalSpider");
                                    if (m5734a2 == null) {
                                        C0831ad.m1648g("Could not find: experimentalSpider on network.setup.startingUnits==5");
                                    } else {
                                        Unit mo5717a4 = m5734a2.mo5717a();
                                        mo5717a4.mo3120b(m6317k2);
                                        mo5717a4.f6951ek = floatValue;
                                        mo5717a4.f6952el = floatValue2;
                                        mo5717a4.direction = 90.0f;
                                        mo5717a4.height = 2.0f;
                                        mo5717a4.m5789da();
                                        Team.m6353c(mo5717a4);
                                    }
                                } else if (i6 != 9 && i6 > 10) {
                                    C0453l m4739c = C0453l.m4739c(i6);
                                    if (m4739c == null) {
                                        C0831ad.m1648g("Could not find starting unit on startingUnits==" + i6);
                                    } else {
                                        Unit m4774a = m4739c.m4774a();
                                        m4774a.mo3120b(m6317k2);
                                        m4774a.f6951ek = floatValue;
                                        m4774a.f6952el = floatValue2;
                                        if (!m4774a.m5867bI()) {
                                            m4774a.direction = 90.0f;
                                        }
                                        if (m4739c.f3122eD) {
                                            m4774a.m5789da();
                                            if (m4774a instanceof C0451j) {
                                                ((C0451j) m4774a).m4841dz();
                                            }
                                        }
                                        Team.m6353c(m4774a);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!z2 && (this.f6123ce == null || !this.f6123ce.f6668q)) {
                m1207a(0.0f, 0.0f);
                int i10 = 0;
                int i11 = 0;
                boolean z7 = false;
                Iterator it2 = Unit.f1589bD.iterator();
                while (it2.hasNext()) {
                    Unit unit2 = (Unit) it2.next();
                    if (unit2 instanceof Tree) {
                        i11++;
                    } else {
                        i10++;
                    }
                    if (unit2.team == this.f6093bs && unit2.f1601bO) {
                        m1150b(unit2.f6951ek, unit2.f6952el);
                        z7 = true;
                    }
                }
                if (!z7) {
                    Iterator it3 = Unit.f1589bD.iterator();
                    while (it3.hasNext()) {
                        Unit unit3 = (Unit) it3.next();
                        if (unit3.team == this.f6093bs && !unit3.m5757t() && !unit3.m5755u()) {
                            m1150b(unit3.f6951ek, unit3.f6952el);
                        }
                    }
                }
                PrintLog("there are " + i10 + " units on this map and " + i11 + " trees");
            }
            this.f1243B = C0720be.m2623c(this.f6221am).m2624b(m1168aj());
            this.f6113bU.m1315a(this.f6104bL, z2);
            this.f6115bW.m1939a(this.f6104bL, z2);
            this.f6124cf.m2595a();
            this.f6114bV.m2985a();
            if (!z2) {
                C0741a.m2581a();
            }
            this.f6119ca.m447a(z2);
            this.f6111bS.m2021a(z2);
            if (!z2) {
                this.f6111bS.m1958x();
                m6475aF();
                if (this.f6094bv) {
                    this.f6111bS.m1958x();
                }
            } else {
                this.f6111bS.m1958x();
            }
            this.f6121cc.m3789a(this.f6104bL);
            if (!z2) {
                this.f6106bN.m2923c();
            }
            this.f6117bY.m2622a();
            Iterator it4 = Unit.f1589bD.iterator();
            while (it4.hasNext()) {
                Unit unit4 = (Unit) it4.next();
                if (unit4 instanceof AbstractC0623y) {
                    ((AbstractC0623y) unit4).mo3073c(false);
                }
            }
            this.f1243B.f4543e = true;
            this.f1244C.m2629a(this.f6221am);
            this.f6236bG = true;
            this.f6237bH = false;
            this.f6238bI = false;
            if (enumC1063s != EnumC1063s.f6733a && !this.f6109bQ.hasPlayedGameOrSeenHelp) {
                this.f6109bQ.hasPlayedGameOrSeenHelp = true;
                this.f6109bQ.save();
            }
            for (int i12 = 0; i12 < 5; i12++) {
                System.gc();
            }
            if (!GameEngine.f6199aU) {
                Log.m7113a("RustedWarfare", "getNativeHeapSize" + String.valueOf(Debug.getNativeHeapSize()));
                Log.m7113a("RustedWarfare", "getNativeHeapAllocatedSize" + String.valueOf(Debug.getNativeHeapAllocatedSize()));
                Log.m7113a("RustedWarfare", "getNativeHeapFreeSize" + String.valueOf(Debug.getNativeHeapFreeSize()));
                Log.m7113a("RustedWarfare", "Runtime.getRuntime().maxMemory()" + String.valueOf(Runtime.getRuntime().maxMemory()));
            }
            if (this.f6260dj != null) {
                this.f6260dj.m441a();
            }
            this.f1248G = 0.0f;
            if (this.networkEngine.f5565F && this.networkEngine.f5564B) {
                GameEngine.PrintLog("Disabling network for singleplayer");
                this.networkEngine.f5564B = false;
            }
            if (!m1155aw()) {
                if (enumC1063s == EnumC1063s.f6735c) {
                    GameEngine.PrintLog("Not starting replay recording as we are loading a save");
                } else {
                    this.f6120cb.m2647a(z2);
                }
            }
            if (C0907l.f6005m) {
            }
        } catch (C0179f e2) {
            e2.printStackTrace();
            m1192a("Error loading map: " + e2.getMessage(), 1);
            if (f6198aT) {
                GameEngine.PrintLog("Crashing on allowed map error because automated testing is active");
                throw new RuntimeException(e2);
            }
            if (!this.networkEngine.f5564B && this.f6073ao != null && (mo6954i = this.f6073ao.mo6954i()) != null) {
                mo6954i.m6937m();
            }
            m1125e("Map Load Warning", m1186a(e2));
            this.f6238bI = false;
        }
    }

    /* renamed from: aF */
    private void m6475aF() {
        this.f6111bS.m1958x();
        Iterator it = Unit.f1589bD.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit.team == this.f6093bs && (unit instanceof AbstractC0623y) && unit.mo3142ak() && unit.mo4204p_() && unit.isActive() && !unit.m5755u() && !unit.m5757t()) {
                GameEngine.PrintLog("selectAnyOnScreenBuilder: found builder");
                this.f6111bS.m1980j(unit);
                return;
            }
        }
        GameEngine.PrintLog("selectAnyOnScreenBuilder: no builder found");
    }

    /* renamed from: b */
    public void m6468b(boolean z) {
        synchronized (this.f6219aj) {
            if (this.f6073ao != null) {
                this.f6073ao.mo6951l();
            }
            this.f6229bq = false;
            if (!z) {
                this.f6120cb.m2637f();
            }
            this.f6113bU.m1297c();
            C1104o m460dI = AbstractC1120w.m460dI();
            Iterator it = m460dI.iterator();
            while (it.hasNext()) {
                ((AbstractC1120w) it.next()).mo2880a();
            }
            Unit.m5870bF();
            AbstractC1120w.m460dI();
            int size = m460dI.size();
            if (size != 0) {
                GameEngine.m1193a("SHOULD_NOT_HAPPEN: we still had " + size + " objects in gameObjectListForLogic after removeAll");
                Iterator it2 = m460dI.iterator();
                while (it2.hasNext()) {
                    AbstractC1120w abstractC1120w = (AbstractC1120w) it2.next();
                    String str = "Object: " + abstractC1120w.f6945ed;
                    if (abstractC1120w instanceof Unit) {
                        str = ((Unit) abstractC1120w).m5845cA();
                    }
                    GameEngine.m1193a("Remaining object: " + str);
                }
                if (GameEngine.getInstance().m1209Z()) {
                    throw new RuntimeException("We still had " + size + " objects in gameObjectListForLogic after removeAll");
                }
            }
            Unit.m5870bF().clear();
            AbstractC1120w.m460dI().clear();
            C0451j.m4863dB();
            this.f1264W.clear();
            if (!m1157au()) {
                this.f6106bN.m2919f();
            }
            this.effects.m2546a(z);
            if (this.f6104bL != null) {
                this.f6104bL.m6590h();
                this.f6104bL = null;
            }
            if (this.f6123ce != null) {
                this.f6123ce = null;
            }
            if (this.f6121cc != null) {
                this.f6121cc.m3786b();
            }
            this.f1273af = null;
            this.f1274ag = null;
            this.f1225j = 0;
            Team.m6400U();
        }
    }

    /* renamed from: a */
    public void m6486a(float f, int i) {
        synchronized (this.f6219aj) {
            m6472b(f, i);
        }
    }

    /* renamed from: b */
    public void m6472b(float f, int i) {
        if (this.f6233bx == 2) {
            m1178aE();
        } else if (this.f6233bx % 10000 == 0 && this.f6233bx != 0) {
            m1178aE();
        }
        if (f6192aL && !this.f6088aS && m1159as() && Debug.getNativeHeapAllocatedSize() > 209715200) {
            GameEngine.PrintLog("getNativeHeapAllocatedSize: " + CommonUtils.m2257g((int) Debug.getNativeHeapAllocatedSize()));
            this.f6088aS = true;
        }
        m1179aD();
        this.f6282ea.m768a();
        this.f6283eb.m766b();
        this.f6122cd.m2608a(EnumC0729bm.f4572a);
        this.f6073ao = this.f6074ap;
        if (!this.f6073ao.mo6963b()) {
            return;
        }
        this.f6122cd.m2608a(EnumC0729bm.f4573b);
        while (this.f1226k.peek() != null) {
            ((Runnable) this.f1226k.poll()).run();
        }
        if (!this.f6236bG) {
            if (this.f6075aq) {
                return;
            }
            Log.m7106d("RustedWarfare", "game running without a loaded level!!!");
            m6458g();
            try {
                Thread.sleep(10L);
                return;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
        this.f6229bq = true;
        if (!this.f1247F && this.f6233bx > 5) {
            this.f1247F = true;
            boolean z = false;
            if (this.f6109bQ.numIncompleteLoadAttempts > 1) {
                z = true;
            }
            this.f6109bQ.numIncompleteLoadAttempts = 0;
            if (this.f6177ed) {
                this.f6109bQ.numLoadsSinceRunningGameOrNormalExit = 0;
            }
            this.f6109bQ.save();
            if (this.f6177ed && (this.f6178ee || this.f6118bZ.m1863c() > 0)) {
                if (this.f6179ef != null) {
                    m1137c("Safe mode", "Started game in safe mode due to " + this.f6179ef + ". Mods have been disabled.");
                } else if (z) {
                    m1137c("Safe mode", "Started game in safe mode due to failed loading attempts. Mods have been disabled.");
                } else {
                    m1137c("Safe mode", "Started game in safe mode due to multiple loads without starting a game or exiting. Mods have been disabled.");
                }
            }
        }
        if (!this.f6237bH && this.f6236bG && this.f6109bQ.numLoadsSinceRunningGameOrNormalExit != 0) {
            this.f6109bQ.numLoadsSinceRunningGameOrNormalExit = 0;
            this.f6109bQ.save();
        }
        this.f6119ca.m446b();
        float f2 = this.f6248cU * this.f6251cX;
        if (f2 != this.f6250cW) {
            float f3 = (this.f6157cZ / this.f6250cW) + this.f6140cx;
            float f4 = (this.f6158da / this.f6250cW) + this.f6141cy;
            this.f6250cW = f2;
            m6455j();
            if (this.f6156cY) {
                m1207a(this.f6140cx - (((this.f6157cZ / this.f6250cW) + this.f6140cx) - f3), this.f6141cy - (((this.f6158da / this.f6250cW) + this.f6141cy) - f4));
                this.f6156cY = false;
            }
        }
        if (this.f6133cq != 0.0f || this.f6134cr != 0.0f) {
            float f5 = 3.0f * f;
            float f6 = 0.0f;
            if (this.f6133cq > 0.0f) {
                f6 = CommonUtils.m2258g(this.f6133cq, f5);
            }
            if (this.f6133cq < 0.0f) {
                f6 = CommonUtils.m2265f(this.f6133cq, -f5);
            }
            float f7 = f6 + (0.15f * this.f6133cq);
            float f8 = 0.0f;
            if (this.f6134cr > 0.0f) {
                f8 = CommonUtils.m2258g(this.f6134cr, f5);
            }
            if (this.f6134cr < 0.0f) {
                f8 = CommonUtils.m2265f(this.f6134cr, -f5);
            }
            float f9 = f8 + (0.15f * this.f6134cr);
            if (CommonUtils.m2294c(this.f6133cq) <= f5) {
                f7 = this.f6133cq;
                this.f6133cq = 0.0f;
            } else {
                this.f6133cq -= f7;
            }
            if (CommonUtils.m2294c(this.f6134cr) <= f5) {
                f9 = this.f6134cr;
                this.f6134cr = 0.0f;
            } else {
                this.f6134cr -= f9;
            }
            this.f6140cx += f7;
            this.f6141cy += f9;
            m1207a(this.f6140cx, this.f6141cy);
            m1219P();
        }
        if (this.f6152cQ != this.f6153cR) {
            m6455j();
        }
        if (f > 3.0f) {
            f = 3.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (this.f6232bu >= 0.0f) {
            f = this.f6232bu;
        }
        this.f6098bA = (int) (this.f6098bA + (f * 16.666666f));
        m6462d(f);
        this.f1232q += i;
        this.f1233r++;
        if (this.f1233r >= 40) {
            if (this.f1232q == 0) {
                this.f1232q = 1;
            }
            this.f1234s = (int) (((this.f1233r * 1000) / this.f1232q) + 0.5f);
            this.f1235t = this.f1232q / this.f1233r;
            this.f1232q = 0;
            this.f1233r = 0;
            if (this.f6109bQ.showFps) {
                this.f1236u = this.f1234s + "fps";
            }
        }
        m1169ai();
        for (int i2 = 0; i2 < this.f6276dL.length; i2++) {
            this.f6276dL[i2] = true;
        }
        this.f6257dg = CommonUtils.m2368a(this.f6257dg, 0.1f * f);
        this.f6258dh = CommonUtils.m2368a(this.f6258dh, 0.1f * f);
        this.f6257dg = CommonUtils.m2316b(this.f6257dg, 5.0f);
        this.f6258dh = CommonUtils.m2316b(this.f6258dh, 5.0f);
        this.f6111bS.m2067a(f);
        m1219P();
        C0173b.m6596f();
        if (this.networkEngine.f5564B) {
            float f10 = f;
            if (this.f6120cb.f4505t != 1) {
                f10 *= this.f6120cb.f4505t;
            }
            this.networkEngine.m1775a(f10);
            if (!m6478a(true) && !this.networkEngine.f5498Y) {
                this.f1248G += f10;
                while (true) {
                    if (this.f1248G <= this.networkEngine.m1686c()) {
                        break;
                    } else if (this.networkEngine.m1794I()) {
                        this.networkEngine.f5498Y = true;
                        break;
                    } else {
                        this.f1248G -= this.networkEngine.m1686c();
                        this.networkEngine.m1773a(this.networkEngine.m1686c(), false);
                        if (this.networkEngine.f5498Y) {
                            break;
                        }
                        m6488a(this.networkEngine.m1686c());
                    }
                }
                if (!this.networkEngine.f5485C) {
                    if (this.networkEngine.f5505af || this.networkEngine.f5503ad) {
                        if (this.networkEngine.f5505af && this.networkEngine.f5503ad && this.f6233bx < (this.networkEngine.f5574X - this.networkEngine.f5495Q) - 5) {
                            this.networkEngine.m1669d("nearly within frame range");
                            this.networkEngine.f5505af = false;
                        }
                        if (this.f6233bx > this.networkEngine.f5574X - 6) {
                            this.networkEngine.m1669d("we have back within frame range");
                            this.networkEngine.f5505af = false;
                            this.networkEngine.f5503ad = false;
                        }
                    }
                    if (!this.networkEngine.f5503ad && this.f6233bx < (this.networkEngine.f5574X - this.networkEngine.f5495Q) - 10) {
                        this.networkEngine.m1669d("we are slightly out of frame range, speeding up");
                        this.networkEngine.f5503ad = true;
                    }
                    if (!this.networkEngine.f5505af && this.f6233bx < (this.networkEngine.f5574X - this.networkEngine.f5495Q) - 30) {
                        this.networkEngine.m1669d("we are out of frame range, fast forwarding (" + this.f6233bx + "->" + this.networkEngine.f5574X + ")");
                        this.networkEngine.f5505af = true;
                    }
                    if (!this.networkEngine.f5505af && this.networkEngine.f5503ad) {
                        this.networkEngine.f5504ae += f;
                        if (this.networkEngine.f5504ae > this.networkEngine.m1686c() * 3.0f) {
                            this.networkEngine.f5504ae = 0.0f;
                            this.networkEngine.m1773a(this.networkEngine.m1686c(), true);
                            if (!this.networkEngine.f5498Y) {
                                m6488a(this.networkEngine.m1686c());
                            }
                        }
                    }
                    if (this.networkEngine.f5505af) {
                        this.networkEngine.m1773a(this.networkEngine.m1686c(), true);
                        if (!this.networkEngine.f5498Y) {
                            m6488a(this.networkEngine.m1686c());
                        }
                    }
                    if (this.f6233bx < this.networkEngine.f5574X - 90) {
                        this.networkEngine.m1773a(this.networkEngine.m1686c(), true);
                        if (!this.networkEngine.f5498Y) {
                            m6488a(this.networkEngine.m1686c());
                        }
                    }
                    if (this.f6233bx < this.networkEngine.f5574X - 120) {
                        this.networkEngine.m1773a(this.networkEngine.m1686c(), true);
                        if (!this.networkEngine.f5498Y) {
                            m6488a(this.networkEngine.m1686c());
                        }
                    }
                    if (this.f6233bx < this.networkEngine.f5574X - 600) {
                        this.networkEngine.m1773a(this.networkEngine.m1686c(), true);
                        if (!this.networkEngine.f5498Y) {
                            m6488a(this.networkEngine.m1686c());
                        }
                    }
                }
            }
        } else if (this.f6120cb.m2636g()) {
            float f11 = f;
            if (this.f6120cb.f4505t != 1) {
                f11 *= this.f6120cb.f4505t;
            }
            if (this.f6231bt != 1.0f) {
                f11 *= this.f6231bt;
            }
            if (!m6478a(false)) {
                this.f1248G += f11;
                while (this.f1248G > this.networkEngine.m1686c()) {
                    this.f1248G -= this.networkEngine.m1686c();
                    if (this.networkEngine.m1794I()) {
                        break;
                    }
                    m6488a(this.networkEngine.m1686c());
                }
            }
            if (this.f1248G > 100.0f) {
                this.f1248G = 100.0f;
            }
            if (this.f1248G < 0.0f) {
                this.f1248G = 0.0f;
            }
        } else if (!m6478a(false)) {
            m6488a(f);
        }
        if (m6478a(false)) {
            try {
                Thread.sleep(2L);
            } catch (Exception e2) {
            }
        }
        this.f6113bU.m1317a(f);
        this.audio.m2999b(f);
        this.f6106bN.m2932a(f);
        this.f6112bT.m2962b();
        C1058a.m786a().m785a(f);
        this.f6122cd.m2603b(EnumC0729bm.f4573b);
        this.f6122cd.m2608a(EnumC0729bm.f4574c);
        if (!this.f6266du) {
            if (this.graphics.mo936a()) {
                m6479a((InterfaceC0941l) null, f);
            } else if (this.f6073ao.mo6949n()) {
                m6479a(this.f6073ao.mo6961b(true), f);
            } else {
                InterfaceC0096f interfaceC0096f = this.f6073ao;
                this.f6073ao.mo6966a(f, i);
                if (interfaceC0096f.mo6960c() && !interfaceC0096f.mo6958e()) {
                    synchronized (interfaceC0096f.mo6956g()) {
                        if (interfaceC0096f.mo6960c() && !interfaceC0096f.mo6958e()) {
                            this.f6122cd.m2608a(EnumC0729bm.f4594w);
                            InterfaceC0941l mo6961b = interfaceC0096f.mo6961b(true);
                            this.f6122cd.m2603b(EnumC0729bm.f4594w);
                            if (!interfaceC0096f.mo6958e()) {
                                if (mo6961b != null) {
                                    if (mo6961b.mo980c()) {
                                        GameEngine.PrintLog("gameengine draw: bufferedCanvas drawn on");
                                    }
                                    mo6961b.mo985a(true);
                                }
                                if (mo6961b == null) {
                                    GameEngine.m1123f("GameEngine gameViewCanvas is null after lockCanvas - " + interfaceC0096f.hashCode());
                                }
                                m6479a(mo6961b, f);
                                this.graphics.mo906a((InterfaceC0941l) null);
                            }
                            if (mo6961b != null) {
                                try {
                                    try {
                                        interfaceC0096f.mo6965a(mo6961b, true);
                                    } catch (IllegalArgumentException e3) {
                                        e3.printStackTrace();
                                        GameEngine.m1123f("GameEngine catch currentGameView - " + interfaceC0096f.hashCode());
                                        GameEngine.m1123f("GameEngine catch currentGameView.gameThreadSync - " + interfaceC0096f.mo6956g().hashCode());
                                        interfaceC0096f.mo6955h();
                                    }
                                } catch (IllegalStateException e4) {
                                    e4.printStackTrace();
                                    GameEngine.m1123f("GameEngine catch currentGameView - " + interfaceC0096f.hashCode());
                                    GameEngine.m1123f("GameEngine catch currentGameView.gameThreadSync - " + interfaceC0096f.mo6956g().hashCode());
                                }
                            }
                        }
                    }
                }
                this.f6073ao.mo6962b(f, i);
            }
        }
        this.f6266du = false;
        m1210Y();
        this.f6122cd.m2603b(EnumC0729bm.f4574c);
        if (this.f6265dt) {
            this.f6265dt = false;
            String str = null;
            if (m1109l(this.f6159dk) != null) {
                str = m1107m(this.f6159dk);
            }
            if (this.networkEngine.f5564B) {
                str = null;
                new C0192a().start();
            }
            if (str != null) {
                GameEngine.PrintLog("gotoNextLevel: Loading next level: " + str);
                this.f6159dk = str;
                this.f6111bS.f5107e.m1951b();
                m6476a(true, false, EnumC1063s.f6734b);
            } else {
                GameEngine.PrintLog("gotoNextLevel: No next level, finishing");
                this.f6236bG = false;
                ActivityC0097g mo6954i = this.f6073ao.mo6954i();
                if (mo6954i != null) {
                    mo6954i.mo6929b();
                    mo6954i.m6937m();
                } else {
                    GameEngine.PrintLog("gotoNextLevel: Error getInGameActivity==null");
                }
            }
        }
        if (!this.f6075aq && this.f6234bE && !this.f1224i) {
            PrintLog("starting method trace");
            Debug.startMethodTracing("lukeTrace", 110000000);
            this.f1224i = true;
        }
        this.f6235bF = true;
        this.f6284ec.m768a();
        this.f6122cd.m2603b(EnumC0729bm.f4572a);
        this.f6122cd.m2605b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.i$a */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/i$a.class */
    public class C0192a extends Thread {
        C0192a() {
        }

        public void run() {
            C0191i.this.networkEngine.m1690b("gotoNextLevel");
        }
    }

    /* renamed from: g */
    public void m6458g() {
        ActivityC0097g mo6954i = this.f6073ao.mo6954i();
        if (mo6954i != null) {
            if (!mo6954i.m7356c()) {
                mo6954i.mo6929b();
                return;
            } else {
                GameEngine.m1145b("stopAndClose: inGameActivity is isFinishing");
                return;
            }
        }
        GameEngine.m1145b("stopAndClose: Error getInGameActivity==null");
    }

    /* renamed from: a */
    public void m6488a(float f) {
        if (m1154ax() && f < 0.1f) {
            C0831ad.m1648g("updateAllGame1: deltaSpeed:" + f + " frame:" + this.f6233bx + " network.currentStepRate:" + this.networkEngine.m1686c());
        }
        if (this.f6231bt != 1.0f && !this.networkEngine.f5564B && !this.f6120cb.m2636g()) {
            f *= this.f6231bt;
        }
        float f2 = f * this.f1249H;
        this.f1250I = f2 + 2.0f;
        this.f1251J = f2;
        this.networkEngine.m1701b(f2);
        this.f6096by = (int) (this.f6096by + (f2 * 16.666666f));
        this.f6124cf.m2590c();
        this.f6120cb.m2657a(f2);
        this.f6233bx++;
        Team.m6327g(f2);
        if (this.f6104bL != null) {
            this.f6104bL.m6599e(f2);
        }
        if (m1154ax() && f2 < 0.1f) {
            C0831ad.m1648g("updateAllGame2: deltaSpeed:" + f2 + " frame:" + this.f6233bx);
        }
        Unit.m5870bF();
        C1104o m460dI = AbstractC1120w.m460dI();
        Object[] m544b = m460dI.m544b();
        int size = m460dI.size();
        boolean ax = m1154ax();
        for (int i = 0; i < size; i++) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) m544b[i];
            if (ax && f2 != this.f1251J) {
                C0831ad.m1642h("JIT bug detected, attempting to correct. before object:" + abstractC1120w.f6945ed + " frame:" + this.f6233bx + " deltaSpeed:" + f2);
                f2 = this.f1251J;
            }
            abstractC1120w.update(f2);
        }
        if (m1154ax() && f2 < 0.1f) {
            C0831ad.m1648g("updateAllGame3: deltaSpeed:" + f2 + " frame:" + this.f6233bx);
        }
        int size2 = m460dI.f6895a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1108r c1108r = (C1108r) m460dI.f6895a.get(i2);
            if (c1108r.f6905a == EnumC1107q.f6902a) {
                AbstractC1120w abstractC1120w2 = (AbstractC1120w) c1108r.f6906b;
                if (!abstractC1120w2.f6946ef) {
                    abstractC1120w2.update(f2);
                }
            }
        }
        this.f6122cd.m2608a(EnumC0729bm.f4584m);
        this.f6121cc.m3795a();
        this.f6122cd.m2603b(EnumC0729bm.f4584m);
        AbstractC0623y.m3061g(f2);
        C0451j.m4799s(f2);
        C0451j.m5013a(f2, 0);
        this.f1225j++;
        if (this.f1225j >= 1000) {
            this.f1225j = 0;
            int i3 = 0;
            Iterator it = Unit.m5870bF().iterator();
            while (it.hasNext()) {
                Unit unit = (Unit) it.next();
                if (unit.isDead && !(unit instanceof Tree)) {
                    i3++;
                }
            }
            if (i3 > 70) {
                Iterator it2 = Unit.m5870bF().iterator();
                while (it2.hasNext()) {
                    Unit unit2 = (Unit) it2.next();
                    if ((unit2 instanceof Unit) && unit2.isDead && !(unit2 instanceof Tree) && unit2.f1607bU < this.f6096by - 30000 && i3 > 70) {
                        unit2.mo2880a();
                        i3--;
                    }
                }
            }
        }
        this.f6122cd.m2608a(EnumC0729bm.f4583l);
        Team.m6330f(f2);
        this.f6122cd.m2603b(EnumC0729bm.f4583l);
        C0741a.m2580a(f2);
        this.effects.m2565a(f2);
        this.f1245D.m2569a(f2);
        C1117y.m504a(f2);
        if (this.f6123ce != null) {
            this.f6123ce.m815c(f2);
        }
        this.f6122cd.m2608a(EnumC0729bm.f4586o);
        this.f6114bV.m2984a(f2);
        this.f6122cd.m2603b(EnumC0729bm.f4586o);
        this.f6122cd.m2608a(EnumC0729bm.f4585n);
        this.f6115bW.m1946a(f2);
        this.f6122cd.m2603b(EnumC0729bm.f4585n);
        this.f6113bU.m1302b(f2);
    }

    /* renamed from: a */
    public void m6479a(InterfaceC0941l interfaceC0941l, float f) {
        synchronized (this.f6220ak) {
            m6469b(interfaceC0941l, f);
        }
    }

    /* renamed from: h */
    public boolean m6457h() {
        if (this.f1252K == null) {
            this.f1252K = new C0193j("assets/shaders/post_base.frag");
        }
        if (this.f1253L == null) {
            this.f1253L = new C0193j("assets/shaders/post_displacement.frag");
        }
        this.f1252K.m6438a(this.graphics);
        this.f1253L.m6438a(this.graphics);
        if (this.f1252K.f1284g || this.f1253L.f1284g) {
            if (!this.f1254M) {
                this.f1254M = true;
                GameEngine.PrintLog("setupPostprocessing: failed");
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m6481a(C0193j c0193j) {
        if (this.f1255N != null) {
            throw new RuntimeException("Layer already enabled");
        }
        this.f1255N = this.graphics;
        this.graphics = c0193j.f1279b;
        this.graphics.mo880i();
        this.graphics.mo923a(new Rect(0, 0, this.graphics.mo876m(), this.graphics.mo875n()));
        this.graphics.mo892b(c0193j.f1283f, c0193j.f1282e);
    }

    /* renamed from: b */
    public void m6470b(C0193j c0193j) {
        if (this.f1255N == null) {
            throw new RuntimeException("Layer not enabled");
        }
        this.graphics.mo879j();
        this.graphics.mo873p();
        this.graphics = this.f1255N;
        this.f1255N = null;
        this.graphics.mo892b(c0193j.f1283f, c0193j.f1282e);
    }

    /* renamed from: b */
    public void m6469b(InterfaceC0941l interfaceC0941l, float f) {
        if (interfaceC0941l == null) {
            m1144b("drawAll", "canvas is null, not may not be available yet");
        } else if (f6080aB) {
        } else {
            this.graphics.mo906a(interfaceC0941l);
            this.graphics.mo919a(this.f6073ao.mo6959d());
            this.graphics.mo882g();
            this.f6097bz++;
            C0937h.f6436G = 0.0f;
            if (this.f6265dt) {
                this.graphics.mo894b(Color.m7283a(0, 0, 0));
                this.graphics.mo903a("Loading..", this.f6130cn, this.f6131co, this.f6163do);
                return;
            }
            float f2 = this.f6240cm;
            if (f2 != 1.0f) {
                this.graphics.mo880i();
                this.graphics.mo935a(f2, f2);
            }
            boolean m1152az = GameEngine.m1152az();
            if (m1152az && m1119h(113) && m1119h(44)) {
                m1152az = false;
            }
            if (m1152az && !m6457h()) {
                m1152az = false;
            }
            if (m1152az) {
                m6481a(this.f1252K);
                try {
                    this.graphics.mo894b(Color.m7283a(0, 0, 0));
                    this.f6122cd.m2608a(EnumC0729bm.f4575d);
                    m6465c((InterfaceC0941l) null, f);
                    this.f6122cd.m2603b(EnumC0729bm.f4575d);
                    m6470b(this.f1252K);
                    this.f1252K.m6436b();
                    if (!this.f1253L.m6439a()) {
                        m6481a(this.f1253L);
                        try {
                            this.graphics.mo894b(Color.m7283a(128, 128, 255));
                            m1218Q();
                            int m2553a = this.effects.m2553a(f, 101);
                            this.effects.f4682l = null;
                            m6470b(this.f1253L);
                            if (m2553a > 0) {
                                this.f1253L.f1281d.m1068a("screenBase", this.f1252K.f1278a);
                                this.f1253L.f1281d.m1065b("screenBaseSize", this.f1252K.f1278a);
                                this.f1253L.f1281d.m1070a("u_resolution", this.f6128ck, this.f6129cl);
                                this.f1253L.f1281d.m1071a("u_offsetBy", 0.2f * this.f6250cW);
                                this.f1253L.m6436b();
                            }
                        } catch (Throwable th) {
                            m6470b(this.f1253L);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    m6470b(this.f1252K);
                    throw th2;
                }
            } else {
                this.f6122cd.m2608a(EnumC0729bm.f4575d);
                m6465c(interfaceC0941l, f);
                this.f6122cd.m2603b(EnumC0729bm.f4575d);
            }
            if (!m1095z()) {
                this.f6122cd.m2608a(EnumC0729bm.f4577f);
                m6461d(interfaceC0941l, f);
                this.f6122cd.m2603b(EnumC0729bm.f4577f);
            }
            if (this.f6109bQ.showFps && this.f6154cS == 0.0f && !this.f6155cT && !this.f6153cR) {
                this.graphics.mo903a(this.f1236u, 100.0f, 35.0f, this.f1228m);
            }
            if (f1221f != null) {
                this.graphics.mo903a(f1221f, 100.0f, 85.0f, this.f1228m);
            }
            if (!this.f6075aq && (this.graphics.mo885d() != null || GameEngine.f6201aW)) {
                this.f6111bS.m2004c(f);
            }
            C0451j.m4862dC();
            this.graphics.mo881h();
            if (f2 != 1.0f) {
                interfaceC0941l.mo1006a();
            }
        }
    }

    /* renamed from: i */
    public boolean m6456i() {
        if (!this.f6109bQ.showUnitIcons) {
            return false;
        }
        if (this.f6250cW < 0.7d && this.f6146cD >= this.f6104bL.m6589i() - 5.0f && this.f6143cA >= this.f6104bL.m6588j() - 5.0f) {
            return true;
        }
        return m1233B() ? ((double) this.f6250cW) < 0.1d : m1157au() ? ((double) this.f6250cW) < 0.27d : ((double) this.f6250cW) < 0.4d;
    }

    /* renamed from: b */
    public void m6473b(float f) {
        boolean z = false;
        if (this.f6247cP.f230a < 0 || this.f6247cP.f231b < 0 || this.f6247cP.f232c > this.f6104bL.m6589i() || this.f6247cP.f233d > this.f6104bL.m6588j()) {
            z = true;
        }
        if (z) {
            this.graphics.mo894b(Color.m7283a(0, 0, 0));
        }
    }

    /* renamed from: c */
    public void m6466c(float f) {
    }

    /* renamed from: c */
    public void m6465c(InterfaceC0941l interfaceC0941l, float f) {
        if (!this.f6236bG) {
            return;
        }
        this.f6122cd.m2608a(EnumC0729bm.f4579h);
        this.f1265X.m533b();
        this.f6164dv = 0;
        boolean z = false;
        AbstractC1120w[] m539a = Unit.f6956en.m539a();
        int size = AbstractC1120w.f6956en.size();
        for (int i = 0; i < size; i++) {
            AbstractC1120w abstractC1120w = m539a[i];
            boolean z2 = abstractC1120w.f6948eh;
            boolean m464a = abstractC1120w.m464a(this);
            abstractC1120w.f6948eh = m464a;
            if (z2 != m464a) {
                z = true;
            }
            if (m464a) {
                this.f1265X.mo534a(abstractC1120w);
            }
        }
        if (this.f1264W.size() != this.f1265X.size()) {
            z = true;
        }
        this.f6122cd.m2603b(EnumC0729bm.f4579h);
        this.f6122cd.m2608a(EnumC0729bm.f4580i);
        if (z) {
            C1109s c1109s = this.f1264W;
            this.f1264W = this.f1265X;
            this.f1265X = c1109s;
        }
        if (!m6456i()) {
            Collections.sort(this.f1264W, AbstractC1120w.f6954ee);
        }
        this.f6122cd.m2603b(EnumC0729bm.f4580i);
        this.f6122cd.m2608a(EnumC0729bm.f4588q);
        this.f6122cd.m2608a(EnumC0729bm.f4590s);
        this.graphics.mo880i();
        this.graphics.mo923a(this.f6241cJ);
        this.f6122cd.m2603b(EnumC0729bm.f4590s);
        this.f6122cd.m2608a(EnumC0729bm.f4589r);
        m6473b(f);
        this.f6122cd.m2603b(EnumC0729bm.f4589r);
        if (this.f6109bQ.renderFancyWater) {
            if (this.f1256O == null) {
                this.f1256O = this.graphics.loadImage(R.drawable.water_cloud);
            }
            if (this.f1257P == null) {
                this.f1257P = this.graphics.loadImage(R.drawable.water_layer1);
            }
            if (this.f1258Q == null) {
                this.f1258Q = this.graphics.loadImage(R.drawable.water_layer2);
            }
            this.f1260S.m7207a(this.f6241cJ);
            this.f1259R += 0.05f * f;
            if (this.f1259R > 100.0f) {
                this.f1259R -= 100.0f;
            }
            this.graphics.mo911a(this.f1256O, this.f1260S, (Paint) null, this.f6136ct / 6, this.f6137cu / 6, 1, 1);
            this.f1260S.m7207a(this.f6242cK);
            this.f1261T.m7194a(this.f6242cK);
            this.graphics.mo880i();
            m1218Q();
            this.graphics.mo908a(this.f1258Q, this.f1261T, (Paint) null, this.f6136ct + this.f1259R, this.f6137cu + this.f1259R, 0, 0);
            this.graphics.mo908a(this.f1257P, this.f1261T, (Paint) null, this.f6136ct, this.f6137cu, 0, 0);
            this.graphics.mo879j();
        }
        this.f6122cd.m2608a(EnumC0729bm.f4591t);
        if (this.f6104bL != null && m1161aq()) {
            this.f6104bL.m6604d(f);
        }
        this.f6122cd.m2603b(EnumC0729bm.f4591t);
        m1218Q();
        this.graphics.mo923a(this.f6242cK);
        boolean m6456i = m6456i();
        this.f6113bU.m1296c(f);
        this.f6122cd.m2603b(EnumC0729bm.f4588q);
        AbstractC1120w[] m539a2 = this.f1264W.m539a();
        int size2 = this.f1264W.size();
        this.f6252db = true;
        this.f6253dc = true;
        this.f6254dd = true;
        this.f6255de = true;
        this.f6256df = true;
        if (this.f6250cW < 0.45d) {
            this.f6254dd = false;
            this.f6252db = false;
            this.f6256df = false;
        }
        if (this.f6250cW < 0.3d) {
            this.f6255de = false;
            this.f6253dc = false;
        }
        if (!m6456i) {
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractC1120w abstractC1120w2 = m539a2[i2];
                if (abstractC1120w2.f6949ei == 0) {
                    abstractC1120w2.draw(f);
                }
            }
        }
        C0741a.m2573b(f);
        this.f6122cd.m2608a(EnumC0729bm.f4578g);
        this.effects.m2553a(f, 1);
        this.f6122cd.m2603b(EnumC0729bm.f4578g);
        this.f6122cd.m2608a(EnumC0729bm.f4587p);
        if (m6456i) {
            if (this.f6111bS.m1969p() == 0) {
                Unit.f1594bH.m7267a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8);
                Unit.f1595bI.m7267a(255, 255, 255, 255);
            } else {
                Unit.f1594bH.m7267a(175, 175, 175, 175);
                Unit.f1595bI.m7267a(255, 255, 255, 255);
            }
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC1120w abstractC1120w3 = m539a2[i3];
                if (!abstractC1120w3.m457f(f)) {
                    abstractC1120w3.draw(f);
                }
            }
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractC1120w abstractC1120w4 = m539a2[i4];
                abstractC1120w4.mo469a(f, true);
                abstractC1120w4.m456p(f);
            }
        } else {
            for (int i5 = 0; i5 < size2; i5++) {
                m539a2[i5].mo461d(f);
            }
            for (int i6 = 0; i6 < size; i6++) {
                AbstractC1120w abstractC1120w5 = m539a[i6];
                if (!abstractC1120w5.f6948eh) {
                    if (abstractC1120w5 instanceof Unit) {
                        Unit unit = (Unit) abstractC1120w5;
                        if (unit.f1643cE) {
                            if (unit.team != this.f6093bs && !unit.m5815ce()) {
                            }
                        }
                    }
                }
                abstractC1120w5.mo458e(f);
                if (!abstractC1120w5.f6948eh) {
                    abstractC1120w5.m456p(f);
                }
            }
            for (int i7 = 0; i7 < size2; i7++) {
                AbstractC1120w abstractC1120w6 = m539a2[i7];
                if (abstractC1120w6.f6949ei != 0 && abstractC1120w6.f6949ei != 10) {
                    abstractC1120w6.draw(f);
                }
            }
            for (int i8 = 0; i8 < size2; i8++) {
                AbstractC1120w abstractC1120w7 = m539a2[i8];
                abstractC1120w7.mo469a(f, false);
                abstractC1120w7.m456p(f);
            }
            Team.m6324h(f);
        }
        this.f6254dd = true;
        this.f6255de = true;
        this.f6122cd.m2603b(EnumC0729bm.f4587p);
        this.f6122cd.m2608a(EnumC0729bm.f4578g);
        this.effects.m2553a(f, 2);
        this.f6122cd.m2603b(EnumC0729bm.f4578g);
        for (int i9 = 0; i9 < size2; i9++) {
            AbstractC1120w abstractC1120w8 = m539a2[i9];
            if (abstractC1120w8.f6949ei == 10) {
                abstractC1120w8.draw(f);
            }
        }
        this.f1245D.m2567b(f);
        if (this.f6123ce != null) {
            this.f6123ce.m830a(f);
        }
        m6466c(f);
        C1117y.m482b(f);
        this.f6121cc.m3782c(f);
        this.f6122cd.m2608a(EnumC0729bm.f4576e);
        this.graphics.mo879j();
        this.f6122cd.m2603b(EnumC0729bm.f4576e);
    }

    /* renamed from: d */
    public void m6461d(InterfaceC0941l interfaceC0941l, float f) {
        this.f6111bS.m2017b(f);
        if (this.f6123ce != null) {
            this.f6123ce.m819b(f);
        }
        this.f6115bW.m1926e(f);
        this.effects.m2543b(f);
        if (this.f6109bQ.showFps && this.f6154cS == 0.0f) {
            this.f6122cd.m2602c();
        }
        if (this.f6239cg) {
            this.graphics.mo903a("Look Mode", this.f6130cn, this.f6131co, this.f6163do);
        }
        if (this.f6226bm) {
            int i = 20;
            for (int i2 = 0; i2 < Team.f1364c; i2++) {
                Team m6317k = Team.m6317k(i2);
                if (m6317k != null && (m6317k instanceof C0136a)) {
                    C0136a c0136a = (C0136a) m6317k;
                    this.graphics.mo903a(c0136a.f1305k + "| c:" + c0136a.f1309o, 20.0f, i, this.f6161dm);
                    i += 20;
                }
            }
        }
    }

    /* renamed from: j */
    public void m6455j() {
        this.f6126ci = m1213V();
        m1212W();
        this.f6130cn = this.f6128ck / 2.0f;
        this.f6131co = this.f6129cl / 2.0f;
        this.f6132cp = (int) (this.f6129cl / 3.0f);
        float f = (int) (this.f6128ck / 3.0f);
        if (this.f6132cp > f) {
            this.f6132cp = f;
        }
        this.f6132cp = CommonUtils.m2315b(this.f6132cp, 60.0f, (int) (250.0f * this.f6126ci));
        float f2 = this.f6140cx + this.f6150cH;
        float f3 = this.f6141cy + this.f6151cI;
        if (this.f6153cR) {
            this.f6147cE = this.f6128ck;
            this.f6148cF = this.f6128ck;
        } else {
            this.f6148cF = (this.f6128ck - this.f6132cp) + 1.0f;
            if (C0797f.f5187bA) {
                this.f6147cE = this.f6128ck;
            } else {
                this.f6147cE = this.f6148cF;
            }
        }
        if (this.f6147cE < 1.0f) {
            this.f6147cE = 1.0f;
        }
        if (this.f6148cF < 1.0f) {
            this.f6148cF = 1.0f;
        }
        if (this.f6152cQ != this.f6153cR) {
            if (!this.f6153cR) {
                f2 -= (this.f6132cp / 2.0f) / this.f6250cW;
            } else {
                f2 += (this.f6132cp / 2.0f) / this.f6250cW;
            }
        }
        this.f6152cQ = this.f6153cR;
        this.f6149cG = this.f6129cl;
        this.f6142cz = this.f6147cE / this.f6250cW;
        this.f6143cA = this.f6149cG / this.f6250cW;
        this.f6146cD = this.f6148cF / this.f6250cW;
        this.f6150cH = this.f6142cz / 2.0f;
        this.f6151cI = this.f6143cA / 2.0f;
        this.f6241cJ.m7208a(0, 0, (int) this.f6147cE, (int) this.f6149cG);
        this.f6242cK.m7208a(0, 0, ((int) this.f6142cz) + 1, ((int) this.f6143cA) + 1);
        this.f6243cL.m7195a(0.0f, 0.0f, this.f6142cz + 1.0f, this.f6143cA + 1.0f);
        m1207a(f2 - this.f6150cH, f3 - this.f6151cI);
    }

    /* renamed from: b */
    public void m6471b(int i, int i2) {
        m6484a(i, i2, 1.0f);
    }

    /* renamed from: a */
    public void m6484a(int i, int i2, float f) {
        this.f6128ck = i;
        this.f6129cl = i2;
        this.f6240cm = f;
        m6455j();
    }

    /* renamed from: k */
    public String m6454k() {
        if (GameEngine.f6202aX) {
            return "com.corrodinggames.rts.java";
        }
        if (GameEngine.f6203aY) {
            return "com.corrodinggames.rts.gdx";
        }
        if (f6199aU) {
            return "com.corrodinggames.rts.server";
        }
        if (this.f6221am == null) {
            return "<null context>";
        }
        return this.f6221am.mo7343h();
    }

    /* renamed from: l */
    public String m6453l() {
        if (GameEngine.f6202aX) {
            return "java";
        }
        if (GameEngine.f6203aY) {
            return "java-gdx";
        }
        if (f6199aU) {
            return "dedicatedServer";
        }
        if (this.f6221am == null) {
            return "<null context>";
        }
        try {
            return this.f6221am.mo7345f().getInstallerPackageName(m6454k());
        } catch (IllegalArgumentException e) {
            return "IllegalArgumentException: " + e.getMessage();
        }
    }

    /* renamed from: m */
    public boolean m6452m() {
        if (m6444u().contains("p")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int m6464c(boolean z) {
        if (f6199aU || z) {
            return 172;
        }
        try {
            return this.f6221am.mo7345f().getPackageInfo(this.f6221am.mo7343h(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    public String m6451n() {
        if (!m1159as()) {
            return null;
        }
        try {
            Signature[] signatureArr = this.f6221am.mo7345f().getPackageInfo(this.f6221am.mo7343h(), 64).signatures;
            if (0 < signatureArr.length) {
                return CommonUtils.m2297b(signatureArr[0].toByteArray());
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: o */
    public boolean m6450o() {
        if (!GameEngine.f6204aZ) {
            if (m6449p() || f6200aV) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m6449p() {
        if (AbstractC0623y.class.getSimpleName().equals("OrderableUnit")) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public String m6448q() {
        String m6446s = m6446s();
        if ("1" != 0 && !VariableScope.nullOrMissingString.equals("1")) {
            m6446s = m6446s + "-1";
        }
        return m6446s;
    }

    /* renamed from: r */
    public void m6447r() {
        f1216a = null;
        m6446s();
    }

    /* renamed from: s */
    public String m6446s() {
        if (f1216a != null) {
            return f1216a;
        }
        String str = "v" + m6445t();
        if (!GameEngine.f6184as || f6200aV) {
            str = "DEBUG BUILD - " + str;
        } else if (GameEngine.f6185at) {
            str = "TESTING BUILD - " + str;
        } else if (str.contains("p")) {
            str = "BETA VERSION - " + str;
        }
        if (!GameEngine.f6204aZ && m6449p()) {
            str = "RAW - " + str;
        }
        f1216a = str;
        return f1216a;
    }

    /* renamed from: t */
    public String m6445t() {
        return "1.15p9";
    }

    /* renamed from: u */
    public String m6444u() {
        return "1.15p9";
    }

    /* renamed from: v */
    public synchronized void m6443v() {
        this.f1270ac = false;
        if (this.f1269ab != null) {
            this.f1269ab.cancel();
            this.f1269ab = null;
        }
    }

    /* renamed from: a */
    public synchronized void m6483a(Activity activity, InterfaceC0096f interfaceC0096f, boolean z) {
        synchronized (this.f1271ad) {
            if (!f6199aU) {
                interfaceC0096f.mo6967a();
            }
            this.f6072an = activity;
            this.f6075aq = z;
            this.f6153cR = this.f6075aq;
            if (z && !this.f6236bG && !this.f6238bI && !GameEngine.noBackground && !this.networkEngine.f5564B) {
                m6442w();
            }
            InterfaceC0096f interfaceC0096f2 = this.f6074ap;
            if (this.f6073ao == null) {
                this.f6073ao = interfaceC0096f;
            }
            this.f6074ap = interfaceC0096f;
            if (interfaceC0096f2 != null && interfaceC0096f2 != interfaceC0096f) {
                interfaceC0096f2.mo6953j();
            }
            if (interfaceC0096f != null) {
                interfaceC0096f.mo6950m();
            }
            if (this.f6111bS != null) {
                this.f6111bS.m1993e();
            }
            m6443v();
            m1226I();
        }
    }

    /* renamed from: w */
    public synchronized void m6442w() {
        if (this.f1272ae > 20) {
            return;
        }
        int i = this.f6109bQ.nextBackgroundMap;
        this.f6109bQ.nextBackgroundMap++;
        if (this.f6109bQ.nextBackgroundMap > 3) {
            this.f6109bQ.nextBackgroundMap = 1;
        }
        this.f6109bQ.save();
        int m2310b = CommonUtils.m2310b(i, 1, 3);
        this.f6160dl = null;
        this.f6159dk = "maps/menu_background/menu" + m2310b + ".tmx";
        try {
            Team.m6371b(10, true);
            for (int i2 = 0; i2 < Team.f1364c; i2++) {
                C0136a c0136a = new C0136a(i2);
                if (i2 == 0) {
                    this.f6093bs = c0136a;
                }
            }
            m6477a(false, EnumC1063s.f6733a);
            this.f6237bH = true;
            this.f6111bS.m1958x();
            if (!this.f6236bG) {
                GameEngine.m1120g("Menu load failed");
                this.f1272ae++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    void m6462d(float f) {
        if (this.f6075aq && !this.f6237bH) {
            if (this.f1274ag == null) {
                this.f1274ag = m6441x();
                if (this.f1273af == this.f1274ag) {
                    this.f1274ag = null;
                }
            }
            if (this.f1273af == null) {
                this.f1273af = this.f1274ag;
                this.f1274ag = null;
            }
            if (this.f1275ah != 0.0f && this.f1274ag != null) {
                m6487a(f, this.f1274ag.f6951ek, this.f1274ag.f6952el, this.f1275ah * 0.5f);
            }
            if (this.f1273af != null) {
                boolean m6487a = m6487a(f, this.f1273af.f6951ek, this.f1273af.f6952el, (1.0f - this.f1275ah) * 0.5f);
                if (CommonUtils.m2366a(this.f6140cx + this.f6150cH, this.f6141cy + this.f6151cI, this.f1273af.f6951ek, this.f1273af.f6952el) < 6400.0f) {
                    m6487a = true;
                }
                if (m6487a) {
                    this.f1276ai = true;
                }
            }
            if (this.f1276ai) {
                this.f1275ah += 0.01f * f;
                if (this.f1275ah >= 1.0f) {
                    this.f1275ah = 0.0f;
                    this.f1273af = null;
                    this.f1276ai = false;
                }
            }
        }
    }

    /* renamed from: a */
    Unit m6480a(Team team) {
        int i = 0;
        Iterator it = Unit.f1589bD.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (!unit.m5755u() && (unit.team == team || team == null)) {
                i++;
            }
        }
        if (i > 0) {
            int m2360a = CommonUtils.m2360a(0, i - 1);
            int i2 = 0;
            Iterator it2 = Unit.f1589bD.iterator();
            while (it2.hasNext()) {
                Unit unit2 = (Unit) it2.next();
                if (!unit2.m5755u() && (unit2.team == team || team == null)) {
                    if (i2 == m2360a) {
                        return unit2;
                    }
                    i2++;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: x */
    Unit m6441x() {
        Unit m6480a = m6480a(this.f6093bs);
        if (m6480a != null) {
            return m6480a;
        }
        return m6480a((Team) null);
    }

    /* renamed from: a */
    public boolean m6487a(float f, float f2, float f3, float f4) {
        float m2280d = CommonUtils.m2280d(this.f6140cx + this.f6150cH, this.f6141cy + this.f6151cI, f2, f3);
        float m2366a = CommonUtils.m2366a(this.f6140cx + this.f6150cH, this.f6141cy + this.f6151cI, f2, f3);
        float f5 = f4 * f;
        float f6 = 15.0f;
        if (15.0f < f5 + 1.0f) {
            f6 = f5 + 1.0f;
        }
        if (m2366a < f6 * f6 || this.f6135cs) {
            return true;
        }
        this.f6144cB += CommonUtils.m2249i(m2280d) * f5;
        this.f6145cC += CommonUtils.sin(m2280d) * f5;
        if (CommonUtils.m2294c(this.f6144cB) >= 1.0f || CommonUtils.m2294c(this.f6145cC) >= 1.0f) {
            this.f6140cx += this.f6144cB;
            this.f6141cy += this.f6145cC;
            this.f6144cB = 0.0f;
            this.f6145cC = 0.0f;
            m1207a(this.f6140cx, this.f6141cy);
            return false;
        }
        return false;
    }

    /* renamed from: y */
    public int m6440y() {
        return this.f1219d;
    }
}

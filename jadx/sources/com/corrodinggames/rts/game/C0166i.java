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
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.p011a.C0118a;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.p012b.C0154f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0209ae;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.custom.C0307ac;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.p026f.C0453c;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0525a;
import com.corrodinggames.rts.gameFramework.C0535aa;
import com.corrodinggames.rts.gameFramework.C0537ac;
import com.corrodinggames.rts.gameFramework.C0547am;
import com.corrodinggames.rts.gameFramework.C0577ba;
import com.corrodinggames.rts.gameFramework.C0581be;
import com.corrodinggames.rts.gameFramework.C0582bf;
import com.corrodinggames.rts.gameFramework.C0583bg;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.C0595c;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.C0743j;
import com.corrodinggames.rts.gameFramework.C0856y;
import com.corrodinggames.rts.gameFramework.EnumC0588bk;
import com.corrodinggames.rts.gameFramework.EnumC0803s;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0569a;
import com.corrodinggames.rts.gameFramework.p030b.C0570b;
import com.corrodinggames.rts.gameFramework.p030b.C0571c;
import com.corrodinggames.rts.gameFramework.p030b.C0574f;
import com.corrodinggames.rts.gameFramework.p032d.C0623f;
import com.corrodinggames.rts.gameFramework.p032d.C0628k;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p035f.C0656a;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.p037h.C0734h;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0749f;
import com.corrodinggames.rts.gameFramework.p039j.C0750g;
import com.corrodinggames.rts.gameFramework.p039j.C0754k;
import com.corrodinggames.rts.gameFramework.p039j.C0756m;
import com.corrodinggames.rts.gameFramework.p042l.C0796a;
import com.corrodinggames.rts.gameFramework.utility.C0830i;
import com.corrodinggames.rts.gameFramework.utility.C0838o;
import com.corrodinggames.rts.gameFramework.utility.C0842r;
import com.corrodinggames.rts.gameFramework.utility.C0843s;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.EnumC0841q;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.p008a.AbstractC0068d;
import com.corrodinggames.rts.p008a.ActivityC0069e;
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
public class C0166i extends AbstractC0789l {

    /* renamed from: a */
    public static String f1149a;

    /* renamed from: b */
    public static boolean f1150b;

    /* renamed from: c */
    public static boolean f1151c;

    /* renamed from: d */
    int f1152d;

    /* renamed from: f */
    public static String f1153f = null;

    /* renamed from: g */
    public AbstractC0751h f1154g;

    /* renamed from: i */
    int f1155i;

    /* renamed from: j */
    String f1156j;

    /* renamed from: n */
    Paint f1157n;

    /* renamed from: o */
    Paint f1158o;

    /* renamed from: p */
    Paint f1159p;

    /* renamed from: q */
    Paint f1160q;

    /* renamed from: r */
    Paint f1161r;

    /* renamed from: B */
    Paint f1162B;

    /* renamed from: C */
    Paint f1163C;

    /* renamed from: D */
    Paint f1164D;

    /* renamed from: F */
    public C0582bf f1165F;

    /* renamed from: G */
    public C0581be f1166G;

    /* renamed from: I */
    AbstractC0117a f1167I;

    /* renamed from: L */
    public float f1168L;

    /* renamed from: M */
    public float f1169M;

    /* renamed from: N */
    C0748e f1170N;

    /* renamed from: O */
    C0748e f1171O;

    /* renamed from: P */
    C0748e f1172P;

    /* renamed from: Y */
    Timer f1173Y;

    /* renamed from: Z */
    boolean f1174Z;

    /* renamed from: ac */
    AbstractC0210af f1175ac;

    /* renamed from: ad */
    AbstractC0210af f1176ad;

    /* renamed from: ae */
    float f1177ae;

    /* renamed from: af */
    boolean f1178af;

    /* renamed from: e */
    public float f1179e = 1.0f;

    /* renamed from: h */
    RunnableC0168j[] f1180h = new RunnableC0168j[6];

    /* renamed from: k */
    public boolean f1181k = false;

    /* renamed from: l */
    public int f1182l = 0;

    /* renamed from: m */
    public ConcurrentLinkedQueue f1183m = new ConcurrentLinkedQueue();

    /* renamed from: s */
    int f1184s = 0;

    /* renamed from: t */
    int f1185t = 0;

    /* renamed from: u */
    int f1186u = 0;

    /* renamed from: v */
    float f1187v = 16.0f;

    /* renamed from: w */
    public String f1188w = "0fps";

    /* renamed from: x */
    public Object f1189x = new Object();

    /* renamed from: y */
    public Object f1190y = new Object();

    /* renamed from: z */
    Rect f1191z = new Rect();

    /* renamed from: A */
    public ArrayList f1192A = new ArrayList();

    /* renamed from: E */
    public Paint f1193E = new Paint();

    /* renamed from: H */
    public C0570b f1194H = new C0570b();

    /* renamed from: J */
    float f1195J = 0.0f;

    /* renamed from: K */
    public float f1196K = 1.0f;

    /* renamed from: Q */
    float f1197Q = 0.0f;

    /* renamed from: R */
    Rect f1198R = new Rect();

    /* renamed from: S */
    RectF f1199S = new RectF();

    /* renamed from: T */
    public C0748e f1200T = null;

    /* renamed from: U */
    final C0843s f1201U = new C0843s("allOnScreenObjects");

    /* renamed from: V */
    Matrix f1202V = new Matrix();

    /* renamed from: W */
    public ArrayList f1203W = new ArrayList();

    /* renamed from: X */
    public ArrayList f1204X = new ArrayList();

    /* renamed from: aa */
    Object f1205aa = new Object();

    /* renamed from: ab */
    int f1206ab = 0;

    public C0166i(Context context) {
        super(context);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: a */
    public boolean mo747a() {
        if (this.f5481bA.f4363p) {
            return true;
        }
        if (this.f5625do == null || !this.f5625do.mo101b()) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: a */
    public boolean mo724a(boolean z) {
        if (!z || this.f5490bJ.m1983h()) {
            if (this.f5481bA.f4363p || this.f5463aZ) {
                return true;
            }
            if (this.f5449al && !this.f5589bq) {
                return true;
            }
            if (this.f5587bo && this.f5625do != null && this.f5625do.mo101b()) {
                return true;
            }
        }
        if ((!z || this.f5486bF.isGameStart_Hcat) && !this.f5486bF.m1389C()) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: b */
    public int mo702b() {
        return this.f1186u;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: a */
    public synchronized void mo739a(Context context) {
        Log.m4292d("RustedWarfare", "--- ----------------- ----");
        Log.m4292d("RustedWarfare", "--- GameEngine:init() ----");
        Log.m4292d("RustedWarfare", "--- ----------------- ----");
        if (this.f5576aS) {
            Log.m4292d("RustedWarfare", "GameEngine init has already been called");
        } else if (!m650v() || !getClass().equals(C0166i.class)) {
            System.gc();
            m673g("Asset Index");
            this.f5473bs = new C0830i(context);
            long a = C0586bj.m1962a();
            this.f5492bL = new C0586bj(this);
            this.f5492bL.m1958a(EnumC0588bk.f4075C);
            if (f5556aF) {
                this.f5495bP = 1.0f;
            } else {
                DisplayMetrics displayMetrics = context.mo4535e().getDisplayMetrics();
                this.f5495bP = context.mo4535e().getDisplayMetrics().density;
                AbstractC0789l.m683d("densityScaleRaw: " + this.f5495bP);
                m3809a(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            this.f5495bP *= this.f1179e;
            AbstractC0789l.m683d("densityScaleRaw*densityScaleMultiplier: " + this.f5495bP);
            if (AbstractC0789l.m696b(context)) {
                this.f5575am = true;
            }
            this.f1167I = new C0146b();
            this.f5581aY = false;
            m673g("InputController");
            this.f5482bB = new C0537ac();
            this.f5482bB.m2140a();
            m673g("SettingsEngine");
            this.f5479by = SettingsEngine.getInstance(context);
            this.f5496bQ = m759O();
            AbstractC0789l.m683d("densityScale(): " + this.f5496bQ);
            long a2 = C0586bj.m1962a();
            C0652a.m1582a();
            C0586bj.m1957a("Locale.init took:", a2);
            AbstractC0171m.m3776G();
            this.f1157n = new Paint();
            this.f1158o = new Paint();
            this.f1158o.m4448a(255, 255, 255, 255);
            this.f1158o.m4432a(true);
            m736a(this.f1158o, 16.0f);
            this.f1159p = new Paint();
            this.f1159p.m4448a(255, 255, 255, 255);
            this.f1159p.m4432a(true);
            m736a(this.f1159p, 16.0f);
            this.f1160q = new Paint();
            this.f1160q.m4448a(100, 255, 0, 0);
            m736a(this.f1160q, 16.0f);
            this.f1161r = new Paint();
            this.f1161r.m4448a(100, 0, 255, 0);
            m736a(this.f1161r, 16.0f);
            this.f5531cU = new Paint();
            this.f5532cV = new Paint();
            this.f5532cV.m4445a(Paint.Align.f197b);
            this.f5532cV.m4432a(true);
            this.f5532cV.mo851a(Typeface.m4360a(Typeface.f243c, 0));
            m736a(this.f5532cV, 16.0f);
            this.f5533cW = new Paint();
            this.f5533cW.m4448a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
            this.f5533cW.m4432a(true);
            this.f5533cW.m4445a(Paint.Align.f197b);
            m736a(this.f5533cW, 18.0f);
            this.f1162B = new Paint();
            this.f1162B.m4428b(-1);
            this.f1162B.m4423c(100);
            this.f1163C = new Paint();
            this.f1163C.m4428b(-7829368);
            this.f1163C.m4423c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
            this.f1163C.m4443a(Paint.Style.f217b);
            this.f1163C.m4451a(1.0f);
            long a3 = C0586bj.m1962a();
            m673g("AudioEngine");
            C0530e.m2162b();
            this.f5475bu = new C0530e();
            this.f5475bu.m2168a(context);
            C0586bj.m1957a("AudioEngine took:", a3);
            m673g("MusicController");
            this.f5476bv = new C0547am();
            this.f5476bv.m2111a(context);
            if (f5461aR != null) {
                m683d("init(): using Graphics instance");
                this.f5477bw = f5461aR;
            } else if (f5460aQ != null) {
                m683d("init(): using GraphicsSlick2d");
                try {
                    this.f5477bw = (AbstractC0755l) f5460aQ.newInstance();
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(e2);
                }
            } else if (f5556aF) {
                this.f5477bw = new C0756m();
            } else {
                this.f5477bw = new C0754k();
            }
            m673g("graphics.init");
            this.f5477bw.mo188a(context);
            this.f5477bw.mo148b();
            C0743j.m897a();
            m673g("Fonts");
            m757Q();
            m673g("effects.init");
            this.f5480bz = new C0571c();
            this.f5480bz.m2054a(context);
            m673g("minimapHandler");
            this.f5485bE = new C0628k();
            this.f5485bE.m1673a(context);
            if (f5497bR != null) {
                AbstractC0789l.m683d("We have an initial screen size, can do early setup of image buffers");
                m673g("Map Buffers");
                mo698b(f5497bR.f221a, f5497bR.f222b);
                m3794g();
                C0148b.m3916c();
                this.f5485bE.m1660e();
            }
            m673g("PathEngine");
            this.f5483bC = new C0734h();
            m673g("GroupController");
            this.f5484bD = new C0535aa();
            m673g("CollisionEngine");
            this.f5478bx = new C0525a();
            m673g("InterfaceEngine");
            this.f5481bA = new C0623f();
            this.f5481bA.m1779a(context);
            this.f1166G = C0581be.m1971c(context);
            m673g("NetworkEngine");
            this.f5486bF = new Hcat_Multiplaye();
            this.f5486bF.m1223y();
            m673g("StatsHandler");
            this.f5487bG = new C0583bg();
            m673g("ModEngine");
            this.f5488bH = new C0656a();
            this.f5488bH.m1450a();
            m673g("CommandController");
            this.f5494bN = new C0595c();
            m673g("GameSaver");
            this.f5489bI = new C0856y();
            m673g("ReplayEngine");
            this.f5490bJ = new C0577ba();
            this.f5490bJ.m2003a(context);
            m673g("UnitGeoIndex");
            this.f5491bK = new C0453c();
            m673g("Precalculating map fog");
            C0148b.m3957a();
            m673g("ScorchMark.load");
            C0169k.m3786b();
            m673g("Projectile.load");
            C0163f.m3820c();
            m673g("Emitter.load");
            C0574f.m2017b();
            m673g("Unit.loadAllUnits");
            long a4 = C0586bj.m1962a();
            AbstractC0210af.m3548bv();
            C0586bj.m1957a("loadAllUnits took:", a4);
            m673g("Loading custom unit data");
            long a5 = C0586bj.m1962a();
            C0307ac.m3279f();
            m673g("getAllUnitsChecksum");
            C0586bj.m1957a("CustomUnits took:", a5);
            long a6 = C0586bj.m1962a();
            this.f1152d = AbstractC0210af.m3565bA();
            C0586bj.m1957a("allUnitsChecksum took:", a6);
            this.f1164D = new Paint();
            this.f1164D.m4448a(50, 255, 255, 255);
            m647y();
            System.gc();
            this.f5576aS = true;
            AbstractC0789l.m683d("Init completed");
            C0586bj.m1957a("Loading took:", a);
            this.f5492bL.m1953b(EnumC0588bk.f4075C);
            this.f5492bL.m1956a(true, true);
            long a7 = C0586bj.m1962a();
            m673g("Loading map data");
            if (!AbstractC0789l.f5451as) {
                mo654q();
            }
            C0586bj.m1957a("loadAMenuMap took:", a7);
            m716af();
            m673g("init complete");
            if (f5455aw) {
                EnumC0215ak.m3463s();
                System.exit(0);
            }
            if (f5456ax) {
                EnumC0215ak.m3464r();
                System.exit(0);
            }
            this.f5462aT = true;
        } else {
            throw new RuntimeException("inSpace but class is:" + getClass());
        }
    }

    /* renamed from: a */
    public void m3809a(int i, int i2) {
        float b = C0654f.m1515b(0.0f, 0.0f, i, i2) / 1131.0f;
        AbstractC0789l.m683d("defaultViewpointZoomDensity: " + b);
        if (b < 0.5f) {
            b = 0.5f;
        }
        if (b > 3.0f) {
            b = 3.0f;
        }
        AbstractC0789l.m683d("defaultViewpointZoomDensity after limit: " + b);
        this.f5603cF = 1.0f;
        if (C0654f.m1500c(b - 1.0f) > 0.1d) {
            this.f5603cF = b;
            if (this.f5603cF > 2.0f) {
                this.f5603cF = 2.0f;
            }
            if (this.f5603cF < 0.5f) {
                this.f5603cF = 0.5f;
            }
            this.f5602cE = this.f5600cC * this.f5603cF;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: c */
    public void mo692c() {
        m770D();
        m3799d();
    }

    /* renamed from: d */
    public void m3799d() {
        m3802b(false);
        this.f5588bp = false;
        this.f5589bq = false;
        this.f5587bo = false;
        this.f5463aZ = false;
        this.f5481bA.f4363p = false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: a */
    public synchronized void mo723a(boolean z, EnumC0803s sVar) {
        m770D();
        mo722a(z, false, sVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: a */
    public void mo722a(boolean z, boolean z2, EnumC0803s sVar) {
        ActivityC0069e k;
        m3802b(z2);
        this.f5581aY = false;
        System.gc();
        this.f5590br = true;
        this.f5588bp = false;
        this.f5463aZ = false;
        this.f5587bo = false;
        this.f5467bh = 0;
        this.f5591bO = false;
        this.f5486bF.m1360a(1L);
        this.f5585bg = 0;
        C0654f.m1568a();
        this.f5486bF.m1232p();
        if (!z2) {
            this.f5613cX = false;
            this.f5614cY = false;
            this.f5615cZ = 0.0f;
            this.f5617db = false;
            this.f5616da = false;
        }
        this.f1182l = 0;
        if (!z2) {
            this.f5600cC = 1.0f;
        }
        this.f5619de = 0.0f;
        if (!this.f5490bJ.m1983h()) {
            if (!this.f5486bF.f4734z) {
                C0307ac.m3284b(true);
            } else {
                C0307ac.m3283c();
            }
        }
        if (this.f5486bF.f4734z) {
            this.f5464bb = this.f5486bF.f4662x;
            if (this.f5464bb == null) {
                throw new RuntimeException("cannot find player's team");
            } else if (this.f5464bb != AbstractC0171m.m3688n(this.f5464bb.f1230i)) {
                AbstractC0789l.m676f("Stale playerTeam");
            }
        } else if (!this.f5490bJ.m1983h() && z) {
            this.f5464bb = new C0162e(0);
            this.f5464bb.f1238q = "Player";
            for (int i = 1; i < 8; i++) {
                new C0118a(i);
            }
            this.f5486bF.m1316ah();
        }
        this.f5493bM = null;
        this.f5474bt = new C0148b();
        try {
            if (this.f5530cT != null) {
                InputStream u = this.f5530cT.m1061u();
                try {
                    u.reset();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f5474bt.m3935a(u, z2);
            } else {
                this.f5474bt.m3930a(m720ab(), z2);
            }
            if (!this.f5474bt.f743P) {
                m683d("map did not load, returning");
                this.f5590br = false;
                return;
            }
            this.f5471bl = this.f5479by.teamUnitCapSinglePlayer;
            if (this.f5471bl < 1) {
                this.f5471bl = 1;
            }
            this.f5470bk = this.f5471bl;
            this.f5474bt.f778C = false;
            if (!z2) {
                C0368l.m2915D();
            }
            if (!this.f5486bF.f4734z && !this.f5490bJ.m1983h()) {
                this.f5486bF.f4763aH.f4817h = 1.0f;
            }
            if (this.f5486bF.f4734z) {
                if (!this.f5486bF.f4735D) {
                    this.f5470bk = this.f5486bF.f4761aF;
                    this.f5471bl = this.f5486bF.f4762aG;
                }
                AbstractC0789l.m683d("Unit cap is now: " + this.f5471bl);
                if (this.f5486bF.f4763aH.f4813d == 0) {
                    this.f5474bt.f776A = false;
                    this.f5474bt.f777B = false;
                } else if (this.f5486bF.f4763aH.f4813d == 1) {
                    this.f5474bt.f776A = true;
                    this.f5474bt.f777B = false;
                } else if (this.f5486bF.f4763aH.f4813d == 2) {
                    this.f5474bt.f776A = true;
                    this.f5474bt.f777B = true;
                }
                this.f5474bt.f778C = this.f5486bF.f4763aH.f4814e;
                byte b = 10;
                if (this.f5486bF.f4763aH.f4814e) {
                    b = 10;
                }
                for (int i2 = 0; i2 < AbstractC0171m.f1275a; i2++) {
                    AbstractC0171m n = AbstractC0171m.m3688n(i2);
                    if (n != null) {
                        if (n.f1253C == null) {
                            AbstractC0789l.m683d("Fog null for team: " + n.f1230i);
                        } else {
                            for (int i3 = 0; i3 < this.f5474bt.f734y; i3++) {
                                for (int i4 = 0; i4 < this.f5474bt.f735z; i4++) {
                                    n.f1253C[i3][i4] = b;
                                }
                            }
                        }
                    }
                }
                int i5 = this.f5486bF.m1248i();
                for (int i6 = 0; i6 < AbstractC0171m.f1275a; i6++) {
                    AbstractC0171m n2 = AbstractC0171m.m3688n(i6);
                    if (n2 != null) {
                        n2.money = i5;
                        if (n2.f1239r) {
                            n2.f1240s = this.f5486bF.f4763aH.f4815f;
                        }
                        n2.f1249y = this.f5486bF.f4763aH.f4809k;
                        boolean z3 = false;
                        boolean z4 = false;
                        if (this.f5486bF.f4763aH.f4816g != 1) {
                            boolean z5 = true;
                            boolean z6 = true;
                            Float f = null;
                            Float f2 = null;
                            Float f3 = null;
                            Float f4 = null;
                            if (this.f5486bF.f4763aH.f4816g == 5 || this.f5486bF.f4763aH.f4816g == 4 || this.f5486bF.f4763aH.f4816g > 10) {
                                z6 = false;
                            }
                            if (this.f5486bF.f4763aH.f4816g == 5 || this.f5486bF.f4763aH.f4816g == 4 || this.f5486bF.f4763aH.f4816g == 3 || this.f5486bF.f4763aH.f4816g > 10) {
                                z5 = false;
                            }
                            if (this.f5486bF.f4763aH.f4816g == 9) {
                                z6 = false;
                                z5 = false;
                            }
                            Iterator it = AbstractC0210af.m3550bt().iterator();
                            while (it.hasNext()) {
                                AbstractC0210af afVar = (AbstractC0210af) it.next();
                                if ((afVar instanceof AbstractC0210af) && !afVar.f1520bz && afVar.f1441bB == n2) {
                                    if (afVar.f1516bt && !z3) {
                                        z3 = true;
                                        f = Float.valueOf(afVar.f5841dH);
                                        f2 = Float.valueOf(afVar.f5842dI);
                                        if (!z5) {
                                            afVar.m3557bU();
                                        }
                                    }
                                    if (afVar.f1517bu && !z4) {
                                        z4 = true;
                                        f3 = Float.valueOf(afVar.f5841dH);
                                        f4 = Float.valueOf(afVar.f5842dI);
                                        if (!z6) {
                                            afVar.m3557bU();
                                        }
                                    }
                                }
                            }
                            if (f == null) {
                                f = f3;
                                f2 = f4;
                            }
                            if (f == null) {
                                AbstractC0789l.m683d("placementLocation==null for team:" + n2.f1230i);
                            } else {
                                float floatValue = f.floatValue();
                                float floatValue2 = f2.floatValue();
                                if (this.f5486bF.f4763aH.f4816g == 2) {
                                    for (int i7 = 0; i7 <= 2; i7++) {
                                        if (i7 != 1) {
                                            AbstractC0210af a = EnumC0215ak.f1591h.mo3453a();
                                            a.mo3582a(n2);
                                            a.f5841dH = (floatValue - 50.0f) + (i7 * 50);
                                            a.f5842dI = floatValue2;
                                            AbstractC0171m.m3725c(a);
                                        }
                                    }
                                    for (int i8 = 0; i8 <= 2; i8++) {
                                        AbstractC0210af a2 = EnumC0215ak.f1606w.mo3453a();
                                        a2.mo3582a(n2);
                                        a2.f5841dH = (floatValue - 50.0f) + (i8 * 50);
                                        a2.f5842dI = floatValue2 + 50.0f;
                                        AbstractC0171m.m3725c(a2);
                                    }
                                } else if (this.f5486bF.f4763aH.f4816g == 3 || this.f5486bF.f4763aH.f4816g == 4) {
                                    for (int i9 = 0; i9 <= 2; i9++) {
                                        AbstractC0268al a3 = EnumC0215ak.m3470a("combatEngineer");
                                        if (a3 == null) {
                                            Hcat_Multiplaye.m1259f("Could not find: combatEngineer on network.setup.startingUnits==3");
                                        } else {
                                            AbstractC0210af a4 = a3.mo3453a();
                                            a4.mo3582a(n2);
                                            a4.f5841dH = (floatValue - 50.0f) + (i9 * 50);
                                            a4.f5842dI = floatValue2 + 50.0f;
                                            AbstractC0171m.m3725c(a4);
                                        }
                                    }
                                } else if (this.f5486bF.f4763aH.f4816g == 5) {
                                    AbstractC0268al a5 = EnumC0215ak.m3470a("experimentalSpider");
                                    if (a5 == null) {
                                        Hcat_Multiplaye.m1259f("Could not find: experimentalSpider on network.setup.startingUnits==5");
                                    } else {
                                        AbstractC0210af a6 = a5.mo3453a();
                                        a6.mo3582a(n2);
                                        a6.f5841dH = floatValue;
                                        a6.f5842dI = floatValue2;
                                        a6.f1444bL = 90.0f;
                                        a6.f5843dJ = 2.0f;
                                        a6.mo3532cK();
                                        AbstractC0171m.m3725c(a6);
                                    }
                                } else if (this.f5486bF.f4763aH.f4816g != 9 && this.f5486bF.f4763aH.f4816g > 10) {
                                    C0368l b2 = C0368l.m2888b(this.f5486bF.f4763aH.f4816g);
                                    if (b2 == null) {
                                        Hcat_Multiplaye.m1259f("Could not find starting unit on network.setup.startingUnits==" + this.f5486bF.f4763aH.f4816g);
                                    } else {
                                        AbstractC0210af a7 = b2.mo3453a();
                                        a7.mo3582a(n2);
                                        a7.f5841dH = floatValue;
                                        a7.f5842dI = floatValue2;
                                        if (!a7.mo2748bw()) {
                                            a7.f1444bL = 90.0f;
                                        }
                                        if (b2.f2706ex) {
                                            a7.mo3532cK();
                                            if (a7 instanceof C0367k) {
                                                ((C0367k) a7).m2946dj();
                                            }
                                        }
                                        AbstractC0171m.m3725c(a7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!z2 && (this.f5493bM == null || !this.f5493bM.f5385q)) {
                m746a(0.0f, 0.0f);
                int i10 = 0;
                int i11 = 0;
                boolean z7 = false;
                Iterator it2 = AbstractC0210af.f1473bj.iterator();
                while (it2.hasNext()) {
                    AbstractC0210af afVar2 = (AbstractC0210af) it2.next();
                    if (afVar2 instanceof C0209ae) {
                        i11++;
                    } else {
                        i10++;
                    }
                    if (afVar2.f1441bB == this.f5464bb && afVar2.f1517bu) {
                        m701b(afVar2.f5841dH, afVar2.f5842dI);
                        z7 = true;
                    }
                }
                if (!z7) {
                    Iterator it3 = AbstractC0210af.f1473bj.iterator();
                    while (it3.hasNext()) {
                        AbstractC0210af afVar3 = (AbstractC0210af) it3.next();
                        if (afVar3.f1441bB == this.f5464bb && !afVar3.mo1647t() && !afVar3.mo1649o_()) {
                            m701b(afVar3.f5841dH, afVar3.f5842dI);
                        }
                    }
                }
                m683d("there are " + i10 + " units on this map and " + i11 + " trees");
            }
            this.f1165F = C0581be.m1971c(this.f5574ah).m1972b(m720ab());
            this.f5483bC.m974a(this.f5474bt, z2);
            this.f5485bE.m1672a(this.f5474bt, z2);
            this.f5494bN.m1945a();
            this.f5484bD.m2157a();
            if (!z2) {
                C0569a.m2083a();
            }
            this.f5481bA.m1750a(z2);
            if (!z2) {
                this.f5481bA.m1692w();
                m3805at();
                if (this.f5465be) {
                    this.f5481bA.m1692w();
                }
            } else {
                this.f5481bA.m1692w();
            }
            this.f5491bK.m2547a(this.f5474bt);
            if (!z2) {
                this.f5476bv.m2103c();
            }
            this.f5487bG.m1970a();
            Iterator it4 = AbstractC0210af.f1473bj.iterator();
            while (it4.hasNext()) {
                AbstractC0210af afVar4 = (AbstractC0210af) it4.next();
                if (afVar4 instanceof AbstractC0515r) {
                    ((AbstractC0515r) afVar4).mo3540c(false);
                }
            }
            this.f1165F.f4020e = true;
            this.f1166G.m1977a(this.f5574ah);
            this.f5588bp = true;
            this.f5589bq = false;
            this.f5590br = false;
            if (sVar != EnumC0803s.f5651a && !this.f5479by.hasPlayedGameOrSeenHelp) {
                this.f5479by.hasPlayedGameOrSeenHelp = true;
                this.f5479by.save();
            }
            System.gc();
            if (!AbstractC0789l.f5556aF) {
                Log.m4299a("RustedWarfare", "getNativeHeapSize" + String.valueOf(Debug.getNativeHeapSize()));
                Log.m4299a("RustedWarfare", "getNativeHeapAllocatedSize" + String.valueOf(Debug.getNativeHeapAllocatedSize()));
                Log.m4299a("RustedWarfare", "getNativeHeapFreeSize" + String.valueOf(Debug.getNativeHeapFreeSize()));
                Log.m4299a("RustedWarfare", "Runtime.getRuntime().maxMemory()" + String.valueOf(Runtime.getRuntime().maxMemory()));
            }
            if (this.f5612cR != null) {
                this.f5612cR.m378a();
            }
            this.f1195J = 0.0f;
            if (this.f5486bF.f4735D && this.f5486bF.f4734z) {
                AbstractC0789l.m683d("Disabling network for singleplayer");
                this.f5486bF.f4734z = false;
            }
            if (!m708an()) {
                if (sVar == EnumC0803s.f5653c) {
                    AbstractC0789l.m683d("Not starting replay recording as we are loading a save");
                } else {
                    this.f5490bJ.m1995a(z2);
                }
            }
            if (C0734h.f5136j) {
            }
        } catch (C0154f e2) {
            e2.printStackTrace();
            m731a("Error loading map: " + e2.getMessage(), 1);
            if (f5555aE) {
                AbstractC0789l.m683d("Crashing on allowed map error because automated testing is active");
                throw new RuntimeException(e2);
            }
            if (!(this.f5486bF.f4734z || this.f5447aj == null || (k = this.f5447aj.mo211k()) == null)) {
                k.m4199k();
            }
            m678e("Map Load Warning", m725a(e2));
            this.f5590br = false;
        }
    }

    /* renamed from: at */
    private void m3805at() {
        this.f5481bA.m1692w();
        Iterator it = AbstractC0210af.f1473bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar.f1441bB == this.f5464bb && (afVar instanceof AbstractC0515r) && afVar.mo3569ai() && afVar.mo2634j() && afVar.m3562bG() && !afVar.mo1649o_() && !afVar.mo1647t()) {
                AbstractC0789l.m683d("selectAnyOnScreenBuilder: found builder");
                this.f5481bA.m1713j(afVar);
                return;
            }
        }
        AbstractC0789l.m683d("selectAnyOnScreenBuilder: no builder found");
    }

    /* renamed from: b */
    public void m3802b(boolean z) {
        synchronized (this.f1189x) {
            if (this.f5447aj != null) {
                this.f5447aj.mo208n();
            }
            this.f5582ba = false;
            if (!z) {
                this.f5490bJ.m1985f();
            }
            this.f5483bC.m956c();
            C0838o dp = AbstractC0854w.m394dp();
            Iterator it = dp.iterator();
            while (it.hasNext()) {
                ((AbstractC0854w) it.next()).mo2087a();
            }
            AbstractC0210af.m3550bt();
            AbstractC0854w.m394dp();
            int size = dp.size();
            if (size != 0) {
                AbstractC0789l.m695b("SHOULD_NOT_HAPPEN: we still had " + size + " objects in gameObjectListForLogic after removeAll");
            }
            this.f1201U.clear();
            if (!m710al()) {
                this.f5476bv.m2099f();
            }
            this.f5480bz.m2048a(z);
            if (this.f5474bt != null) {
                this.f5474bt.m3905e();
                this.f5474bt = null;
            }
            if (this.f5493bM != null) {
                this.f5493bM = null;
            }
            if (this.f5491bK != null) {
                this.f5491bK.m2545b();
            }
            this.f1175ac = null;
            this.f1176ad = null;
            this.f1182l = 0;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: a */
    public void mo744a(float f, int i) {
        synchronized (this.f1189x) {
            mo700b(f, i);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: b */
    public void mo700b(float f, int i) {
        RunnableC0168j jVar;
        if (this.f5585bg == 2) {
            m703as();
        } else if (this.f5585bg % 10000 == 0 && this.f5585bg != 0) {
            m703as();
        }
        m704ar();
        this.f5634dH.m627a();
        this.f5635dI.m625b();
        this.f5492bL.m1958a(EnumC0588bk.f4047a);
        this.f5447aj = this.f5448ak;
        if (this.f5447aj.mo221b()) {
            this.f5492bL.m1958a(EnumC0588bk.f4048b);
            while (this.f1183m.peek() != null) {
                ((Runnable) this.f1183m.poll()).run();
            }
            if (this.f5588bp) {
                this.f5582ba = true;
                float f2 = this.f5600cC * this.f5603cF;
                if (f2 != this.f5602cE) {
                    float f3 = (this.f5527cH / this.f5602cE) + this.f5510cf;
                    float f4 = (this.f5528cI / this.f5602cE) + this.f5511cg;
                    this.f5602cE = f2;
                    m3794g();
                    if (this.f5526cG) {
                        m746a(this.f5510cf - (((this.f5527cH / this.f5602cE) + this.f5510cf) - f3), this.f5511cg - (((this.f5528cI / this.f5602cE) + this.f5511cg) - f4));
                        this.f5526cG = false;
                    }
                }
                if (!(this.f5503bY == 0.0f && this.f5504bZ == 0.0f)) {
                    float f5 = 3.0f * f;
                    float f6 = 0.0f;
                    if (this.f5503bY > 0.0f) {
                        f6 = C0654f.m1469g(this.f5503bY, f5);
                    }
                    if (this.f5503bY < 0.0f) {
                        f6 = C0654f.m1475f(this.f5503bY, -f5);
                    }
                    float f7 = f6 + (0.15f * this.f5503bY);
                    float f8 = 0.0f;
                    if (this.f5504bZ > 0.0f) {
                        f8 = C0654f.m1469g(this.f5504bZ, f5);
                    }
                    if (this.f5504bZ < 0.0f) {
                        f8 = C0654f.m1475f(this.f5504bZ, -f5);
                    }
                    float f9 = f8 + (0.15f * this.f5504bZ);
                    if (C0654f.m1500c(this.f5503bY) <= f5) {
                        f7 = this.f5503bY;
                        this.f5503bY = 0.0f;
                    } else {
                        this.f5503bY -= f7;
                    }
                    if (C0654f.m1500c(this.f5504bZ) <= f5) {
                        f9 = this.f5504bZ;
                        this.f5504bZ = 0.0f;
                    } else {
                        this.f5504bZ -= f9;
                    }
                    this.f5510cf += f7;
                    this.f5511cg += f9;
                    m746a(this.f5510cf, this.f5511cg);
                    m764J();
                }
                if (this.f5522cy != this.f5523cz) {
                    m3794g();
                }
                if (f > 3.0f) {
                    f = 3.0f;
                }
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (this.f5584bd >= 0.0f) {
                    f = this.f5584bd;
                }
                this.f5469bj = (int) (this.f5469bj + (f * 16.666666f));
                m3798d(f);
                this.f1184s += i;
                this.f1185t++;
                if (this.f1185t >= 40) {
                    if (this.f1184s == 0) {
                        this.f1184s = 1;
                    }
                    this.f1186u = (int) (((this.f1185t * 1000) / this.f1184s) + 0.5f);
                    this.f1187v = this.f1184s / this.f1185t;
                    this.f1184s = 0;
                    this.f1185t = 0;
                    if (this.f5479by.showFps) {
                        this.f1188w = this.f1186u + "fps";
                    }
                }
                m721aa();
                for (int i2 = 0; i2 < this.f5628dt.length; i2++) {
                    this.f5628dt[i2] = true;
                }
                this.f5609cO = C0654f.m1563a(this.f5609cO, 0.1f * f);
                this.f5610cP = C0654f.m1563a(this.f5610cP, 0.1f * f);
                this.f5609cO = C0654f.m1517b(this.f5609cO, 5.0f);
                this.f5610cP = C0654f.m1517b(this.f5610cP, 5.0f);
                this.f5481bA.m1796a(f);
                m764J();
                C0148b.m3916c();
                if (this.f5486bF.f4734z) {
                    float f10 = f;
                    if (this.f5490bJ.f3982t != 1) {
                        f10 *= this.f5490bJ.f3982t;
                    }
                    this.f5486bF.m1364a(f10);
                    if (!mo724a(true) && !this.f5486bF.f4677S) {
                        this.f1195J += f10;
                        while (true) {
                            if (this.f1195J <= this.f5486bF.m1365a()) {
                                break;
                            } else if (this.f5486bF.m1389C()) {
                                this.f5486bF.f4677S = true;
                                break;
                            } else {
                                this.f1195J -= this.f5486bF.m1365a();
                                this.f5486bF.m1362a(this.f5486bF.m1365a(), false);
                                if (this.f5486bF.f4677S) {
                                    break;
                                }
                                m3811a(this.f5486bF.m1365a());
                            }
                        }
                        if (!this.f5486bF.f4664A) {
                            if (this.f5486bF.f4684Z || this.f5486bF.f4682X) {
                                if (this.f5486bF.f4684Z && this.f5486bF.f4682X && this.f5585bg < (this.f5486bF.f4740R - this.f5486bF.f4674N) - 5) {
                                    this.f5486bF.m1282c("nearly within frame range");
                                    this.f5486bF.f4684Z = false;
                                }
                                if (this.f5585bg > this.f5486bF.f4740R - 6) {
                                    this.f5486bF.m1282c("we have back within frame range");
                                    this.f5486bF.f4684Z = false;
                                    this.f5486bF.f4682X = false;
                                }
                            }
                            if (!this.f5486bF.f4682X && this.f5585bg < (this.f5486bF.f4740R - this.f5486bF.f4674N) - 10) {
                                this.f5486bF.m1282c("we are slightly out of frame range, speeding up");
                                this.f5486bF.f4682X = true;
                            }
                            if (!this.f5486bF.f4684Z && this.f5585bg < (this.f5486bF.f4740R - this.f5486bF.f4674N) - 30) {
                                this.f5486bF.m1282c("we are out of frame range, fast forwarding");
                                this.f5486bF.f4684Z = true;
                            }
                            if (!this.f5486bF.f4684Z && this.f5486bF.f4682X) {
                                this.f5486bF.f4683Y += f;
                                if (this.f5486bF.f4683Y > this.f5486bF.m1365a() * 3.0f) {
                                    this.f5486bF.f4683Y = 0.0f;
                                    this.f5486bF.m1362a(this.f5486bF.m1365a(), true);
                                    if (!this.f5486bF.f4677S) {
                                        m3811a(this.f5486bF.m1365a());
                                    }
                                }
                            }
                            if (this.f5486bF.f4684Z) {
                                this.f5486bF.m1362a(this.f5486bF.m1365a(), true);
                                if (!this.f5486bF.f4677S) {
                                    m3811a(this.f5486bF.m1365a());
                                }
                            }
                            if (this.f5585bg < this.f5486bF.f4740R - 90) {
                                this.f5486bF.m1362a(this.f5486bF.m1365a(), true);
                                if (!this.f5486bF.f4677S) {
                                    m3811a(this.f5486bF.m1365a());
                                }
                            }
                            if (this.f5585bg < this.f5486bF.f4740R - 120) {
                                this.f5486bF.m1362a(this.f5486bF.m1365a(), true);
                                if (!this.f5486bF.f4677S) {
                                    m3811a(this.f5486bF.m1365a());
                                }
                            }
                            if (this.f5585bg < this.f5486bF.f4740R - 600) {
                                this.f5486bF.m1362a(this.f5486bF.m1365a(), true);
                                if (!this.f5486bF.f4677S) {
                                    m3811a(this.f5486bF.m1365a());
                                }
                            }
                        }
                    }
                } else if (this.f5490bJ.m1984g()) {
                    float f11 = f;
                    if (this.f5490bJ.f3982t != 1) {
                        f11 *= this.f5490bJ.f3982t;
                    }
                    if (this.f5583bc != 1.0f) {
                        f11 *= this.f5583bc;
                    }
                    if (!mo724a(false)) {
                        this.f1195J += f11;
                        while (this.f1195J > this.f5486bF.m1365a()) {
                            this.f1195J -= this.f5486bF.m1365a();
                            if (this.f5486bF.m1389C()) {
                                break;
                            }
                            m3811a(this.f5486bF.m1365a());
                        }
                    }
                    if (this.f1195J > 100.0f) {
                        this.f1195J = 100.0f;
                    }
                    if (this.f1195J < 0.0f) {
                        this.f1195J = 0.0f;
                    }
                } else if (!mo724a(false)) {
                    m3811a(f);
                }
                if (mo724a(false)) {
                    try {
                        Thread.sleep(2L);
                    } catch (Exception e) {
                    }
                }
                this.f5483bC.m976a(f);
                this.f5475bu.m2161b(f);
                this.f5476bv.m2112a(f);
                this.f5482bB.m2135b();
                C0796a.m645a().mo644a(f);
                this.f5492bL.m1953b(EnumC0588bk.f4048b);
                this.f5492bL.m1958a(EnumC0588bk.f4049c);
                if (!this.f5618dc) {
                    if (this.f5477bw.mo202a()) {
                        m3806a((AbstractC0751h) null, f);
                    } else if (this.f5447aj.mo206p()) {
                        m3806a(this.f5447aj.mo222a(true), f);
                    } else {
                        AbstractC0068d dVar = this.f5447aj;
                        this.f5447aj.mo224a(f, i);
                        if (dVar.mo219c() && !dVar.mo217e()) {
                            synchronized (dVar.mo215g()) {
                                if (dVar.mo219c() && !dVar.mo217e()) {
                                    this.f5492bL.m1958a(EnumC0588bk.f4069w);
                                    AbstractC0751h a = dVar.mo222a(true);
                                    this.f5492bL.m1953b(EnumC0588bk.f4069w);
                                    if (!dVar.mo217e()) {
                                        if (a != null) {
                                            if (a.mo865c()) {
                                                AbstractC0789l.m683d("gameengine draw: bufferedCanvas drawn on");
                                            }
                                            a.mo869a(true);
                                        }
                                        if (a == null) {
                                            AbstractC0789l.m679e("GameEngine gameViewCanvas is null after lockCanvas - " + dVar.hashCode());
                                        }
                                        if (this.f5581aY) {
                                            if (this.f1154g == null) {
                                                m694b("recorder", "Now recording at:" + this.f5447aj.mo214h() + "," + this.f5447aj.mo213i());
                                                for (int i3 = 0; i3 < this.f1180h.length; i3++) {
                                                    this.f1180h[i3] = new RunnableC0168j(this);
                                                    this.f1180h[i3].f1208a = Bitmap.m4514a(this.f5447aj.mo214h(), this.f5447aj.mo213i(), Bitmap.Config.f144b);
                                                    this.f1180h[i3].f1208a.m4518a(0);
                                                }
                                                this.f1154g = new C0750g(new Canvas());
                                                this.f1155i = 0;
                                                this.f1156j = "/sdcard/rustedWarfare_recordings/" + System.currentTimeMillis() + "/";
                                                new File(this.f1156j).mkdirs();
                                            }
                                            long currentTimeMillis = System.currentTimeMillis();
                                            RunnableC0168j jVar2 = this.f1180h[this.f1155i];
                                            if (jVar2.f1211d != null && jVar2.f1211d.isAlive()) {
                                                jVar2.f1211d.setPriority(10);
                                            }
                                            jVar2.m3791a();
                                            m694b("screenshot", "bitmapFree took:" + (System.currentTimeMillis() - currentTimeMillis));
                                            this.f1154g.mo880a(this.f1180h[this.f1155i].f1208a);
                                            a = this.f1154g;
                                        } else {
                                            this.f1154g = null;
                                        }
                                        m3806a(a, f);
                                        if (this.f5581aY && (jVar = this.f1180h[this.f1155i]) != null) {
                                            jVar.f1209b = this.f5585bg;
                                            jVar.f1211d = new Thread(jVar);
                                            jVar.f1211d.start();
                                            a.mo879a(jVar.f1208a, 0.0f, 0.0f, (Paint) null);
                                            this.f1155i++;
                                            if (this.f1155i >= this.f1180h.length) {
                                                this.f1155i = 0;
                                            }
                                        }
                                        this.f5477bw.mo166a((AbstractC0751h) null);
                                    }
                                    if (a != null) {
                                        try {
                                            dVar.mo223a(a, true);
                                        } catch (IllegalArgumentException e2) {
                                            e2.printStackTrace();
                                            AbstractC0789l.m679e("GameEngine catch currentGameView - " + dVar.hashCode());
                                            AbstractC0789l.m679e("GameEngine catch currentGameView.gameThreadSync - " + dVar.mo215g().hashCode());
                                            dVar.mo212j();
                                        } catch (IllegalStateException e3) {
                                            e3.printStackTrace();
                                            AbstractC0789l.m679e("GameEngine catch currentGameView - " + dVar.hashCode());
                                            AbstractC0789l.m679e("GameEngine catch currentGameView.gameThreadSync - " + dVar.mo215g().hashCode());
                                        }
                                    }
                                }
                            }
                        }
                        this.f5447aj.mo220b(f, i);
                    }
                }
                this.f5618dc = false;
                m756R();
                this.f5492bL.m1953b(EnumC0588bk.f4049c);
                if (this.f5617db) {
                    this.f5617db = false;
                    String str = null;
                    if (m661k(this.f5529cS) != null) {
                        str = m659l(this.f5529cS);
                    }
                    if (this.f5486bF.f4734z) {
                        str = null;
                        new C0167a().start();
                    }
                    if (str != null) {
                        AbstractC0789l.m683d("gotoNextLevel: Loading next level: " + str);
                        this.f5529cS = str;
                        this.f5481bA.f4278e.m1684b();
                        mo722a(true, false, EnumC0803s.f5652b);
                    } else {
                        AbstractC0789l.m683d("gotoNextLevel: No next level, finishing");
                        this.f5588bp = false;
                        ActivityC0069e k = this.f5447aj.mo211k();
                        if (k != null) {
                            k.mo4165b();
                            k.m4199k();
                        } else {
                            AbstractC0789l.m683d("gotoNextLevel: Error getInGameActivity==null");
                        }
                    }
                }
                if (!this.f5449al && this.f5586bn && !this.f1181k) {
                    m683d("starting method trace");
                    Debug.startMethodTracing("lukeTrace", 110000000);
                    this.f1181k = true;
                }
                this.f5587bo = true;
                this.f5636dJ.m627a();
                this.f5492bL.m1953b(EnumC0588bk.f4047a);
                this.f5492bL.m1955b();
            } else if (!this.f5449al) {
                Log.m4292d("RustedWarfare", "game running without a loaded level!!!");
                m3796e();
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.game.i$a */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/i$a.class */
    class C0167a extends Thread {
        C0167a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C0166i.this.f5486bF.m1293b("gotoNextLevel");
        }
    }

    /* renamed from: e */
    public void m3796e() {
        ActivityC0069e k = this.f5447aj.mo211k();
        if (k == null) {
            AbstractC0789l.m695b("stopAndClose: Error getInGameActivity==null");
        } else if (!k.m4544c()) {
            k.mo4165b();
        } else {
            AbstractC0789l.m695b("stopAndClose: inGameActivity is isFinishing");
        }
    }

    /* renamed from: a */
    public void m3811a(float f) {
        if (m707ao() && f < 0.1f) {
            Hcat_Multiplaye.m1259f("updateAllGame1: deltaSpeed:" + f + " frame:" + this.f5585bg + " network.currentStepRate:" + this.f5486bF.m1365a());
        }
        if (this.f5583bc != 1.0f && !this.f5486bF.f4734z && !this.f5490bJ.m1984g()) {
            f *= this.f5583bc;
        }
        float f2 = f * this.f1196K;
        this.f1168L = f2 + 2.0f;
        this.f1169M = f2;
        this.f5486bF.m1302b(f2);
        this.f5467bh = (int) (this.f5467bh + (f2 * 16.666666f));
        this.f5494bN.m1941c();
        this.f5490bJ.m2005a(f2);
        this.f5585bg++;
        AbstractC0171m.m3718d(f2);
        if (this.f5474bt != null) {
            this.f5474bt.m3904e(f2);
        }
        if (m707ao() && f2 < 0.1f) {
            Hcat_Multiplaye.m1259f("updateAllGame2: deltaSpeed:" + f2 + " frame:" + this.f5585bg);
        }
        AbstractC0210af.m3550bt();
        C0838o dp = AbstractC0854w.m394dp();
        Object[] b = dp.m477b();
        int size = dp.size();
        boolean ao = m707ao();
        for (int i = 0; i < size; i++) {
            AbstractC0854w wVar = (AbstractC0854w) b[i];
            if (ao && f2 != this.f1169M) {
                Hcat_Multiplaye.m1253g("JIT bug detected, attempting to correct. before object:" + wVar.f5835dA + " frame:" + this.f5585bg + " deltaSpeed:" + f2);
                f2 = this.f1169M;
            }
            wVar.mo1653a(f2);
        }
        if (m707ao() && f2 < 0.1f) {
            Hcat_Multiplaye.m1259f("updateAllGame3: deltaSpeed:" + f2 + " frame:" + this.f5585bg);
        }
        int size2 = dp.f5785a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0842r rVar = (C0842r) dp.f5785a.get(i2);
            if (rVar.f5795a == EnumC0841q.f5792a) {
                AbstractC0854w wVar2 = (AbstractC0854w) rVar.f5796b;
                if (!wVar2.f5836dC) {
                    wVar2.mo1653a(f2);
                }
            }
        }
        this.f5492bL.m1958a(EnumC0588bk.f4059m);
        this.f5491bK.m2553a();
        this.f5492bL.m1953b(EnumC0588bk.f4059m);
        AbstractC0515r.m2226g(f2);
        C0367k.m3043a(f2, 0);
        this.f1182l++;
        if (this.f1182l >= 1000) {
            this.f1182l = 0;
            int i3 = 0;
            Iterator it = AbstractC0210af.m3550bt().iterator();
            while (it.hasNext()) {
                AbstractC0210af afVar = (AbstractC0210af) it.next();
                if (afVar.f1520bz && !(afVar instanceof C0209ae)) {
                    i3++;
                }
            }
            if (i3 > 70) {
                Iterator it2 = AbstractC0210af.m3550bt().iterator();
                while (it2.hasNext()) {
                    AbstractC0210af afVar2 = (AbstractC0210af) it2.next();
                    if ((afVar2 instanceof AbstractC0210af) && afVar2.f1520bz && !(afVar2 instanceof C0209ae) && afVar2.f1521bA < this.f5467bh - 30000 && i3 > 70) {
                        afVar2.mo2087a();
                        i3--;
                    }
                }
            }
        }
        this.f5492bL.m1958a(EnumC0588bk.f4058l);
        AbstractC0171m.m3729c(f2);
        this.f5492bL.m1953b(EnumC0588bk.f4058l);
        C0569a.m2082a(f2);
        this.f5480bz.m2067a(f2);
        this.f1194H.m2071a(f2);
        C0851y.m437a(f2);
        if (this.f5493bM != null) {
            this.f5493bM.m794c(f2);
        }
        this.f5492bL.m1958a(EnumC0588bk.f4061o);
        this.f5484bD.m2156a(f2);
        this.f5492bL.m1953b(EnumC0588bk.f4061o);
        this.f5492bL.m1958a(EnumC0588bk.f4060n);
        this.f5485bE.m1679a(f2);
        this.f5492bL.m1953b(EnumC0588bk.f4060n);
        this.f5483bC.m961b(f2);
    }

    /* renamed from: a */
    public void m3806a(AbstractC0751h hVar, float f) {
        synchronized (this.f1190y) {
            m3803b(hVar, f);
        }
    }

    /* renamed from: b */
    public void m3803b(AbstractC0751h hVar, float f) {
        if (hVar == null) {
            m694b("drawAll", "canvas is null, not may not be available yet");
        } else if (!f5454av) {
            this.f5477bw.mo166a(hVar);
            this.f5477bw.mo178a(this.f5447aj.mo218d());
            this.f5477bw.mo129f();
            this.f5468bi++;
            C0749f.f5258v = 0.0f;
            float f2 = this.f5592bU;
            if (f2 != 1.0f) {
                this.f5477bw.mo127h();
                this.f5477bw.mo200a(f2, f2);
            }
            if (this.f5617db) {
                this.f5477bw.mo146b(Color.m4473a(0, 0, 0));
                this.f5477bw.mo158a("Loading..", this.f5500bV, this.f5501bW, this.f5533cW);
                return;
            }
            this.f5492bL.m1958a(EnumC0588bk.f4050d);
            m3800c(hVar, f);
            this.f5492bL.m1953b(EnumC0588bk.f4050d);
            if (!m652t()) {
                this.f5492bL.m1958a(EnumC0588bk.f4052f);
                m3797d(hVar, f);
                this.f5492bL.m1953b(EnumC0588bk.f4052f);
            }
            if (this.f5479by.showFps && this.f5524cA == 0.0f && !this.f5525cB) {
                this.f5477bw.mo158a(this.f1188w, 100.0f, 35.0f, this.f1158o);
            }
            if (f1153f != null) {
                this.f5477bw.mo158a(f1153f, 100.0f, 85.0f, this.f1158o);
            }
            if (!this.f5449al && (this.f5477bw.mo136c() != null || AbstractC0789l.f5557aG)) {
                this.f5481bA.m1734c(f);
            }
            this.f5477bw.mo128g();
            if (f2 != 1.0f) {
                hVar.mo888a();
            }
        }
    }

    /* renamed from: f */
    public boolean m3795f() {
        if (!this.f5479by.showUnitIcons) {
            return false;
        }
        if (this.f5602cE >= 0.7d || this.f5516cl < this.f5474bt.m3901f() - 5.0f || this.f5513ci < this.f5474bt.m3898g() - 5.0f) {
            return m650v() ? ((double) this.f5602cE) < 0.1d : m710al() ? ((double) this.f5602cE) < 0.27d : ((double) this.f5602cE) < 0.4d;
        }
        return true;
    }

    /* renamed from: b */
    public void m3804b(float f) {
        boolean z = false;
        if (this.f5599cx.f227a < 0 || this.f5599cx.f228b < 0 || this.f5599cx.f229c > this.f5474bt.m3901f() || this.f5599cx.f230d > this.f5474bt.m3898g()) {
            z = true;
        }
        if (z) {
            this.f5477bw.mo146b(Color.m4473a(0, 0, 0));
        }
    }

    /* renamed from: c */
    public void m3801c(float f) {
    }

    /* renamed from: c */
    public void m3800c(AbstractC0751h hVar, float f) {
        if (this.f5588bp) {
            this.f5492bL.m1958a(EnumC0588bk.f4054h);
            this.f1201U.m466b();
            this.f5534dd = 0;
            AbstractC0854w[] a = AbstractC0210af.f5846dK.m472a();
            int size = AbstractC0854w.f5846dK.size();
            for (int i = 0; i < size; i++) {
                AbstractC0854w wVar = a[i];
                wVar.f5838dE = wVar.mo2018a(this);
                if (wVar.f5838dE) {
                    this.f1201U.m467a(wVar);
                }
            }
            this.f5492bL.m1953b(EnumC0588bk.f4054h);
            this.f5492bL.m1958a(EnumC0588bk.f4055i);
            if (!m3795f()) {
                Collections.sort(this.f1201U, AbstractC0854w.f5844dB);
            }
            this.f5492bL.m1953b(EnumC0588bk.f4055i);
            this.f5492bL.m1958a(EnumC0588bk.f4063q);
            this.f5492bL.m1958a(EnumC0588bk.f4065s);
            this.f5477bw.mo127h();
            this.f5477bw.mo182a(this.f5593cr);
            this.f5492bL.m1953b(EnumC0588bk.f4065s);
            this.f5492bL.m1958a(EnumC0588bk.f4064r);
            m3804b(f);
            this.f5492bL.m1953b(EnumC0588bk.f4064r);
            if (this.f5479by.renderFancyWater) {
                if (this.f1170N == null) {
                    this.f1170N = this.f5477bw.mo194a(C0063R.drawable.water_cloud);
                }
                if (this.f1171O == null) {
                    this.f1171O = this.f5477bw.mo194a(C0063R.drawable.water_layer1);
                }
                if (this.f1172P == null) {
                    this.f1172P = this.f5477bw.mo194a(C0063R.drawable.water_layer2);
                }
                this.f1198R.m4394a(this.f5593cr);
                this.f1197Q += 0.05f * f;
                if (this.f1197Q > 100.0f) {
                    this.f1197Q -= 100.0f;
                }
                this.f5477bw.mo171a(this.f1170N, this.f1198R, (Paint) null, this.f5506cb / 6, this.f5507cc / 6, 1, 1);
                this.f1198R.m4394a(this.f5594cs);
                this.f1199S.m4380a(this.f5594cs);
                this.f5477bw.mo127h();
                m763K();
                this.f5477bw.mo168a(this.f1172P, this.f1199S, (Paint) null, this.f5506cb + this.f1197Q, this.f5507cc + this.f1197Q, 0, 0);
                this.f5477bw.mo168a(this.f1171O, this.f1199S, (Paint) null, this.f5506cb, this.f5507cc, 0, 0);
                this.f5477bw.mo126i();
            }
            this.f5492bL.m1958a(EnumC0588bk.f4066t);
            if (this.f5474bt != null && m714ah()) {
                this.f5474bt.m3909d(f);
            }
            this.f5492bL.m1953b(EnumC0588bk.f4066t);
            m763K();
            this.f5477bw.mo182a(this.f5594cs);
            boolean f2 = m3795f();
            this.f5483bC.m955c(f);
            this.f5492bL.m1953b(EnumC0588bk.f4063q);
            AbstractC0854w[] a2 = this.f1201U.m472a();
            int size2 = this.f1201U.size();
            this.f5604cJ = true;
            this.f5605cK = true;
            this.f5606cL = true;
            this.f5607cM = true;
            this.f5608cN = true;
            if (this.f5602cE < 0.45d) {
                this.f5606cL = false;
                this.f5604cJ = false;
                this.f5608cN = false;
            }
            if (this.f5602cE < 0.3d) {
                this.f5607cM = false;
                this.f5605cK = false;
            }
            if (!f2) {
                for (int i2 = 0; i2 < size2; i2++) {
                    AbstractC0854w wVar2 = a2[i2];
                    if (wVar2.f5839dF == 0) {
                        wVar2.mo2013c(f);
                    }
                }
            }
            C0569a.m2075b(f);
            this.f5492bL.m1958a(EnumC0588bk.f4053g);
            this.f5480bz.m2055a(f, 1);
            this.f5492bL.m1953b(EnumC0588bk.f4053g);
            this.f5492bL.m1958a(EnumC0588bk.f4062p);
            if (f2) {
                if (this.f5481bA.m1702p() == 0) {
                    AbstractC0210af.f1478bn.m4448a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8);
                    AbstractC0210af.f1479bo.m4448a(255, 255, 255, 255);
                } else {
                    AbstractC0210af.f1478bn.m4448a(175, 175, 175, 175);
                    AbstractC0210af.f1479bo.m4448a(255, 255, 255, 255);
                }
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC0854w wVar3 = a2[i3];
                    if (!wVar3.mo2010f(f)) {
                        wVar3.mo2013c(f);
                    }
                }
                for (int i4 = 0; i4 < size2; i4++) {
                    AbstractC0854w wVar4 = a2[i4];
                    wVar4.mo2021a(f, true);
                    wVar4.mo3494o(f);
                }
            } else {
                for (int i5 = 0; i5 < size2; i5++) {
                    a2[i5].mo2012d(f);
                }
                for (int i6 = 0; i6 < size; i6++) {
                    AbstractC0854w wVar5 = a[i6];
                    if (!wVar5.f5838dE) {
                        if (wVar5 instanceof AbstractC0210af) {
                            AbstractC0210af afVar = (AbstractC0210af) wVar5;
                            if (afVar.f1460ci) {
                                if (afVar.f1441bB != this.f5464bb && !afVar.m3560bR()) {
                                }
                            }
                        }
                    }
                    wVar5.mo2011e(f);
                    if (!wVar5.f5838dE) {
                        wVar5.mo3494o(f);
                    }
                }
                for (int i7 = 0; i7 < size2; i7++) {
                    AbstractC0854w wVar6 = a2[i7];
                    if (!(wVar6.f5839dF == 0 || wVar6.f5839dF == 10)) {
                        wVar6.mo2013c(f);
                    }
                }
                for (int i8 = 0; i8 < size2; i8++) {
                    AbstractC0854w wVar7 = a2[i8];
                    wVar7.mo2021a(f, false);
                    wVar7.mo3494o(f);
                }
                AbstractC0171m.m3709e(f);
            }
            this.f5606cL = true;
            this.f5607cM = true;
            this.f5492bL.m1953b(EnumC0588bk.f4062p);
            this.f5492bL.m1958a(EnumC0588bk.f4053g);
            this.f5480bz.m2055a(f, 2);
            this.f5492bL.m1953b(EnumC0588bk.f4053g);
            for (int i9 = 0; i9 < size2; i9++) {
                AbstractC0854w wVar8 = a2[i9];
                if (wVar8.f5839dF == 10) {
                    wVar8.mo2013c(f);
                }
            }
            this.f1194H.m2069b(f);
            if (this.f5493bM != null) {
                this.f5493bM.m810a(f);
            }
            m3801c(f);
            C0851y.m415b(f);
            this.f5491bK.m2541c(f);
            this.f5492bL.m1958a(EnumC0588bk.f4051e);
            this.f5477bw.mo126i();
            this.f5492bL.m1953b(EnumC0588bk.f4051e);
        }
    }

    /* renamed from: d */
    public void m3797d(AbstractC0751h hVar, float f) {
        this.f5481bA.m1746b(f);
        if (this.f5493bM != null) {
            this.f5493bM.m798b(f);
        }
        this.f5485bE.m1659e(f);
        this.f5480bz.m2045b(f);
        if (this.f5479by.showFps && this.f5524cA == 0.0f) {
            this.f5492bL.m1952c();
        }
        if (this.f5591bO) {
            this.f5477bw.mo158a("Look Mode", this.f5500bV, this.f5501bW, this.f5533cW);
        }
        if (this.f5579aW) {
            int i = 20;
            for (int i2 = 0; i2 < AbstractC0171m.f1275a; i2++) {
                AbstractC0171m n = AbstractC0171m.m3688n(i2);
                if (n != null && (n instanceof C0118a)) {
                    C0118a aVar = (C0118a) n;
                    this.f5477bw.mo158a(aVar.f1230i + "| c:" + aVar.money, 20.0f, i, this.f5531cU);
                    i += 20;
                }
            }
        }
    }

    /* renamed from: g */
    public void m3794g() {
        this.f5496bQ = m759O();
        m758P();
        this.f5500bV = this.f5498bS / 2.0f;
        this.f5501bW = this.f5499bT / 2.0f;
        this.f5502bX = (int) (this.f5499bT / 3.0f);
        float f = (int) (this.f5498bS / 3.0f);
        if (this.f5502bX > f) {
            this.f5502bX = f;
        }
        this.f5502bX = C0654f.m1516b(this.f5502bX, 60.0f, (int) (250.0f * this.f5496bQ));
        float f2 = this.f5510cf + this.f5520cp;
        float f3 = this.f5511cg + this.f5521cq;
        if (this.f5523cz) {
            this.f5517cm = this.f5498bS;
            this.f5518cn = this.f5498bS;
        } else {
            this.f5518cn = (this.f5498bS - this.f5502bX) + 1.0f;
            if (C0623f.f4350bw) {
                this.f5517cm = this.f5498bS;
            } else {
                this.f5517cm = this.f5518cn;
            }
        }
        if (this.f5517cm < 1.0f) {
            this.f5517cm = 1.0f;
        }
        if (this.f5518cn < 1.0f) {
            this.f5518cn = 1.0f;
        }
        if (this.f5522cy != this.f5523cz) {
            if (!this.f5523cz) {
                f2 -= (this.f5502bX / 2.0f) / this.f5602cE;
            } else {
                f2 += (this.f5502bX / 2.0f) / this.f5602cE;
            }
        }
        this.f5522cy = this.f5523cz;
        this.f5519co = this.f5499bT;
        this.f5512ch = this.f5517cm / this.f5602cE;
        this.f5513ci = this.f5519co / this.f5602cE;
        this.f5516cl = this.f5518cn / this.f5602cE;
        this.f5520cp = this.f5512ch / 2.0f;
        this.f5521cq = this.f5513ci / 2.0f;
        this.f5593cr.m4395a(0, 0, (int) this.f5517cm, (int) this.f5519co);
        this.f5594cs.m4395a(0, 0, ((int) this.f5512ch) + 1, ((int) this.f5513ci) + 1);
        this.f5595ct.m4381a(0.0f, 0.0f, this.f5512ch + 1.0f, this.f5513ci + 1.0f);
        m746a(f2 - this.f5520cp, f3 - this.f5521cq);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: b */
    public void mo698b(int i, int i2) {
        m3808a(i, i2, 1.0f);
    }

    /* renamed from: a */
    public void m3808a(int i, int i2, float f) {
        this.f5498bS = i;
        this.f5499bT = i2;
        this.f5592bU = f;
        m3794g();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: h */
    public String mo672h() {
        if (AbstractC0789l.f5558aH) {
            return "com.corrodinggames.rts.java";
        }
        if (AbstractC0789l.f5559aI) {
            return "com.corrodinggames.rts.gdx";
        }
        if (f5556aF) {
            return "com.corrodinggames.rts.server";
        }
        if (this.f5574ah == null) {
            return "<null context>";
        }
        return this.f5574ah.mo4532h();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: i */
    public String mo669i() {
        if (AbstractC0789l.f5558aH) {
            return "java";
        }
        if (AbstractC0789l.f5559aI) {
            return "java-gdx";
        }
        if (f5556aF) {
            return "dedicatedServer";
        }
        if (this.f5574ah == null) {
            return "<null context>";
        }
        return this.f5574ah.mo4534f().getInstallerPackageName(mo672h());
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: j */
    public boolean mo666j() {
        if (mo655o().contains("p")) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: c */
    public int mo686c(boolean z) {
        if (f5556aF || z) {
            return 151;
        }
        try {
            return this.f5574ah.mo4534f().getPackageInfo(this.f5574ah.mo4532h(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: k */
    public boolean mo663k() {
        return mo660l();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: l */
    public boolean mo660l() {
        if (AbstractC0515r.class.getSimpleName().equals("OrderableUnit")) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: m */
    public String mo658m() {
        if (f1149a != null) {
            return f1149a;
        }
        String str = "v" + mo656n();
        if (!AbstractC0789l.f5548an) {
            str = "DEBUG BUILD - " + str;
        } else if (AbstractC0789l.f5549ao) {
            str = "TESTING BUILD - " + str;
        } else if (str.contains("p")) {
            str = "BETA VERSION - " + str;
        }
        if (!AbstractC0789l.f5560aJ && mo660l()) {
            str = "RAW - " + str;
        }
        f1149a = str;
        return f1149a;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: n */
    public String mo656n() {
        return "1.14";
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: o */
    public String mo655o() {
        return "1.14";
    }

    /* renamed from: p */
    public synchronized void m3793p() {
        this.f1174Z = false;
        if (this.f1173Y != null) {
            this.f1173Y.cancel();
            this.f1173Y = null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: a */
    public synchronized void mo740a(Activity activity, AbstractC0068d dVar, boolean z) {
        synchronized (this.f1205aa) {
            if (!f5556aF) {
                dVar.mo225a();
            }
            this.f5446ai = activity;
            this.f5449al = z;
            this.f5523cz = this.f5449al;
            if (z && !this.f5588bp && !this.f5590br && !AbstractC0789l.f5451as && !this.f5486bF.f4734z) {
                mo654q();
            }
            AbstractC0068d dVar2 = this.f5448ak;
            if (this.f5447aj == null) {
                this.f5447aj = dVar;
            }
            this.f5448ak = dVar;
            if (!(dVar2 == null || dVar2 == dVar)) {
                dVar2.mo210l();
            }
            if (dVar != null) {
                dVar.mo207o();
            }
            if (this.f5481bA != null) {
                this.f5481bA.m1724e();
            }
            m3793p();
            m771C();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: q */
    public synchronized void mo654q() {
        if (this.f1206ab <= 20) {
            int i = this.f5479by.nextBackgroundMap;
            this.f5479by.nextBackgroundMap++;
            if (this.f5479by.nextBackgroundMap > 3) {
                this.f5479by.nextBackgroundMap = 1;
            }
            this.f5479by.save();
            int b = C0654f.m1512b(i, 1, 3);
            this.f5530cT = null;
            this.f5529cS = "maps/menu_background/menu" + b + ".tmx";
            try {
                AbstractC0171m.m3742b(10, true);
                for (int i2 = 0; i2 < AbstractC0171m.f1275a; i2++) {
                    C0118a aVar = new C0118a(i2);
                    if (i2 == 0) {
                        this.f5464bb = aVar;
                    }
                }
                mo723a(false, EnumC0803s.f5651a);
                this.f5589bq = true;
                this.f5481bA.m1692w();
                if (!this.f5588bp) {
                    AbstractC0789l.m676f("Menu load failed");
                    this.f1206ab++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: d */
    void m3798d(float f) {
        if (this.f5449al && !this.f5589bq) {
            if (this.f1176ad == null) {
                this.f1176ad = m3792r();
                if (this.f1175ac == this.f1176ad) {
                    this.f1176ad = null;
                }
            }
            if (this.f1175ac == null) {
                this.f1175ac = this.f1176ad;
                this.f1176ad = null;
            }
            if (!(this.f1177ae == 0.0f || this.f1176ad == null)) {
                m3810a(f, this.f1176ad.f5841dH, this.f1176ad.f5842dI, this.f1177ae * 0.5f);
            }
            if (this.f1175ac != null) {
                boolean a = m3810a(f, this.f1175ac.f5841dH, this.f1175ac.f5842dI, (1.0f - this.f1177ae) * 0.5f);
                if (C0654f.m1561a(this.f5510cf + this.f5520cp, this.f5511cg + this.f5521cq, this.f1175ac.f5841dH, this.f1175ac.f5842dI) < 6400.0f) {
                    a = true;
                }
                if (a) {
                    this.f1178af = true;
                }
            }
            if (this.f1178af) {
                this.f1177ae += 0.01f * f;
                if (this.f1177ae >= 1.0f) {
                    this.f1177ae = 0.0f;
                    this.f1175ac = null;
                    this.f1178af = false;
                }
            }
        }
    }

    /* renamed from: a */
    AbstractC0210af m3807a(AbstractC0171m mVar) {
        int i = 0;
        Iterator it = AbstractC0210af.f1473bj.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (!afVar.mo1649o_() && (afVar.f1441bB == mVar || mVar == null)) {
                i++;
            }
        }
        if (i <= 0) {
            return null;
        }
        int a = C0654f.m1555a(0, i - 1);
        int i2 = 0;
        Iterator it2 = AbstractC0210af.f1473bj.iterator();
        while (it2.hasNext()) {
            AbstractC0210af afVar2 = (AbstractC0210af) it2.next();
            if (!afVar2.mo1649o_() && (afVar2.f1441bB == mVar || mVar == null)) {
                if (i2 == a) {
                    return afVar2;
                }
                i2++;
            }
        }
        return null;
    }

    /* renamed from: r */
    AbstractC0210af m3792r() {
        AbstractC0210af a = m3807a(this.f5464bb);
        if (a != null) {
            return a;
        }
        return m3807a((AbstractC0171m) null);
    }

    /* renamed from: a */
    public boolean m3810a(float f, float f2, float f3, float f4) {
        float d = C0654f.m1487d(this.f5510cf + this.f5520cp, this.f5511cg + this.f5521cq, f2, f3);
        float a = C0654f.m1561a(this.f5510cf + this.f5520cp, this.f5511cg + this.f5521cq, f2, f3);
        float f5 = f4 * f;
        float f6 = 15.0f;
        if (15.0f < f5 + 1.0f) {
            f6 = f5 + 1.0f;
        }
        if (a < f6 * f6 || this.f5505ca) {
            return true;
        }
        this.f5514cj += C0654f.m1462i(d) * f5;
        this.f5515ck += C0654f.m1466h(d) * f5;
        if (C0654f.m1500c(this.f5514cj) < 1.0f && C0654f.m1500c(this.f5515ck) < 1.0f) {
            return false;
        }
        this.f5510cf += this.f5514cj;
        this.f5511cg += this.f5515ck;
        this.f5514cj = 0.0f;
        this.f5515ck = 0.0f;
        m746a(this.f5510cf, this.f5511cg);
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0789l
    /* renamed from: s */
    public int mo653s() {
        return this.f1152d;
    }
}

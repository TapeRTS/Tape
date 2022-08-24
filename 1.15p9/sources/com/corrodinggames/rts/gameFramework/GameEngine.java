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
import android.p003os.Handler;
import android.p003os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.Toast;
import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p027f.C0538c;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p037f.C0802k;
import com.corrodinggames.rts.gameFramework.p040h.C0823a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p041i.C0879n;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0846ai;
import com.corrodinggames.rts.gameFramework.p042j.C0907l;
import com.corrodinggames.rts.gameFramework.p043k.C0913a;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.p045m.C1049f;
import com.corrodinggames.rts.gameFramework.utility.C1066a;
import com.corrodinggames.rts.gameFramework.utility.C1087d;
import com.corrodinggames.rts.gameFramework.utility.C1096i;
import com.corrodinggames.rts.gameFramework.utility.InterfaceC1091e;
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

    /* renamed from: an */
    public Context f6072an;

    /* renamed from: ao */
    public InterfaceC0096f f6073ao;

    /* renamed from: ap */
    public InterfaceC0096f f6074ap;

    /* renamed from: aq */
    public boolean f6075aq;

    /* renamed from: av */
    public static Throwable f6076av;

    /* renamed from: ay */
    public static boolean noBackground;

    /* renamed from: az */
    public static boolean f6078az;

    /* renamed from: aA */
    public static boolean f6079aA;

    /* renamed from: aB */
    public static boolean f6080aB;

    /* renamed from: aC */
    public static boolean f6081aC;

    /* renamed from: aD */
    public static boolean f6082aD;

    /* renamed from: aE */
    public static boolean f6083aE;

    /* renamed from: aF */
    public static boolean f6084aF;

    /* renamed from: aG */
    public static boolean f6085aG;

    /* renamed from: aJ */
    public static boolean f6086aJ;

    /* renamed from: aR */
    public static boolean f6087aR;

    /* renamed from: aS */
    public boolean f6088aS;

    /* renamed from: bg */
    public static Class f6089bg;

    /* renamed from: bh */
    public static InterfaceC1027y f6090bh;

    /* renamed from: bj */
    public boolean f6091bj;

    /* renamed from: bp */
    public boolean f6092bp;

    /* renamed from: bs */
    public Team f6093bs;

    /* renamed from: bv */
    public boolean f6094bv;

    /* renamed from: bw */
    public boolean f6095bw;

    /* renamed from: by */
    public int f6096by;

    /* renamed from: bz */
    public int f6097bz;

    /* renamed from: bA */
    public int f6098bA;

    /* renamed from: bB */
    public int f6099bB;

    /* renamed from: bC */
    public int f6100bC;

    /* renamed from: bD */
    public boolean f6101bD;

    /* renamed from: bJ */
    public int f6102bJ;

    /* renamed from: bK */
    public C1096i f6103bK;

    /* renamed from: bL */
    public C0173b f6104bL;

    /* renamed from: bM */
    public AudioEngine audio;

    /* renamed from: bN */
    public C0648am f6106bN;

    /* renamed from: bO */
    public InterfaceC1027y graphics;

    /* renamed from: bP */
    public C0626a f6108bP;

    /* renamed from: bQ */
    public SettingsEngine f6109bQ;

    /* renamed from: bR */
    public C0743c effects;

    /* renamed from: bS */
    public C0797f f6111bS;

    /* renamed from: bT */
    public C0638ac f6112bT;

    /* renamed from: bU */
    public C0907l f6113bU;

    /* renamed from: bV */
    public C0636aa f6114bV;

    /* renamed from: bW */
    public C0802k f6115bW;

    /* renamed from: bX */
    public C0831ad networkEngine;

    /* renamed from: bY */
    public C0722bg f6117bY;

    /* renamed from: bZ */
    public C0823a f6118bZ;

    /* renamed from: ca */
    public C1122y f6119ca;

    /* renamed from: cb */
    public C0716ba f6120cb;

    /* renamed from: cc */
    public C0538c f6121cc;

    /* renamed from: cd */
    public C0727bl f6122cd;

    /* renamed from: ce */
    public C1049f f6123ce;

    /* renamed from: cf */
    public C0736c f6124cf;

    /* renamed from: ch */
    public float f6125ch;

    /* renamed from: ci */
    public float f6126ci;

    /* renamed from: cj */
    public static Point f6127cj;

    /* renamed from: ck */
    public float f6128ck;

    /* renamed from: cl */
    public float f6129cl;

    /* renamed from: cn */
    public float f6130cn;

    /* renamed from: co */
    public float f6131co;

    /* renamed from: cp */
    public float f6132cp;

    /* renamed from: cq */
    public float f6133cq;

    /* renamed from: cr */
    public float f6134cr;

    /* renamed from: cs */
    public boolean f6135cs;

    /* renamed from: ct */
    public int f6136ct;

    /* renamed from: cu */
    public int f6137cu;

    /* renamed from: cv */
    public float f6138cv;

    /* renamed from: cw */
    public float f6139cw;

    /* renamed from: cx */
    public float f6140cx;

    /* renamed from: cy */
    public float f6141cy;

    /* renamed from: cz */
    public float f6142cz;

    /* renamed from: cA */
    public float f6143cA;

    /* renamed from: cB */
    public float f6144cB;

    /* renamed from: cC */
    public float f6145cC;

    /* renamed from: cD */
    public float f6146cD;

    /* renamed from: cE */
    public float f6147cE;

    /* renamed from: cF */
    public float f6148cF;

    /* renamed from: cG */
    public float f6149cG;

    /* renamed from: cH */
    public float f6150cH;

    /* renamed from: cI */
    public float f6151cI;

    /* renamed from: cQ */
    public boolean f6152cQ;

    /* renamed from: cR */
    public boolean f6153cR;

    /* renamed from: cS */
    public float f6154cS;

    /* renamed from: cT */
    public boolean f6155cT;

    /* renamed from: cY */
    public boolean f6156cY;

    /* renamed from: cZ */
    public float f6157cZ;

    /* renamed from: da */
    public float f6158da;

    /* renamed from: dk */
    public String f6159dk;

    /* renamed from: dl */
    public C0876k f6160dl;

    /* renamed from: dm */
    public Paint f6161dm;

    /* renamed from: dn */
    public Paint f6162dn;

    /* renamed from: do */
    public Paint f6163do;

    /* renamed from: dv */
    public int f6164dv;

    /* renamed from: dz */
    float f6165dz;

    /* renamed from: dD */
    public String f6166dD;

    /* renamed from: dE */
    public String f6167dE;

    /* renamed from: dF */
    public String f6168dF;

    /* renamed from: dJ */
    String f6169dJ;

    /* renamed from: dK */
    String f6170dK;

    /* renamed from: e */
    private int f6171e;

    /* renamed from: dO */
    static byte[] f6172dO;

    /* renamed from: dR */
    static C1087d f6173dR;

    /* renamed from: dU */
    static boolean f6174dU;

    /* renamed from: dW */
    static boolean f6175dW;

    /* renamed from: dX */
    static boolean f6176dX;

    /* renamed from: ed */
    public boolean f6177ed;

    /* renamed from: ee */
    public boolean f6178ee;

    /* renamed from: ef */
    public String f6179ef;

    /* renamed from: eg */
    public boolean f6180eg;

    /* renamed from: eh */
    public boolean f6181eh;

    /* renamed from: ei */
    static int f6182ei;

    /* renamed from: al */
    protected static GameEngine f6183al = null;

    /* renamed from: as */
    public static boolean f6184as = true;

    /* renamed from: at */
    public static boolean f6185at = false;

    /* renamed from: au */
    public static boolean f6186au = false;

    /* renamed from: aw */
    public static boolean f6187aw = false;

    /* renamed from: ax */
    public static boolean f6188ax = false;

    /* renamed from: aH */
    public static boolean f6189aH = false;

    /* renamed from: aI */
    public static boolean f6190aI = false;

    /* renamed from: aK */
    public static String f6191aK = null;

    /* renamed from: aL */
    public static boolean f6192aL = false;

    /* renamed from: aM */
    public static boolean f6193aM = false;

    /* renamed from: aN */
    public static boolean f6194aN = false;

    /* renamed from: aO */
    public static boolean f6195aO = false;

    /* renamed from: aP */
    public static boolean f6196aP = false;

    /* renamed from: aQ */
    public static String f6197aQ = null;

    /* renamed from: aT */
    public static boolean f6198aT = false;

    /* renamed from: aU */
    public static boolean f6199aU = false;

    /* renamed from: aV */
    public static boolean f6200aV = false;

    /* renamed from: aW */
    public static boolean f6201aW = false;

    /* renamed from: aX */
    public static boolean f6202aX = false;

    /* renamed from: aY */
    public static boolean f6203aY = false;

    /* renamed from: aZ */
    public static boolean f6204aZ = false;

    /* renamed from: ba */
    public static String f6205ba = null;

    /* renamed from: bb */
    public static boolean f6206bb = false;

    /* renamed from: bc */
    public static boolean f6207bc = true;

    /* renamed from: bd */
    public static boolean f6208bd = true;

    /* renamed from: be */
    public static boolean f6209be = false;

    /* renamed from: bf */
    public static boolean f6210bf = false;

    /* renamed from: dx */
    public static AbstractC1059o f6211dx = new C1119v();

    /* renamed from: dy */
    public static String f6212dy = Build.VERSION.RELEASE;

    /* renamed from: dN */
    public static boolean f6213dN = false;

    /* renamed from: dP */
    static byte[] f6214dP = new byte[1000];

    /* renamed from: dQ */
    static byte[] f6215dQ = new byte[1000];

    /* renamed from: dS */
    static boolean f6216dS = false;

    /* renamed from: dT */
    static int f6217dT = 0;

    /* renamed from: dV */
    static EnumC1065u f6218dV = null;

    /* renamed from: aj */
    public final Object f6219aj = new Object();

    /* renamed from: ak */
    public final Object f6220ak = new Object();

    /* renamed from: am */
    public Context f6221am = null;

    /* renamed from: ar */
    public boolean f6222ar = false;

    /* renamed from: bi */
    public boolean f6223bi = false;

    /* renamed from: bk */
    public boolean f6224bk = false;

    /* renamed from: bl */
    public boolean f6225bl = false;

    /* renamed from: bm */
    public boolean f6226bm = false;

    /* renamed from: bn */
    public boolean f6227bn = false;

    /* renamed from: bo */
    public boolean f6228bo = false;

    /* renamed from: bq */
    public boolean f6229bq = false;

    /* renamed from: br */
    public boolean f6230br = false;

    /* renamed from: bt */
    public float f6231bt = 1.0f;

    /* renamed from: bu */
    public float f6232bu = -1.0f;

    /* renamed from: bx */
    public int f6233bx = 0;

    /* renamed from: bE */
    public boolean f6234bE = false;

    /* renamed from: bF */
    public volatile boolean f6235bF = false;

    /* renamed from: bG */
    public volatile boolean f6236bG = false;

    /* renamed from: bH */
    public volatile boolean f6237bH = false;

    /* renamed from: bI */
    public volatile boolean f6238bI = false;

    /* renamed from: cg */
    public boolean f6239cg = false;

    /* renamed from: cm */
    public float f6240cm = 1.0f;

    /* renamed from: cJ */
    public final Rect f6241cJ = new Rect();

    /* renamed from: cK */
    public final Rect f6242cK = new Rect();

    /* renamed from: cL */
    public final RectF f6243cL = new RectF();

    /* renamed from: cM */
    public final Rect f6244cM = new Rect();

    /* renamed from: cN */
    public final RectF f6245cN = new RectF();

    /* renamed from: cO */
    public final RectF f6246cO = new RectF();

    /* renamed from: cP */
    public final Rect f6247cP = new Rect();

    /* renamed from: cU */
    public float f6248cU = 1.0f;

    /* renamed from: cV */
    public boolean f6249cV = false;

    /* renamed from: cW */
    public float f6250cW = 1.0f;

    /* renamed from: cX */
    public float f6251cX = 1.0f;

    /* renamed from: db */
    public boolean f6252db = true;

    /* renamed from: dc */
    public boolean f6253dc = true;

    /* renamed from: dd */
    public boolean f6254dd = true;

    /* renamed from: de */
    public boolean f6255de = true;

    /* renamed from: df */
    public boolean f6256df = true;

    /* renamed from: dg */
    public float f6257dg = 0.0f;

    /* renamed from: dh */
    public float f6258dh = 0.0f;

    /* renamed from: di */
    public boolean f6259di = false;

    /* renamed from: dj */
    protected C1123z f6260dj = null;

    /* renamed from: dp */
    public boolean f6261dp = false;

    /* renamed from: dq */
    public boolean f6262dq = false;

    /* renamed from: dr */
    public float f6263dr = 0.0f;

    /* renamed from: ds */
    public boolean f6264ds = false;

    /* renamed from: dt */
    public boolean f6265dt = false;

    /* renamed from: du */
    public boolean f6266du = false;

    /* renamed from: dw */
    public float f6267dw = 0.0f;

    /* renamed from: dA */
    boolean f6268dA = false;

    /* renamed from: dB */
    ArrayList f6269dB = new ArrayList();

    /* renamed from: dC */
    final Handler f6270dC = new Handler(Looper.m7145b());

    /* renamed from: a */
    private Runnable f6271a = new RunnableC09171();

    /* renamed from: b */
    private Runnable f6272b = new RunnableC09182();

    /* renamed from: dG */
    public AbstractC1057n f6273dG = null;

    /* renamed from: dH */
    transient String f6274dH = null;

    /* renamed from: dI */
    Object f6275dI = new Object();

    /* renamed from: dL */
    public boolean[] f6276dL = new boolean[10];

    /* renamed from: dM */
    protected ConcurrentLinkedQueue f6277dM = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private boolean[] f6278c = new boolean[KeyEvent.m7094a() + 1];

    /* renamed from: d */
    private boolean[] f6279d = new boolean[KeyEvent.m7094a() + 1];

    /* renamed from: dY */
    public byte f6280dY = 42;

    /* renamed from: dZ */
    public byte f6281dZ = 42;

    /* renamed from: ea */
    public final C1061q f6282ea = new C1061q();

    /* renamed from: eb */
    public final C1061q f6283eb = new C1061q();

    /* renamed from: ec */
    public final C1061q f6284ec = new C1061q();

    /* renamed from: a */
    public abstract void m1200a(Context context);

    /* renamed from: a */
    public abstract boolean m1208a();

    /* renamed from: a */
    public abstract boolean m1185a(boolean z);

    /* renamed from: a */
    public abstract void m1201a(Activity activity, InterfaceC0096f interfaceC0096f, boolean z);

    /* renamed from: b */
    public abstract void m1148b(int i, int i2);

    /* renamed from: c */
    public abstract int m1135c(boolean z);

    /* renamed from: m */
    public abstract boolean m1108m();

    /* renamed from: o */
    public abstract boolean m1105o();

    /* renamed from: k */
    public abstract String m1113k();

    /* renamed from: l */
    public abstract String m1110l();

    /* renamed from: q */
    public abstract String m1102q();

    /* renamed from: s */
    public abstract String m1100s();

    /* renamed from: t */
    public abstract String m1099t();

    /* renamed from: r */
    public abstract void m1101r();

    /* renamed from: u */
    public abstract String m1098u();

    /* renamed from: a */
    public abstract void m1183a(boolean z, boolean z2, EnumC1063s enumC1063s);

    /* renamed from: a */
    public abstract void m1184a(boolean z, EnumC1063s enumC1063s);

    /* renamed from: e */
    public abstract void m1129e();

    /* renamed from: w */
    public abstract void m1097w();

    /* renamed from: a */
    public abstract void m1205a(float f, int i);

    /* renamed from: y */
    public abstract int m1096y();

    /* renamed from: b */
    public abstract int m1151b();

    /* renamed from: c */
    public abstract boolean m1142c();

    /* renamed from: d */
    public abstract boolean m1134d();

    /* renamed from: b */
    public static boolean m1146b(Context context) {
        String mo7343h;
        if (f6199aU) {
            mo7343h = "dedicatedServer";
        } else {
            mo7343h = context.mo7344g().mo7343h();
        }
        Log.m7106d("RustedWarfare", "packageName:" + mo7343h);
        if (mo7343h.contains("rtsdemo")) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m1095z() {
        return this.f6153cR || this.f6154cS > 0.0f || this.f6155cT;
    }

    /* renamed from: A */
    public static final GameEngine getInstance() {
        return f6183al;
    }

    /* renamed from: B */
    public static final boolean m1233B() {
        return f6209be;
    }

    /* renamed from: C */
    public static final boolean m1232C() {
        return f6210bf;
    }

    /* renamed from: c */
    public void m1139c(Context context) {
        C0090c.m6977a(context);
        this.f6221am = context;
    }

    /* renamed from: a */
    public static synchronized GameEngine m1199a(Context context, AbstractC1057n abstractC1057n) {
        if (f6183al != null) {
            if (abstractC1057n != null) {
                f6183al.f6273dG = abstractC1057n;
            }
            f6183al.m1139c(context);
            return f6183al;
        }
        f6183al = f6211dx.m769a(context);
        PrintLog("Created new gameEngine of:" + f6183al.getClass().getName());
        if (abstractC1057n != null) {
            f6183al.f6273dG = abstractC1057n;
        }
        f6183al.m1200a(context);
        return f6183al;
    }

    public GameEngine(Context context) {
        Log.m7106d("RustedWarfare", "GameEngine:GameEngine()");
        if (f6183al != null) {
            throw new RuntimeException("gameEngine already created");
        }
        m1139c(context);
        f6183al = this;
    }

    protected void finalize() {
        Log.m7106d("RustedWarfare", "GameEngine:finalize()");
        super.finalize();
    }

    /* renamed from: D */
    public boolean m1231D() {
        return true;
    }

    /* renamed from: E */
    public void m1230E() {
    }

    /* renamed from: F */
    public String m1229F() {
        if (m1157au()) {
            return "PC";
        }
        if (f6204aZ) {
            String m1244a = C0913a.m1244a();
            if (m1244a != null) {
                return "IOS - " + m1244a;
            }
            return "IOS";
        } else if (f6199aU) {
            return "SERVER";
        } else {
            return Build.MODEL;
        }
    }

    /* renamed from: G */
    public String m1228G() {
        return f6212dy;
    }

    /* renamed from: H */
    public boolean m1227H() {
        if (this.f6237bH) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public synchronized void m1226I() {
        PrintLog("--- setRunning ---");
        if (!m1157au() && !f6204aZ) {
            this.f6106bN.m2917h();
        }
        if (!f6201aW && !f6206bb && this.f6260dj == null) {
            this.f6260dj = new C1123z();
            this.f6260dj.m440a(true);
            this.f6260dj.start();
        }
    }

    /* renamed from: J */
    public synchronized void m1225J() {
        PrintLog("--- setStoppedIfNotInGameThread ---");
        if (Thread.currentThread() != this.f6260dj) {
            m1224K();
        }
    }

    /* renamed from: K */
    public synchronized void m1224K() {
        PrintLog("--- setStopped ---");
        if (this.f6260dj == null) {
            Log.m7106d("RustedWarfare", "gameThread already null");
            return;
        }
        if (!m1157au()) {
            this.f6106bN.m2919f();
        }
        this.f6260dj.m440a(false);
        if (Thread.currentThread() != this.f6260dj) {
            boolean z = true;
            while (z) {
                try {
                    this.f6260dj.join();
                    z = false;
                } catch (InterruptedException e) {
                }
            }
            Log.m7106d("RustedWarfare", "thread stop");
        } else {
            m1120g("currentThread is game thread");
        }
        this.f6260dj = null;
        if (this.f6073ao != null) {
            this.f6073ao.mo6951l();
        }
        if (this.f6234bE) {
            Debug.stopMethodTracing();
        }
    }

    /* renamed from: L */
    public boolean m1223L() {
        if (this.networkEngine == null || !this.networkEngine.f5564B || this.networkEngine.f5565F || this.f6120cb.m2635h()) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public boolean m1222M() {
        if (this.networkEngine == null) {
            return false;
        }
        return this.networkEngine.f5564B;
    }

    /* renamed from: N */
    public boolean m1221N() {
        if (this.networkEngine == null) {
            return false;
        }
        return this.networkEngine.f5565F || this.networkEngine.f5564B || this.f6120cb.m2635h();
    }

    /* renamed from: O */
    public boolean m1220O() {
        if (this.networkEngine != null && !this.networkEngine.f5565F) {
            return !this.networkEngine.f5564B && !this.f6120cb.m2635h();
        }
        return true;
    }

    /* renamed from: P */
    public void m1219P() {
        this.f6135cs = false;
        if (this.f6140cx < 0.0f) {
            this.f6140cx = 0.0f;
            this.f6135cs = true;
        }
        if (this.f6141cy < 0.0f) {
            this.f6141cy = 0.0f;
            this.f6135cs = true;
        }
        if (this.f6104bL != null) {
            if (this.f6140cx > this.f6104bL.m6589i() - this.f6146cD) {
                this.f6140cx = this.f6104bL.m6589i() - this.f6146cD;
                this.f6135cs = true;
            }
            if (this.f6141cy > this.f6104bL.m6588j() - this.f6143cA) {
                this.f6141cy = this.f6104bL.m6588j() - this.f6143cA;
                this.f6135cs = true;
            }
            if (this.f6146cD > this.f6104bL.m6589i()) {
                this.f6140cx = (this.f6104bL.m6589i() / 2.0f) - (this.f6146cD / 2.0f);
                this.f6135cs = true;
            }
            if (this.f6143cA > this.f6104bL.m6588j()) {
                this.f6141cy = (this.f6104bL.m6588j() / 2.0f) - (this.f6143cA / 2.0f);
                this.f6135cs = true;
            }
        }
        m1207a(this.f6140cx, this.f6141cy);
    }

    /* renamed from: a */
    public void m1207a(float f, float f2) {
        this.f6140cx = f;
        this.f6141cy = f2;
        this.f6136ct = (int) this.f6140cx;
        this.f6137cu = (int) this.f6141cy;
        this.f6138cv = ((int) (this.f6140cx * this.f6250cW)) / this.f6250cW;
        this.f6139cw = ((int) (this.f6141cy * this.f6250cW)) / this.f6250cW;
        int i = 90;
        if (m1233B()) {
            i = 210;
        }
        this.f6244cM.m7208a((int) (this.f6140cx - i), (int) (this.f6141cy - i), (int) (this.f6140cx + this.f6142cz + i), (int) (this.f6141cy + this.f6143cA + i));
        this.f6245cN.m7194a(this.f6244cM);
        this.f6247cP.m7208a((int) this.f6140cx, (int) this.f6141cy, (int) (this.f6140cx + this.f6142cz), (int) (this.f6141cy + this.f6143cA));
        this.f6246cO.m7195a((int) (this.f6140cx - 300), (int) (this.f6141cy - 300), (int) (this.f6140cx + this.f6142cz + 300), (int) (this.f6141cy + this.f6143cA + 300));
    }

    /* renamed from: b */
    public void m1150b(float f, float f2) {
        m1207a(f - (this.f6146cD / 2.0f), f2 - (this.f6143cA / 2.0f));
    }

    /* renamed from: d */
    public static boolean m1132d(Context context) {
        if (f6199aU) {
            return false;
        }
        if (Build.MODEL.equals("GT-I9100") || Build.MODEL.equals("GT-I9300")) {
            try {
                WifiInfo connectionInfo = ((WifiManager) context.mo7348c("wifi")).getConnectionInfo();
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

    /* renamed from: Q */
    public void m1218Q() {
        if (this.f6250cW != 1.0f) {
            this.graphics.mo935a(this.f6250cW, this.f6250cW);
        }
    }

    /* renamed from: R */
    public void m1217R() {
        if (this.f6250cW != 1.0f) {
            this.graphics.mo935a(1.0f / this.f6250cW, 1.0f / this.f6250cW);
        }
    }

    /* renamed from: a */
    public static void m1190a(String str, Exception exc) {
        PrintLog(str);
        exc.printStackTrace();
    }

    /* renamed from: a */
    public static String m1189a(String str, String str2) {
        if (f6188ax && !str.contains("\u001b[0m")) {
            str = str2 + str + "\u001b[0m";
        }
        return str;
    }

    /* renamed from: a */
    public static void m1193a(String str) {
        PrintLog(m1189a("--- ERROR: " + str, "\u001b[31m"));
    }

    /* renamed from: b */
    public static void m1145b(String str) {
        PrintLog(m1189a(str, "\u001b[33m"));
    }

    /* renamed from: a */
    public static void m1188a(String str, Throwable th) {
        m1145b(str);
        PrintLog(VariableScope.nullOrMissingString + th.toString());
        PrintLog("cause:" + th.getCause());
        th.printStackTrace();
    }

    /* renamed from: c */
    public static void m1138c(String str) {
        if (f6202aX) {
            Log.m7110b("RustedWarfare", str);
        } else {
            Log.m7110b("RustedWarfare", str);
        }
    }

    /* renamed from: d */
    public static void m1131d(String str) {
        m1138c(str);
    }

    /* renamed from: e */
    public static void PrintLog(String str) {
        m1138c(str);
    }

    /* renamed from: b */
    public static void m1144b(String str, String str2) {
        m1138c(str + ":" + str2);
    }

    /* renamed from: f */
    public static synchronized void m1123f(String str) {
        m1138c(str + " (at " + System.nanoTime() + ")");
    }

    /* renamed from: S */
    public static void m1216S() {
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            PrintLog(stackTraceElement.toString());
        }
    }

    /* renamed from: T */
    public static String m1215T() {
        StackTraceElement[] stackTrace;
        String str = VariableScope.nullOrMissingString;
        for (int i = 0; i < new Throwable().getStackTrace().length; i++) {
            str = str + stackTrace[i].toString() + "\n";
        }
        return str;
    }

    /* renamed from: g */
    public static void m1120g(String str) {
        m1145b(str);
        m1216S();
    }

    /* renamed from: U */
    public static long m1214U() {
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public static final boolean m1202a(long j, long j2) {
        long m1214U = m1214U();
        if (j + j2 < m1214U || m1214U < j - 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public float m1213V() {
        float f = this.f6125ch;
        if (this.f6109bQ != null) {
            f = f * this.f6109bQ.renderDensity * this.f6109bQ.uiRenderScale;
            if (this.f6109bQ.renderDoubleScale) {
                return f / 2.0f;
            }
        }
        return f;
    }

    /* renamed from: e */
    public int m1128e(float f) {
        return (int) ((f * this.f6126ci) + 0.5f);
    }

    /* renamed from: a */
    public int m1204a(int i) {
        return (int) ((i * this.f6126ci) + 0.5f);
    }

    /* renamed from: W */
    public void m1212W() {
        if (this.f6165dz != this.f6126ci) {
            PrintLog("Density size changed, refreshing fonts");
            synchronized (this.f6269dB) {
                Iterator it = this.f6269dB.iterator();
                while (it.hasNext()) {
                    ((C1029m) it.next()).m870a();
                }
            }
            this.f6165dz = this.f6126ci;
            if (this.graphics != null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public void m1211X() {
        Iterator it = this.f6269dB.iterator();
        while (it.hasNext()) {
            this.graphics.mo924a(((C1029m) it.next()).f6589b);
        }
        this.f6268dA = true;
    }

    /* renamed from: a */
    public void m1198a(Paint paint) {
        m1197a(paint, 16.0f);
    }

    /* renamed from: a */
    public void m1197a(Paint paint, float f) {
        C1029m c1029m = new C1029m(this);
        c1029m.f6588a = f;
        c1029m.f6589b = paint;
        c1029m.m870a();
        synchronized (this.f6269dB) {
            this.f6269dB.add(c1029m);
        }
        if (this.f6268dA) {
            this.graphics.mo924a(c1029m.f6589b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.l$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l$1.class */
    public class RunnableC09171 implements Runnable {
        RunnableC09171() {
        }

        public void run() {
            String str = GameEngine.this.f6166dD;
            try {
                if (str == null) {
                    GameEngine.m1145b("Cannot show toast, no message");
                } else {
                    Toast.makeText(GameEngine.this.f6221am, str, 1).show();
                }
            } catch (Exception e) {
                GameEngine.m1145b("Error showing toast: " + ((Object) str));
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.l$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l$2.class */
    public class RunnableC09182 implements Runnable {
        RunnableC09182() {
        }

        /* renamed from: com.corrodinggames.rts.gameFramework.l$2$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l$2$1.class */
        class DialogInterface$OnClickListenerC09191 implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC09191() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                GameEngine.this.f6092bp = false;
            }
        }

        public void run() {
            DialogInterface$OnClickListenerC09191 dialogInterface$OnClickListenerC09191 = new DialogInterface$OnClickListenerC09191();
            DialogInterface$OnCancelListenerC09202 dialogInterface$OnCancelListenerC09202 = new DialogInterface$OnCancelListenerC09202();
            GameEngine.PrintLog("showMessageBoxRunnable context:" + GameEngine.this.f6221am.getClass().getName());
            try {
                new AlertDialog.Builder(GameEngine.this.f6221am).setIcon(17301543).setTitle(GameEngine.this.f6167dE).setMessage(GameEngine.this.f6168dF).setOnCancelListener(dialogInterface$OnCancelListenerC09202).setPositiveButton("Ok", dialogInterface$OnClickListenerC09191).show();
            } catch (WindowManager.BadTokenException e) {
                GameEngine.m1145b("Failed to show message: " + GameEngine.this.f6168dF);
                e.printStackTrace();
            }
        }

        /* renamed from: com.corrodinggames.rts.gameFramework.l$2$2 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l$2$2.class */
        class DialogInterface$OnCancelListenerC09202 implements DialogInterface.OnCancelListener {
            DialogInterface$OnCancelListenerC09202() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                GameEngine.this.f6092bp = false;
            }
        }
    }

    /* renamed from: h */
    public void m1118h(String str) {
        m1187a(str, true);
    }

    /* renamed from: a */
    public void m1187a(String str, boolean z) {
        this.f6274dH = str;
        if (this.f6273dG != null) {
            this.f6273dG.mo791a(str, z);
        }
    }

    /* renamed from: Y */
    public void m1210Y() {
        this.f6274dH = null;
    }

    /* renamed from: i */
    public void m1116i(String str) {
        m1192a(str, 1);
    }

    /* renamed from: a */
    public void m1192a(String str, int i) {
        if (f6199aU) {
            PrintLog("alert:" + str);
        } else if (str == null) {
            m1120g("Cannot show alert, no message text");
        } else {
            this.f6166dD = str;
            this.f6270dC.m7155a(this.f6271a);
        }
        if (this.f6273dG != null) {
            this.f6273dG.mo793a(str, i);
        }
    }

    /* renamed from: Z */
    public boolean m1209Z() {
        if (this.f6273dG != null) {
            return this.f6273dG.mo788c();
        }
        return false;
    }

    /* renamed from: a */
    public void m1191a(String str, C0385az c0385az) {
        String str2 = null;
        if (c0385az != null) {
            str2 = c0385az.m5339b();
        }
        m1137c(str, str2);
    }

    /* renamed from: c */
    public void m1137c(String str, String str2) {
        if (this.f6273dG != null) {
            this.f6273dG.mo792a(str, str2);
        }
        if (f6199aU) {
            if (this.f6273dG == null) {
                m1145b("showMessageBox: not showing due to non-android:" + str2);
                return;
            }
            return;
        }
        this.f6092bp = true;
        this.f6167dE = str;
        this.f6168dF = str2;
        this.f6270dC.m7155a(this.f6272b);
    }

    /* renamed from: aa */
    public void m1177aa() {
        synchronized (this.f6275dI) {
            if (this.f6169dJ != null) {
                m1137c(this.f6170dK, this.f6169dJ);
                this.f6169dJ = null;
                this.f6170dK = null;
            }
        }
    }

    /* renamed from: d */
    public void m1130d(String str, String str2) {
        this.f6170dK = str;
        this.f6169dJ = str2;
        if (f6201aW) {
            m1177aa();
        } else {
            new C09213().start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.l$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l$3.class */
    public class C09213 extends Thread {
        C09213() {
        }

        public void run() {
            try {
                sleep(3000L);
            } catch (InterruptedException e) {
            }
            GameEngine.this.m1177aa();
        }
    }

    /* renamed from: ab */
    public boolean m1176ab() {
        if (!this.f6075aq && this.f6073ao.mo6952k() != null) {
            return this.f6073ao.mo6952k().m6921b();
        }
        return false;
    }

    /* renamed from: ac */
    public void m1175ac() {
        if (this.f6073ao.mo6952k() == null) {
            return;
        }
        this.f6073ao.mo6952k().m6920c();
    }

    /* renamed from: ad */
    public int m1174ad() {
        if (this.f6075aq) {
            return 0;
        }
        return this.f6073ao.mo6952k().m6924a();
    }

    /* renamed from: ae */
    public float m1173ae() {
        return m1149b(0);
    }

    /* renamed from: af */
    public float m1172af() {
        return m1141c(0);
    }

    /* renamed from: b */
    public float m1149b(int i) {
        if (this.f6109bQ.renderDoubleScale) {
            return this.f6073ao.mo6952k().m6919d()[i] / 2.0f;
        }
        return this.f6073ao.mo6952k().m6919d()[i];
    }

    /* renamed from: c */
    public float m1141c(int i) {
        if (this.f6109bQ.renderDoubleScale) {
            return this.f6073ao.mo6952k().m6917f()[i] / 2.0f;
        }
        return this.f6073ao.mo6952k().m6917f()[i];
    }

    /* renamed from: d */
    public int m1133d(int i) {
        return this.f6073ao.mo6952k().m6918e()[i];
    }

    /* renamed from: e */
    public boolean m1127e(int i) {
        if (i != 1 && i != 2 && i != 3) {
            throw new RuntimeException("Unknown mouseButton:" + i);
        }
        if (m1124f(i) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m1124f(int i) {
        if (i == 0) {
            throw new RuntimeException("finding state of 0 doesn't make sense");
        }
        int[] m6918e = this.f6073ao.mo6952k().m6918e();
        for (int i2 = 0; i2 < m6918e.length; i2++) {
            if (m6918e[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public boolean m1121g(int i) {
        if (i < this.f6278c.length && i >= 0 && this.f6278c[i] && this.f6279d[i]) {
            this.f6279d[i] = false;
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m1119h(int i) {
        if (i >= this.f6278c.length || i < 0) {
            return false;
        }
        return this.f6278c[i];
    }

    /* renamed from: a */
    public boolean m1203a(int i, boolean z) {
        boolean z2 = true;
        boolean z3 = true;
        int m1171ag = m1171ag();
        if ((i & 2) != 0) {
            if ((m1171ag & 2) == 0) {
                z2 = false;
            }
        } else if ((m1171ag & 2) != 0) {
            z3 = false;
        }
        if ((i & 1) != 0) {
            if ((m1171ag & 1) == 0) {
                z2 = false;
            }
        } else if ((m1171ag & 1) != 0) {
            z3 = false;
        }
        if ((i & 4) != 0) {
            if ((m1171ag & 4) == 0) {
                z2 = false;
            }
        } else if ((m1171ag & 4) != 0) {
            z3 = false;
        }
        if (z) {
            return z2;
        }
        return z2 && z3;
    }

    /* renamed from: i */
    public boolean m1117i(int i) {
        if (i == 59 || i == 60 || i == 113 || i == 114 || i == 57 || i == 58) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static String m1115j(int i) {
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

    /* renamed from: ag */
    public int m1171ag() {
        int i = 0;
        if (m1119h(59) || m1119h(60)) {
            i = 0 + 2;
        }
        if (m1119h(113) || m1119h(114)) {
            i++;
        }
        if (m1119h(57) || m1119h(58)) {
            i += 4;
        }
        return i;
    }

    /* renamed from: c */
    public boolean m1140c(int i, int i2) {
        boolean z = false;
        boolean z2 = false;
        if (i >= 0 && i < this.f6278c.length) {
            z = this.f6278c[i];
        }
        if (i2 >= 0 && i2 < this.f6278c.length) {
            z2 = this.f6278c[i2];
        }
        return z || z2;
    }

    /* renamed from: b */
    public void m1147b(int i, boolean z) {
        if (i >= 0 && i < this.f6278c.length) {
            this.f6278c[i] = z;
            if (z) {
                this.f6279d[i] = z;
                return;
            }
            return;
        }
        PrintLog("setKeyState: Key out of range:" + i);
    }

    /* renamed from: k */
    public void m1112k(int i) {
        this.f6277dM.add(new C1064t(this, i));
    }

    /* renamed from: ah */
    public int m1170ah() {
        return this.f6171e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ai */
    public void m1169ai() {
        this.f6171e = 0;
        while (true) {
            C1060p c1060p = (C1060p) this.f6277dM.poll();
            if (c1060p != null) {
                if (c1060p instanceof C1062r) {
                    C1062r c1062r = (C1062r) c1060p;
                    if (c1062r.f6731c >= this.f6278c.length || c1062r.f6731c < 0) {
                        m1144b("updateKeyState", "keyCode (" + c1062r.f6731c + ") is out of range");
                    } else {
                        this.f6278c[c1062r.f6731c] = !c1062r.f6732d;
                        this.f6279d[c1062r.f6731c] = !c1062r.f6732d;
                    }
                } else if (c1060p instanceof C1064t) {
                    this.f6171e += ((C1064t) c1060p).f6737c;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public static String m1114j(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: k */
    public static String m1111k(String str) {
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
    public static Integer m1109l(String str) {
        String m1111k = m1111k(str);
        PrintLog("getMapLevel for :" + str + " file:" + m1111k);
        Matcher matcher = Pattern.compile("^l(\\d*);.*").matcher(m1111k);
        if (matcher.matches()) {
            PrintLog("getMapLevel:" + str + ":" + Integer.parseInt(matcher.group(1)));
            return Integer.valueOf(Integer.parseInt(matcher.group(1)));
        }
        return null;
    }

    /* renamed from: m */
    public static String m1107m(String str) {
        GameEngine gameEngine = getInstance();
        Integer m1109l = m1109l(str);
        if (m1109l == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        String substring = str.substring(0, lastIndexOf);
        String[] m2460a = C0750a.m2460a(substring, true);
        if (m2460a == null) {
            return null;
        }
        for (String str2 : m2460a) {
            Integer m1109l2 = m1109l(str2);
            if (m1109l2 != null && m1109l2.intValue() > m1109l.intValue() && (!gameEngine.f6222ar || ActivityC0117i.m6935a(str2, substring + "/" + str2))) {
                return substring + "/" + str2;
            }
        }
        return null;
    }

    /* renamed from: aj */
    public String m1168aj() {
        return this.f6159dk;
    }

    /* renamed from: ak */
    public String m1167ak() {
        String str = this.f6159dk;
        if ((this.f6159dk == null || VariableScope.nullOrMissingString.equals(this.f6159dk)) && m1222M()) {
            str = this.networkEngine.m1631l();
        }
        return ActivityC0117i.m6932e(ActivityC0117i.m6933d(str));
    }

    /* renamed from: al */
    public String m1166al() {
        return ActivityC0117i.m6933d(this.f6159dk);
    }

    /* renamed from: am */
    public EnumC0846ai m1165am() {
        if (ActivityC0117i.m6930g(this.f6159dk)) {
            return EnumC0846ai.f5664b;
        }
        return EnumC0846ai.f5663a;
    }

    /* renamed from: a */
    public static String m1186a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String obj = stringWriter.toString();
        printWriter.close();
        return obj;
    }

    /* renamed from: b */
    public static String m1143b(Throwable th) {
        String replace;
        Throwable th2;
        String message = th.getMessage();
        if (message == null) {
            replace = th.getClass().getName();
        } else {
            replace = message.replace("java.lang.RuntimeException: ", VariableScope.nullOrMissingString).replace("java.lang.RuntimeException: ", VariableScope.nullOrMissingString);
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
            if (!message2.equals(replace)) {
                replace = replace + " caused by (" + message2 + ")";
            }
        }
        return replace;
    }

    /* renamed from: an */
    public static File m1164an() {
        C0750a.m2450d();
        String str = "/SD/rustedWarfare/crashes.txt";
        if (m1159as()) {
            str = "/SD/rustedWarfare/crashes.txt";
        }
        return new File(C0750a.m2447e(str));
    }

    /* renamed from: e */
    public static void m1125e(String str, String str2) {
        try {
            PrintWriter printWriter = new PrintWriter(C0750a.m2464a(m1164an(), true));
            printWriter.write("\r\n" + str + " (at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + " - 1.15p9" + VariableScope.nullOrMissingString + ")\n");
            printWriter.write(str2 + "\r\n");
            printWriter.close();
        } catch (Throwable th) {
            PrintLog("Exception in writeCrashToFile");
            th.printStackTrace();
        }
    }

    /* renamed from: ao */
    public static void m1163ao() {
        if (!f6185at || f6199aU) {
            return;
        }
        if (f6173dR != null) {
            m1145b("setupANRWatchDog: activeANRWatchDog!=null");
            return;
        }
        f6173dR = new C1087d(4000);
        f6173dR.m589a(new C09224());
        f6173dR.start();
        m1145b("setupANRWatchDog: running");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.l$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l$4.class */
    public final class C09224 implements InterfaceC1091e {
        C09224() {
        }

        /* renamed from: a */
        public void mo588a(C1066a c1066a) {
            if (GameEngine.f6216dS) {
                GameEngine.m1145b("activeANRWatchDog: ANR already detected");
            }
            GameEngine.f6216dS = true;
            GameEngine.m1145b("activeANRWatchDog: ANR detected");
            String m1186a = GameEngine.m1186a(c1066a);
            C0879n.m1428a("detectedANR", m1186a);
            try {
                Thread.sleep(400L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(C1122y.m449a("lastFreeze", VariableScope.nullOrMissingString, true));
                PrintStream printStream = new PrintStream(fileOutputStream);
                printStream.print(m1186a);
                printStream.close();
                fileOutputStream.close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: ap */
    public static void m1162ap() {
        if (f6172dO == null && m1157au()) {
            f6172dO = new byte[2500000];
            f6172dO[0] = 2;
            f6172dO[f6172dO.length - 1] = 5;
        }
        if (f6079aA) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
            if (!(uncaughtExceptionHandler instanceof C0826i)) {
                Thread.currentThread().setUncaughtExceptionHandler(new C0826i(uncaughtExceptionHandler));
                return;
            }
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (!(defaultUncaughtExceptionHandler instanceof C0826i)) {
            Thread.setDefaultUncaughtExceptionHandler(new C0826i(defaultUncaughtExceptionHandler));
        }
    }

    /* renamed from: aq */
    public boolean m1161aq() {
        return true;
    }

    /* renamed from: ar */
    public boolean m1160ar() {
        return true;
    }

    /* renamed from: n */
    public static void m1106n(String str) {
        GameEngine gameEngine = getInstance();
        if (gameEngine != null) {
            f6217dT++;
            if (f6217dT < 1000) {
                m1145b("reportProblem: " + str);
            }
            if (f6217dT < 10) {
                gameEngine.m1192a(str, 1);
            }
        }
    }

    /* renamed from: as */
    public static boolean m1159as() {
        return !f6199aU;
    }

    /* renamed from: at */
    public static boolean m1158at() {
        return !f6201aW || f6204aZ;
    }

    /* renamed from: au */
    public static boolean m1157au() {
        return f6201aW && !f6204aZ;
    }

    /* renamed from: av */
    public static boolean m1156av() {
        return f6201aW && !f6204aZ;
    }

    /* renamed from: aw */
    public static boolean m1155aw() {
        return f6199aU && !f6201aW;
    }

    /* renamed from: ax */
    public boolean m1154ax() {
        return this.networkEngine.f5564B || this.f6120cb.m2635h();
    }

    /* renamed from: a */
    public void m1196a(Unit unit, float f) {
        this.f6115bW.m1943a((int) unit.f6951ek, (int) unit.f6952el, f, unit);
        this.f6111bS.f5108f.m2098c(unit);
    }

    /* renamed from: ay */
    public static boolean m1153ay() {
        GameEngine gameEngine = getInstance();
        if (gameEngine != null && gameEngine.f6109bQ.teamShaders && (gameEngine.f6109bQ.newRender || !m1159as())) {
            return true;
        }
        return f6194aN;
    }

    /* renamed from: az */
    public static boolean m1152az() {
        GameEngine gameEngine = getInstance();
        if (gameEngine != null && gameEngine.f6109bQ.shaderEffects && (gameEngine.f6109bQ.newRender || !m1159as())) {
            return true;
        }
        return f6193aM;
    }

    /* renamed from: aA */
    public static boolean m1182aA() {
        GameEngine gameEngine = getInstance();
        if (gameEngine != null && gameEngine.f6109bQ.shaderEffects && (gameEngine.f6109bQ.newRender || !m1159as())) {
            return true;
        }
        return f6193aM;
    }

    /* renamed from: aB */
    public static void m1181aB() {
        System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : Long.valueOf(maxMemory)));
        System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());
    }

    /* renamed from: aC */
    public Context m1180aC() {
        return this.f6221am;
    }

    /* renamed from: f */
    public static void m1122f(String str, String str2) {
        GameEngine gameEngine = getInstance();
        if (gameEngine == null) {
            return;
        }
        if (gameEngine.f6111bS != null && gameEngine.f6111bS.f5107e != null) {
            gameEngine.f6111bS.f5107e.m1952a(str, str2);
        } else {
            m1120g("addMessage: interfaceEngine/messageInterface==null");
        }
    }

    /* renamed from: a */
    public static void m1195a(EnumC1065u enumC1065u, Throwable th) {
        f6214dP = null;
        PrintLog("reportCaughtOutOfMemory:" + f6218dV);
        if (f6218dV != null) {
            return;
        }
        f6218dV = enumC1065u;
        if (th != null) {
            m1136c(th);
        }
        m1181aB();
    }

    /* renamed from: c */
    public static void m1136c(Throwable th) {
        try {
            th.printStackTrace();
        } catch (Throwable th2) {
            PrintLog("Failed to print stacktrace");
        }
    }

    /* renamed from: aD */
    public void m1179aD() {
        if (f6175dW && !f6176dX) {
            f6176dX = true;
            String str = "Warning game has less than 5mb of free space remaining. A larger battle might cause a crash. ";
            int m1853h = this.f6118bZ.m1853h();
            if (m1853h > 1) {
                str = str + "This is often caused by large mods, you currently have: " + m1853h + " mods loaded. ";
            }
            m1137c("Warning: Low memory detected", str);
        }
        if (!f6174dU && f6218dV != null) {
            PrintLog("Showing out of memory message");
            f6174dU = true;
            String str2 = "trying to load data";
            if (f6218dV == EnumC1065u.f6739a) {
                str2 = "trying to load game textures";
            } else if (f6218dV == EnumC1065u.f6740b) {
                str2 = "trying to create a texture";
            } else if (f6218dV == EnumC1065u.f6741c) {
                str2 = "trying to colour new texture";
            } else if (f6218dV == EnumC1065u.f6742d) {
                str2 = "trying to create texture buffer for on-screen fog fading";
            } else if (f6218dV == EnumC1065u.f6743e) {
                str2 = "trying to create game fonts";
            } else if (f6218dV == EnumC1065u.f6744f) {
                str2 = "trying to load game sounds";
            } else if (f6218dV == EnumC1065u.f6745g) {
                str2 = "trying to load UI textures";
            }
            String str3 = "The game ran out of memory " + str2 + ". ";
            int m1853h2 = this.f6118bZ.m1853h();
            if (m1853h2 > 1) {
                str3 = str3 + "This is often caused by large mods, you currently have: " + m1853h2 + " mods. ";
            }
            if (m1157au() && !C0191i.f1217b) {
                str3 = str3 + "You are also using the 32 bit version, switching to the 64 bit version might help. ";
            }
            m1137c("Warning: Out Of Memory", str3);
        }
    }

    /* renamed from: aE */
    public void m1178aE() {
        try {
            byte[] bArr = new byte[5000000];
            bArr[0] = this.f6280dY;
            this.f6281dZ = bArr[1];
        } catch (OutOfMemoryError e) {
            System.gc();
            PrintLog("Low memory detected");
            e.printStackTrace();
            f6175dW = true;
        }
    }

    /* renamed from: a */
    public void m1194a(Runnable runnable) {
        this.f6283eb.m767a(runnable);
    }

    /* renamed from: a */
    public final boolean m1206a(float f, float f2, float f3) {
        return this.f6243cL.f234a < f + f3 && f - f3 < this.f6243cL.f236c && this.f6243cL.f235b < f2 + f3 && f2 - f3 < this.f6243cL.f237d;
    }

    /* renamed from: o */
    public static boolean m1104o(String str) {
        if (f6197aQ == null) {
            return false;
        }
        return f6197aQ.contains(str);
    }

    /* renamed from: p */
    public static void m1103p(String str) {
        C0831ad c0831ad = getInstance().networkEngine;
        String str2 = VariableScope.nullOrMissingString + str;
        m1145b(str2);
        m1216S();
        f6182ei++;
        if (f6182ei < 10 && c0831ad != null) {
            c0831ad.m1628m(str2);
        }
    }
}

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
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0166i;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0311ag;
import com.corrodinggames.rts.game.units.p026f.C0453c;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p030b.C0571c;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.gameFramework.p032d.C0623f;
import com.corrodinggames.rts.gameFramework.p032d.C0628k;
import com.corrodinggames.rts.gameFramework.p035f.C0656a;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.C0710n;
import com.corrodinggames.rts.gameFramework.p036g.EnumC0679ai;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.p037h.C0734h;
import com.corrodinggames.rts.gameFramework.p038i.C0740a;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p040k.C0781f;
import com.corrodinggames.rts.gameFramework.utility.AbstractC0825e;
import com.corrodinggames.rts.gameFramework.utility.C0806a;
import com.corrodinggames.rts.gameFramework.utility.C0821d;
import com.corrodinggames.rts.gameFramework.utility.C0830i;
import com.corrodinggames.rts.p008a.AbstractC0068d;
import com.corrodinggames.rts.p008a.ActivityC0087g;
import com.corrodinggames.rts.p008a.C0067c;
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
public abstract class AbstractC0789l {

    /* renamed from: ai */
    public Context f5446ai;

    /* renamed from: aj */
    public AbstractC0068d f5447aj;

    /* renamed from: ak */
    public AbstractC0068d f5448ak;

    /* renamed from: al */
    public boolean f5449al;

    /* renamed from: aq */
    public static Throwable f5450aq;

    /* renamed from: as */
    public static boolean f5451as;

    /* renamed from: at */
    public static boolean f5452at;

    /* renamed from: au */
    public static boolean f5453au;

    /* renamed from: av */
    public static boolean f5454av;

    /* renamed from: aw */
    public static boolean f5455aw;

    /* renamed from: ax */
    public static boolean f5456ax;

    /* renamed from: ay */
    public static boolean f5457ay;

    /* renamed from: aB */
    public static boolean f5458aB;

    /* renamed from: aD */
    public static boolean f5459aD;

    /* renamed from: aQ */
    public static Class f5460aQ;

    /* renamed from: aR */
    public static AbstractC0755l f5461aR;

    /* renamed from: aT */
    public boolean f5462aT;

    /* renamed from: aZ */
    public boolean f5463aZ;

    /* renamed from: bb */
    public AbstractC0171m f5464bb;

    /* renamed from: be */
    public boolean f5465be;

    /* renamed from: bf */
    public boolean f5466bf;

    /* renamed from: bh */
    public int f5467bh;

    /* renamed from: bi */
    public int f5468bi;

    /* renamed from: bj */
    public int f5469bj;

    /* renamed from: bk */
    public int f5470bk;

    /* renamed from: bl */
    public int f5471bl;

    /* renamed from: bm */
    public boolean f5472bm;

    /* renamed from: bs */
    public C0830i f5473bs;

    /* renamed from: bt */
    public C0148b f5474bt;

    /* renamed from: bu */
    public C0530e f5475bu;

    /* renamed from: bv */
    public C0547am f5476bv;

    /* renamed from: bw */
    public AbstractC0755l f5477bw;

    /* renamed from: bx */
    public C0525a f5478bx;

    /* renamed from: by */
    public SettingsEngine f5479by;

    /* renamed from: bz */
    public C0571c f5480bz;

    /* renamed from: bA */
    public C0623f f5481bA;

    /* renamed from: bB */
    public C0537ac f5482bB;

    /* renamed from: bC */
    public C0734h f5483bC;

    /* renamed from: bD */
    public C0535aa f5484bD;

    /* renamed from: bE */
    public C0628k f5485bE;

    /* renamed from: bF */
    public Hcat_Multiplaye f5486bF;

    /* renamed from: bG */
    public C0583bg f5487bG;

    /* renamed from: bH */
    public C0656a f5488bH;

    /* renamed from: bI */
    public C0856y f5489bI;

    /* renamed from: bJ */
    public C0577ba f5490bJ;

    /* renamed from: bK */
    public C0453c f5491bK;

    /* renamed from: bL */
    public C0586bj f5492bL;

    /* renamed from: bM */
    public C0781f f5493bM;

    /* renamed from: bN */
    public C0595c f5494bN;

    /* renamed from: bP */
    public float f5495bP;

    /* renamed from: bQ */
    public float f5496bQ;

    /* renamed from: bR */
    public static Point f5497bR;

    /* renamed from: bS */
    public float f5498bS;

    /* renamed from: bT */
    public float f5499bT;

    /* renamed from: bV */
    public float f5500bV;

    /* renamed from: bW */
    public float f5501bW;

    /* renamed from: bX */
    public float f5502bX;

    /* renamed from: bY */
    public float f5503bY;

    /* renamed from: bZ */
    public float f5504bZ;

    /* renamed from: ca */
    public boolean f5505ca;

    /* renamed from: cb */
    public int f5506cb;

    /* renamed from: cc */
    public int f5507cc;

    /* renamed from: cd */
    public float f5508cd;

    /* renamed from: ce */
    public float f5509ce;

    /* renamed from: cf */
    public float f5510cf;

    /* renamed from: cg */
    public float f5511cg;

    /* renamed from: ch */
    public float f5512ch;

    /* renamed from: ci */
    public float f5513ci;

    /* renamed from: cj */
    public float f5514cj;

    /* renamed from: ck */
    public float f5515ck;

    /* renamed from: cl */
    public float f5516cl;

    /* renamed from: cm */
    public float f5517cm;

    /* renamed from: cn */
    public float f5518cn;

    /* renamed from: co */
    public float f5519co;

    /* renamed from: cp */
    public float f5520cp;

    /* renamed from: cq */
    public float f5521cq;

    /* renamed from: cy */
    public boolean f5522cy;

    /* renamed from: cz */
    public boolean f5523cz;

    /* renamed from: cA */
    public float f5524cA;

    /* renamed from: cB */
    public boolean f5525cB;

    /* renamed from: cG */
    public boolean f5526cG;

    /* renamed from: cH */
    public float f5527cH;

    /* renamed from: cI */
    public float f5528cI;

    /* renamed from: cS */
    public String f5529cS;

    /* renamed from: cT */
    public C0707k f5530cT;

    /* renamed from: cU */
    public Paint f5531cU;

    /* renamed from: cV */
    public Paint f5532cV;

    /* renamed from: cW */
    public Paint f5533cW;

    /* renamed from: dd */
    public int f5534dd;

    /* renamed from: dh */
    float f5535dh;

    /* renamed from: dl */
    public String f5536dl;

    /* renamed from: dm */
    public String f5537dm;

    /* renamed from: dn */
    public String f5538dn;

    /* renamed from: dr */
    String f5539dr;

    /* renamed from: ds */
    String f5540ds;

    /* renamed from: e */
    private int f5541e;

    /* renamed from: dw */
    static byte[] f5542dw;

    /* renamed from: dy */
    static C0821d f5543dy;

    /* renamed from: dB */
    static boolean f5544dB;

    /* renamed from: dD */
    static boolean f5545dD;

    /* renamed from: dE */
    static boolean f5546dE;

    /* renamed from: ag */
    protected static AbstractC0789l f5547ag = null;

    /* renamed from: an */
    public static boolean f5548an = true;

    /* renamed from: ao */
    public static boolean f5549ao = false;

    /* renamed from: ap */
    public static boolean f5550ap = false;

    /* renamed from: ar */
    public static boolean f5551ar = false;

    /* renamed from: az */
    public static boolean f5552az = false;

    /* renamed from: aA */
    public static boolean f5553aA = false;

    /* renamed from: aC */
    public static String f5554aC = null;

    /* renamed from: aE */
    public static boolean f5555aE = false;

    /* renamed from: aF */
    public static boolean f5556aF = false;

    /* renamed from: aG */
    public static boolean f5557aG = false;

    /* renamed from: aH */
    public static boolean f5558aH = false;

    /* renamed from: aI */
    public static boolean f5559aI = false;

    /* renamed from: aJ */
    public static boolean f5560aJ = false;

    /* renamed from: aK */
    public static String f5561aK = null;

    /* renamed from: aL */
    public static boolean f5562aL = false;

    /* renamed from: aM */
    public static boolean f5563aM = true;

    /* renamed from: aN */
    public static boolean f5564aN = true;

    /* renamed from: aO */
    public static boolean f5565aO = false;

    /* renamed from: aP */
    public static boolean f5566aP = false;

    /* renamed from: df */
    public static AbstractC0799o f5567df = new C0853v();

    /* renamed from: dg */
    public static String f5568dg = Build.VERSION.RELEASE;

    /* renamed from: dv */
    public static boolean f5569dv = false;

    /* renamed from: dx */
    static byte[] f5570dx = new byte[1000];

    /* renamed from: dz */
    static boolean f5571dz = false;

    /* renamed from: dA */
    static int f5572dA = 0;

    /* renamed from: dC */
    static EnumC0805u f5573dC = null;

    /* renamed from: ah */
    public Context f5574ah = null;

    /* renamed from: am */
    public boolean f5575am = false;

    /* renamed from: aS */
    public boolean f5576aS = false;

    /* renamed from: aU */
    public boolean f5577aU = false;

    /* renamed from: aV */
    public boolean f5578aV = false;

    /* renamed from: aW */
    public boolean f5579aW = false;

    /* renamed from: aX */
    public boolean f5580aX = false;

    /* renamed from: aY */
    public boolean f5581aY = false;

    /* renamed from: ba */
    public boolean f5582ba = false;

    /* renamed from: bc */
    public float f5583bc = 1.0f;

    /* renamed from: bd */
    public float f5584bd = -1.0f;

    /* renamed from: bg */
    public int f5585bg = 0;

    /* renamed from: bn */
    public boolean f5586bn = false;

    /* renamed from: bo */
    public volatile boolean f5587bo = false;

    /* renamed from: bp */
    public volatile boolean f5588bp = false;

    /* renamed from: bq */
    public volatile boolean f5589bq = false;

    /* renamed from: br */
    public volatile boolean f5590br = false;

    /* renamed from: bO */
    public boolean f5591bO = false;

    /* renamed from: bU */
    public float f5592bU = 1.0f;

    /* renamed from: cr */
    public final Rect f5593cr = new Rect();

    /* renamed from: cs */
    public final Rect f5594cs = new Rect();

    /* renamed from: ct */
    public final RectF f5595ct = new RectF();

    /* renamed from: cu */
    public final Rect f5596cu = new Rect();

    /* renamed from: cv */
    public final RectF f5597cv = new RectF();

    /* renamed from: cw */
    public final RectF f5598cw = new RectF();

    /* renamed from: cx */
    public final Rect f5599cx = new Rect();

    /* renamed from: cC */
    public float f5600cC = 1.0f;

    /* renamed from: cD */
    public boolean f5601cD = false;

    /* renamed from: cE */
    public float f5602cE = 1.0f;

    /* renamed from: cF */
    public float f5603cF = 1.0f;

    /* renamed from: cJ */
    public boolean f5604cJ = true;

    /* renamed from: cK */
    public boolean f5605cK = true;

    /* renamed from: cL */
    public boolean f5606cL = true;

    /* renamed from: cM */
    public boolean f5607cM = true;

    /* renamed from: cN */
    public boolean f5608cN = true;

    /* renamed from: cO */
    public float f5609cO = 0.0f;

    /* renamed from: cP */
    public float f5610cP = 0.0f;

    /* renamed from: cQ */
    public boolean f5611cQ = false;

    /* renamed from: cR */
    protected C0857z f5612cR = null;

    /* renamed from: cX */
    public boolean f5613cX = false;

    /* renamed from: cY */
    public boolean f5614cY = false;

    /* renamed from: cZ */
    public float f5615cZ = 0.0f;

    /* renamed from: da */
    public boolean f5616da = false;

    /* renamed from: db */
    public boolean f5617db = false;

    /* renamed from: dc */
    public boolean f5618dc = false;

    /* renamed from: de */
    public float f5619de = 0.0f;

    /* renamed from: di */
    boolean f5620di = false;

    /* renamed from: dj */
    ArrayList f5621dj = new ArrayList();

    /* renamed from: dk */
    final Handler f5622dk = new Handler(Looper.m4405b());

    /* renamed from: a */
    private Runnable f5623a = new RunnableC07901();

    /* renamed from: b */
    private Runnable f5624b = new RunnableC07912();

    /* renamed from: do */
    public AbstractC0798n f5625do = null;

    /* renamed from: dp */
    String f5626dp = null;

    /* renamed from: dq */
    Object f5627dq = new Object();

    /* renamed from: dt */
    public boolean[] f5628dt = new boolean[10];

    /* renamed from: du */
    protected ConcurrentLinkedQueue f5629du = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private boolean[] f5630c = new boolean[KeyEvent.m4354a() + 1];

    /* renamed from: d */
    private boolean[] f5631d = new boolean[KeyEvent.m4354a() + 1];

    /* renamed from: dF */
    public byte f5632dF = 42;

    /* renamed from: dG */
    public byte f5633dG = 42;

    /* renamed from: dH */
    public final C0801q f5634dH = new C0801q();

    /* renamed from: dI */
    public final C0801q f5635dI = new C0801q();

    /* renamed from: dJ */
    public final C0801q f5636dJ = new C0801q();

    /* renamed from: a */
    public abstract void m739a(Context context);

    /* renamed from: a */
    public abstract boolean m747a();

    /* renamed from: a */
    public abstract boolean m724a(boolean z);

    /* renamed from: a */
    public abstract void m740a(Activity activity, AbstractC0068d dVar, boolean z);

    /* renamed from: b */
    public abstract void m698b(int i, int i2);

    /* renamed from: c */
    public abstract int m686c(boolean z);

    /* renamed from: j */
    public abstract boolean m666j();

    /* renamed from: l */
    public abstract boolean m660l();

    /* renamed from: k */
    public abstract boolean m663k();

    /* renamed from: h */
    public abstract String m672h();

    /* renamed from: i */
    public abstract String m669i();

    /* renamed from: m */
    public abstract String m658m();

    /* renamed from: n */
    public abstract String m656n();

    /* renamed from: o */
    public abstract String m655o();

    /* renamed from: a */
    public abstract void m722a(boolean z, boolean z2, EnumC0803s sVar);

    /* renamed from: a */
    public abstract void m723a(boolean z, EnumC0803s sVar);

    /* renamed from: c */
    public abstract void m692c();

    /* renamed from: q */
    public abstract void m654q();

    /* renamed from: a */
    public abstract void m744a(float f, int i);

    /* renamed from: b */
    public abstract void m700b(float f, int i);

    /* renamed from: s */
    public abstract int m653s();

    /* renamed from: b */
    public abstract int m702b();

    /* renamed from: b */
    public static boolean m696b(Context context) {
        String str;
        if (f5556aF) {
            str = "dedicatedServer";
        } else {
            str = context.mo4607g().mo4606h();
        }
        Log.m4366d("RustedWarfare", "packageName:" + str);
        if (str.contains("rtsdemo")) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean m652t() {
        return this.f5523cz || this.f5524cA > 0.0f || this.f5525cB;
    }

    /* renamed from: u */
    public static final AbstractC0789l m651u() {
        return f5547ag;
    }

    /* renamed from: v */
    public static final boolean m650v() {
        return f5565aO;
    }

    /* renamed from: w */
    public static final boolean m649w() {
        return f5566aP;
    }

    /* renamed from: c */
    public void m689c(Context context) {
        C0067c.m4292a(context);
        this.f5574ah = context;
    }

    /* renamed from: a */
    public static synchronized AbstractC0789l m738a(Context context, AbstractC0798n nVar) {
        if (f5547ag != null) {
            if (nVar != null) {
                f5547ag.f5625do = nVar;
            }
            f5547ag.m689c(context);
            return f5547ag;
        }
        f5547ag = f5567df.mo407a(context);
        m683d("Created new gameEngine of:" + f5547ag.getClass().getName());
        if (nVar != null) {
            f5547ag.f5625do = nVar;
        }
        f5547ag.m739a(context);
        return f5547ag;
    }

    public AbstractC0789l(Context context) {
        Log.m4366d("RustedWarfare", "GameEngine:GameEngine()");
        if (f5547ag != null) {
            throw new RuntimeException("gameEngine already created");
        }
        m689c(context);
        f5547ag = this;
    }

    protected void finalize() {
        Log.m4366d("RustedWarfare", "GameEngine:finalize()");
        super.finalize();
    }

    /* renamed from: x */
    public boolean m648x() {
        return true;
    }

    /* renamed from: y */
    public void m647y() {
    }

    /* renamed from: z */
    public String m646z() {
        if (m710al()) {
            return "PC";
        }
        if (f5560aJ) {
            String a = C0740a.m905a();
            if (a != null) {
                return "IOS - " + a;
            }
            return "IOS";
        } else if (f5556aF) {
            return "SERVER";
        } else {
            return Build.MODEL;
        }
    }

    /* renamed from: A */
    public String m773A() {
        return f5568dg;
    }

    /* renamed from: B */
    public boolean m772B() {
        if (this.f5589bq) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public synchronized void m771C() {
        m683d("--- setRunning ---");
        if (!m710al() && !f5560aJ) {
            this.f5476bv.m2109h();
        }
        if (!f5557aG && !f5562aL && this.f5612cR == null) {
            this.f5612cR = new C0857z();
            this.f5612cR.m377a(true);
            this.f5612cR.start();
        }
    }

    /* renamed from: D */
    public synchronized void m770D() {
        m683d("--- setStoppedIfNotInGameThread ---");
        if (Thread.currentThread() != this.f5612cR) {
            m769E();
        }
    }

    /* renamed from: E */
    public synchronized void m769E() {
        m683d("--- setStopped ---");
        if (this.f5612cR == null) {
            Log.m4366d("RustedWarfare", "gameThread already null");
            return;
        }
        if (!m710al()) {
            this.f5476bv.m2111f();
        }
        this.f5612cR.m377a(false);
        if (Thread.currentThread() != this.f5612cR) {
            boolean z = true;
            while (z) {
                try {
                    this.f5612cR.join();
                    z = false;
                } catch (InterruptedException e) {
                }
            }
            Log.m4366d("RustedWarfare", "thread stop");
        } else {
            m676f("currentThread is game thread");
        }
        this.f5612cR = null;
        if (this.f5447aj != null) {
            this.f5447aj.mo208n();
        }
        if (this.f5586bn) {
            Debug.stopMethodTracing();
        }
    }

    /* renamed from: F */
    public boolean m768F() {
        if (this.f5486bF != null && this.f5486bF.f4734z && !this.f5486bF.f4735D && !this.f5490bJ.m1995h()) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public boolean m767G() {
        if (this.f5486bF == null) {
            return false;
        }
        return this.f5486bF.f4734z;
    }

    /* renamed from: H */
    public boolean m766H() {
        if (this.f5486bF == null) {
            return false;
        }
        return this.f5486bF.f4735D || this.f5486bF.f4734z || this.f5490bJ.m1995h();
    }

    /* renamed from: I */
    public boolean m765I() {
        if (this.f5486bF != null && !this.f5486bF.f4735D) {
            return !this.f5486bF.f4734z && !this.f5490bJ.m1995h();
        }
        return true;
    }

    /* renamed from: J */
    public void m764J() {
        this.f5505ca = false;
        if (this.f5510cf < 0.0f) {
            this.f5510cf = 0.0f;
            this.f5505ca = true;
        }
        if (this.f5511cg < 0.0f) {
            this.f5511cg = 0.0f;
            this.f5505ca = true;
        }
        if (this.f5474bt != null) {
            if (this.f5510cf > this.f5474bt.m3975f() - this.f5516cl) {
                this.f5510cf = this.f5474bt.m3975f() - this.f5516cl;
                this.f5505ca = true;
            }
            if (this.f5511cg > this.f5474bt.m3972g() - this.f5513ci) {
                this.f5511cg = this.f5474bt.m3972g() - this.f5513ci;
                this.f5505ca = true;
            }
            if (this.f5516cl > this.f5474bt.m3975f()) {
                this.f5510cf = (this.f5474bt.m3975f() / 2.0f) - (this.f5516cl / 2.0f);
                this.f5505ca = true;
            }
            if (this.f5513ci > this.f5474bt.m3972g()) {
                this.f5511cg = (this.f5474bt.m3972g() / 2.0f) - (this.f5513ci / 2.0f);
                this.f5505ca = true;
            }
        }
        m746a(this.f5510cf, this.f5511cg);
    }

    /* renamed from: a */
    public void m746a(float f, float f2) {
        this.f5510cf = f;
        this.f5511cg = f2;
        this.f5506cb = (int) this.f5510cf;
        this.f5507cc = (int) this.f5511cg;
        this.f5508cd = ((int) (this.f5510cf * this.f5602cE)) / this.f5602cE;
        this.f5509ce = ((int) (this.f5511cg * this.f5602cE)) / this.f5602cE;
        int i = 90;
        if (m650v()) {
            i = 210;
        }
        this.f5596cu.m4469a((int) (this.f5510cf - i), (int) (this.f5511cg - i), (int) (this.f5510cf + this.f5512ch + i), (int) (this.f5511cg + this.f5513ci + i));
        this.f5597cv.m4454a(this.f5596cu);
        this.f5599cx.m4469a((int) this.f5510cf, (int) this.f5511cg, (int) (this.f5510cf + this.f5512ch), (int) (this.f5511cg + this.f5513ci));
        this.f5598cw.m4455a((int) (this.f5510cf - 300), (int) (this.f5511cg - 300), (int) (this.f5510cf + this.f5512ch + 300), (int) (this.f5511cg + this.f5513ci + 300));
    }

    /* renamed from: b */
    public void m701b(float f, float f2) {
        m746a(f - (this.f5516cl / 2.0f), f2 - (this.f5513ci / 2.0f));
    }

    /* renamed from: d */
    public static boolean m684d(Context context) {
        if (f5556aF) {
            return false;
        }
        if (!Build.MODEL.equals("GT-I9100") && !Build.MODEL.equals("GT-I9300")) {
            return false;
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) context.mo4612b("wifi")).getConnectionInfo();
            if (connectionInfo == null) {
                return false;
            }
            if ("BlueStacks".equals(connectionInfo.getSSID())) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: K */
    public void m763K() {
        if (this.f5602cE != 1.0f) {
            this.f5477bw.mo200a(this.f5602cE, this.f5602cE);
        }
    }

    /* renamed from: L */
    public void m762L() {
        if (this.f5602cE != 1.0f) {
            this.f5477bw.mo200a(1.0f / this.f5602cE, 1.0f / this.f5602cE);
        }
    }

    /* renamed from: a */
    public static void m729a(String str, Exception exc) {
        m683d(str);
        exc.printStackTrace();
    }

    /* renamed from: a */
    public static String m728a(String str, String str2) {
        if (f5551ar && !str.contains("\u001b[0m")) {
            str = str2 + str + "\u001b[0m";
        }
        return str;
    }

    /* renamed from: a */
    public static void m732a(String str) {
        m683d(m728a("--- ERROR: " + str, "\u001b[31m"));
    }

    /* renamed from: b */
    public static void m695b(String str) {
        m683d(m728a(str, "\u001b[33m"));
    }

    /* renamed from: a */
    public static void m727a(String str, Throwable th) {
        m695b(str);
        m683d("" + th.toString());
        m683d("cause:" + th.getCause());
        th.printStackTrace();
    }

    /* renamed from: c */
    public static void m688c(String str) {
        if (f5558aH) {
            Log.m4370b("RustedWarfare", str);
        } else {
            Log.m4370b("RustedWarfare", str);
        }
    }

    /* renamed from: d */
    public static void m683d(String str) {
        m688c(str);
    }

    /* renamed from: b */
    public static void m694b(String str, String str2) {
        m688c(str + ":" + str2);
    }

    /* renamed from: e */
    public static synchronized void m679e(String str) {
        m688c(str + " (at " + System.nanoTime() + ")");
    }

    /* renamed from: M */
    public static void m761M() {
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            m683d(stackTraceElement.toString());
        }
    }

    /* renamed from: f */
    public static void m676f(String str) {
        m695b(str);
        m761M();
    }

    /* renamed from: N */
    public static long m760N() {
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public static final boolean m741a(long j, long j2) {
        long N = m760N();
        if (j + j2 >= N && N >= j - 1000) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public float m759O() {
        float f = this.f5495bP;
        if (this.f5479by != null) {
            f = f * this.f5479by.renderDensity * this.f5479by.uiRenderScale;
            if (this.f5479by.renderDoubleScale) {
                return f / 2.0f;
            }
        }
        return f;
    }

    /* renamed from: e */
    public int m681e(float f) {
        return (int) ((f * this.f5496bQ) + 0.5f);
    }

    /* renamed from: a */
    public int m743a(int i) {
        return (int) ((i * this.f5496bQ) + 0.5f);
    }

    /* renamed from: P */
    public void m758P() {
        if (this.f5535dh != this.f5496bQ) {
            m683d("Density size changed, refreshing fonts");
            synchronized (this.f5621dj) {
                Iterator it = this.f5621dj.iterator();
                while (it.hasNext()) {
                    ((C0797m) it.next()).m629a();
                }
            }
            this.f5535dh = this.f5496bQ;
        }
    }

    /* renamed from: Q */
    protected void m757Q() {
        Iterator it = this.f5621dj.iterator();
        while (it.hasNext()) {
            this.f5477bw.mo187a(((C0797m) it.next()).f5644b);
        }
        this.f5620di = true;
    }

    /* renamed from: a */
    public void m737a(Paint paint) {
        m736a(paint, 16.0f);
    }

    /* renamed from: a */
    public void m736a(Paint paint, float f) {
        C0797m mVar = new C0797m(this);
        mVar.f5643a = f;
        mVar.f5644b = paint;
        mVar.m629a();
        synchronized (this.f5621dj) {
            this.f5621dj.add(mVar);
        }
        if (this.f5620di) {
            this.f5477bw.mo187a(mVar.f5644b);
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.l$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l$1.class */
    class RunnableC07901 implements Runnable {
        RunnableC07901() {
        }

        public void run() {
            Toast.makeText(AbstractC0789l.this.f5574ah, AbstractC0789l.this.f5536dl, 1).show();
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.l$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l$2.class */
    class RunnableC07912 implements Runnable {
        RunnableC07912() {
        }

        /* renamed from: com.corrodinggames.rts.gameFramework.l$2$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l$2$1.class */
        class DialogInterface$OnClickListenerC07921 implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC07921() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                AbstractC0789l.this.f5463aZ = false;
            }
        }

        public void run() {
            DialogInterface$OnClickListenerC07921 r0 = new DialogInterface$OnClickListenerC07921();
            DialogInterface$OnCancelListenerC07932 r02 = new DialogInterface$OnCancelListenerC07932();
            AbstractC0789l.m683d("showMessageBoxRunnable context:" + AbstractC0789l.this.f5574ah.getClass().getName());
            try {
                new AlertDialog.Builder(AbstractC0789l.this.f5574ah).setIcon(17301543).setTitle(AbstractC0789l.this.f5537dm).setMessage(AbstractC0789l.this.f5538dn).setOnCancelListener(r02).setPositiveButton("Ok", r0).show();
            } catch (WindowManager.BadTokenException e) {
                AbstractC0789l.m695b("Failed to show message: " + AbstractC0789l.this.f5538dn);
                e.printStackTrace();
            }
        }

        /* renamed from: com.corrodinggames.rts.gameFramework.l$2$2 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l$2$2.class */
        class DialogInterface$OnCancelListenerC07932 implements DialogInterface.OnCancelListener {
            DialogInterface$OnCancelListenerC07932() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                AbstractC0789l.this.f5463aZ = false;
            }
        }
    }

    /* renamed from: g */
    public void m673g(String str) {
        m726a(str, true);
    }

    /* renamed from: a */
    public void m726a(String str, boolean z) {
        this.f5626dp = str;
        if (this.f5625do != null) {
            this.f5625do.mo104a(str, z);
        }
    }

    /* renamed from: R */
    public void m756R() {
        this.f5626dp = null;
    }

    /* renamed from: h */
    public void m670h(String str) {
        m731a(str, 1);
    }

    /* renamed from: a */
    public void m731a(String str, int i) {
        if (f5556aF) {
            m683d("alert:" + str);
        } else {
            this.f5536dl = str;
            this.f5622dk.m4415a(this.f5623a);
        }
        if (this.f5625do != null) {
            this.f5625do.mo106a(str, i);
        }
    }

    /* renamed from: a */
    public void m730a(String str, C0311ag agVar) {
        String str2 = null;
        if (agVar != null) {
            str2 = agVar.m3314b();
        }
        m687c(str, str2);
    }

    /* renamed from: c */
    public void m687c(String str, String str2) {
        if (this.f5625do != null) {
            this.f5625do.mo105a(str, str2);
        }
        if (!f5556aF) {
            this.f5463aZ = true;
            this.f5537dm = str;
            this.f5538dn = str2;
            this.f5622dk.m4415a(this.f5624b);
        } else if (this.f5625do == null) {
            m695b("showMessageBox: not showing due to non-android:" + str2);
        }
    }

    /* renamed from: S */
    public void m755S() {
        synchronized (this.f5627dq) {
            if (this.f5539dr != null) {
                m687c(this.f5540ds, this.f5539dr);
                this.f5539dr = null;
                this.f5540ds = null;
            }
        }
    }

    /* renamed from: d */
    public void m682d(String str, String str2) {
        this.f5540ds = str;
        this.f5539dr = str2;
        if (f5557aG) {
            m755S();
        } else {
            new C07943().start();
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.l$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l$3.class */
    class C07943 extends Thread {
        C07943() {
        }

        public void run() {
            try {
                sleep(3000L);
            } catch (InterruptedException e) {
            }
            AbstractC0789l.this.m755S();
        }
    }

    /* renamed from: T */
    public boolean m754T() {
        if (!this.f5449al && this.f5447aj.mo209m() != null) {
            return this.f5447aj.mo209m().m4258b();
        }
        return false;
    }

    /* renamed from: U */
    public void m753U() {
        if (this.f5447aj.mo209m() != null) {
            this.f5447aj.mo209m().m4257c();
        }
    }

    /* renamed from: V */
    public int m752V() {
        if (this.f5449al) {
            return 0;
        }
        return this.f5447aj.mo209m().m4261a();
    }

    /* renamed from: W */
    public float m751W() {
        return m699b(0);
    }

    /* renamed from: X */
    public float m750X() {
        return m691c(0);
    }

    /* renamed from: b */
    public float m699b(int i) {
        if (this.f5479by.renderDoubleScale) {
            return this.f5447aj.mo209m().m4256d()[i] / 2.0f;
        }
        return this.f5447aj.mo209m().m4256d()[i];
    }

    /* renamed from: c */
    public float m691c(int i) {
        if (this.f5479by.renderDoubleScale) {
            return this.f5447aj.mo209m().m4254f()[i] / 2.0f;
        }
        return this.f5447aj.mo209m().m4254f()[i];
    }

    /* renamed from: d */
    public int m685d(int i) {
        return this.f5447aj.mo209m().m4255e()[i];
    }

    /* renamed from: e */
    public boolean m680e(int i) {
        if (i != 1 && i != 2 && i != 3) {
            throw new RuntimeException("Unknown mouseButton:" + i);
        } else if (m677f(i) != -1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public int m677f(int i) {
        if (i == 0) {
            throw new RuntimeException("finding state of 0 doesn't make sense");
        }
        int[] e = this.f5447aj.mo209m().m4255e();
        for (int i2 = 0; i2 < e.length; i2++) {
            if (e[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public boolean m674g(int i) {
        if (i >= this.f5630c.length || i < 0 || !this.f5630c[i] || !this.f5631d[i]) {
            return false;
        }
        this.f5631d[i] = false;
        return true;
    }

    /* renamed from: h */
    public boolean m671h(int i) {
        if (i >= this.f5630c.length || i < 0) {
            return false;
        }
        return this.f5630c[i];
    }

    /* renamed from: a */
    public boolean m742a(int i, boolean z) {
        boolean z2 = true;
        boolean z3 = true;
        int Y = m749Y();
        if ((i & 2) != 0) {
            if ((Y & 2) == 0) {
                z2 = false;
            }
        } else if ((Y & 2) != 0) {
            z3 = false;
        }
        if ((i & 1) != 0) {
            if ((Y & 1) == 0) {
                z2 = false;
            }
        } else if ((Y & 1) != 0) {
            z3 = false;
        }
        if ((i & 4) != 0) {
            if ((Y & 4) == 0) {
                z2 = false;
            }
        } else if ((Y & 4) != 0) {
            z3 = false;
        }
        if (z) {
            return z2;
        }
        return z2 && z3;
    }

    /* renamed from: i */
    public boolean m668i(int i) {
        if (i == 59 || i == 60 || i == 113 || i == 114 || i == 57 || i == 58) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static String m665j(int i) {
        String str = "";
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

    /* renamed from: Y */
    public int m749Y() {
        int i = 0;
        if (m671h(59) || m671h(60)) {
            i = 0 + 2;
        }
        if (m671h(113) || m671h(114)) {
            i++;
        }
        if (m671h(57) || m671h(58)) {
            i += 4;
        }
        return i;
    }

    /* renamed from: c */
    public boolean m690c(int i, int i2) {
        boolean z = false;
        boolean z2 = false;
        if (i >= 0 && i < this.f5630c.length) {
            z = this.f5630c[i];
        }
        if (i2 >= 0 && i2 < this.f5630c.length) {
            z2 = this.f5630c[i2];
        }
        return z || z2;
    }

    /* renamed from: b */
    public void m697b(int i, boolean z) {
        if (i < 0 || i >= this.f5630c.length) {
            m683d("setKeyState: Key out of range:" + i);
            return;
        }
        this.f5630c[i] = z;
        if (z) {
            this.f5631d[i] = z;
        }
    }

    /* renamed from: k */
    public void m662k(int i) {
        this.f5629du.add(new C0804t(this, i));
    }

    /* renamed from: Z */
    public int m748Z() {
        return this.f5541e;
    }

    /* renamed from: aa */
    protected void m721aa() {
        this.f5541e = 0;
        while (true) {
            C0800p pVar = (C0800p) this.f5629du.poll();
            if (pVar != null) {
                if (pVar instanceof C0802r) {
                    C0802r rVar = (C0802r) pVar;
                    if (rVar.f5649c >= this.f5630c.length || rVar.f5649c < 0) {
                        m694b("updateKeyState", "keyCode (" + rVar.f5649c + ") is out of range");
                    } else {
                        this.f5630c[rVar.f5649c] = !rVar.f5650d;
                        this.f5631d[rVar.f5649c] = !rVar.f5650d;
                    }
                } else if (pVar instanceof C0804t) {
                    this.f5541e += ((C0804t) pVar).f5655c;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public static String m667i(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: j */
    public static String m664j(String str) {
        int i;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            i = 0;
        } else {
            i = lastIndexOf + 1;
        }
        return str.substring(i);
    }

    /* renamed from: k */
    public static Integer m661k(String str) {
        String j = m664j(str);
        m683d("getMapLevel for :" + str + " file:" + j);
        Matcher matcher = Pattern.compile("^l(\\d*);.*").matcher(j);
        if (!matcher.matches()) {
            return null;
        }
        m683d("getMapLevel:" + str + ":" + Integer.parseInt(matcher.group(1)));
        return Integer.valueOf(Integer.parseInt(matcher.group(1)));
    }

    /* renamed from: l */
    public static String m659l(String str) {
        AbstractC0789l u = m651u();
        Integer k = m661k(str);
        if (k == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        String substring = str.substring(0, lastIndexOf);
        String[] a = C0596a.m1947a(substring, true);
        if (a == null) {
            return null;
        }
        for (String str2 : a) {
            Integer k2 = m661k(str2);
            if (k2 != null && k2.intValue() > k.intValue() && (!u.f5575am || ActivityC0087g.m4271a(str2, substring + "/" + str2))) {
                return substring + "/" + str2;
            }
        }
        return null;
    }

    /* renamed from: ab */
    public String m720ab() {
        return this.f5529cS;
    }

    /* renamed from: ac */
    public String m719ac() {
        String str = this.f5529cS;
        if ((this.f5529cS == null || "".equals(this.f5529cS)) && m767G()) {
            str = this.f5486bF.f4764aI;
        }
        return ActivityC0087g.m4268d(ActivityC0087g.m4269c(str));
    }

    /* renamed from: ad */
    public String m718ad() {
        return ActivityC0087g.m4269c(this.f5529cS);
    }

    /* renamed from: ae */
    public EnumC0679ai m717ae() {
        if (ActivityC0087g.m4266f(this.f5529cS)) {
            return EnumC0679ai.f4825b;
        }
        return EnumC0679ai.f4824a;
    }

    /* renamed from: a */
    public static String m725a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String obj = stringWriter.toString();
        printWriter.close();
        return obj;
    }

    /* renamed from: b */
    public static String m693b(Throwable th) {
        String str;
        String message = th.getMessage();
        if (message == null) {
            str = th.getClass().getName();
        } else {
            str = message.replace("java.lang.RuntimeException: ", "").replace("java.lang.RuntimeException: ", "");
        }
        Throwable th2 = th;
        while (th2 != null) {
            Throwable cause = th2.getCause();
            if (cause == null || cause == th || cause == th2) {
                break;
            }
            th2 = cause;
        }
        if (!(th2 == null || th2 == th)) {
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

    /* renamed from: e */
    public static void m678e(String str, String str2) {
        try {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File(C0596a.m1944c("/SD/rustedWarfare/crashes.txt")), true));
            printWriter.write("\r\n" + str + " (at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + ")\n");
            printWriter.write(str2 + "\r\n");
            printWriter.close();
        } catch (Throwable th) {
            m683d("Exception in writeCrashToFile");
            th.printStackTrace();
        }
    }

    /* renamed from: af */
    public static void m716af() {
        if (!f5549ao || f5556aF) {
            return;
        }
        if (f5543dy != null) {
            m695b("setupANRWatchDog: activeANRWatchDog!=null");
            return;
        }
        f5543dy = new C0821d(4000);
        f5543dy.m520a(new C07954());
        f5543dy.start();
        m695b("setupANRWatchDog: running");
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.l$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l$4.class */
    final class C07954 implements AbstractC0825e {
        C07954() {
        }

        /* renamed from: a */
        public void mo519a(C0806a aVar) {
            if (AbstractC0789l.f5571dz) {
                AbstractC0789l.m695b("activeANRWatchDog: ANR already detected");
            }
            AbstractC0789l.f5571dz = true;
            AbstractC0789l.m695b("activeANRWatchDog: ANR detected");
            String a = AbstractC0789l.m725a(aVar);
            C0710n.m1052a("detectedANR", a);
            try {
                Thread.sleep(400L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(C0856y.m383a("lastFreeze", "", true));
                PrintStream printStream = new PrintStream(fileOutputStream);
                printStream.print(a);
                printStream.close();
                fileOutputStream.close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: ag */
    public static void m715ag() {
        if (f5542dw == null && m710al()) {
            f5542dw = new byte[2500000];
            f5542dw[0] = 2;
            f5542dw[f5542dw.length - 1] = 5;
        }
        if (f5453au) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
            if (!(uncaughtExceptionHandler instanceof C0739i)) {
                Thread.currentThread().setUncaughtExceptionHandler(new C0739i(uncaughtExceptionHandler));
                return;
            }
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (!(defaultUncaughtExceptionHandler instanceof C0739i)) {
            Thread.setDefaultUncaughtExceptionHandler(new C0739i(defaultUncaughtExceptionHandler));
        }
    }

    /* renamed from: ah */
    public boolean m714ah() {
        return true;
    }

    /* renamed from: ai */
    public boolean m713ai() {
        return true;
    }

    /* renamed from: m */
    public static void m657m(String str) {
        AbstractC0789l u = m651u();
        if (u != null) {
            f5572dA++;
            if (f5572dA < 1000) {
                m695b("reportProblem: " + str);
            }
            if (f5572dA < 10) {
                u.m731a(str, 1);
            }
        }
    }

    /* renamed from: aj */
    public static boolean m712aj() {
        return !f5556aF;
    }

    /* renamed from: ak */
    public static boolean m711ak() {
        return !f5557aG || f5560aJ;
    }

    /* renamed from: al */
    public static boolean m710al() {
        return f5557aG && !f5560aJ;
    }

    /* renamed from: am */
    public static boolean m709am() {
        return f5557aG && !f5560aJ;
    }

    /* renamed from: an */
    public static boolean m708an() {
        return f5556aF && !f5557aG;
    }

    /* renamed from: ao */
    public boolean m707ao() {
        return this.f5486bF.f4734z || this.f5490bJ.m1995h();
    }

    /* renamed from: a */
    public void m735a(AbstractC0210af afVar, float f) {
        this.f5485bE.m1688a((int) afVar.f5841dH, (int) afVar.f5842dI, f, afVar);
        this.f5481bA.f4279f.m1632c(afVar);
    }

    /* renamed from: ap */
    public static void m706ap() {
        System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : Long.valueOf(maxMemory)));
        System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());
    }

    /* renamed from: aq */
    public Context m705aq() {
        return this.f5574ah;
    }

    /* renamed from: f */
    public static void m675f(String str, String str2) {
        AbstractC0789l u = m651u();
        if (u != null) {
            if (u.f5481bA == null || u.f5481bA.f4278e == null) {
                m676f("addMessage: interfaceEngine/messageInterface==null");
            } else {
                u.f5481bA.f4278e.m1697a(str, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m734a(EnumC0805u uVar, Throwable th) {
        f5570dx = null;
        m683d("reportCaughtOutOfMemory:" + f5573dC);
        if (f5573dC == null) {
            f5573dC = uVar;
            if (th != null) {
                th.printStackTrace();
            }
            m706ap();
        }
    }

    /* renamed from: ar */
    public void m704ar() {
        if (f5545dD && !f5546dE) {
            f5546dE = true;
            String str = "Warning game has less than 5mb of free space remaining. A larger battle might cause a crash. ";
            int f = this.f5488bH.m1448f();
            if (f > 1) {
                str = str + "This is often caused by large mods, you currently have: " + f + " mods loaded. ";
            }
            m687c("Warning: Low memory detected", str);
        }
        if (!f5544dB && f5573dC != null) {
            m683d("Showing out of memory message");
            f5544dB = true;
            String str2 = "trying to load data";
            if (f5573dC == EnumC0805u.f5657a) {
                str2 = "trying to load game textures";
            } else if (f5573dC == EnumC0805u.f5658b) {
                str2 = "trying to create a texture";
            } else if (f5573dC == EnumC0805u.f5659c) {
                str2 = "trying to colour new texture";
            } else if (f5573dC == EnumC0805u.f5660d) {
                str2 = "trying to create texture buffer for on-screen fog fading";
            } else if (f5573dC == EnumC0805u.f5661e) {
                str2 = "trying to create game fonts";
            } else if (f5573dC == EnumC0805u.f5662f) {
                str2 = "trying to load game sounds";
            } else if (f5573dC == EnumC0805u.f5663g) {
                str2 = "trying to load UI textures";
            }
            String str3 = "The game ran out of memory " + str2 + ". ";
            int f2 = this.f5488bH.m1448f();
            if (f2 > 1) {
                str3 = str3 + "This is often caused by large mods, you currently have: " + f2 + " mods. ";
            }
            if (m710al() && !C0166i.f1150b) {
                str3 = str3 + "You are also using the 32 bit version, switching to the 64 bit version might help. ";
            }
            m687c("Warning: Out Of Memory", str3);
        }
    }

    /* renamed from: as */
    public void m703as() {
        try {
            byte[] bArr = new byte[5000000];
            bArr[0] = this.f5632dF;
            this.f5633dG = bArr[1];
        } catch (OutOfMemoryError e) {
            System.gc();
            m683d("Low memory detected");
            e.printStackTrace();
            f5545dD = true;
        }
    }

    /* renamed from: a */
    public void m733a(Runnable runnable) {
        this.f5635dI.m626a(runnable);
    }

    /* renamed from: a */
    public final boolean m745a(float f, float f2, float f3) {
        return this.f5595ct.f231a < f + f3 && f - f3 < this.f5595ct.f233c && this.f5595ct.f232b < f2 + f3 && f2 - f3 < this.f5595ct.f234d;
    }
}

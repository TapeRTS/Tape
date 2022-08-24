package com.corrodinggames.rts.gameFramework.p041i;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.appFramework.ActivityC0088a;
import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.appFramework.ActivityC0122n;
import com.corrodinggames.rts.appFramework.ActivityC0129p;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.C0187e;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0401bb;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0765c;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0767e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.rudp.C0017h;

/* renamed from: com.corrodinggames.rts.gameFramework.i.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ad.class */
public final class C0831ad {

    /* renamed from: f */
    ArrayList f5469f;

    /* renamed from: g */
    public boolean f5470g;

    /* renamed from: i */
    public boolean f5471i;

    /* renamed from: j */
    public float f5472j;

    /* renamed from: k */
    public float f5473k;

    /* renamed from: m */
    public int f5474m;

    /* renamed from: n */
    public String f5475n;

    /* renamed from: o */
    public boolean f5476o;

    /* renamed from: p */
    public boolean f5477p;

    /* renamed from: q */
    public boolean f5478q;

    /* renamed from: s */
    public boolean f5479s;

    /* renamed from: u */
    public String f5480u;

    /* renamed from: y */
    public String f5481y;

    /* renamed from: bT */
    private boolean f5482bT;

    /* renamed from: z */
    public Team f5483z;

    /* renamed from: A */
    public boolean f5484A;

    /* renamed from: C */
    public boolean f5485C;

    /* renamed from: D */
    public boolean f5486D;

    /* renamed from: E */
    public String f5487E;

    /* renamed from: G */
    public boolean f5488G;

    /* renamed from: H */
    public boolean f5489H;

    /* renamed from: K */
    public Float f5490K;

    /* renamed from: L */
    public String f5491L;

    /* renamed from: N */
    public boolean f5492N;

    /* renamed from: O */
    public int f5493O;

    /* renamed from: P */
    public int f5494P;

    /* renamed from: Q */
    public int f5495Q;

    /* renamed from: R */
    public int f5496R;

    /* renamed from: S */
    public String f5497S;

    /* renamed from: Y */
    public boolean f5498Y;

    /* renamed from: Z */
    public float f5499Z;

    /* renamed from: aa */
    boolean f5500aa;

    /* renamed from: ab */
    public float f5501ab;

    /* renamed from: ac */
    public float f5502ac;

    /* renamed from: ad */
    public boolean f5503ad;

    /* renamed from: ae */
    public float f5504ae;

    /* renamed from: af */
    public boolean f5505af;

    /* renamed from: ag */
    public boolean f5506ag;

    /* renamed from: aj */
    public boolean f5507aj;

    /* renamed from: ak */
    public boolean f5508ak;

    /* renamed from: al */
    public boolean f5509al;

    /* renamed from: am */
    public long f5510am;

    /* renamed from: aD */
    public boolean f5511aD;

    /* renamed from: aF */
    public int f5512aF;

    /* renamed from: aG */
    public int f5513aG;

    /* renamed from: aH */
    public int f5514aH;

    /* renamed from: aI */
    public static boolean f5515aI;

    /* renamed from: aK */
    long f5516aK;

    /* renamed from: aL */
    public boolean f5517aL;

    /* renamed from: aQ */
    public C0876k f5518aQ;

    /* renamed from: aR */
    public C0876k f5519aR;

    /* renamed from: aT */
    Thread f5520aT;

    /* renamed from: aU */
    RunnableC0854an f5521aU;

    /* renamed from: aV */
    Thread f5522aV;

    /* renamed from: aW */
    RunnableC0854an f5523aW;

    /* renamed from: aX */
    Timer f5524aX;

    /* renamed from: aY */
    C0862au f5525aY;

    /* renamed from: aZ */
    Thread f5526aZ;

    /* renamed from: ba */
    RunnableC0842af f5527ba;

    /* renamed from: be */
    boolean f5528be;

    /* renamed from: bi */
    String f5529bi;

    /* renamed from: bj */
    public String f5530bj;

    /* renamed from: bk */
    public Boolean f5531bk;

    /* renamed from: bl */
    public Boolean f5532bl;

    /* renamed from: bm */
    public boolean f5533bm;

    /* renamed from: bq */
    public float f5534bq;

    /* renamed from: br */
    public boolean f5535br;

    /* renamed from: bs */
    public boolean f5536bs;

    /* renamed from: bt */
    public boolean f5537bt;

    /* renamed from: bu */
    public boolean f5538bu;

    /* renamed from: bv */
    public boolean f5539bv;

    /* renamed from: bw */
    public String f5540bw;

    /* renamed from: bz */
    public C0187e f5541bz;

    /* renamed from: bA */
    public C0187e f5542bA;

    /* renamed from: bD */
    float f5543bD;

    /* renamed from: bE */
    float f5544bE;

    /* renamed from: bF */
    int f5545bF;

    /* renamed from: bG */
    int f5546bG;

    /* renamed from: bL */
    public boolean f5547bL;

    /* renamed from: bO */
    static ArrayList f5548bO;

    /* renamed from: bQ */
    Timer f5549bQ;

    /* renamed from: bS */
    RunnableC0853am f5550bS;

    /* renamed from: a */
    public static final boolean f5551a = false;

    /* renamed from: b */
    public static boolean f5552b = true;

    /* renamed from: c */
    public static boolean f5553c = false;

    /* renamed from: r */
    public static boolean f5554r = true;

    /* renamed from: bR */
    public static C0841ae f5555bR = new C0841ae();

    /* renamed from: d */
    public C0830ac f5556d = new C0830ac();

    /* renamed from: h */
    public int f5557h = 25;

    /* renamed from: l */
    public boolean f5558l = false;

    /* renamed from: t */
    public int f5559t = 5005;

    /* renamed from: v */
    public boolean f5560v = false;

    /* renamed from: w */
    public long f5561w = 1;

    /* renamed from: x */
    public boolean f5562x = false;

    /* renamed from: bU */
    private boolean f5563bU = false;

    /* renamed from: B */
    public volatile boolean f5564B = false;

    /* renamed from: F */
    public boolean f5565F = false;

    /* renamed from: I */
    public int f5566I = 0;

    /* renamed from: bV */
    private volatile float f5567bV = 1.0f;

    /* renamed from: J */
    public volatile float f5568J = 1.0f;

    /* renamed from: M */
    public ArrayList f5569M = new ArrayList();

    /* renamed from: T */
    public int f5570T = -1;

    /* renamed from: U */
    public int f5571U = -1;

    /* renamed from: V */
    public int f5572V = -1;

    /* renamed from: W */
    public int f5573W = CommonUtils.m2360a(1, 9000000);

    /* renamed from: X */
    public int f5574X = 0;

    /* renamed from: ah */
    public int f5575ah = -1;

    /* renamed from: ai */
    public int f5576ai = 300;

    /* renamed from: an */
    public ArrayList f5577an = new ArrayList();

    /* renamed from: ao */
    public C0851ak f5578ao = new C0851ak(this, "Unit Pos");

    /* renamed from: ap */
    public C0851ak f5579ap = new C0851ak(this, "Unit Dir", false);

    /* renamed from: aq */
    public C0851ak f5580aq = new C0851ak(this, "Unit Hp");

    /* renamed from: ar */
    public C0851ak f5581ar = new C0851ak(this, "Unit Id");

    /* renamed from: as */
    public C0851ak f5582as = new C0851ak(this, "Waypoints");

    /* renamed from: at */
    public C0851ak f5583at = new C0851ak(this, "Waypoints Pos");

    /* renamed from: au */
    public C0851ak f5584au = new C0851ak(this, "Team Credits");

    /* renamed from: av */
    public C0851ak f5585av = new C0851ak(this, "UnitPaths");

    /* renamed from: aw */
    public C0851ak f5586aw = new C0851ak(this, "Unit Count");

    /* renamed from: ax */
    public C0851ak f5587ax = new C0851ak(this, "Team Info", false);

    /* renamed from: ay */
    public C0851ak f5588ay = new C0851ak(this, "Team 1 Credits", false);

    /* renamed from: az */
    public C0851ak f5589az = new C0851ak(this, "Team 2 Credits", false);

    /* renamed from: aA */
    public C0851ak f5590aA = new C0851ak(this, "Team 3 Credits", false);

    /* renamed from: aB */
    public C0851ak f5591aB = new C0851ak(this, "Command center2", false);

    /* renamed from: aC */
    public C0851ak f5592aC = new C0851ak(this, "Command center3", false);

    /* renamed from: aE */
    public boolean f5593aE = true;

    /* renamed from: aJ */
    float f5594aJ = 0.0f;

    /* renamed from: aM */
    public int f5595aM = 5;

    /* renamed from: aN */
    public int f5596aN = 5;

    /* renamed from: aO */
    public C0845ah f5597aO = new C0845ah();

    /* renamed from: aP */
    public String f5598aP = null;

    /* renamed from: aS */
    public C0827a f5599aS = new C0827a();

    /* renamed from: bc */
    public ConcurrentLinkedQueue f5600bc = new ConcurrentLinkedQueue();

    /* renamed from: bd */
    ConcurrentLinkedQueue f5601bd = new ConcurrentLinkedQueue();

    /* renamed from: bf */
    volatile int f5602bf = 1;

    /* renamed from: bg */
    Object f5603bg = new Object();

    /* renamed from: bn */
    public boolean f5604bn = false;

    /* renamed from: bo */
    boolean f5605bo = false;

    /* renamed from: bp */
    boolean f5606bp = false;

    /* renamed from: bx */
    public String f5607bx = null;

    /* renamed from: by */
    public ConcurrentLinkedQueue f5608by = new ConcurrentLinkedQueue();

    /* renamed from: bB */
    public final Object f5609bB = new Object();

    /* renamed from: bC */
    public boolean f5610bC = false;

    /* renamed from: bH */
    boolean f5611bH = false;

    /* renamed from: bI */
    boolean f5612bI = false;

    /* renamed from: bJ */
    public Socket f5613bJ = null;

    /* renamed from: bK */
    public String f5614bK = null;

    /* renamed from: bM */
    boolean f5615bM = false;

    /* renamed from: bN */
    boolean f5616bN = false;

    /* renamed from: bP */
    final Object f5617bP = new Object();

    /* renamed from: e */
    public int f5618e = GameEngine.getInstance().m1135c(true);

    /* renamed from: bh */
    String f5619bh = CommonUtils.m2271e(40);

    /* renamed from: bb */
    Connection f5620bb = new Connection(this, null);

    /* renamed from: a */
    public C0850aj m1757a(Connection connection) {
        String m1497f = connection.m1497f();
        long currentTimeMillis = System.currentTimeMillis();
        if (m1497f == null) {
            connection.m1503b("Is banned: No target");
            return null;
        }
        synchronized (this.f5569M) {
            Iterator it = this.f5569M.iterator();
            while (it.hasNext()) {
                C0850aj c0850aj = (C0850aj) it.next();
                if (m1497f.equals(c0850aj.f5667a) && c0850aj.f5668b > currentTimeMillis) {
                    return c0850aj;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public boolean m1750a(Connection connection, String str, int i) {
        if (connection == null) {
            GameEngine.m1145b("Ban failed: No connection");
            return false;
        }
        String m1497f = connection.m1497f();
        if (m1497f == null) {
            connection.m1503b("Ban failed: No target");
            return false;
        }
        C0850aj c0850aj = new C0850aj();
        c0850aj.f5667a = connection.m1497f();
        c0850aj.f5668b = System.currentTimeMillis() + (i * 1000);
        c0850aj.f5669c = str;
        synchronized (this.f5569M) {
            m1702b();
            this.f5569M.add(c0850aj);
        }
        connection.m1501c("Banned " + m1497f + " for " + i + "s");
        return true;
    }

    /* renamed from: a */
    public void m1776a() {
        synchronized (this.f5569M) {
            this.f5569M.clear();
        }
    }

    /* renamed from: b */
    public void m1702b() {
        synchronized (this.f5569M) {
            int i = 0;
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = this.f5569M.iterator();
            while (it.hasNext()) {
                i++;
                boolean z = false;
                if (((C0850aj) it.next()).f5668b < currentTimeMillis) {
                    z = true;
                }
                if (i > 1000) {
                    z = true;
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public String m1745a(String str) {
        String replace = str.trim().replace(" ", "_");
        this.f5481y = replace;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f5481y != null && !this.f5481y.equals(gameEngine.f6109bQ.lastNetworkPlayerName)) {
            gameEngine.f6109bQ.lastNetworkPlayerName = this.f5481y;
            gameEngine.f6109bQ.save();
        }
        return replace;
    }

    /* renamed from: a */
    public void m1774a(float f, String str) {
        if (f < 0.1d) {
            m1742a("setCurrentStepRate:" + f + " is too small, source:" + str, true);
        } else {
            this.f5567bV = f;
        }
    }

    /* renamed from: c */
    public float m1686c() {
        return this.f5567bV;
    }

    /* renamed from: d */
    public void m1675d() {
        Iterator it = this.f5577an.iterator();
        while (it.hasNext()) {
            ((C0851ak) it.next()).f5671b = 0L;
        }
    }

    /* renamed from: a */
    public void m1759a(C0859ar c0859ar) {
        GameEngine gameEngine = GameEngine.getInstance();
        c0859ar.m1554c(0);
        this.f5597aO.m1601a(c0859ar);
        c0859ar.mo1487a(gameEngine.f6099bB);
        c0859ar.mo1487a(gameEngine.f6100bC);
    }

    /* renamed from: a */
    public void m1746a(C0876k c0876k) {
        GameEngine gameEngine = GameEngine.getInstance();
        c0876k.m1457d();
        this.f5597aO.m1600a(c0876k);
        gameEngine.f6099bB = c0876k.m1454f();
        gameEngine.f6100bC = c0876k.m1454f();
    }

    /* renamed from: e */
    public C0845ah m1666e() {
        C0845ah c0845ah;
        if (this.f5485C) {
            c0845ah = this.f5597aO;
        } else if (this.f5489H) {
            c0845ah = this.f5597aO.m1598c();
        } else {
            c0845ah = null;
            GameEngine.m1144b("getChangeableSetup", "Clicked but not server or proxy controller");
        }
        return c0845ah;
    }

    /* renamed from: f */
    public void m1659f() {
        if (this.f5565F) {
            GameEngine.getInstance().f6109bQ.aiDifficulty = this.f5597aO.f5653f;
        }
        if (!this.f5485C && !this.f5565F) {
            return;
        }
        if (this.f5533bm) {
            GameEngine.m1120g("updateAIDifficulty with gameHasBeenStarted=true");
        } else {
            for (int i = 0; i < Team.f1364c; i++) {
                Team m6317k = Team.m6317k(i);
                if (m6317k != null) {
                    m1766a(m6317k);
                }
            }
        }
        m1712aq();
    }

    /* renamed from: a */
    public void m1766a(Team team) {
        if (team.f1316v) {
            team.m6347c("aiDifficultyOverride=" + team.f1319y);
            if (team.f1319y != null) {
                team.f1317w = team.f1319y.intValue();
            } else {
                team.f1317w = this.f5597aO.f5653f;
            }
        }
    }

    /* renamed from: b */
    public boolean m1699b(Team team) {
        boolean z = false;
        if (team.f1316v) {
            String str = "AI - " + m1700b(team.m6420A());
            if (!str.equals(team.f1315u)) {
                team.f1315u = str;
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m1761a(C0845ah c0845ah) {
        if (this.f5485C) {
            m1659f();
            m1787P();
            m1791L();
            ActivityC0122n.m6910o();
        } else if (this.f5489H) {
            m1697b(c0845ah);
        } else {
            GameEngine.PrintLog("applyChangedSetup but not server or proxy controller");
        }
    }

    /* renamed from: b */
    private void m1697b(C0845ah c0845ah) {
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLog("applyProxyControl");
        C0845ah c0845ah2 = this.f5597aO;
        if (!c0845ah2.f5649b.equals(c0845ah.f5649b)) {
            gameEngine.networkEngine.m1632k("-map '" + C0750a.m2437n(ActivityC0117i.m6932e(c0845ah.f5649b)) + "'");
        }
        if (c0845ah2.f5652e != c0845ah.f5652e) {
            gameEngine.networkEngine.m1632k("-revealedmap " + (!c0845ah.f5652e ? "true" : "false"));
        }
        if (c0845ah2.f5651d != c0845ah.f5651d) {
            gameEngine.networkEngine.m1632k("-fog " + gameEngine.networkEngine.m1772a(c0845ah.f5651d));
        }
        if (c0845ah2.f5650c != c0845ah.f5650c) {
            gameEngine.networkEngine.m1632k("-credits " + gameEngine.networkEngine.m1665e(c0845ah.f5650c));
        }
        if (!CommonUtils.m2246j(c0845ah2.f5655h, c0845ah.f5655h)) {
            gameEngine.networkEngine.m1632k("-income " + CommonUtils.m2363a(c0845ah.f5655h, 1));
        }
        if (c0845ah2.f5656i != c0845ah.f5656i) {
            gameEngine.networkEngine.m1632k("-nukes " + (!c0845ah.f5656i ? "true" : "false"));
        }
        if (c0845ah2.f5653f != c0845ah.f5653f) {
            gameEngine.networkEngine.m1632k("-ai " + c0845ah.f5653f);
        }
        if (c0845ah2.f5654g != c0845ah.f5654g) {
            gameEngine.networkEngine.m1632k("-startingunits " + c0845ah.f5654g);
        }
        if (c0845ah2.f5646l != c0845ah.f5646l) {
            gameEngine.networkEngine.m1632k("-sharedControl " + (c0845ah.f5646l ? "true" : "false"));
        }
    }

    /* renamed from: g */
    public String m1653g() {
        if (this.f5597aO.f5651d == 0) {
            return "No fog";
        }
        if (this.f5597aO.f5651d == 1) {
            return "Basic fog";
        }
        if (this.f5597aO.f5651d == 2) {
            return "Line of Sight";
        }
        return "Unknown";
    }

    /* renamed from: a */
    public String m1772a(int i) {
        if (i == 0) {
            return "off";
        }
        if (i == 1) {
            return "basic";
        }
        if (i == 2) {
            return "los";
        }
        return "Unknown";
    }

    /* renamed from: b */
    public String m1700b(int i) {
        return m1684c(i);
    }

    /* renamed from: c */
    public String m1684c(int i) {
        if (i == -2) {
            return "Very Easy";
        }
        if (i == -1) {
            return "Easy";
        }
        if (i == 0) {
            return "Medium";
        }
        if (i == 1) {
            return "Hard";
        }
        if (i == 2) {
            return "Very Hard";
        }
        if (i == 3) {
            return "Impossible";
        }
        return "Unknown";
    }

    /* renamed from: h */
    public String m1647h() {
        return m1673d(this.f5597aO.f5654g);
    }

    /* renamed from: i */
    public ArrayList m1641i() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 4; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        arrayList.addAll(C0453l.m4704s());
        return arrayList;
    }

    /* renamed from: d */
    public String m1673d(int i) {
        if (i == 1) {
            return "Normal (1 builder)";
        }
        if (i == 2) {
            return "Small Army";
        }
        if (i == 3) {
            return "3 Engineers";
        }
        if (i == 4) {
            return "3 Engineers (No Command Center)";
        }
        if (i == 5) {
            return "Experimental Spider";
        }
        if (i == 9) {
            return "Custom";
        }
        C0453l m4739c = C0453l.m4739c(i);
        if (m4739c != null) {
            return m4739c.m4732e();
        }
        return "Unknown";
    }

    /* renamed from: j */
    public String m1635j() {
        if (this.f5597aO.f5650c == 0) {
            return "Default ($" + m1633k() + ")";
        }
        return "$" + m1633k();
    }

    /* renamed from: k */
    public final int m1633k() {
        return m1665e(this.f5597aO.f5650c);
    }

    /* renamed from: e */
    public int m1665e(int i) {
        if (i == 0) {
            return 4000;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1000;
        }
        if (i == 3) {
            return 2000;
        }
        if (i == 4) {
            return 5000;
        }
        if (i == 5) {
            return 10000;
        }
        if (i == 6) {
            return 50000;
        }
        if (i == 7) {
            return 100000;
        }
        if (i == 8) {
            return 200000;
        }
        return 999;
    }

    /* renamed from: l */
    public String m1631l() {
        return C0750a.m2437n(this.f5598aP);
    }

    /* renamed from: m */
    public void m1629m() {
        new C1101m();
        CommonUtils.m2312b((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU);
        C0857ap.m1587a(5.0f, 6.0f, 7.0f);
        C0858aq.m1581a(5);
        this.f5540bw = C0858aq.m1582a();
        this.f5539bv = true;
    }

    /* renamed from: n */
    public boolean m1627n() {
        return this.f5533bm;
    }

    /* renamed from: o */
    public boolean m1625o() {
        return this.f5556d.m1803e();
    }

    /* renamed from: a */
    public synchronized void m1736a(boolean z, String str, Boolean bool) {
        this.f5532bl = Boolean.valueOf(z);
        this.f5530bj = str;
        this.f5531bk = bool;
        ActivityC0122n.m6910o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1747a(C0872g c0872g) {
        Iterator it = this.f5608by.iterator();
        while (it.hasNext()) {
            C0872g c0872g2 = (C0872g) it.next();
            if (c0872g2.f5817a && c0872g2.f5819c.equals(c0872g.f5819c) && c0872g2.f5823g == c0872g.f5823g) {
                c0872g2.f5830o = m1623p();
            }
        }
        c0872g.f5830o = m1623p();
        this.f5608by.add(c0872g);
        ActivityC0129p.m6904l();
    }

    /* renamed from: p */
    public long m1623p() {
        return System.currentTimeMillis();
    }

    public C0831ad() {
        this.f5620bb.f5771p = true;
        this.f5541bz = new C0187e(-3, false);
        this.f5541bz.f1315u = "SPECTATOR";
        this.f5542bA = new C0187e(-1, false);
        this.f5542bA.f1315u = "ADMIN";
    }

    /* renamed from: q */
    public void m1621q() {
        m1738a(false);
    }

    /* renamed from: r */
    public void m1620r() {
        m1738a(true);
    }

    /* renamed from: s */
    public void m1619s() {
        this.f5563bU = false;
        this.f5482bT = false;
        this.f5483z = null;
        this.f5477p = false;
        this.f5574X = 0;
        this.f5566I = 0;
        this.f5561w = 1L;
        m1774a(1.0f, "new");
        this.f5499Z = 10.0f;
        this.f5492N = false;
        this.f5495Q = 10;
        this.f5496R = 0;
        this.f5498Y = false;
        this.f5500aa = false;
        this.f5509al = false;
        this.f5508ak = false;
        this.f5501ab = 0.0f;
        this.f5502ac = 0.0f;
        this.f5503ad = false;
        this.f5505af = false;
        this.f5533bm = false;
        this.f5605bo = false;
        this.f5606bp = false;
        this.f5534bq = 0.0f;
        this.f5604bn = false;
        this.f5535br = false;
        this.f5536bs = false;
        this.f5537bt = false;
        this.f5538bu = false;
        this.f5506ag = false;
        this.f5575ah = -1;
        this.f5510am = 0L;
        this.f5611bH = false;
        m1675d();
        this.f5511aD = false;
        this.f5593aE = true;
        this.f5512aF = 0;
        this.f5513aG = 0;
        this.f5514aH = 0;
        this.f5594aJ = 0.0f;
        this.f5543bD = 0.0f;
        this.f5544bE = 0.0f;
        this.f5545bF = 0;
        this.f5546bG = -1000;
        C0857ap.f5719i = 55;
        C0857ap.f5720j = 66;
    }

    /* renamed from: a */
    public void m1738a(boolean z) {
        this.f5564B = false;
        this.f5485C = false;
        this.f5469f = null;
        this.f5565F = false;
        this.f5486D = false;
        this.f5487E = null;
        this.f5562x = false;
        this.f5489H = false;
        this.f5488G = false;
        this.f5517aL = false;
        this.f5484A = false;
        m1619s();
        this.f5497S = null;
        this.f5474m = 0;
        this.f5471i = false;
        this.f5472j = 0.0f;
        this.f5473k = 0.0f;
        this.f5616bN = false;
        this.f5519aR = null;
        this.f5596aN = GameEngine.getInstance().f6109bQ.teamUnitCapHostedGame;
        if (this.f5596aN < 1) {
            this.f5596aN = 1;
        }
        this.f5595aM = this.f5596aN;
        this.f5597aO.f5654g = 1;
        this.f5597aO.f5655h = 1.0f;
        this.f5597aO.f5656i = false;
        this.f5597aO.f5657j = false;
        this.f5597aO.f5646l = false;
        this.f5597aO.f5650c = 0;
        this.f5597aO.f5659m = false;
        this.f5597aO.f5660n = false;
        this.f5597aO.f5661o = true;
        this.f5597aO.f5662p = false;
        this.f5597aO.f5647q = 0;
        m1776a();
        this.f5599aS.m1810c();
        GameEngine.getInstance().f6111bS.m1987g();
        if ("<CHAT ONLY>".equals(this.f5597aO.f5649b)) {
            GameEngine.PrintLog("Chat only map selection - restarting");
            this.f5597aO.m1602a();
        }
        if (!z) {
            Team.m6417D();
        }
        C0348af.m5396b(this.f5476o);
    }

    /* renamed from: t */
    public void m1618t() {
    }

    /* renamed from: b */
    public synchronized void m1690b(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLog("Disconnect: " + str);
        if (this.f5485C) {
            m1711ar();
            C0879n.m1413d();
            if (this.f5521aU != null) {
                this.f5521aU.m1589b();
                try {
                    if (this.f5520aT != null) {
                        this.f5520aT.join();
                    }
                } catch (InterruptedException e) {
                }
                this.f5521aU = null;
                this.f5520aT = null;
            }
            if (this.f5523aW != null) {
                this.f5523aW.m1589b();
                try {
                    if (this.f5522aV != null) {
                        this.f5522aV.join();
                    }
                } catch (InterruptedException e2) {
                }
                this.f5523aW = null;
                this.f5522aV = null;
            }
            if (this.f5524aX != null) {
                this.f5524aX.cancel();
                this.f5524aX = null;
                this.f5525aY = null;
            }
            if (this.f5527ba != null) {
                this.f5527ba.m1603b();
                this.f5527ba = null;
                this.f5526aZ = null;
            }
        }
        m1622p(str);
        C1058a.m786a().m773j();
        synchronized (this.f5609bB) {
            this.f5564B = false;
            this.f5485C = false;
            this.f5565F = false;
            this.f5469f = null;
            try {
                wait(50L);
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
            this.f5533bm = false;
            gameEngine.f6120cb.m2641d();
            gameEngine.m1129e();
            m1716am();
            this.f5610bC = false;
            this.f5609bB.notifyAll();
        }
    }

    /* renamed from: u */
    public void m1617u() {
        synchronized (this.f5609bB) {
            if (!this.f5564B) {
                return;
            }
            this.f5610bC = true;
            try {
                this.f5609bB.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void m1694b(Connection connection) {
        this.f5600bc.remove(connection);
    }

    /* renamed from: ay */
    private synchronized void m1704ay() {
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            if (((Connection) it.next()).f5797a) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    void m1734a(byte[] bArr, Connection connection) {
        if (!GameEngine.m1155aw()) {
            Log.m7106d("RustedWarfare", "Ignoring incoming resync tagged as debug only");
        } else if (connection.f5776u) {
            Log.m7106d("RustedWarfare", "Ignoring desync client save, as past desync was already saved");
        } else {
            connection.f5776u = true;
            Log.m7106d("RustedWarfare", "Saving client save for debugging");
            File file = new File("desyncs/" + ("desync_" + CommonUtils.m2336a("d MMM yyyy HH.mm.ss") + "_" + connection.f5760c));
            file.getParentFile().mkdirs();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: v */
    public void m1616v() {
        if (this.f5611bH) {
            return;
        }
        GameEngine.PrintLog("Adding quick resync command");
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m2592b = gameEngine.f6124cf.m2592b();
        m2592b.f4836i = Team.f1370i;
        m2592b.f4844r = true;
        m2592b.f4847u = 200;
        gameEngine.networkEngine.m1763a(m2592b);
        this.f5611bH = true;
    }

    /* renamed from: w */
    public void m1615w() {
        GameEngine gameEngine = GameEngine.getInstance();
        C0859ar c0859ar = new C0859ar();
        gameEngine.f6119ca.m453a(c0859ar);
        try {
            c0859ar.m1580a();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] m1552d = c0859ar.m1552d();
        c0859ar.m1546h();
        if (this.f5485C) {
            Iterator it = this.f5600bc.iterator();
            while (it.hasNext()) {
                Connection connection = (Connection) it.next();
                if (connection.f5778w) {
                    connection.f5778w = false;
                    connection.f5777v = false;
                    m1748a(connection, m1552d, this.f5558l, false);
                }
            }
        }
        GameEngine.PrintLog("Loading quick resync save data (bytes:" + m1552d.length + ")");
        C0876k c0876k = new C0876k(m1552d);
        gameEngine.m1187a("Game resync (quick)...", true);
        int i = gameEngine.f6233bx;
        int i2 = gameEngine.f6096by;
        gameEngine.f6119ca.m452a(c0876k, true, true, true);
        gameEngine.f6233bx = i;
        gameEngine.f6096by = i2;
        this.f5574X = gameEngine.f6233bx + 1;
        this.f5506ag = false;
        this.f5575ah = this.f5574X + 1;
        this.f5510am = 0L;
        Iterator it2 = this.f5600bc.iterator();
        while (it2.hasNext()) {
            ((Connection) it2.next()).f5777v = false;
        }
        this.f5611bH = false;
        this.f5514aH++;
        this.f5543bD = 0.0f;
        this.f5544bE = 0.0f;
        if (this.f5545bF < 1) {
            this.f5545bF++;
        }
        this.f5546bG = gameEngine.f6233bx;
    }

    /* renamed from: x */
    public synchronized void m1614x() {
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5778w) {
                throw new RuntimeException("Player: " + connection.m1498e() + " has complete desync");
            }
            if (connection.f5777v) {
                throw new RuntimeException("Player: " + connection.m1498e() + " has minor desync");
            }
            if (connection.f5779x == 0) {
                throw new RuntimeException("Player: " + connection.m1498e() + " has no sync matches");
            }
        }
    }

    /* renamed from: d */
    private synchronized void m1674d(float f) {
        GameEngine.getInstance();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        this.f5543bD += f;
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5778w) {
                z = true;
            }
            if (connection.f5777v) {
                if (this.f5470g) {
                    GameEngine.PrintLog("desync_count:" + connection.f5780y + " lastResyncTimer:" + this.f5543bD);
                }
                if (connection.f5780y < 4 || this.f5543bD > 3600.0f) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            this.f5544bE += f;
            if (f5553c && this.f5544bE > 5.0f) {
                z2 = true;
            }
            if (this.f5545bF == 0) {
                if (this.f5544bE > 60.0f) {
                    z2 = true;
                }
            } else if (this.f5545bF == 1) {
                if (this.f5544bE > 420.0f) {
                    z2 = true;
                }
            } else if (this.f5545bF == 2) {
                if (this.f5544bE > 3600.0f) {
                    z2 = true;
                }
            } else if (this.f5545bF == 3 && this.f5544bE > 14400.0f) {
                z2 = true;
            }
        }
        if (f5515aI && z2) {
            GameEngine.PrintLog("disableDesyncFixing==true, running quick resync instead");
            z2 = false;
            z = true;
        }
        if (!z2 && z) {
            if (f5552b) {
                m1616v();
            } else {
                z2 = true;
            }
        }
        if (z2) {
            String str = VariableScope.nullOrMissingString;
            Iterator it2 = this.f5600bc.iterator();
            while (it2.hasNext()) {
                Connection connection2 = (Connection) it2.next();
                if (connection2.f5778w || connection2.f5777v) {
                    if (!str.equals(VariableScope.nullOrMissingString)) {
                        str = str + ", ";
                    }
                    str = str + connection2.m1498e();
                }
            }
            m1634j("Resyncing game for " + str + "...");
            m1703az();
            m1735a(this.f5558l, false, true);
        }
    }

    /* renamed from: az */
    private void m1703az() {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f5543bD = 0.0f;
        this.f5544bE = 0.0f;
        this.f5545bF++;
        this.f5546bG = gameEngine.f6233bx;
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            connection.f5778w = false;
            connection.f5777v = false;
            connection.f5779x = 0;
        }
    }

    /* renamed from: c */
    public void m1678c(String str) {
        m1622p(str);
    }

    /* renamed from: p */
    private void m1622p(String str) {
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            ((Connection) it.next()).m1508a(str);
        }
        this.f5600bc.clear();
        this.f5601bd.clear();
        this.f5602bf = 1;
        this.f5528be = false;
    }

    /* renamed from: y */
    public long m1613y() {
        if (0 != 0) {
            GameEngine.PrintLog("New id set:" + this.f5561w + 1);
            GameEngine.m1216S();
        }
        long j = this.f5561w;
        this.f5561w = j + 1;
        if (j == 0) {
            GameEngine.PrintLog("getNextUnitId: id==0");
            GameEngine.m1216S();
        }
        return j;
    }

    /* renamed from: z */
    public long m1612z() {
        return this.f5561w;
    }

    /* renamed from: a */
    public void m1770a(long j) {
        this.f5561w = j;
    }

    /* renamed from: a */
    public boolean m1737a(boolean z, int i) {
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5771p && connection.m1495h() && !connection.f5774s && !connection.f5804D) {
                if (z) {
                    m1634j("Still waiting on: " + connection.m1498e());
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    public int m1802A() {
        int i = 0;
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5771p && connection.m1495h() && !connection.f5774s) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public int m1801B() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5771p && connection.m1495h() && !connection.f5774s) {
                C0187e c0187e = connection.f5781z;
                if (c0187e != null) {
                    if (!arrayList.contains(c0187e)) {
                        arrayList.add(c0187e);
                    }
                }
                i++;
            }
        }
        return i;
    }

    /* renamed from: C */
    public int m1800C() {
        int i = 0;
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5771p && !connection.f5774s) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public int m1799D() {
        int m1801B = 0 + m1801B();
        if (!GameEngine.m1155aw()) {
            m1801B++;
        }
        return m1801B;
    }

    /* renamed from: d */
    public void m1669d(String str) {
        Log.m7110b("RustedWarfare", "network:" + str);
    }

    /* renamed from: e */
    public static void m1661e(String str) {
        GameEngine.PrintLog("network debug: " + str);
    }

    /* renamed from: f */
    public void m1654f(String str) {
        Log.m7106d("RustedWarfare", "reportProblem:" + str);
        if (this.f5533bm) {
            m1693b((Connection) null, -1, (String) null, str);
        } else {
            m1693b((Connection) null, -1, (String) null, str);
        }
    }

    /* renamed from: g */
    public static void m1648g(String str) {
        m1742a(str, false);
    }

    /* renamed from: h */
    public static void m1642h(String str) {
        m1742a(str, true);
    }

    /* renamed from: a */
    public static void m1742a(String str, boolean z) {
        String str2;
        C0831ad c0831ad = GameEngine.getInstance().networkEngine;
        String str3 = "desync:" + str;
        GameEngine.m1145b(str3);
        GameEngine.m1216S();
        c0831ad.f5512aF++;
        if (c0831ad.f5593aE) {
            if (c0831ad.f5512aF > 2 || f5515aI) {
                z = true;
            }
            if (c0831ad.f5512aF > 10) {
                str2 = "<suppressing desync errors>";
                c0831ad.f5593aE = false;
                z = true;
            } else {
                str2 = str3;
            }
            if (z) {
                str2 = "-i " + str2;
            }
            c0831ad.m1628m(str2);
        }
    }

    /* renamed from: a */
    public static void m1743a(String str, String str2) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6120cb.m2656a(-1, str, str2, gameEngine.f6233bx);
        if (gameEngine.f6111bS != null && gameEngine.f6111bS.f5107e != null) {
            gameEngine.f6111bS.f5107e.m1952a(str, str2);
        } else {
            GameEngine.m1120g("interfaceEngine/messageInterface==null");
        }
    }

    /* renamed from: E */
    public void m1798E() {
    }

    /* renamed from: a */
    public void m1763a(C0749e c0749e) {
        GameEngine gameEngine = GameEngine.getInstance();
        c0749e.f4834c = this.f5574X;
        c0749e.m2475g();
        gameEngine.f6124cf.f4616b.add(c0749e);
    }

    /* renamed from: F */
    public void m1797F() {
        C0851ak c0851ak;
        C0851ak c0851ak2;
        C0851ak c0851ak3;
        this.f5575ah = GameEngine.getInstance().f6233bx;
        this.f5510am = 0L;
        m1675d();
        Iterator it = AbstractC1120w.f6956en.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                this.f5510am = ((float) this.f5510am) + (abstractC0623y.f6951ek * 1000.0f);
                this.f5510am = ((float) this.f5510am) + (abstractC0623y.f6952el * 1000.0f);
                this.f5510am = ((float) this.f5510am) + (abstractC0623y.f1631cs * 1.0f);
                this.f5510am += abstractC0623y.f6945ed;
                this.f5578ao.f5671b += Float.floatToRawIntBits(abstractC0623y.f6951ek);
                this.f5578ao.f5671b += Float.floatToRawIntBits(abstractC0623y.f6952el);
                this.f5579ap.f5671b += Float.floatToRawIntBits(abstractC0623y.direction);
                this.f5580aq.f5671b = ((float) c0851ak.f5671b) + abstractC0623y.f1631cs;
                this.f5581ar.f5671b += abstractC0623y.f6945ed;
                if (abstractC1120w instanceof CommandCenter) {
                    CommandCenter commandCenter = (CommandCenter) abstractC0623y;
                    this.f5591aB.f5671b = ((float) c0851ak3.f5671b) + (commandCenter.f3432f * 2.0f);
                    this.f5592aC.f5671b += commandCenter.f3434h;
                }
                C0305au m3135ar = abstractC0623y.m3135ar();
                if (m3135ar != null) {
                    this.f5582as.f5671b += m3135ar.m5665j();
                    this.f5583at.f5671b = ((float) c0851ak2.f5671b) + (m3135ar.m5670g() * 1000.0f);
                }
                this.f5585av.f5671b += abstractC0623y.m3168aL();
            }
        }
        for (int i = 0; i < Team.f1364c; i++) {
            Team m6317k = Team.m6317k(i);
            if (m6317k != null) {
                this.f5584au.f5671b += (int) m6317k.f1309o;
                if (i == 0) {
                    this.f5588ay.f5671b += (int) m6317k.f1309o;
                }
                if (i == 1) {
                    this.f5589az.f5671b += (int) m6317k.f1309o;
                }
                if (i == 2) {
                    this.f5590aA.f5671b += (int) m6317k.f1309o;
                }
                this.f5586aw.f5671b += m6317k.m6307u();
                this.f5587ax.f5671b += i + (m6317k.f1317w * 100) + (m6317k.f1311q * 1000) + ((m6317k.f1316v ? i : 0) * 10000);
            }
        }
        if (this.f5575ah == 0) {
            GameEngine.PrintLog("Frame 0 checksum: " + this.f5510am);
        }
        this.f5511aD = false;
    }

    /* renamed from: G */
    public void m1796G() {
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (!connection.f5771p || connection.m1504b() == -2 || connection.m1504b() > 500 || connection.m1504b() < 0) {
            }
        }
    }

    /* renamed from: H */
    public void m1795H() {
        GameEngine gameEngine = GameEngine.getInstance();
        String str = VariableScope.nullOrMissingString;
        for (Team team : Team.m6376a(true)) {
            if (team != null) {
                String str2 = "unnamed";
                if (team.f1315u != null) {
                    str2 = team.f1315u;
                }
                str = str + "•" + team.m6410K().toLowerCase() + " [Team " + team.m6325h() + "] - " + str2 + (" " + team.m6305w()) + "\n";
            }
        }
        GameEngine.PrintLog("showPlayerListPopup(): Showing playlist messagebox.");
        gameEngine.m1137c("Players", str);
    }

    /* renamed from: a */
    public void m1775a(float f) {
        Connection m1780W;
        GameEngine gameEngine = GameEngine.getInstance();
        this.f5594aJ += f;
        if (this.f5606bp) {
            if (this.f5534bq > 0.0f) {
                this.f5534bq -= f / 60.0f;
                GameEngine.getInstance().f6111bS.m2023a("Returning to battleroom in " + ((int) this.f5534bq) + "...", 3500);
            } else {
                GameEngine.PrintLog("Sending returnToBattleroomEvent...");
                this.f5606bp = false;
                m1637i((Connection) null);
            }
        }
        if (this.f5605bo) {
            m1730aD();
        }
        if (this.f5594aJ > 60.0f) {
            m1796G();
            this.f5594aJ = 0.0f;
        }
        if (this.f5533bm && !this.f5604bn) {
            this.f5604bn = true;
            int i = 0;
            int i2 = 0;
            Iterator it = Team.m6331f().iterator();
            while (it.hasNext()) {
                int m6392a = Team.m6392a(((Integer) it.next()).intValue(), false);
                if (m6392a > i2) {
                    i2 = m6392a;
                }
                i++;
            }
            if (i > 2 && i2 <= 1) {
                this.f5535br = true;
            }
        }
        if (!this.f5485C && !this.f5563bU) {
            m1725ad();
            this.f5563bU = true;
        }
        if (this.f5485C) {
            if (!this.f5500aa) {
                if (m1737a(false, 0)) {
                    this.f5499Z = CommonUtils.m2368a(this.f5499Z, f);
                    if (this.f5499Z == 0.0f) {
                        this.f5500aa = true;
                        m1743a(VariableScope.nullOrMissingString, "<All players ready>");
                        this.f5556d.m1809a();
                    }
                } else {
                    this.f5501ab += f;
                    this.f5502ac += f;
                    if (this.f5501ab > 900.0f) {
                        this.f5500aa = true;
                        m1743a(VariableScope.nullOrMissingString, "Starting game without all players ready!");
                    } else if (this.f5502ac > 180.0f) {
                        this.f5502ac = 0.0f;
                        m1737a(true, (int) ((900.0f - this.f5501ab) / 60.0f));
                    }
                }
            }
            if (this.f5500aa) {
                boolean z = false;
                if (this.f5508ak) {
                    z = true;
                }
                if (this.f5509al) {
                    z = true;
                }
                if ((gameEngine.f6233bx >= this.f5574X - this.f5496R) & (!z)) {
                    int i3 = this.f5574X + this.f5495Q;
                    this.f5493O++;
                    boolean z2 = false;
                    for (int i4 = 0; i4 < Team.f1364c; i4++) {
                        Team m6317k = Team.m6317k(i4);
                        if (m6317k != null && m6317k.f1344U != 0 && !m6317k.m6302z() && m6317k.f1344U < 40) {
                            z2 = true;
                        }
                    }
                    if (gameEngine.m1151b() != 0 && gameEngine.m1151b() < 40 && !GameEngine.m1155aw()) {
                        z2 = true;
                    }
                    if (z2) {
                        this.f5494P++;
                    }
                    if (this.f5493O > 8) {
                        float f2 = 1.0f;
                        if (this.f5494P > 4) {
                            f2 = 2.0f;
                        }
                        if (this.f5490K != null) {
                            f2 = this.f5490K.floatValue();
                        }
                        if (f2 != m1686c()) {
                            GameEngine.PrintLog("Changing step rate to " + f2);
                            C0749e m2592b = gameEngine.f6124cf.m2592b();
                            m2592b.f4836i = Team.f1370i;
                            m2592b.f4844r = true;
                            m2592b.f4845s = f2;
                            m1763a(m2592b);
                        }
                        this.f5493O = 0;
                        this.f5494P = 0;
                    }
                    C0859ar c0859ar = new C0859ar();
                    try {
                        c0859ar.mo1487a(i3);
                        int i5 = 0;
                        Iterator it2 = gameEngine.f6124cf.f4616b.iterator();
                        while (it2.hasNext()) {
                            if (((C0749e) it2.next()).f4834c == this.f5574X) {
                                i5++;
                            }
                        }
                        c0859ar.mo1487a(i5);
                        Iterator it3 = gameEngine.f6124cf.f4616b.iterator();
                        while (it3.hasNext()) {
                            C0749e c0749e = (C0749e) it3.next();
                            if (c0749e.f4834c == this.f5574X) {
                                c0749e.m2490a(c0859ar);
                            }
                        }
                        C0861at m1560b = c0859ar.m1560b(10);
                        m1560b.f5736e = true;
                        m1671d(m1560b);
                        this.f5574X = i3;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        if (!gameEngine.f6124cf.f4618d.isEmpty()) {
            Iterator it4 = gameEngine.f6124cf.f4618d.iterator();
            while (it4.hasNext()) {
                C0749e c0749e2 = (C0749e) it4.next();
                if (0 != 0) {
                    gameEngine.f6124cf.f4617c.add(c0749e2);
                    it4.remove();
                } else {
                    if (!c0749e2.f4858x) {
                        c0749e2.m2487b();
                    }
                    if (c0749e2.m2502a()) {
                        gameEngine.f6124cf.f4617c.add(c0749e2);
                        it4.remove();
                    }
                }
            }
        }
        if (!this.f5485C) {
            if (!gameEngine.f6124cf.f4617c.isEmpty()) {
                Iterator it5 = gameEngine.f6124cf.f4617c.iterator();
                while (it5.hasNext()) {
                    C0749e c0749e3 = (C0749e) it5.next();
                    if (!c0749e3.m2479e()) {
                        c0749e3.m2472j();
                        C0859ar c0859ar2 = new C0859ar();
                        try {
                            c0749e3.m2490a(c0859ar2);
                            m1671d(c0859ar2.m1560b(20));
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
                gameEngine.f6124cf.f4617c.clear();
            }
        } else if (!gameEngine.f6124cf.f4617c.isEmpty()) {
            Iterator it6 = gameEngine.f6124cf.f4617c.iterator();
            while (it6.hasNext()) {
                C0749e c0749e4 = (C0749e) it6.next();
                if (!c0749e4.m2479e()) {
                    if (!c0749e4.m2470l()) {
                        m1648g("Skipped command issued from server");
                    } else {
                        c0749e4.m2472j();
                        m1763a(c0749e4);
                    }
                }
            }
            gameEngine.f6124cf.f4617c.clear();
        }
        while (!this.f5601bd.isEmpty()) {
            C0861at c0861at = (C0861at) this.f5601bd.remove();
            try {
                m1758a(c0861at);
            } catch (IOException e3) {
                String str = "None";
                Connection connection = c0861at.f5737a;
                if (connection != null) {
                    str = connection.m1496g();
                    String message = e3.getMessage();
                    if (message == null) {
                        message = "IO error";
                    }
                    connection.m1508a(message);
                    m1648g("IO error on processGamePacket for " + connection.m1498e());
                }
                GameEngine.m1188a("Error on processGamePacket ip:" + str, (Throwable) e3);
            }
        }
        if (this.f5485C) {
            if (!this.f5564B) {
                GameEngine.PrintLog("Skipping server updates, not networked");
            } else {
                m1704ay();
                if (!this.f5507aj) {
                    m1674d(f);
                }
            }
        }
        if (!this.f5485C && this.f5564B) {
            boolean z3 = false;
            Iterator it7 = this.f5600bc.iterator();
            while (it7.hasNext()) {
                Connection connection2 = (Connection) it7.next();
                if (connection2.f5771p && !connection2.f5797a) {
                    z3 = true;
                }
            }
            if (this.f5538bu && m1627n()) {
                gameEngine.f6111bS.m2008b("Game ended by server.");
                ActivityC0122n.m6910o();
            } else if (!z3 && m1627n()) {
                gameEngine.f6111bS.m2008b("Server Disconnected.");
                ActivityC0122n.m6910o();
            }
            if (z3 && this.f5498Y && !this.f5485C && (m1780W = m1780W()) != null && m1780W.f5795U > 20000) {
                String str2 = "Receiving network data: " + m1780W.f5796V + "/" + m1780W.f5795U;
                GameEngine.PrintLog(str2);
                gameEngine.f6111bS.m1994d(str2);
            }
        }
        if (this.f5564B) {
            if (this.f5509al) {
                gameEngine.f6111bS.m2007b("Game paused.", 100);
            } else {
                gameEngine.f6111bS.m2024a("Game paused.");
            }
        }
        if (gameEngine.f6233bx < this.f5574X) {
            this.f5498Y = false;
        }
        if (this.f5610bC) {
            m1690b("queDisconnect");
        }
    }

    /* renamed from: b */
    public void m1701b(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f5564B && (this.f5575ah + this.f5576ai < gameEngine.f6233bx || this.f5575ah == -1)) {
            m1797F();
            gameEngine.f6120cb.m2643c();
        }
        if ((this.f5564B || gameEngine.f6120cb.m2635h()) && this.f5492N) {
            this.f5492N = false;
            m1615w();
        }
        if (this.f5564B && this.f5485C && !this.f5511aD && this.f5575ah + (this.f5576ai / 2) < gameEngine.f6233bx && this.f5575ah != -1) {
            try {
                C0859ar c0859ar = new C0859ar();
                c0859ar.mo1487a(this.f5575ah);
                c0859ar.m1577a(this.f5510am);
                c0859ar.mo1487a(this.f5577an.size());
                Iterator it = this.f5577an.iterator();
                while (it.hasNext()) {
                    c0859ar.m1577a(((C0851ak) it.next()).f5671b);
                }
                m1644h(c0859ar.m1560b(30));
                if (this.f5470g) {
                    GameEngine.PrintLog("Sent checksum to client [" + this.f5575ah + "]");
                }
                this.f5511aD = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: I */
    public boolean m1794I() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6113bU.m1292e()) {
            if (!this.f5612bI) {
                GameEngine.PrintLog("shouldGameBePaused: isGoingToBlockThisFrame()==true: " + gameEngine.f6113bU.m1291f());
            }
            this.f5612bI = true;
            return true;
        }
        if (this.f5612bI) {
            GameEngine.PrintLog("shouldGameBePaused: isGoingToBlockThisFrame()==false");
        }
        this.f5612bI = false;
        return false;
    }

    /* renamed from: a */
    public void m1773a(float f, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6233bx >= this.f5574X) {
            if (gameEngine.f6233bx > this.f5574X) {
                throw new RuntimeException("game frame:" + gameEngine.f6233bx + " is greater then nest step:" + this.f5574X);
            }
            this.f5498Y = true;
        }
        if (z && m1794I()) {
            this.f5498Y = true;
        }
    }

    /* renamed from: a */
    public void m1758a(C0861at c0861at) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (m1695b(c0861at)) {
            m1669d("filtered packet (type:" + c0861at.f5734b + ")");
            return;
        }
        switch (c0861at.f5734b) {
            case 10:
                if (this.f5485C) {
                    m1669d("we are a server! we don't follow orders");
                    return;
                } else if (c0861at.f5737a.f5775t) {
                    m1669d("ignoring command");
                    return;
                } else {
                    C0876k c0876k = new C0876k(c0861at);
                    int m1454f = c0876k.m1454f();
                    int m1454f2 = c0876k.m1454f();
                    for (int i = 0; i < m1454f2; i++) {
                        C0749e m2592b = gameEngine.f6124cf.m2592b();
                        m2592b.f4834c = this.f5574X;
                        m2592b.m2489a(c0876k);
                        m1763a(m2592b);
                    }
                    if (m1454f < this.f5574X) {
                        m1648g("New nextBlockingFrame:" + m1454f + " is smaller than current step:" + this.f5574X);
                    }
                    this.f5574X = m1454f;
                    return;
                }
            case 20:
                if (!this.f5485C) {
                    m1669d("we are not a server! skipping");
                    return;
                }
                C0876k c0876k2 = new C0876k(c0861at);
                Connection connection = c0861at.f5737a;
                if (!connection.m1512a()) {
                    C0187e c0187e = connection.f5781z;
                    if (c0187e == null) {
                        m1669d("Player is null for message ADDCLIENTCOMMAND, skipping");
                        return;
                    }
                    C0749e m2592b2 = gameEngine.f6124cf.m2592b();
                    m2592b2.m2489a(c0876k2);
                    m2592b2.f4842p = c0187e;
                    if (m2592b2.f4844r) {
                        m1669d("Got system action from client, ignoring (" + connection.f5760c + ")");
                        m2592b2.f4844r = false;
                    }
                    if (m2592b2.m2484c() == null) {
                        m1648g("Invalid command from '" + c0187e.f1315u + "', no team found");
                        return;
                    } else if (!m2592b2.m2470l()) {
                        m1648g("Ignored command from '" + c0187e.f1315u + "', check failed");
                        return;
                    } else {
                        m1763a(m2592b2);
                        return;
                    }
                }
                return;
            case 30:
                Connection connection2 = c0861at.f5737a;
                C0876k c0876k3 = new C0876k(c0861at);
                int m1454f3 = c0876k3.m1454f();
                long m1451i = c0876k3.m1451i();
                if (this.f5506ag) {
                    m1669d("PACKET_SYNCCHECKSUM: skipping frame:" + m1454f3 + ", we were told to wait for resync");
                    return;
                }
                C0859ar c0859ar = new C0859ar();
                c0859ar.m1554c(0);
                c0859ar.mo1487a(m1454f3);
                c0859ar.mo1487a(this.f5575ah);
                if (this.f5575ah != m1454f3 || this.f5510am == 0) {
                    c0859ar.mo1482a(false);
                    Log.m7106d("RustedWarfare", "got remoteSyncFrame for:" + m1454f3 + " needed:" + this.f5575ah + " lastSyncCheckSum:" + this.f5510am);
                } else {
                    c0859ar.mo1482a(true);
                    Log.m7106d("RustedWarfare", "Running checksum");
                    c0859ar.m1577a(m1451i);
                    c0859ar.m1577a(this.f5510am);
                    boolean z = false;
                    if (m1451i != this.f5510am) {
                        m1648g("Checksum doesn't match. Got:" + m1451i + " expected:" + this.f5510am);
                        z = true;
                        GameEngine.PrintLog("--- Desync for frame: " + m1454f3 + " ---");
                        Iterator it = Team.m6358c().iterator();
                        while (it.hasNext()) {
                            ((Team) it.next()).m6308t();
                        }
                    } else {
                        this.f5513aG++;
                    }
                    int m1454f4 = c0876k3.m1454f();
                    if (m1454f4 != this.f5577an.size()) {
                        Log.m7106d("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                    }
                    c0859ar.m1549e("checkList");
                    c0859ar.mo1487a(m1454f4);
                    c0859ar.mo1487a(this.f5577an.size());
                    Iterator it2 = this.f5577an.iterator();
                    while (it2.hasNext()) {
                        C0851ak c0851ak = (C0851ak) it2.next();
                        long m1451i2 = c0876k3.m1451i();
                        c0859ar.m1577a(m1451i2);
                        c0859ar.m1577a(c0851ak.f5671b);
                        if (m1451i2 != c0851ak.f5671b && c0851ak.f5672c) {
                            m1648g("[" + m1454f3 + "] check(" + c0851ak.f5670a + "): " + m1451i2 + "!=" + c0851ak.f5671b);
                            z = true;
                        }
                    }
                    c0859ar.mo1485a("checkList");
                    c0859ar.mo1482a(z);
                }
                if (!this.f5485C) {
                    m1752a(connection2, c0859ar.m1560b(31));
                    return;
                }
                return;
            case 31:
                if (!this.f5485C) {
                    m1669d("we are not a server, but got PACKET_SYNCCHECKSUM_STATUS");
                    return;
                }
                Connection connection3 = c0861at.f5737a;
                C0876k c0876k4 = new C0876k(c0861at);
                c0876k4.m1457d();
                int m1454f5 = c0876k4.m1454f();
                int m1454f6 = c0876k4.m1454f();
                if (c0876k4.m1455e()) {
                    c0876k4.m1451i();
                    c0876k4.m1451i();
                    c0876k4.m1460b("checkList");
                    c0876k4.m1454f();
                    if (c0876k4.m1454f() != this.f5577an.size()) {
                        Log.m7106d("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                    }
                    Iterator it3 = this.f5577an.iterator();
                    while (it3.hasNext()) {
                        C0851ak c0851ak2 = (C0851ak) it3.next();
                        long m1451i3 = c0876k4.m1451i();
                        long m1451i4 = c0876k4.m1451i();
                        if (m1451i3 != m1451i4) {
                            GameEngine.m1145b(c0851ak2.f5670a + " Checksum [" + m1454f5 + "]. server:" + m1451i3 + " client:" + m1451i4);
                        }
                    }
                    c0876k4.m1456d("checkList");
                    boolean m1455e = c0876k4.m1455e();
                    if (this.f5546bG >= m1454f5) {
                        m1669d("Not marking desync, already resynced before frame: " + this.f5546bG + "<=" + m1454f5);
                        return;
                    }
                    if (!connection3.f5777v && m1455e) {
                        connection3.f5780y++;
                    }
                    connection3.f5777v = m1455e;
                    if (!m1455e) {
                        if (this.f5470g) {
                            GameEngine.PrintLog("checksum: client checksum match [" + m1454f5 + "]");
                        }
                        connection3.f5779x++;
                        return;
                    }
                    GameEngine.PrintLog("client:" + connection3.m1498e() + " desync [" + m1454f5 + "]");
                    if (this.f5507aj && !this.f5508ak) {
                        m1648g("pauseOnDesync is active, pausing");
                        this.f5508ak = true;
                        return;
                    }
                    return;
                } else if (this.f5470g) {
                    GameEngine.PrintLog("checksum for:" + connection3.m1498e() + " frameMatch==false client:" + m1454f6 + " server:[" + m1454f5 + "]");
                    return;
                } else {
                    return;
                }
            case 35:
                C0876k c0876k5 = new C0876k(c0861at);
                c0876k5.m1457d();
                int m1454f7 = c0876k5.m1454f();
                int m1454f8 = c0876k5.m1454f();
                float m1453g = c0876k5.m1453g();
                float m1453g2 = c0876k5.m1453g();
                if (!this.f5485C && m1453g < 0.1d) {
                    m1742a("resync packet with setCurrentStepRate:" + m1453g + " is too small", true);
                }
                Connection connection4 = c0861at.f5737a;
                if (connection4.f5775t) {
                    m1669d("ignoring resync command");
                    return;
                }
                boolean m1455e2 = c0876k5.m1455e();
                if (c0876k5.m1455e()) {
                    if (!this.f5485C) {
                        m1669d("we are not a server, but got a debug game save! skipping");
                        return;
                    } else {
                        m1734a(c0876k5.m1458c("gameSave"), connection4);
                        return;
                    }
                }
                GameEngine.PrintLog("Reloading from network save");
                if (m1455e2 && !this.f5485C) {
                    m1735a(false, true, false);
                }
                byte[] m1458c = c0876k5.m1458c("gameSave");
                GameEngine.PrintLog("Save size: " + m1458c.length);
                if (this.f5558l) {
                    m1734a(m1458c, connection4);
                }
                gameEngine.f6120cb.m2646a(m1458c, gameEngine.f6233bx, m1454f7, m1454f8, m1453g, m1453g2);
                C0876k c0876k6 = new C0876k(m1458c);
                gameEngine.m1187a("Resyncing game from server...", true);
                gameEngine.f6119ca.m452a(c0876k6, true, true, true);
                gameEngine.m1210Y();
                this.f5514aH++;
                gameEngine.f6233bx = m1454f7;
                gameEngine.f6096by = m1454f8;
                this.f5574X = m1454f7 + 1;
                this.f5506ag = false;
                this.f5575ah = this.f5574X + 1;
                this.f5510am = 0L;
                if (m1453g < 0.1d) {
                    m1742a("resync setCurrentStepRate:" + m1453g + " is too small", true);
                }
                m1774a(m1453g, "rsync");
                this.f5568J = m1453g2;
                return;
            default:
                m1669d("we did not handle packet:" + c0861at.f5734b);
                return;
        }
    }

    /* renamed from: b */
    public synchronized boolean m1695b(C0861at c0861at) {
        Connection connection;
        if (this.f5485C && (connection = c0861at.f5737a) != null && !connection.f5771p && c0861at.f5734b != 105 && c0861at.f5734b != 110 && c0861at.f5734b != 111 && c0861at.f5734b != 108 && c0861at.f5734b != 160) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public synchronized void m1681c(C0861at c0861at) {
        int i;
        String m1450j;
        GameEngine gameEngine = GameEngine.getInstance();
        if (m1695b(c0861at)) {
            m1669d("filtered packet (type:" + c0861at.f5734b + ")");
            return;
        }
        switch (c0861at.f5734b) {
            case 105:
                m1669d("got PACKET_GET_SERVER_INFO");
                if (!this.f5485C) {
                    m1669d("we are not a server! skipping");
                    return;
                }
                return;
            case 106:
                if (this.f5485C) {
                    m1669d("we are a server! we don't follow orders");
                    return;
                }
                C0876k c0876k = new C0876k(c0861at);
                Connection connection = c0861at.f5737a;
                c0876k.m1448l();
                c0876k.m1454f();
                this.f5597aO.f5648a = (EnumC0846ai) c0876k.m1461b(EnumC0846ai.class);
                this.f5597aO.f5649b = c0876k.m1448l();
                this.f5597aO.f5650c = c0876k.m1454f();
                this.f5597aO.f5651d = c0876k.m1454f();
                this.f5597aO.f5652e = c0876k.m1455e();
                this.f5597aO.f5653f = c0876k.m1454f();
                byte m1457d = c0876k.m1457d();
                this.f5488G = c0876k.m1455e();
                this.f5489H = c0876k.m1455e();
                this.f5517aL = true;
                if (m1457d >= 1) {
                    this.f5595aM = c0876k.m1454f();
                    this.f5596aN = c0876k.m1454f();
                }
                if (m1457d >= 2) {
                    this.f5597aO.f5654g = c0876k.m1454f();
                    this.f5597aO.f5655h = c0876k.m1453g();
                    this.f5597aO.f5656i = c0876k.m1455e();
                    this.f5597aO.f5657j = c0876k.m1455e();
                }
                if (m1457d >= 3 && c0876k.m1455e()) {
                    try {
                        C0453l.m4760a(c0876k);
                        this.f5562x = true;
                    } catch (C0401bb e) {
                        m1690b("Missing unit:" + e.getMessage() + " d:" + e.f2630b);
                        m1689b("Server sync mismatch", e.getMessage());
                        if (!GameEngine.m1157au()) {
                            gameEngine.m1116i(e.getMessage());
                        }
                        String str = "Server sync mismatch";
                        if (e.f2487a != null) {
                            str = e.f2487a;
                        }
                        gameEngine.m1130d(str, e.getMessage());
                        return;
                    }
                }
                if (m1457d >= 4) {
                    this.f5597aO.f5646l = c0876k.m1455e();
                }
                if (m1457d >= 5) {
                    this.f5597aO.f5659m = c0876k.m1455e();
                }
                if (m1457d >= 6) {
                    this.f5597aO.f5660n = c0876k.m1455e();
                }
                if (m1457d >= 7) {
                    this.f5597aO.f5661o = c0876k.m1455e();
                    this.f5597aO.f5662p = c0876k.m1455e();
                }
                if (m1457d >= 8) {
                    this.f5597aO.f5647q = c0876k.m1454f();
                }
                ActivityC0122n.m6910o();
                return;
            case 107:
            case 114:
            case 119:
            case 121:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 162:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 171:
            case SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_POWER /* 177 */:
            default:
                m1669d("we did not handle packet:" + c0861at.f5734b);
                return;
            case 108:
                Connection connection2 = c0861at.f5737a;
                C0876k c0876k2 = new C0876k(c0861at);
                long m1451i = c0876k2.m1451i();
                c0876k2.m1457d();
                C0859ar c0859ar = new C0859ar();
                c0859ar.m1577a(m1451i);
                c0859ar.m1554c(1);
                int m1151b = gameEngine.m1151b();
                if (m1151b > 130) {
                    m1151b = 130;
                }
                c0859ar.m1554c(m1151b);
                m1752a(connection2, c0859ar.m1560b(109));
                return;
            case 109:
                if (!this.f5485C) {
                    m1669d("we are not a server! skipping");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Connection connection3 = c0861at.f5737a;
                C0876k c0876k3 = new C0876k(c0861at);
                long m1451i2 = c0876k3.m1451i();
                byte b = 0;
                if (c0876k3.m1457d() >= 1) {
                    b = c0876k3.m1457d();
                }
                int i2 = (int) (currentTimeMillis - m1451i2);
                connection3.f5801A = i2;
                connection3.f5802B = currentTimeMillis;
                if (connection3.f5781z != null) {
                    connection3.f5781z.f1345V = i2;
                    connection3.f5781z.f1346W = currentTimeMillis;
                    connection3.f5781z.f1344U = b;
                }
                if (connection3.f5772q && this.f5485C && this.f5486D && this.f5483z != null) {
                    this.f5483z.f1345V = i2;
                    this.f5483z.f1346W = currentTimeMillis;
                }
                if (!this.f5533bm) {
                    ActivityC0122n.m6910o();
                    return;
                }
                return;
            case 110:
                m1669d("got REGISTER_CONNECTION");
                if (!this.f5485C) {
                    m1669d("we are not a server! skipping");
                    return;
                }
                C0876k c0876k4 = new C0876k(c0861at);
                Connection connection4 = c0861at.f5737a;
                c0876k4.m1448l();
                int m1454f = c0876k4.m1454f();
                int m1454f2 = c0876k4.m1454f();
                int m1454f3 = c0876k4.m1454f();
                String m1448l = c0876k4.m1448l();
                String m1450j2 = c0876k4.m1450j();
                String str2 = null;
                connection4.f5805E = m1454f2;
                if (m1454f >= 1) {
                    connection4.f5786L = c0876k4.m1448l();
                }
                if (m1454f >= 2) {
                    str2 = c0876k4.m1448l();
                }
                int i3 = -1;
                if (m1454f >= 3) {
                    i3 = c0876k4.m1454f();
                }
                String str3 = "MISSING";
                if (m1454f >= 4) {
                    str3 = c0876k4.m1448l();
                }
                String str4 = VariableScope.nullOrMissingString;
                if (m1454f >= 5) {
                    str4 = c0876k4.m1448l();
                }
                if (m1448l.length() > 20) {
                    m1751a(connection4, "Your username is too long");
                    connection4.m1508a("kicked");
                    return;
                }
                String m1624o = m1624o(m1448l);
                if (m1624o.length() < 2) {
                    m1751a(connection4, "Your username is too short");
                    connection4.m1508a("kicked");
                    return;
                }
                C0187e c0187e = null;
                if (str2 != null) {
                    c0187e = Team.m6377a(str2);
                    if (c0187e != null) {
                        m1669d("Existing player: " + c0187e.f1305k + " - " + c0187e.f1315u);
                    }
                }
                C0850aj m1757a = m1757a(connection4);
                if (m1757a != null) {
                    GameEngine.PrintLog("Connection banned for " + m1757a.m1595b() + " more seconds");
                    m1751a(connection4, m1757a.m1596a());
                    connection4.m1508a("kicked");
                    return;
                }
                String m1805a = this.f5556d.m1805a(connection4, m1624o, m1454f2, m1454f3, connection4.f5786L, c0187e);
                if (m1805a != null) {
                    m1751a(connection4, m1805a);
                    connection4.m1508a("kicked");
                    return;
                } else if (m1454f2 < this.f5618e && !this.f5560v) {
                    m1751a(connection4, "Game is out of date, please update");
                    connection4.m1508a("kicked");
                    return;
                } else if (m1454f2 > this.f5618e && !this.f5560v) {
                    m1751a(connection4, "Your client is newer then the server");
                    connection4.m1508a("kicked");
                    return;
                } else if (!this.f5560v && i3 != gameEngine.m1096y()) {
                    GameEngine.PrintLog("New Player kicked: Unit checksum mismatch: clientUnitsChecksum=" + i3 + " game.getAllUnitsChecksum():" + gameEngine.m1096y());
                    m1751a(connection4, "Your core units are different to the server's core units. Game can not be synchronized");
                    connection4.m1508a("kicked");
                    return;
                } else {
                    if (!this.f5560v) {
                        String m1652g = m1652g(connection4.f5787M);
                        if (!m1652g.equals(str3)) {
                            GameEngine.PrintLog("New Player kicked: Integrity Check Failed: expectedResponse=" + m1652g + " clientResponse=" + str3);
                            m1751a(connection4, "Your 'Rusted Warfare' client is different to the server. Game can not be synchronized.");
                            connection4.m1508a("kicked");
                            return;
                        }
                    }
                    if (!this.f5533bm && this.f5597aO.f5662p) {
                        m1751a(connection4, "Room is locked. New players cannot join this server.");
                        connection4.m1508a("kicked");
                        return;
                    } else if (this.f5533bm && c0187e == null && !this.f5479s) {
                        m1751a(connection4, "A game has already been started on this server");
                        connection4.m1508a("kicked");
                        return;
                    } else if (this.f5475n != null && c0187e == null && !CommonUtils.m2270e(this.f5475n).equals(m1450j2)) {
                        if (m1450j2 == null) {
                            GameEngine.m1144b("processSystemPacket", "Player tried to join but needs a password");
                        } else {
                            GameEngine.m1144b("processSystemPacket", "Player tried to join but had an incorrect password");
                        }
                        m1670d(connection4);
                        return;
                    } else {
                        if (!m1646h(this.f5573W).equals(str4)) {
                            connection4.m1501c("no extra");
                            connection4.f5788N = true;
                        }
                        if (connection4.f5781z == null) {
                            synchronized (this.f5617bP) {
                                if (c0187e == null) {
                                    i = Team.m6416E();
                                } else {
                                    i = c0187e.f1305k;
                                }
                                if (i == -1 && !this.f5560v) {
                                    m1751a(connection4, "No free slots on server");
                                    connection4.m1508a("no free slots");
                                    return;
                                }
                                String mo436a = this.f5556d.mo436a(connection4, m1624o);
                                if (mo436a != null) {
                                    m1751a(connection4, mo436a);
                                    connection4.m1508a("kicked");
                                } else {
                                    C0857ap.m1586a(connection4);
                                    if (!this.f5560v && connection4.f5789O) {
                                        m1751a(connection4, VariableScope.nullOrMissingString);
                                        connection4.m1508a("kicked");
                                        return;
                                    }
                                    String str5 = null;
                                    if (c0187e != null) {
                                        connection4.f5781z = c0187e;
                                        String str6 = VariableScope.nullOrMissingString;
                                        if (this.f5533bm) {
                                            if (c0187e.m6374b()) {
                                                str6 = " (Spectator)";
                                            } else {
                                                str6 = " (Team " + c0187e.m6325h() + ")";
                                            }
                                        }
                                        m1634j("'" + connection4.f5781z.f1315u + "' reconnected. " + str6);
                                        connection4.f5778w = true;
                                        str5 = c0187e.f1315u;
                                        c0187e.f1338O = connection4.f5768m;
                                    } else {
                                        if (this.f5560v && i == -1) {
                                            connection4.f5781z = new C0187e(-3);
                                        } else {
                                            connection4.f5781z = new C0187e(i);
                                            connection4.f5781z.f1311q = i % 2;
                                        }
                                        if (this.f5533bm && this.f5479s) {
                                            connection4.f5778w = true;
                                        }
                                    }
                                    if (c0187e == null && m1624o != null) {
                                        ArrayList m1705ax = m1705ax();
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < 10) {
                                                boolean z = false;
                                                String str7 = m1624o;
                                                if (i4 > 0) {
                                                    str7 = str7 + "(" + i4 + ")";
                                                }
                                                Iterator it = m1705ax.iterator();
                                                while (it.hasNext()) {
                                                    if (str7.equalsIgnoreCase(((Team) it.next()).f1315u)) {
                                                        z = true;
                                                    }
                                                }
                                                if (z) {
                                                    i4++;
                                                } else {
                                                    m1624o = str7;
                                                }
                                            }
                                        }
                                    }
                                    connection4.f5781z.f1315u = m1624o;
                                    connection4.f5781z.f1337N = str2;
                                    connection4.f5781z.f1338O = connection4.f5768m;
                                    connection4.f5805E = m1454f2;
                                    GameEngine.m1144b("processSystemPacket", "New player: " + m1624o + ", networkVersion:" + connection4.f5805E + " existing:" + (c0187e != null));
                                    connection4.f5771p = true;
                                    if (c0187e == null) {
                                        this.f5556d.m1808a(connection4.f5781z);
                                    }
                                    ActivityC0122n.m6910o();
                                    m1662e(connection4);
                                    m1680c(connection4);
                                    this.f5556d.mo425c(connection4, m1624o, str5);
                                    if ((c0187e != null || this.f5479s) && this.f5533bm) {
                                        m1749a(connection4, true);
                                    }
                                }
                                return;
                            }
                        }
                        GameEngine.m1144b("processSystemPacket", "This connection already has a player");
                        return;
                    }
                }
            case 111:
                C0876k c0876k5 = new C0876k(c0861at);
                Connection connection5 = c0861at.f5737a;
                String str8 = null;
                try {
                    str8 = c0876k5.m1448l();
                } catch (IOException e2) {
                    GameEngine.m1188a("Error reading disconnect reason", (Throwable) e2);
                }
                m1669d("Got a disconnect packet:" + str8);
                if (connection5 != null) {
                    connection5.m1505a(false, false, str8);
                }
                if (!this.f5485C) {
                }
                return;
            case 112:
                if (!this.f5485C) {
                    m1669d("we are not a server! skipping");
                    return;
                }
                Connection connection6 = c0861at.f5737a;
                C0876k c0876k6 = new C0876k(c0861at);
                connection6.f5803C = c0876k6.m1455e();
                connection6.f5804D = c0876k6.m1455e();
                return;
            case 113:
                if (this.f5485C) {
                    m1669d("we are a server! skipping: " + c0861at.f5734b);
                    return;
                } else {
                    m1762a(f5555bR);
                    return;
                }
            case 115:
                if (this.f5485C) {
                    m1669d("we are a server! we don't follow orders");
                    return;
                }
                C0876k c0876k7 = new C0876k(c0861at);
                c0876k7.m1462b(c0861at.f5737a.f5805E);
                Connection connection7 = c0861at.f5737a;
                int m1454f4 = c0876k7.m1454f();
                Team team = null;
                int i5 = 8;
                boolean z2 = false;
                if (c0876k7.m1459c() >= 90) {
                    boolean z3 = false;
                    if (c0876k7.m1459c() >= 141) {
                        z3 = true;
                        z2 = c0876k7.m1455e();
                    }
                    i5 = c0876k7.m1454f();
                    Team.m6371b(i5, false);
                    c0876k7.m1466a("teams", z3);
                    if (i5 > Team.f1364c) {
                        throw new IOException("Cannot load:" + i5 + " teams");
                    }
                } else if (this.f5533bm) {
                    m1648g("Warning old team system used in started game, stream version:" + c0876k7.m1459c());
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    C0187e m6317k = Team.m6317k(i6);
                    if (!c0876k7.m1455e()) {
                        if (m6317k != null) {
                            if (this.f5533bm) {
                                m1648g("Warning team:" + i6 + " removed while game is running");
                            }
                            m6317k.m6414G();
                        }
                    } else {
                        c0876k7.m1454f();
                        if (m6317k == null) {
                            if (this.f5533bm) {
                                m1648g("Warning team:" + i6 + " added while game is running");
                            }
                            if (!this.f5485C && (m6317k instanceof C0136a)) {
                                m1648g("Warning we are a client with an AI team");
                            }
                            m6317k = new C0187e(i6);
                        }
                        if (z2) {
                            m6317k.m6384a(c0876k7);
                        } else {
                            m6317k.m6383a(c0876k7, this.f5533bm);
                        }
                    }
                    if (m6317k != null && m6317k.f1305k == m1454f4) {
                        team = m6317k;
                    }
                }
                if (c0876k7.m1459c() >= 90) {
                    c0876k7.m1456d("teams");
                }
                this.f5483z = team;
                this.f5597aO.f5651d = c0876k7.m1454f();
                this.f5597aO.f5650c = c0876k7.m1454f();
                this.f5597aO.f5652e = c0876k7.m1455e();
                this.f5597aO.f5653f = c0876k7.m1454f();
                byte m1457d2 = c0876k7.m1457d();
                this.f5595aM = c0876k7.m1454f();
                this.f5596aN = c0876k7.m1454f();
                if (m1457d2 >= 2) {
                    this.f5597aO.f5654g = c0876k7.m1454f();
                    this.f5597aO.f5655h = c0876k7.m1453g();
                    this.f5597aO.f5656i = c0876k7.m1455e();
                    this.f5597aO.f5657j = c0876k7.m1455e();
                }
                if (m1457d2 >= 3 && c0876k7.m1455e()) {
                    try {
                        C0453l.m4760a(c0876k7);
                        this.f5562x = true;
                    } catch (C0401bb e3) {
                        m1690b("Missing unit:" + e3.getMessage() + " d:" + e3.f2630b);
                        m1689b("Connection Failed", e3.getMessage());
                        if (!GameEngine.m1157au()) {
                            gameEngine.m1116i(e3.getMessage());
                        }
                        gameEngine.m1130d("Connection Failed", e3.getMessage());
                        return;
                    }
                }
                if (m1457d2 >= 4) {
                    this.f5597aO.f5646l = c0876k7.m1455e();
                }
                if (m1457d2 >= 5) {
                    this.f5509al = c0876k7.m1455e();
                }
                ActivityC0122n.m6910o();
                return;
            case 116:
                if (this.f5485C) {
                    m1669d("we are a server! we don't follow orders");
                    return;
                }
                C0876k c0876k8 = new C0876k(c0861at);
                Connection connection8 = c0861at.f5737a;
                c0876k8.m1454f();
                boolean m1455e = c0876k8.m1455e();
                if (m1455e && !this.f5538bu) {
                    this.f5538bu = m1455e;
                    return;
                }
                return;
            case 117:
                Connection connection9 = c0861at.f5737a;
                if (this.f5485C && !connection9.f5772q) {
                    m1669d("we are a server! skipping: " + c0861at.f5734b);
                    return;
                }
                C0876k c0876k9 = new C0876k(c0861at);
                c0876k9.m1457d();
                int m1454f5 = c0876k9.m1454f();
                String m1448l2 = c0876k9.m1448l();
                C0841ae c0841ae = new C0841ae();
                c0841ae.f5637d = true;
                c0841ae.f5636c = m1454f5;
                c0841ae.f5635b = m1448l2;
                m1762a(c0841ae);
                return;
            case 118:
                return;
            case 120:
                if (this.f5485C) {
                    m1669d("error, we are a server but got: PACKET_START_GAME");
                    return;
                }
                C0876k c0876k10 = new C0876k(c0861at);
                c0876k10.m1457d();
                this.f5597aO.f5648a = (EnumC0846ai) c0876k10.m1461b(EnumC0846ai.class);
                if (this.f5597aO.f5648a == EnumC0846ai.f5665c) {
                    this.f5518aQ = c0876k10.m1439u();
                } else if (this.f5597aO.f5648a == EnumC0846ai.f5664b) {
                    this.f5519aR = c0876k10.m1439u();
                }
                this.f5598aP = c0876k10.m1448l();
                m1732aB();
                return;
            case 122:
                if (this.f5485C) {
                    m1669d("error, we are a server but got: PACKET_RETURN_TO_BATTLEROOM");
                    return;
                } else {
                    m1731aC();
                    return;
                }
            case 140:
                if (!this.f5485C) {
                    m1669d("we are not a server! skipping");
                    return;
                }
                Connection connection10 = c0861at.f5737a;
                C0876k c0876k11 = new C0876k(c0861at);
                C0187e c0187e2 = connection10.f5781z;
                if (c0187e2 == null) {
                    if (connection10.f5772q) {
                        m1669d("Allowing message from non player on forwarding connection");
                        c0187e2 = this.f5542bA;
                    } else {
                        m1669d("player is null for message, skipping");
                        return;
                    }
                }
                String m1448l3 = c0876k11.m1448l();
                c0876k11.m1457d();
                String m1636i = m1636i(m1448l3);
                if (this.f5556d.mo435a(connection10, c0187e2.f1315u, m1636i)) {
                    if (this.f5599aS.m1815a(connection10, 60000) > this.f5557h) {
                        if (CommonUtils.m2355a(connection10.f5763g, System.nanoTime()) > 60000) {
                            connection10.f5763g = System.nanoTime();
                            m1634j("Anti-spam: Too many messages from '" + connection10.m1498e() + "'");
                        }
                        if (this.f5470g) {
                            GameEngine.PrintLog("extraDebug:" + m1636i);
                            return;
                        }
                        return;
                    }
                    m1754a(connection10, c0187e2, c0187e2.f1315u, m1636i);
                    this.f5556d.mo428b(connection10, c0187e2.f1315u, m1636i);
                    m1692b(connection10, c0187e2, c0187e2.f1315u, m1636i);
                    return;
                }
                return;
            case 141:
                if (this.f5485C && !c0861at.f5737a.f5772q) {
                    m1669d("error, we are a server but got: PACKET_RECEIVE_CHAT_FROM_SERVER");
                    return;
                }
                C0876k c0876k12 = new C0876k(c0861at);
                String m1448l4 = c0876k12.m1448l();
                byte m1457d3 = c0876k12.m1457d();
                String m1450j3 = c0876k12.m1450j();
                c0876k12.m1454f();
                int i7 = -1;
                if (m1457d3 >= 3) {
                    i7 = c0876k12.m1454f();
                }
                m1693b((Connection) null, i7, m1450j3, m1448l4);
                return;
            case 150:
                if (this.f5485C) {
                    m1669d("error, we are a server but got: PACKET_SEND_KICK");
                    return;
                }
                String m1882c = C0820a.m1882c(new C0876k(c0861at).m1448l());
                m1669d("we got kicked, reason:" + m1882c);
                m1690b("I was kicked");
                m1689b("Kicked", "Kicked: " + m1882c);
                gameEngine.m1130d("Kicked", "Kicked: " + m1882c);
                gameEngine.m1116i("Kicked: " + m1882c);
                return;
            case 151:
                Connection connection11 = c0861at.f5737a;
                if (this.f5485C && !connection11.f5772q) {
                    m1669d("error, we are a server but got: 151");
                    return;
                }
                long m2612a = C0727bl.m2612a();
                C0876k c0876k13 = new C0876k(c0861at);
                int m1454f6 = c0876k13.m1454f();
                int m1454f7 = c0876k13.m1454f();
                if (c0876k13.m1455e()) {
                    C0857ap.f5719i = c0876k13.m1454f();
                }
                if (c0876k13.m1455e()) {
                    C0857ap.f5720j = c0876k13.m1454f();
                }
                String str9 = VariableScope.nullOrMissingString;
                if (m1454f7 == 0) {
                    str9 = VariableScope.nullOrMissingString + C0857ap.f5719i;
                }
                if (m1454f7 == 1) {
                    str9 = VariableScope.nullOrMissingString + C0857ap.f5720j;
                }
                if (m1454f7 == 2) {
                    str9 = m1652g(C0857ap.f5719i);
                }
                if (m1454f7 == 3) {
                    str9 = CommonUtils.m2288c(C0857ap.f5719i + "|" + C0857ap.f5720j);
                }
                if (m1454f7 == 4) {
                    str9 = CommonUtils.m2288c(C0857ap.f5719i + "|" + C0857ap.f5720j);
                }
                if (m1454f7 == 5 || m1454f7 == 6) {
                    String m1448l5 = c0876k13.m1448l();
                    String m1448l6 = c0876k13.m1448l();
                    int m1454f8 = c0876k13.m1454f();
                    if (m1454f7 == 6) {
                        m1448l6 = m1448l6 + C0857ap.f5719i;
                    }
                    if (m1454f8 > 10000000) {
                        str9 = "max";
                    } else {
                        str9 = "-1";
                        int i8 = 0;
                        while (true) {
                            if (i8 <= m1454f8) {
                                if (!CommonUtils.m2288c(m1448l6 + i8).equals(m1448l5)) {
                                    i8++;
                                } else {
                                    str9 = VariableScope.nullOrMissingString + i8;
                                }
                            }
                        }
                    }
                }
                if (m1454f7 == 7) {
                    String m1448l7 = c0876k13.m1448l();
                    int m1454f9 = c0876k13.m1454f();
                    if (m1454f9 > 10000) {
                        str9 = "max";
                    } else {
                        str9 = VariableScope.nullOrMissingString;
                        for (int i9 = 0; i9 < m1454f9; i9++) {
                            str9 = str9 + m1448l7;
                        }
                    }
                }
                float m2610a = C0727bl.m2610a(m2612a);
                C0859ar c0859ar2 = new C0859ar();
                c0859ar2.mo1487a(m1454f6);
                c0859ar2.mo1487a(m1454f7);
                c0859ar2.m1553c(str9);
                c0859ar2.mo1488a(m2610a);
                m1752a(connection11, c0859ar2.m1560b(152));
                return;
            case 160:
                C0876k c0876k14 = new C0876k(c0861at);
                Connection connection12 = c0861at.f5737a;
                c0876k14.m1448l();
                int m1454f10 = c0876k14.m1454f();
                c0876k14.m1454f();
                if (m1454f10 >= 1) {
                    c0876k14.m1454f();
                }
                if (connection12.f5765i) {
                    GameEngine.PrintLog("steam: request info packet");
                }
                if (m1454f10 >= 2 && (m1450j = c0876k14.m1450j()) != null) {
                    connection12.m1501c("Using query string: " + m1450j);
                    connection12.f5770o = m1450j;
                }
                if (m1454f10 >= 3) {
                    c0876k14.m1448l();
                }
                if (m1454f10 >= 4) {
                    c0876k14.m1448l();
                    String m1448l8 = c0876k14.m1448l();
                    if (GameEngine.m1155aw()) {
                        connection12.m1501c("Misc: " + m1448l8);
                    }
                }
                m1649g(connection12);
                return;
            case 161:
                if (this.f5485C) {
                    m1669d("we are a server! we don't PREREGISTER_INFO");
                    return;
                }
                C0876k c0876k15 = new C0876k(c0861at);
                Connection connection13 = c0861at.f5737a;
                if (connection13.f5765i) {
                    GameEngine.PrintLog("steam: got info packet");
                }
                c0876k15.m1448l();
                int m1454f11 = c0876k15.m1454f();
                int m1454f12 = c0876k15.m1454f();
                c0876k15.m1454f();
                c0876k15.m1448l();
                this.f5497S = c0876k15.m1448l();
                connection13.f5805E = m1454f12;
                if (m1454f11 >= 1) {
                    this.f5570T = c0876k15.m1454f();
                }
                if (m1454f11 >= 2) {
                    this.f5571U = c0876k15.m1454f();
                    this.f5572V = c0876k15.m1454f();
                }
                if (this.f5616bN) {
                    m1669d("PACKET_SEND_PREREGISTER_INFO: Register connection has already been sent (resending)");
                }
                m1643h(connection13);
                return;
            case 163:
                if (this.f5485C) {
                    m1669d("we are already a server");
                    return;
                }
                C0876k c0876k16 = new C0876k(c0861at);
                c0876k16.m1457d();
                int m1454f13 = c0876k16.m1454f();
                c0876k16.m1454f();
                c0876k16.m1450j();
                m1669d("Relay version: " + m1454f13);
                return;
            case 170:
                m1669d("Got 'become server' packet");
                if (this.f5485C) {
                    m1669d("we are already a server");
                    return;
                }
                Connection connection14 = c0861at.f5737a;
                C0876k c0876k17 = new C0876k(c0861at);
                byte m1457d4 = c0876k17.m1457d();
                boolean m1455e2 = c0876k17.m1455e();
                boolean m1455e3 = c0876k17.m1455e();
                String m1450j4 = c0876k17.m1450j();
                boolean m1455e4 = c0876k17.m1455e();
                boolean m1455e5 = c0876k17.m1455e();
                String m1450j5 = c0876k17.m1450j();
                boolean z4 = false;
                if (m1457d4 >= 1) {
                    z4 = c0876k17.m1455e();
                }
                String str10 = null;
                if (m1457d4 >= 2) {
                    str10 = c0876k17.m1450j();
                }
                m1669d("Multicast:" + z4);
                connection14.f5773r = z4;
                if (m1455e2) {
                    connection14.f5772q = true;
                }
                if (m1455e3) {
                    connection14.f5774s = true;
                }
                this.f5486D = true;
                this.f5487E = m1450j5;
                gameEngine.networkEngine.f5475n = null;
                gameEngine.networkEngine.f5476o = m1455e4;
                gameEngine.networkEngine.f5478q = m1455e5;
                m1676c(false);
                if (str10 != null) {
                    if (this.f5483z != null) {
                        this.f5483z.f1338O = str10;
                    } else {
                        GameEngine.PrintLog("Become server: No local team");
                    }
                }
                if (gameEngine.networkEngine.f5478q) {
                }
                if (m1450j4 != null) {
                    gameEngine.f6109bQ.networkServerId = m1450j4;
                }
                if (gameEngine.f6233bx > 60) {
                    this.f5500aa = true;
                }
                if (!this.f5562x && !this.f5533bm) {
                    GameEngine.PrintLog("enableAllCustomUnitsPossible mods:" + this.f5476o);
                    C0348af.m5396b(this.f5476o);
                    this.f5562x = true;
                    return;
                }
                return;
            case 172:
                Connection connection15 = c0861at.f5737a;
                if (!connection15.f5772q) {
                    m1669d("forwarding not allowed on this connection");
                    return;
                }
                m1669d("got FORWARD_CLIENT_ADD");
                C0876k c0876k18 = new C0876k(c0861at);
                byte m1457d5 = c0876k18.m1457d();
                int m1454f14 = c0876k18.m1454f();
                String m1448l9 = c0876k18.m1448l();
                String m1450j6 = c0876k18.m1450j();
                String str11 = null;
                if (m1457d5 >= 1) {
                    str11 = c0876k18.m1450j();
                }
                if (m1756a(connection15, m1454f14) != null) {
                    m1669d("Not adding client:" + m1454f14 + " already exists");
                    return;
                } else if (m1755a(connection15, m1454f14, m1448l9, str11) != null && m1450j6 != null) {
                    C0187e m6360b = Team.m6360b(m1448l9);
                    if (m6360b == null) {
                        m1669d("PACKET_FORWARD_CLIENT_ADD: Failed to find existing player with id:" + m1448l9);
                        Iterator it2 = Team.m6358c().iterator();
                        while (it2.hasNext()) {
                            Team team2 = (Team) it2.next();
                            if (team2 != null) {
                                m1669d("option: " + team2.f1315u + " - " + team2.f1338O + " - localPlayer:" + (this.f5483z == team2));
                            }
                        }
                        return;
                    }
                    m6360b.f1337N = m1450j6;
                    return;
                } else {
                    return;
                }
            case 173:
                Connection connection16 = c0861at.f5737a;
                if (!connection16.f5772q) {
                    m1669d("forwarding not allowed on this connection");
                    return;
                }
                m1669d("got FORWARD_CLIENT_REMOVE");
                C0876k c0876k19 = new C0876k(c0861at);
                c0876k19.m1457d();
                Connection m1756a = m1756a(connection16, c0876k19.m1454f());
                if (m1756a != null) {
                    m1691b(m1756a, (String) null);
                    return;
                }
                return;
            case 174:
                Connection connection17 = c0861at.f5737a;
                if (!connection17.f5772q) {
                    m1669d("forwarding not allowed on this connection");
                    return;
                }
                C0876k c0876k20 = new C0876k(c0861at);
                int m1454f15 = c0876k20.m1454f();
                byte[] m1440t = c0876k20.m1440t();
                Connection m1756a2 = m1756a(connection17, m1454f15);
                if (m1756a2 == null) {
                    m1669d("PACKET_FORWARD_CLIENT_FROM failed, cannot find client");
                    return;
                } else if (!(m1756a2.f5761d instanceof C0873h)) {
                    m1669d("PACKET_FORWARD_CLIENT_FROM failed, socket is wrong type");
                    return;
                } else {
                    ((C0873h) m1756a2.f5761d).f5847d.m1473a(m1440t);
                    return;
                }
            case 175:
                m1669d("got PACKET_FORWARD_CLIENT_TO");
                return;
            case 176:
                m1669d("got PACKET_FORWARD_CLIENT_TO_REPEATED");
                return;
            case SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_INPUT /* 178 */:
                m1669d("got PACKET_RECONNECT_TO");
                Connection connection18 = c0861at.f5737a;
                if (this.f5485C && !connection18.f5772q) {
                    m1669d("we are a server, ");
                    return;
                }
                C0876k c0876k21 = new C0876k(c0861at);
                c0876k21.m1457d();
                c0876k21.m1454f();
                boolean m1455e6 = c0876k21.m1455e();
                int m1454f16 = c0876k21.m1454f();
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < m1454f16; i10++) {
                    arrayList.add(c0876k21.m1448l());
                }
                m1739a(arrayList, m1455e6);
                return;
        }
    }

    /* renamed from: i */
    public static String m1636i(String str) {
        char[] charArray;
        if (str == null) {
            return null;
        }
        if (str.length() > 250) {
            str = str.substring(0, 250);
        }
        if (str.contains("\n")) {
            str = str.replace("\n", "?");
        }
        String replace = str.replace("��", ".");
        boolean z = false;
        char[] charArray2 = replace.toCharArray();
        int length = charArray2.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (!Character.isISOControl(charArray2[i])) {
                    i++;
                } else {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            for (char c : replace.toCharArray()) {
                if (!Character.isISOControl(c)) {
                    sb.append(c);
                }
            }
            replace = sb.toString();
        }
        return replace;
    }

    /* renamed from: J */
    public void m1793J() {
        GameEngine.getInstance().f6111bS.f5106d.m2185n();
    }

    /* renamed from: K */
    public void m1792K() {
        m1689b((String) null, (String) null);
    }

    /* renamed from: b */
    public void m1689b(String str, String str2) {
        ActivityC0122n.m6915a(str, str2);
        this.f5556d.mo424d();
    }

    /* renamed from: L */
    public synchronized void m1791L() {
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5771p) {
                m1680c(connection);
            }
        }
    }

    /* renamed from: c */
    public synchronized void m1680c(Connection connection) {
        if (!this.f5485C) {
            m1669d("sendServerInfo: we are not a server!");
            return;
        }
        C0859ar c0859ar = new C0859ar();
        try {
            c0859ar.m1553c("com.corrodinggames.rts");
            c0859ar.mo1487a(this.f5618e);
            c0859ar.m1564a(this.f5597aO.f5648a);
            if (this.f5560v) {
                c0859ar.m1553c("<CHAT ONLY>");
            } else {
                c0859ar.m1553c(this.f5597aO.f5649b == null ? "<NULL>" : C0750a.m2437n(this.f5597aO.f5649b));
            }
            c0859ar.mo1487a(this.f5597aO.f5650c);
            c0859ar.mo1487a(this.f5597aO.f5651d);
            c0859ar.mo1482a(this.f5597aO.f5652e);
            c0859ar.mo1487a(this.f5597aO.f5653f);
            c0859ar.m1554c(8);
            c0859ar.mo1482a(this.f5556d.m1807a(connection));
            c0859ar.mo1482a(this.f5556d.m1804b(connection));
            c0859ar.mo1487a(this.f5595aM);
            c0859ar.mo1487a(this.f5596aN);
            c0859ar.mo1487a(this.f5597aO.f5654g);
            c0859ar.mo1488a(this.f5597aO.f5655h);
            c0859ar.mo1482a(this.f5597aO.f5656i);
            c0859ar.mo1482a(this.f5597aO.f5657j);
            if (this.f5560v) {
                c0859ar.mo1482a(false);
            } else {
                c0859ar.mo1482a(true);
                C0453l.m4761a(c0859ar);
            }
            c0859ar.mo1482a(this.f5597aO.f5646l);
            c0859ar.mo1482a(this.f5597aO.f5659m);
            c0859ar.mo1482a(this.f5597aO.f5660n);
            c0859ar.mo1482a(this.f5597aO.f5661o);
            c0859ar.mo1482a(this.f5597aO.f5662p);
            c0859ar.mo1487a(this.f5597aO.f5647q);
            m1752a(connection, c0859ar.m1560b(106));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public synchronized void m1751a(Connection connection, String str) {
        if (!this.f5485C) {
            m1669d("sendKick: we are not a server!");
            return;
        }
        m1669d("kicking client reason:" + str);
        C0859ar c0859ar = new C0859ar();
        try {
            c0859ar.m1553c(str);
            m1752a(connection, c0859ar.m1560b(150));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public synchronized void m1670d(Connection connection) {
        if (!this.f5485C) {
            m1669d("sendIncorrectPassword: we are not a server!");
            return;
        }
        m1669d("sendIncorrectPassword");
        C0859ar c0859ar = new C0859ar();
        try {
            c0859ar.mo1487a(0);
            m1752a(connection, c0859ar.m1560b(113));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: M */
    public void m1790M() {
        if (this.f5485C) {
            for (int i = 0; i < Team.f1367f; i++) {
                Team m6317k = Team.m6317k(i);
                if (m6317k != null) {
                    if (this.f5560v) {
                        m6317k.f1351ab = 0;
                    } else if (m6317k.m6374b()) {
                        m6317k.f1351ab = 100;
                    } else {
                        m6317k.f1351ab = m6317k.f1311q;
                    }
                    if (m6317k.m6374b()) {
                        m6317k.f1323C = -1;
                    } else {
                        int m6405P = m6317k.m6405P();
                        if (m6317k.f1322B != null) {
                            m6405P = m6317k.f1322B.intValue();
                        } else if (m1771a(m6405P, (Team) null)) {
                            m6405P = -1;
                        }
                        m6317k.f1323C = m6405P;
                    }
                }
            }
            for (int i2 = 0; i2 < Team.f1367f; i2++) {
                Team m6317k2 = Team.m6317k(i2);
                if (m6317k2 != null && m6317k2.f1323C == -1 && !m6317k2.m6374b()) {
                    m6317k2.f1323C = m1789N();
                }
            }
        }
    }

    /* renamed from: N */
    public int m1789N() {
        for (int i = 0; i < 10; i++) {
            if (!m1658f(i)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public boolean m1658f(int i) {
        for (int i2 = 0; i2 < Team.f1367f; i2++) {
            Team m6317k = Team.m6317k(i2);
            if (m6317k != null && m6317k.f1323C == i && !m6317k.m6374b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1771a(int i, Team team) {
        for (int i2 = 0; i2 < Team.f1367f; i2++) {
            Team m6317k = Team.m6317k(i2);
            if (m6317k != null && m6317k != team && m6317k.f1322B != null && m6317k.f1322B.intValue() == i && !m6317k.m6374b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    public void m1788O() {
        if (this.f5485C) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = GameEngine.getInstance().f6096by;
            if (this.f5483z != null && !this.f5486D) {
                this.f5483z.f1345V = -99;
                this.f5483z.f1346W = currentTimeMillis;
            }
            m1790M();
            for (int i2 = 0; i2 < Team.f1364c; i2++) {
                Team m6317k = Team.m6317k(i2);
                if (m6317k != null) {
                    m6317k.m6346c(this.f5483z == m6317k);
                    if (!this.f5533bm) {
                    }
                    if (this.f5533bm && !this.f5565F && !m6317k.f1316v) {
                        boolean z = false;
                        if (m6317k.m6302z()) {
                            z = true;
                        }
                        long j = 60000;
                        if (m6317k.f1348Y > 180000) {
                            j = 160000;
                        }
                        boolean z2 = false;
                        if (this.f5500aa) {
                            if (m6317k.f1347X == -1) {
                                m6317k.f1347X = currentTimeMillis;
                                m6317k.f1348Y = i;
                            }
                            if ((this.f5508ak || this.f5509al) && !m6317k.f1350aa) {
                                m6317k.f1347X = currentTimeMillis;
                                m6317k.f1348Y = i;
                            }
                            if (m6317k.f1347X + j < currentTimeMillis) {
                                z2 = true;
                            }
                        }
                        if (m6317k.f1350aa != z2) {
                            m6317k.f1350aa = z2;
                        }
                        if (z2) {
                            z = true;
                            if (!m6317k.f1349Z) {
                                if (!(m6317k.f1329F || m6317k.f1328E || m6317k.f1332I || m6317k.m6374b())) {
                                    m6317k.f1349Z = true;
                                }
                            }
                        }
                        if (m6317k.f1332I != z) {
                            if (z && !m6317k.f1329F && !m6317k.f1328E && !m6317k.f1331H && !m6317k.m6374b()) {
                                String str = "-t [Sharing control due to disconnect]";
                                if (z2) {
                                    str = "-t [Sharing control due to afk]";
                                }
                                GameEngine.PrintLog(m6317k.f1315u + " - " + str);
                                if (Team.m6392a(m6317k.f1311q, true) > 1) {
                                    m1754a((Connection) null, m6317k, m6317k.f1315u, str);
                                }
                            }
                            m6317k.f1332I = z;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: P */
    public void m1787P() {
        if (this.f5516aK == 0) {
            this.f5516aK = System.currentTimeMillis();
        }
    }

    /* renamed from: Q */
    public void m1786Q() {
        this.f5516aK = 0L;
        m1662e((Connection) null);
    }

    /* renamed from: e */
    public void m1662e(Connection connection) {
        if (!this.f5485C) {
            m1669d("sendUpdatePlayer: we are not a server!");
            return;
        }
        m1788O();
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection2 = (Connection) it.next();
            if (connection2.f5771p) {
                C0859ar c0859ar = new C0859ar(connection2.f5805E);
                try {
                    c0859ar.mo1487a(connection2.m1502c());
                    int i = Team.f1364c;
                    boolean z = false;
                    if (c0859ar.m1547g() >= 90) {
                        boolean z2 = false;
                        if (c0859ar.m1547g() >= 141) {
                            z2 = true;
                            if (this.f5533bm && connection2.f5791Q) {
                                z = true;
                            }
                            c0859ar.mo1482a(z);
                        }
                        c0859ar.mo1487a(i);
                        c0859ar.mo1484a("teams", z2);
                    } else {
                        i = 8;
                        if (!this.f5560v) {
                            m1669d("sendUpdatePlayer: warning saving with lower team count");
                        }
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        Team m6317k = Team.m6317k(i2);
                        c0859ar.mo1482a(m6317k != null);
                        if (m6317k != null) {
                            int i3 = 0;
                            if (m6317k instanceof C0136a) {
                                i3 = 1;
                            }
                            c0859ar.mo1487a(i3);
                            if (z) {
                                m6317k.m6349c(c0859ar);
                            } else {
                                m6317k.m6364b(c0859ar);
                            }
                        }
                    }
                    if (c0859ar.m1547g() >= 90) {
                        c0859ar.mo1485a("teams");
                    }
                    c0859ar.mo1487a(this.f5597aO.f5651d);
                    c0859ar.mo1487a(this.f5597aO.f5650c);
                    c0859ar.mo1482a(this.f5597aO.f5652e);
                    c0859ar.mo1487a(this.f5597aO.f5653f);
                    c0859ar.m1554c(5);
                    c0859ar.mo1487a(this.f5595aM);
                    c0859ar.mo1487a(this.f5596aN);
                    c0859ar.mo1487a(this.f5597aO.f5654g);
                    c0859ar.mo1488a(this.f5597aO.f5655h);
                    c0859ar.mo1482a(this.f5597aO.f5656i);
                    c0859ar.mo1482a(this.f5597aO.f5657j);
                    c0859ar.mo1482a(false);
                    c0859ar.mo1482a(this.f5597aO.f5646l);
                    c0859ar.mo1482a(this.f5509al);
                    int i4 = -1;
                    if (connection == connection2 && connection2.f5805E <= 26) {
                        i4 = 1000;
                    }
                    connection2.f5791Q = true;
                    m1752a(connection2, c0859ar.m1578a(115, i4));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: R */
    public synchronized boolean m1785R() {
        if (m1784S()) {
            this.f5477p = true;
            this.f5597aO.f5651d = 0;
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public synchronized boolean m1784S() {
        if (this.f5564B) {
            m1690b("Started singleplayer");
        }
        GameEngine gameEngine = GameEngine.getInstance();
        m1620r();
        this.f5564B = true;
        this.f5485C = true;
        this.f5565F = true;
        this.f5597aO.f5648a = gameEngine.m1165am();
        this.f5597aO.f5649b = gameEngine.m1166al();
        m1728aa();
        this.f5483z = gameEngine.f6093bs;
        ActivityC0122n.m6910o();
        this.f5474m = gameEngine.f6109bQ.networkPort;
        m1669d("singleplayer server started");
        return true;
    }

    /* renamed from: aA */
    private void m1733aA() {
        this.f5597aO.f5647q = CommonUtils.m2360a(1, 1000000000);
    }

    /* renamed from: b */
    public synchronized boolean m1687b(boolean z) {
        if (this.f5564B) {
            throw new RuntimeException("networking already started");
        }
        m1621q();
        this.f5564B = true;
        this.f5485C = true;
        m1728aa();
        m1733aA();
        GameEngine gameEngine = GameEngine.getInstance();
        m1676c(z);
        ActivityC0122n.m6910o();
        this.f5474m = gameEngine.f6109bQ.networkPort;
        C1058a.m786a().m774i();
        this.f5521aU = new RunnableC0854an(this);
        try {
            this.f5521aU.m1590a(false);
            this.f5520aT = new Thread(this.f5521aU);
            this.f5520aT.setDaemon(true);
            this.f5520aT.start();
            if (1 != 0) {
                this.f5523aW = new RunnableC0854an(this);
                try {
                    this.f5523aW.m1590a(true);
                    this.f5522aV = new Thread(this.f5523aW);
                    this.f5522aV.start();
                } catch (IOException e) {
                    e.printStackTrace();
                    gameEngine.m1192a("Could not open udp port:" + this.f5474m + ", check this port is not in use or change the port in the game settings", 1);
                    m1690b("Could not open udp port");
                    return false;
                }
            }
            m1716am();
            if (this.f5478q) {
                C0879n.m1418b();
            }
            this.f5532bl = null;
            if (f5554r) {
                C0879n.m1434a();
            }
            m1669d("server started");
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            gameEngine.m1192a("Could not open tcp port:" + this.f5474m + ", check this port is not in use or change the port in the game settings", 1);
            m1690b("Could not open tcp port");
            return false;
        }
    }

    /* renamed from: c */
    public void m1676c(boolean z) {
        int i;
        this.f5485C = true;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f5483z == null) {
            C0187e c0187e = null;
            if (!z) {
                i = Team.m6416E();
                if (i == -1) {
                    throw new RuntimeException("playerId is -1 for server player");
                }
            } else {
                c0187e = this.f5542bA;
                i = this.f5542bA.f1305k;
            }
            if (c0187e == null) {
                c0187e = new C0187e(i);
                c0187e.f1315u = this.f5481y;
                gameEngine.f6093bs = c0187e;
            }
            this.f5483z = c0187e;
        }
        if (this.f5525aY == null) {
            GameEngine.PrintLog("pingerTask starting");
            this.f5525aY = new C0862au(this);
            this.f5524aX = new Timer();
            this.f5524aX.schedule(this.f5525aY, 100L, 100L);
        } else {
            GameEngine.PrintLog("pingerTask already active");
        }
        ActivityC0122n.m6910o();
    }

    /* renamed from: T */
    public boolean m1783T() {
        return GameEngine.getInstance().f6109bQ.udpInMultiplayer;
    }

    /* renamed from: a */
    public RunnableC0853am m1741a(String str, boolean z, Runnable runnable) {
        RunnableC0853am runnableC0853am = new RunnableC0853am(str, z, runnable);
        runnableC0853am.m1593b();
        return runnableC0853am;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.net.Socket] */
    /* renamed from: b */
    public static Socket m1688b(String str, boolean z) {
        C0017h c0017h;
        String str2;
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLog("Connect to server: " + str + " (force tcp:" + z + ")");
        boolean z2 = false;
        String trim = str.trim();
        if (trim.startsWith("get|")) {
            String[] split = trim.split("\\|");
            try {
                String str3 = split[0];
                String str4 = split[1];
                int parseInt = Integer.parseInt(split[2]);
                boolean parseBoolean = Boolean.parseBoolean(split[3]);
                Integer.parseInt(split[4]);
                if (parseBoolean) {
                    gameEngine.networkEngine.f5475n = null;
                    Object obj = new Object();
                    C08321 c08321 = new C08321(obj);
                    GameEngine.PrintLog("Asking for password..");
                    synchronized (obj) {
                        m1762a(c08321);
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (gameEngine.networkEngine.f5475n == null) {
                        GameEngine.m1145b("No password entered");
                        throw new C0844ag();
                    }
                    GameEngine.PrintLog("Password has been entered");
                }
                String str5 = null;
                if (parseBoolean) {
                    str5 = gameEngine.networkEngine.f5475n;
                    if (str5 == null) {
                        throw new IOException("This server requires a password but no password was provided");
                    }
                }
                Object obj2 = new Object();
                C08332 c08332 = new C08332(obj2);
                synchronized (obj2) {
                    C0879n.m1431a(c08332, str4, parseInt, str5);
                    try {
                        obj2.wait(15000L);
                    } catch (InterruptedException e2) {
                    }
                }
                if (c08332.f5898b != null) {
                    throw new IOException(c08332.f5898b);
                }
                if (c08332.f5897a == null) {
                    throw new IOException("Failed to get game server info.");
                }
                return m1688b(c08332.f5897a, z);
            } catch (NumberFormatException e3) {
                e3.printStackTrace();
                throw new IOException("Bad server connect string");
            }
        }
        if (trim.toLowerCase(Locale.ENGLISH).endsWith(".relay")) {
            trim = trim + ".corrodinggames.com";
        }
        if (trim.startsWith("[TCP]")) {
            trim = trim.substring("[TCP]".length());
            z = true;
        }
        if (trim.length() > 4 && !trim.contains(":") && !trim.contains(".") && !trim.equals("localhost") && !trim.contains("/") && !trim.contains("\\")) {
            String str6 = (VariableScope.nullOrMissingString + trim.charAt(0)) + ".relay.corrodinggames.com/" + trim;
            GameEngine.PrintLog("Converting connect string to: " + str6);
            trim = str6;
        }
        gameEngine.networkEngine.f5491L = null;
        if (trim.contains("/") || trim.contains("\\")) {
            int indexOf = trim.indexOf("/");
            int indexOf2 = trim.indexOf("\\");
            if (indexOf == -1) {
                indexOf = trim.length();
            }
            if (indexOf2 == -1) {
                indexOf2 = trim.length();
            }
            int m2289c = CommonUtils.m2289c(indexOf, indexOf2);
            String trim2 = trim.substring(m2289c + 1).trim();
            if (!trim2.equals(VariableScope.nullOrMissingString)) {
                gameEngine.networkEngine.f5491L = trim2;
            }
            trim = trim.substring(0, m2289c);
        }
        String str7 = trim;
        int i = 5123;
        String[] split2 = trim.split(":");
        if (split2.length > 1) {
            str7 = null;
            for (int i2 = 0; i2 < split2.length - 1; i2++) {
                if (str7 == null) {
                    str2 = VariableScope.nullOrMissingString;
                } else {
                    str2 = str7 + ":";
                }
                str7 = str2 + split2[i2];
            }
            String str8 = split2[split2.length - 1];
            try {
                i = Integer.parseInt(str8);
            } catch (NumberFormatException e4) {
                String str9 = "Bad port number:" + str8;
                e4.printStackTrace();
                throw new IOException(str9);
            }
        }
        if (!z && gameEngine.networkEngine.m1783T()) {
            z2 = true;
        }
        int i3 = 7000;
        GameEngine.PrintLog(VariableScope.nullOrMissingString);
        GameEngine.PrintLog("===============================");
        GameEngine.PrintLog("Connect to: " + trim);
        if (!z2) {
            c0017h = new Socket();
            GameEngine.PrintLog("connecting to Server.. (tcp)");
        } else {
            c0017h = new C0017h();
            GameEngine.PrintLog("connecting to Server.. (udp)");
            i3 = 5000;
        }
        c0017h.setTcpNoDelay(true);
        try {
            try {
                c0017h.connect(new InetSocketAddress(InetAddress.getByName(str7), i), i3);
                return c0017h;
            } catch (UnknownHostException e5) {
                String str10 = "Failed to connect to host";
                if (z2) {
                    str10 = str10 + " (udp)";
                }
                GameEngine.PrintLog("UnknownHostException.." + str10);
                e5.printStackTrace();
                throw new IOException(str10, e5);
            } catch (IOException e6) {
                String str11 = "Failed to connect to host";
                if (z2) {
                    str11 = str11 + " (udp)";
                }
                String str12 = str11 + " - " + e6.getMessage();
                GameEngine.PrintLog("IOException.." + str12);
                e6.printStackTrace();
                throw new IOException(str12, e6);
            }
        } catch (IllegalArgumentException e7) {
            GameEngine.m1145b("IllegalArgumentException..Incorrect server format");
            e7.printStackTrace();
            throw new IOException("Incorrect server format", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.i.ad$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ad$1.class */
    public final class C08321 extends C0841ae {

        /* renamed from: a */
        final /* synthetic */ Object f5621a;

        C08321(Object obj) {
            this.f5621a = obj;
        }

        /* renamed from: a */
        public void m1610a(String str) {
            GameEngine gameEngine = GameEngine.getInstance();
            GameEngine.PrintLog("Entered password");
            if (gameEngine.networkEngine.f5485C) {
                GameEngine.m1193a("Cannot enter a password when we are a server");
            } else {
                gameEngine.networkEngine.f5475n = str;
            }
            synchronized (this.f5621a) {
                this.f5621a.notify();
            }
        }

        /* renamed from: a */
        public void m1611a() {
            synchronized (this.f5621a) {
                this.f5621a.notify();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.i.ad$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ad$2.class */
    public final class C08332 extends C0890w {

        /* renamed from: d */
        final /* synthetic */ Object f5622d;

        C08332(Object obj) {
            this.f5622d = obj;
        }

        /* renamed from: a */
        public void mo1405a(String str) {
            super.mo1405a(str);
            synchronized (this.f5622d) {
                this.f5622d.notify();
            }
        }

        /* renamed from: a */
        public void mo1404a(String str, EnumC0891x enumC0891x, Exception exc) {
            super.mo1404a(str, enumC0891x, exc);
            synchronized (this.f5622d) {
                this.f5622d.notify();
            }
        }
    }

    /* renamed from: U */
    public void m1782U() {
        GameEngine gameEngine = GameEngine.getInstance();
        C0767e m2171a = C0767e.m2171a(C0820a.m1886a("menus.ingame.multiplayerReconnect.message", new Object[0]), false);
        m2171a.m2172a(C0820a.m1886a("menus.ingame.resume", new Object[0]), new C08343(m2171a));
        m2171a.m2172a(C0820a.m1886a("menus.ingame.reconnect", new Object[0]), new C08354(m2171a));
        m2171a.m2172a(C0820a.m1886a("menus.ingame.disconnect", new Object[0]), new C08365(m2171a, gameEngine));
        gameEngine.f6111bS.m2030a(m2171a);
        this.f5547bL = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.i.ad$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ad$3.class */
    public class C08343 extends AbstractC0772i {

        /* renamed from: a */
        final /* synthetic */ C0767e f5623a;

        C08343(C0767e c0767e) {
            this.f5623a = c0767e;
        }

        /* renamed from: a */
        public boolean mo2158a(C0765c c0765c) {
            this.f5623a.m2133i();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.i.ad$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ad$4.class */
    public class C08354 extends AbstractC0772i {

        /* renamed from: a */
        final /* synthetic */ C0767e f5625a;

        C08354(C0767e c0767e) {
            this.f5625a = c0767e;
        }

        /* renamed from: a */
        public boolean mo2158a(C0765c c0765c) {
            this.f5625a.m2133i();
            C0831ad.this.m1781V();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.i.ad$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ad$5.class */
    public class C08365 extends AbstractC0772i {

        /* renamed from: a */
        final /* synthetic */ C0767e f5627a;

        /* renamed from: b */
        final /* synthetic */ GameEngine f5628b;

        C08365(C0767e c0767e, GameEngine gameEngine) {
            this.f5627a = c0767e;
            this.f5628b = gameEngine;
        }

        /* renamed from: a */
        public boolean mo2158a(C0765c c0765c) {
            this.f5627a.m2133i();
            this.f5628b.m1194a(new RunnableC08371());
            return true;
        }

        /* renamed from: com.corrodinggames.rts.gameFramework.i.ad$5$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ad$5$1.class */
        class RunnableC08371 implements Runnable {
            RunnableC08371() {
            }

            public void run() {
                C0831ad.this.m1690b("already disconnected");
                C08365.this.f5628b.f6111bS.f5106d.m2186m();
            }
        }
    }

    /* renamed from: V */
    public synchronized boolean m1781V() {
        Socket socket = this.f5613bJ;
        if (socket == null) {
            GameEngine.PrintLog("reconnectToServer: lastConnectedTo==null");
            return false;
        }
        GameEngine.PrintLog("reconnectToServer attempted");
        if (this.f5564B) {
            GameEngine.PrintLog("reconnectToServer: disconnecting");
            m1690b("reconnecting");
        }
        if (socket.getInetAddress() == null) {
            GameEngine.PrintLog("reconnectToServer: lastConnectedTo.getInetAddress()==null");
            return false;
        }
        String str = socket.getInetAddress().getHostAddress() + ":" + socket.getPort();
        GameEngine.PrintLog("reconnectToServer: connecting to: " + str);
        try {
            return m1740a(m1688b(str, false));
        } catch (C0844ag e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public synchronized boolean m1740a(Socket socket) {
        if (this.f5564B) {
            m1690b("starting new");
        }
        if (socket == null) {
            throw new RuntimeException("connectedSocket==null");
        }
        m1621q();
        GameEngine.getInstance();
        this.f5474m = socket.getPort();
        this.f5564B = true;
        this.f5485C = false;
        m1669d("connected to Server..");
        Connection connection = new Connection(this, socket);
        connection.f5771p = true;
        connection.m1500d();
        this.f5600bc.add(connection);
        m1655f(connection);
        m1716am();
        this.f5613bJ = socket;
        return true;
    }

    /* renamed from: c */
    public Connection m1683c(Team team) {
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5781z == team) {
                return connection;
            }
        }
        return null;
    }

    /* renamed from: d */
    public Connection m1672d(Team team) {
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (!connection.f5797a && connection.f5781z == team) {
                return connection;
            }
        }
        return null;
    }

    /* renamed from: W */
    public Connection m1780W() {
        if (this.f5485C) {
            return null;
        }
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (!connection.f5797a) {
                return connection;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void m1671d(C0861at c0861at) {
        if (!this.f5564B) {
            GameEngine.PrintLog("Skipping sendPacketToAll, not networked");
        } else {
            m1638i(c0861at);
        }
    }

    /* renamed from: i */
    private void m1638i(C0861at c0861at) {
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5771p && !connection.f5797a && !connection.f5774s) {
                connection.m1511a(c0861at);
            }
        }
    }

    /* renamed from: e */
    public void m1663e(C0861at c0861at) {
        if (!this.f5564B) {
            GameEngine.PrintLog("Skipping sendPacketToAllIncludingRelay, not networked");
            return;
        }
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5771p && !connection.f5797a) {
                connection.m1511a(c0861at);
            }
        }
    }

    /* renamed from: f */
    public void m1656f(C0861at c0861at) {
        if (!this.f5564B) {
            GameEngine.PrintLog("Skipping sendPacketToServer, not networked");
        } else if (this.f5485C) {
            throw new RuntimeException("We are a server");
        } else {
            m1671d(c0861at);
        }
    }

    /* renamed from: g */
    public void m1650g(C0861at c0861at) {
        if (!this.f5564B) {
            GameEngine.PrintLog("Skipping sendPacketToClients, not networked");
        } else if (!this.f5485C) {
            throw new RuntimeException("We are not a server");
        } else {
            m1663e(c0861at);
        }
    }

    /* renamed from: h */
    public void m1644h(C0861at c0861at) {
        if (!this.f5564B) {
            GameEngine.PrintLog("Skipping sendPacketToClients, not networked");
        } else if (!this.f5485C) {
            throw new RuntimeException("We are not a server");
        } else {
            m1671d(c0861at);
        }
    }

    /* renamed from: a */
    public void m1752a(Connection connection, C0861at c0861at) {
        if (!this.f5564B) {
            GameEngine.PrintLog("Skipping sendPacketOnConnection, not networked");
        } else {
            connection.m1511a(c0861at);
        }
    }

    /* renamed from: X */
    public void m1779X() {
        if (this.f5485C) {
            m1669d("registerConnection: We are a server");
        }
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            m1643h((Connection) it.next());
        }
    }

    /* renamed from: Y */
    public void m1778Y() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6109bQ.networkClientId = null;
        if (this.f5497S == null) {
            GameEngine.PrintLog("generateNewClientId: serverUUID==null");
            this.f5497S = "x";
        }
        m1777Z();
        gameEngine.f6109bQ.save();
    }

    /* renamed from: Z */
    public String m1777Z() {
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z = false;
        if (gameEngine.f6109bQ.networkClientId == null) {
            z = true;
        }
        if (!this.f5615bM) {
            this.f5615bM = true;
            if (GameEngine.m1157au()) {
                String m1718ak = m1718ak();
                if (!m1718ak.equals(gameEngine.f6109bQ.networkClientIdMachineKey)) {
                    if (gameEngine.f6109bQ.networkClientIdMachineKey != null) {
                        GameEngine.PrintLog("Machine appears to have changed: " + gameEngine.f6109bQ.networkClientIdMachineKey + " vs " + m1718ak);
                    }
                    gameEngine.f6109bQ.networkClientIdMachineKey = m1718ak;
                    z = true;
                }
            }
        }
        if (z) {
            GameEngine.PrintLog("new networkClientId needed");
            gameEngine.f6109bQ.networkClientId = UUID.randomUUID().toString();
            gameEngine.f6109bQ.save();
        }
        String str = gameEngine.f6109bQ.networkClientId;
        if (this.f5497S == null) {
            throw new RuntimeException("getOwnClientIdHashed: serverUUID==null");
        }
        return CommonUtils.m2270e(str + this.f5497S);
    }

    /* renamed from: aa */
    public void m1728aa() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6109bQ.networkServerId = UUID.randomUUID().toString();
        gameEngine.f6109bQ.save();
    }

    /* renamed from: ab */
    public String m1727ab() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6109bQ.networkServerId == null) {
            m1728aa();
        }
        return gameEngine.f6109bQ.networkServerId;
    }

    /* renamed from: ac */
    public String m1726ac() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f5485C) {
            return gameEngine.f6109bQ.networkServerId;
        }
        return this.f5497S;
    }

    /* renamed from: f */
    public void m1655f(Connection connection) {
        C0859ar c0859ar = new C0859ar();
        try {
            int i = 1;
            if (GameEngine.m1157au()) {
                i = 2;
            }
            if (GameEngine.f6204aZ) {
                i = 3;
            }
            c0859ar.m1553c("com.corrodinggames.rts");
            c0859ar.mo1487a(4);
            c0859ar.mo1487a(this.f5618e);
            c0859ar.mo1487a(i);
            c0859ar.m1557b(this.f5491L);
            c0859ar.m1553c(this.f5481y);
            c0859ar.m1553c(C0820a.m1883c());
            String str = VariableScope.nullOrMissingString;
            if (GameEngine.f6198aT) {
                str = str + "d";
            }
            c0859ar.m1553c(str);
            m1752a(connection, c0859ar.m1560b(160));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public void m1649g(Connection connection) {
        C0859ar c0859ar = new C0859ar();
        try {
            GameEngine gameEngine = GameEngine.getInstance();
            c0859ar.m1553c("com.corrodinggames.rts");
            c0859ar.mo1487a(2);
            c0859ar.mo1487a(this.f5618e);
            c0859ar.mo1487a(gameEngine.m1135c(true));
            c0859ar.m1553c(gameEngine.m1113k());
            c0859ar.m1553c(m1727ab());
            c0859ar.mo1487a(connection.f5787M);
            c0859ar.mo1487a(this.f5573W);
            c0859ar.mo1487a(0);
            m1752a(connection, c0859ar.m1560b(161));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public void m1643h(Connection connection) {
        GameEngine.PrintLog("sendRegisterConnection...");
        C0859ar c0859ar = new C0859ar();
        try {
            c0859ar.m1553c("com.corrodinggames.rts");
            c0859ar.mo1487a(5);
            c0859ar.mo1487a(this.f5618e);
            GameEngine gameEngine = GameEngine.getInstance();
            c0859ar.mo1487a(gameEngine.m1135c(true));
            c0859ar.m1553c(this.f5481y);
            String str = null;
            if (this.f5475n != null) {
                str = CommonUtils.m2270e(this.f5475n);
            }
            c0859ar.m1557b(str);
            c0859ar.m1553c(gameEngine.m1113k());
            c0859ar.m1553c(m1777Z());
            c0859ar.mo1487a(gameEngine.m1096y());
            c0859ar.m1553c(m1652g(this.f5570T));
            c0859ar.m1553c(m1646h(this.f5571U));
            m1752a(connection, c0859ar.m1560b(110));
            this.f5616bN = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public String m1652g(int i) {
        String str = (((((((((((VariableScope.nullOrMissingString + "c:" + i) + "m:" + ((i * 87) + 24)) + "0:" + (m1665e(0) * 11 * i)) + "1:" + ((m1665e(1) * 12) + i)) + "2:" + (m1665e(2) * 13 * i)) + "3:" + ((m1665e(3) * 14) + i)) + "4:" + (m1665e(4) * 15 * i)) + "5:" + ((m1665e(5) * 16) + i)) + "6:" + (m1665e(6) * 17 * i)) + "7:" + (m1665e(7) * 18 * i)) + "8:" + (m1665e(8) * 19 * i)) + "t1:" + (Team.f1372j.f1309o * 11.0d * i);
        int i2 = 5 * i;
        if (m1633k() != m1665e(this.f5597aO.f5650c)) {
            i2 = 7 * i;
        }
        return str + "d:" + i2;
    }

    /* renamed from: h */
    public String m1646h(int i) {
        return CommonUtils.m2252h(i);
    }

    /* renamed from: ad */
    public void m1725ad() {
        if (this.f5485C) {
            throw new RuntimeException("We are a server");
        }
        GameEngine gameEngine = GameEngine.getInstance();
        C0859ar c0859ar = new C0859ar();
        try {
            c0859ar.mo1482a(this.f5482bT);
            c0859ar.mo1482a(gameEngine.f6229bq);
            m1656f(c0859ar.m1560b(112));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    public void m1634j(String str) {
        if (!this.f5485C) {
            m1669d("cannot send sendSystemMessage:" + str + ", we are not a server");
        } else if (!this.f5564B || this.f5565F) {
            m1669d("cannot send sendSystemMessage:" + str + ", not networked");
        } else {
            GameEngine.PrintLog("sendSystemMessage:" + str);
            m1754a((Connection) null, (Team) null, (String) null, str);
        }
    }

    /* renamed from: k */
    public void m1632k(String str) {
        m1628m("-qc " + str);
    }

    /* renamed from: l */
    public void m1630l(String str) {
        boolean z = true;
        String str2 = null;
        if (str != null) {
            String trim = str.trim();
            if ((trim.startsWith("-") || trim.startsWith(".") || trim.startsWith("_")) && trim.length() >= 2) {
                String trim2 = trim.substring(1).trim();
                int indexOf = trim2.indexOf(" ");
                if (indexOf == -1) {
                    indexOf = trim2.length();
                }
                str2 = trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
            }
        }
        if ("share".equals(str2)) {
            z = false;
        }
        if ("t".equals(str2)) {
            z = false;
        }
        if (z) {
            str = "-t " + str;
        }
        m1628m(str);
    }

    /* renamed from: m */
    public void m1628m(String str) {
        if (!this.f5564B) {
            GameEngine.PrintLog("sendChatMessage: not networked:" + str);
            m1693b((Connection) null, -1, (String) null, str);
        } else if (this.f5485C) {
            m1754a((Connection) null, this.f5483z, this.f5481y, str);
            m1692b((Connection) null, this.f5483z, this.f5481y, str);
        } else {
            try {
                C0859ar c0859ar = new C0859ar();
                c0859ar.m1553c(str);
                c0859ar.m1554c(0);
                m1656f(c0859ar.m1560b(140));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public void m1754a(Connection connection, Team team, String str, String str2) {
        m1753a(connection, team, str, str2, null);
    }

    /* renamed from: a */
    public void m1753a(Connection connection, Team team, String str, String str2, Connection connection2) {
        C0187e c0187e;
        try {
            boolean z = false;
            boolean z2 = false;
            String m1626n = m1626n(str2);
            if ("t".equalsIgnoreCase(m1626n)) {
                if (team != null) {
                    z = true;
                    str2 = "[TEAM] " + str2.substring("-t".length());
                } else {
                    GameEngine.m1145b("toOnlyTeams failed team==null");
                }
            }
            if (team != null && "surrender".equalsIgnoreCase(m1626n)) {
                z = true;
                str2 = "[TEAM] " + str2;
            }
            if (team != null && "i".equalsIgnoreCase(m1626n)) {
                z2 = true;
                str2 = "[INFO] " + str2.substring("-i".length());
            }
            if (team != null && "qc".equalsIgnoreCase(m1626n)) {
                z2 = true;
                str2 = "[COMMAND] " + str2.substring("-qc".length());
            }
            if (!z2 && team != null && team != this.f5541bz && team != this.f5542bA && !this.f5556d.m1806a(connection, team, str2, z)) {
                z2 = true;
            }
            C0859ar c0859ar = new C0859ar();
            c0859ar.m1553c(str2);
            c0859ar.m1554c(3);
            c0859ar.m1557b(str);
            c0859ar.m1571a(connection);
            int i = -1;
            if (team != null) {
                i = team.f1305k;
            }
            c0859ar.mo1487a(i);
            C0861at m1560b = c0859ar.m1560b(141);
            if (z) {
                Iterator it = this.f5600bc.iterator();
                while (it.hasNext()) {
                    Connection connection3 = (Connection) it.next();
                    if (connection3.f5771p && !connection3.f5797a && (c0187e = connection3.f5781z) != null && c0187e.m6342d(team)) {
                        connection3.m1511a(m1560b);
                    }
                }
                Team team2 = this.f5483z;
                if (team2 != null && team2.m6342d(team)) {
                    m1693b(connection, i, str, str2);
                }
            } else if (z2) {
                GameEngine.m1145b("info message:" + m1677c(str, str2));
            } else {
                if (connection2 != null) {
                    m1752a(connection2, m1560b);
                } else {
                    m1650g(m1560b);
                }
                m1693b(connection, i, str, str2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    public static String m1626n(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if ((trim.startsWith("-") || trim.startsWith(".") || trim.startsWith("_")) && trim.length() >= 2) {
            String trim2 = trim.substring(1).trim();
            int indexOf = trim2.indexOf(" ");
            if (indexOf == -1) {
                indexOf = trim2.length();
            }
            return trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
        }
        return null;
    }

    /* renamed from: c */
    public static String m1677c(String str, String str2) {
        if (str != null) {
            return str + ": " + str2;
        }
        return str2;
    }

    /* renamed from: b */
    private void m1693b(Connection connection, int i, String str, String str2) {
        if (!this.f5564B && str2.startsWith("-i ")) {
            return;
        }
        if (!this.f5564B && str2.startsWith("-qc ")) {
            return;
        }
        String m1882c = C0820a.m1882c(str2);
        if (str != null) {
            m1668d("New Message", str + ": " + m1882c);
        }
        Connection connection2 = null;
        if (this.f5485C) {
            connection2 = connection;
        }
        this.f5599aS.m1816a(i, str, m1882c, connection2);
        this.f5556d.mo438a(i, str, m1882c, connection);
        boolean z = false;
        if (this.f5533bm) {
            z = true;
        }
        if (!this.f5564B) {
            z = true;
        }
        if (z) {
            m1743a(str, m1882c);
            return;
        }
        String m1677c = m1677c(str, m1882c);
        if (!GameEngine.f6199aU) {
            ActivityC0122n.m6914d(m1677c);
        }
    }

    /* renamed from: a */
    public void m1748a(Connection connection, byte[] bArr, boolean z, boolean z2) {
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            C0859ar c0859ar = new C0859ar();
            c0859ar.m1554c(0);
            c0859ar.mo1487a(gameEngine.f6233bx);
            c0859ar.mo1487a(gameEngine.f6096by);
            c0859ar.mo1488a(m1686c());
            c0859ar.mo1488a(1.0f);
            c0859ar.mo1482a(z);
            c0859ar.mo1482a(z2);
            c0859ar.m1549e("gameSave");
            c0859ar.m1556b(bArr);
            c0859ar.mo1485a("gameSave");
            m1752a(connection, c0859ar.m1560b(35));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m1735a(boolean z, boolean z2, boolean z3) {
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            C0859ar c0859ar = new C0859ar();
            c0859ar.m1554c(0);
            c0859ar.mo1487a(gameEngine.f6233bx);
            c0859ar.mo1487a(gameEngine.f6096by);
            c0859ar.mo1488a(m1686c());
            c0859ar.mo1488a(1.0f);
            c0859ar.mo1482a(z);
            c0859ar.mo1482a(z2);
            c0859ar.m1549e("gameSave");
            gameEngine.f6119ca.m453a(c0859ar);
            c0859ar.mo1485a("gameSave");
            if (z) {
            }
            C0861at m1560b = c0859ar.m1560b(35);
            m1671d(m1560b);
            if (z3) {
                if (!this.f5485C) {
                    throw new RuntimeException("sendResyncSave: reloadCreatedSave: We are not a server");
                }
                m1560b.f5737a = this.f5620bb;
                m1758a(m1560b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ae */
    public boolean m1724ae() {
        m1786Q();
        m1791L();
        return m1749a((Connection) null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m1749a(com.corrodinggames.rts.gameFramework.p041i.Connection r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.p041i.C0831ad.m1749a(com.corrodinggames.rts.gameFramework.i.c, boolean):boolean");
    }

    /* renamed from: af */
    public void m1723af() {
        this.f5536bs = true;
        GameEngine.PrintLog("onStartGameFailed");
        if (this.f5485C) {
            this.f5533bm = false;
            m1634j("Map load failed.");
            return;
        }
        m1690b("Map load failed");
    }

    /* renamed from: aB */
    private void m1732aB() {
        this.f5605bo = false;
        this.f5533bm = true;
        this.f5536bs = false;
        this.f5537bt = false;
        GameEngine.PrintLog("Starting new network game (" + m1726ac() + ")");
        if (this.f5478q && this.f5485C) {
            C0879n.m1415c();
        }
        if (!GameEngine.f6199aU) {
            ActivityC0122n.m6909p();
        }
        this.f5556d.mo430b();
    }

    /* renamed from: ag */
    public void m1722ag() {
        m1685c(5.0f);
    }

    /* renamed from: c */
    public void m1685c(float f) {
        if (!this.f5485C) {
            throw new RuntimeException("We are not a server");
        }
        if (this.f5606bp) {
            return;
        }
        GameEngine.PrintLog("Setting up return to battleroom timer...");
        this.f5534bq = f;
        this.f5606bp = true;
        m1634j("Game ended by host. Returning to battleroom in " + ((int) f) + " seconds...");
    }

    /* renamed from: i */
    public void m1637i(Connection connection) {
        if (!this.f5485C) {
            throw new RuntimeException("We are not a server");
        }
        try {
            C0859ar c0859ar = new C0859ar();
            c0859ar.m1554c(0);
            C0861at m1560b = c0859ar.m1560b(122);
            if (connection == null) {
                m1644h(m1560b);
            } else {
                m1752a(connection, m1560b);
            }
            m1731aC();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: aC */
    private void m1731aC() {
        this.f5605bo = true;
    }

    /* renamed from: aD */
    private void m1730aD() {
        GameEngine.PrintLog("----- returnToBattleroom -----");
        this.f5605bo = false;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6120cb.m2641d();
        Team team = this.f5483z;
        m1619s();
        this.f5483z = team;
        gameEngine.f6233bx = 0;
        gameEngine.f6096by = 0;
        Team.m6314n();
        if (this.f5485C) {
            m1733aA();
        }
        m1793J();
        if (this.f5478q && this.f5485C) {
            C0879n.m1415c();
        }
        if (!GameEngine.f6199aU) {
        }
    }

    /* renamed from: ah */
    public String m1721ah() {
        ArrayList m1719aj = m1719aj();
        if (m1719aj == null || m1719aj.size() == 0) {
            return null;
        }
        return (String) m1719aj.get(0);
    }

    /* renamed from: ai */
    public String m1720ai() {
        ArrayList m1719aj = m1719aj();
        if (m1719aj == null || m1719aj.size() == 0) {
            return null;
        }
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        Iterator it = m1719aj.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (z) {
                z = false;
            } else {
                str = str + ", ";
            }
            str = str + str2;
        }
        return str;
    }

    /* renamed from: aj */
    public ArrayList m1719aj() {
        ArrayList m1667d;
        if (f5548bO != null) {
            return new ArrayList(f5548bO);
        }
        long m2612a = C0727bl.m2612a();
        ArrayList m1667d2 = m1667d(true);
        if (m1667d2 != null && m1667d2.size() > 0) {
            m1667d = m1667d2;
        } else {
            m1667d = m1667d(false);
        }
        double m2610a = C0727bl.m2610a(m2612a);
        if (m2610a > 2.0d) {
            GameEngine.m1145b("getLocalIpAddressList was slow, taking:" + C0727bl.m2611a(m2610a));
        }
        if (m2610a > 10.0d && m1667d != null && m1667d.size() > 0) {
            GameEngine.PrintLog("getLocalIpAddressList: creating cache");
            f5548bO = new ArrayList(m1667d);
        }
        return m1667d;
    }

    /* renamed from: ak */
    public String m1718ak() {
        String str = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (true) {
                if (!networkInterfaces.hasMoreElements()) {
                    break;
                }
                byte[] hardwareAddress = networkInterfaces.nextElement().getHardwareAddress();
                if (hardwareAddress != null) {
                    String trim = new String(hardwareAddress).trim();
                    if (trim.length() > 2) {
                        str = trim;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (str != null) {
            return CommonUtils.m2288c(str);
        }
        return "[blank]";
    }

    /* renamed from: d */
    public ArrayList m1667d(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        String str = nextElement.getHostAddress().toString();
                        if (!str.contains("%")) {
                            if (!z) {
                                arrayList.add(str);
                            } else if (str.contains(".")) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
        } catch (SocketException e) {
            Log.m7106d("RustedWarfare", e.toString());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: al */
    public InetAddress m1717al() {
        try {
            DhcpInfo dhcpInfo = ((WifiManager) GameEngine.getInstance().f6221am.mo7348c("wifi")).getDhcpInfo();
            int i = (dhcpInfo.ipAddress & dhcpInfo.netmask) | (dhcpInfo.netmask ^ (-1));
            byte[] bArr = new byte[4];
            for (int i2 = 0; i2 < 4; i2++) {
                bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
            }
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public void m1668d(String str, String str2) {
        if (GameEngine.f6199aU) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f5565F || gameEngine.f6120cb.m2635h()) {
            return;
        }
        if (ActivityC0122n.m6913l()) {
            m1640i(2);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) gameEngine.f6221am.mo7348c("notification");
        PendingIntent activity = PendingIntent.getActivity(gameEngine.f6221am, 0, new Intent(gameEngine.f6221am, ActivityC0088a.class), 2);
        if (Build.VERSION.SDK_INT >= 11) {
            Notification.Builder builder = new Notification.Builder(gameEngine.f6221am);
            builder.setContentTitle("Rusted Warfare Multiplayer");
            builder.setContentText(str + ": " + str2);
            builder.setSmallIcon(R.drawable.icon);
            builder.setContentIntent(activity);
            builder.setOngoing(false);
            builder.setAutoCancel(true);
            m1768a(notificationManager);
            m1769a(builder, "multiplayerChatId");
            notificationManager.notify(2, builder.getNotification());
        }
    }

    /* renamed from: am */
    public void m1716am() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f5564B && gameEngine != null && gameEngine.m1223L()) {
            m1729aE();
        } else {
            m1640i(1);
        }
    }

    /* renamed from: a */
    private void m1769a(Notification.Builder builder, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                builder.getClass().getDeclaredMethod("setChannelId", String.class).invoke(builder, str);
            } catch (Exception e) {
                GameEngine.m1188a("setChannelId failed", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private void m1768a(NotificationManager notificationManager) {
        m1767a(notificationManager, "multiplayerChatId", "Multiplayer Chat");
        m1767a(notificationManager, "multiplayerStatusId", "Multiplayer Status");
    }

    /* renamed from: a */
    private void m1767a(NotificationManager notificationManager, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Class<?> cls = Class.forName("android.app.NotificationChannel");
                notificationManager.getClass().getDeclaredMethod("createNotificationChannel", cls).invoke(notificationManager, cls.getDeclaredConstructor(String.class, CharSequence.class, Integer.TYPE).newInstance(str, str2, 3));
            } catch (Exception e) {
                GameEngine.m1188a("Creating notification channel failed", (Throwable) e);
            }
        }
    }

    /* renamed from: aE */
    private void m1729aE() {
        if (GameEngine.f6199aU) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        PendingIntent activity = PendingIntent.getActivity(gameEngine.f6221am, 0, new Intent(gameEngine.f6221am, ActivityC0088a.class), 2);
        NotificationManager notificationManager = (NotificationManager) gameEngine.f6221am.mo7348c("notification");
        if (Build.VERSION.SDK_INT >= 11) {
            if (Build.VERSION.SDK_INT >= 26) {
            }
            Notification.Builder builder = new Notification.Builder(gameEngine.f6221am);
            builder.setContentTitle("Rusted Warfare Multiplayer");
            builder.setContentText("A multiplayer game is in progress");
            builder.setSmallIcon(R.drawable.icon);
            builder.setContentIntent(activity);
            builder.setOngoing(true);
            m1768a(notificationManager);
            m1769a(builder, "multiplayerStatusId");
            if (Build.VERSION.SDK_INT >= 16) {
                builder.build();
            }
            notificationManager.notify(1, builder.getNotification());
        }
    }

    /* renamed from: i */
    private void m1640i(int i) {
        if (GameEngine.f6199aU) {
            return;
        }
        ((NotificationManager) GameEngine.getInstance().f6221am.mo7348c("notification")).cancel(i);
    }

    /* renamed from: an */
    public int m1715an() {
        int i = 0;
        for (int i2 = 0; i2 < Team.f1364c; i2++) {
            Team m6317k = Team.m6317k(i2);
            if (m6317k != null && !m6317k.f1316v) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: ao */
    public int m1714ao() {
        int i = 0;
        for (int i2 = 0; i2 < Team.f1364c; i2++) {
            if (Team.m6317k(i2) != null) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public void m1664e(Team team) {
        if (this.f5485C) {
            m1657f(team);
        } else if (this.f5489H) {
            m1632k("-kick " + (team.f1305k + 1));
        } else {
            GameEngine.m1145b("kickTeamAndAttachedPlayer: but not server or proxy controller");
        }
    }

    /* renamed from: f */
    public void m1657f(Team team) {
        if (team instanceof C0136a) {
            team.m6414G();
        } else if (this.f5483z == team) {
            GameEngine.m1144b("kickTeamAndAttachedPlayer", "Cannot kick self");
            return;
        } else {
            Connection m1683c = m1683c(team);
            if (m1683c == null) {
                m1648g("Kick player: cannot find connection for team");
            } else {
                int i = GameEngine.getInstance().f6109bQ.banTimeInSecondsAfterKick;
                if (i > 0) {
                    m1750a(m1683c, "Temporarily banned due to recent kick", i);
                }
                m1751a(m1683c, "Kicked by host");
                m1683c.m1508a("Kicked by host");
            }
            team.m6414G();
        }
        m1787P();
        ActivityC0122n.m6910o();
    }

    /* renamed from: ap */
    public void m1713ap() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!this.f5485C) {
            GameEngine.m1144b("addAIToGame", "We are not a server");
            return;
        }
        int m6416E = Team.m6416E();
        if (m6416E == -1) {
            gameEngine.m1192a("No free slots for AI", 1);
        }
        C0136a c0136a = new C0136a(m6416E);
        c0136a.f1315u = "AI";
        c0136a.f1311q = m6416E % 2;
        c0136a.f1317w = this.f5597aO.f5653f;
        m1712aq();
        gameEngine.networkEngine.f5556d.m1808a(c0136a);
        gameEngine.networkEngine.m1662e((Connection) null);
        ActivityC0122n.m6910o();
    }

    /* renamed from: aq */
    public boolean m1712aq() {
        if (!this.f5485C && this.f5564B) {
            GameEngine.m1144b("updateNamesOfAI", "We are not a server");
            return false;
        }
        boolean z = false;
        for (int i = 0; i < Team.f1364c; i++) {
            Team m6317k = Team.m6317k(i);
            if (m6317k != null && m1699b(m6317k)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m1765a(Team team, int i) {
        synchronized (this.f5617bP) {
            m1682c(team, i);
        }
    }

    /* renamed from: c */
    private void m1682c(Team team, int i) {
        if (team.f1305k != i) {
            int i2 = team.f1305k;
            int i3 = team.f1311q;
            boolean z = false;
            if (i == -3) {
                z = true;
                i = Team.m6415F();
                if (i == -1) {
                    m1661e("No free spectator slots");
                    return;
                }
            }
            Team m6317k = Team.m6317k(i);
            team.m6329f(i);
            team.f1311q = i3;
            if (z) {
                team.f1311q = -3;
            }
            if (m6317k != null) {
                int i4 = m6317k.f1311q;
                m6317k.m6329f(i2);
                if (i4 == -3) {
                    m6317k.f1311q = -3;
                } else {
                    m6317k.f1311q = i3;
                }
            }
            m1790M();
            m1787P();
        }
    }

    /* renamed from: a */
    public void m1760a(EnumC0852al enumC0852al) {
        synchronized (this.f5617bP) {
            m1696b(enumC0852al);
        }
    }

    /* renamed from: b */
    private synchronized void m1696b(EnumC0852al enumC0852al) {
        if (!GameEngine.getInstance().networkEngine.f5485C) {
            GameEngine.PrintLog("Not server");
            return;
        }
        if (enumC0852al == EnumC0852al.layout_2sides) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < Team.f1364c; i++) {
                Team m6317k = Team.m6317k(i);
                if (m6317k != null) {
                    arrayList.add(m6317k);
                }
            }
            Collections.shuffle(arrayList);
            int size = arrayList.size() / 2;
            if (arrayList.size() % 2 != 0) {
                size += CommonUtils.m2360a(0, 1);
            }
            if (size >= arrayList.size()) {
                size = arrayList.size();
            }
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ((Team) arrayList.get(i3)).m6329f(i2);
                i2 += 2;
                ((Team) arrayList.get(i3)).f1311q = 0;
            }
            int i4 = 1;
            for (int i5 = 0 + size; i5 < arrayList.size(); i5++) {
                ((Team) arrayList.get(i5)).m6329f(i4);
                i4 += 2;
                ((Team) arrayList.get(i5)).f1311q = 1;
            }
        } else if (enumC0852al == EnumC0852al.layout_3sides) {
            ArrayList arrayList2 = new ArrayList();
            for (int i6 = 0; i6 < Team.f1364c; i6++) {
                Team m6317k2 = Team.m6317k(i6);
                if (m6317k2 != null) {
                    arrayList2.add(m6317k2);
                }
            }
            Collections.shuffle(arrayList2);
            int size2 = arrayList2.size() / 3;
            if (size2 >= arrayList2.size()) {
                size2 = arrayList2.size();
            }
            int i7 = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                Team team = (Team) arrayList2.get(i8);
                team.m6329f(i7);
                team.f1311q = 0;
                i7 += 3;
                arrayList2.set(i8, null);
            }
            int i9 = 0 + size2;
            int size3 = i9 + (arrayList2.size() / 3);
            if (size3 >= arrayList2.size()) {
                size3 = arrayList2.size();
            }
            if (i9 >= arrayList2.size()) {
                i9 = arrayList2.size();
            }
            int i10 = 1;
            for (int i11 = i9; i11 < size3; i11++) {
                Team team2 = (Team) arrayList2.get(i11);
                team2.m6329f(i10);
                team2.f1311q = 1;
                i10 += 3;
                arrayList2.set(i11, null);
            }
            int i12 = i9 + size2;
            if (i12 >= arrayList2.size()) {
                i12 = arrayList2.size();
            }
            int i13 = 2;
            for (int i14 = i12; i14 < arrayList2.size(); i14++) {
                Team team3 = (Team) arrayList2.get(i14);
                if (i13 >= Team.f1364c) {
                    team3.m6329f(i13);
                    team3.f1311q = 2;
                    i13 += 3;
                    arrayList2.set(i14, null);
                }
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                Team team4 = (Team) arrayList2.get(i15);
                if (team4 != null) {
                    for (int i16 = 0; i16 < Team.f1364c; i16++) {
                        if (Team.m6317k(i16) == null) {
                            team4.m6329f(i16);
                            team4.f1311q = 2;
                            arrayList2.set(i15, null);
                        }
                    }
                }
            }
        } else if (enumC0852al == EnumC0852al.layout_ffa) {
            ArrayList arrayList3 = new ArrayList();
            for (int i17 = 0; i17 < Team.f1364c; i17++) {
                Team m6317k3 = Team.m6317k(i17);
                if (m6317k3 != null) {
                    arrayList3.add(m6317k3);
                }
            }
            Collections.shuffle(arrayList3);
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                ((Team) arrayList3.get(i19)).m6329f(i18);
                ((Team) arrayList3.get(i19)).f1311q = i18;
                i18++;
            }
        } else if (enumC0852al == EnumC0852al.layout_spectators) {
            ArrayList arrayList4 = new ArrayList();
            for (int i20 = 0; i20 < Team.f1364c; i20++) {
                Team m6317k4 = Team.m6317k(i20);
                if (m6317k4 != null) {
                    arrayList4.add(m6317k4);
                }
            }
            Collections.shuffle(arrayList4);
            int i21 = 0;
            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                int m6415F = Team.m6415F();
                if (m6415F != -1) {
                    ((Team) arrayList4.get(i22)).m6329f(m6415F);
                }
                ((Team) arrayList4.get(i22)).f1311q = -3;
                i21++;
            }
        } else {
            throw new RuntimeException("overrideTeamLayout: unhandled layout: " + enumC0852al);
        }
        m1790M();
    }

    /* renamed from: a */
    public void m1764a(Team team, int i, Integer num) {
        String str = VariableScope.nullOrMissingString;
        if (num != null) {
            str = " " + num;
        }
        if (!this.f5489H && this.f5483z == team) {
            m1632k("-self_move " + (i + 1) + str);
        } else {
            m1632k("-move " + (team.f1305k + 1) + " " + (i + 1) + str);
        }
    }

    /* renamed from: b */
    public void m1698b(Team team, int i) {
        if (i != -1) {
            i++;
        }
        if (!this.f5489H && this.f5483z == team) {
            m1632k("-self_team " + i);
        } else {
            m1632k("-team " + (team.f1305k + 1) + " " + i);
        }
    }

    /* renamed from: g */
    public void m1651g(Team team) {
        if (!team.f1330G) {
            team.f1330G = true;
            String str = team.f1315u;
            if (str == null) {
                str = "Player - " + (team.f1305k + 1) + VariableScope.nullOrMissingString;
            }
            m1634j(str + " is victorious!");
        }
    }

    /* renamed from: h */
    public void m1645h(Team team) {
        String str;
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z = false;
        String str2 = team.f1315u;
        if (str2 == null) {
            str2 = "Player - " + (team.f1305k + 1) + VariableScope.nullOrMissingString;
        }
        String str3 = str2 + " was defeated";
        if (!this.f5535br) {
            str = str3 + " (Team: " + team.m6325h() + ")";
        } else {
            int m6328g = Team.m6328g();
            str = str3 + " (" + m6328g + " players remaining)";
            if (m6328g == 1) {
                z = true;
            }
        }
        if (!gameEngine.m1222M() && gameEngine.f6233bx < 60) {
            GameEngine.PrintLog("Not showing defeated message: " + str);
            str = null;
        }
        if (team.f1326D) {
            str = null;
        }
        if (str != null) {
            m1634j(str);
        }
        if (z) {
            Team.m6407N();
        }
    }

    /* renamed from: i */
    public void m1639i(Team team) {
        String str;
        String str2;
        GameEngine gameEngine = GameEngine.getInstance();
        String str3 = team.f1315u;
        if (str3 == null) {
            str3 = "Player - " + (team.f1305k + 1) + VariableScope.nullOrMissingString;
        }
        boolean z = false;
        if (gameEngine.f6233bx < 10) {
            str = str3 + " had no starting units";
        } else {
            str = str3 + " has been wiped out";
        }
        if (!this.f5535br) {
            str2 = str + " (Team: " + team.m6325h() + ")";
        } else {
            int m6328g = Team.m6328g();
            str2 = str + " (" + m6328g + " players remaining)";
            if (m6328g == 1) {
                z = true;
            }
        }
        if (!gameEngine.m1222M() && gameEngine.f6233bx < 60) {
            GameEngine.PrintLog("Not showing defeated message: " + str2);
            str2 = null;
        }
        if (team.f1326D) {
            str2 = null;
        }
        if (team.m6374b()) {
            str2 = null;
        }
        if (str2 != null) {
            m1634j(str2);
        }
        if (z) {
            Team.m6407N();
        }
    }

    /* renamed from: ar */
    public synchronized void m1711ar() {
        if (this.f5549bQ != null) {
            this.f5549bQ.cancel();
            this.f5549bQ = null;
        }
    }

    /* renamed from: as */
    public synchronized void m1710as() {
        if (this.f5478q && this.f5485C && this.f5549bQ == null) {
            this.f5549bQ = new Timer();
            this.f5549bQ.schedule(new C08386(), 60000L, 60000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.i.ad$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ad$6.class */
    public class C08386 extends TimerTask {
        C08386() {
        }

        public void run() {
            C0879n.m1415c();
        }
    }

    /* renamed from: at */
    public String m1709at() {
        GameEngine gameEngine = GameEngine.getInstance();
        String str = VariableScope.nullOrMissingString;
        if (gameEngine.networkEngine.f5485C && !gameEngine.networkEngine.f5565F) {
            String m1720ai = gameEngine.networkEngine.m1720ai();
            if (this.f5486D) {
                if (this.f5487E != null) {
                    str = str + this.f5487E;
                }
            } else if (m1720ai != null) {
                String str2 = "Local IP address: " + m1720ai + " port: " + gameEngine.networkEngine.f5474m;
                if (gameEngine.networkEngine.f5532bl != null) {
                    if (!gameEngine.networkEngine.f5532bl.booleanValue()) {
                        str2 = str2 + "\nUnable to get a public IP address, check your internet connection";
                    } else if (gameEngine.networkEngine.f5530bj != null && gameEngine.networkEngine.f5531bk != null) {
                        str2 = str2 + "\nYour public address is " + (gameEngine.networkEngine.f5531bk.booleanValue() ? "<Open>" : "<CLOSED>") + " to the internet";
                    }
                } else {
                    str2 = str2 + "\nRetrieving your public IP...";
                }
                str = str + str2;
            } else {
                str = str + "You do not have a network connection";
            }
        }
        if (gameEngine.m1220O()) {
            if (this.f5477p) {
                str = str + "SandBox Mode!\nPlace any unit, Control all teams, Special powers";
            } else {
                str = str + "Local skirmish";
            }
        }
        boolean z = true;
        if (GameEngine.m1159as() && gameEngine.networkEngine.f5485C) {
            z = false;
        }
        if (str.length() != 0) {
            str = str + "\n";
            if (GameEngine.m1157au()) {
                str = str + "\n";
            }
        }
        if (gameEngine.networkEngine.f5517aL || gameEngine.networkEngine.f5485C) {
            if (z) {
                if (gameEngine.networkEngine.f5597aO.f5648a != null) {
                    str = str + "Game Mode: " + gameEngine.networkEngine.f5597aO.f5648a.mo1597a();
                }
                if (gameEngine.networkEngine.f5597aO.f5649b != null) {
                    str = str + "\nMap: " + ActivityC0117i.m6932e(gameEngine.networkEngine.f5597aO.f5649b);
                }
            }
            str = (str + "\nStarting Credits: " + gameEngine.networkEngine.m1635j()) + "\nFog: " + gameEngine.networkEngine.m1653g();
            if (gameEngine.networkEngine.f5597aO.f5654g != 1) {
                str = str + "\nStarting Units: " + gameEngine.networkEngine.m1647h();
            }
            if (gameEngine.networkEngine.f5597aO.f5655h != 1.0f) {
                str = str + "\n" + CommonUtils.m2363a(gameEngine.networkEngine.f5597aO.f5655h, 1) + "X income";
            }
            if (gameEngine.networkEngine.f5597aO.f5656i) {
                str = str + "\nNo nukes";
            }
            if (gameEngine.networkEngine.f5597aO.f5646l) {
                str = str + "\nShared control: On";
            }
            if (this.f5485C) {
                if (gameEngine.networkEngine.f5475n != null) {
                    str = str + "\nPassword Protection: On";
                }
                if (!gameEngine.networkEngine.f5478q && !gameEngine.networkEngine.f5565F) {
                    str = str + "\nServer Visibility: Hidden";
                }
                if (gameEngine.networkEngine.f5476o && !gameEngine.networkEngine.f5565F) {
                    ArrayList m1851j = gameEngine.f6118bZ.m1851j();
                    str = str + "\n-- Required Mods: --\n";
                    int i = 0;
                    Iterator it = m1851j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C0824b c0824b = (C0824b) it.next();
                        if (i > 2 && i < m1851j.size() - 1) {
                            str = str + VariableScope.nullOrMissingString + (m1851j.size() - i) + " more mods...";
                            break;
                        }
                        i++;
                        String m1841b = c0824b.m1841b();
                        m1841b.replace("\"", "'");
                        m1841b.replace(";", ".");
                        str = str + " mod: \"" + m1841b + "\"\n";
                    }
                }
            }
        }
        return str;
    }

    /* renamed from: au */
    public String m1708au() {
        if (!this.f5476o) {
            return null;
        }
        ArrayList m1851j = GameEngine.getInstance().f6118bZ.m1851j();
        String str = VariableScope.nullOrMissingString;
        int i = 0;
        Iterator it = m1851j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0824b c0824b = (C0824b) it.next();
            if (i != 0) {
                str = str + "; ";
            }
            if (i > 1 && i < m1851j.size() - 1) {
                str = str + VariableScope.nullOrMissingString + (m1851j.size() - i) + " more...";
                break;
            }
            i++;
            String m1841b = c0824b.m1841b();
            m1841b.replace(";", ".");
            str = str + m1841b;
        }
        return str;
    }

    /* renamed from: av */
    public String m1707av() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.f5597aO.f5649b == null || gameEngine.networkEngine.f5597aO.f5648a == null) {
            return null;
        }
        if (gameEngine.networkEngine.f5597aO.f5648a == EnumC0846ai.f5663a) {
            return "maps/skirmish/" + gameEngine.networkEngine.f5597aO.f5649b;
        }
        if (gameEngine.networkEngine.f5597aO.f5648a == EnumC0846ai.f5664b) {
            return "/SD/rusted_warfare_maps/" + gameEngine.networkEngine.f5597aO.f5649b;
        }
        GameEngine.PrintLog("getNetworkMapPath: unhandled type:" + gameEngine.networkEngine.f5597aO.f5648a);
        return null;
    }

    /* renamed from: aw */
    public boolean m1706aw() {
        return this.f5485C || this.f5489H;
    }

    /* renamed from: a */
    public void m1744a(String str, Connection connection) {
        GameEngine.PrintLog("sendCommandError: " + str);
        if (connection == null) {
            m1693b((Connection) null, -1, (String) null, str);
        } else {
            m1753a(null, null, null, str, connection);
        }
    }

    /* renamed from: b */
    public boolean m1692b(Connection connection, Team team, String str, String str2) {
        int i;
        Team m6317k;
        String str3 = null;
        String str4 = VariableScope.nullOrMissingString;
        String[] strArr = new String[0];
        String trim = str2.trim();
        boolean z = false;
        if (trim.startsWith("-qc ")) {
            trim = trim.substring("-qc ".length()).trim();
            z = true;
        }
        if ((trim.startsWith("-") || trim.startsWith(".") || trim.startsWith("_")) && trim.length() >= 2) {
            String trim2 = trim.substring(1).trim();
            int indexOf = trim2.indexOf(" ");
            if (indexOf == -1) {
                indexOf = trim2.length();
            }
            str3 = trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
            if (indexOf != -1 && trim2.length() >= indexOf + 1) {
                str4 = trim2.substring(indexOf + 1).trim();
                strArr = str4.split(" ");
            }
        }
        if (str3 == null) {
            return false;
        }
        if (z && !"self_move".equals(str3) && !"self_team".equals(str3)) {
            return false;
        }
        if ("pause".equals(str3) || "unpause".equals(str3)) {
            if (team == null) {
                m1744a("[Could not find player]", connection);
                return true;
            } else if ((!this.f5485C || team != this.f5483z) && !this.f5556d.m1804b(connection)) {
                m1744a("[Only the host can change pause state]", connection);
                return true;
            } else if (!this.f5533bm) {
                m1744a("[Game not yet started]", connection);
                return true;
            } else {
                boolean z2 = !this.f5509al;
                if ("unpause".equals(str3)) {
                    z2 = false;
                }
                m1660e(z2);
                return true;
            }
        } else if ("endgame".equals(str3)) {
            if (team == null) {
                m1744a("[Could not find player]", connection);
                return true;
            } else if (!this.f5485C || team != this.f5483z) {
                m1744a("[Only the host can end game]", connection);
                return true;
            } else if (!this.f5533bm) {
                m1744a("[Game not yet started]", connection);
                return true;
            } else {
                m1722ag();
                return true;
            }
        } else if ("teamlock".equals(str3)) {
            if (team == null) {
                m1744a("[Could not find player]", connection);
                return true;
            } else if ((!this.f5485C || team != this.f5483z) && !this.f5556d.m1804b(connection)) {
                m1744a("[Only the host can change teamlock]", connection);
                return true;
            } else if ("true".equalsIgnoreCase(str4) || "on".equalsIgnoreCase(str4)) {
                this.f5597aO.f5659m = true;
                m1744a("[teams are locked]", connection);
                return true;
            } else if ("false".equalsIgnoreCase(str4) || "off".equalsIgnoreCase(str4)) {
                this.f5597aO.f5659m = false;
                m1744a("[teams are unlocked]", connection);
                return true;
            } else {
                m1744a("[Expected true or false]", connection);
                return true;
            }
        } else if ("roomlock".equals(str3)) {
            if (team == null) {
                m1744a("[Could not find player]", connection);
                return true;
            } else if (!this.f5485C || team != this.f5483z) {
                m1744a("[Only the host can change roomlock]", connection);
                return true;
            } else if ("true".equalsIgnoreCase(str4) || "on".equalsIgnoreCase(str4)) {
                this.f5597aO.f5662p = true;
                m1744a("[room is locked]", connection);
                return true;
            } else if ("false".equalsIgnoreCase(str4) || "off".equalsIgnoreCase(str4)) {
                this.f5597aO.f5662p = false;
                m1744a("[room is unlocked]", connection);
                return true;
            } else {
                m1744a("[Expected true or false]", connection);
                return true;
            }
        } else if ("share".equals(str3)) {
            if (team == null) {
                m1744a("[Could not find player]", connection);
                return true;
            } else if (!this.f5597aO.f5646l) {
                m1744a("[Shared control is not enabled in this game]", connection);
                return true;
            } else if ("true".equalsIgnoreCase(str4) || "on".equalsIgnoreCase(str4)) {
                if (!team.f1331H) {
                    team.f1331H = true;
                    m1634j("[shared control now on for " + str + "]");
                    return true;
                }
                m1634j("[shared control already on for " + str + "]");
                return true;
            } else if ("false".equalsIgnoreCase(str4) || "off".equalsIgnoreCase(str4)) {
                if (team.f1331H) {
                    team.f1331H = false;
                    m1634j("[shared control now off for " + str + "]");
                    return true;
                }
                m1634j("[shared control already off for " + str + "]");
                return true;
            } else {
                m1744a("[Expected true or false]", connection);
                return true;
            }
        } else if ("self_move".equals(str3)) {
            if (team == null) {
                m1744a("[Cannot Move - Player not found]", connection);
                return true;
            } else if (this.f5533bm) {
                m1744a("[Cannot Move '" + team.f1315u + "' - Game has been started]", connection);
                return true;
            } else if (m1625o()) {
                m1744a("[Cannot Move '" + team.f1315u + "' - Game is starting]", connection);
                return true;
            } else if (this.f5597aO.f5659m) {
                m1744a("[Cannot Move '" + team.f1315u + "' - Teams locked]", connection);
                return true;
            } else if (strArr.length > 0) {
                try {
                    int intValue = Integer.valueOf(strArr[0]).intValue();
                    Integer num = null;
                    if (strArr.length > 1) {
                        try {
                            num = Integer.valueOf(strArr[1]);
                            if (num.intValue() != -1 && (num.intValue() < 1 || num.intValue() > 99)) {
                                m1744a("[Cannot Move Team - Ally group - Out of range]", connection);
                                return true;
                            }
                        } catch (NumberFormatException e) {
                            m1744a("[Cannot Move '" + team.f1315u + "' - ally group '" + strArr[1] + "' is not a number]", connection);
                            return true;
                        }
                    }
                    boolean z3 = false;
                    if (intValue - 1 == -3) {
                        if (!this.f5597aO.f5661o) {
                            m1744a("[Spectators are disabled on this server]", connection);
                            return true;
                        }
                        synchronized (this.f5617bP) {
                            intValue = Team.m6415F();
                            if (intValue != -1) {
                                m1765a(team, -3);
                            }
                        }
                        z3 = true;
                    }
                    int i2 = team.f1311q;
                    boolean z4 = i2 == -3;
                    if (!z3) {
                        if (intValue < 1 || intValue > Team.f1364c) {
                            m1744a("[Cannot Move '" + team.f1315u + "' - target slotId must between 1-" + Team.f1364c + "]", connection);
                            return true;
                        }
                        synchronized (this.f5617bP) {
                            if (this.f5483z != team && (m6317k = Team.m6317k(intValue - 1)) != null && !m6317k.f1316v && !m6317k.m6374b()) {
                                m1744a("[Cannot move '" + team.f1315u + "' to slot: " + intValue + " - Player: " + m6317k.f1315u + " is in that slot.]", connection);
                                return true;
                            }
                            m1765a(team, intValue - 1);
                        }
                    }
                    team.f1311q = i2;
                    if (num != null) {
                        if (num.intValue() == -1) {
                            team.f1311q = team.f1305k % 2;
                        } else {
                            team.f1311q = num.intValue();
                        }
                    }
                    if (this.f5597aO.f5660n) {
                        team.f1311q = team.f1305k % 2;
                    }
                    if (z3) {
                        team.f1311q = -3;
                    }
                    if (z3) {
                        if (!z4) {
                            m1634j("Player '" + team.f1315u + "' is now a spectator");
                        }
                    } else {
                        m1634j("Player '" + team.f1315u + "' moved themselves to: " + intValue);
                    }
                    m1787P();
                    ActivityC0122n.m6910o();
                    return true;
                } catch (NumberFormatException e2) {
                    m1744a("[Cannot Move '" + team.f1315u + "' - team '" + strArr[0] + "' is not a number]", connection);
                    return true;
                }
            } else {
                m1744a("[Cannot Move '" + team.f1315u + "' - No target]", connection);
                return true;
            }
        } else if ("self_team".equals(str3)) {
            if (team == null) {
                m1744a("[Cannot Set Team - Player not found]", connection);
                return true;
            } else if (this.f5533bm) {
                m1744a("[" + team.f1315u + ": Cannot Set Team - Game has been started]", connection);
                return true;
            } else if (m1625o()) {
                m1744a("[" + team.f1315u + ": Cannot Set Team - Game is starting]", connection);
                return true;
            } else if (this.f5597aO.f5659m) {
                m1744a("[" + team.f1315u + ": Cannot Set Team - Teams locked]", connection);
                return true;
            } else if (this.f5597aO.f5660n) {
                return true;
            } else {
                try {
                    int intValue2 = Integer.valueOf(str4).intValue();
                    if (intValue2 == -1) {
                        i = team.f1305k % 2;
                    } else if (intValue2 < 1 || intValue2 > 99) {
                        m1744a("[Cannot Set Team - Out of range]", connection);
                        return true;
                    } else {
                        i = intValue2 - 1;
                    }
                    if (team.f1311q != i) {
                        team.f1311q = i;
                        m1744a("Player '" + team.f1315u + "' team changed to: " + intValue2, connection);
                    }
                    m1787P();
                    ActivityC0122n.m6910o();
                    return true;
                } catch (NumberFormatException e3) {
                    m1628m("'" + str4 + "' is not a number");
                    return true;
                }
            }
        } else if ("surrender".equals(str3)) {
            if (!this.f5533bm) {
                m1744a("[Cannot Surrender - Game has not started]", connection);
                return true;
            } else if (team == null) {
                m1744a("[Could not find player]", connection);
                return true;
            } else if (!team.m6318k()) {
                GameEngine.PrintLog(str + ": Is voting to surrender");
                team.m6316l();
                m1754a(connection, team, str, "-t [Votes to surrender " + (Team.m6372b(team.f1311q) + "/" + Team.m6356c(team.f1311q)) + "]");
                return true;
            } else {
                GameEngine.PrintLog(str + ": Is already voting to surrender but updating timestamp");
                team.m6316l();
                return true;
            }
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static void m1762a(C0841ae c0841ae) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine != null) {
            gameEngine.networkEngine.f5556d.mo437a(c0841ae);
        }
        if (GameEngine.f6199aU) {
            return;
        }
        C0090c.m6975a(new RunnableC08397(c0841ae));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.i.ad$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ad$7.class */
    public final class RunnableC08397 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0841ae f5632a;

        RunnableC08397(C0841ae c0841ae) {
            this.f5632a = c0841ae;
        }

        public void run() {
            ActivityC0122n.m6916a(this.f5632a);
        }
    }

    /* renamed from: ax */
    public ArrayList m1705ax() {
        ArrayList m6358c;
        synchronized (this.f5617bP) {
            m6358c = Team.m6358c();
        }
        return m6358c;
    }

    /* renamed from: e */
    public void m1660e(boolean z) {
        this.f5509al = z;
        if (this.f5509al) {
            m1634j("Game Paused");
        } else {
            m1634j("Game unpaused");
        }
    }

    /* renamed from: b */
    public void m1691b(Connection connection, String str) {
        connection.m1505a(false, false, str);
    }

    /* renamed from: c */
    public void m1679c(Connection connection, String str) {
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection2 = (Connection) it.next();
            if (connection2.f5766j == connection) {
                m1691b(connection2, str);
            }
        }
    }

    /* renamed from: a */
    public Connection m1755a(Connection connection, int i, String str, String str2) {
        GameEngine gameEngine = GameEngine.getInstance();
        Connection connection2 = new Connection(this, new C0873h(connection, i));
        connection2.f5800k = i;
        connection2.f5766j = connection;
        connection2.f5768m = str;
        connection2.f5769n = str2;
        try {
            connection2.m1500d();
            gameEngine.networkEngine.f5600bc.add(connection2);
            gameEngine.networkEngine.m1786Q();
            return connection2;
        } catch (IOException e) {
            e.printStackTrace();
            connection2.m1508a("crash");
            return null;
        }
    }

    /* renamed from: a */
    public Connection m1756a(Connection connection, int i) {
        Iterator it = this.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection2 = (Connection) it.next();
            if (connection2.f5800k == i && connection2.f5766j == connection) {
                return connection2;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static String m1624o(String str) {
        String str2;
        char[] charArray;
        String replace = str.trim().replace("\n", ".").replace("\r", ".").replace("\t", ".").replace("��", ".").replace(" ", "_");
        while (true) {
            str2 = replace;
            if (!str2.startsWith(".") && !str2.startsWith("-") && !str2.startsWith(" ")) {
                break;
            }
            replace = str2.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str2.toCharArray()) {
            if (!Character.isISOControl(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m1739a(ArrayList arrayList, boolean z) {
        if (this.f5550bS != null) {
            GameEngine.PrintLog("startJoinServerInternalThread: Already joining");
        } else if (arrayList.size() == 0) {
            GameEngine.PrintLog("startJoinServerInternalThread: no servers");
        } else {
            this.f5550bS = m1741a((String) arrayList.get(0), false, (Runnable) new RunnableC08408(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.i.ad$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ad$8.class */
    public class RunnableC08408 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f5633a;

        RunnableC08408(boolean z) {
            this.f5633a = z;
        }

        public void run() {
            GameEngine gameEngine = GameEngine.getInstance();
            GameEngine.PrintLog("startJoinServerInternalThread callback");
            RunnableC0853am runnableC0853am = C0831ad.this.f5550bS;
            C0831ad.this.f5550bS = null;
            if (runnableC0853am == null) {
                GameEngine.PrintLog("startJoinServerInternalThread callback gameConnector==null");
            } else if (runnableC0853am.f5683e != null) {
                GameEngine.PrintLog("startJoinServerInternalThread failed to connect: " + runnableC0853am.f5683e);
                if (this.f5633a) {
                    gameEngine.networkEngine.m1690b("Reconnect failed: " + runnableC0853am.f5683e);
                    C0831ad.this.m1689b("Reconnect failed", "reconnect failed");
                    gameEngine.m1130d("Reconnect failed", "Reconnect failed: " + runnableC0853am.f5683e);
                    gameEngine.m1116i("Reconnect failed: " + runnableC0853am.f5683e);
                }
            } else {
                try {
                    gameEngine.networkEngine.m1690b("starting new");
                    gameEngine.networkEngine.m1740a(runnableC0853am.f5685g);
                } catch (IOException e) {
                    gameEngine.m1137c(e.getMessage(), "Connection failed");
                    e.printStackTrace();
                }
            }
        }
    }
}

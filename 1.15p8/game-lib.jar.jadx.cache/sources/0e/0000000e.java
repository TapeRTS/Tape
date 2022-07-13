package com.corrodinggames.rts.gameFramework.network;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.appFramework.ActivityC0084a;
import com.corrodinggames.rts.appFramework.ActivityC0112i;
import com.corrodinggames.rts.appFramework.ActivityC0123p;
import com.corrodinggames.rts.appFramework.C0086c;
import com.corrodinggames.rts.appFramework.MultiplayerBattleroomActivity;
import com.corrodinggames.rts.game.Player;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.ai.AI;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Waypoint;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.custom.C0384ba;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadataFactory;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0651bl;
import com.corrodinggames.rts.gameFramework.C0678e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.ModLoader.Mod;
import com.corrodinggames.rts.gameFramework.file.C0670a;
import com.corrodinggames.rts.gameFramework.gui.p034a.AbstractC0691i;
import com.corrodinggames.rts.gameFramework.gui.p034a.C0684c;
import com.corrodinggames.rts.gameFramework.gui.p034a.menu_;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
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

/* renamed from: com.corrodinggames.rts.gameFramework.h.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/ad.class */
public final class NetworkEngine {

    /* renamed from: f */
    ArrayList f5098f;

    /* renamed from: g */
    public boolean f5099g;

    /* renamed from: i */
    public boolean f5100i;

    /* renamed from: j */
    public float f5101j;

    /* renamed from: k */
    public float f5102k;

    /* renamed from: m */
    public int f5103m;

    /* renamed from: n */
    public String f5104n;

    /* renamed from: o */
    public boolean mods;

    /* renamed from: p */
    public boolean f5106p;

    /* renamed from: q */
    public boolean f5107q;

    /* renamed from: s */
    public boolean f5108s;

    /* renamed from: u */
    public String f5109u;

    /* renamed from: y */
    public String f5110y;

    /* renamed from: bN */
    private boolean localPlayerReady;

    /* renamed from: z */
    public Team f5111z;

    /* renamed from: A */
    public boolean f5037A;

    /* renamed from: C */
    public boolean isServer;

    /* renamed from: D */
    public boolean f5039D;

    /* renamed from: E */
    public String f5040E;

    /* renamed from: G */
    public boolean f5041G;

    /* renamed from: H */
    public boolean f5042H;

    /* renamed from: K */
    public Float f5043K;

    /* renamed from: L */
    public String f5044L;

    /* renamed from: M */
    public boolean f5045M;

    /* renamed from: N */
    public int f5046N;

    /* renamed from: O */
    public int f5047O;

    /* renamed from: P */
    public int f5048P;

    /* renamed from: Q */
    public int f5049Q;

    /* renamed from: R */
    public String serverUUID;

    /* renamed from: X */
    public boolean f5051X;

    /* renamed from: Y */
    public float f5052Y;

    /* renamed from: Z */
    boolean f5053Z;

    /* renamed from: aa */
    public float f5070aa;

    /* renamed from: ab */
    public float f5071ab;

    /* renamed from: ac */
    public boolean f5072ac;

    /* renamed from: ad */
    public float f5073ad;

    /* renamed from: ae */
    public boolean f5074ae;

    /* renamed from: af */
    public boolean f5075af;

    /* renamed from: ai */
    public boolean f5076ai;

    /* renamed from: aj */
    public boolean f5077aj;

    /* renamed from: ak */
    public boolean isGamePaused;

    /* renamed from: al */
    public long f5079al;

    /* renamed from: aC */
    public boolean f5054aC;

    /* renamed from: aE */
    public int f5055aE;

    /* renamed from: aF */
    public int f5056aF;

    /* renamed from: aG */
    public int f5057aG;

    /* renamed from: aH */
    public static boolean f5035aH;

    /* renamed from: aJ */
    long f5058aJ;

    /* renamed from: aK */
    public boolean f5059aK;

    /* renamed from: aP */
    public InputNetStream f5060aP;

    /* renamed from: aQ */
    public InputNetStream f5061aQ;

    /* renamed from: aS */
    Thread f5062aS;

    /* renamed from: aT */
    RunnableC0773am f5063aT;

    /* renamed from: aU */
    Thread f5064aU;

    /* renamed from: aV */
    RunnableC0773am f5065aV;

    /* renamed from: aW */
    Timer f5066aW;

    /* renamed from: aX */
    C0780as f5067aX;

    /* renamed from: aY */
    Thread f5068aY;

    /* renamed from: aZ */
    RunnableC0762af f5069aZ;

    /* renamed from: bd */
    boolean hasPacketsToSend;

    /* renamed from: bh */
    String f5086bh;

    /* renamed from: bi */
    public String f5087bi;

    /* renamed from: bj */
    public Boolean f5088bj;

    /* renamed from: bk */
    public Boolean f5089bk;

    /* renamed from: bl */
    public boolean gameHasStarted;

    /* renamed from: bn */
    public boolean f5091bn;

    /* renamed from: bo */
    public boolean f5092bo;

    /* renamed from: bp */
    public boolean f5093bp;

    /* renamed from: bq */
    public boolean f5094bq;

    /* renamed from: bx */
    float lastResyncTimer;

    /* renamed from: by */
    float f5096by;

    /* renamed from: bz */
    int f5097bz;

    /* renamed from: bA */
    int f5080bA;

    /* renamed from: bF */
    public boolean f5081bF;

    /* renamed from: bI */
    static ArrayList f5036bI;

    /* renamed from: bK */
    Timer f5082bK;

    /* renamed from: bM */
    RunnableC0772al f5083bM;

    /* renamed from: a */
    public static final boolean f5112a = false;

    /* renamed from: b */
    public static boolean f5113b = true;

    /* renamed from: c */
    public static boolean f5114c = false;

    /* renamed from: r */
    public static boolean f5115r = true;

    /* renamed from: bL */
    public static C0761ae f5116bL = new C0761ae();

    /* renamed from: d */
    public C0750ac f5117d = new C0750ac();

    /* renamed from: h */
    public int f5118h = 25;

    /* renamed from: l */
    public boolean f5119l = false;

    /* renamed from: t */
    public int f5120t = 5005;

    /* renamed from: v */
    public boolean isChatRoom = false;

    /* renamed from: w */
    public long unitId = 1;

    /* renamed from: x */
    public boolean f5123x = false;

    /* renamed from: bO */
    private boolean f5124bO = false;
    // 是否联网

    /* renamed from: B */
    public volatile boolean networked = false;

    /* renamed from: F */
    public boolean f5126F = false;

    /* renamed from: I */
    public int f5127I = 0;

    /* renamed from: bP */
    private volatile float f5128bP = 1.0f;

    /* renamed from: J */
    public volatile float f5129J = 1.0f;

    /* renamed from: S */
    public int f5130S = -1;

    /* renamed from: T */
    public int f5131T = -1;

    /* renamed from: U */
    public int f5132U = -1;

    /* renamed from: V */
    public int f5133V = CommonUtils.m1737a(1, 9000000);

    /* renamed from: W */
    public int f5134W = 0;

    /* renamed from: ag */
    public int f5135ag = -1;

    /* renamed from: ah */
    public int f5136ah = 300;

    /* renamed from: am */
    public ArrayList f5137am = new ArrayList();

    /* renamed from: an */
    public C0770aj f5138an = new C0770aj(this, "Unit Pos");

    /* renamed from: ao */
    public C0770aj f5139ao = new C0770aj(this, "Unit Dir", false);

    /* renamed from: ap */
    public C0770aj f5140ap = new C0770aj(this, "Unit Hp");

    /* renamed from: aq */
    public C0770aj f5141aq = new C0770aj(this, "Unit Id");

    /* renamed from: ar */
    public C0770aj f5142ar = new C0770aj(this, "Waypoints");

    /* renamed from: as */
    public C0770aj f5143as = new C0770aj(this, "Waypoints Pos");

    /* renamed from: at */
    public C0770aj f5144at = new C0770aj(this, "Team Credits");

    /* renamed from: au */
    public C0770aj f5145au = new C0770aj(this, "UnitPaths");

    /* renamed from: av */
    public C0770aj f5146av = new C0770aj(this, "Unit Count");

    /* renamed from: aw */
    public C0770aj f5147aw = new C0770aj(this, "Team Info", false);

    /* renamed from: ax */
    public C0770aj f5148ax = new C0770aj(this, "Team 1 Credits", false);

    /* renamed from: ay */
    public C0770aj f5149ay = new C0770aj(this, "Team 2 Credits", false);

    /* renamed from: az */
    public C0770aj f5150az = new C0770aj(this, "Team 3 Credits", false);

    /* renamed from: aA */
    public C0770aj f5151aA = new C0770aj(this, "Command center2", false);

    /* renamed from: aB */
    public C0770aj f5152aB = new C0770aj(this, "Command center3", false);

    /* renamed from: aD */
    public boolean f5153aD = true;

    /* renamed from: aI */
    float f5154aI = 0.0f;

    /* renamed from: aL */
    public int f5155aL = 5;

    /* renamed from: aM */
    public int f5156aM = 5;

    /* renamed from: aN */
    public Setup setup = new Setup();

    /* renamed from: aO */
    public String mapFilePath = null;

    /* renamed from: aR */
    public C0747a f5159aR = new C0747a();

    /* renamed from: bb */
    public ConcurrentLinkedQueue connections = new ConcurrentLinkedQueue();

    /* renamed from: bc */
    ConcurrentLinkedQueue receivedPackets = new ConcurrentLinkedQueue();

    /* renamed from: be */
    volatile int nextConnectionIndex = 1;

    /* renamed from: bf */
    Object f5163bf = new Object();

    /* renamed from: bm */
    public boolean f5164bm = false;

    /* renamed from: br */
    public String f5165br = null;

    /* renamed from: bs */
    public ConcurrentLinkedQueue f5166bs = new ConcurrentLinkedQueue();

    /* renamed from: bv */
    public final Object f5167bv = new Object();

    /* renamed from: bw */
    public boolean queDisconnect = false;

    /* renamed from: bB */
    boolean f5169bB = false;

    /* renamed from: bC */
    boolean f5170bC = false;

    /* renamed from: bD */
    public Socket f5171bD = null;

    /* renamed from: bE */
    public String f5172bE = null;

    /* renamed from: bG */
    boolean f5173bG = false;

    /* renamed from: bH */
    boolean f5174bH = false;

    /* renamed from: bJ */
    final Object f5175bJ = new Object();

    /* renamed from: e */
    public int serverVersionInt = GameEngine.getInstance().gameVersionInternal(true);

    /* renamed from: bg */
    String f5177bg = CommonUtils.m1658d(40);

    /* renamed from: ba */
    Connection f5178ba = new Connection(this, null);

    /* renamed from: bt */
    public Player f5179bt = new Player(-3, false);

    /* renamed from: bu */
    public Player f5180bu = new Player(-1, false);

    /* renamed from: a */
    public String m1470a(String str) {
        String replace = str.trim().replace(" ", "_");
        this.f5110y = replace;
        GameEngine game = GameEngine.getInstance();
        if (this.f5110y != null && !this.f5110y.equals(game.curSettings.lastNetworkPlayerName)) {
            game.curSettings.lastNetworkPlayerName = this.f5110y;
            game.curSettings.save();
        }
        return replace;
    }

    /* renamed from: a */
    public void m1499a(float f, String str) {
        if (f < 0.1d) {
            m1467a("setCurrentStepRate:" + f + " is too small, source:" + str, true);
        } else {
            this.f5128bP = f;
        }
    }

    /* renamed from: a */
    public float m1501a() {
        return this.f5128bP;
    }

    /* renamed from: b */
    public void m1434b() {
        Iterator it = this.f5137am.iterator();
        while (it.hasNext()) {
            ((C0770aj) it.next()).f5225b = 0L;
        }
    }

    /* renamed from: a */
    public void m1484a(OutputNetStream outputNetStream) {
        GameEngine gameEngine = GameEngine.getInstance();
        outputNetStream.writeByte(0);
        this.setup.m1342a(outputNetStream);
        outputNetStream.writeInt(gameEngine.f5820bB);
        outputNetStream.writeInt(gameEngine.f5821bC);
    }

    /* renamed from: a */
    public void m1471a(InputNetStream inputNetStream) {
        GameEngine gameEngine = GameEngine.getInstance();
        inputNetStream.readByte();
        this.setup.m1341a(inputNetStream);
        gameEngine.f5820bB = inputNetStream.readInt();
        gameEngine.f5821bC = inputNetStream.readInt();
    }

    /* renamed from: c */
    public Setup m1420c() {
        Setup setup;
        if (this.isServer) {
            setup = this.setup;
        } else if (this.f5042H) {
            setup = this.setup.m1339c();
        } else {
            setup = null;
            GameEngine.log("getChangeableSetup", "Clicked but not server or proxy controller");
        }
        return setup;
    }

    /* renamed from: d */
    public void m1410d() {
        if (this.f5126F) {
            GameEngine.getInstance().curSettings.aiDifficulty = this.setup.aiDifficulty;
        }
        if (!this.isServer && !this.f5126F) {
            return;
        }
        if (this.gameHasStarted) {
            GameEngine.LogTrace("updateAIDifficulty with gameHasBeenStarted=true");
        } else {
            for (int i = 0; i < Team.playerNumMax; i++) {
                Team team = Team.getTeam(i);
                if (team != null) {
                    m1491a(team);
                }
            }
        }
        updateNamesOfAI();
    }

    /* renamed from: a */
    public void m1491a(Team team) {
        if (team.f1333t) {
            team.log("aiDifficultyOverride=" + team.aiDifficultyOverride);
            if (team.aiDifficultyOverride != null) {
                team.f1334u = team.aiDifficultyOverride.intValue();
            } else {
                team.f1334u = this.setup.aiDifficulty;
            }
        }
    }

    /* renamed from: b */
    public boolean setAIName(Team team) {
        boolean z = false;
        if (team.f1333t) {
            String str = "AI - " + getAIdifficultyText_Hcat1(team.m3875x());
            if (!str.equals(team.playerName)) {
                team.playerName = str;
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m1486a(Setup setup) {
        if (this.isServer) {
            m1410d();
            m1516L();
            m1520H();
            MultiplayerBattleroomActivity.updateUI();
        } else if (this.f5042H) {
            m1429b(setup);
        } else {
            GameEngine.PrintLOG("applyChangedSetup but not server or proxy controller");
        }
    }

    /* renamed from: b */
    private void m1429b(Setup setup) {
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLOG("applyProxyControl");
        Setup setup2 = this.setup;
        if (!setup2.mapFileName.equals(setup.mapFileName)) {
            gameEngine.networkEngine.Sendpara2Server("-map '" + C0670a.m2152n(ActivityC0112i.m4415e(setup.mapFileName)) + "'");
        }
        if (setup2.revealedMap != setup.revealedMap) {
            gameEngine.networkEngine.Sendpara2Server("-revealedmap " + (!setup.revealedMap ? "true" : "false"));
        }
        if (setup2.fogMode != setup.fogMode) {
            gameEngine.networkEngine.Sendpara2Server("-fog " + gameEngine.networkEngine.m1497a(setup.fogMode));
        }
        if (setup2.startingCreditsLev != setup.startingCreditsLev) {
            gameEngine.networkEngine.Sendpara2Server("-credits " + gameEngine.networkEngine.getStartingCreditsVal(setup.startingCreditsLev));
        }
        if (!CommonUtils.m1626j(setup2.incomeMultiplier, setup.incomeMultiplier)) {
            gameEngine.networkEngine.Sendpara2Server("-income " + CommonUtils.m1740a(setup.incomeMultiplier, 1));
        }
        if (setup2.noNukes != setup.noNukes) {
            gameEngine.networkEngine.Sendpara2Server("-nukes " + (!setup.noNukes ? "true" : "false"));
        }
        if (setup2.aiDifficulty != setup.aiDifficulty) {
            gameEngine.networkEngine.Sendpara2Server("-ai " + setup.aiDifficulty);
        }
        if (setup2.startingUnits != setup.startingUnits) {
            gameEngine.networkEngine.Sendpara2Server("-startingunits " + setup.startingUnits);
        }
        if (setup2.sharedControl != setup.sharedControl) {
            gameEngine.networkEngine.Sendpara2Server("-sharedControl " + (setup.sharedControl ? "true" : "false"));
        }
    }

    /* renamed from: e */
    public String getFogText() {
        if (this.setup.fogMode == 0) {
            return "No fog";
        }
        if (this.setup.fogMode == 1) {
            return "Basic fog";
        }
        if (this.setup.fogMode == 2) {
            return "Line of Sight";
        }
        return "Unknown";
    }

    /* renamed from: a */
    public String m1497a(int i) {
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
    public String getAIdifficultyText_Hcat1(int i) {
        return getAIdifficultyText(i);
    }

    /* renamed from: c */
    public String getAIdifficultyText(int i) {
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

    /* renamed from: f */
    public String m1395f() {
        return m1409d(this.setup.startingUnits);
    }

    /* renamed from: g */
    public ArrayList m1389g() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 4; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        arrayList.addAll(CustomUnitMetadata.m3069s());
        return arrayList;
    }

    /* renamed from: d */
    public String m1409d(int i) {
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
        CustomUnitMetadata m3102c = CustomUnitMetadata.m3102c(i);
        if (m3102c != null) {
            return m3102c.mo3095e();
        }
        return "Unknown";
    }

    /* renamed from: h */
    public String getStartingCreditsText() {
        if (this.setup.startingCreditsLev == 0) {
            return "Default ($" + getStartingCreditsVal() + ")";
        }
        return "$" + getStartingCreditsVal();
    }

    /* renamed from: i */
    public final int getStartingCreditsVal() {
        return getStartingCreditsVal(this.setup.startingCreditsLev);
    }

    /* renamed from: e */
    public int getStartingCreditsVal(int i) {
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

    /* renamed from: j */
    public String m1371j() {
        return C0670a.m2152n(this.mapFilePath);
    }

    /* renamed from: k */
    public boolean gameHasStarted() {
        return this.gameHasStarted;
    }

    /* renamed from: l */
    public boolean isGameStarting() {
        return this.f5117d.m1528e();
    }

    /* renamed from: a */
    public synchronized void m1461a(boolean z, String str, Boolean bool) {
        this.f5089bk = Boolean.valueOf(z);
        this.f5087bi = str;
        this.f5088bj = bool;
        MultiplayerBattleroomActivity.updateUI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1472a(C0790g c0790g) {
        Iterator it = this.f5166bs.iterator();
        while (it.hasNext()) {
            C0790g c0790g2 = (C0790g) it.next();
            if (c0790g2.f5370a && c0790g2.f5372c.equals(c0790g.f5372c) && c0790g2.f5376g == c0790g.f5376g) {
                c0790g2.f5383o = m1365m();
            }
        }
        c0790g.f5383o = m1365m();
        this.f5166bs.add(c0790g);
        ActivityC0123p.m4390l();
    }

    /* renamed from: m */
    public long m1365m() {
        return System.currentTimeMillis();
    }

    public NetworkEngine() {
        this.f5178ba.f5338o = true;
        this.f5179bt.playerName = "SPECTATOR";
        this.f5180bu.playerName = "ADMIN";
    }

    /* renamed from: n */
    public void m1363n() {
        m1463a(false);
    }

    /* renamed from: o */
    public void m1361o() {
        m1463a(true);
    }

    /* renamed from: p */
    public void m1359p() {
        this.f5124bO = false;
        this.localPlayerReady = false;
        this.f5111z = null;
        this.f5106p = false;
        this.f5134W = 0;
        this.f5127I = 0;
        this.unitId = 1L;
        m1499a(1.0f, "new");
        this.f5052Y = 10.0f;
        this.f5045M = false;
        this.f5048P = 10;
        this.f5049Q = 0;
        this.f5051X = false;
        this.f5053Z = false;
        this.isGamePaused = false;
        this.f5077aj = false;
        this.f5070aa = 0.0f;
        this.f5071ab = 0.0f;
        this.f5072ac = false;
        this.f5074ae = false;
        this.gameHasStarted = false;
        this.f5164bm = false;
        this.f5091bn = false;
        this.f5092bo = false;
        this.f5093bp = false;
        this.f5094bq = false;
        this.f5075af = false;
        this.f5135ag = -1;
        this.f5079al = 0L;
        this.f5169bB = false;
        m1434b();
        this.f5054aC = false;
        this.f5153aD = true;
        this.f5055aE = 0;
        this.f5056aF = 0;
        this.f5057aG = 0;
        this.f5154aI = 0.0f;
        this.lastResyncTimer = 0.0f;
        this.f5096by = 0.0f;
        this.f5097bz = 0;
        this.f5080bA = -1000;
        C0776ao.f5273i = 55;
        C0776ao.f5274j = 66;
    }

    /* renamed from: a */
    public void m1463a(boolean z) {
        this.networked = false;
        this.isServer = false;
        this.f5098f = null;
        this.f5126F = false;
        this.f5039D = false;
        this.f5040E = null;
        this.f5123x = false;
        this.f5042H = false;
        this.f5041G = false;
        this.f5059aK = false;
        this.f5037A = false;
        m1359p();
        this.serverUUID = null;
        this.f5103m = 0;
        this.f5100i = false;
        this.f5101j = 0.0f;
        this.f5102k = 0.0f;
        this.f5174bH = false;
        this.f5061aQ = null;
        this.f5156aM = GameEngine.getInstance().curSettings.teamUnitCapHostedGame;
        if (this.f5156aM < 1) {
            this.f5156aM = 1;
        }
        this.f5155aL = this.f5156aM;
        this.setup.startingUnits = 1;
        this.setup.incomeMultiplier = 1.0f;
        this.setup.noNukes = false;
        this.setup.f5214j = false;
        this.setup.sharedControl = false;
        this.setup.startingCreditsLev = 0;
        this.setup.teamLocked = false;
        this.setup.f5217n = false;
        this.setup.allowSpectators = true;
        this.setup.lockedRoom = false;
        this.setup.randomSeed = 0;
        this.f5159aR.m1535c();
        GameEngine.getInstance().interfaceEngine.m1845g();
        if ("<CHAT ONLY>".equals(this.setup.mapFileName)) {
            GameEngine.PrintLOG("Chat only map selection - restarting");
            this.setup.m1343a();
        }
        if (!z) {
            Team.m3987A();
        }
        CustomUnitMetadataFactory.m3544b(this.mods);
    }

    /* renamed from: q */
    public void m1358q() {
    }

    /* renamed from: b */
    public synchronized void disconnect(String str) {
        GameEngine game = GameEngine.getInstance();
        GameEngine.PrintLOG("Disconnect: " + str);
        if (this.isServer) {
            m1446am();
            C0797n.m1187d();
            if (this.f5063aT != null) {
                this.f5063aT.m1332b();
                try {
                    if (this.f5062aS != null) {
                        this.f5062aS.join();
                    }
                } catch (InterruptedException e) {
                }
                this.f5063aT = null;
                this.f5062aS = null;
            }
            if (this.f5065aV != null) {
                this.f5065aV.m1332b();
                try {
                    if (this.f5064aU != null) {
                        this.f5064aU.join();
                    }
                } catch (InterruptedException e2) {
                }
                this.f5065aV = null;
                this.f5064aU = null;
            }
            if (this.f5066aW != null) {
                this.f5066aW.cancel();
                this.f5066aW = null;
                this.f5067aX = null;
            }
            if (this.f5069aZ != null) {
                this.f5069aZ.m1344b();
                this.f5069aZ = null;
                this.f5068aY = null;
            }
        }
        disconnectAll(str);
        SteamEngine.m718a().mo266j();
        synchronized (this.f5167bv) {
            this.networked = false;
            this.isServer = false;
            this.f5126F = false;
            this.f5098f = null;
            try {
                wait(50L);
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
            this.gameHasStarted = false;
            game.replayEngine.m2308d();
            game.mo834d();
            m1451ah();
            this.queDisconnect = false;
            this.f5167bv.notifyAll();
        }
    }

    /* renamed from: r */
    public void m1357r() {
        synchronized (this.f5167bv) {
            if (!this.networked) {
                return;
            }
            this.queDisconnect = true;
            try {
                this.f5167bv.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void m1482a(Connection connection) {
        this.connections.remove(connection);
    }

    /* renamed from: at */
    private synchronized void m1439at() {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            if (((Connection) it.next()).disconnecting) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    void m1459a(byte[] bArr, Connection conn) {
        if (!GameEngine.m858at()) {
            Log.e("RustedWarfare", "Ignoring incoming resync tagged as debug only");
        } else if (conn.f5343t) {
            Log.e("RustedWarfare", "Ignoring desync client save, as past desync was already saved");
        } else {
            conn.f5343t = true;
            Log.e("RustedWarfare", "Saving client save for debugging");
            File file = new File("desyncs/" + ("desync_" + CommonUtils.SimpleDateFormatStr("d MMM yyyy HH.mm.ss") + "_" + conn.connectionId));
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

    /* renamed from: s */
    public void m1356s() {
        if (this.f5169bB) {
            return;
        }
        GameEngine.PrintLOG("Adding quick resync command");
        GameEngine game = GameEngine.getInstance();
        C0678e m2260b = game.f5867cf.m2260b();
        m2260b.team = Team.f1346g;
        m2260b.f4445r = true;
        m2260b.f4448u = 200;
        game.networkEngine.m1488a(m2260b);
        this.f5169bB = true;
    }

    /* renamed from: t */
    public void m1355t() {
        GameEngine game = GameEngine.getInstance();
        OutputNetStream outputNetStream = new OutputNetStream();
        game.f5862ca.m415a(outputNetStream);
        try {
            outputNetStream.mo1316a();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] mo1294d = outputNetStream.mo1294d();
        outputNetStream.m1319h();
        if (this.isServer) {
            Iterator it = this.connections.iterator();
            while (it.hasNext()) {
                Connection connection = (Connection) it.next();
                if (connection.f5345v) {
                    connection.f5345v = false;
                    connection.f5344u = false;
                    m1473a(connection, mo1294d, this.f5119l, false);
                }
            }
        }
        GameEngine.PrintLOG("Loading quick resync save data (bytes:" + mo1294d.length + ")");
        InputNetStream stream = new InputNetStream(mo1294d);
        game.m882a("Game resync (quick)...", true);
        int i = game.frameNumber;
        int i2 = game.f5845by;
        game.f5862ca.m414a(stream, true, true, true);
        game.frameNumber = i;
        game.f5845by = i2;
        this.f5134W = game.frameNumber + 1;
        this.f5075af = false;
        this.f5135ag = this.f5134W + 1;
        this.f5079al = 0L;
        Iterator it2 = this.connections.iterator();
        while (it2.hasNext()) {
            ((Connection) it2.next()).f5344u = false;
        }
        this.f5169bB = false;
        this.f5057aG++;
        this.lastResyncTimer = 0.0f;
        this.f5096by = 0.0f;
        if (this.f5097bz < 1) {
            this.f5097bz++;
        }
        this.f5080bA = game.frameNumber;
    }

    /* renamed from: u */
    public synchronized void m1354u() {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5345v) {
                throw new RuntimeException("Player: " + connection.getPlayerName() + " has complete desync");
            }
            if (connection.f5344u) {
                throw new RuntimeException("Player: " + connection.getPlayerName() + " has minor desync");
            }
            if (connection.f5346w == 0) {
                throw new RuntimeException("Player: " + connection.getPlayerName() + " has no sync matches");
            }
        }
    }

    /* renamed from: c */
    private synchronized void m1419c(float f) {
        GameEngine.getInstance();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        this.lastResyncTimer += f;
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5345v) {
                z = true;
            }
            if (connection.f5344u) {
                if (this.f5099g) {
                    GameEngine.PrintLOG("desync_count:" + connection.desync_count + " lastResyncTimer:" + this.lastResyncTimer);
                }
                if (connection.desync_count < 4 || this.lastResyncTimer > 3600.0f) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            this.f5096by += f;
            if (f5114c && this.f5096by > 5.0f) {
                z2 = true;
            }
            if (this.f5097bz == 0) {
                if (this.f5096by > 60.0f) {
                    z2 = true;
                }
            } else if (this.f5097bz == 1) {
                if (this.f5096by > 420.0f) {
                    z2 = true;
                }
            } else if (this.f5097bz == 2) {
                if (this.f5096by > 3600.0f) {
                    z2 = true;
                }
            } else if (this.f5097bz == 3 && this.f5096by > 14400.0f) {
                z2 = true;
            }
        }
        if (f5035aH && z2) {
            GameEngine.PrintLOG("disableDesyncFixing==true, running quick resync instead");
            z2 = false;
            z = true;
        }
        if (!z2 && z) {
            if (f5113b) {
                m1356s();
            } else {
                z2 = true;
            }
        }
        if (z2) {
            String str = VariableScope.nullOrMissingString;
            Iterator it2 = this.connections.iterator();
            while (it2.hasNext()) {
                Connection connection2 = (Connection) it2.next();
                if (connection2.f5345v || connection2.f5344u) {
                    if (!str.equals(VariableScope.nullOrMissingString)) {
                        str = str + ", ";
                    }
                    str = str + connection2.getPlayerName();
                }
            }
            sendSystemMessage("Resyncing game for " + str + "...");
            m1438au();
            m1460a(this.f5119l, false, true);
        }
    }

    /* renamed from: au */
    private void m1438au() {
        GameEngine game = GameEngine.getInstance();
        this.lastResyncTimer = 0.0f;
        this.f5096by = 0.0f;
        this.f5097bz++;
        this.f5080bA = game.frameNumber;
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            connection.f5345v = false;
            connection.f5344u = false;
            connection.f5346w = 0;
        }
    }

    /* renamed from: n */
    private void disconnectAll(String str) {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            ((Connection) it.next()).writeStringPkg(str);
        }
        this.connections.clear();
        this.receivedPackets.clear();
        this.nextConnectionIndex = 1;
        this.hasPacketsToSend = false;
    }

    /* renamed from: v */
    public long getNextUnitId() {
        if (0 != 0) {
            GameEngine.PrintLOG("New id set:" + this.unitId + 1);
            GameEngine.m914P();
        }
        long j = this.unitId;
        this.unitId = j + 1;
        if (j == 0) {
            GameEngine.PrintLOG("getNextUnitId: id==0");
            GameEngine.m914P();
        }
        return j;
    }

    /* renamed from: w */
    public long getUnitId() {
        return this.unitId;
    }

    /* renamed from: a */
    public void m1495a(long j) {
        this.unitId = j;
    }

    /* renamed from: a */
    public boolean allPlayersIngame(boolean z, int i) {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5338o && connection.m1269g() && !connection.f5341r && !connection.f5356C) {
                if (z) {
                    sendSystemMessage("Still waiting on: " + connection.getPlayerName());
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    public int m1351x() {
        int i = 0;
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5338o && connection.m1269g() && !connection.f5341r) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: y */
    public int m1350y() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5338o && connection.m1269g() && !connection.f5341r) {
                Player player = connection.player;
                if (player != null) {
                    if (!arrayList.contains(player)) {
                        arrayList.add(player);
                    }
                }
                i++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public int m1349z() {
        int i = 0;
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5338o && !connection.f5341r) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: A */
    public int m1527A() {
        int m1350y = 0 + m1350y();
        if (!GameEngine.m858at()) {
            m1350y++;
        }
        return m1350y;
    }

    /* renamed from: c */
    public void addDebugText(String text) {
        Log.d("RustedWarfare", "network:" + text);
    }

    /* renamed from: d */
    public static void m1405d(String str) {
        GameEngine.PrintLOG("network debug: " + str);
    }

    /* renamed from: e */
    public void reportProblem(String text) {
        Log.e("RustedWarfare", "reportProblem:" + text);
        if (this.gameHasStarted) {
            m1479a((Connection) null, -1, (String) null, text);
        } else {
            m1479a((Connection) null, -1, (String) null, text);
        }
    }

    /* renamed from: f */
    public static void reportDesync(String str) {
        m1467a(str, false);
    }

    /* renamed from: g */
    public static void m1384g(String str) {
        m1467a(str, true);
    }

    /* renamed from: a */
    public static void m1467a(String str, boolean z) {
        String str2;
        NetworkEngine networkEngine = GameEngine.getInstance().networkEngine;
        String str3 = "desync:" + str;
        GameEngine.log(str3);
        GameEngine.m914P();
        networkEngine.f5055aE++;
        if (networkEngine.f5153aD) {
            if (networkEngine.f5055aE > 2 || f5035aH) {
                z = true;
            }
            if (networkEngine.f5055aE > 10) {
                str2 = "<suppressing desync errors>";
                networkEngine.f5153aD = false;
                z = true;
            } else {
                str2 = str3;
            }
            if (z) {
                str2 = "-i " + str2;
            }
            networkEngine.sendChatMessage(str2);
        }
    }

    /* renamed from: a */
    public static void m1468a(String str, String str2) {
        GameEngine game = GameEngine.getInstance();
        game.replayEngine.m2323a(-1, str, str2, game.frameNumber);
        if (game.interfaceEngine != null && game.interfaceEngine.messageInterface != null) {
            game.interfaceEngine.messageInterface.m1810a(str, str2);
        } else {
            GameEngine.LogTrace("interfaceEngine/messageInterface==null");
        }
    }

    /* renamed from: B */
    public void m1526B() {
    }

    /* renamed from: a */
    public void m1488a(C0678e c0678e) {
        GameEngine gameEngine = GameEngine.getInstance();
        c0678e.f4436c = this.f5134W;
        c0678e.m2076g();
        gameEngine.f5867cf.f4212b.add(c0678e);
    }

    /* renamed from: C */
    public void m1525C() {
        C0770aj c0770aj;
        C0770aj c0770aj2;
        C0770aj c0770aj3;
        this.f5135ag = GameEngine.getInstance().frameNumber;
        this.f5079al = 0L;
        m1434b();
        Iterator it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject obj = (GameObject) it.next();
            if (obj instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) obj;
                this.f5079al = ((float) this.f5079al) + (orderableUnit.x * 1000.0f);
                this.f5079al = ((float) this.f5079al) + (orderableUnit.y * 1000.0f);
                this.f5079al = ((float) this.f5079al) + (orderableUnit.hp * 1.0f);
                this.f5079al += orderableUnit.GameObjectID;
                this.f5138an.f5225b += Float.floatToRawIntBits(orderableUnit.x);
                this.f5138an.f5225b += Float.floatToRawIntBits(orderableUnit.y);
                this.f5139ao.f5225b += Float.floatToRawIntBits(orderableUnit.direction);
                this.f5140ap.f5225b = ((float) c0770aj.f5225b) + orderableUnit.hp;
                this.f5141aq.f5225b += orderableUnit.GameObjectID;
                if (obj instanceof CommandCenter) {
                    CommandCenter commandCenter = (CommandCenter) orderableUnit;
                    this.f5151aA.f5225b = ((float) c0770aj3.f5225b) + (commandCenter.f3254f * 2.0f);
                    this.f5152aB.f5225b += commandCenter.f3256h;
                }
                Waypoint activeWaypoint = orderableUnit.getActiveWaypoint();
                if (activeWaypoint != null) {
                    this.f5142ar.f5225b += activeWaypoint.m3669j();
                    this.f5143as.f5225b = ((float) c0770aj2.f5225b) + (activeWaypoint.getRealX() * 1000.0f);
                }
                this.f5145au.f5225b += orderableUnit.m2586aK();
            }
        }
        for (int i = 0; i < Team.playerNumMax; i++) {
            Team team = Team.getTeam(i);
            if (team != null) {
                this.f5144at.f5225b += (int) team.credits;
                if (i == 0) {
                    this.f5148ax.f5225b += (int) team.credits;
                }
                if (i == 1) {
                    this.f5149ay.f5225b += (int) team.credits;
                }
                if (i == 2) {
                    this.f5150az.f5225b += (int) team.credits;
                }
                this.f5146av.f5225b += team.m3881r();
                this.f5147aw.f5225b += i + (team.f1334u * 100) + (team.allyGroup * 1000) + ((team.f1333t ? i : 0) * 10000);
            }
        }
        this.f5054aC = false;
    }

    /* renamed from: D */
    public void m1524D() {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (!connection.f5338o || connection.m1278b() == -2 || connection.m1278b() > 500 || connection.m1278b() < 0) {
            }
        }
    }

    /* renamed from: E */
    public void showPlayerListPopup() {
        GameEngine game = GameEngine.getInstance();
        String str = VariableScope.nullOrMissingString;
        for (Team team : Team.m3947a(true)) {
            if (team != null) {
                String name = "unnamed";
                if (team.playerName != null) {
                    name = team.playerName;
                }
                str = str + "•" + team.m3980H().toLowerCase() + " [Team " + team.getTeam() + "] - " + name + (" " + team.ingame_getNetPing()) + "\n";
            }
        }
        GameEngine.PrintLOG("showPlayerListPopup(): Showing playlist messagebox.");
        String playerName = str;
        game.showMessageBox("Players", playerName);
    }

    /* renamed from: a */
    public void m1500a(float f) {
        Connection m1509S;
        GameEngine game = GameEngine.getInstance();
        this.f5154aI += f;
        if (this.f5154aI > 60.0f) {
            m1524D();
            this.f5154aI = 0.0f;
        }
        if (this.gameHasStarted && !this.f5164bm) {
            this.f5164bm = true;
            int i = 0;
            int i2 = 0;
            Iterator it = Team.m3916d().iterator();
            while (it.hasNext()) {
                int m3963a = Team.m3963a(((Integer) it.next()).intValue(), false);
                if (m3963a > i2) {
                    i2 = m3963a;
                }
                i++;
            }
            if (i > 2 && i2 <= 1) {
                this.f5091bn = true;
            }
        }
        if (!this.isServer && !this.f5124bO) {
            sendClientStatus();
            this.f5124bO = true;
        }
        if (this.isServer) {
            if (!this.f5053Z) {
                if (allPlayersIngame(false, 0)) {
                    this.f5052Y = CommonUtils.toZero(this.f5052Y, f);
                    if (this.f5052Y == 0.0f) {
                        this.f5053Z = true;
                        m1468a(VariableScope.nullOrMissingString, "<All players ready>");
                        this.f5117d.m1534a();
                    }
                } else {
                    this.f5070aa += f;
                    this.f5071ab += f;
                    if (this.f5070aa > 900.0f) {
                        this.f5053Z = true;
                        m1468a(VariableScope.nullOrMissingString, "Starting game without all players ready!");
                    } else if (this.f5071ab > 180.0f) {
                        this.f5071ab = 0.0f;
                        allPlayersIngame(true, (int) ((900.0f - this.f5070aa) / 60.0f));
                    }
                }
            }
            if (this.f5053Z) {
                boolean z = false;
                if (this.f5077aj) {
                    z = true;
                }
                if (this.isGamePaused) {
                    z = true;
                }
                if ((game.frameNumber >= this.f5134W - this.f5049Q) & (!z)) {
                    int i3 = this.f5134W + this.f5048P;
                    this.f5046N++;
                    boolean z2 = false;
                    for (int i4 = 0; i4 < Team.playerNumMax; i4++) {
                        Team team = Team.getTeam(i4);
                        if (team != null && team.f1301S != 0 && !team.m3876w() && team.f1301S < 40) {
                            z2 = true;
                        }
                    }
                    if (game.mo852b() != 0 && game.mo852b() < 40 && !GameEngine.m858at()) {
                        z2 = true;
                    }
                    if (z2) {
                        this.f5047O++;
                    }
                    if (this.f5046N > 8) {
                        float f2 = 1.0f;
                        if (this.f5047O > 4) {
                            f2 = 2.0f;
                        }
                        if (this.f5043K != null) {
                            f2 = this.f5043K.floatValue();
                        }
                        if (f2 != m1501a()) {
                            GameEngine.PrintLOG("Changing step rate to " + f2);
                            C0678e m2260b = game.f5867cf.m2260b();
                            m2260b.team = Team.f1346g;
                            m2260b.f4445r = true;
                            m2260b.f4446s = f2;
                            m1488a(m2260b);
                        }
                        this.f5046N = 0;
                        this.f5047O = 0;
                    }
                    OutputNetStream outputNetStream = new OutputNetStream();
                    try {
                        outputNetStream.writeInt(i3);
                        int i5 = 0;
                        Iterator it2 = game.f5867cf.f4212b.iterator();
                        while (it2.hasNext()) {
                            if (((C0678e) it2.next()).f4436c == this.f5134W) {
                                i5++;
                            }
                        }
                        outputNetStream.writeInt(i5);
                        Iterator it3 = game.f5867cf.f4212b.iterator();
                        while (it3.hasNext()) {
                            C0678e c0678e = (C0678e) it3.next();
                            if (c0678e.f4436c == this.f5134W) {
                                c0678e.m2091a(outputNetStream);
                            }
                        }
                        Packet createPacket = outputNetStream.createPacket(10);
                        createPacket.f5289e = true;
                        sendPacketToAll(createPacket);
                        this.f5134W = i3;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        if (!game.f5867cf.f4214d.isEmpty()) {
            Iterator it4 = game.f5867cf.f4214d.iterator();
            while (it4.hasNext()) {
                C0678e c0678e2 = (C0678e) it4.next();
                if (0 != 0) {
                    game.f5867cf.f4213c.add(c0678e2);
                    it4.remove();
                } else {
                    if (!c0678e2.f4460x) {
                        c0678e2.m2088b();
                    }
                    if (c0678e2.m2103a()) {
                        game.f5867cf.f4213c.add(c0678e2);
                        it4.remove();
                    }
                }
            }
        }
        if (!this.isServer) {
            if (!game.f5867cf.f4213c.isEmpty()) {
                Iterator it5 = game.f5867cf.f4213c.iterator();
                while (it5.hasNext()) {
                    C0678e c0678e3 = (C0678e) it5.next();
                    if (!c0678e3.m2080e()) {
                        c0678e3.m2073j();
                        OutputNetStream outputNetStream2 = new OutputNetStream();
                        try {
                            c0678e3.m2091a(outputNetStream2);
                            sendPacketToAll(outputNetStream2.createPacket(20));
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
                game.f5867cf.f4213c.clear();
            }
        } else if (!game.f5867cf.f4213c.isEmpty()) {
            Iterator it6 = game.f5867cf.f4213c.iterator();
            while (it6.hasNext()) {
                C0678e c0678e4 = (C0678e) it6.next();
                if (!c0678e4.m2080e()) {
                    if (!c0678e4.m2071l()) {
                        reportDesync("Skipped command issued from server");
                    } else {
                        c0678e4.m2073j();
                        m1488a(c0678e4);
                    }
                }
            }
            game.f5867cf.f4213c.clear();
        }
        while (!this.receivedPackets.isEmpty()) {
            Packet packet = (Packet) this.receivedPackets.remove();
            try {
                m1483a(packet);
            } catch (IOException e3) {
                String str = "None";
                Connection connection = packet.connection;
                if (connection != null) {
                    str = connection.getPlayerIp();
                    String message = e3.getMessage();
                    if (message == null) {
                        message = "IO error";
                    }
                    connection.writeStringPkg(message);
                    reportDesync("IO error on processGamePacket for " + connection.getPlayerName());
                }
                GameEngine.LogThrowable("Error on processGamePacket ip:" + str, (Throwable) e3);
            }
        }
        if (this.isServer) {
            if (!this.networked) {
                GameEngine.PrintLOG("Skipping server updates, not networked");
            } else {
                m1439at();
                if (!this.f5076ai) {
                    m1419c(f);
                }
            }
        }
        if (!this.isServer && this.networked) {
            boolean z3 = false;
            Iterator it7 = this.connections.iterator();
            while (it7.hasNext()) {
                Connection connection2 = (Connection) it7.next();
                if (connection2.f5338o && !connection2.disconnecting) {
                    z3 = true;
                }
            }
            if (this.f5094bq && gameHasStarted()) {
                game.interfaceEngine.m1879a("Game ended by server.");
                MultiplayerBattleroomActivity.updateUI();
            } else if (!z3 && gameHasStarted()) {
                game.interfaceEngine.m1879a("Server Disconnected.");
                MultiplayerBattleroomActivity.updateUI();
            }
            if (z3 && this.f5051X && !this.isServer && (m1509S = m1509S()) != null && m1509S.f5325T > 20000) {
                String str2 = "Receiving network data: " + m1509S.f5326U + "/" + m1509S.f5325T;
                GameEngine.PrintLOG(str2);
                game.interfaceEngine.m1854c(str2);
            }
        }
        if (this.networked && this.isGamePaused) {
            game.interfaceEngine.m1862b("Game paused.", 100);
        }
        if (game.frameNumber < this.f5134W) {
            this.f5051X = false;
        }
        boolean con = this.queDisconnect;
        if (con) {
            disconnect("queDisconnect");
        }
    }

    /* renamed from: b */
    public void m1433b(float f) {
        GameEngine game = GameEngine.getInstance();
        if (this.networked && (this.f5135ag + this.f5136ah < game.frameNumber || this.f5135ag == -1)) {
            m1525C();
            game.replayEngine.m2310c();
        }
        if ((this.networked || game.replayEngine.isPlaying()) && this.f5045M) {
            this.f5045M = false;
            m1355t();
        }
        if (this.networked && this.isServer && !this.f5054aC && this.f5135ag + (this.f5136ah / 2) < game.frameNumber && this.f5135ag != -1) {
            try {
                OutputNetStream outputNetStream = new OutputNetStream();
                outputNetStream.writeInt(this.f5135ag);
                outputNetStream.writeLong(this.f5079al);
                outputNetStream.writeInt(this.f5137am.size());
                Iterator it = this.f5137am.iterator();
                while (it.hasNext()) {
                    outputNetStream.writeLong(((C0770aj) it.next()).f5225b);
                }
                m1380h(outputNetStream.createPacket(30));
                if (this.f5099g) {
                    GameEngine.PrintLOG("Sent checksum to client [" + this.f5135ag + "]");
                }
                this.f5054aC = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: F */
    public boolean m1522F() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.PathEngine.m1082e()) {
            if (!this.f5170bC) {
                GameEngine.PrintLOG("shouldGameBePaused: isGoingToBlockThisFrame()==true: " + gameEngine.PathEngine.m1081f());
            }
            this.f5170bC = true;
            return true;
        }
        if (this.f5170bC) {
            GameEngine.PrintLOG("shouldGameBePaused: isGoingToBlockThisFrame()==false");
        }
        this.f5170bC = false;
        return false;
    }

    /* renamed from: a */
    public void m1498a(float f, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.frameNumber >= this.f5134W) {
            if (gameEngine.frameNumber > this.f5134W) {
                throw new RuntimeException("game frame:" + gameEngine.frameNumber + " is greater then nest step:" + this.f5134W);
            }
            this.f5051X = true;
        }
        if (z && m1522F()) {
            this.f5051X = true;
        }
    }

    /* renamed from: a */
    public void m1483a(Packet packet) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (m1427b(packet)) {
            addDebugText("filtered packet (type:" + packet.type + ")");
            return;
        }
        switch (packet.type) {
            case 10:
                if (this.isServer) {
                    addDebugText("we are a server! we don't follow orders");
                    return;
                } else if (packet.connection.f5342s) {
                    addDebugText("ignoring command");
                    return;
                } else {
                    InputNetStream inputNetStream = new InputNetStream(packet);
                    int readInt = inputNetStream.readInt();
                    int readInt2 = inputNetStream.readInt();
                    for (int i = 0; i < readInt2; i++) {
                        C0678e m2260b = gameEngine.f5867cf.m2260b();
                        m2260b.f4436c = this.f5134W;
                        m2260b.m2090a(inputNetStream);
                        m1488a(m2260b);
                    }
                    if (readInt < this.f5134W) {
                        reportDesync("New nextBlockingFrame:" + readInt + " is smaller than current step:" + this.f5134W);
                    }
                    this.f5134W = readInt;
                    return;
                }
            case 20:
                if (!this.isServer) {
                    addDebugText("we are not a server! skipping");
                    return;
                }
                InputNetStream inputNetStream2 = new InputNetStream(packet);
                Connection connection = packet.connection;
                if (!connection.m1285a()) {
                    Player player = connection.player;
                    if (player == null) {
                        addDebugText("Player is null for message ADDCLIENTCOMMAND, skipping");
                        return;
                    }
                    C0678e m2260b2 = gameEngine.f5867cf.m2260b();
                    m2260b2.m2090a(inputNetStream2);
                    m2260b2.f4443p = player;
                    if (m2260b2.f4445r) {
                        addDebugText("Got system action from client, ignoring (" + connection.connectionId + ")");
                        m2260b2.f4445r = false;
                    }
                    if (m2260b2.m2085c() == null) {
                        reportDesync("Invalid command from '" + player.playerName + "', no team found");
                        return;
                    } else if (!m2260b2.m2071l()) {
                        reportDesync("Ignored command from '" + player.playerName + "', check failed");
                        return;
                    } else {
                        m1488a(m2260b2);
                        return;
                    }
                }
                return;
            case 30:
                Connection connection2 = packet.connection;
                InputNetStream inputNetStream3 = new InputNetStream(packet);
                int readInt3 = inputNetStream3.readInt();
                long readLong = inputNetStream3.readLong();
                if (this.f5075af) {
                    addDebugText("PACKET_SYNCCHECKSUM: skipping frame:" + readInt3 + ", we were told to wait for resync");
                    return;
                }
                OutputNetStream outputNetStream = new OutputNetStream();
                outputNetStream.writeByte(0);
                outputNetStream.writeInt(readInt3);
                outputNetStream.writeInt(this.f5135ag);
                if (this.f5135ag != readInt3 || this.f5079al == 0) {
                    outputNetStream.writeBoolean(false);
                    Log.e("RustedWarfare", "got remoteSyncFrame for:" + readInt3 + " needed:" + this.f5135ag + " lastSyncCheckSum:" + this.f5079al);
                } else {
                    outputNetStream.writeBoolean(true);
                    Log.e("RustedWarfare", "Running checksum");
                    outputNetStream.writeLong(readLong);
                    outputNetStream.writeLong(this.f5079al);
                    boolean z = false;
                    if (readLong != this.f5079al) {
                        reportDesync("Checksum doesn't match. Got:" + readLong + " expected:" + this.f5079al);
                        z = true;
                        Iterator it = Team.m3929c().iterator();
                        while (it.hasNext()) {
                            ((Team) it.next()).m3882q();
                        }
                    } else {
                        this.f5056aF++;
                    }
                    int readInt4 = inputNetStream3.readInt();
                    if (readInt4 != this.f5137am.size()) {
                        Log.e("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                    }
                    outputNetStream.mo1291e("checkList");
                    outputNetStream.writeInt(readInt4);
                    outputNetStream.writeInt(this.f5137am.size());
                    Iterator it2 = this.f5137am.iterator();
                    while (it2.hasNext()) {
                        C0770aj c0770aj = (C0770aj) it2.next();
                        long readLong2 = inputNetStream3.readLong();
                        outputNetStream.writeLong(readLong2);
                        outputNetStream.writeLong(c0770aj.f5225b);
                        if (readLong2 != c0770aj.f5225b && c0770aj.f5226c) {
                            reportDesync("[" + readInt3 + "] check(" + c0770aj.f5224a + "): " + readLong2 + "!=" + c0770aj.f5225b);
                            z = true;
                        }
                    }
                    outputNetStream.endBlock("checkList");
                    outputNetStream.writeBoolean(z);
                }
                if (!this.isServer) {
                    m1476a(connection2, outputNetStream.createPacket(31));
                    return;
                }
                return;
            case 31:
                if (!this.isServer) {
                    addDebugText("we are not a server, but got PACKET_SYNCCHECKSUM_STATUS");
                    return;
                }
                Connection connection3 = packet.connection;
                InputNetStream inputNetStream4 = new InputNetStream(packet);
                inputNetStream4.readByte();
                int readInt5 = inputNetStream4.readInt();
                int readInt6 = inputNetStream4.readInt();
                if (inputNetStream4.readBoolean()) {
                    inputNetStream4.readLong();
                    inputNetStream4.readLong();
                    inputNetStream4.m1234b("checkList");
                    inputNetStream4.readInt();
                    if (inputNetStream4.readInt() != this.f5137am.size()) {
                        Log.e("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                    }
                    Iterator it3 = this.f5137am.iterator();
                    while (it3.hasNext()) {
                        C0770aj c0770aj2 = (C0770aj) it3.next();
                        long readLong3 = inputNetStream4.readLong();
                        long readLong4 = inputNetStream4.readLong();
                        if (readLong3 != readLong4) {
                            GameEngine.log(c0770aj2.f5224a + " Checksum [" + readInt5 + "]. server:" + readLong3 + " client:" + readLong4);
                        }
                    }
                    inputNetStream4.m1230d("checkList");
                    boolean readBoolean = inputNetStream4.readBoolean();
                    if (this.f5080bA >= readInt5) {
                        addDebugText("Not marking desync, already resynced before frame: " + this.f5080bA + "<=" + readInt5);
                        return;
                    }
                    if (!connection3.f5344u && readBoolean) {
                        connection3.desync_count++;
                    }
                    connection3.f5344u = readBoolean;
                    if (!readBoolean) {
                        if (this.f5099g) {
                            GameEngine.PrintLOG("checksum: client checksum match [" + readInt5 + "]");
                        }
                        connection3.f5346w++;
                        return;
                    }
                    GameEngine.PrintLOG("client:" + connection3.getPlayerName() + " desync [" + readInt5 + "]");
                    if (this.f5076ai && !this.f5077aj) {
                        reportDesync("pauseOnDesync is active, pausing");
                        this.f5077aj = true;
                        return;
                    }
                    return;
                } else if (this.f5099g) {
                    GameEngine.PrintLOG("checksum for:" + connection3.getPlayerName() + " frameMatch==false client:" + readInt6 + " server:[" + readInt5 + "]");
                    return;
                } else {
                    return;
                }
            case 35:
                InputNetStream stream = new InputNetStream(packet);
                stream.readByte();
                int readInt7 = stream.readInt();
                int readInt8 = stream.readInt();
                float readFloat = stream.readFloat();
                float readFloat2 = stream.readFloat();
                if (!this.isServer && readFloat < 0.1d) {
                    m1467a("resync packet with setCurrentStepRate:" + readFloat + " is too small", true);
                }
                Connection connection4 = packet.connection;
                if (connection4.f5342s) {
                    addDebugText("ignoring resync command");
                    return;
                }
                boolean readBoolean2 = stream.readBoolean();
                if (stream.readBoolean()) {
                    if (!this.isServer) {
                        addDebugText("we are not a server, but got a debug game save! skipping");
                        return;
                    } else {
                        m1459a(stream.m1232c("gameSave"), connection4);
                        return;
                    }
                }
                GameEngine.PrintLOG("Reloading from network save");
                if (readBoolean2 && !this.isServer) {
                    m1460a(false, true, false);
                }
                byte[] m1232c = stream.m1232c("gameSave");
                GameEngine.PrintLOG("Save size: " + m1232c.length);
                if (this.f5119l) {
                    m1459a(m1232c, connection4);
                }
                gameEngine.replayEngine.m2313a(m1232c, gameEngine.frameNumber, readInt7, readInt8, readFloat, readFloat2);
                InputNetStream inputNetStream5 = new InputNetStream(m1232c);
                gameEngine.m882a("Resyncing game from server...", true);
                gameEngine.f5862ca.m414a(inputNetStream5, true, true, true);
                gameEngine.m908V();
                this.f5057aG++;
                gameEngine.frameNumber = readInt7;
                gameEngine.f5845by = readInt8;
                this.f5134W = readInt7 + 1;
                this.f5075af = false;
                this.f5135ag = this.f5134W + 1;
                this.f5079al = 0L;
                if (readFloat < 0.1d) {
                    m1467a("resync setCurrentStepRate:" + readFloat + " is too small", true);
                }
                m1499a(readFloat, "rsync");
                this.f5129J = readFloat2;
                return;
            default:
                addDebugText("we did not handle packet:" + packet.type);
                return;
        }
    }

    /* renamed from: b */
    public synchronized boolean m1427b(Packet packet) {
        Connection conn;
        if (this.isServer && (conn = packet.connection) != null && !conn.f5338o && packet.type != 105 && packet.type != 110 && packet.type != 111 && packet.type != 108 && packet.type != 160) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public synchronized void m1415c(Packet packet) {
        int i;
        String m1224j;
        GameEngine game = GameEngine.getInstance();
        if (m1427b(packet)) {
            addDebugText("filtered packet (type:" + packet.type + ")");
            return;
        }
        switch (packet.type) {
            case 105:
                addDebugText("got PACKET_GET_SERVER_INFO");
                if (!this.isServer) {
                    addDebugText("we are not a server! skipping");
                    return;
                }
                return;
            case 106:
                if (this.isServer) {
                    addDebugText("we are a server! we don't follow orders");
                    return;
                }
                InputNetStream stream = new InputNetStream(packet);
                Connection connection = packet.connection;
                stream.readString();
                stream.readInt();
                this.setup.currentType = (mapType) stream.readEnum(mapType.class);
                this.setup.mapFileName = stream.readString();
                this.setup.startingCreditsLev = stream.readInt();
                this.setup.fogMode = stream.readInt();
                this.setup.revealedMap = stream.readBoolean();
                this.setup.aiDifficulty = stream.readInt();
                byte readByte = stream.readByte();
                this.f5041G = stream.readBoolean();
                this.f5042H = stream.readBoolean();
                this.f5059aK = true;
                if (readByte >= 1) {
                    this.f5155aL = stream.readInt();
                    this.f5156aM = stream.readInt();
                }
                if (readByte >= 2) {
                    this.setup.startingUnits = stream.readInt();
                    this.setup.incomeMultiplier = stream.readFloat();
                    this.setup.noNukes = stream.readBoolean();
                    this.setup.f5214j = stream.readBoolean();
                }
                if (readByte >= 3 && stream.readBoolean()) {
                    try {
                        CustomUnitMetadata.m3120a(stream);
                        this.f5123x = true;
                    } catch (C0384ba e) {
                        disconnect("Missing unit:" + e.getMessage() + " d:" + e.f2471a);
                        m1423b("Server sync mismatch", e.getMessage());
                        if (!GameEngine.isPC()) {
                            game.alertA(e.getMessage());
                        }
                        game.m830d("Server sync mismatch", e.getMessage());
                        return;
                    }
                }
                if (readByte >= 4) {
                    this.setup.sharedControl = stream.readBoolean();
                }
                if (readByte >= 5) {
                    this.setup.teamLocked = stream.readBoolean();
                }
                if (readByte >= 6) {
                    this.setup.f5217n = stream.readBoolean();
                }
                if (readByte >= 7) {
                    this.setup.allowSpectators = stream.readBoolean();
                    this.setup.lockedRoom = stream.readBoolean();
                }
                if (readByte >= 8) {
                    this.setup.randomSeed = stream.readInt();
                }
                MultiplayerBattleroomActivity.updateUI();
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
                addDebugText("we did not handle packet:" + packet.type);
                return;
            case 108:
                Connection connection2 = packet.connection;
                InputNetStream inputNetStream = new InputNetStream(packet);
                long readLong = inputNetStream.readLong();
                inputNetStream.readByte();
                OutputNetStream outputNetStream = new OutputNetStream();
                outputNetStream.writeLong(readLong);
                outputNetStream.writeByte(1);
                int mo852b = game.mo852b();
                if (mo852b > 130) {
                    mo852b = 130;
                }
                outputNetStream.writeByte(mo852b);
                m1476a(connection2, outputNetStream.createPacket(109));
                return;
            case 109:
                if (!this.isServer) {
                    addDebugText("we are not a server! skipping");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Connection connection3 = packet.connection;
                InputNetStream inputNetStream2 = new InputNetStream(packet);
                long readLong2 = inputNetStream2.readLong();
                byte b = 0;
                if (inputNetStream2.readByte() >= 1) {
                    b = inputNetStream2.readByte();
                }
                long conn = currentTimeMillis - readLong2;
                int i2 = (int) conn;
                connection3.f5353z = i2;
                connection3.f5354A = currentTimeMillis;
                if (connection3.player != null) {
                    connection3.player.f1302T = i2;
                    connection3.player.nowTime_ms = currentTimeMillis;
                    connection3.player.f1301S = b;
                }
                if (connection3.f5339p && this.isServer && this.f5039D && this.f5111z != null) {
                    this.f5111z.f1302T = i2;
                    this.f5111z.nowTime_ms = currentTimeMillis;
                }
                if (!this.gameHasStarted) {
                    MultiplayerBattleroomActivity.updateUI();
                    return;
                }
                return;
            case 110:
                addDebugText("got REGISTER_CONNECTION");
                if (!this.isServer) {
                    addDebugText("we are not a server! skipping");
                    return;
                }
                InputNetStream stream2 = new InputNetStream(packet);
                Connection connection4 = packet.connection;
                stream2.readString();
                int readInt = stream2.readInt();
                int clientVersionInt = stream2.readInt();
                int readInt2 = stream2.readInt();
                String username = stream2.readString();
                String m1224j2 = stream2.m1224j();
                String str = null;
                connection4.f5357D = clientVersionInt;
                if (readInt >= 1) {
                    connection4.f5316K = stream2.readString();
                }
                if (readInt >= 2) {
                    str = stream2.readString();
                }
                int i3 = -1;
                if (readInt >= 3) {
                    i3 = stream2.readInt();
                }
                String str2 = "MISSING";
                if (readInt >= 4) {
                    str2 = stream2.readString();
                }
                String str3 = VariableScope.nullOrMissingString;
                if (readInt >= 5) {
                    str3 = stream2.readString();
                }
                if (username.length() > 20) {
                    sendKick(connection4, "Your username is too long");
                    connection4.writeStringPkg("kicked");
                    return;
                }
                String filterChar = filterChar(username);
                if (filterChar.length() < 2) {
                    sendKick(connection4, "Your username is too short");
                    connection4.writeStringPkg("kicked");
                    return;
                }
                Player player = null;
                if (str != null) {
                    player = Team.findExistingPlayer(str);
                    if (player != null) {
                        addDebugText("Existing player: " + player.teamID + " - " + player.playerName);
                    }
                }
                String m1530a = this.f5117d.m1530a(connection4, filterChar, clientVersionInt, readInt2, connection4.f5316K, player);
                if (m1530a != null) {
                    sendKick(connection4, m1530a);
                    connection4.writeStringPkg("kicked");
                    return;
                } else if (clientVersionInt < this.serverVersionInt && !this.isChatRoom) {
                    sendKick(connection4, "Game is out of date, please update");
                    connection4.writeStringPkg("kicked");
                    return;
                } else if (clientVersionInt > this.serverVersionInt && !this.isChatRoom) {
                    sendKick(connection4, "Your client is newer then the server");
                    connection4.writeStringPkg("kicked");
                    return;
                } else if (!this.isChatRoom && i3 != game.mo798v()) {
                    GameEngine.PrintLOG("New Player kicked: Unit checksum mismatch: clientUnitsChecksum=" + i3 + " game.getAllUnitsChecksum():" + game.mo798v());
                    sendKick(connection4, "Your core units are different to the server's core units. Game can not be synchronized");
                    connection4.writeStringPkg("kicked");
                    return;
                } else {
                    if (!this.isChatRoom) {
                        String m1388g = m1388g(connection4.f5317L);
                        if (!m1388g.equals(str2)) {
                            GameEngine.PrintLOG("New Player kicked: Integrity Check Failed: expectedResponse=" + m1388g + " clientResponse=" + str2);
                            sendKick(connection4, "Your 'Rusted Warfare' client is different to the server. Game can not be synchronized.");
                            connection4.writeStringPkg("kicked");
                            return;
                        }
                    }
                    if (!this.gameHasStarted && this.setup.lockedRoom) {
                        sendKick(connection4, "Room is locked. New players cannot join this server.");
                        connection4.writeStringPkg("kicked");
                        return;
                    } else if (this.gameHasStarted && player == null && !this.f5108s) {
                        sendKick(connection4, "A game has already been started on this server");
                        connection4.writeStringPkg("kicked");
                        return;
                    } else if (this.f5104n != null && player == null && !CommonUtils.getEncode_Zra_SHA256(this.f5104n).equals(m1224j2)) {
                        if (m1224j2 == null) {
                            GameEngine.log("processSystemPacket", "Player tried to join but needs a password");
                        } else {
                            GameEngine.log("processSystemPacket", "Player tried to join but had an incorrect password");
                        }
                        sendIncorrectPassword(connection4);
                        return;
                    } else {
                        if (!m1382h(this.f5133V).equals(str3)) {
                            connection4.PrintPlayerLOG("no extra");
                            connection4.f5318M = true;
                        }
                        if (connection4.player == null) {
                            synchronized (this.f5175bJ) {
                                if (player == null) {
                                    i = Team.nextFreeSlot();
                                } else {
                                    i = player.teamID;
                                }
                                if (i == -1 && !this.isChatRoom) {
                                    sendKick(connection4, "No free slots on server");
                                    connection4.writeStringPkg("no free slots");
                                    return;
                                }
                                String mo398a = this.f5117d.mo398a(connection4, filterChar);
                                if (mo398a != null) {
                                    sendKick(connection4, mo398a);
                                    connection4.writeStringPkg("kicked");
                                } else {
                                    C0776ao.m1330a(connection4);
                                    if (!this.isChatRoom && connection4.f5319N) {
                                        sendKick(connection4, VariableScope.nullOrMissingString);
                                        connection4.writeStringPkg("kicked");
                                        return;
                                    }
                                    String str4 = null;
                                    if (player != null) {
                                        connection4.player = player;
                                        String str5 = VariableScope.nullOrMissingString;
                                        if (this.gameHasStarted) {
                                            if (player.m3945b()) {
                                                str5 = " (Spectator)";
                                            } else {
                                                str5 = " (Team " + player.getTeam() + ")";
                                            }
                                        }
                                        sendSystemMessage("'" + connection4.player.playerName + "' reconnected. " + str5);
                                        connection4.f5345v = true;
                                        str4 = player.playerName;
                                        player.f1295M = connection4.f5336m;
                                    } else {
                                        if (this.isChatRoom && i == -1) {
                                            connection4.player = new Player(-3);
                                        } else {
                                            connection4.player = new Player(i);
                                            connection4.player.allyGroup = i % 2;
                                        }
                                        if (this.gameHasStarted && this.f5108s) {
                                            connection4.f5345v = true;
                                        }
                                    }
                                    if (player == null && filterChar != null) {
                                        ArrayList m1440as = m1440as();
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < 10) {
                                                boolean z = false;
                                                String str6 = filterChar;
                                                if (i4 > 0) {
                                                    str6 = str6 + "(" + i4 + ")";
                                                }
                                                Iterator it = m1440as.iterator();
                                                while (it.hasNext()) {
                                                    if (str6.equalsIgnoreCase(((Team) it.next()).playerName)) {
                                                        z = true;
                                                    }
                                                }
                                                if (z) {
                                                    i4++;
                                                } else {
                                                    filterChar = str6;
                                                }
                                            }
                                        }
                                    }
                                    connection4.player.playerName = filterChar;
                                    connection4.player.f1294L = str;
                                    connection4.player.f1295M = connection4.f5336m;
                                    connection4.f5357D = clientVersionInt;
                                    GameEngine.log("processSystemPacket", "New player: " + filterChar + ", networkVersion:" + connection4.f5357D + " existing:" + (player != null));
                                    connection4.f5338o = true;
                                    if (player == null) {
                                        this.f5117d.m1533a(connection4.player);
                                    }
                                    MultiplayerBattleroomActivity.updateUI();
                                    m1406d(connection4);
                                    m1426b(connection4);
                                    this.f5117d.mo387c(connection4, filterChar, str4);
                                    if ((player != null || this.f5108s) && this.gameHasStarted) {
                                        m1474a(connection4, true);
                                    }
                                }
                                return;
                            }
                        }
                        GameEngine.log("processSystemPacket", "This connection already has a player");
                        return;
                    }
                }
            case 111:
                InputNetStream inputNetStream3 = new InputNetStream(packet);
                Connection connection5 = packet.connection;
                String str7 = null;
                try {
                    str7 = inputNetStream3.readString();
                } catch (IOException packet2) {
                    GameEngine.LogThrowable("Error reading disconnect reason", (Throwable) packet2);
                }
                addDebugText("Got a disconnect packet:" + str7);
                if (connection5 != null) {
                    connection5.m1279a(false, false);
                }
                if (!this.isServer) {
                }
                return;
            case 112:
                if (!this.isServer) {
                    addDebugText("we are not a server! skipping");
                    return;
                }
                Connection connection6 = packet.connection;
                InputNetStream inputNetStream4 = new InputNetStream(packet);
                connection6.f5355B = inputNetStream4.readBoolean();
                connection6.f5356C = inputNetStream4.readBoolean();
                return;
            case 113:
                if (this.isServer) {
                    addDebugText("we are a server! skipping: " + packet.type);
                    return;
                } else {
                    m1487a(f5116bL);
                    return;
                }
            case 115:
                if (this.isServer) {
                    addDebugText("we are a server! we don't follow orders");
                    return;
                }
                InputNetStream inputNetStream5 = new InputNetStream(packet);
                inputNetStream5.setStreamVersion(packet.connection.f5357D);
                Connection connection7 = packet.connection;
                int readInt3 = inputNetStream5.readInt();
                Team team = null;
                int i5 = 8;
                boolean z2 = false;
                if (inputNetStream5.getStreamVersion() >= 90) {
                    boolean z3 = false;
                    if (inputNetStream5.getStreamVersion() >= 141) {
                        z3 = true;
                        z2 = inputNetStream5.readBoolean();
                    }
                    i5 = inputNetStream5.readInt();
                    Team.m3942b(i5, false);
                    inputNetStream5.m1240a("teams", z3);
                    if (i5 > Team.playerNumMax) {
                        throw new IOException("Cannot load:" + i5 + " teams");
                    }
                } else if (this.gameHasStarted) {
                    reportDesync("Warning old team system used in started game, stream version:" + inputNetStream5.getStreamVersion());
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    Player team2 = Team.getTeam(i6);
                    if (!inputNetStream5.readBoolean()) {
                        if (team2 != null) {
                            if (this.gameHasStarted) {
                                reportDesync("Warning team:" + i6 + " removed while game is running");
                            }
                            team2.removeSelfFromList();
                        }
                    } else {
                        inputNetStream5.readInt();
                        if (team2 == null) {
                            if (this.gameHasStarted) {
                                reportDesync("Warning team:" + i6 + " added while game is running");
                            }
                            if (!this.isServer && (team2 instanceof AI)) {
                                reportDesync("Warning we are a client with an AI team");
                            }
                            team2 = new Player(i6);
                        }
                        if (z2) {
                            team2.m3955a(inputNetStream5);
                        } else {
                            team2.m3954a(inputNetStream5, this.gameHasStarted);
                        }
                    }
                    if (team2 != null && team2.teamID == readInt3) {
                        team = team2;
                    }
                }
                if (inputNetStream5.getStreamVersion() >= 90) {
                    inputNetStream5.m1230d("teams");
                }
                this.f5111z = team;
                this.setup.fogMode = inputNetStream5.readInt();
                this.setup.startingCreditsLev = inputNetStream5.readInt();
                this.setup.revealedMap = inputNetStream5.readBoolean();
                this.setup.aiDifficulty = inputNetStream5.readInt();
                byte readByte2 = inputNetStream5.readByte();
                this.f5155aL = inputNetStream5.readInt();
                this.f5156aM = inputNetStream5.readInt();
                if (readByte2 >= 2) {
                    this.setup.startingUnits = inputNetStream5.readInt();
                    this.setup.incomeMultiplier = inputNetStream5.readFloat();
                    this.setup.noNukes = inputNetStream5.readBoolean();
                    this.setup.f5214j = inputNetStream5.readBoolean();
                }
                if (readByte2 >= 3 && inputNetStream5.readBoolean()) {
                    try {
                        CustomUnitMetadata.m3120a(inputNetStream5);
                        this.f5123x = true;
                    } catch (C0384ba e2) {
                        disconnect("Missing unit:" + e2.getMessage() + " d:" + e2.f2471a);
                        m1423b("Connection Failed", e2.getMessage());
                        if (!GameEngine.isPC()) {
                            game.alertA(e2.getMessage());
                        }
                        game.m830d("Connection Failed", e2.getMessage());
                        return;
                    }
                }
                if (readByte2 >= 4) {
                    this.setup.sharedControl = inputNetStream5.readBoolean();
                }
                if (readByte2 >= 5) {
                    this.isGamePaused = inputNetStream5.readBoolean();
                }
                MultiplayerBattleroomActivity.updateUI();
                return;
            case 116:
                if (this.isServer) {
                    addDebugText("we are a server! we don't follow orders");
                    return;
                }
                InputNetStream inputNetStream6 = new InputNetStream(packet);
                Connection connection8 = packet.connection;
                inputNetStream6.readInt();
                boolean readBoolean = inputNetStream6.readBoolean();
                if (readBoolean && !this.f5094bq) {
                    this.f5094bq = readBoolean;
                    return;
                }
                return;
            case 117:
                Connection connection9 = packet.connection;
                if (this.isServer && !connection9.f5339p) {
                    addDebugText("we are a server! skipping: " + packet.type);
                    return;
                }
                InputNetStream inputNetStream7 = new InputNetStream(packet);
                inputNetStream7.readByte();
                int readInt4 = inputNetStream7.readInt();
                String readString = inputNetStream7.readString();
                C0761ae c0761ae = new C0761ae();
                c0761ae.f5197d = true;
                c0761ae.f5196c = readInt4;
                c0761ae.f5195b = readString;
                m1487a(c0761ae);
                return;
            case 118:
                return;
            case 120:
                if (this.isServer) {
                    addDebugText("error, we are a server but got: PACKET_START_GAME");
                    return;
                }
                InputNetStream inputNetStream8 = new InputNetStream(packet);
                inputNetStream8.readByte();
                this.setup.currentType = (mapType) inputNetStream8.readEnum(mapType.class);
                if (this.setup.currentType == mapType.f5222c) {
                    this.f5060aP = inputNetStream8.m1213u();
                } else if (this.setup.currentType == mapType.f5221b) {
                    this.f5061aQ = inputNetStream8.m1213u();
                }
                this.mapFilePath = inputNetStream8.readString();
                startGame();
                return;
            case 122:
                if (this.isServer) {
                    addDebugText("error, we are a server but got: PACKET_RETURN_TO_BATTLEROOM");
                    return;
                } else {
                    m1436aw();
                    return;
                }
            case 140:
                if (!this.isServer) {
                    addDebugText("we are not a server! skipping");
                    return;
                }
                Connection connection10 = packet.connection;
                InputNetStream inputNetStream9 = new InputNetStream(packet);
                Player player2 = connection10.player;
                if (player2 == null) {
                    if (connection10.f5339p) {
                        addDebugText("Allowing message from non player on forwarding connection");
                        player2 = this.f5180bu;
                    } else {
                        addDebugText("player is null for message, skipping");
                        return;
                    }
                }
                String readString2 = inputNetStream9.readString();
                inputNetStream9.readByte();
                if (readString2.length() > 250) {
                    readString2 = readString2.substring(0, 250);
                }
                if (readString2.contains("\n")) {
                    readString2 = readString2.replace("\n", "?");
                }
                String m1360o = m1360o(readString2);
                if (this.f5117d.mo397a(connection10, player2.playerName, m1360o)) {
                    if (this.f5159aR.m1538a(connection10, 60000) > this.f5118h) {
                        if (CommonUtils.m1732a(connection10.f5331g, System.nanoTime()) > 60000) {
                            connection10.f5331g = System.nanoTime();
                            sendSystemMessage("Anti-spam: Too many messages from '" + connection10.getPlayerName() + "'");
                        }
                        if (this.f5099g) {
                            GameEngine.PrintLOG("extraDebug:" + m1360o);
                            return;
                        }
                        return;
                    }
                    m1478a(connection10, player2, player2.playerName, m1360o);
                    this.f5117d.mo390b(connection10, player2.playerName, m1360o);
                    m1425b(connection10, player2, player2.playerName, m1360o);
                    return;
                }
                return;
            case 141:
                if (this.isServer && !packet.connection.f5339p) {
                    addDebugText("error, we are a server but got: PACKET_RECEIVE_CHAT_FROM_SERVER");
                    return;
                }
                InputNetStream inputNetStream10 = new InputNetStream(packet);
                String readString3 = inputNetStream10.readString();
                byte readByte3 = inputNetStream10.readByte();
                String m1224j3 = inputNetStream10.m1224j();
                inputNetStream10.readInt();
                int i7 = -1;
                if (readByte3 >= 3) {
                    i7 = inputNetStream10.readInt();
                }
                m1479a((Connection) null, i7, m1224j3, readString3);
                return;
            case 150:
                if (this.isServer) {
                    addDebugText("error, we are a server but got: PACKET_SEND_KICK");
                    return;
                }
                String m1601c = LangLocale.m1601c(new InputNetStream(packet).readString());
                StringBuilder Multicast = new StringBuilder();
                addDebugText(Multicast.append("we got kicked, reason:").append(m1601c).toString());
                disconnect("I was kicked");
                m1423b("Kicked", "Kicked: " + m1601c);
                game.m830d("Kicked", "Kicked: " + m1601c);
                game.alertA("Kicked: " + m1601c);
                return;
            case 151:
                Connection connection11 = packet.connection;
                if (this.isServer && !connection11.f5339p) {
                    addDebugText("error, we are a server but got: 151");
                    return;
                }
                long tookTime = C0651bl.getTookTime();
                InputNetStream inputNetStream11 = new InputNetStream(packet);
                int readInt5 = inputNetStream11.readInt();
                int readInt6 = inputNetStream11.readInt();
                if (inputNetStream11.readBoolean()) {
                    C0776ao.f5273i = inputNetStream11.readInt();
                }
                if (inputNetStream11.readBoolean()) {
                    C0776ao.f5274j = inputNetStream11.readInt();
                }
                String str8 = VariableScope.nullOrMissingString;
                if (readInt6 == 0) {
                    str8 = VariableScope.nullOrMissingString + C0776ao.f5273i;
                }
                if (readInt6 == 1) {
                    str8 = VariableScope.nullOrMissingString + C0776ao.f5274j;
                }
                if (readInt6 == 2) {
                    str8 = m1388g(C0776ao.f5273i);
                }
                if (readInt6 == 3) {
                    str8 = CommonUtils.m1666c(C0776ao.f5273i + "|" + C0776ao.f5274j);
                }
                if (readInt6 == 4) {
                    str8 = CommonUtils.m1666c(C0776ao.f5273i + "|" + C0776ao.f5274j);
                }
                if (readInt6 == 5 || readInt6 == 6) {
                    String readString4 = inputNetStream11.readString();
                    String readString5 = inputNetStream11.readString();
                    int readInt7 = inputNetStream11.readInt();
                    if (readInt6 == 6) {
                        readString5 = readString5 + C0776ao.f5273i;
                    }
                    if (readInt7 > 10000000) {
                        str8 = "max";
                    } else {
                        str8 = "-1";
                        int i8 = 0;
                        while (true) {
                            if (i8 <= readInt7) {
                                if (!CommonUtils.m1666c(readString5 + i8).equals(readString4)) {
                                    i8++;
                                } else {
                                    str8 = VariableScope.nullOrMissingString + i8;
                                }
                            }
                        }
                    }
                }
                if (readInt6 == 7) {
                    String readString6 = inputNetStream11.readString();
                    int readInt8 = inputNetStream11.readInt();
                    if (readInt8 > 10000) {
                        str8 = "max";
                    } else {
                        str8 = VariableScope.nullOrMissingString;
                        for (int i9 = 0; i9 < readInt8; i9++) {
                            str8 = str8 + readString6;
                        }
                    }
                }
                float m2277a = C0651bl.m2277a(tookTime);
                OutputNetStream outputNetStream2 = new OutputNetStream();
                outputNetStream2.writeInt(readInt5);
                outputNetStream2.writeInt(readInt6);
                outputNetStream2.writeString(str8);
                outputNetStream2.writeFloat(m2277a);
                m1476a(connection11, outputNetStream2.createPacket(152));
                return;
            case 160:
                InputNetStream inputNetStream12 = new InputNetStream(packet);
                Connection connection12 = packet.connection;
                inputNetStream12.readString();
                int readInt9 = inputNetStream12.readInt();
                inputNetStream12.readInt();
                if (readInt9 >= 1) {
                    inputNetStream12.readInt();
                }
                if (connection12.f5333i) {
                    GameEngine.PrintLOG("steam: request info packet");
                }
                if (readInt9 >= 2 && (m1224j = inputNetStream12.m1224j()) != null) {
                    connection12.PrintPlayerLOG("Using query string: " + m1224j);
                    connection12.f5337n = m1224j;
                }
                if (readInt9 >= 3) {
                    inputNetStream12.readString();
                }
                if (readInt9 >= 4) {
                    inputNetStream12.readString();
                    String readString7 = inputNetStream12.readString();
                    if (GameEngine.m858at()) {
                        connection12.PrintPlayerLOG("Misc: " + readString7);
                    }
                }
                m1391f(connection12);
                return;
            case 161:
                if (this.isServer) {
                    addDebugText("we are a server! we don't PREREGISTER_INFO");
                    return;
                }
                InputNetStream stream3 = new InputNetStream(packet);
                Connection con = packet.connection;
                if (con.f5333i) {
                    GameEngine.PrintLOG("steam: got info packet");
                }
                stream3.readString();
                int readInt10 = stream3.readInt();
                int readInt11 = stream3.readInt();
                stream3.readInt();
                stream3.readString();
                this.serverUUID = stream3.readString();
                con.f5357D = readInt11;
                if (readInt10 >= 1) {
                    this.f5130S = stream3.readInt();
                }
                if (readInt10 >= 2) {
                    this.f5131T = stream3.readInt();
                    this.f5132U = stream3.readInt();
                }
                if (this.f5174bH) {
                    addDebugText("PACKET_SEND_PREREGISTER_INFO: Register connection has already been sent (resending)");
                }
                m1385g(con);
                return;
            case 163:
                if (this.isServer) {
                    addDebugText("we are already a server");
                    return;
                }
                InputNetStream inputStream = new InputNetStream(packet);
                inputStream.readByte();
                int relayVersion = inputStream.readInt();
                inputStream.readInt();
                inputStream.m1224j();
                addDebugText("Relay version: " + relayVersion);
                return;
            case 170:
                addDebugText("Got 'become server' packet");
                if (this.isServer) {
                    addDebugText("we are already a server");
                    return;
                }
                Connection connection13 = packet.connection;
                InputNetStream stream4 = new InputNetStream(packet);
                byte readByte4 = stream4.readByte();
                boolean readBoolean2 = stream4.readBoolean();
                boolean readBoolean3 = stream4.readBoolean();
                String networkServerId = stream4.m1224j();
                boolean readBoolean4 = stream4.readBoolean();
                boolean readBoolean5 = stream4.readBoolean();
                String m1224j4 = stream4.m1224j();
                boolean Multicast2 = false;
                if (readByte4 >= 1) {
                    Multicast2 = stream4.readBoolean();
                }
                String str9 = null;
                if (readByte4 >= 2) {
                    str9 = stream4.m1224j();
                }
                addDebugText("Multicast:" + Multicast2);
                connection13.f5340q = Multicast2;
                if (readBoolean2) {
                    connection13.f5339p = true;
                }
                if (readBoolean3) {
                    connection13.f5341r = true;
                }
                this.f5039D = true;
                this.f5040E = m1224j4;
                game.networkEngine.f5104n = null;
                game.networkEngine.mods = readBoolean4;
                game.networkEngine.f5107q = readBoolean5;
                m1411c(false);
                if (str9 != null) {
                    if (this.f5111z != null) {
                        this.f5111z.f1295M = str9;
                    } else {
                        GameEngine.PrintLOG("Become server: No local team");
                    }
                }
                if (game.networkEngine.f5107q) {
                }
                if (networkServerId != null) {
                    game.curSettings.networkServerId = networkServerId;
                }
                if (game.frameNumber > 60) {
                    this.f5053Z = true;
                }
                if (!this.f5123x && !this.gameHasStarted) {
                    GameEngine.PrintLOG("enableAllCustomUnitsPossible mods:" + this.mods);
                    CustomUnitMetadataFactory.m3544b(this.mods);
                    this.f5123x = true;
                    return;
                }
                return;
            case 172:
                Connection connection14 = packet.connection;
                if (!connection14.f5339p) {
                    addDebugText("forwarding not allowed on this connection");
                    return;
                }
                addDebugText("got FORWARD_CLIENT_ADD");
                InputNetStream inputNetStream13 = new InputNetStream(packet);
                inputNetStream13.readByte();
                int readInt12 = inputNetStream13.readInt();
                String readString8 = inputNetStream13.readString();
                String m1224j5 = inputNetStream13.m1224j();
                if (m1481a(connection14, readInt12) != null) {
                    addDebugText("Not adding client:" + readInt12 + " already exists");
                    return;
                } else if (m1480a(connection14, readInt12, readString8) != null && m1224j5 != null) {
                    Player m3931b = Team.m3931b(readString8);
                    if (m3931b == null) {
                        addDebugText("PACKET_FORWARD_CLIENT_ADD: Failed to find existing player with id:" + readString8);
                        Iterator it2 = Team.m3929c().iterator();
                        while (it2.hasNext()) {
                            Team team3 = (Team) it2.next();
                            if (team3 != null) {
                                addDebugText("option: " + team3.playerName + " - " + team3.f1295M + " - localPlayer:" + (this.f5111z == team3));
                            }
                        }
                        return;
                    }
                    m3931b.f1294L = m1224j5;
                    return;
                } else {
                    return;
                }
            case 173:
                Connection connection15 = packet.connection;
                if (!connection15.f5339p) {
                    addDebugText("forwarding not allowed on this connection");
                    return;
                }
                addDebugText("got FORWARD_CLIENT_REMOVE");
                InputNetStream inputNetStream14 = new InputNetStream(packet);
                inputNetStream14.readByte();
                Connection m1481a = m1481a(connection15, inputNetStream14.readInt());
                if (m1481a != null) {
                    m1379h(m1481a);
                    return;
                }
                return;
            case 174:
                Connection connection16 = packet.connection;
                if (!connection16.f5339p) {
                    addDebugText("forwarding not allowed on this connection");
                    return;
                }
                InputNetStream inputNetStream15 = new InputNetStream(packet);
                int readInt13 = inputNetStream15.readInt();
                byte[] m1214t = inputNetStream15.m1214t();
                Connection m1481a2 = m1481a(connection16, readInt13);
                if (m1481a2 == null) {
                    addDebugText("PACKET_FORWARD_CLIENT_FROM failed, cannot find client");
                    return;
                } else if (!(m1481a2.socket instanceof C0791h)) {
                    addDebugText("PACKET_FORWARD_CLIENT_FROM failed, socket is wrong type");
                    return;
                } else {
                    ((C0791h) m1481a2.socket).f5399d.m1247a(m1214t);
                    return;
                }
            case 175:
                addDebugText("got PACKET_FORWARD_CLIENT_TO");
                return;
            case 176:
                addDebugText("got PACKET_FORWARD_CLIENT_TO_REPEATED");
                return;
            case SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_INPUT /* 178 */:
                addDebugText("got PACKET_RECONNECT_TO");
                Connection connection17 = packet.connection;
                if (this.isServer && !connection17.f5339p) {
                    addDebugText("we are a server, ");
                    return;
                }
                InputNetStream inputNetStream16 = new InputNetStream(packet);
                inputNetStream16.readByte();
                inputNetStream16.readInt();
                boolean readBoolean6 = inputNetStream16.readBoolean();
                int readInt14 = inputNetStream16.readInt();
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < readInt14; i10++) {
                    arrayList.add(inputNetStream16.readString());
                }
                m1464a(arrayList, readBoolean6);
                return;
        }
    }

    /* renamed from: o */
    private String m1360o(String str) {
        char[] charArray;
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

    /* renamed from: G */
    public void m1521G() {
        m1423b((String) null, (String) null);
    }

    /* renamed from: b */
    public void m1423b(String str, String str2) {
        MultiplayerBattleroomActivity.m4399a(str, str2);
        this.f5117d.mo386d();
    }

    /* renamed from: H */
    public synchronized void m1520H() {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5338o) {
                m1426b(connection);
            }
        }
    }

    /* renamed from: b */
    public synchronized void m1426b(Connection con) {
        if (!this.isServer) {
            addDebugText("sendServerInfo: we are not a server!");
            return;
        }
        OutputNetStream stream = new OutputNetStream();
        try {
            stream.writeString("com.corrodinggames.rts");
            stream.writeInt(this.serverVersionInt);
            stream.writeEnum(this.setup.currentType);
            if (this.isChatRoom) {
                stream.writeString("<CHAT ONLY>");
            } else {
                stream.writeString(this.setup.mapFileName == null ? "<NULL>" : C0670a.m2152n(this.setup.mapFileName));
            }
            stream.writeInt(this.setup.startingCreditsLev);
            stream.writeInt(this.setup.fogMode);
            stream.writeBoolean(this.setup.revealedMap);
            stream.writeInt(this.setup.aiDifficulty);
            stream.writeByte(8);
            stream.writeBoolean(this.f5117d.m1532a(con));
            stream.writeBoolean(this.f5117d.m1529b(con));
            stream.writeInt(this.f5155aL);
            stream.writeInt(this.f5156aM);
            stream.writeInt(this.setup.startingUnits);
            stream.writeFloat(this.setup.incomeMultiplier);
            stream.writeBoolean(this.setup.noNukes);
            stream.writeBoolean(this.setup.f5214j);
            if (this.isChatRoom) {
                stream.writeBoolean(false);
            } else {
                stream.writeBoolean(true);
                CustomUnitMetadata.m3121a(stream);
            }
            stream.writeBoolean(this.setup.sharedControl);
            stream.writeBoolean(this.setup.teamLocked);
            stream.writeBoolean(this.setup.f5217n);
            stream.writeBoolean(this.setup.allowSpectators);
            stream.writeBoolean(this.setup.lockedRoom);
            stream.writeInt(this.setup.randomSeed);
            m1476a(con, stream.createPacket(106));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public synchronized void sendKick(Connection con, String str) {
        if (!this.isServer) {
            addDebugText("sendKick: we are not a server!");
            return;
        }
        addDebugText("kicking client reason:" + str);
        OutputNetStream stream = new OutputNetStream();
        try {
            stream.writeString(str);
            m1476a(con, stream.createPacket(150));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public synchronized void sendIncorrectPassword(Connection con) {
        if (!this.isServer) {
            addDebugText("sendIncorrectPassword: we are not a server!");
            return;
        }
        addDebugText("sendIncorrectPassword");
        OutputNetStream stream = new OutputNetStream();
        try {
            stream.writeInt(0);
            m1476a(con, stream.createPacket(113));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: I */
    public void m1519I() {
        if (this.isServer) {
            for (int i = 0; i < Team.MAX_TEAMS; i++) {
                Team team = Team.getTeam(i);
                if (team != null) {
                    if (this.isChatRoom) {
                        team.f1308Z = 0;
                    } else if (team.m3945b()) {
                        team.f1308Z = 100;
                    } else {
                        team.f1308Z = team.allyGroup;
                    }
                    if (team.m3945b()) {
                        team.id = -1;
                    } else {
                        int m3975M = team.m3975M();
                        if (team.playerColor != null) {
                            m3975M = team.playerColor.intValue();
                        } else if (m1496a(m3975M, (Team) null)) {
                            m3975M = -1;
                        }
                        team.id = m3975M;
                    }
                }
            }
            for (int i2 = 0; i2 < Team.MAX_TEAMS; i2++) {
                Team team2 = Team.getTeam(i2);
                if (team2 != null && team2.id == -1 && !team2.m3945b()) {
                    team2.id = m1518J();
                }
            }
        }
    }

    /* renamed from: J */
    public int m1518J() {
        for (int i = 0; i < 10; i++) {
            if (!m1394f(i)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public boolean m1394f(int i) {
        for (int i2 = 0; i2 < Team.MAX_TEAMS; i2++) {
            Team team = Team.getTeam(i2);
            if (team != null && team.id == i && !team.m3945b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1496a(int i, Team team) {
        for (int i2 = 0; i2 < Team.MAX_TEAMS; i2++) {
            Team team2 = Team.getTeam(i2);
            if (team2 != null && team2 != team && team2.playerColor != null && team2.playerColor.intValue() == i && !team2.m3945b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public void m1517K() {
        if (this.isServer) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = GameEngine.getInstance().f5845by;
            if (this.f5111z != null && !this.f5039D) {
                this.f5111z.f1302T = -99;
                this.f5111z.nowTime_ms = currentTimeMillis;
            }
            m1519I();
            for (int i2 = 0; i2 < Team.playerNumMax; i2++) {
                Team team = Team.getTeam(i2);
                if (team != null) {
                    team.m3917c(this.f5111z == team);
                    if (!this.gameHasStarted) {
                    }
                    if (this.gameHasStarted && !this.f5126F && !team.f1333t) {
                        boolean z = false;
                        if (team.m3876w()) {
                            z = true;
                        }
                        long j = 60000;
                        if (team.f1305W > 180000) {
                            j = 160000;
                        }
                        boolean z2 = false;
                        if (this.f5053Z) {
                            if (team.f1304V == -1) {
                                team.f1304V = currentTimeMillis;
                                team.f1305W = i;
                            }
                            if ((this.f5077aj || this.isGamePaused) && !team.f1307Y) {
                                team.f1304V = currentTimeMillis;
                                team.f1305W = i;
                            }
                            if (team.f1304V + j < currentTimeMillis) {
                                z2 = true;
                            }
                        }
                        if (team.f1307Y != z2) {
                            team.f1307Y = z2;
                        }
                        if (z2) {
                            z = true;
                            if (!team.f1306X) {
                                if (!(team.f1286D || team.f1285C || team.f1289G || team.m3945b())) {
                                    team.f1306X = true;
                                }
                            }
                        }
                        if (team.f1289G != z) {
                            if (z && !team.f1286D && !team.f1285C && !team.f1288F && !team.m3945b()) {
                                String str = "-t [Sharing control due to disconnect]";
                                if (z2) {
                                    str = "-t [Sharing control due to afk]";
                                }
                                GameEngine.PrintLOG(team.playerName + " - " + str);
                                if (Team.m3963a(team.allyGroup, true) > 1) {
                                    m1478a((Connection) null, team, team.playerName, str);
                                }
                            }
                            team.f1289G = z;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: L */
    public void m1516L() {
        if (this.f5058aJ == 0) {
            this.f5058aJ = System.currentTimeMillis();
        }
    }

    /* renamed from: M */
    public void m1515M() {
        this.f5058aJ = 0L;
        m1406d((Connection) null);
    }

    /* renamed from: d */
    public void m1406d(Connection connection) {
        if (!this.isServer) {
            addDebugText("sendUpdatePlayer: we are not a server!");
            return;
        }
        m1517K();
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection2 = (Connection) it.next();
            if (connection2.f5338o) {
                OutputNetStream outputNetStream = new OutputNetStream(connection2.f5357D);
                try {
                    outputNetStream.writeInt(connection2.m1275c());
                    int i = Team.playerNumMax;
                    boolean z = false;
                    if (outputNetStream.getLastPingTimeReceived() >= 90) {
                        boolean z2 = false;
                        if (outputNetStream.getLastPingTimeReceived() >= 141) {
                            z2 = true;
                            if (this.gameHasStarted && connection2.f5321P) {
                                z = true;
                            }
                            outputNetStream.writeBoolean(z);
                        }
                        outputNetStream.writeInt(i);
                        outputNetStream.mo1258a("teams", z2);
                    } else {
                        i = 8;
                        if (!this.isChatRoom) {
                            addDebugText("sendUpdatePlayer: warning saving with lower team count");
                        }
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        Team team = Team.getTeam(i2);
                        outputNetStream.writeBoolean(team != null);
                        if (team != null) {
                            int i3 = 0;
                            if (team instanceof AI) {
                                i3 = 1;
                            }
                            outputNetStream.writeInt(i3);
                            if (z) {
                                team.m3920c(outputNetStream);
                            } else {
                                team.teamWriteOut(outputNetStream);
                            }
                        }
                    }
                    if (outputNetStream.getLastPingTimeReceived() >= 90) {
                        outputNetStream.endBlock("teams");
                    }
                    outputNetStream.writeInt(this.setup.fogMode);
                    outputNetStream.writeInt(this.setup.startingCreditsLev);
                    outputNetStream.writeBoolean(this.setup.revealedMap);
                    outputNetStream.writeInt(this.setup.aiDifficulty);
                    outputNetStream.writeByte(5);
                    outputNetStream.writeInt(this.f5155aL);
                    outputNetStream.writeInt(this.f5156aM);
                    outputNetStream.writeInt(this.setup.startingUnits);
                    outputNetStream.writeFloat(this.setup.incomeMultiplier);
                    outputNetStream.writeBoolean(this.setup.noNukes);
                    outputNetStream.writeBoolean(this.setup.f5214j);
                    outputNetStream.writeBoolean(false);
                    outputNetStream.writeBoolean(this.setup.sharedControl);
                    outputNetStream.writeBoolean(this.isGamePaused);
                    int i4 = -1;
                    if (connection == connection2 && connection2.f5357D <= 26) {
                        i4 = 1000;
                    }
                    connection2.f5321P = true;
                    m1476a(connection2, outputNetStream.createPacket_(115, i4));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: N */
    public synchronized boolean m1514N() {
        if (m1513O()) {
            this.f5106p = true;
            this.setup.fogMode = 0;
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public synchronized boolean m1513O() {
        if (this.networked) {
            disconnect("Started singleplayer");
        }
        GameEngine gameEngine = GameEngine.getInstance();
        m1361o();
        this.networked = true;
        this.isServer = true;
        this.f5126F = true;
        this.setup.currentType = gameEngine.m868aj();
        this.setup.mapFileName = gameEngine.m869ai();
        generateNewServerId();
        this.f5111z = gameEngine.playerTeam;
        MultiplayerBattleroomActivity.updateUI();
        this.f5103m = gameEngine.curSettings.networkPort;
        addDebugText("singleplayer server started");
        return true;
    }

    /* renamed from: b */
    public synchronized boolean m1421b(boolean z) {
        if (this.networked) {
            throw new RuntimeException("networking already started");
        }
        m1363n();
        this.networked = true;
        this.isServer = true;
        generateNewServerId();
        this.setup.randomSeed = CommonUtils.m1737a(1, 1000000000);
        GameEngine gameEngine = GameEngine.getInstance();
        m1411c(z);
        MultiplayerBattleroomActivity.updateUI();
        this.f5103m = gameEngine.curSettings.networkPort;
        SteamEngine.m718a().mo267i();
        this.f5063aT = new RunnableC0773am(this);
        try {
            this.f5063aT.m1333a(false);
            this.f5062aS = new Thread(this.f5063aT);
            this.f5062aS.setDaemon(true);
            this.f5062aS.start();
            if (1 != 0) {
                this.f5065aV = new RunnableC0773am(this);
                try {
                    this.f5065aV.m1333a(true);
                    this.f5064aU = new Thread(this.f5065aV);
                    this.f5064aU.start();
                } catch (IOException e) {
                    e.printStackTrace();
                    gameEngine.alert("Could not open udp port:" + this.f5103m + ", check this port is not in use or change the port in the game settings", 1);
                    disconnect("Could not open udp port");
                    return false;
                }
            }
            m1451ah();
            if (this.f5107q) {
                C0797n.m1192b();
            }
            this.f5089bk = null;
            if (f5115r) {
                C0797n.m1208a();
            }
            addDebugText("server started");
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            gameEngine.alert("Could not open tcp port:" + this.f5103m + ", check this port is not in use or change the port in the game settings", 1);
            disconnect("Could not open tcp port");
            return false;
        }
    }

    /* renamed from: c */
    public void m1411c(boolean z) {
        int i;
        this.isServer = true;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f5111z == null) {
            Player player = null;
            if (!z) {
                i = Team.nextFreeSlot();
                if (i == -1) {
                    throw new RuntimeException("playerId is -1 for server player");
                }
            } else {
                player = this.f5180bu;
                i = this.f5180bu.teamID;
            }
            if (player == null) {
                player = new Player(i);
                player.playerName = this.f5110y;
                gameEngine.playerTeam = player;
            }
            this.f5111z = player;
        }
        if (this.f5067aX == null) {
            GameEngine.PrintLOG("pingerTask starting");
            this.f5067aX = new C0780as(this);
            this.f5066aW = new Timer();
            this.f5066aW.schedule(this.f5067aX, 100L, 100L);
        } else {
            GameEngine.PrintLOG("pingerTask already active");
        }
        MultiplayerBattleroomActivity.updateUI();
    }

    /* renamed from: P */
    public boolean m1512P() {
        return GameEngine.getInstance().curSettings.udpInMultiplayer;
    }

    /* renamed from: a */
    public RunnableC0772al m1466a(String str, boolean z, Runnable runnable) {
        RunnableC0772al runnableC0772al = new RunnableC0772al(str, z, runnable);
        runnableC0772al.m1336b();
        return runnableC0772al;
    }

    /* renamed from: b */
    public static Socket m1422b(String str, boolean z) {
        C0017h c0017h;
        String str2;
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLOG("Connect to server: " + str + " (force tcp:" + z + ")");
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
                    gameEngine.networkEngine.f5104n = null;
                    final Object obj = new Object();
                    C0761ae c0761ae = new C0761ae() { // from class: com.corrodinggames.rts.gameFramework.h.ad.1
                        @Override // com.corrodinggames.rts.gameFramework.network.C0761ae
                        /* renamed from: a */
                        public void mo1346a(String str5) {
                            GameEngine gameEngine2 = GameEngine.getInstance();
                            GameEngine.PrintLOG("Entered password");
                            if (gameEngine2.networkEngine.isServer) {
                                GameEngine.PrintLOG_err("Cannot enter a password when we are a server");
                            } else {
                                gameEngine2.networkEngine.f5104n = str5;
                            }
                            synchronized (obj) {
                                obj.notify();
                            }
                        }

                        @Override // com.corrodinggames.rts.gameFramework.network.C0761ae
                        /* renamed from: a */
                        public void mo1347a() {
                            synchronized (obj) {
                                obj.notify();
                            }
                        }
                    };
                    GameEngine.PrintLOG("Asking for password..");
                    synchronized (obj) {
                        m1487a(c0761ae);
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (gameEngine.networkEngine.f5104n == null) {
                        GameEngine.log("No password entered");
                        throw new C0764ag();
                    }
                    GameEngine.PrintLOG("Password has been entered");
                }
                String str5 = null;
                if (parseBoolean) {
                    str5 = gameEngine.networkEngine.f5104n;
                    if (str5 == null) {
                        throw new IOException("This server requires a password but no password was provided");
                    }
                }
                final Object obj2 = new Object();
                C0808w c0808w = new C0808w() { // from class: com.corrodinggames.rts.gameFramework.h.ad.2
                    @Override // com.corrodinggames.rts.gameFramework.network.C0808w
                    /* renamed from: a */
                    public void mo1181a(String str6) {
                        super.mo1181a(str6);
                        synchronized (obj2) {
                            obj2.notify();
                        }
                    }

                    @Override // com.corrodinggames.rts.gameFramework.network.C0808w
                    /* renamed from: a */
                    public void mo1180a(String str6, EnumC0809x enumC0809x, Exception exc) {
                        super.mo1180a(str6, enumC0809x, exc);
                        synchronized (obj2) {
                            obj2.notify();
                        }
                    }
                };
                synchronized (obj2) {
                    C0797n.m1205a(c0808w, str4, parseInt, str5);
                    try {
                        obj2.wait(15000L);
                    } catch (InterruptedException e2) {
                    }
                }
                if (c0808w.f5450b != null) {
                    throw new IOException(c0808w.f5450b);
                }
                if (c0808w.f5449a == null) {
                    throw new IOException("Failed to get game server info.");
                }
                return m1422b(c0808w.f5449a, z);
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
            GameEngine.PrintLOG("Converting connect string to: " + str6);
            trim = str6;
        }
        gameEngine.networkEngine.f5044L = null;
        if (trim.contains("/") || trim.contains("\\")) {
            int indexOf = trim.indexOf("/");
            int indexOf2 = trim.indexOf("\\");
            if (indexOf == -1) {
                indexOf = trim.length();
            }
            if (indexOf2 == -1) {
                indexOf2 = trim.length();
            }
            int mini = CommonUtils.mini(indexOf, indexOf2);
            String trim2 = trim.substring(mini + 1).trim();
            if (!trim2.equals(VariableScope.nullOrMissingString)) {
                gameEngine.networkEngine.f5044L = trim2;
            }
            trim = trim.substring(0, mini);
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
        if (!z && gameEngine.networkEngine.m1512P()) {
            z2 = true;
        }
        int i3 = 7000;
        GameEngine.PrintLOG(VariableScope.nullOrMissingString);
        GameEngine.PrintLOG("===============================");
        GameEngine.PrintLOG("Connect to: " + trim);
        if (!z2) {
            c0017h = new Socket();
            GameEngine.PrintLOG("connecting to Server.. (tcp)");
        } else {
            c0017h = new C0017h();
            GameEngine.PrintLOG("connecting to Server.. (udp)");
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
                GameEngine.PrintLOG("UnknownHostException.." + str10);
                e5.printStackTrace();
                throw new IOException(str10, e5);
            } catch (IOException e6) {
                String str11 = "Failed to connect to host";
                if (z2) {
                    str11 = str11 + " (udp)";
                }
                String str12 = str11 + " - " + e6.getMessage();
                GameEngine.PrintLOG("IOException.." + str12);
                e6.printStackTrace();
                throw new IOException(str12, e6);
            }
        } catch (IllegalArgumentException e7) {
            GameEngine.log("IllegalArgumentException..Incorrect server format");
            e7.printStackTrace();
            throw new IOException("Incorrect server format", e7);
        }
    }

    /* renamed from: Q */
    public void m1511Q() {
        final GameEngine gameEngine = GameEngine.getInstance();
        final menu_ m2014a = menu_.m2014a(LangLocale.getI18NText("menus.ingame.multiplayerReconnect.message", new Object[0]), false);
        m2014a.m2015a(LangLocale.getI18NText("menus.ingame.resume", new Object[0]), new AbstractC0691i() { // from class: com.corrodinggames.rts.gameFramework.h.ad.3
            @Override // com.corrodinggames.rts.gameFramework.gui.p034a.AbstractC0691i
            /* renamed from: a */
            public boolean mo1348a(C0684c c0684c) {
                m2014a.m1980i();
                return true;
            }
        });
        m2014a.m2015a(LangLocale.getI18NText("menus.ingame.reconnect", new Object[0]), new AbstractC0691i() { // from class: com.corrodinggames.rts.gameFramework.h.ad.4
            @Override // com.corrodinggames.rts.gameFramework.gui.p034a.AbstractC0691i
            /* renamed from: a */
            public boolean mo1348a(C0684c c0684c) {
                m2014a.m1980i();
                NetworkEngine.this.m1510R();
                return true;
            }
        });
        m2014a.m2015a(LangLocale.getI18NText("menus.ingame.disconnect", new Object[0]), new AbstractC0691i() { // from class: com.corrodinggames.rts.gameFramework.h.ad.5
            @Override // com.corrodinggames.rts.gameFramework.gui.p034a.AbstractC0691i
            /* renamed from: a */
            public boolean mo1348a(C0684c c0684c) {
                m2014a.m1980i();
                gameEngine.m889a(new Runnable() { // from class: com.corrodinggames.rts.gameFramework.h.ad.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        NetworkEngine.this.disconnect("already disconnected");
                        gameEngine.interfaceEngine.battleInterface.m2028m();
                    }
                });
                return true;
            }
        });
        gameEngine.interfaceEngine.m1888a(m2014a);
        this.f5081bF = true;
    }

    /* renamed from: R */
    public synchronized boolean m1510R() {
        Socket socket = this.f5171bD;
        if (socket == null) {
            GameEngine.PrintLOG("reconnectToServer: lastConnectedTo==null");
            return false;
        }
        GameEngine.PrintLOG("reconnectToServer attempted");
        if (this.networked) {
            GameEngine.PrintLOG("reconnectToServer: disconnecting");
            disconnect("reconnecting");
        }
        if (socket.getInetAddress() == null) {
            GameEngine.PrintLOG("reconnectToServer: lastConnectedTo.getInetAddress()==null");
            return false;
        }
        String str = socket.getInetAddress().getHostAddress() + ":" + socket.getPort();
        GameEngine.PrintLOG("reconnectToServer: connecting to: " + str);
        try {
            return m1465a(m1422b(str, false));
        } catch (C0764ag e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public synchronized boolean m1465a(Socket socket) {
        if (this.networked) {
            disconnect("starting new");
        }
        if (socket == null) {
            throw new RuntimeException("connectedSocket==null");
        }
        m1363n();
        GameEngine.getInstance();
        this.f5103m = socket.getPort();
        this.networked = true;
        this.isServer = false;
        addDebugText("connected to Server..");
        Connection connection = new Connection(this, socket);
        connection.f5338o = true;
        connection.m1273d();
        this.connections.add(connection);
        m1398e(connection);
        m1451ah();
        this.f5171bD = socket;
        return true;
    }

    /* renamed from: c */
    public Connection m1417c(Team team) {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.player == team) {
                return connection;
            }
        }
        return null;
    }

    /* renamed from: d */
    public Connection m1408d(Team team) {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (!connection.disconnecting && connection.player == team) {
                return connection;
            }
        }
        return null;
    }

    /* renamed from: S */
    public Connection m1509S() {
        if (this.isServer) {
            return null;
        }
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (!connection.disconnecting) {
                return connection;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void sendPacketToAll(Packet packet) {
        if (!this.networked) {
            GameEngine.PrintLOG("Skipping sendPacketToAll, not networked");
        } else {
            m1374i(packet);
        }
    }

    /* renamed from: i */
    private void m1374i(Packet packet) {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5338o && !connection.disconnecting && !connection.f5341r) {
                connection.m1284a(packet);
            }
        }
    }

    /* renamed from: e */
    public void sendPacketToAllIncludingRelay(Packet packet) {
        if (!this.networked) {
            GameEngine.PrintLOG("Skipping sendPacketToAllIncludingRelay, not networked");
            return;
        }
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5338o && !connection.disconnecting) {
                connection.m1284a(packet);
            }
        }
    }

    /* renamed from: f */
    public void sendPacketToServer(Packet packet) {
        if (!this.networked) {
            GameEngine.PrintLOG("Skipping sendPacketToServer, not networked");
        } else if (this.isServer) {
            throw new RuntimeException("We are a server");
        } else {
            sendPacketToAll(packet);
        }
    }

    /* renamed from: g */
    public void m1386g(Packet packet) {
        if (!this.networked) {
            GameEngine.PrintLOG("Skipping sendPacketToClients, not networked");
        } else if (!this.isServer) {
            throw new RuntimeException("We are not a server");
        } else {
            sendPacketToAllIncludingRelay(packet);
        }
    }

    /* renamed from: h */
    public void m1380h(Packet packet) {
        if (!this.networked) {
            GameEngine.PrintLOG("Skipping sendPacketToClients, not networked");
        } else if (!this.isServer) {
            throw new RuntimeException("We are not a server");
        } else {
            sendPacketToAll(packet);
        }
    }

    /* renamed from: a */
    public void m1476a(Connection connection, Packet packet) {
        if (!this.networked) {
            GameEngine.PrintLOG("Skipping sendPacketOnConnection, not networked");
        } else {
            connection.m1284a(packet);
        }
    }

    /* renamed from: T */
    public void m1508T() {
        if (this.isServer) {
            addDebugText("registerConnection: We are a server");
        }
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            m1385g((Connection) it.next());
        }
    }

    /* renamed from: U */
    public void m1507U() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.curSettings.networkClientId = null;
        if (this.serverUUID == null) {
            GameEngine.PrintLOG("generateNewClientId: serverUUID==null");
            this.serverUUID = "x";
        }
        getOwnClientIdHashed();
        gameEngine.curSettings.save();
    }

    /* renamed from: V */
    public String getOwnClientIdHashed() {
        GameEngine isNoClientId = GameEngine.getInstance();
        boolean z = false;
        if (isNoClientId.curSettings.networkClientId == null) {
            z = true;
        }
        if (!this.f5173bG) {
            this.f5173bG = true;
            if (GameEngine.isPC()) {
                String key = GetNetworkClientIdMachineKey(); // 取每个网络接口mac地址计算的机器码，禁用个虚拟机网卡也会导致机器码变动，重新启用会恢复原来的
                if (!key.equals(isNoClientId.curSettings.networkClientIdMachineKey)) {
                    if (isNoClientId.curSettings.networkClientIdMachineKey != null) {
                        GameEngine.PrintLOG("Machine appears to have changed: " + isNoClientId.curSettings.networkClientIdMachineKey + " vs " + key);
                    }
                    isNoClientId.curSettings.networkClientIdMachineKey = key;
                    z = true;
                }
            }
        }
        if (z) {
            GameEngine.PrintLOG("new networkClientId needed");
            isNoClientId.curSettings.networkClientId = UUID.randomUUID().toString();
            isNoClientId.curSettings.save();
        }
        String str = isNoClientId.curSettings.networkClientId;
        if (this.serverUUID == null) {
            throw new RuntimeException("getOwnClientIdHashed: serverUUID==null");
        }
        return CommonUtils.getEncode_Zra_SHA256(str + this.serverUUID); // serverUUID值为x
    }

    /* renamed from: W */
    public void generateNewServerId() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.curSettings.networkServerId = UUID.randomUUID().toString();
        gameEngine.curSettings.save();
    }

    /* renamed from: X */
    public String m1504X() {
        GameEngine game = GameEngine.getInstance();
        if (game.curSettings.networkServerId == null) {
            generateNewServerId();
        }
        return game.curSettings.networkServerId;
    }

    /* renamed from: Y */
    public String m1503Y() {
        GameEngine game = GameEngine.getInstance();
        if (this.isServer) {
            return game.curSettings.networkServerId;
        }
        return this.serverUUID;
    }

    /* renamed from: e */
    public void m1398e(Connection connection) {
        OutputNetStream stream = new OutputNetStream();
        try {
            int i = 1;
            if (GameEngine.isPC()) {
                i = 2;
            }
            if (GameEngine.isIOS_Device) {
                i = 3;
            }
            stream.writeString("com.corrodinggames.rts");
            stream.writeInt(4);
            stream.writeInt(this.serverVersionInt);
            stream.writeInt(i);
            stream.m_writeString(this.f5044L);
            stream.writeString(this.f5110y);
            stream.writeString(LangLocale.getLocalLanguage());
            String str = VariableScope.nullOrMissingString;
            if (GameEngine.f5912aT) {
                str = str + "d";
            }
            stream.writeString(str);
            m1476a(connection, stream.createPacket(160));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    public void m1391f(Connection connection) {
        OutputNetStream stream = new OutputNetStream();
        try {
            GameEngine game = GameEngine.getInstance();
            stream.writeString("com.corrodinggames.rts");
            stream.writeInt(2);
            stream.writeInt(this.serverVersionInt);
            stream.writeInt(game.gameVersionInternal(true));
            stream.writeString(game.mo818i());
            stream.writeString(m1504X());
            stream.writeInt(connection.f5317L);
            stream.writeInt(this.f5133V);
            stream.writeInt(0);
            m1476a(connection, stream.createPacket(161));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public void m1385g(Connection connection) {
        GameEngine.PrintLOG("sendRegisterConnection...");
        OutputNetStream outputNetStream = new OutputNetStream();
        try {
            outputNetStream.writeString("com.corrodinggames.rts");
            outputNetStream.writeInt(5);
            outputNetStream.writeInt(this.serverVersionInt);
            GameEngine game = GameEngine.getInstance();
            outputNetStream.writeInt(game.gameVersionInternal(true));
            outputNetStream.writeString(this.f5110y);
            String str = null;
            if (this.f5104n != null) {
                str = CommonUtils.getEncode_Zra_SHA256(this.f5104n);
            }
            outputNetStream.m_writeString(str);
            outputNetStream.writeString(game.mo818i());
            outputNetStream.writeString(getOwnClientIdHashed());
            outputNetStream.writeInt(game.mo798v());
            outputNetStream.writeString(m1388g(this.f5130S));
            outputNetStream.writeString(m1382h(this.f5131T));
            m1476a(connection, outputNetStream.createPacket(110));
            this.f5174bH = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public String m1388g(int i) {
        String str = (((((((((((VariableScope.nullOrMissingString + "c:" + i) + "m:" + ((i * 87) + 24)) + "0:" + (getStartingCreditsVal(0) * 11 * i)) + "1:" + ((getStartingCreditsVal(1) * 12) + i)) + "2:" + (getStartingCreditsVal(2) * 13 * i)) + "3:" + ((getStartingCreditsVal(3) * 14) + i)) + "4:" + (getStartingCreditsVal(4) * 15 * i)) + "5:" + ((getStartingCreditsVal(5) * 16) + i)) + "6:" + (getStartingCreditsVal(6) * 17 * i)) + "7:" + (getStartingCreditsVal(7) * 18 * i)) + "8:" + (getStartingCreditsVal(8) * 19 * i)) + "t1:" + (Team.f1348h.credits * 11.0d * i);
        int i2 = 5 * i;
        if (getStartingCreditsVal() != getStartingCreditsVal(this.setup.startingCreditsLev)) {
            i2 = 7 * i;
        }
        return str + "d:" + i2;
    }

    /* renamed from: h */
    public String m1382h(int i) {
        return CommonUtils.m1636g(i);
    }

    /* renamed from: Z */
    public void sendClientStatus() {
        if (this.isServer) {
            throw new RuntimeException("We are a server");
        }
        GameEngine game = GameEngine.getInstance();
        OutputNetStream stream = new OutputNetStream();
        try {
            stream.writeBoolean(this.localPlayerReady);
            stream.writeBoolean(game.gameRunning);
            sendPacketToServer(stream.createPacket(112)); // 112为PACKET_UPDATE_CLIENT_STATUS
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public void sendSystemMessage(String message) {
        if (!this.isServer) {
            addDebugText("cannot send sendSystemMessage:" + message + ", we are not a server");
        } else if (!this.networked || this.f5126F) {
            addDebugText("cannot send sendSystemMessage:" + message + ", not networked");
        } else {
            GameEngine.PrintLOG("sendSystemMessage:" + message);
            m1478a((Connection) null, (Team) null, (String) null, message);
        }
    }

    /* renamed from: i */
    public void Sendpara2Server(String str) {
        sendChatMessage("-qc " + str);
    }

    /* renamed from: j */
    public void m1370j(String str) {
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
        sendChatMessage(str);
    }

    // 用于联机发送指令
    /* renamed from: k */
    public void sendChatMessage(String message) {
        if (!this.networked) {
            GameEngine.PrintLOG("sendChatMessage: not networked:" + message);
            m1479a((Connection) null, -1, (String) null, message);
        } else if (this.isServer) {
            m1478a((Connection) null, this.f5111z, this.f5110y, message);
            m1425b(null, this.f5111z, this.f5110y, message);
        } else {
            try {
                OutputNetStream stream = new OutputNetStream();
                stream.writeString(message);
                stream.writeByte(0);
                sendPacketToServer(stream.createPacket(140)); // 140=PACKET_SEND_CHAT_TO_SERVER
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public void m1478a(Connection connection, Team team, String str, String str2) {
        m1477a(connection, team, str, str2, null);
    }

    /* renamed from: a */
    public void m1477a(Connection connection, Team team, String str, String str2, Connection con) {
        Player player;
        try {
            boolean z = false;
            boolean z2 = false;
            String m1366l = m1366l(str2);
            if ("t".equalsIgnoreCase(m1366l)) {
                if (team != null) {
                    z = true;
                    str2 = "[TEAM] " + str2.substring("-t".length());
                } else {
                    GameEngine.log("toOnlyTeams failed team==null");
                }
            }
            if (team != null && "surrender".equalsIgnoreCase(m1366l)) {
                z = true;
                str2 = "[TEAM] " + str2;
            }
            if (team != null && "i".equalsIgnoreCase(m1366l)) {
                z2 = true;
                str2 = "[INFO] " + str2.substring("-i".length());
            }
            if (team != null && "qc".equalsIgnoreCase(m1366l)) {
                z2 = true;
                str2 = "[COMMAND] " + str2.substring("-qc".length());
            }
            if (!z2 && team != null && team != this.f5179bt && team != this.f5180bu && !this.f5117d.m1531a(connection, team, str2, z)) {
                z2 = true;
            }
            OutputNetStream stream = new OutputNetStream();
            stream.writeString(str2);
            stream.writeByte(3);
            stream.m_writeString(str);
            stream.mo1309a(connection);
            int i = -1;
            if (team != null) {
                i = team.teamID;
            }
            stream.writeInt(i);
            Packet packet = stream.createPacket(141); // 141=PACKET_RECEIVE_CHAT_FROM_SERVER
            if (z) {
                Iterator it = this.connections.iterator();
                while (it.hasNext()) {
                    Connection connection2 = (Connection) it.next();
                    if (connection2.f5338o && !connection2.disconnecting && (player = connection2.player) != null && player.m3913d(team)) {
                        connection2.m1284a(packet);
                    }
                }
                Team team2 = this.f5111z;
                if (team2 != null && team2.m3913d(team)) {
                    m1479a(connection, i, str, str2);
                }
            } else if (z2) {
                GameEngine.log("info message:" + m1412c(str, str2));
            } else {
                if (con != null) {
                    m1476a(con, packet);
                } else {
                    m1386g(packet);
                }
                m1479a(connection, i, str, str2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    public static String m1366l(String str) {
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
    public static String m1412c(String str, String str2) {
        if (str != null) {
            return str + ": " + str2;
        }
        return str2;
    }

    /* renamed from: a */
    private void m1479a(Connection connection, int i, String str, String str2) {
        if (!this.networked && str2.startsWith("-i ")) {
            return;
        }
        if (!this.networked && str2.startsWith("-qc ")) {
            return;
        }
        String m1601c = LangLocale.m1601c(str2);
        if (str != null) {
            m1404d("New Message", str + ": " + m1601c);
        }
        Connection connection2 = null;
        if (this.isServer) {
            connection2 = connection;
        }
        this.f5159aR.m1539a(i, str, m1601c, connection2);
        this.f5117d.mo400a(i, str, m1601c, connection);
        boolean z = false;
        if (this.gameHasStarted) {
            z = true;
        }
        if (!this.networked) {
            z = true;
        }
        if (z) {
            m1468a(str, m1601c);
            return;
        }
        String m1412c = m1412c(str, m1601c);
        if (!GameEngine.isDedicatedServer) {
            MultiplayerBattleroomActivity.m4398d(m1412c);
        }
    }

    /* renamed from: a */
    public void m1473a(Connection connection, byte[] bArr, boolean z, boolean z2) {
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            OutputNetStream outputNetStream = new OutputNetStream();
            outputNetStream.writeByte(0);
            outputNetStream.writeInt(gameEngine.frameNumber);
            outputNetStream.writeInt(gameEngine.f5845by);
            outputNetStream.writeFloat(m1501a());
            outputNetStream.writeFloat(1.0f);
            outputNetStream.writeBoolean(z);
            outputNetStream.writeBoolean(z2);
            outputNetStream.mo1291e("gameSave");
            outputNetStream.m1321b(bArr);
            outputNetStream.endBlock("gameSave");
            m1476a(connection, outputNetStream.createPacket(35));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m1460a(boolean z, boolean z2, boolean z3) {
        GameEngine game = GameEngine.getInstance();
        try {
            OutputNetStream outputNetStream = new OutputNetStream();
            outputNetStream.writeByte(0);
            outputNetStream.writeInt(game.frameNumber);
            outputNetStream.writeInt(game.f5845by);
            outputNetStream.writeFloat(m1501a());
            outputNetStream.writeFloat(1.0f);
            outputNetStream.writeBoolean(z);
            outputNetStream.writeBoolean(z2);
            outputNetStream.mo1291e("gameSave");
            game.f5862ca.m415a(outputNetStream);
            outputNetStream.endBlock("gameSave");
            if (z) {
            }
            Packet createPacket = outputNetStream.createPacket(35);
            sendPacketToAll(createPacket);
            if (z3) {
                if (!this.isServer) {
                    throw new RuntimeException("sendResyncSave: reloadCreatedSave: We are not a server");
                }
                createPacket.connection = this.f5178ba;
                m1483a(createPacket);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: aa */
    public boolean m1458aa() {
        m1515M();
        m1520H();
        return m1474a((Connection) null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m1474a(com.corrodinggames.rts.gameFramework.network.Connection r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.network.NetworkEngine.m1474a(com.corrodinggames.rts.gameFramework.h.c, boolean):boolean");
    }

    /* renamed from: ab */
    public void m1457ab() {
        this.f5092bo = true;
        GameEngine.PrintLOG("onStartGameFailed");
        if (this.isServer) {
            this.gameHasStarted = false;
            sendSystemMessage("Map load failed.");
            return;
        }
        disconnect("Map load failed");
    }

    /* renamed from: av */
    private void startGame() {
        this.gameHasStarted = true;
        this.f5092bo = false;
        this.f5093bp = false;
        GameEngine.PrintLOG("Starting new network game (" + m1503Y() + ")");
        if (this.f5107q && this.isServer) {
            C0797n.m1189c();
        }
        if (!GameEngine.isDedicatedServer) {
            MultiplayerBattleroomActivity.startGame();
        }
        this.f5117d.mo392b();
    }

    /* renamed from: aw */
    private void m1436aw() {
        m1359p();
        if (this.f5107q && this.isServer) {
            C0797n.m1189c();
        }
        if (!GameEngine.isDedicatedServer) {
        }
    }

    /* renamed from: ac */
    public String m1456ac() {
        ArrayList localIpAddressList = getLocalIpAddressList();
        if (localIpAddressList == null || localIpAddressList.size() == 0) {
            return null;
        }
        return (String) localIpAddressList.get(0);
    }

    /* renamed from: ad */
    public String m1455ad() {
        ArrayList localIpAddressList = getLocalIpAddressList();
        if (localIpAddressList == null || localIpAddressList.size() == 0) {
            return null;
        }
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        Iterator it = localIpAddressList.iterator();
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

    /* renamed from: ae */
    public ArrayList getLocalIpAddressList() {
        ArrayList arrayList;
        if (f5036bI != null) {
            return new ArrayList(f5036bI);
        }
        long tookTime = C0651bl.getTookTime();
        ArrayList m1403d = m1403d(true);
        if (m1403d != null && m1403d.size() > 0) {
            arrayList = m1403d;
        } else {
            arrayList = m1403d(false);
        }
        double m2277a = C0651bl.m2277a(tookTime);
        if (m2277a > 2.0d) {
            GameEngine.log("getLocalIpAddressList was slow, taking:" + C0651bl.m2278a(m2277a));
        }
        if (m2277a > 10.0d && arrayList != null && arrayList.size() > 0) {
            GameEngine.PrintLOG("getLocalIpAddressList: creating cache");
            f5036bI = new ArrayList(arrayList);
        }
        return arrayList;
    }

    /* renamed from: af */
    public String GetNetworkClientIdMachineKey() {
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
            return CommonUtils.m1666c(str);
        }
        return "[blank]";
    }

    /* renamed from: d */
    public ArrayList m1403d(boolean z) {
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
            Log.e("RustedWarfare", e.toString());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag */
    public InetAddress m1452ag() {
        try {
            DhcpInfo dhcpInfo = ((WifiManager) GameEngine.getInstance().f5935ao.mo4797c("wifi")).getDhcpInfo();
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
    public void m1404d(String str, String str2) {
        if (GameEngine.isDedicatedServer) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f5126F || gameEngine.replayEngine.isPlaying()) {
            return;
        }
        if (MultiplayerBattleroomActivity.m4397l()) {
            m1376i(2);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) gameEngine.f5935ao.mo4797c("notification");
        PendingIntent activity = PendingIntent.getActivity(gameEngine.f5935ao, 0, new Intent(gameEngine.f5935ao, ActivityC0084a.class), 2);
        if (Build.VERSION.SDK_INT >= 11) {
            Notification.Builder builder = new Notification.Builder(gameEngine.f5935ao);
            builder.setContentTitle("Rusted Warfare Multiplayer");
            builder.setContentText(str + ": " + str2);
            builder.setSmallIcon(R.drawable.icon);
            builder.setContentIntent(activity);
            builder.setOngoing(false);
            builder.setAutoCancel(true);
            m1493a(notificationManager);
            setChannelId(builder, "multiplayerChatId");
            notificationManager.notify(2, builder.getNotification());
        }
    }

    /* renamed from: ah */
    public void m1451ah() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.networked && gameEngine != null && gameEngine.m921I()) {
            m1435ax();
        } else {
            m1376i(1);
        }
    }

    /* renamed from: a */
    private void setChannelId(Notification.Builder builder, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                builder.getClass().getDeclaredMethod("setChannelId", String.class).invoke(builder, str);
            } catch (Exception e) {
                GameEngine.LogThrowable("setChannelId failed", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private void m1493a(NotificationManager notificationManager) {
        createNotificationChannel(notificationManager, "multiplayerChatId", "Multiplayer Chat");
        createNotificationChannel(notificationManager, "multiplayerStatusId", "Multiplayer Status");
    }

    /* renamed from: a */
    private void createNotificationChannel(NotificationManager notificationManager, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Class<?> cls = Class.forName("android.app.NotificationChannel");
                notificationManager.getClass().getDeclaredMethod("createNotificationChannel", cls).invoke(notificationManager, cls.getDeclaredConstructor(String.class, CharSequence.class, Integer.TYPE).newInstance(str, str2, 3));
            } catch (Exception e) {
                GameEngine.LogThrowable("Creating notification channel failed", (Throwable) e);
            }
        }
    }

    /* renamed from: ax */
    private void m1435ax() {
        if (GameEngine.isDedicatedServer) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        PendingIntent activity = PendingIntent.getActivity(gameEngine.f5935ao, 0, new Intent(gameEngine.f5935ao, ActivityC0084a.class), 2);
        NotificationManager notificationManager = (NotificationManager) gameEngine.f5935ao.mo4797c("notification");
        if (Build.VERSION.SDK_INT >= 11) {
            if (Build.VERSION.SDK_INT >= 26) {
            }
            Notification.Builder builder = new Notification.Builder(gameEngine.f5935ao);
            builder.setContentTitle("Rusted Warfare Multiplayer");
            builder.setContentText("A multiplayer game is in progress");
            builder.setSmallIcon(R.drawable.icon);
            builder.setContentIntent(activity);
            builder.setOngoing(true);
            m1493a(notificationManager);
            setChannelId(builder, "multiplayerStatusId");
            if (Build.VERSION.SDK_INT >= 16) {
                builder.build();
            }
            notificationManager.notify(1, builder.getNotification());
        }
    }

    /* renamed from: i */
    private void m1376i(int i) {
        if (GameEngine.isDedicatedServer) {
            return;
        }
        ((NotificationManager) GameEngine.getInstance().f5935ao.mo4797c("notification")).cancel(i);
    }

    /* renamed from: ai */
    public int m1450ai() {
        int i = 0;
        for (int i2 = 0; i2 < Team.playerNumMax; i2++) {
            Team team = Team.getTeam(i2);
            if (team != null && !team.f1333t) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: aj */
    public int m1449aj() {
        int i = 0;
        for (int i2 = 0; i2 < Team.playerNumMax; i2++) {
            if (Team.getTeam(i2) != null) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public void m1400e(Team team) {
        if (this.isServer) {
            m1393f(team);
        } else if (this.f5042H) {
            Sendpara2Server("-kick " + (team.teamID + 1));
        } else {
            GameEngine.log("kickTeamAndAttachedPlayer: but not server or proxy controller");
        }
    }

    /* renamed from: f */
    public void m1393f(Team team) {
        if (team instanceof AI) {
            team.removeSelfFromList();
        } else if (this.f5111z == team) {
            GameEngine.log("kickTeamAndAttachedPlayer", "Cannot kick self");
            return;
        } else {
            Connection m1417c = m1417c(team);
            if (m1417c == null) {
                reportDesync("Kick player: cannot find connection for team");
            } else {
                sendKick(m1417c, "Kicked by host");
                m1417c.writeStringPkg("Kicked by host");
            }
            team.removeSelfFromList();
        }
        m1516L();
        MultiplayerBattleroomActivity.updateUI();
    }

    /* renamed from: ak */
    public void m1448ak() {
        GameEngine game = GameEngine.getInstance();
        if (!this.isServer) {
            GameEngine.log("addAIToGame", "We are not a server");
            return;
        }
        int nextFreeSlot = Team.nextFreeSlot();
        if (nextFreeSlot == -1) {
            game.alert("No free slots for AI", 1);
        }
        AI ai = new AI(nextFreeSlot);
        ai.playerName = "AI";
        ai.allyGroup = nextFreeSlot % 2;
        ai.f1334u = this.setup.aiDifficulty;
        updateNamesOfAI();
        game.networkEngine.f5117d.m1533a(ai);
        game.networkEngine.m1406d((Connection) null);
        MultiplayerBattleroomActivity.updateUI();
    }

    /* renamed from: al */
    public boolean updateNamesOfAI() {
        if (!this.isServer && this.networked) {
            GameEngine.log("updateNamesOfAI", "We are not a server");
            return false;
        }
        boolean z = false;
        for (int i = 0; i < Team.playerNumMax; i++) {
            Team team = Team.getTeam(i);
            if (team != null && setAIName(team)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m1490a(Team team, int i) {
        synchronized (this.f5175bJ) {
            m1416c(team, i);
        }
    }

    /* renamed from: c */
    private void m1416c(Team team, int i) {
        if (team.teamID != i) {
            int i2 = team.teamID;
            int i3 = team.allyGroup;
            boolean z = false;
            if (i == -3) {
                z = true;
                i = Team.m3985C();
                if (i == -1) {
                    m1405d("No free spectator slots");
                    return;
                }
            }
            Team team2 = Team.getTeam(i);
            team.m3900f(i);
            team.allyGroup = i3;
            if (z) {
                team.allyGroup = -3;
            }
            if (team2 != null) {
                int i4 = team2.allyGroup;
                team2.m3900f(i2);
                if (i4 == -3) {
                    team2.allyGroup = -3;
                } else {
                    team2.allyGroup = i3;
                }
            }
            m1519I();
            m1516L();
        }
    }

    /* renamed from: a */
    public void m1485a(layout_multeam layout_multeamVar) {
        synchronized (this.f5175bJ) {
            m1428b(layout_multeamVar);
        }
    }

    /* renamed from: b */
    private synchronized void m1428b(layout_multeam layout_multeamVar) {
        if (!GameEngine.getInstance().networkEngine.isServer) {
            GameEngine.PrintLOG("Not server");
            return;
        }
        if (layout_multeamVar == layout_multeam.f5228a) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < Team.playerNumMax; i++) {
                Team team = Team.getTeam(i);
                if (team != null) {
                    arrayList.add(team);
                }
            }
            Collections.shuffle(arrayList);
            int size = arrayList.size() / 2;
            if (arrayList.size() % 2 != 0) {
                size += CommonUtils.m1737a(0, 1);
            }
            if (size >= arrayList.size()) {
                size = arrayList.size();
            }
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ((Team) arrayList.get(i3)).m3900f(i2);
                i2 += 2;
                ((Team) arrayList.get(i3)).allyGroup = 0;
            }
            int i4 = 1;
            for (int i5 = 0 + size; i5 < arrayList.size(); i5++) {
                ((Team) arrayList.get(i5)).m3900f(i4);
                i4 += 2;
                ((Team) arrayList.get(i5)).allyGroup = 1;
            }
        } else if (layout_multeamVar == layout_multeam.f5229b) {
            ArrayList arrayList2 = new ArrayList();
            for (int i6 = 0; i6 < Team.playerNumMax; i6++) {
                Team team2 = Team.getTeam(i6);
                if (team2 != null) {
                    arrayList2.add(team2);
                }
            }
            Collections.shuffle(arrayList2);
            int size2 = arrayList2.size() / 3;
            if (size2 >= arrayList2.size()) {
                size2 = arrayList2.size();
            }
            int i7 = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                Team team3 = (Team) arrayList2.get(i8);
                team3.m3900f(i7);
                team3.allyGroup = 0;
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
                Team team4 = (Team) arrayList2.get(i11);
                team4.m3900f(i10);
                team4.allyGroup = 1;
                i10 += 3;
                arrayList2.set(i11, null);
            }
            int i12 = i9 + size2;
            if (i12 >= arrayList2.size()) {
                i12 = arrayList2.size();
            }
            int i13 = 2;
            for (int i14 = i12; i14 < arrayList2.size(); i14++) {
                Team team5 = (Team) arrayList2.get(i14);
                if (i13 >= Team.playerNumMax) {
                    team5.m3900f(i13);
                    team5.allyGroup = 2;
                    i13 += 3;
                    arrayList2.set(i14, null);
                }
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                Team team6 = (Team) arrayList2.get(i15);
                if (team6 != null) {
                    for (int i16 = 0; i16 < Team.playerNumMax; i16++) {
                        if (Team.getTeam(i16) == null) {
                            team6.m3900f(i16);
                            team6.allyGroup = 2;
                            arrayList2.set(i15, null);
                        }
                    }
                }
            }
        } else if (layout_multeamVar == layout_multeam.f5230c) {
            ArrayList arrayList3 = new ArrayList();
            for (int i17 = 0; i17 < Team.playerNumMax; i17++) {
                Team team7 = Team.getTeam(i17);
                if (team7 != null) {
                    arrayList3.add(team7);
                }
            }
            Collections.shuffle(arrayList3);
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                ((Team) arrayList3.get(i19)).m3900f(i18);
                ((Team) arrayList3.get(i19)).allyGroup = i18;
                i18++;
            }
        } else if (layout_multeamVar == layout_multeam.f5231d) {
            ArrayList arrayList4 = new ArrayList();
            for (int i20 = 0; i20 < Team.playerNumMax; i20++) {
                Team team8 = Team.getTeam(i20);
                if (team8 != null) {
                    arrayList4.add(team8);
                }
            }
            Collections.shuffle(arrayList4);
            int i21 = 0;
            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                int m3985C = Team.m3985C();
                if (m3985C != -1) {
                    ((Team) arrayList4.get(i22)).m3900f(m3985C);
                }
                ((Team) arrayList4.get(i22)).allyGroup = -3;
                i21++;
            }
        } else {
            throw new RuntimeException("overrideTeamLayout: unhandled layout: " + layout_multeamVar);
        }
        m1519I();
    }

    /* renamed from: a */
    public void m1489a(Team team, int i, Integer num) {
        String str = VariableScope.nullOrMissingString;
        if (num != null) {
            str = " " + num;
        }
        if (!this.f5042H && this.f5111z == team) {
            Sendpara2Server("-self_move " + (i + 1) + str);
        } else {
            Sendpara2Server("-move " + (team.teamID + 1) + " " + (i + 1) + str);
        }
    }

    /* renamed from: b */
    public void m1430b(Team team, int i) {
        if (i != -1) {
            i++;
        }
        if (!this.f5042H && this.f5111z == team) {
            Sendpara2Server("-self_team " + i);
        } else {
            Sendpara2Server("-team " + (team.teamID + 1) + " " + i);
        }
    }

    /* renamed from: g */
    public void m1387g(Team team) {
        if (!team.f1287E) {
            team.f1287E = true;
            String str = team.playerName;
            if (str == null) {
                str = "Player - " + (team.teamID + 1) + VariableScope.nullOrMissingString;
            }
            sendSystemMessage(str + " is victorious!");
        }
    }

    /* renamed from: h */
    public void m1381h(Team team) {
        String str;
        GameEngine gameEngine = GameEngine.getInstance();
        boolean z = false;
        String str2 = team.playerName;
        if (str2 == null) {
            str2 = "Player - " + (team.teamID + 1) + VariableScope.nullOrMissingString;
        }
        String str3 = str2 + " was defeated";
        if (!this.f5091bn) {
            str = str3 + " (Team: " + team.getTeam() + ")";
        } else {
            int m3907e = Team.m3907e();
            str = str3 + " (" + m3907e + " players remaining)";
            if (m3907e == 1) {
                z = true;
            }
        }
        if (!gameEngine.isNetworked() && gameEngine.frameNumber < 60) {
            GameEngine.PrintLOG("Not showing defeated message: " + str);
            str = null;
        }
        if (team.f1284B) {
            str = null;
        }
        if (str != null) {
            sendSystemMessage(str);
        }
        if (z) {
            Team.m3977K();
        }
    }

    /* renamed from: i */
    public void m1375i(Team team) {
        String str;
        String str2;
        GameEngine gameEngine = GameEngine.getInstance();
        String str3 = team.playerName;
        if (str3 == null) {
            str3 = "Player - " + (team.teamID + 1) + VariableScope.nullOrMissingString;
        }
        boolean z = false;
        if (gameEngine.frameNumber < 10) {
            str = str3 + " had no starting units";
        } else {
            str = str3 + " has been wiped out";
        }
        if (!this.f5091bn) {
            str2 = str + " (Team: " + team.getTeam() + ")";
        } else {
            int m3907e = Team.m3907e();
            str2 = str + " (" + m3907e + " players remaining)";
            if (m3907e == 1) {
                z = true;
            }
        }
        if (!gameEngine.isNetworked() && gameEngine.frameNumber < 60) {
            GameEngine.PrintLOG("Not showing defeated message: " + str2);
            str2 = null;
        }
        if (team.f1284B) {
            str2 = null;
        }
        if (team.m3945b()) {
            str2 = null;
        }
        if (str2 != null) {
            sendSystemMessage(str2);
        }
        if (z) {
            Team.m3977K();
        }
    }

    /* renamed from: am */
    public synchronized void m1446am() {
        if (this.f5082bK != null) {
            this.f5082bK.cancel();
            this.f5082bK = null;
        }
    }

    /* renamed from: an */
    public synchronized void m1445an() {
        if (this.f5107q && this.isServer && this.f5082bK == null) {
            this.f5082bK = new Timer();
            this.f5082bK.schedule(new TimerTask() { // from class: com.corrodinggames.rts.gameFramework.h.ad.6
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    C0797n.m1189c();
                }
            }, 60000L, 60000L);
        }
    }

    /* renamed from: ao */
    public String m1444ao() {
        GameEngine gameEngine = GameEngine.getInstance();
        String str = VariableScope.nullOrMissingString;
        if (gameEngine.networkEngine.isServer && !gameEngine.networkEngine.f5126F) {
            String m1455ad = gameEngine.networkEngine.m1455ad();
            if (this.f5039D) {
                if (this.f5040E != null) {
                    str = str + this.f5040E;
                }
            } else if (m1455ad != null) {
                String str2 = "Local IP address: " + m1455ad + " port: " + gameEngine.networkEngine.f5103m;
                if (gameEngine.networkEngine.f5089bk != null) {
                    if (!gameEngine.networkEngine.f5089bk.booleanValue()) {
                        str2 = str2 + "\nUnable to get a public IP address, check your internet connection";
                    } else if (gameEngine.networkEngine.f5087bi != null && gameEngine.networkEngine.f5088bj != null) {
                        str2 = str2 + "\nYour public address is " + (gameEngine.networkEngine.f5088bj.booleanValue() ? "<Open>" : "<CLOSED>") + " to the internet";
                    }
                } else {
                    str2 = str2 + "\nRetrieving your public IP...";
                }
                str = str + str2;
            } else {
                str = str + "You do not have a network connection";
            }
        }
        if (gameEngine.m918L()) {
            if (this.f5106p) {
                str = str + "SandBox Mode!\nPlace any unit, Control all teams, Special powers";
            } else {
                str = str + "Local skirmish";
            }
        }
        boolean z = true;
        if (GameEngine.isNonDedicatedServer() && gameEngine.networkEngine.isServer) {
            z = false;
        }
        if (str.length() != 0) {
            str = str + "\n";
            if (GameEngine.isPC()) {
                str = str + "\n";
            }
        }
        if (gameEngine.networkEngine.f5059aK || gameEngine.networkEngine.isServer) {
            if (z) {
                if (gameEngine.networkEngine.setup.currentType != null) {
                    str = str + "Game Mode: " + gameEngine.networkEngine.setup.currentType.retMapType();
                }
                if (gameEngine.networkEngine.setup.mapFileName != null) {
                    str = str + "\nMap: " + ActivityC0112i.m4415e(gameEngine.networkEngine.setup.mapFileName);
                }
            }
            str = (str + "\nStarting Credits: " + gameEngine.networkEngine.getStartingCreditsText()) + "\nFog: " + gameEngine.networkEngine.getFogText();
            if (gameEngine.networkEngine.setup.startingUnits != 1) {
                str = str + "\nStarting Units: " + gameEngine.networkEngine.m1395f();
            }
            if (gameEngine.networkEngine.setup.incomeMultiplier != 1.0f) {
                str = str + "\n" + CommonUtils.m1740a(gameEngine.networkEngine.setup.incomeMultiplier, 1) + "X income";
            }
            if (gameEngine.networkEngine.setup.noNukes) {
                str = str + "\nNo nukes";
            }
            if (gameEngine.networkEngine.setup.sharedControl) {
                str = str + "\nShared control: On";
            }
            if (this.isServer) {
                if (gameEngine.networkEngine.f5104n != null) {
                    str = str + "\nPassword Protection: On";
                }
                if (!gameEngine.networkEngine.f5107q && !gameEngine.networkEngine.f5126F) {
                    str = str + "\nServer Visibility: Hidden";
                }
                if (gameEngine.networkEngine.mods && !gameEngine.networkEngine.f5126F) {
                    ArrayList m1572i = gameEngine.ModEngine.m1572i();
                    str = str + "\n-- Required Mods: --\n";
                    int i = 0;
                    Iterator it = m1572i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Mod mod = (Mod) it.next();
                        if (i > 2 && i < m1572i.size() - 1) {
                            str = str + VariableScope.nullOrMissingString + (m1572i.size() - i) + " more mods...";
                            break;
                        }
                        i++;
                        String m1563b = mod.m1563b();
                        m1563b.replace("\"", "'");
                        m1563b.replace(";", ".");
                        str = str + " mod: \"" + m1563b + "\"\n";
                    }
                }
            }
        }
        return str;
    }

    /* renamed from: ap */
    public String getMods() {
        if (!this.mods) {
            return null;
        }
        ArrayList m1572i = GameEngine.getInstance().ModEngine.m1572i();
        String str = VariableScope.nullOrMissingString;
        int i = 0;
        Iterator it = m1572i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Mod mod = (Mod) it.next();
            if (i != 0) {
                str = str + "; ";
            }
            if (i > 1 && i < m1572i.size() - 1) {
                str = str + VariableScope.nullOrMissingString + (m1572i.size() - i) + " more...";
                break;
            }
            i++;
            String m1563b = mod.m1563b();
            m1563b.replace(";", ".");
            str = str + m1563b;
        }
        return str;
    }

    /* renamed from: aq */
    public String m1442aq() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.setup.mapFileName == null || gameEngine.networkEngine.setup.currentType == null) {
            return null;
        }
        if (gameEngine.networkEngine.setup.currentType == mapType.f5220a) {
            return "maps/skirmish/" + gameEngine.networkEngine.setup.mapFileName;
        }
        if (gameEngine.networkEngine.setup.currentType == mapType.f5221b) {
            return "/SD/rusted_warfare_maps/" + gameEngine.networkEngine.setup.mapFileName;
        }
        GameEngine.PrintLOG("getNetworkMapPath: unhandled type:" + gameEngine.networkEngine.setup.currentType);
        return null;
    }

    /* renamed from: ar */
    public boolean m1441ar() {
        return this.isServer || this.f5042H;
    }

    /* renamed from: a */
    public void m1469a(String conn, Connection connection) {
        GameEngine.PrintLOG("sendCommandError: " + conn);
        if (connection == null) {
            m1479a((Connection) null, -1, (String) null, conn);
        } else {
            m1477a(null, null, null, conn, connection);
        }
    }

    /* renamed from: b */
    public boolean m1425b(Connection connection, Team team, String con, String team2) {
        int i;
        Team team3;
        String str = null;
        String str2 = VariableScope.nullOrMissingString;
        String[] strArr = new String[0];
        String trim = team2.trim();
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
            str = trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
            if (indexOf != -1 && trim2.length() >= indexOf + 1) {
                str2 = trim2.substring(indexOf + 1).trim();
                strArr = str2.split(" ");
            }
        }
        if (str == null) {
            return false;
        }
        if (z && !"self_move".equals(str) && !"self_team".equals(str)) {
            return false;
        }
        if ("pause".equals(str) || "unpause".equals(str)) {
            if (team == null) {
                m1469a("[Could not find player]", connection);
                return true;
            } else if ((!this.isServer || team != this.f5111z) && !this.f5117d.m1529b(connection)) {
                m1469a("[Only the host can change pause state]", connection);
                return true;
            } else if (!this.gameHasStarted) {
                m1469a("[Game not yet started]", connection);
                return true;
            } else {
                boolean z2 = !this.isGamePaused;
                if ("unpause".equals(str)) {
                    z2 = false;
                }
                msgGamePaused(z2);
                return true;
            }
        } else if ("teamlock".equals(str)) {
            if (team == null) {
                m1469a("[Could not find player]", connection);
                return true;
            } else if ((!this.isServer || team != this.f5111z) && !this.f5117d.m1529b(connection)) {
                m1469a("[Only the host can change teamlock]", connection);
                return true;
            } else if ("true".equalsIgnoreCase(str2) || "on".equalsIgnoreCase(str2)) {
                this.setup.teamLocked = true;
                m1469a("[teams are locked]", connection);
                return true;
            } else if ("false".equalsIgnoreCase(str2) || "off".equalsIgnoreCase(str2)) {
                this.setup.teamLocked = false;
                m1469a("[teams are unlocked]", connection);
                return true;
            } else {
                m1469a("[Expected true or false]", connection);
                return true;
            }
        } else if ("roomlock".equals(str)) {
            if (team == null) {
                m1469a("[Could not find player]", connection);
                return true;
            } else if (!this.isServer || team != this.f5111z) {
                m1469a("[Only the host can change roomlock]", connection);
                return true;
            } else if ("true".equalsIgnoreCase(str2) || "on".equalsIgnoreCase(str2)) {
                this.setup.lockedRoom = true;
                m1469a("[room is locked]", connection);
                return true;
            } else if ("false".equalsIgnoreCase(str2) || "off".equalsIgnoreCase(str2)) {
                this.setup.lockedRoom = false;
                m1469a("[room is unlocked]", connection);
                return true;
            } else {
                m1469a("[Expected true or false]", connection);
                return true;
            }
        } else if ("share".equals(str)) {
            if (team == null) {
                m1469a("[Could not find player]", connection);
                return true;
            } else if (!this.setup.sharedControl) {
                m1469a("[Shared control is not enabled in this game]", connection);
                return true;
            } else if ("true".equalsIgnoreCase(str2) || "on".equalsIgnoreCase(str2)) {
                if (!team.f1288F) {
                    team.f1288F = true;
                    sendSystemMessage("[shared control now on for " + con + "]");
                    return true;
                }
                sendSystemMessage("[shared control already on for " + con + "]");
                return true;
            } else if ("false".equalsIgnoreCase(str2) || "off".equalsIgnoreCase(str2)) {
                if (team.f1288F) {
                    team.f1288F = false;
                    sendSystemMessage("[shared control now off for " + con + "]");
                    return true;
                }
                sendSystemMessage("[shared control already off for " + con + "]");
                return true;
            } else {
                m1469a("[Expected true or false]", connection);
                return true;
            }
        } else if ("self_move".equals(str)) {
            if (team == null) {
                m1469a("[Cannot Move - Player not found]", connection);
                return true;
            } else if (this.gameHasStarted) {
                m1469a("[Cannot Move '" + team.playerName + "' - Game has been started]", connection);
                return true;
            } else if (isGameStarting()) {
                m1469a("[Cannot Move '" + team.playerName + "' - Game is starting]", connection);
                return true;
            } else if (this.setup.teamLocked) {
                m1469a("[Cannot Move '" + team.playerName + "' - Teams locked]", connection);
                return true;
            } else if (strArr.length > 0) {
                try {
                    int intValue = Integer.valueOf(strArr[0]).intValue();
                    Integer num = null;
                    if (strArr.length > 1) {
                        try {
                            num = Integer.valueOf(strArr[1]);
                            if (num.intValue() != -1 && (num.intValue() < 1 || num.intValue() > 99)) {
                                m1469a("[Cannot Move Team - Ally group - Out of range]", connection);
                                return true;
                            }
                        } catch (NumberFormatException e) {
                            m1469a("[Cannot Move '" + team.playerName + "' - ally group '" + strArr[1] + "' is not a number]", connection);
                            return true;
                        }
                    }
                    boolean z3 = false;
                    if (intValue - 1 == -3) {
                        if (!this.setup.allowSpectators) {
                            m1469a("[Spectators are disabled on this server]", connection);
                            return true;
                        }
                        synchronized (this.f5175bJ) {
                            intValue = Team.m3985C();
                            if (intValue != -1) {
                                m1490a(team, -3);
                            }
                        }
                        z3 = true;
                    }
                    int i2 = team.allyGroup;
                    boolean z4 = i2 == -3;
                    if (!z3) {
                        if (intValue < 1 || intValue > Team.playerNumMax) {
                            m1469a("[Cannot Move '" + team.playerName + "' - target slotId must between 1-" + Team.playerNumMax + "]", connection);
                            return true;
                        }
                        synchronized (this.f5175bJ) {
                            if (this.f5111z != team && (team3 = Team.getTeam(intValue - 1)) != null && !team3.f1333t && !team3.m3945b()) {
                                m1469a("[Cannot move '" + team.playerName + "' to slot: " + intValue + " - Player: " + team3.playerName + " is in that slot.]", connection);
                                return true;
                            }
                            m1490a(team, intValue - 1);
                        }
                    }
                    team.allyGroup = i2;
                    if (num != null) {
                        if (num.intValue() == -1) {
                            team.allyGroup = team.teamID % 2;
                        } else {
                            team.allyGroup = num.intValue();
                        }
                    }
                    if (this.setup.f5217n) {
                        team.allyGroup = team.teamID % 2;
                    }
                    if (z3) {
                        team.allyGroup = -3;
                    }
                    if (z3) {
                        if (!z4) {
                            sendSystemMessage("Player '" + team.playerName + "' is now a spectator");
                        }
                    } else {
                        sendSystemMessage("Player '" + team.playerName + "' moved themselves to: " + intValue);
                    }
                    m1516L();
                    MultiplayerBattleroomActivity.updateUI();
                    return true;
                } catch (NumberFormatException e2) {
                    m1469a("[Cannot Move '" + team.playerName + "' - team '" + strArr[0] + "' is not a number]", connection);
                    return true;
                }
            } else {
                m1469a("[Cannot Move '" + team.playerName + "' - No target]", connection);
                return true;
            }
        } else if ("self_team".equals(str)) {
            if (team == null) {
                m1469a("[Cannot Set Team - Player not found]", connection);
                return true;
            } else if (this.gameHasStarted) {
                m1469a("[" + team.playerName + ": Cannot Set Team - Game has been started]", connection);
                return true;
            } else if (isGameStarting()) {
                m1469a("[" + team.playerName + ": Cannot Set Team - Game is starting]", connection);
                return true;
            } else if (this.setup.teamLocked) {
                m1469a("[" + team.playerName + ": Cannot Set Team - Teams locked]", connection);
                return true;
            } else if (this.setup.f5217n) {
                return true;
            } else {
                try {
                    int intValue2 = Integer.valueOf(str2).intValue();
                    if (intValue2 == -1) {
                        i = team.teamID % 2;
                    } else if (intValue2 < 1 || intValue2 > 99) {
                        m1469a("[Cannot Set Team - Out of range]", connection);
                        return true;
                    } else {
                        i = intValue2 - 1;
                    }
                    if (team.allyGroup != i) {
                        team.allyGroup = i;
                        m1469a("Player '" + team.playerName + "' team changed to: " + intValue2, connection);
                    }
                    m1516L();
                    MultiplayerBattleroomActivity.updateUI();
                    return true;
                } catch (NumberFormatException e3) {
                    sendChatMessage("'" + str2 + "' is not a number");
                    return true;
                }
            }
        } else if ("surrender".equals(str)) {
            if (!this.gameHasStarted) {
                m1469a("[Cannot Surrender - Game has not started]", connection);
                return true;
            } else if (team == null) {
                m1469a("[Could not find player]", connection);
                return true;
            } else if (!team.m3893i()) {
                GameEngine.PrintLOG(con + ": Is voting to surrender");
                team.m3891j();
                m1478a(connection, team, con, "-t [Votes to surrender " + (Team.getVotedPlayerNum(team.allyGroup) + "/" + Team.getVotePlayerMax(team.allyGroup)) + "]");
                return true;
            } else {
                GameEngine.PrintLOG(con + ": Is already voting to surrender but updating timestamp");
                team.m3891j();
                return true;
            }
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static void m1487a(final C0761ae c0761ae) {
        GameEngine game = GameEngine.getInstance();
        if (game.networkEngine != null) {
            game.networkEngine.f5117d.mo399a(c0761ae);
        }
        if (GameEngine.isDedicatedServer) {
            return;
        }
        C0086c.m4436a(new Runnable() { // from class: com.corrodinggames.rts.gameFramework.h.ad.7
            @Override // java.lang.Runnable
            public void run() {
                MultiplayerBattleroomActivity.m4400a(C0761ae.this);
            }
        });
    }

    /* renamed from: as */
    public ArrayList m1440as() {
        ArrayList m3929c;
        synchronized (this.f5175bJ) {
            m3929c = Team.m3929c();
        }
        return m3929c;
    }

    /* renamed from: e */
    public void msgGamePaused(boolean z) {
        this.isGamePaused = z;
        if (this.isGamePaused) {
            sendSystemMessage("Game Paused");
        } else {
            sendSystemMessage("Game unpaused");
        }
    }

    /* renamed from: h */
    public void m1379h(Connection connection) {
        connection.m1279a(false, false);
    }

    /* renamed from: i */
    public void m1373i(Connection connection) {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection2 = (Connection) it.next();
            if (connection2.f5334j == connection) {
                m1379h(connection2);
            }
        }
    }

    /* renamed from: a */
    public Connection m1480a(Connection connection, int i, String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        Connection connection2 = new Connection(this, new C0791h(connection, i));
        connection2.f5352k = i;
        connection2.f5334j = connection;
        connection2.f5336m = str;
        try {
            connection2.m1273d();
            gameEngine.networkEngine.connections.add(connection2);
            gameEngine.networkEngine.m1515M();
            return connection2;
        } catch (IOException e) {
            e.printStackTrace();
            connection2.writeStringPkg("crash");
            return null;
        }
    }

    /* renamed from: a */
    public Connection m1481a(Connection connection, int i) {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            Connection connection2 = (Connection) it.next();
            if (connection2.f5352k == i && connection2.f5334j == connection) {
                return connection2;
            }
        }
        return null;
    }

    /* renamed from: m */
    public static String filterChar(String str) {
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
    public void m1464a(ArrayList arrayList, final boolean z) {
        if (this.f5083bM != null) {
            GameEngine.PrintLOG("startJoinServerInternalThread: Already joining");
        } else if (arrayList.size() == 0) {
            GameEngine.PrintLOG("startJoinServerInternalThread: no servers");
        } else {
            this.f5083bM = m1466a((String) arrayList.get(0), false, new Runnable() { // from class: com.corrodinggames.rts.gameFramework.h.ad.8
                @Override // java.lang.Runnable
                public void run() {
                    GameEngine gameEngine = GameEngine.getInstance();
                    GameEngine.PrintLOG("startJoinServerInternalThread callback");
                    RunnableC0772al runnableC0772al = NetworkEngine.this.f5083bM;
                    NetworkEngine.this.f5083bM = null;
                    if (runnableC0772al == null) {
                        GameEngine.PrintLOG("startJoinServerInternalThread callback gameConnector==null");
                    } else if (runnableC0772al.f5237e != null) {
                        GameEngine.PrintLOG("startJoinServerInternalThread failed to connect: " + runnableC0772al.f5237e);
                        if (z) {
                            gameEngine.networkEngine.disconnect("Reconnect failed: " + runnableC0772al.f5237e);
                            NetworkEngine.this.m1423b("Reconnect failed", "reconnect failed");
                            gameEngine.m830d("Reconnect failed", "Reconnect failed: " + runnableC0772al.f5237e);
                            gameEngine.alertA("Reconnect failed: " + runnableC0772al.f5237e);
                        }
                    } else {
                        try {
                            gameEngine.networkEngine.disconnect("starting new");
                            gameEngine.networkEngine.m1465a(runnableC0772al.f5239g);
                        } catch (IOException e) {
                            gameEngine.showMessageBox(e.getMessage(), "Connection failed");
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }
}
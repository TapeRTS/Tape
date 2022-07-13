package com.corrodinggames.rts.gameFramework.path;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.map.MapLayer;
import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.i.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/l.class */
public final class PathEngine {

    /* renamed from: a */
    static final boolean logging = false;

    /* renamed from: b */
    static boolean f5545b;

    /* renamed from: c */
    static boolean f5546c;

    /* renamed from: d */
    static boolean f5547d;

    /* renamed from: e */
    public static C0819f f5548e;

    /* renamed from: f */
    static boolean f5549f;

    /* renamed from: g */
    static boolean f5550g;

    /* renamed from: h */
    static boolean f5551h;

    /* renamed from: i */
    static int f5552i;

    /* renamed from: j */
    static boolean f5553j;

    /* renamed from: k */
    static ArrayList f5554k;

    /* renamed from: l */
    static boolean f5555l;

    /* renamed from: m */
    public static final boolean f5556m;

    /* renamed from: q */
    Map f5562q;

    /* renamed from: r */
    int f5563r;

    /* renamed from: s */
    short f5564s;

    /* renamed from: t */
    short f5565t;

    /* renamed from: x */
    public C0822i f5566x;

    /* renamed from: y */
    public C0822i f5567y;

    /* renamed from: z */
    public C0822i f5568z;

    /* renamed from: A */
    public C0822i f5557A;

    /* renamed from: B */
    public C0822i f5558B;

    /* renamed from: C */
    public C0822i f5559C;

    /* renamed from: D */
    public C0822i f5560D;

    /* renamed from: E */
    public C0822i f5561E;

    /* renamed from: n */
    public boolean f5569n = true;

    /* renamed from: o */
    RunnableC0828o f5570o = new RunnableC0828o(this);

    /* renamed from: p */
    boolean f5571p = true;

    /* renamed from: u */
    ArrayList f5572u = new ArrayList();

    /* renamed from: v */
    C0822i[] f5573v = new C0822i[0];

    /* renamed from: w */
    public Paint f5574w = new Paint();

    /* renamed from: F */
    Paint f5575F = new Paint();

    /* renamed from: G */
    Object f5576G = new Object();

    /* renamed from: I */
    LinkedList f5577I = new LinkedList();

    /* renamed from: J */
    LinkedList f5578J = new LinkedList();

    /* renamed from: K */
    Object f5579K = new Object();

    /* renamed from: H */
    ArrayList f5580H = new ArrayList();

    static {
        f5545b = !GameEngine.isReleaseVersion;
        f5546c = false;
        f5547d = false;
        f5549f = false;
        f5550g = false;
        f5551h = false;
        f5552i = 20;
        f5553j = false;
        f5554k = new ArrayList();
        f5555l = false;
        f5556m = false;
    }

    /* renamed from: a */
    public C0822i m1104a(MovementType movementType) {
        C0822i[] c0822iArr;
        for (C0822i c0822i : this.f5573v) {
            if (c0822i.type == movementType) {
                return c0822i;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean m1103a(MovementType movementType, int i, int i2) {
        return m1101a(m1104a(movementType), i, i2);
    }

    /* renamed from: b */
    public boolean m1090b(MovementType movementType, int i, int i2) {
        return m1100a(m1104a(movementType), i, i2, true);
    }

    /* renamed from: a */
    public boolean m1101a(C0822i c0822i, int i, int i2) {
        return m1100a(c0822i, i, i2, false);
    }

    /* renamed from: a */
    public boolean m1100a(C0822i c0822i, int i, int i2, boolean z) {
        if (!this.f5562q.isInMap(i, i2)) {
            return true;
        }
        if (c0822i.type == MovementType.f1646d) {
            return false;
        }
        int i3 = (i * this.f5565t) + i2;
        if ((!z && c0822i.f5505e[i3] == -1) || c0822i.f5504d[i3] == -1 || c0822i.f5506f[i3] == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m1089b(C0822i c0822i, int i, int i2) {
        if (!this.f5562q.isInMap(i, i2)) {
            return -1;
        }
        if (c0822i.type == MovementType.f1646d) {
            return 0;
        }
        int i3 = (i * this.f5565t) + i2;
        if (c0822i.f5504d[i3] == -1 || c0822i.f5505e[i3] == -1 || c0822i.f5506f[i3] == -1) {
            return -1;
        }
        return c0822i.f5504d[i3] + c0822i.f5505e[i3] + (c0822i.f5506f[i3] * 10);
    }

    /* renamed from: c */
    public final int m1085c(C0822i c0822i, int i, int i2) {
        if (!this.f5562q.isInMap(i, i2)) {
            return -1;
        }
        if (c0822i.type == MovementType.f1646d) {
            return 4;
        }
        if (c0822i.f5510j == null) {
            return -1;
        }
        return c0822i.f5510j[(i * this.f5565t) + i2];
    }

    /* renamed from: a */
    public boolean m1106a(int i, int i2) {
        if (!this.f5562q.isInMap(i, i2)) {
            return true;
        }
        int i3 = (i * this.f5565t) + i2;
        if (this.f5560D.f5504d[i3] != -1 || this.f5557A.f5504d[i3] == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m1091b(int i, int i2) {
        if (!this.f5562q.isInMap(i, i2)) {
            return true;
        }
        int i3 = (i * this.f5565t) + i2;
        if (this.f5559C.f5504d[i3] != -1 || this.f5561E.f5504d[i3] == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public synchronized void m1105a(Map map, boolean z) {
        m1084d();
        GameEngine.PrintLOG("PathEngine: Setting up map costs");
        boolean z2 = false;
        if (z && this.f5562q != null && this.f5562q == map && this.f5564s == map.mainLayer.width && this.f5565t == map.mainLayer.height) {
            if (this.f5563r == C0822i.m1137a(map)) {
                GameEngine.PrintLOG("PathEngine: Keeping existing map costs");
                z2 = true;
            } else {
                GameEngine.PrintLOG("PathEngine: Error: Map checksum does not match!!!");
            }
        }
        if (z2) {
        }
        this.f5562q = map;
        this.f5563r = C0822i.m1137a(map);
        this.f5564s = (short) map.mainLayer.width;
        this.f5565t = (short) map.mainLayer.height;
        f5548e = null;
        this.f5572u.clear();
        this.f5573v = new C0822i[0];
        this.f5566x = new C0822i(this, MovementType.f1643a, this.f5564s, this.f5565t);
        this.f5567y = new C0822i(this, MovementType.f1644b, this.f5564s, this.f5565t);
        this.f5567y.m1131b();
        this.f5567y.m1134a((OrderableUnit) null);
        this.f5568z = new C0822i(this, MovementType.f1645c, this.f5564s, this.f5565t);
        this.f5557A = new C0822i(this, MovementType.f1647e, this.f5564s, this.f5565t);
        this.f5557A.m1131b();
        this.f5557A.m1134a((OrderableUnit) null);
        this.f5558B = new C0822i(this, MovementType.f1646d, this.f5564s, this.f5565t);
        this.f5559C = new C0822i(this, MovementType.f1648f, this.f5564s, this.f5565t);
        this.f5559C.m1131b();
        this.f5559C.m1134a((OrderableUnit) null);
        this.f5560D = new C0822i(this, MovementType.f1649g, this.f5564s, this.f5565t);
        this.f5560D.m1131b();
        this.f5560D.m1134a((OrderableUnit) null);
        this.f5561E = new C0822i(this, MovementType.f1650h, this.f5564s, this.f5565t);
        this.f5561E.m1131b();
        this.f5561E.m1134a((OrderableUnit) null);
        Iterator it = this.f5580H.iterator();
        while (it.hasNext()) {
            ((RunnableC0828o) it.next()).m1064a(map);
        }
        this.f5570o.m1064a(map);
        GameEngine.PrintLOG("PathEngine: Ready");
    }

    /* renamed from: a */
    public void m1108a() {
        int i;
        int i2;
        int i3;
        GameEngine gameEngine = GameEngine.getInstance();
        C0822i c0822i = this.f5567y;
        Rect rect = new Rect();
        float f = gameEngine.viewpointX_rounded;
        float f2 = gameEngine.viewpointY_rounded;
        float f3 = gameEngine.f5884cz;
        float f4 = gameEngine.f5847cA;
        MapLayer mapLayer = gameEngine.map.mainLayer;
        int i4 = (int) ((f * this.f5562q.f794r) - 1.0f);
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = (int) ((f2 * this.f5562q.f795s) - 1.0f);
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = (int) (((f + f3) * this.f5562q.f794r) + 1.0f);
        if (i6 > this.f5564s - 1) {
            i6 = this.f5564s - 1;
        }
        int i7 = (int) (((f2 + f4) * this.f5562q.f795s) + 1.0f);
        if (i7 > this.f5565t - 1) {
            i7 = this.f5565t - 1;
        }
        for (int i8 = i4; i8 < i6 + 1; i8++) {
            for (int i9 = i5; i9 < i7 + 1; i9++) {
                if (mapLayer.tiles(i8, i9) != null) {
                    int i10 = i8 * this.f5562q.pixel_Width;
                    int i11 = i9 * this.f5562q.pixel_Height;
                    rect.set(i10, i11, i10 + this.f5562q.pixel_Width, i11 + this.f5562q.pixel_Height);
                    rect.m4666a((int) (-f), (int) (-f2));
                    boolean contains = rect.contains((int) (gameEngine.interfaceEngine.gameTouchLastX / gameEngine.viewpointZoom), (int) (gameEngine.interfaceEngine.gameTouchLastY / gameEngine.viewpointZoom));
                    if (!f5550g || contains) {
                        byte b = c0822i.f5504d[(i8 * this.f5565t) + i9];
                        byte b2 = c0822i.f5505e[(i8 * this.f5565t) + i9];
                        int i12 = c0822i.f5506f[(i8 * this.f5565t) + i9];
                        if (b == -1) {
                            i = 255;
                        } else {
                            i = b * 2;
                        }
                        if (b2 == -1) {
                            i2 = 255;
                        } else {
                            i2 = b2 * 2;
                        }
                        if (i12 == -1) {
                            i3 = 255;
                        } else {
                            if (i12 != 0) {
                                i12 += 30;
                            }
                            i3 = i12 * 2;
                        }
                        this.f5575F.m4717a(128, i, i2, i3);
                        gameEngine.graphics.drawRect(rect, this.f5575F);
                        if (contains && c0822i.f5506f != null) {
                            gameEngine.graphics.drawText("o:" + ((int) c0822i.f5506f[(i8 * this.f5565t) + i9]), rect.centerX(), rect.centerY(), gameEngine.f5896dp);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m1102a(OrderableUnit orderableUnit) {
        if (orderableUnit != null) {
            Team.m3936b(orderableUnit);
        }
        for (C0822i c0822i : this.f5573v) {
            c0822i.m1128c(orderableUnit);
        }
        this.f5567y.m1134a(orderableUnit);
        this.f5559C.m1134a(orderableUnit);
        this.f5560D.m1134a(orderableUnit);
        this.f5561E.m1134a(orderableUnit);
    }

    /* renamed from: b */
    public void m1093b() {
        for (C0822i c0822i : this.f5573v) {
            c0822i.m1126e();
        }
    }

    public PathEngine() {
        this.f5580H.add(new RunnableC0828o(this));
        int availableProcessorsCount = CommonUtils.getAvailableProcessorsCount();
        if (availableProcessorsCount > 1) {
            GameEngine.log("PathEngine", "We have " + availableProcessorsCount + " cores, creating extra solvers");
            this.f5580H.add(new RunnableC0828o(this));
        } else {
            GameEngine.log("PathEngine", "We only have one core, using single solver");
        }
        Iterator it = this.f5580H.iterator();
        while (it.hasNext()) {
            ((RunnableC0828o) it.next()).m1056c();
        }
    }

    /* renamed from: c */
    public void m1087c() {
        Iterator it = this.f5577I.iterator();
        while (it.hasNext()) {
            ((C0824k) it.next()).f5540w = true;
        }
        this.f5577I.clear();
        m1079h();
    }

    /* renamed from: d */
    public void m1084d() {
        Iterator it = this.f5577I.iterator();
        while (it.hasNext()) {
            m1098a((C0824k) it.next());
        }
        this.f5577I.clear();
        m1079h();
    }

    /* renamed from: a */
    public void m1099a(C0822i c0822i, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!z) {
            if (c0822i.f5515k + 50 < gameEngine.frameNumber) {
                c0822i.f5515k = gameEngine.frameNumber - 40;
                c0822i.m1126e();
            }
            c0822i.m1132a(z);
            return;
        }
        if (c0822i.f5515k + 30 < gameEngine.frameNumber) {
            c0822i.f5515k = gameEngine.frameNumber;
            c0822i.m1126e();
        }
        c0822i.m1132a(z);
    }

    /* renamed from: a */
    public C0824k m1094a(boolean z) {
        C0819f c0819f;
        if (OrderableUnit.f3724E) {
            c0819f = new C0819f(this, z);
        } else {
            c0819f = new C0824k(this, z);
        }
        return c0819f;
    }

    /* renamed from: a */
    public void m1097a(C0824k c0824k, boolean z) {
        m1096a(c0824k, z, false);
    }

    /* renamed from: a */
    public void m1096a(C0824k c0824k, boolean z, boolean z2) {
        if (!this.f5571p) {
            GameEngine.log("PathEngine", "Cannot start new path, not running");
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        m1099a(m1104a(c0824k.f5532o), z);
        c0824k.m1112e();
        c0824k.f5537t = 300.0f;
        int absi = CommonUtils.absi(c0824k.f5525h - c0824k.f5529l);
        int absi2 = CommonUtils.absi(c0824k.f5526i - c0824k.f5530m);
        if (absi < 15 && absi2 < 15) {
            c0824k.f5537t = 12.0f;
        } else if (absi < 50 && absi2 < 50) {
            c0824k.f5537t = 16.0f;
        } else if (absi < 200 && absi2 < 200) {
            c0824k.f5537t = 24.0f;
        } else if (absi < 400 && absi2 < 400) {
            c0824k.f5537t = 50.0f;
        } else if (absi < 1000 && absi2 < 1000) {
            c0824k.f5537t = 100.0f;
        } else if (absi < 2000 && absi2 < 2000) {
            c0824k.f5537t = 200.0f;
        }
        if (!gameEngine.networkEngine.networked && !gameEngine.replayEngine.m2303g()) {
            if (absi < 1000 && absi2 < 1000) {
                c0824k.f5537t = 180.0f;
            } else {
                c0824k.f5537t = 360.0f;
            }
        }
        if (c0824k.f5535r) {
            c0824k.f5537t *= 2.0f;
            c0824k.f5537t += 50.0f;
        }
        c0824k.f5536s = c0824k.f5537t;
        if (!this.f5569n || z2) {
            this.f5570o.m1061a(c0824k);
            this.f5570o.m1058b();
            this.f5577I.add(c0824k);
            return;
        }
        m1088b(c0824k);
        this.f5577I.add(c0824k);
    }

    /* renamed from: a */
    public void m1107a(float f) {
        m1078i();
    }

    /* renamed from: b */
    public void m1092b(float f) {
        C0822i[] c0822iArr;
        for (C0822i c0822i : this.f5573v) {
            c0822i.f5513p = 0;
            if (c0822i.f5512o) {
                c0822i.f5512o = false;
                c0822i.m1128c(null);
            }
        }
        m1078i();
        m1083d(f);
    }

    /* renamed from: c */
    public void m1086c(float f) {
        if (f5553j) {
            Iterator it = f5554k.iterator();
            while (it.hasNext()) {
                C0824k c0824k = (C0824k) it.next();
                c0824k.m1109h();
                c0824k.m1110g();
            }
        }
        if (f5547d) {
            boolean z = true;
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.interfaceEngine.f4809bJ.f6333b > 0) {
                Unit m484a = gameEngine.interfaceEngine.f4809bJ.m484a(0);
                if (m484a instanceof OrderableUnit) {
                    OrderableUnit orderableUnit = (OrderableUnit) m484a;
                    if (orderableUnit.f3698an != null) {
                        orderableUnit.f3698an.mo1140d(orderableUnit);
                        z = false;
                    }
                }
            }
            if (z) {
            }
        }
        if (f5549f) {
            m1108a();
        }
        if (f5551h) {
        }
    }

    /* renamed from: e */
    public boolean m1082e() {
        Iterator it = this.f5577I.iterator();
        while (it.hasNext()) {
            C0824k c0824k = (C0824k) it.next();
            if (c0824k.f5537t <= 0.0f && !c0824k.mo1113c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String m1081f() {
        Iterator it = this.f5577I.iterator();
        String str = null;
        int i = 0;
        while (it.hasNext()) {
            C0824k c0824k = (C0824k) it.next();
            if (c0824k.f5537t <= 0.0f && !c0824k.mo1113c()) {
                if (str == null) {
                    str = "[distance:" + CommonUtils.m1691b(c0824k.f5525h, c0824k.f5526i, c0824k.f5529l, c0824k.f5530m) + ", allowedDelay:" + c0824k.f5536s + " lowPriority:" + c0824k.f5535r + "]";
                }
                i++;
            }
        }
        String str2 = "(total:" + i + ") ";
        if (str != null) {
            str2 = str2 + str;
        }
        return str2;
    }

    /* renamed from: d */
    private void m1083d(float f) {
        Iterator it = this.f5577I.iterator();
        while (it.hasNext()) {
            C0824k c0824k = (C0824k) it.next();
            if (c0824k.f5537t <= 0.0f) {
                c0824k.f5537t = 0.0f;
                c0824k.f5538u = true;
                if (f5553j) {
                    f5554k.add(c0824k);
                    if (f5554k.size() > 10) {
                        f5554k.remove(0);
                    }
                }
                if (!c0824k.mo1113c()) {
                    if (GameEngine.getInstance().m857au()) {
                        GameEngine.log("PathEngine", "updateUnfinishedPaths: path wasn't solved, isGoingToBlockThisFrame did not protect");
                    }
                    m1098a(c0824k);
                }
                if (c0824k.mo1113c()) {
                    it.remove();
                }
            } else {
                c0824k.f5537t -= f;
            }
        }
    }

    /* renamed from: g */
    private C0824k m1080g() {
        C0824k c0824k = null;
        Iterator it = this.f5578J.iterator();
        while (it.hasNext()) {
            C0824k c0824k2 = (C0824k) it.next();
            if (c0824k == null || c0824k.f5537t > c0824k2.f5537t) {
                c0824k = c0824k2;
            }
        }
        if (c0824k == null) {
            throw new RuntimeException("Failed to find any paths");
        }
        if (!this.f5578J.remove(c0824k)) {
            throw new RuntimeException("Failed remove found path");
        }
        return c0824k;
    }

    /* renamed from: b */
    private void m1088b(C0824k c0824k) {
        synchronized (this.f5579K) {
            this.f5578J.add(c0824k);
        }
    }

    /* renamed from: h */
    private void m1079h() {
        synchronized (this.f5579K) {
            this.f5578J.clear();
        }
    }

    /* renamed from: i */
    private void m1078i() {
        RunnableC0828o m1077j;
        LinkedList linkedList = this.f5578J;
        if (linkedList.size() > 0) {
            synchronized (this.f5579K) {
                while (linkedList.size() > 0 && (m1077j = m1077j()) != null) {
                    C0824k m1080g = m1080g();
                    if (!m1080g.f5539v) {
                        m1095a(m1077j, m1080g);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private RunnableC0828o m1077j() {
        Iterator it = this.f5580H.iterator();
        while (it.hasNext()) {
            RunnableC0828o runnableC0828o = (RunnableC0828o) it.next();
            if (runnableC0828o.f5615s) {
                return runnableC0828o;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m1098a(C0824k c0824k) {
        RunnableC0828o m1077j;
        if (!c0824k.f5539v) {
            while (true) {
                synchronized (this.f5576G) {
                    m1077j = m1077j();
                    if (m1077j != null) {
                        break;
                    }
                    try {
                        this.f5576G.wait(2000L);
                    } catch (InterruptedException e) {
                    }
                }
            }
            m1095a(m1077j, c0824k);
        }
        boolean z = false;
        long curTimeMs = GameEngine.curTimeMs();
        while (true) {
            synchronized (this.f5576G) {
                if (c0824k.mo1113c()) {
                    break;
                }
                z = true;
                m1078i();
                try {
                    this.f5576G.wait(2000L);
                } catch (InterruptedException e2) {
                }
            }
            if (!z && f5545b) {
                GameEngine.log("PathEngine", "We were blocked path(" + c0824k.f5523e + ") for:" + (GameEngine.curTimeMs() - curTimeMs));
                return;
            }
        }
        if (!z) {
        }
    }

    /* renamed from: a */
    private void m1095a(RunnableC0828o runnableC0828o, C0824k c0824k) {
        synchronized (c0824k) {
            if (!c0824k.f5539v) {
                runnableC0828o.m1061a(c0824k);
                runnableC0828o.m1067a();
            }
        }
    }
}
package com.corrodinggames.rts.gameFramework.p042j;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0178e;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/l.class */
public final class C0907l {

    /* renamed from: a */
    static final boolean f5993a = false;

    /* renamed from: b */
    static boolean f5994b;

    /* renamed from: c */
    static boolean f5995c;

    /* renamed from: d */
    static boolean f5996d;

    /* renamed from: e */
    public static C0901f f5997e;

    /* renamed from: f */
    static boolean f5998f;

    /* renamed from: g */
    static boolean f5999g;

    /* renamed from: h */
    static boolean f6000h;

    /* renamed from: i */
    static int f6001i;

    /* renamed from: j */
    static boolean f6002j;

    /* renamed from: k */
    static ArrayList f6003k;

    /* renamed from: l */
    static boolean f6004l;

    /* renamed from: m */
    public static final boolean f6005m;

    /* renamed from: q */
    C0173b f6006q;

    /* renamed from: r */
    int f6007r;

    /* renamed from: s */
    short f6008s;

    /* renamed from: t */
    short f6009t;

    /* renamed from: x */
    public C0904i f6010x;

    /* renamed from: y */
    public C0904i f6011y;

    /* renamed from: z */
    public C0904i f6012z;

    /* renamed from: A */
    public C0904i f6013A;

    /* renamed from: B */
    public C0904i f6014B;

    /* renamed from: C */
    public C0904i f6015C;

    /* renamed from: D */
    public C0904i f6016D;

    /* renamed from: E */
    public C0904i f6017E;

    /* renamed from: n */
    public boolean f6018n = true;

    /* renamed from: o */
    RunnableC0910o f6019o = new RunnableC0910o(this);

    /* renamed from: p */
    boolean f6020p = true;

    /* renamed from: u */
    ArrayList f6021u = new ArrayList();

    /* renamed from: v */
    C0904i[] f6022v = new C0904i[0];

    /* renamed from: w */
    public Paint f6023w = new Paint();

    /* renamed from: F */
    Paint f6024F = new Paint();

    /* renamed from: G */
    Object f6025G = new Object();

    /* renamed from: I */
    LinkedList f6026I = new LinkedList();

    /* renamed from: J */
    LinkedList f6027J = new LinkedList();

    /* renamed from: K */
    Object f6028K = new Object();

    /* renamed from: H */
    ArrayList f6029H = new ArrayList();

    static {
        f5994b = !GameEngine.f6184as;
        f5995c = false;
        f5996d = false;
        f5998f = false;
        f5999g = false;
        f6000h = false;
        f6001i = 20;
        f6002j = false;
        f6003k = new ArrayList();
        f6004l = false;
        f6005m = false;
    }

    /* renamed from: a */
    public C0904i m1314a(EnumC0246ao enumC0246ao) {
        C0904i[] c0904iArr;
        for (C0904i c0904i : this.f6022v) {
            if (c0904i.f5951a == enumC0246ao) {
                return c0904i;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean m1313a(EnumC0246ao enumC0246ao, int i, int i2) {
        return m1311a(m1314a(enumC0246ao), i, i2);
    }

    /* renamed from: b */
    public boolean m1300b(EnumC0246ao enumC0246ao, int i, int i2) {
        return m1310a(m1314a(enumC0246ao), i, i2, true);
    }

    /* renamed from: a */
    public boolean m1311a(C0904i c0904i, int i, int i2) {
        return m1310a(c0904i, i, i2, false);
    }

    /* renamed from: a */
    public boolean m1310a(C0904i c0904i, int i, int i2, boolean z) {
        if (!this.f6006q.m6608c(i, i2)) {
            return true;
        }
        if (c0904i.f5951a == EnumC0246ao.f1705d) {
            return false;
        }
        int i3 = (i * this.f6009t) + i2;
        if ((!z && c0904i.f5955e[i3] == -1) || c0904i.f5954d[i3] == -1 || c0904i.f5956f[i3] == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m1299b(C0904i c0904i, int i, int i2) {
        if (!this.f6006q.m6608c(i, i2)) {
            return -1;
        }
        if (c0904i.f5951a == EnumC0246ao.f1705d) {
            return 0;
        }
        int i3 = (i * this.f6009t) + i2;
        if (c0904i.f5954d[i3] == -1 || c0904i.f5955e[i3] == -1 || c0904i.f5956f[i3] == -1) {
            return -1;
        }
        return c0904i.f5954d[i3] + c0904i.f5955e[i3] + (c0904i.f5956f[i3] * 10);
    }

    /* renamed from: c */
    public final int m1295c(C0904i c0904i, int i, int i2) {
        if (!this.f6006q.m6608c(i, i2)) {
            return -1;
        }
        if (c0904i.f5951a == EnumC0246ao.f1705d) {
            return 4;
        }
        if (c0904i.f5960j == null) {
            return -1;
        }
        return c0904i.f5960j[(i * this.f6009t) + i2];
    }

    /* renamed from: a */
    public boolean m1316a(int i, int i2) {
        if (!this.f6006q.m6608c(i, i2)) {
            return true;
        }
        int i3 = (i * this.f6009t) + i2;
        if (this.f6016D.f5954d[i3] != -1 || this.f6013A.f5954d[i3] == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m1301b(int i, int i2) {
        if (!this.f6006q.m6608c(i, i2)) {
            return true;
        }
        int i3 = (i * this.f6009t) + i2;
        if (this.f6015C.f5954d[i3] != -1 || this.f6017E.f5954d[i3] == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public synchronized void m1315a(C0173b c0173b, boolean z) {
        m1294d();
        GameEngine.PrintLog("PathEngine: Setting up map costs");
        boolean z2 = false;
        if (z && this.f6006q != null && this.f6006q == c0173b && this.f6008s == c0173b.f832u.f903n && this.f6009t == c0173b.f832u.f904o) {
            if (this.f6007r == C0904i.m1347a(c0173b)) {
                GameEngine.PrintLog("PathEngine: Keeping existing map costs");
                z2 = true;
            } else {
                GameEngine.PrintLog("PathEngine: Error: Map checksum does not match!!!");
            }
        }
        if (z2) {
        }
        this.f6006q = c0173b;
        this.f6007r = C0904i.m1347a(c0173b);
        this.f6008s = (short) c0173b.f832u.f903n;
        this.f6009t = (short) c0173b.f832u.f904o;
        f5997e = null;
        this.f6021u.clear();
        this.f6022v = new C0904i[0];
        this.f6010x = new C0904i(this, EnumC0246ao.f1702a, this.f6008s, this.f6009t);
        this.f6011y = new C0904i(this, EnumC0246ao.f1703b, this.f6008s, this.f6009t);
        this.f6011y.m1341b();
        this.f6011y.m1344a((AbstractC0623y) null);
        this.f6012z = new C0904i(this, EnumC0246ao.f1704c, this.f6008s, this.f6009t);
        this.f6013A = new C0904i(this, EnumC0246ao.f1706e, this.f6008s, this.f6009t);
        this.f6013A.m1341b();
        this.f6013A.m1344a((AbstractC0623y) null);
        this.f6014B = new C0904i(this, EnumC0246ao.f1705d, this.f6008s, this.f6009t);
        this.f6015C = new C0904i(this, EnumC0246ao.f1707f, this.f6008s, this.f6009t);
        this.f6015C.m1341b();
        this.f6015C.m1344a((AbstractC0623y) null);
        this.f6016D = new C0904i(this, EnumC0246ao.f1708g, this.f6008s, this.f6009t);
        this.f6016D.m1341b();
        this.f6016D.m1344a((AbstractC0623y) null);
        this.f6017E = new C0904i(this, EnumC0246ao.f1709h, this.f6008s, this.f6009t);
        this.f6017E.m1341b();
        this.f6017E.m1344a((AbstractC0623y) null);
        Iterator it = this.f6029H.iterator();
        while (it.hasNext()) {
            ((RunnableC0910o) it.next()).m1274a(c0173b);
        }
        this.f6019o.m1274a(c0173b);
        GameEngine.PrintLog("PathEngine: Ready");
    }

    /* renamed from: a */
    public void m1318a() {
        int i;
        int i2;
        int i3;
        GameEngine gameEngine = GameEngine.getInstance();
        C0904i c0904i = this.f6011y;
        Rect rect = new Rect();
        float f = gameEngine.f6138cv;
        float f2 = gameEngine.f6139cw;
        float f3 = gameEngine.f6142cz;
        float f4 = gameEngine.f6143cA;
        C0178e c0178e = gameEngine.f6104bL.f832u;
        int i4 = (int) ((f * this.f6006q.f788r) - 1.0f);
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = (int) ((f2 * this.f6006q.f789s) - 1.0f);
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = (int) (((f + f3) * this.f6006q.f788r) + 1.0f);
        if (i6 > this.f6008s - 1) {
            i6 = this.f6008s - 1;
        }
        int i7 = (int) (((f2 + f4) * this.f6006q.f789s) + 1.0f);
        if (i7 > this.f6009t - 1) {
            i7 = this.f6009t - 1;
        }
        for (int i8 = i4; i8 < i6 + 1; i8++) {
            for (int i9 = i5; i9 < i7 + 1; i9++) {
                if (c0178e.m6560a(i8, i9) != null) {
                    int i10 = i8 * this.f6006q.f784n;
                    int i11 = i9 * this.f6006q.f785o;
                    rect.m7208a(i10, i11, i10 + this.f6006q.f784n, i11 + this.f6006q.f785o);
                    rect.m7209a((int) (-f), (int) (-f2));
                    boolean m7205b = rect.m7205b((int) (gameEngine.f6111bS.f5203s / gameEngine.f6250cW), (int) (gameEngine.f6111bS.f5204t / gameEngine.f6250cW));
                    if (!f5999g || m7205b) {
                        byte b = c0904i.f5954d[(i8 * this.f6009t) + i9];
                        byte b2 = c0904i.f5955e[(i8 * this.f6009t) + i9];
                        int i12 = c0904i.f5956f[(i8 * this.f6009t) + i9];
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
                        this.f6024F.m7267a(128, i, i2, i3);
                        gameEngine.graphics.mo892b(rect, this.f6024F);
                        if (m7205b && c0904i.f5956f != null) {
                            gameEngine.graphics.mo903a("o:" + ((int) c0904i.f5956f[(i8 * this.f6009t) + i9]), rect.m7201d(), rect.m7200e(), gameEngine.f6163do);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m1312a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y != null) {
            Team.m6365b(abstractC0623y);
        }
        for (C0904i c0904i : this.f6022v) {
            c0904i.m1338c(abstractC0623y);
        }
        this.f6011y.m1344a(abstractC0623y);
        this.f6015C.m1344a(abstractC0623y);
        this.f6016D.m1344a(abstractC0623y);
        this.f6017E.m1344a(abstractC0623y);
    }

    /* renamed from: b */
    public void m1303b() {
        for (C0904i c0904i : this.f6022v) {
            c0904i.m1336e();
        }
    }

    public C0907l() {
        this.f6029H.add(new RunnableC0910o(this));
        int m2296c = CommonUtils.m2296c();
        if (m2296c > 1) {
            GameEngine.m1144b("PathEngine", "We have " + m2296c + " cores, creating extra solvers");
            this.f6029H.add(new RunnableC0910o(this));
        } else {
            GameEngine.m1144b("PathEngine", "We only have one core, using single solver");
        }
        Iterator it = this.f6029H.iterator();
        while (it.hasNext()) {
            ((RunnableC0910o) it.next()).m1266c();
        }
    }

    /* renamed from: c */
    public void m1297c() {
        Iterator it = this.f6026I.iterator();
        while (it.hasNext()) {
            ((C0906k) it.next()).f5986w = true;
        }
        this.f6026I.clear();
        m1289h();
    }

    /* renamed from: d */
    public void m1294d() {
        Iterator it = this.f6026I.iterator();
        while (it.hasNext()) {
            m1308a((C0906k) it.next());
        }
        this.f6026I.clear();
        m1289h();
    }

    /* renamed from: a */
    public void m1309a(C0904i c0904i, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!z) {
            if (c0904i.f5964k + 50 < gameEngine.f6233bx) {
                c0904i.f5964k = gameEngine.f6233bx - 40;
                c0904i.m1336e();
            }
            c0904i.m1342a(z);
            return;
        }
        if (c0904i.f5964k + 30 < gameEngine.f6233bx) {
            c0904i.f5964k = gameEngine.f6233bx;
            c0904i.m1336e();
        }
        c0904i.m1342a(z);
    }

    /* renamed from: a */
    public C0906k m1304a(boolean z) {
        C0901f c0906k;
        if (AbstractC0623y.f3991K) {
            c0906k = new C0901f(this, z);
        } else {
            c0906k = new C0906k(this, z);
        }
        return c0906k;
    }

    /* renamed from: a */
    public void m1307a(C0906k c0906k, boolean z) {
        m1306a(c0906k, z, false);
    }

    /* renamed from: a */
    public void m1306a(C0906k c0906k, boolean z, boolean z2) {
        if (!this.f6020p) {
            GameEngine.m1144b("PathEngine", "Cannot start new path, not running");
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        m1309a(m1314a(c0906k.f5978o), z);
        c0906k.m1322e();
        c0906k.f5983t = 300.0f;
        int m2279d = CommonUtils.m2279d(c0906k.f5971h - c0906k.f5975l);
        int m2279d2 = CommonUtils.m2279d(c0906k.f5972i - c0906k.f5976m);
        if (m2279d < 15 && m2279d2 < 15) {
            c0906k.f5983t = 12.0f;
        } else if (m2279d < 50 && m2279d2 < 50) {
            c0906k.f5983t = 16.0f;
        } else if (m2279d < 200 && m2279d2 < 200) {
            c0906k.f5983t = 24.0f;
        } else if (m2279d < 400 && m2279d2 < 400) {
            c0906k.f5983t = 50.0f;
        } else if (m2279d < 1000 && m2279d2 < 1000) {
            c0906k.f5983t = 100.0f;
        } else if (m2279d < 2000 && m2279d2 < 2000) {
            c0906k.f5983t = 200.0f;
        }
        if (!gameEngine.networkEngine.f5564B && !gameEngine.f6120cb.m2636g()) {
            if (m2279d < 1000 && m2279d2 < 1000) {
                c0906k.f5983t = 180.0f;
            } else {
                c0906k.f5983t = 360.0f;
            }
        }
        if (c0906k.f5981r) {
            c0906k.f5983t *= 2.0f;
            c0906k.f5983t += 50.0f;
        }
        c0906k.f5982s = c0906k.f5983t;
        if (!this.f6018n || z2) {
            this.f6019o.m1271a(c0906k);
            this.f6019o.m1268b();
            this.f6026I.add(c0906k);
            return;
        }
        m1298b(c0906k);
        this.f6026I.add(c0906k);
    }

    /* renamed from: a */
    public void m1317a(float f) {
        m1288i();
    }

    /* renamed from: b */
    public void m1302b(float f) {
        C0904i[] c0904iArr;
        for (C0904i c0904i : this.f6022v) {
            c0904i.f5963p = 0;
            if (c0904i.f5962o) {
                c0904i.f5962o = false;
                c0904i.m1338c(null);
            }
        }
        m1288i();
        m1293d(f);
    }

    /* renamed from: c */
    public void m1296c(float f) {
        if (f6002j) {
            Iterator it = f6003k.iterator();
            while (it.hasNext()) {
                C0906k c0906k = (C0906k) it.next();
                c0906k.m1319h();
                c0906k.m1320g();
            }
        }
        if (f5996d) {
            boolean z = true;
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.f6111bS.f5255bL.f6916b > 0) {
                Unit m522a = gameEngine.f6111bS.f5255bL.m522a(0);
                if (m522a instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) m522a;
                    if (abstractC0623y.f3932at != null) {
                        abstractC0623y.f3932at.mo1380d(abstractC0623y);
                        z = false;
                    }
                }
            }
            if (z) {
            }
        }
        if (f5998f) {
            m1318a();
        }
        if (f6000h) {
        }
    }

    /* renamed from: e */
    public boolean m1292e() {
        Iterator it = this.f6026I.iterator();
        while (it.hasNext()) {
            C0906k c0906k = (C0906k) it.next();
            if (c0906k.f5983t <= 0.0f && !c0906k.m1323c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String m1291f() {
        Iterator it = this.f6026I.iterator();
        String str = null;
        int i = 0;
        while (it.hasNext()) {
            C0906k c0906k = (C0906k) it.next();
            if (c0906k.f5983t <= 0.0f && !c0906k.m1323c()) {
                if (str == null) {
                    str = "[distance:" + CommonUtils.m2314b(c0906k.f5971h, c0906k.f5972i, c0906k.f5975l, c0906k.f5976m) + ", allowedDelay:" + c0906k.f5982s + " lowPriority:" + c0906k.f5981r + "]";
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
    private void m1293d(float f) {
        Iterator it = this.f6026I.iterator();
        while (it.hasNext()) {
            C0906k c0906k = (C0906k) it.next();
            if (c0906k.f5983t <= 0.0f) {
                c0906k.f5983t = 0.0f;
                c0906k.f5984u = true;
                if (f6002j) {
                    f6003k.add(c0906k);
                    if (f6003k.size() > 10) {
                        f6003k.remove(0);
                    }
                }
                if (!c0906k.m1323c()) {
                    if (GameEngine.getInstance().m1154ax()) {
                        GameEngine.m1144b("PathEngine", "updateUnfinishedPaths: path wasn't solved, isGoingToBlockThisFrame did not protect");
                    }
                    m1308a(c0906k);
                }
                if (c0906k.m1323c()) {
                    it.remove();
                }
            } else {
                c0906k.f5983t -= f;
            }
        }
    }

    /* renamed from: g */
    private C0906k m1290g() {
        C0906k c0906k = null;
        Iterator it = this.f6027J.iterator();
        while (it.hasNext()) {
            C0906k c0906k2 = (C0906k) it.next();
            if (c0906k == null || c0906k.f5983t > c0906k2.f5983t) {
                c0906k = c0906k2;
            }
        }
        if (c0906k == null) {
            throw new RuntimeException("Failed to find any paths");
        }
        if (!this.f6027J.remove(c0906k)) {
            throw new RuntimeException("Failed remove found path");
        }
        return c0906k;
    }

    /* renamed from: b */
    private void m1298b(C0906k c0906k) {
        synchronized (this.f6028K) {
            this.f6027J.add(c0906k);
        }
    }

    /* renamed from: h */
    private void m1289h() {
        synchronized (this.f6028K) {
            this.f6027J.clear();
        }
    }

    /* renamed from: i */
    private void m1288i() {
        RunnableC0910o m1287j;
        LinkedList linkedList = this.f6027J;
        if (linkedList.size() > 0) {
            synchronized (this.f6028K) {
                while (linkedList.size() > 0 && (m1287j = m1287j()) != null) {
                    C0906k m1290g = m1290g();
                    if (!m1290g.f5985v) {
                        m1305a(m1287j, m1290g);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private RunnableC0910o m1287j() {
        Iterator it = this.f6029H.iterator();
        while (it.hasNext()) {
            RunnableC0910o runnableC0910o = (RunnableC0910o) it.next();
            if (runnableC0910o.f6058s) {
                return runnableC0910o;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m1308a(C0906k c0906k) {
        RunnableC0910o m1287j;
        if (!c0906k.f5985v) {
            while (true) {
                synchronized (this.f6025G) {
                    m1287j = m1287j();
                    if (m1287j != null) {
                        break;
                    }
                    try {
                        this.f6025G.wait(2000L);
                    } catch (InterruptedException e) {
                    }
                }
            }
            m1305a(m1287j, c0906k);
        }
        boolean z = false;
        long m1214U = GameEngine.m1214U();
        while (true) {
            synchronized (this.f6025G) {
                if (c0906k.m1323c()) {
                    break;
                }
                z = true;
                m1288i();
                try {
                    this.f6025G.wait(2000L);
                } catch (InterruptedException e2) {
                }
            }
            if (!z && f5994b) {
                GameEngine.m1144b("PathEngine", "We were blocked path(" + c0906k.f5968e + ") for:" + (GameEngine.m1214U() - m1214U));
                return;
            }
        }
        if (!z) {
        }
    }

    /* renamed from: a */
    private void m1305a(RunnableC0910o runnableC0910o, C0906k c0906k) {
        synchronized (c0906k) {
            if (!c0906k.f5985v) {
                runnableC0910o.m1271a(c0906k);
                runnableC0910o.m1277a();
            }
        }
    }
}

package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.C0546g;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.buildings.InterfaceC0501l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0215j;
import com.corrodinggames.rts.gameFramework.p037f.C0785ad;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e.class */
public class C0749e {

    /* renamed from: a */
    public boolean f4832a;

    /* renamed from: b */
    public String f4833b;

    /* renamed from: c */
    public int f4834c;

    /* renamed from: d */
    public int f4835d;

    /* renamed from: i */
    public Team f4836i;

    /* renamed from: j */
    public C0305au f4837j;

    /* renamed from: l */
    public PointF f4838l;

    /* renamed from: m */
    public Unit f4839m;

    /* renamed from: n */
    public EnumC0205a f4840n;

    /* renamed from: z */
    private PointF f4841z;

    /* renamed from: p */
    public Team f4842p;

    /* renamed from: q */
    public short f4843q;

    /* renamed from: r */
    public boolean f4844r;

    /* renamed from: s */
    public float f4845s;

    /* renamed from: t */
    public float f4846t;

    /* renamed from: u */
    public int f4847u;

    /* renamed from: y */
    final /* synthetic */ C0736c f4848y;

    /* renamed from: e */
    public boolean f4849e = false;

    /* renamed from: f */
    public boolean f4850f = false;

    /* renamed from: g */
    public boolean f4851g = false;

    /* renamed from: h */
    public boolean f4852h = false;

    /* renamed from: k */
    public C0208c f4853k = Action.f1461i;

    /* renamed from: o */
    public boolean f4854o = false;

    /* renamed from: A */
    private C1101m f4855A = new C1101m();

    /* renamed from: v */
    C1101m f4856v = new C1101m();

    /* renamed from: w */
    C1101m f4857w = new C1101m();

    /* renamed from: x */
    public boolean f4858x = false;

    public C0749e(C0736c c0736c) {
        this.f4848y = c0736c;
    }

    /* renamed from: a */
    public boolean m2502a() {
        Iterator it = this.f4857w.iterator();
        while (it.hasNext()) {
            if (((C0740d) it.next()).f4633a.m1332a() == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public void m2487b() {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f4858x = true;
        C0637ab m2978c = gameEngine.f6114bV.m2978c();
        Iterator it = this.f4856v.iterator();
        while (it.hasNext()) {
            m2978c.f4069a.add((AbstractC0623y) it.next());
        }
        if (this.f4837j != null) {
            float m5670g = this.f4837j.m5670g();
            float m5668h = this.f4837j.m5668h();
            if (this.f4837j.m5676d() != EnumC0306av.f1810a && this.f4837j.m5676d() != EnumC0306av.f1817h && this.f4837j.m5676d() != EnumC0306av.f1811b) {
                return;
            }
            Iterator it2 = m2978c.m2976a(m5670g, m5668h, this.f4837j.f1802j).iterator();
            while (it2.hasNext()) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) it2.next();
                if (!abstractC0623y.m3169aK() && abstractC0623y.mo3295I() && (!this.f4849e || abstractC0623y.m3135ar() == null)) {
                    int i = 0;
                    if (this.f4837j.m5676d() == EnumC0306av.f1811b) {
                        i = abstractC0623y.m3026q(this.f4837j.m5666i());
                    }
                    C0740d c0740d = new C0740d();
                    c0740d.f4634b = abstractC0623y.f6945ed;
                    c0740d.f4635c = abstractC0623y.f6951ek;
                    c0740d.f4636d = abstractC0623y.f6952el;
                    c0740d.f4637e = m5670g;
                    c0740d.f4638f = m5668h;
                    c0740d.f4639g = gameEngine.f6233bx;
                    c0740d.f4640h = abstractC0623y.mo5645h();
                    c0740d.f4633a = abstractC0623y.m3222a(m5670g, m5668h, i, true, false, false);
                    c0740d.f4633a.f5983t = 120.0f;
                    c0740d.f4633a.f5982s = c0740d.f4633a.f5983t;
                    c0740d.f4633a.f5984u = true;
                    this.f4857w.add(c0740d);
                }
            }
        }
    }

    /* renamed from: c */
    public Team m2484c() {
        return this.f4836i;
    }

    /* renamed from: d */
    public int m2481d() {
        return this.f4855A.size() + this.f4856v.size();
    }

    /* renamed from: e */
    public boolean m2479e() {
        if (!Action.m6080c(this.f4853k) && m2481d() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public synchronized C0749e m2477f() {
        try {
            C0859ar c0859ar = new C0859ar();
            m2490a(c0859ar);
            C0876k c0876k = new C0876k(c0859ar.m1552d());
            C0749e c0749e = new C0749e(this.f4848y);
            c0749e.f4834c = this.f4834c;
            c0749e.m2489a(c0876k);
            return c0749e;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public void m2475g() {
        if (this.f4837j != null) {
            Iterator it = this.f4856v.iterator();
            while (it.hasNext()) {
                this.f4855A.add(Long.valueOf(((AbstractC0623y) it.next()).f6945ed));
            }
            this.f4856v.clear();
            this.f4837j.m5664k();
        }
    }

    /* renamed from: a */
    public synchronized void m2490a(C0859ar c0859ar) {
        c0859ar.m1549e("c");
        c0859ar.m1554c(this.f4836i.f1305k);
        c0859ar.mo1482a(this.f4837j != null);
        if (this.f4837j != null) {
            this.f4837j.m5686a(c0859ar);
        }
        c0859ar.mo1482a(this.f4849e);
        c0859ar.mo1482a(this.f4851g);
        c0859ar.mo1487a(-1);
        c0859ar.m1564a(this.f4840n);
        c0859ar.mo1482a(this.f4841z != null);
        if (this.f4841z != null) {
            c0859ar.mo1488a(this.f4841z.x);
            c0859ar.mo1488a(this.f4841z.y);
        }
        c0859ar.mo1482a(this.f4854o);
        c0859ar.mo1487a(this.f4856v.size() + this.f4855A.size());
        Iterator it = this.f4856v.iterator();
        while (it.hasNext()) {
            c0859ar.m1577a(((AbstractC0623y) it.next()).f6945ed);
        }
        Iterator it2 = this.f4855A.iterator();
        while (it2.hasNext()) {
            c0859ar.m1577a(((Long) it2.next()).longValue());
        }
        c0859ar.mo1482a(this.f4842p != null);
        if (this.f4842p != null) {
            c0859ar.m1575a(this.f4842p);
        }
        c0859ar.mo1482a(this.f4838l != null);
        if (this.f4838l != null) {
            c0859ar.mo1488a(this.f4838l.x);
            c0859ar.mo1488a(this.f4838l.y);
        }
        c0859ar.mo1486a(this.f4839m);
        c0859ar.m1553c(this.f4853k.m6284a());
        c0859ar.mo1482a(this.f4850f);
        c0859ar.mo1483a(this.f4843q);
        c0859ar.mo1482a(this.f4844r);
        if (this.f4844r) {
            c0859ar.m1554c(0);
            c0859ar.mo1488a(this.f4845s);
            c0859ar.mo1488a(this.f4846t);
            c0859ar.mo1487a(this.f4847u);
        }
        c0859ar.mo1487a(this.f4857w.size());
        for (int i = 0; i < this.f4857w.size(); i++) {
            ((C0740d) this.f4857w.get(i)).m2583a(c0859ar);
        }
        c0859ar.mo1482a(this.f4852h);
        c0859ar.mo1485a("c");
    }

    /* renamed from: a */
    public void m2489a(C0876k c0876k) {
        c0876k.m1460b("c");
        this.f4836i = Team.m6317k(c0876k.m1457d());
        if (this.f4836i == null) {
            throw new IOException("team==null");
        }
        if (c0876k.m1455e()) {
            this.f4837j = new C0305au();
            this.f4837j.m5685a(c0876k);
        }
        this.f4849e = c0876k.m1455e();
        this.f4851g = c0876k.m1455e();
        this.f4853k = C0208c.m6280a(String.valueOf(c0876k.m1454f()));
        this.f4840n = (EnumC0205a) c0876k.m1461b(EnumC0205a.class);
        if (c0876k.m1455e()) {
            this.f4841z = new PointF();
            this.f4841z.x = c0876k.m1453g();
            this.f4841z.y = c0876k.m1453g();
        }
        this.f4854o = c0876k.m1455e();
        int m1454f = c0876k.m1454f();
        for (int i = 0; i < m1454f; i++) {
            this.f4855A.add(Long.valueOf(c0876k.m1446n()));
        }
        if (c0876k.m1463b() >= 16) {
            this.f4842p = null;
            if (c0876k.m1455e()) {
                this.f4842p = c0876k.m1441s();
            }
        }
        if (c0876k.m1463b() >= 29) {
            if (c0876k.m1455e()) {
                this.f4838l = new PointF();
                this.f4838l.x = c0876k.m1453g();
                this.f4838l.y = c0876k.m1453g();
            }
            this.f4839m = c0876k.m1445o();
        }
        if (c0876k.m1463b() >= 33) {
            this.f4853k = C0208c.m6280a(c0876k.m1448l());
        }
        if (c0876k.m1463b() >= 37) {
            this.f4850f = c0876k.m1455e();
        }
        if (c0876k.m1463b() >= 52) {
            this.f4843q = c0876k.m1438v();
        }
        if (c0876k.m1463b() >= 53) {
            this.f4844r = c0876k.m1455e();
            if (this.f4844r) {
                c0876k.m1457d();
                this.f4845s = c0876k.m1453g();
                this.f4846t = c0876k.m1453g();
                this.f4847u = c0876k.m1454f();
            }
            int m1454f2 = c0876k.m1454f();
            this.f4857w.clear();
            for (int i2 = 0; i2 < m1454f2; i2++) {
                C0740d c0740d = new C0740d();
                c0740d.m2582a(c0876k);
                this.f4857w.add(c0740d);
            }
        }
        if (c0876k.m1463b() >= 80) {
            this.f4852h = c0876k.m1455e();
        }
        c0876k.m1456d("c");
    }

    /* renamed from: a */
    public void m2488a(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            m2491a((AbstractC0623y) it.next());
        }
    }

    /* renamed from: a */
    public void m2491a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y == null) {
            throw new RuntimeException("unit cannot be null");
        }
        if (abstractC0623y.team != this.f4836i) {
        }
        if (this.f4836i.f1316v) {
            if (abstractC0623y.team != this.f4836i && GameEngine.getInstance().f6093bs != this.f4836i) {
                GameEngine.m1144b("CommandController", "Warning AI: " + this.f4836i.f1305k + " gave an order to unit with team:" + abstractC0623y.team.f1305k + " type:" + abstractC0623y.getUnitType().mo5706i());
                GameEngine.m1120g(VariableScope.nullOrMissingString);
            }
            if (abstractC0623y.m5826cU()) {
                GameEngine.m1144b("CommandController", "Warning AI: " + this.f4836i.f1305k + " gave an order to unit with canNotBeGivenOrdersByPlayer: " + abstractC0623y.getUnitType().mo5706i());
            }
        }
        this.f4856v.add(abstractC0623y);
    }

    /* renamed from: h */
    public void m2474h() {
        this.f4854o = true;
    }

    /* renamed from: a */
    public void m2501a(float f, float f2) {
        this.f4837j = new C0305au();
        this.f4837j.m5690a(f, f2);
    }

    /* renamed from: b */
    public void m2486b(float f, float f2) {
        this.f4837j = new C0305au();
        this.f4837j.m5683b(f, f2);
    }

    /* renamed from: a */
    public void m2493a(Unit unit) {
        this.f4837j = new C0305au();
        this.f4837j.m5688a(unit);
    }

    /* renamed from: a */
    public void m2499a(float f, float f2, boolean z) {
        this.f4837j = new C0305au();
        this.f4837j.m5683b(f, f2);
        this.f4837j.f1802j = z;
    }

    /* renamed from: a */
    public void m2492a(Unit unit, boolean z) {
        this.f4837j = new C0305au();
        this.f4837j.m5688a(unit);
        this.f4837j.f1802j = z;
    }

    /* renamed from: a */
    public void m2500a(float f, float f2, InterfaceC0303as interfaceC0303as, int i) {
        this.f4837j = new C0305au();
        this.f4837j.m5689a(f, f2, interfaceC0303as, i);
    }

    /* renamed from: b */
    public void m2485b(Unit unit) {
        this.f4837j = new C0305au();
        this.f4837j.m5682b(unit);
    }

    /* renamed from: c */
    public void m2482c(Unit unit) {
        this.f4837j = new C0305au();
        this.f4837j.m5678c(unit);
    }

    /* renamed from: c */
    public void m2483c(float f, float f2) {
        this.f4837j = new C0305au();
        this.f4837j.m5679c(f, f2);
    }

    /* renamed from: d */
    public void m2480d(Unit unit) {
        this.f4837j = new C0305au();
        this.f4837j.m5671f(unit);
    }

    /* renamed from: e */
    public void m2478e(Unit unit) {
        this.f4837j = new C0305au();
        this.f4837j.m5669g(unit);
    }

    /* renamed from: f */
    public void m2476f(Unit unit) {
        this.f4837j = new C0305au();
        this.f4837j.m5667h(unit);
    }

    /* renamed from: a */
    public void m2496a(C0208c c0208c) {
        this.f4853k = c0208c;
    }

    /* renamed from: a */
    public void m2495a(C0208c c0208c, PointF pointF, Unit unit) {
        this.f4853k = c0208c;
        this.f4838l = pointF;
        this.f4839m = unit;
    }

    /* renamed from: a */
    public void m2494a(EnumC0205a enumC0205a) {
        this.f4840n = enumC0205a;
    }

    /* renamed from: a */
    public void m2498a(PointF pointF) {
        this.f4841z = pointF;
    }

    /* renamed from: i */
    public synchronized void m2473i() {
        Iterator it = this.f4855A.iterator();
        while (it.hasNext()) {
            AbstractC0623y m463b = AbstractC1120w.m463b(((Long) it.next()).longValue(), true);
            if (m463b != null) {
                this.f4856v.add(m463b);
            }
        }
        this.f4855A.clear();
        Iterator it2 = this.f4856v.iterator();
        while (it2.hasNext()) {
            if (((AbstractC0623y) it2.next()).isDead) {
                it2.remove();
            }
        }
    }

    /* renamed from: j */
    public void m2472j() {
        if (Action.m6080c(this.f4853k)) {
            Iterator it = this.f4856v.iterator();
            while (it.hasNext()) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
                abstractC0623y.m5874b(abstractC0623y.m5893a(this.f4853k), this.f4851g);
            }
        }
    }

    /* renamed from: k */
    public void m2471k() {
        C0305au m3133at;
        String str;
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6120cb.m2635h() && !this.f4832a) {
            return;
        }
        m2473i();
        if (this.f4844r) {
            if (this.f4845s != 0.0f) {
                GameEngine.PrintLog("issueCommand: changeStepRate:" + this.f4845s);
                gameEngine.networkEngine.m1774a(this.f4845s, "command");
                return;
            } else if (this.f4847u != 0) {
                GameEngine.PrintLog("system action:" + this.f4847u);
                if (this.f4847u == 1) {
                    GameEngine.PrintLog("new DebugDesyncDetector");
                    new C0546g(false).mo3120b(Team.f1370i);
                    return;
                } else if (this.f4847u == 2) {
                    GameEngine.PrintLog("new DebugDesyncDetector (stress test)");
                    C0546g c0546g = new C0546g(false);
                    c0546g.mo3120b(Team.f1370i);
                    c0546g.f3740a = true;
                    return;
                } else if (this.f4847u == 100) {
                    GameEngine.PrintLog("team surrender");
                    if (this.f4836i == null) {
                        GameEngine.PrintLog("team not found");
                        return;
                    }
                    if (gameEngine.networkEngine.f5485C) {
                        gameEngine.networkEngine.m1634j("'" + this.f4836i.f1315u + "' has surrendered");
                    }
                    this.f4836i.f1326D = true;
                    Iterator it = Unit.f1589bD.iterator();
                    while (it.hasNext()) {
                        Unit unit = (Unit) it.next();
                        if (unit.team == this.f4836i && (unit instanceof AbstractC0623y)) {
                            ((AbstractC0623y) unit).mo3073c(false);
                        }
                    }
                    return;
                } else if (this.f4847u == 200) {
                    GameEngine.PrintLog("queue quick resync");
                    gameEngine.networkEngine.f5492N = true;
                    return;
                } else if (this.f4847u == 5) {
                    GameEngine.PrintLog("system command spawn");
                    if (this.f4837j == null || this.f4837j.m5676d() != EnumC0306av.f1812c || this.f4837j.m5691a() == null) {
                        GameEngine.PrintLog("system command spawn - failed");
                        return;
                    }
                    int m5684b = this.f4837j.m5684b();
                    InterfaceC0303as m5691a = this.f4837j.m5691a();
                    boolean z = false;
                    if (this.f4836i != null && this.f4836i == gameEngine.f6093bs && gameEngine.f6093bs.m6375a(false, false) == 0) {
                        z = true;
                    }
                    Unit mo5717a = m5691a.mo5717a();
                    mo5717a.f6951ek = this.f4837j.m5670g();
                    mo5717a.f6952el = this.f4837j.m5668h();
                    if (this.f4836i != null) {
                        mo5717a.m5766f(this.f4836i);
                    } else {
                        mo5717a.m5766f(Team.f1370i);
                    }
                    mo5717a.m5907B(null);
                    if (m5684b != 1 && (mo5717a instanceof AbstractC0623y)) {
                        ((AbstractC0623y) mo5717a).mo4213a(m5684b);
                    }
                    mo5717a.m5832cO();
                    if (mo5717a instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) mo5717a;
                        abstractC0623y.m3087br();
                        if (mo5717a.m5867bI()) {
                            gameEngine.f6113bU.m1312a(abstractC0623y);
                        }
                    }
                    Team.m6353c(mo5717a);
                    if (gameEngine.f6093bs == mo5717a.team && mo5717a.team != Team.f1370i && !mo5717a.m5755u() && z) {
                        gameEngine.m1150b(mo5717a.f6951ek, mo5717a.f6952el);
                        gameEngine.f6111bS.m1980j(mo5717a);
                        return;
                    }
                    return;
                } else {
                    GameEngine.PrintLog("issueCommand: unknown system action:" + this.f4847u);
                    return;
                }
            } else {
                GameEngine.PrintLog("issueCommand: Null System action");
                return;
            }
        }
        if (this.f4842p != null) {
            this.f4842p.f1347X = System.currentTimeMillis();
            this.f4842p.f1348Y = gameEngine.f6096by;
        }
        if (this.f4842p != null) {
            String str2 = null;
            AbstractC0623y abstractC0623y2 = null;
            Iterator it2 = this.f4856v.iterator();
            while (it2.hasNext()) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) it2.next();
                if (abstractC0623y3.team != this.f4842p && !m2497a(this.f4842p, abstractC0623y3.team)) {
                    if (str2 == null) {
                        str = VariableScope.nullOrMissingString;
                    } else {
                        str = str2 + ", ";
                    }
                    if (abstractC0623y2 == null) {
                        abstractC0623y2 = abstractC0623y3;
                    }
                    str2 = str + abstractC0623y3.f6945ed;
                    it2.remove();
                } else if (abstractC0623y3.m5826cU()) {
                    C0736c.m2593a("Warning unit: " + abstractC0623y3.f6945ed + " has canNotBeGivenOrdersByPlayer set");
                    it2.remove();
                }
            }
            if (str2 != null) {
                C0831ad.m1742a("Player(" + this.f4842p.f1305k + ") " + this.f4842p.f1315u + " cannot control units: " + str2, true);
                if (abstractC0623y2 != null) {
                    String str3 = VariableScope.nullOrMissingString;
                    if (abstractC0623y2.team != null) {
                        str3 = str3 + " targetUnitTeamId: " + abstractC0623y2.team.f1305k + " targetUnitTeamName: " + abstractC0623y2.team.f1315u;
                    }
                    C0736c.m2593a(str3);
                }
            }
        }
        if (this.f4854o) {
            Iterator it3 = this.f4856v.iterator();
            while (it3.hasNext()) {
                AbstractC0623y abstractC0623y4 = (AbstractC0623y) it3.next();
                abstractC0623y4.m3127az();
                abstractC0623y4.f3891Q = null;
            }
        }
        if (this.f4837j != null) {
            this.f4837j.m5680c();
            C0637ab m2979b = gameEngine.f6114bV.m2979b();
            m2979b.f4075g = this.f4857w;
            int i = 0;
            while (i <= 1) {
                boolean z2 = i == 1;
                Iterator it4 = this.f4856v.iterator();
                while (it4.hasNext()) {
                    AbstractC0623y abstractC0623y5 = (AbstractC0623y) it4.next();
                    if (abstractC0623y5.f3917ad == z2) {
                        if (this.f4850f) {
                            abstractC0623y5.m3179aA();
                        } else if (!this.f4849e) {
                            abstractC0623y5.m3127az();
                        } else if (this.f4852h && this.f4837j != null && (m3133at = abstractC0623y5.m3133at()) != null && this.f4837j.m5687a(m3133at) && (m3133at.m5676d() == EnumC0306av.f1817h || m3133at.m5676d() == EnumC0306av.f1810a)) {
                            if (this.f4837j.m5676d() == EnumC0306av.f1817h || this.f4837j.m5676d() == EnumC0306av.f1810a) {
                                abstractC0623y5.m3132au();
                            }
                        }
                    }
                }
                i++;
            }
            Iterator it5 = this.f4856v.iterator();
            while (it5.hasNext()) {
                AbstractC0623y abstractC0623y6 = (AbstractC0623y) it5.next();
                if (!abstractC0623y6.m3192a(this.f4837j, C0736c.f4619e < 5)) {
                    String str4 = VariableScope.nullOrMissingString;
                    if (this.f4842p != null) {
                        str4 = "Player(" + this.f4842p.f1305k + ") " + this.f4842p.f1315u + ": ";
                    }
                    C0736c.m2593a(str4 + "isValidNewWaypoint==false on: " + abstractC0623y6.m5845cA());
                } else {
                    C0305au m3068d = abstractC0623y6.m3068d(this.f4837j);
                    m2979b.m2973a(abstractC0623y6, m3068d);
                    abstractC0623y6.m3194a(m3068d);
                }
            }
            m2979b.m2970b();
            return;
        }
        if (Action.m6080c(this.f4853k)) {
            Iterator it6 = this.f4856v.iterator();
            while (it6.hasNext()) {
                AbstractC0623y abstractC0623y7 = (AbstractC0623y) it6.next();
                Action a = abstractC0623y7.m5893a(this.f4853k);
                if (a == null) {
                    C0736c.m2593a("Could not find specialAction:" + this.f4853k.m6284a() + " on " + abstractC0623y7.getUnitType().mo5706i());
                } else if (!a.mo4245b(abstractC0623y7)) {
                    C0736c.m2593a("!isAvailable specialAction:" + this.f4853k.m6284a() + " on " + abstractC0623y7.getUnitType().mo5706i() + " (action being skipped)");
                    if (C0736c.f4615a) {
                        C0736c.m2593a("Command source:" + this.f4833b);
                    }
                } else {
                    abstractC0623y7.m5875b(a);
                    C0785ad.m2110a(abstractC0623y7, a);
                    abstractC0623y7.m5892a(a, this.f4851g, this.f4838l, this.f4839m);
                }
            }
            C0215j m6188a = C0215j.m6188a(this.f4853k);
            if (m6188a != null) {
                if (gameEngine.f6093bs != null && this.f4836i != null) {
                    if (this.f4836i.m6342d(gameEngine.f6093bs)) {
                        gameEngine.f6111bS.m2059a(this.f4838l.x, this.f4838l.y, this.f4836i, m6188a);
                    }
                } else {
                    C0736c.m2593a("PingMapAction failed: game.playerTeam==null or this.team==null");
                }
            }
        }
        if (this.f4840n != null) {
            Iterator it7 = this.f4856v.iterator();
            while (it7.hasNext()) {
                ((AbstractC0623y) it7.next()).f3889O = this.f4840n;
            }
        }
        if (this.f4841z != null) {
            Iterator it8 = this.f4856v.iterator();
            while (it8.hasNext()) {
                AbstractC0623y abstractC0623y8 = (AbstractC0623y) it8.next();
                if (abstractC0623y8 instanceof InterfaceC0501l) {
                    ((InterfaceC0501l) abstractC0623y8).mo4377a(this.f4841z);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m2497a(Team team, Team team2) {
        if (team != null && team2 != null && team2.m6342d(team) && (this.f4843q & (1 << team2.f1305k)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m2470l() {
        InterfaceC0303as m5691a;
        Unit m5890a;
        this.f4843q = (short) 0;
        for (int i = 0; i < Team.f1364c; i++) {
            Team m6317k = Team.m6317k(i);
            if (m6317k != null && m6317k.m6312p()) {
                this.f4843q = (short) (this.f4843q | (1 << i));
            }
        }
        if (GameEngine.getInstance().m1135c(true) < 127 && this.f4837j != null && this.f4837j.m5676d() == EnumC0306av.f1812c && (m5691a = this.f4837j.m5691a()) != null && (m5890a = Unit.m5890a(m5691a)) != null && !(m5890a instanceof AbstractC0623y)) {
            GameEngine.PrintLog("Rejecting non OrderableUnit build order: " + m5691a.mo5706i());
            return false;
        } else if (this.f4837j != null && this.f4837j.f1804n) {
            GameEngine.PrintLog("Rejecting waypoint with addedByAction true");
            return false;
        } else {
            return true;
        }
    }
}

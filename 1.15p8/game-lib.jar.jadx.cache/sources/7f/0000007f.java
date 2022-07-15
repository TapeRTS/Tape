package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AttackMode;
import com.corrodinggames.rts.game.units.C0528g;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.Waypoint;
import com.corrodinggames.rts.game.units.WaypointType;
import com.corrodinggames.rts.game.units.buildings.AbstractC0483l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.C0209j;
import com.corrodinggames.rts.gameFramework.gui.C0704ad;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e.class */
public class C0678e {

    /* renamed from: a */
    public boolean f4434a;

    /* renamed from: b */
    public String f4435b;

    /* renamed from: c */
    public int f4436c;

    /* renamed from: d */
    public int f4437d;

    /* renamed from: i */
    public Team team;

    /* renamed from: j */
    public Waypoint f4439j;

    /* renamed from: l */
    public PointF f4440l;

    /* renamed from: m */
    public Unit f4441m;

    /* renamed from: n */
    public AttackMode f4442n;

    /* renamed from: z */
    private PointF f4450z;

    /* renamed from: p */
    public Team f4443p;

    /* renamed from: q */
    public short f4444q;

    /* renamed from: r */
    public boolean f4445r;

    /* renamed from: s */
    public float f4446s;

    /* renamed from: t */
    public float f4447t;

    /* renamed from: u */
    public int f4448u;

    /* renamed from: y */
    final /* synthetic */ CommandController f4449y;

    /* renamed from: e */
    public boolean f4451e = false;

    /* renamed from: f */
    public boolean f4452f = false;

    /* renamed from: g */
    public boolean f4453g = false;

    /* renamed from: h */
    public boolean f4454h = false;

    /* renamed from: k */
    public C0202c f4455k = Action.f1432h;

    /* renamed from: o */
    public boolean f4456o = false;

    /* renamed from: A */
    private ObjectVector f4457A = new ObjectVector();

    /* renamed from: v */
    ObjectVector f4458v = new ObjectVector();

    /* renamed from: w */
    ObjectVector f4459w = new ObjectVector();

    /* renamed from: x */
    public boolean f4460x = false;

    public C0678e(CommandController commandController) {
        this.f4449y = commandController;
    }

    /* renamed from: a */
    public boolean m2103a() {
        Iterator it = this.f4459w.iterator();
        while (it.hasNext()) {
            if (((C0669d) it.next()).f4403a.mo1122a() == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public void m2088b() {
        GameEngine game = GameEngine.getInstance();
        this.f4460x = true;
        GroupController.UnitGroup m2399c = game.groupController.m2399c();
        Iterator it = this.f4458v.iterator();
        while (it.hasNext()) {
            m2399c.f3890a.add((OrderableUnit) it.next());
        }
        if (this.f4439j != null) {
            float realX = this.f4439j.getRealX();
            float realY = this.f4439j.getRealY();
            if (this.f4439j.getType() != WaypointType.f1751a && this.f4439j.getType() != WaypointType.f1758h && this.f4439j.getType() != WaypointType.f1752b) {
                return;
            }
            Iterator it2 = m2399c.m2397a(realX, realY, this.f4439j.f1743j).iterator();
            while (it2.hasNext()) {
                OrderableUnit orderableUnit = (OrderableUnit) it2.next();
                if (!orderableUnit.m2587aJ() && orderableUnit.mo2657I() && (!this.f4451e || orderableUnit.getActiveWaypoint() == null)) {
                    int i = 0;
                    if (this.f4439j.getType() == WaypointType.f1752b) {
                        i = orderableUnit.m2444q(this.f4439j.m3670i());
                    }
                    C0669d c0669d = new C0669d();
                    c0669d.f4404b = orderableUnit.GameObjectID;
                    c0669d.f4405c = orderableUnit.x;
                    c0669d.f4406d = orderableUnit.y;
                    c0669d.f4407e = realX;
                    c0669d.f4408f = realY;
                    c0669d.f4409g = game.frameNumber;
                    c0669d.f4410h = orderableUnit.getMovementType();
                    c0669d.f4403a = orderableUnit.m2638a(realX, realY, i, true, false, false);
                    c0669d.f4403a.f5537t = 120.0f;
                    c0669d.f4403a.f5536s = c0669d.f4403a.f5537t;
                    c0669d.f4403a.f5538u = true;
                    this.f4459w.add(c0669d);
                }
            }
        }
    }

    /* renamed from: c */
    public Team m2085c() {
        return this.team;
    }

    /* renamed from: d */
    public int m2082d() {
        return this.f4457A.size() + this.f4458v.size();
    }

    /* renamed from: e */
    public boolean m2080e() {
        if (!Action.m3827c(this.f4455k) && m2082d() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public synchronized C0678e m2078f() {
        try {
            OutputNetStream outputNetStream = new OutputNetStream();
            m2091a(outputNetStream);
            InputNetStream inputNetStream = new InputNetStream(outputNetStream.mo1294d());
            C0678e c0678e = new C0678e(this.f4449y);
            c0678e.f4436c = this.f4436c;
            c0678e.m2090a(inputNetStream);
            return c0678e;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public void m2076g() {
        if (this.f4439j != null) {
            Iterator it = this.f4458v.iterator();
            while (it.hasNext()) {
                this.f4457A.add(Long.valueOf(((OrderableUnit) it.next()).GameObjectID));
            }
            this.f4458v.clear();
            this.f4439j.m3668k();
        }
    }

    /* renamed from: a */
    public synchronized void m2091a(OutputNetStream stream) {
        stream.mo1291e("c");
        stream.writeByte(this.team.teamID);
        stream.writeBoolean(this.f4439j != null);
        if (this.f4439j != null) {
            this.f4439j.writeOut(stream);
        }
        stream.writeBoolean(this.f4451e);
        stream.writeBoolean(this.f4453g);
        stream.writeInt(-1);
        stream.writeEnum(this.f4442n);
        stream.writeBoolean(this.f4450z != null);
        if (this.f4450z != null) {
            stream.writeFloat(this.f4450z.x);
            stream.writeFloat(this.f4450z.y);
        }
        stream.writeBoolean(this.f4456o);
        stream.writeInt(this.f4458v.size() + this.f4457A.size());
        Iterator it = this.f4458v.iterator();
        while (it.hasNext()) {
            stream.writeLong(((OrderableUnit) it.next()).GameObjectID);
        }
        Iterator it2 = this.f4457A.iterator();
        while (it2.hasNext()) {
            stream.writeLong(((Long) it2.next()).longValue());
        }
        stream.writeBoolean(this.f4443p != null);
        if (this.f4443p != null) {
            stream.mo1312a(this.f4443p);
        }
        stream.writeBoolean(this.f4440l != null);
        if (this.f4440l != null) {
            stream.writeFloat(this.f4440l.x);
            stream.writeFloat(this.f4440l.y);
        }
        stream.mo1260a(this.f4441m);
        stream.writeString(this.f4455k.m3863a());
        stream.writeBoolean(this.f4452f);
        stream.mo1257a(this.f4444q);
        stream.writeBoolean(this.f4445r);
        if (this.f4445r) {
            stream.writeByte(0);
            stream.writeFloat(this.f4446s);
            stream.writeFloat(this.f4447t);
            stream.writeInt(this.f4448u);
        }
        stream.writeInt(this.f4459w.size());
        for (int i = 0; i < this.f4459w.size(); i++) {
            ((C0669d) this.f4459w.get(i)).m2185a(stream);
        }
        stream.writeBoolean(this.f4454h);
        stream.endBlock("c");
    }

    /* renamed from: a */
    public void m2090a(InputNetStream stream) {
        stream.m1234b("c");
        this.team = Team.getTeam(stream.readByte());
        if (this.team == null) {
            throw new IOException("team==null");
        }
        if (stream.readBoolean()) {
            this.f4439j = new Waypoint();
            this.f4439j.readIn(stream);
        }
        this.f4451e = stream.readBoolean();
        this.f4453g = stream.readBoolean();
        this.f4455k = C0202c.m3859a(String.valueOf(stream.readInt()));
        this.f4442n = (AttackMode) stream.readEnum(AttackMode.class);
        if (stream.readBoolean()) {
            this.f4450z = new PointF();
            this.f4450z.x = stream.readFloat();
            this.f4450z.y = stream.readFloat();
        }
        this.f4456o = stream.readBoolean();
        int readInt = stream.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f4457A.add(Long.valueOf(stream.m1220n()));
        }
        if (stream.m1237b() >= 16) {
            this.f4443p = null;
            if (stream.readBoolean()) {
                this.f4443p = stream.m1215s();
            }
        }
        if (stream.m1237b() >= 29) {
            if (stream.readBoolean()) {
                this.f4440l = new PointF();
                this.f4440l.x = stream.readFloat();
                this.f4440l.y = stream.readFloat();
            }
            this.f4441m = stream.m1219o();
        }
        if (stream.m1237b() >= 33) {
            this.f4455k = C0202c.m3859a(stream.readString());
        }
        if (stream.m1237b() >= 37) {
            this.f4452f = stream.readBoolean();
        }
        if (stream.m1237b() >= 52) {
            this.f4444q = stream.m1212v();
        }
        if (stream.m1237b() >= 53) {
            this.f4445r = stream.readBoolean();
            if (this.f4445r) {
                stream.readByte();
                this.f4446s = stream.readFloat();
                this.f4447t = stream.readFloat();
                this.f4448u = stream.readInt();
            }
            int readInt2 = stream.readInt();
            this.f4459w.clear();
            for (int i2 = 0; i2 < readInt2; i2++) {
                C0669d c0669d = new C0669d();
                c0669d.m2184a(stream);
                this.f4459w.add(c0669d);
            }
        }
        if (stream.m1237b() >= 80) {
            this.f4454h = stream.readBoolean();
        }
        stream.m1230d("c");
    }

    /* renamed from: a */
    public void m2089a(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            m2092a((OrderableUnit) it.next());
        }
    }

    /* renamed from: a */
    public void m2092a(OrderableUnit orderableUnit) {
        if (orderableUnit == null) {
            throw new RuntimeException("unit cannot be null");
        }
        if (orderableUnit.team != this.team) {
        }
        if (this.team.f1333t) {
            if (orderableUnit.team != this.team && GameEngine.getInstance().playerTeam != this.team) {
                GameEngine.log("CommandController", "Warning AI: " + this.team.teamID + " gave an order to unit with team:" + orderableUnit.team.teamID + " type:" + orderableUnit.getUnitType().mo3087i());
                GameEngine.LogTrace(VariableScope.nullOrMissingString);
            }
            if (orderableUnit.mo3185cS()) {
                GameEngine.log("CommandController", "Warning AI: " + this.team.teamID + " gave an order to unit with canNotBeGivenOrdersByPlayer: " + orderableUnit.getUnitType().mo3087i());
            }
        }
        this.f4458v.add(orderableUnit);
    }

    /* renamed from: h */
    public void m2075h() {
        this.f4456o = true;
    }

    /* renamed from: a */
    public void m2102a(float f, float f2) {
        this.f4439j = new Waypoint();
        this.f4439j.m3694a(f, f2);
    }

    /* renamed from: b */
    public void m2087b(float f, float f2) {
        this.f4439j = new Waypoint();
        this.f4439j.m3687b(f, f2);
    }

    /* renamed from: a */
    public void m2094a(Unit unit) {
        this.f4439j = new Waypoint();
        this.f4439j.m3692a(unit);
    }

    /* renamed from: a */
    public void m2100a(float f, float f2, boolean z) {
        this.f4439j = new Waypoint();
        this.f4439j.m3687b(f, f2);
        this.f4439j.f1743j = z;
    }

    /* renamed from: a */
    public void m2093a(Unit unit, boolean z) {
        this.f4439j = new Waypoint();
        this.f4439j.m3692a(unit);
        this.f4439j.f1743j = z;
    }

    /* renamed from: a */
    public void m2101a(float f, float f2, UnitType unitType, int i) {
        this.f4439j = new Waypoint();
        this.f4439j.m3693a(f, f2, unitType, i);
    }

    /* renamed from: b */
    public void m2086b(Unit unit) {
        this.f4439j = new Waypoint();
        this.f4439j.m3686b(unit);
    }

    /* renamed from: c */
    public void m2083c(Unit unit) {
        this.f4439j = new Waypoint();
        this.f4439j.m3682c(unit);
    }

    /* renamed from: c */
    public void m2084c(float f, float f2) {
        this.f4439j = new Waypoint();
        this.f4439j.m3683c(f, f2);
    }

    /* renamed from: d */
    public void m2081d(Unit unit) {
        this.f4439j = new Waypoint();
        this.f4439j.m3675f(unit);
    }

    /* renamed from: e */
    public void m2079e(Unit unit) {
        this.f4439j = new Waypoint();
        this.f4439j.m3673g(unit);
    }

    /* renamed from: f */
    public void m2077f(Unit unit) {
        this.f4439j = new Waypoint();
        this.f4439j.m3671h(unit);
    }

    /* renamed from: a */
    public void m2097a(C0202c c0202c) {
        this.f4455k = c0202c;
    }

    /* renamed from: a */
    public void m2096a(C0202c c0202c, PointF pointF, Unit unit) {
        this.f4455k = c0202c;
        this.f4440l = pointF;
        this.f4441m = unit;
    }

    /* renamed from: a */
    public void m2095a(AttackMode attackMode) {
        this.f4442n = attackMode;
    }

    /* renamed from: a */
    public void m2099a(PointF pointF) {
        this.f4450z = pointF;
    }

    /* renamed from: i */
    public synchronized void m2074i() {
        Iterator it = this.f4457A.iterator();
        while (it.hasNext()) {
            OrderableUnit m425b = GameObject.m425b(((Long) it.next()).longValue(), true);
            if (m425b != null) {
                this.f4458v.add(m425b);
            }
        }
        this.f4457A.clear();
        Iterator it2 = this.f4458v.iterator();
        while (it2.hasNext()) {
            if (((OrderableUnit) it2.next()).dead) {
                it2.remove();
            }
        }
    }

    /* renamed from: j */
    public void m2073j() {
        if (Action.m3827c(this.f4455k)) {
            Iterator it = this.f4458v.iterator();
            while (it.hasNext()) {
                OrderableUnit orderableUnit = (OrderableUnit) it.next();
                orderableUnit.mo2949b(orderableUnit.mo3219a(this.f4455k), this.f4453g);
            }
        }
    }

    /* renamed from: k */
    public void m2072k() {
        Waypoint m2551as;
        String str;
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.replayEngine.isPlaying() && !this.f4434a) {
            return;
        }
        m2074i();
        if (this.f4445r) {
            if (this.f4446s != 0.0f) {
                GameEngine.PrintLOG("issueCommand: changeStepRate:" + this.f4446s);
                gameEngine.networkEngine.m1499a(this.f4446s, "command");
                return;
            } else if (this.f4448u != 0) {
                GameEngine.PrintLOG("system action:" + this.f4448u);
                if (this.f4448u == 1) {
                    GameEngine.PrintLOG("new DebugDesyncDetector");
                    new C0528g(false).mo2537b(Team.f1346g);
                    return;
                } else if (this.f4448u == 2) {
                    GameEngine.PrintLOG("new DebugDesyncDetector (stress test)");
                    C0528g c0528g = new C0528g(false);
                    c0528g.mo2537b(Team.f1346g);
                    c0528g.f3564a = true;
                    return;
                } else if (this.f4448u == 100) {
                    GameEngine.PrintLOG("team surrender");
                    if (this.team == null) {
                        GameEngine.PrintLOG("team not found");
                        return;
                    }
                    if (gameEngine.networkEngine.isServer) {
                        gameEngine.networkEngine.sendSystemMessage("'" + this.team.playerName + "' has surrendered");
                    }
                    this.team.f1284B = true;
                    Iterator it = Unit.fastUnitList.iterator();
                    while (it.hasNext()) {
                        Unit unit = (Unit) it.next();
                        if (unit.team == this.team && (unit instanceof OrderableUnit)) {
                            ((OrderableUnit) unit).mo2491c(false);
                        }
                    }
                    return;
                } else if (this.f4448u == 200) {
                    GameEngine.PrintLOG("queue quick resync");
                    gameEngine.networkEngine.f5045M = true;
                    return;
                } else if (this.f4448u == 5) {
                    GameEngine.PrintLOG("system command spawn");
                    if (this.f4439j == null || this.f4439j.getType() != WaypointType.f1753c || this.f4439j.m3695a() == null) {
                        GameEngine.PrintLOG("system command spawn - failed");
                        return;
                    }
                    int m3688b = this.f4439j.m3688b();
                    UnitType m3695a = this.f4439j.m3695a();
                    boolean z = false;
                    if (this.team != null && this.team == gameEngine.playerTeam && gameEngine.playerTeam.getUnitCounts(false, false) == 0) {
                        z = true;
                    }
                    Unit createUnit = m3695a.createUnit();
                    createUnit.x = this.f4439j.getRealX();
                    createUnit.y = this.f4439j.getRealY();
                    if (this.team != null) {
                        createUnit.mo3149f(this.team);
                    } else {
                        createUnit.mo3149f(Team.f1346g);
                    }
                    createUnit.mo3233B(null);
                    if (m3688b != 1 && (createUnit instanceof OrderableUnit)) {
                        ((OrderableUnit) createUnit).upgrade(m3688b);
                    }
                    createUnit.mo3191cM();
                    if (createUnit instanceof OrderableUnit) {
                        OrderableUnit orderableUnit = (OrderableUnit) createUnit;
                        orderableUnit.m2506bq();
                        if (createUnit.mo2975bH()) {
                            gameEngine.PathEngine.m1102a(orderableUnit);
                        }
                    }
                    Team.m3924c(createUnit);
                    if (gameEngine.playerTeam == createUnit.team && createUnit.team != Team.f1346g && !createUnit.mo1773u() && z) {
                        gameEngine.m851b(createUnit.x, createUnit.y);
                        gameEngine.interfaceEngine.m1838j(createUnit);
                        return;
                    }
                    return;
                } else {
                    GameEngine.PrintLOG("issueCommand: unknown system action:" + this.f4448u);
                    return;
                }
            } else {
                GameEngine.PrintLOG("issueCommand: Null System action");
                return;
            }
        }
        if (this.f4443p != null) {
            this.f4443p.f1304V = System.currentTimeMillis();
            this.f4443p.f1305W = gameEngine.f5845by;
        }
        if (this.f4443p != null) {
            String str2 = null;
            OrderableUnit orderableUnit2 = null;
            Iterator it2 = this.f4458v.iterator();
            while (it2.hasNext()) {
                OrderableUnit orderableUnit3 = (OrderableUnit) it2.next();
                if (orderableUnit3.team != this.f4443p && !m2098a(this.f4443p, orderableUnit3.team)) {
                    if (str2 == null) {
                        str = VariableScope.nullOrMissingString;
                    } else {
                        str = str2 + ", ";
                    }
                    if (orderableUnit2 == null) {
                        orderableUnit2 = orderableUnit3;
                    }
                    str2 = str + orderableUnit3.GameObjectID;
                    it2.remove();
                } else if (orderableUnit3.mo3185cS()) {
                    GameEngine.PrintLOG("Warning unit: " + orderableUnit3.GameObjectID + " has canNotBeGivenOrdersByPlayer set");
                    it2.remove();
                }
            }
            if (str2 != null) {
                NetworkEngine.m1467a("Player(" + this.f4443p.teamID + ") " + this.f4443p.playerName + " cannot control units: " + str2, true);
                if (orderableUnit2 != null) {
                    String str3 = VariableScope.nullOrMissingString;
                    if (orderableUnit2.team != null) {
                        str3 = str3 + " targetUnitTeamId: " + orderableUnit2.team.teamID + " targetUnitTeamName: " + orderableUnit2.team.playerName;
                    }
                    GameEngine.log(str3);
                }
            }
        }
        if (this.f4456o) {
            Iterator it3 = this.f4458v.iterator();
            while (it3.hasNext()) {
                OrderableUnit orderableUnit4 = (OrderableUnit) it3.next();
                orderableUnit4.m2545ay();
                orderableUnit4.f3674K = null;
            }
        }
        if (this.f4439j != null) {
            this.f4439j.convertUnitIds();
            GroupController.UnitGroup m2400b = gameEngine.groupController.m2400b();
            m2400b.f3896g = this.f4459w;
            int i = 0;
            while (i <= 1) {
                boolean z2 = i == 1;
                Iterator it4 = this.f4458v.iterator();
                while (it4.hasNext()) {
                    OrderableUnit orderableUnit5 = (OrderableUnit) it4.next();
                    if (orderableUnit5.f3687X == z2) {
                        if (this.f4452f) {
                            orderableUnit5.m2544az();
                        } else if (!this.f4451e) {
                            orderableUnit5.m2545ay();
                        } else if (this.f4454h && this.f4439j != null && (m2551as = orderableUnit5.m2551as()) != null && this.f4439j.m3691a(m2551as) && (m2551as.getType() == WaypointType.f1758h || m2551as.getType() == WaypointType.f1751a)) {
                            if (this.f4439j.getType() == WaypointType.f1758h || this.f4439j.getType() == WaypointType.f1751a) {
                                orderableUnit5.m2550at();
                            }
                        }
                    }
                }
                i++;
            }
            Iterator it5 = this.f4458v.iterator();
            while (it5.hasNext()) {
                OrderableUnit orderableUnit6 = (OrderableUnit) it5.next();
                Waypoint m2486d = orderableUnit6.m2486d(this.f4439j);
                m2400b.m2394a(orderableUnit6, m2486d);
                orderableUnit6.mo2612a(m2486d);
            }
            m2400b.m2391b();
            return;
        }
        if (Action.m3827c(this.f4455k)) {
            Iterator it6 = this.f4458v.iterator();
            while (it6.hasNext()) {
                OrderableUnit orderableUnit7 = (OrderableUnit) it6.next();
                Action a = orderableUnit7.mo3219a(this.f4455k);
                if (a == null) {
                    GameEngine.PrintLOG("Could not find specialAction:" + this.f4455k.m3863a() + " on " + orderableUnit7.getUnitType().mo3087i());
                } else if (!a.isAvailable(orderableUnit7)) {
                    GameEngine.PrintLOG("!isAvailable specialAction:" + this.f4455k.m3863a() + " on " + orderableUnit7.getUnitType().mo3087i() + " (action being skipped)");
                    if (CommandController.f4211a) {
                        GameEngine.PrintLOG("Command source:" + this.f4435b);
                    }
                } else {
                    orderableUnit7.mo2950b(a);
                    C0704ad.m1963a(orderableUnit7, a);
                    orderableUnit7.mo2752a(a, this.f4453g, this.f4440l, this.f4441m);
                }
            }
            C0209j m3845a = C0209j.m3845a(this.f4455k);
            if (m3845a != null) {
                if (gameEngine.playerTeam != null && this.team != null) {
                    if (this.team.m3913d(gameEngine.playerTeam)) {
                        gameEngine.interfaceEngine.m1914a(this.f4440l.x, this.f4440l.y, this.team, m3845a);
                    }
                } else {
                    GameEngine.PrintLOG("PingMapAction failed: game.playerTeam==null or this.team==null");
                }
            }
        }
        if (this.f4442n != null) {
            Iterator it7 = this.f4458v.iterator();
            while (it7.hasNext()) {
                ((OrderableUnit) it7.next()).f3762I = this.f4442n;
            }
        }
        if (this.f4450z != null) {
            Iterator it8 = this.f4458v.iterator();
            while (it8.hasNext()) {
                OrderableUnit orderableUnit8 = (OrderableUnit) it8.next();
                if (orderableUnit8 instanceof AbstractC0483l) {
                    ((AbstractC0483l) orderableUnit8).mo2916a(this.f4450z);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m2098a(Team team, Team team2) {
        if (team != null && team2 != null && team2.m3913d(team) && (this.f4444q & (1 << team2.teamID)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m2071l() {
        UnitType m3695a;
        Unit m3777a;
        this.f4444q = (short) 0;
        for (int i = 0; i < Team.playerNumMax; i++) {
            Team team = Team.getTeam(i);
            if (team != null && team.m3886m()) {
                this.f4444q = (short) (this.f4444q | (1 << i));
            }
        }
        if (GameEngine.getInstance().gameVersionInternal(true) < 127 && this.f4439j != null && this.f4439j.getType() == WaypointType.f1753c && (m3695a = this.f4439j.m3695a()) != null && (m3777a = Unit.m3777a(m3695a)) != null && !(m3777a instanceof OrderableUnit)) {
            GameEngine.PrintLOG("Rejecting non OrderableUnit build order: " + m3695a.mo3087i());
            return false;
        } else if (this.f4439j != null && this.f4439j.f1745n) {
            GameEngine.PrintLOG("Rejecting waypoint with addedByAction true");
            return false;
        } else {
            return true;
        }
    }
}
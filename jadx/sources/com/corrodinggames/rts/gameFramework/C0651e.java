package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0270an;
import com.corrodinggames.rts.game.units.C0461g;
import com.corrodinggames.rts.game.units.EnumC0178a;
import com.corrodinggames.rts.game.units.EnumC0271ao;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.C0188j;
import com.corrodinggames.rts.game.units.p023d.AbstractC0416k;
import com.corrodinggames.rts.gameFramework.p032d.C0647w;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e.class */
public class C0651e {

    /* renamed from: a */
    public boolean f4551a;

    /* renamed from: b */
    public String f4552b;

    /* renamed from: c */
    public int f4553c;

    /* renamed from: d */
    public int f4554d;

    /* renamed from: i */
    public AbstractC0171m f4555i;

    /* renamed from: j */
    public C0270an f4556j;

    /* renamed from: l */
    public PointF f4557l;

    /* renamed from: m */
    public AbstractC0210af f4558m;

    /* renamed from: n */
    public EnumC0178a f4559n;

    /* renamed from: z */
    private PointF f4560z;

    /* renamed from: p */
    public AbstractC0171m f4561p;

    /* renamed from: q */
    public short f4562q;

    /* renamed from: r */
    public boolean f4563r;

    /* renamed from: s */
    public float f4564s;

    /* renamed from: t */
    public float f4565t;

    /* renamed from: u */
    public int f4566u;

    /* renamed from: y */
    final /* synthetic */ C0595c f4567y;

    /* renamed from: e */
    public boolean f4568e = false;

    /* renamed from: f */
    public boolean f4569f = false;

    /* renamed from: g */
    public boolean f4570g = false;

    /* renamed from: h */
    public boolean f4571h = false;

    /* renamed from: k */
    public C0181c f4572k = AbstractC0197s.f1356h;

    /* renamed from: o */
    public boolean f4573o = false;

    /* renamed from: A */
    private C0835m f4574A = new C0835m();

    /* renamed from: v */
    C0835m f4575v = new C0835m();

    /* renamed from: w */
    C0835m f4576w = new C0835m();

    /* renamed from: x */
    public boolean f4577x = false;

    public C0651e(C0595c cVar) {
        this.f4567y = cVar;
    }

    /* renamed from: a */
    public boolean m1627a() {
        Iterator it = this.f4576w.iterator();
        while (it.hasNext()) {
            if (((C0598d) it.next()).f4097a.m981c() == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public void m1612b() {
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f4577x = true;
        C0536ab c = u.f5484bD.m2162c();
        Iterator it = this.f4575v.iterator();
        while (it.hasNext()) {
            c.f3600a.add((AbstractC0515r) it.next());
        }
        if (this.f4556j != null) {
            float g = this.f4556j.m3458g();
            float h = this.f4556j.m3456h();
            if (this.f4556j.m3464d() == EnumC0271ao.f1659a || this.f4556j.m3464d() == EnumC0271ao.f1666h || this.f4556j.m3464d() == EnumC0271ao.f1660b) {
                Iterator it2 = c.m2160a(g, h, this.f4556j.f1651j).iterator();
                while (it2.hasNext()) {
                    AbstractC0515r rVar = (AbstractC0515r) it2.next();
                    if (!rVar.m2335aH() && rVar.mo2440I() && (!this.f4568e || rVar.m2300ap() == null)) {
                        int i = 0;
                        if (this.f4556j.m3464d() == EnumC0271ao.f1660b) {
                            i = rVar.m2209n(this.f4556j.m3454i());
                        }
                        C0598d dVar = new C0598d();
                        dVar.f4098b = rVar.f5835dA;
                        dVar.f4099c = rVar.f5841dH;
                        dVar.f4100d = rVar.f5842dI;
                        dVar.f4101e = g;
                        dVar.f4102f = h;
                        dVar.f4103g = u.f5585bg;
                        dVar.f4104h = rVar.mo2424h();
                        dVar.f4097a = rVar.m2382a(g, h, i, true, false, false);
                        dVar.f4097a.f5117p = 120.0f;
                        dVar.f4097a.f5116o = dVar.f4097a.f5117p;
                        dVar.f4097a.f5118q = true;
                        this.f4576w.add(dVar);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public AbstractC0171m m1609c() {
        return this.f4555i;
    }

    /* renamed from: d */
    public int m1606d() {
        return this.f4574A.size() + this.f4575v.size();
    }

    /* renamed from: e */
    public boolean m1604e() {
        if (!AbstractC0197s.m3683c(this.f4572k) && m1606d() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public synchronized C0651e m1602f() {
        try {
            C0690ap apVar = new C0690ap();
            m1615a(apVar);
            C0707k kVar = new C0707k(apVar.m1173d());
            C0651e eVar = new C0651e(this.f4567y);
            eVar.f4553c = this.f4553c;
            eVar.m1614a(kVar);
            return eVar;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public void m1600g() {
        if (this.f4556j != null) {
            Iterator it = this.f4575v.iterator();
            while (it.hasNext()) {
                this.f4574A.add(Long.valueOf(((AbstractC0515r) it.next()).f5835dA));
            }
            this.f4575v.clear();
            this.f4556j.m3452k();
        }
    }

    /* renamed from: a */
    public synchronized void m1615a(C0690ap apVar) {
        apVar.m1170e("c");
        apVar.m1175c(this.f4555i.f1230i);
        apVar.mo1104a(this.f4556j != null);
        if (this.f4556j != null) {
            this.f4556j.m3474a(apVar);
        }
        apVar.mo1104a(this.f4568e);
        apVar.mo1104a(this.f4570g);
        apVar.mo1109a(-1);
        apVar.m1184a(this.f4559n);
        apVar.mo1104a(this.f4560z != null);
        if (this.f4560z != null) {
            apVar.mo1110a(this.f4560z.f224a);
            apVar.mo1110a(this.f4560z.f225b);
        }
        apVar.mo1104a(this.f4573o);
        apVar.mo1109a(this.f4575v.size() + this.f4574A.size());
        Iterator it = this.f4575v.iterator();
        while (it.hasNext()) {
            apVar.m1197a(((AbstractC0515r) it.next()).f5835dA);
        }
        Iterator it2 = this.f4574A.iterator();
        while (it2.hasNext()) {
            apVar.m1197a(((Long) it2.next()).longValue());
        }
        apVar.mo1104a(this.f4561p != null);
        if (this.f4561p != null) {
            apVar.m1195a(this.f4561p);
        }
        apVar.mo1104a(this.f4557l != null);
        if (this.f4557l != null) {
            apVar.mo1110a(this.f4557l.f224a);
            apVar.mo1110a(this.f4557l.f225b);
        }
        apVar.mo1108a(this.f4558m);
        apVar.m1174c(this.f4572k.m3719a());
        apVar.mo1104a(this.f4569f);
        apVar.mo1105a(this.f4562q);
        apVar.mo1104a(this.f4563r);
        if (this.f4563r) {
            apVar.m1175c(0);
            apVar.mo1110a(this.f4564s);
            apVar.mo1110a(this.f4565t);
            apVar.mo1109a(this.f4566u);
        }
        apVar.mo1109a(this.f4576w.size());
        for (int i = 0; i < this.f4576w.size(); i++) {
            ((C0598d) this.f4576w.get(i)).m1923a(apVar);
        }
        apVar.mo1104a(this.f4571h);
        apVar.mo1107a("c");
    }

    /* renamed from: a */
    public void m1614a(C0707k kVar) {
        kVar.m1082b("c");
        this.f4555i = AbstractC0171m.m3740n(kVar.m1079d());
        if (this.f4555i == null) {
            throw new IOException("team==null");
        }
        if (kVar.m1077e()) {
            this.f4556j = new C0270an();
            this.f4556j.m3473a(kVar);
        }
        this.f4568e = kVar.m1077e();
        this.f4570g = kVar.m1077e();
        this.f4572k = C0181c.m3716a(String.valueOf(kVar.m1076f()));
        this.f4559n = (EnumC0178a) kVar.m1083b(EnumC0178a.class);
        if (kVar.m1077e()) {
            this.f4560z = new PointF();
            this.f4560z.f224a = kVar.m1075g();
            this.f4560z.f225b = kVar.m1075g();
        }
        this.f4573o = kVar.m1077e();
        int f = kVar.m1076f();
        for (int i = 0; i < f; i++) {
            this.f4574A.add(Long.valueOf(kVar.m1069m()));
        }
        if (kVar.m1085b() >= 16) {
            this.f4561p = null;
            if (kVar.m1077e()) {
                this.f4561p = kVar.m1065q();
            }
        }
        if (kVar.m1085b() >= 29) {
            if (kVar.m1077e()) {
                this.f4557l = new PointF();
                this.f4557l.f224a = kVar.m1075g();
                this.f4557l.f225b = kVar.m1075g();
            }
            this.f4558m = kVar.m1068n();
        }
        if (kVar.m1085b() >= 33) {
            this.f4572k = C0181c.m3716a(kVar.m1071k());
        }
        if (kVar.m1085b() >= 37) {
            this.f4569f = kVar.m1077e();
        }
        if (kVar.m1085b() >= 52) {
            this.f4562q = kVar.m1062t();
        }
        if (kVar.m1085b() >= 53) {
            this.f4563r = kVar.m1077e();
            if (this.f4563r) {
                kVar.m1079d();
                this.f4564s = kVar.m1075g();
                this.f4565t = kVar.m1075g();
                this.f4566u = kVar.m1076f();
            }
            int f2 = kVar.m1076f();
            this.f4576w.clear();
            for (int i2 = 0; i2 < f2; i2++) {
                C0598d dVar = new C0598d();
                dVar.m1922a(kVar);
                this.f4576w.add(dVar);
            }
        }
        if (kVar.m1085b() >= 80) {
            this.f4571h = kVar.m1077e();
        }
        kVar.m1078d("c");
    }

    /* renamed from: a */
    public void m1613a(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            m1616a((AbstractC0515r) it.next());
        }
    }

    /* renamed from: a */
    public void m1616a(AbstractC0515r rVar) {
        if (rVar == null) {
            throw new RuntimeException("unit cannot be null");
        }
        if (rVar.f1441bB != this.f4555i) {
        }
        if (this.f4555i.f1239r) {
            if (!(rVar.f1441bB == this.f4555i || AbstractC0789l.m651u().f5464bb == this.f4555i)) {
                AbstractC0789l.m694b("CommandController", "Warning AI: " + this.f4555i.f1230i + " gave an order to unit with team:" + rVar.f1441bB.f1230i + " type:" + rVar.mo1660r().mo3494i());
                AbstractC0789l.m676f("");
            }
            if (rVar.mo3586cE()) {
                AbstractC0789l.m694b("CommandController", "Warning AI: " + this.f4555i.f1230i + " gave an order to unit with canNotBeGivenOrdersByPlayer: " + rVar.mo1660r().mo3494i());
            }
        }
        this.f4575v.add(rVar);
    }

    /* renamed from: h */
    public void m1599h() {
        this.f4573o = true;
    }

    /* renamed from: a */
    public void m1626a(float f, float f2) {
        this.f4556j = new C0270an();
        this.f4556j.m3478a(f, f2);
    }

    /* renamed from: b */
    public void m1611b(float f, float f2) {
        this.f4556j = new C0270an();
        this.f4556j.m3471b(f, f2);
    }

    /* renamed from: a */
    public void m1618a(AbstractC0210af afVar) {
        this.f4556j = new C0270an();
        this.f4556j.m3476a(afVar);
    }

    /* renamed from: a */
    public void m1624a(float f, float f2, boolean z) {
        this.f4556j = new C0270an();
        this.f4556j.m3471b(f, f2);
        this.f4556j.f1651j = z;
    }

    /* renamed from: a */
    public void m1617a(AbstractC0210af afVar, boolean z) {
        this.f4556j = new C0270an();
        this.f4556j.m3476a(afVar);
        this.f4556j.f1651j = z;
    }

    /* renamed from: a */
    public void m1625a(float f, float f2, AbstractC0268al alVar, int i) {
        this.f4556j = new C0270an();
        this.f4556j.m3477a(f, f2, alVar, i);
    }

    /* renamed from: b */
    public void m1610b(AbstractC0210af afVar) {
        this.f4556j = new C0270an();
        this.f4556j.m3470b(afVar);
    }

    /* renamed from: c */
    public void m1607c(AbstractC0210af afVar) {
        this.f4556j = new C0270an();
        this.f4556j.m3466c(afVar);
    }

    /* renamed from: c */
    public void m1608c(float f, float f2) {
        this.f4556j = new C0270an();
        this.f4556j.m3467c(f, f2);
    }

    /* renamed from: d */
    public void m1605d(AbstractC0210af afVar) {
        this.f4556j = new C0270an();
        this.f4556j.m3459f(afVar);
    }

    /* renamed from: e */
    public void m1603e(AbstractC0210af afVar) {
        this.f4556j = new C0270an();
        this.f4556j.m3457g(afVar);
    }

    /* renamed from: f */
    public void m1601f(AbstractC0210af afVar) {
        this.f4556j = new C0270an();
        this.f4556j.m3455h(afVar);
    }

    /* renamed from: a */
    public void m1621a(C0181c cVar) {
        this.f4572k = cVar;
    }

    /* renamed from: a */
    public void m1620a(C0181c cVar, PointF pointF, AbstractC0210af afVar) {
        this.f4572k = cVar;
        this.f4557l = pointF;
        this.f4558m = afVar;
    }

    /* renamed from: a */
    public void m1619a(EnumC0178a aVar) {
        this.f4559n = aVar;
    }

    /* renamed from: a */
    public void m1623a(PointF pointF) {
        this.f4560z = pointF;
    }

    /* renamed from: i */
    public synchronized void m1598i() {
        Iterator it = this.f4574A.iterator();
        while (it.hasNext()) {
            AbstractC0515r b = AbstractC0854w.m397b(((Long) it.next()).longValue(), true);
            if (b != null) {
                this.f4575v.add(b);
            }
        }
        this.f4574A.clear();
        Iterator it2 = this.f4575v.iterator();
        while (it2.hasNext()) {
            if (((AbstractC0515r) it2.next()).f1520bz) {
                it2.remove();
            }
        }
    }

    /* renamed from: j */
    public void m1597j() {
        if (AbstractC0197s.m3683c(this.f4572k)) {
            Iterator it = this.f4575v.iterator();
            while (it.hasNext()) {
                AbstractC0515r rVar = (AbstractC0515r) it.next();
                rVar.mo2772b(rVar.mo3632a(this.f4572k), this.f4570g);
            }
        }
    }

    /* renamed from: k */
    public void m1596k() {
        C0270an ar;
        String str;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!u.f5490bJ.m1995h() || this.f4551a) {
            m1598i();
            if (!this.f4563r) {
                if (this.f4561p != null) {
                    this.f4561p.f1264N = System.currentTimeMillis();
                    this.f4561p.f1265O = u.f5467bh;
                }
                if (this.f4561p != null) {
                    String str2 = null;
                    AbstractC0515r rVar = null;
                    Iterator it = this.f4575v.iterator();
                    while (it.hasNext()) {
                        AbstractC0515r rVar2 = (AbstractC0515r) it.next();
                        if (rVar2.f1441bB != this.f4561p && !m1622a(this.f4561p, rVar2.f1441bB)) {
                            if (str2 == null) {
                                str = "";
                            } else {
                                str = str2 + ", ";
                            }
                            if (rVar == null) {
                                rVar = rVar2;
                            }
                            str2 = str + rVar2.f5835dA;
                            it.remove();
                        } else if (rVar2.mo3586cE()) {
                            AbstractC0789l.m683d("Warning unit: " + rVar2.f5835dA + " has canNotBeGivenOrdersByPlayer set");
                            it.remove();
                        }
                    }
                    if (str2 != null) {
                        Hcat_Multiplaye.m1334a("Player(" + this.f4561p.f1230i + ") " + this.f4561p.f1238q + " cannot control units: " + str2, true);
                        if (rVar != null) {
                            String str3 = "";
                            if (rVar.f1441bB != null) {
                                str3 = str3 + " targetUnitTeamId: " + rVar.f1441bB.f1230i + " targetUnitTeamName: " + rVar.f1441bB.f1238q;
                            }
                            AbstractC0789l.m695b(str3);
                        }
                    }
                }
                if (this.f4573o) {
                    Iterator it2 = this.f4575v.iterator();
                    while (it2.hasNext()) {
                        AbstractC0515r rVar3 = (AbstractC0515r) it2.next();
                        rVar3.m2292ax();
                        rVar3.f3394I = null;
                    }
                }
                if (this.f4556j != null) {
                    this.f4556j.m3468c();
                    C0536ab b = u.f5484bD.m2163b();
                    b.f3606g = this.f4576w;
                    int i = 0;
                    while (i <= 1) {
                        boolean z = i == 1;
                        Iterator it3 = this.f4575v.iterator();
                        while (it3.hasNext()) {
                            AbstractC0515r rVar4 = (AbstractC0515r) it3.next();
                            if (rVar4.f3417V == z) {
                                if (this.f4569f) {
                                    rVar4.m2291ay();
                                } else if (!this.f4568e) {
                                    rVar4.m2292ax();
                                } else if (this.f4571h && this.f4556j != null && (ar = rVar4.m2298ar()) != null && this.f4556j.m3475a(ar) && (ar.m3464d() == EnumC0271ao.f1666h || ar.m3464d() == EnumC0271ao.f1659a)) {
                                    if (this.f4556j.m3464d() == EnumC0271ao.f1666h || this.f4556j.m3464d() == EnumC0271ao.f1659a) {
                                        rVar4.m2297as();
                                    }
                                }
                            }
                        }
                        i++;
                    }
                    Iterator it4 = this.f4575v.iterator();
                    while (it4.hasNext()) {
                        AbstractC0515r rVar5 = (AbstractC0515r) it4.next();
                        C0270an c = rVar5.m2252c(this.f4556j);
                        b.m2157a(rVar5, c);
                        rVar5.m2357a(c);
                    }
                    b.m2154b();
                    return;
                }
                if (AbstractC0197s.m3683c(this.f4572k)) {
                    Iterator it5 = this.f4575v.iterator();
                    while (it5.hasNext()) {
                        AbstractC0515r rVar6 = (AbstractC0515r) it5.next();
                        AbstractC0197s a = rVar6.mo3632a(this.f4572k);
                        if (a == null) {
                            AbstractC0789l.m683d("Could not find specialAction:" + this.f4572k.m3719a() + " on " + rVar6.mo1660r().mo3494i());
                        } else if (!a.mo2465a((AbstractC0210af) rVar6)) {
                            AbstractC0789l.m683d("!isAvailable specialAction:" + this.f4572k.m3719a() + " on " + rVar6.mo1660r().mo3494i() + " (action being skipped)");
                            if (C0595c.f4090a) {
                                AbstractC0789l.m683d("Command source:" + this.f4552b);
                            }
                        } else {
                            rVar6.mo2773b(a);
                            C0647w.m1643a(rVar6, a);
                            rVar6.mo2716a(a, this.f4570g, this.f4557l, this.f4558m);
                        }
                    }
                    C0188j a2 = C0188j.m3702a(this.f4572k);
                    if (a2 != null) {
                        if (u.f5464bb == null || this.f4555i == null) {
                            AbstractC0789l.m683d("PingMapAction failed: game.playerTeam==null or this.team==null");
                        } else if (this.f4555i.m3768d(u.f5464bb)) {
                            u.f5481bA.m1800a(this.f4557l.f224a, this.f4557l.f225b, this.f4555i, a2);
                        }
                    }
                }
                if (this.f4559n != null) {
                    Iterator it6 = this.f4575v.iterator();
                    while (it6.hasNext()) {
                        ((AbstractC0515r) it6.next()).f3472G = this.f4559n;
                    }
                }
                if (this.f4560z != null) {
                    Iterator it7 = this.f4575v.iterator();
                    while (it7.hasNext()) {
                        AbstractC0515r rVar7 = (AbstractC0515r) it7.next();
                        if (rVar7 instanceof AbstractC0416k) {
                            ((AbstractC0416k) rVar7).mo2742a(this.f4560z);
                        }
                    }
                }
            } else if (this.f4564s != 0.0f) {
                AbstractC0789l.m683d("issueCommand: changeStepRate:" + this.f4564s);
                u.f5486bF.m1365a(this.f4564s, "command");
            } else if (this.f4566u != 0) {
                AbstractC0789l.m683d("system action:" + this.f4566u);
                if (this.f4566u == 1) {
                    AbstractC0789l.m683d("new DebugDesyncDetector");
                    new C0461g(false).mo3633a(AbstractC0171m.f1281g);
                } else if (this.f4566u == 2) {
                    AbstractC0789l.m683d("new DebugDesyncDetector (stress test)");
                    C0461g gVar = new C0461g(false);
                    gVar.mo3633a(AbstractC0171m.f1281g);
                    gVar.f3278a = true;
                } else if (this.f4566u == 100) {
                    AbstractC0789l.m683d("team surrender");
                    if (this.f4555i == null) {
                        AbstractC0789l.m683d("team not found");
                        return;
                    }
                    if (u.f5486bF.f4664A) {
                        u.f5486bF.m1251h("'" + this.f4555i.f1238q + "' has surrendered");
                    }
                    this.f4555i.f1244u = true;
                    Iterator it8 = AbstractC0210af.f1473bj.iterator();
                    while (it8.hasNext()) {
                        AbstractC0210af afVar = (AbstractC0210af) it8.next();
                        if (afVar.f1441bB == this.f4555i && (afVar instanceof AbstractC0515r)) {
                            ((AbstractC0515r) afVar).mo3591c(false);
                        }
                    }
                } else if (this.f4566u == 200) {
                    AbstractC0789l.m683d("queue quick resync");
                    u.f5486bF.f4671K = true;
                } else if (this.f4566u == 5) {
                    AbstractC0789l.m683d("system command spawn");
                    if (this.f4556j == null || this.f4556j.m3464d() != EnumC0271ao.f1661c || this.f4556j.m3479a() == null) {
                        AbstractC0789l.m683d("system command spawn - failed");
                        return;
                    }
                    int b2 = this.f4556j.m3472b();
                    AbstractC0268al a3 = this.f4556j.m3479a();
                    boolean z2 = false;
                    if (this.f4555i != null && this.f4555i == u.f5464bb && u.f5464bb.m3798a(false, false) == 0) {
                        z2 = true;
                    }
                    AbstractC0210af a4 = a3.mo3504a();
                    a4.f5841dH = this.f4556j.m3458g();
                    a4.f5842dI = this.f4556j.m3456h();
                    if (this.f4555i != null) {
                        a4.mo3553d(this.f4555i);
                    } else {
                        a4.mo3553d(AbstractC0171m.f1281g);
                    }
                    a4.mo3556cx();
                    if (b2 != 1 && (a4 instanceof AbstractC0515r)) {
                        ((AbstractC0515r) a4).mo2603a(b2);
                    }
                    a4.mo3555cy();
                    if (a4 instanceof AbstractC0515r) {
                        AbstractC0515r rVar8 = (AbstractC0515r) a4;
                        rVar8.m2262bm();
                        if (a4.mo2797bw()) {
                            u.f5483bC.m971a(rVar8);
                        }
                    }
                    AbstractC0171m.m3777c(a4);
                    if (u.f5464bb == a4.f1441bB && a4.f1441bB != AbstractC0171m.f1281g && !a4.mo1661o_() && z2) {
                        u.m701b(a4.f5841dH, a4.f5842dI);
                        u.f5481bA.m1725j(a4);
                    }
                } else {
                    AbstractC0789l.m683d("issueCommand: unknown system action:" + this.f4566u);
                }
            } else {
                AbstractC0789l.m683d("issueCommand: Null System action");
            }
        }
    }

    /* renamed from: a */
    public boolean m1622a(AbstractC0171m mVar, AbstractC0171m mVar2) {
        if (mVar == null || mVar2 == null || !mVar2.m3768d(mVar) || (this.f4562q & (1 << mVar2.f1230i)) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m1595l() {
        AbstractC0268al a;
        AbstractC0210af a2;
        this.f4562q = (short) 0;
        for (int i = 0; i < AbstractC0171m.f1275a; i++) {
            AbstractC0171m n = AbstractC0171m.m3740n(i);
            if (n != null && n.m3743m()) {
                this.f4562q = (short) (this.f4562q | (1 << i));
            }
        }
        if (AbstractC0789l.m651u().m686c(true) < 127 && this.f4556j != null && this.f4556j.m3464d() == EnumC0271ao.f1661c && (a = this.f4556j.m3479a()) != null && (a2 = AbstractC0210af.m3630a(a)) != null && !(a2 instanceof AbstractC0515r)) {
            AbstractC0789l.m683d("Rejecting non OrderableUnit build order: " + a.mo3494i());
            return false;
        } else if (this.f4556j == null || !this.f4556j.f1653n) {
            return true;
        } else {
            AbstractC0789l.m683d("Rejecting waypoint with addedByAction true");
            return false;
        }
    }
}

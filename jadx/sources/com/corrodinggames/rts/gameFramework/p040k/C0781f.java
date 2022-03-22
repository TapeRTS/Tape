package com.corrodinggames.rts.gameFramework.p040k;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p011a.C0118a;
import com.corrodinggames.rts.game.p012b.C0147a;
import com.corrodinggames.rts.game.p012b.C0154f;
import com.corrodinggames.rts.game.p012b.C0157i;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0209ae;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.custom.C0311ag;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.p023d.C0404d;
import com.corrodinggames.rts.game.units.p023d.C0407f;
import com.corrodinggames.rts.game.units.p023d.p024a.C0389b;
import com.corrodinggames.rts.gameFramework.AbstractC0585bi;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p030b.C0571c;
import com.corrodinggames.rts.gameFramework.p030b.C0575g;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.k.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/f.class */
public class C0781f extends AbstractC0585bi {

    /* renamed from: a */
    public static boolean f5371a = false;

    /* renamed from: b */
    int f5372b;

    /* renamed from: c */
    int f5373c;

    /* renamed from: d */
    AbstractC0171m f5374d;

    /* renamed from: e */
    EnumC0787l f5375e;

    /* renamed from: h */
    public C0311ag f5376h;

    /* renamed from: i */
    boolean f5377i;

    /* renamed from: j */
    boolean f5378j;

    /* renamed from: k */
    public boolean f5379k;

    /* renamed from: l */
    public boolean f5380l;

    /* renamed from: m */
    boolean f5381m;

    /* renamed from: n */
    boolean f5382n;

    /* renamed from: o */
    boolean f5383o;

    /* renamed from: p */
    boolean f5384p;

    /* renamed from: q */
    public boolean f5385q;

    /* renamed from: E */
    public Paint f5386E;

    /* renamed from: F */
    public Paint f5387F;

    /* renamed from: G */
    public Paint f5388G;

    /* renamed from: H */
    public Paint f5389H;

    /* renamed from: N */
    public boolean f5390N;

    /* renamed from: f */
    EnumC0787l f5391f = EnumC0787l.f5438b;

    /* renamed from: g */
    public ArrayList f5392g = new ArrayList();

    /* renamed from: r */
    public int f5393r = 0;

    /* renamed from: s */
    String f5394s = null;

    /* renamed from: t */
    String f5395t = null;

    /* renamed from: u */
    int f5396u = 0;

    /* renamed from: v */
    int f5397v = 2;

    /* renamed from: w */
    int f5398w = 1;

    /* renamed from: x */
    int f5399x = 0;

    /* renamed from: y */
    public int f5400y = 0;

    /* renamed from: z */
    float f5401z = 3000.0f;

    /* renamed from: A */
    float f5402A = 0.0f;

    /* renamed from: B */
    float f5403B = 0.0f;

    /* renamed from: C */
    EnumC0783h f5404C = EnumC0783h.f5426a;

    /* renamed from: D */
    ArrayList f5405D = new ArrayList();

    /* renamed from: I */
    final boolean f5406I = true;

    /* renamed from: J */
    public ArrayList f5407J = new ArrayList();

    /* renamed from: K */
    PointF f5408K = new PointF();

    /* renamed from: L */
    int f5409L = 0;

    /* renamed from: M */
    float f5410M = 0.0f;

    /* renamed from: O */
    public ArrayList f5411O = new ArrayList();

    /* renamed from: P */
    PointF f5412P = new PointF();

    /* renamed from: Q */
    boolean f5413Q = false;

    /* renamed from: R */
    boolean f5414R = false;

    /* renamed from: S */
    ArrayList f5415S = new ArrayList();

    /* renamed from: T */
    ArrayList f5416T = new ArrayList();

    /* renamed from: a */
    public void m803a(String str) {
        AbstractC0789l.m694b("MissionEngine", "Map warning: " + str);
        Hcat_Multiplaye.m1335a((String) null, "Map error: " + str);
    }

    /* renamed from: a */
    public void mo1654a(C0690ap apVar) {
        apVar.mo1104a(this.f5378j);
        apVar.mo1109a(this.f5393r);
        apVar.mo1109a(this.f5396u);
        apVar.mo1109a(this.f5397v);
        apVar.mo1109a(this.f5398w);
        apVar.mo1109a(this.f5399x);
        apVar.mo1110a(this.f5401z);
        apVar.mo1110a(this.f5402A);
        apVar.mo1110a(this.f5403B);
        apVar.mo1104a(this.f5381m);
        apVar.mo1109a(6);
        apVar.mo1109a(this.f5407J.size());
        Iterator it = this.f5407J.iterator();
        while (it.hasNext()) {
            C0762a aVar = (C0762a) it.next();
            apVar.m1174c(aVar.f5314c);
            apVar.mo1104a(aVar.f5318j);
            apVar.mo1109a(aVar.f5319k);
            apVar.mo1109a(aVar.f5320l);
            apVar.mo1104a(aVar.f5321m);
            apVar.mo1109a(aVar.f5334n);
        }
        apVar.mo1109a(this.f5400y);
        apVar.mo1104a(this.f5380l);
    }

    /* renamed from: a */
    public void m807a(C0707k kVar) {
        this.f5378j = kVar.m1077e();
        this.f5393r = kVar.m1076f();
        this.f5396u = kVar.m1076f();
        this.f5397v = kVar.m1076f();
        this.f5398w = kVar.m1076f();
        this.f5399x = kVar.m1076f();
        this.f5401z = kVar.m1075g();
        this.f5402A = kVar.m1075g();
        this.f5403B = kVar.m1075g();
        this.f5381m = kVar.m1077e();
        int f = kVar.m1076f();
        if (f >= 1) {
            int f2 = kVar.m1076f();
            for (int i = 0; i < f2; i++) {
                String k = kVar.m1071k();
                boolean e = kVar.m1077e();
                int i2 = 0;
                int i3 = 0;
                boolean z = false;
                int i4 = 0;
                if (f >= 2) {
                    i2 = kVar.m1076f();
                    i3 = kVar.m1076f();
                }
                if (f >= 3) {
                    z = kVar.m1077e();
                }
                if (f >= 4) {
                    i4 = kVar.m1076f();
                }
                C0762a e2 = m788e(k);
                if (e2 == null) {
                    AbstractC0789l.m695b("MissionEngine:readIn: Could not find saved trigger:" + k + " for de/activation");
                } else {
                    e2.f5318j = e;
                    e2.f5319k = i2;
                    e2.f5320l = i3;
                    e2.f5321m = z;
                    e2.f5334n = i4;
                }
            }
        }
        if (f >= 5) {
            this.f5400y = kVar.m1076f();
        }
        if (f >= 6) {
            this.f5380l = kVar.m1077e();
        } else {
            this.f5380l = true;
        }
    }

    /* renamed from: b */
    public void m797b(String str) {
        AbstractC0789l.m694b("MissionEngine:triggerLog", str);
    }

    /* renamed from: a */
    public boolean m811a() {
        return this.f5382n;
    }

    /* renamed from: b */
    public boolean m799b() {
        return this.f5383o;
    }

    /* renamed from: a */
    public void m800a(boolean z) {
        String[] a;
        String[] split;
        String[] split2;
        Integer c;
        AbstractC0789l u = AbstractC0789l.m651u();
        this.f5385q = false;
        this.f5372b = u.f5467bh - 1000;
        this.f5373c = u.f5467bh - 1000;
        this.f5386E = new Paint();
        this.f5386E.m4522a(255, 255, 255, 255);
        this.f5386E.m4506a(true);
        this.f5386E.m4519a(Paint.Align.f197b);
        this.f5386E.mo851a(Typeface.m4434a(Typeface.f243c, 1));
        u.m736a(this.f5386E, 24.0f);
        this.f5388G = new Paint();
        this.f5388G.m4522a(255, 255, 255, 255);
        this.f5388G.m4506a(true);
        this.f5388G.m4519a(Paint.Align.f197b);
        u.m736a(this.f5388G, 18.0f);
        this.f5389H = new Paint();
        this.f5389H.m4522a(255, 255, 255, 255);
        this.f5389H.m4506a(true);
        this.f5389H.m4519a(Paint.Align.f197b);
        u.m736a(this.f5389H, 14.0f);
        this.f5387F = new Paint();
        this.f5387F.m4516a(this.f5389H);
        u.m736a(this.f5387F, 18.0f);
        this.f5378j = true;
        boolean z2 = false;
        C0147a aVar = null;
        if (u.f5474bt.f740L == null) {
            AbstractC0789l.m694b("MissionEngine", "Error: 'triggers' object layer is missing from this map");
            z2 = true;
        } else {
            aVar = u.f5474bt.f740L.m3920a("map_info");
        }
        if (aVar == null) {
            AbstractC0789l.m694b("MissionEngine", "Error: map_info is missing from this map");
            z2 = true;
        }
        if (aVar != null && aVar.m4034b("type") == null) {
            m803a("type is missing from map_info");
            z2 = true;
        }
        if (z2) {
            AbstractC0789l.m694b("MissionEngine", "Defaulting to skirmish");
            this.f5382n = true;
            this.f5375e = EnumC0787l.f5442f;
            return;
        }
        this.f5379k = "survival".equalsIgnoreCase(aVar.m4034b("type"));
        if (this.f5379k) {
            this.f5380l = "true".equalsIgnoreCase(aVar.m4034b("survivalWavesClassic"));
            if (this.f5380l) {
                AbstractC0789l.m683d("Classic survial waves selected");
            }
            m787f();
            this.f5384p = false;
            this.f5400y = u.f5479by.aiDifficulty;
            if (!this.f5380l) {
                this.f5401z = 1200.0f;
                if (this.f5400y < 0) {
                    this.f5401z = 3000.0f;
                }
            } else {
                this.f5401z = 3000.0f;
            }
        }
        String b = aVar.m4034b("survivalWaves");
        if (b != null) {
            m784g(b);
        }
        String b2 = aVar.m4034b("startWithMusic");
        if (b2 != null) {
            u.f5476bv.m2120a(b2);
        }
        this.f5382n = "skirmish".equalsIgnoreCase(aVar.m4034b("type"));
        if (this.f5382n) {
            this.f5375e = EnumC0787l.f5442f;
        }
        this.f5383o = "true".equalsIgnoreCase(aVar.m4034b("shareFogWithAllies"));
        String b3 = aVar.m4034b("winCondition");
        if (b3 != null || this.f5382n) {
            if (b3 != null) {
                if (b3.equalsIgnoreCase("none")) {
                    this.f5375e = EnumC0787l.f5437a;
                } else if (b3.equalsIgnoreCase("allUnitsAndBuildings")) {
                    this.f5375e = EnumC0787l.f5438b;
                } else if (b3.equalsIgnoreCase("allBuildings")) {
                    this.f5375e = EnumC0787l.f5439c;
                } else if (b3.equalsIgnoreCase("mainBuilings")) {
                    this.f5375e = EnumC0787l.f5440d;
                } else if (b3.equalsIgnoreCase("mainBuildings")) {
                    this.f5375e = EnumC0787l.f5440d;
                } else if (b3.equalsIgnoreCase("commandCenter")) {
                    this.f5375e = EnumC0787l.f5441e;
                } else if (b3.equalsIgnoreCase("requiredObjectives")) {
                    this.f5375e = EnumC0787l.f5443g;
                } else {
                    throw new C0154f("unknown win condition:" + b3);
                }
            }
            if (this.f5382n) {
                this.f5391f = this.f5375e;
            }
            this.f5376h = aVar.m4037a("introText", (C0311ag) null);
            if (this.f5376h != null) {
                this.f5376h.m3315a("\\\\n", "\n");
                if (this.f5376h.m3317a()) {
                    this.f5376h = null;
                }
            }
            if (!u.m707ao() && !this.f5382n) {
                this.f5374d = AbstractC0171m.m3740n(3);
                if (this.f5374d != null) {
                    this.f5374d.f1236o = 0;
                }
            }
            if (u.m707ao()) {
            }
            Iterator it = u.f5474bt.f740L.f881c.iterator();
            while (it.hasNext()) {
                C0147a aVar2 = (C0147a) it.next();
                if ("team_info".equalsIgnoreCase(aVar2.f712d)) {
                    int parseInt = Integer.parseInt(aVar2.m4036a("team", "-2"));
                    if (parseInt == -2) {
                        throw new RuntimeException("cannot find team for:" + aVar2.f710b);
                    }
                    AbstractC0171m n = AbstractC0171m.m3740n(parseInt);
                    if (n == null) {
                        AbstractC0789l.m695b("No team loaded for:" + parseInt + " skipping");
                    } else {
                        String b4 = aVar2.m4034b("credits");
                        if (b4 != null) {
                            n.money = Integer.parseInt(b4);
                        }
                        if (aVar2.m4034b("basicAI") != null && u.m765I() && (n instanceof C0118a)) {
                            AbstractC0789l.m695b("Using basic AI:" + parseInt + " by map request");
                            ((C0118a) n).f541aH = true;
                        }
                        String b5 = aVar2.m4034b("lockAiDifficulty");
                        if (b5 != null && (n instanceof C0118a)) {
                            AbstractC0789l.m695b("Locking lockAiDifficulty:" + parseInt + " by map request to: " + b5);
                            C0118a aVar3 = (C0118a) n;
                            aVar3.f1240s = Integer.parseInt(b5);
                            aVar3.f1241t = true;
                            u.f5486bF.m1318ah();
                        }
                        if (aVar2.m4034b("disabledAI") != null && u.m765I() && (n instanceof C0118a)) {
                            AbstractC0789l.m695b("Disabling AI:" + parseInt + " by map request");
                            ((C0118a) n).f540aG = true;
                        }
                        String b6 = aVar2.m4034b("allyGroup");
                        if (b6 != null && u.m765I()) {
                            n.f1236o = Integer.parseInt(b6);
                        }
                        String b7 = aVar2.m4034b("ai");
                        if (b7 != null) {
                            n.f1260J = b7.equalsIgnoreCase("survival");
                        }
                    }
                }
                if ("camera_start".equalsIgnoreCase(aVar2.f710b) && !z) {
                    u.m701b(aVar2.f713e, aVar2.f714f);
                    this.f5385q = true;
                    if (aVar2.m4033c("zoomTo") != null) {
                        u.f5600cC = c.intValue();
                    }
                }
                if ("attack_point".equalsIgnoreCase(aVar2.f710b)) {
                    this.f5405D.add(new PointF(aVar2.f713e, aVar2.f714f));
                }
                if ("rotate".equalsIgnoreCase(aVar2.f712d)) {
                    float parseFloat = Float.parseFloat(aVar2.m4034b("dir"));
                    Iterator it2 = AbstractC0210af.f1473bj.iterator();
                    while (it2.hasNext()) {
                        AbstractC0210af afVar = (AbstractC0210af) it2.next();
                        if ((afVar instanceof AbstractC0515r) && !afVar.mo2797bw() && aVar2.m4039a(afVar)) {
                            afVar.f1444bL = parseFloat;
                        }
                    }
                }
                if ("fall".equalsIgnoreCase(aVar2.f712d)) {
                    Iterator it3 = AbstractC0210af.f1473bj.iterator();
                    while (it3.hasNext()) {
                        AbstractC0210af afVar2 = (AbstractC0210af) it3.next();
                        if ((afVar2 instanceof AbstractC0515r) && !afVar2.mo2797bw() && aVar2.m4039a(afVar2)) {
                            afVar2.mo3583cK();
                        }
                    }
                }
                if ("set_team".equalsIgnoreCase(aVar2.f712d)) {
                    int parseInt2 = Integer.parseInt(aVar2.m4034b("team"));
                    Iterator it4 = AbstractC0210af.f1473bj.iterator();
                    while (it4.hasNext()) {
                        AbstractC0210af afVar3 = (AbstractC0210af) it4.next();
                        if ((afVar3 instanceof AbstractC0515r) && aVar2.m4039a(afVar3)) {
                            afVar3.m3641O(parseInt2);
                        }
                    }
                }
                if ("ai_allow_full_use".equalsIgnoreCase(aVar2.f712d)) {
                    Iterator it5 = AbstractC0210af.f1473bj.iterator();
                    while (it5.hasNext()) {
                        AbstractC0210af afVar4 = (AbstractC0210af) it5.next();
                        if ((afVar4 instanceof AbstractC0515r) && aVar2.m4039a(afVar4)) {
                            ((AbstractC0515r) afVar4).f1514br = false;
                        }
                    }
                }
                if ("disable_unit_ai".equalsIgnoreCase(aVar2.f712d)) {
                    Iterator it6 = AbstractC0210af.f1473bj.iterator();
                    while (it6.hasNext()) {
                        AbstractC0210af afVar5 = (AbstractC0210af) it6.next();
                        if ((afVar5 instanceof AbstractC0515r) && aVar2.m4039a(afVar5)) {
                            afVar5.f1515bs = true;
                        }
                    }
                }
            }
            Iterator it7 = AbstractC0210af.f1473bj.iterator();
            while (it7.hasNext()) {
                AbstractC0210af afVar6 = (AbstractC0210af) it7.next();
                if (!afVar6.mo1661o_() && !(afVar6 instanceof C0209ae) && !afVar6.mo2797bw() && afVar6.f1539cp == null && afVar6.f1540cq == null) {
                    AbstractC0210af afVar7 = null;
                    float f = 4900.0f;
                    Iterator it8 = AbstractC0210af.f1473bj.iterator();
                    while (it8.hasNext()) {
                        AbstractC0210af afVar8 = (AbstractC0210af) it8.next();
                        if (afVar8.mo2631cc() && afVar6 != afVar8 && (afVar6.f1441bB == AbstractC0171m.f1281g || afVar8.f1441bB.m3768d(afVar6.f1441bB))) {
                            float a2 = C0654f.m1573a(afVar8.f5841dH, afVar8.f5842dI, afVar6.f5841dH, afVar6.f5842dI);
                            if (a2 < f && afVar8.mo2630d(afVar6, true)) {
                                afVar7 = afVar8;
                                f = a2;
                            }
                        }
                    }
                    if (afVar7 != null) {
                        afVar7.mo2628e(afVar6, true);
                    }
                }
            }
            this.f5407J.clear();
            Iterator it9 = u.f5474bt.f740L.f881c.iterator();
            while (it9.hasNext()) {
                C0147a aVar4 = (C0147a) it9.next();
                if (!"team_info".equalsIgnoreCase(aVar4.f712d) && !"point".equalsIgnoreCase(aVar4.f712d) && !"camera_pan".equalsIgnoreCase(aVar4.f712d) && !"camera_start".equalsIgnoreCase(aVar4.f710b) && !"map_info".equalsIgnoreCase(aVar4.f710b) && !"attack_point".equalsIgnoreCase(aVar4.f710b) && !"rotate".equalsIgnoreCase(aVar4.f712d) && !"fall".equalsIgnoreCase(aVar4.f712d) && !"set_team".equalsIgnoreCase(aVar4.f712d) && !"ai_allow_full_use".equalsIgnoreCase(aVar4.f712d) && !"disable_unit_ai".equalsIgnoreCase(aVar4.f712d) && !"info".equalsIgnoreCase(aVar4.f712d)) {
                    if (aVar4.f723n == null) {
                        m793c("Error: Skipping trigger:" + aVar4.f710b + " - no properties found");
                    } else {
                        C0762a a3 = C0767c.m815a(this, aVar4);
                        if (a3 != null) {
                            this.f5407J.add(a3);
                        }
                    }
                }
            }
            Iterator it10 = this.f5407J.iterator();
            while (it10.hasNext()) {
                C0762a aVar5 = (C0762a) it10.next();
                String b8 = aVar5.m833b("activateIds");
                if (b8 == null) {
                    b8 = aVar5.m833b("alsoActivate");
                }
                if (b8 != null) {
                    for (String str : b8.split(",")) {
                        C0762a d = m790d(str);
                        if (d == null) {
                            aVar5.m824g("linkedTo target not found: " + b8);
                            AbstractC0789l.m683d("Possible IDs:");
                            Iterator it11 = this.f5407J.iterator();
                            while (it11.hasNext()) {
                                C0762a aVar6 = (C0762a) it11.next();
                                if (aVar6.f5313b != null) {
                                    AbstractC0789l.m683d(aVar6.f5313b);
                                }
                            }
                            AbstractC0789l.m683d("--------");
                        } else {
                            d.f5331d.m817a(aVar5);
                        }
                    }
                }
                String b9 = aVar5.m833b("whenActivatedIds");
                if (b9 == null) {
                    b9 = aVar5.m833b("activatedBy");
                }
                if (b9 != null) {
                    for (String str2 : b9.split(",")) {
                        C0762a d2 = m790d(str2);
                        if (d2 == null) {
                            aVar5.m824g("linkedFrom target not found: " + str2);
                        } else {
                            aVar5.f5331d.m817a(d2);
                        }
                    }
                }
                String b10 = aVar5.m833b("deactivatedBy");
                if (b10 != null) {
                    for (String str3 : b10.split(",")) {
                        C0762a d3 = m790d(str3);
                        if (d3 == null) {
                            aVar5.m824g("deactivatedBy: target not found: " + str3);
                        } else {
                            aVar5.f5332e.m817a(d3);
                        }
                    }
                }
            }
            AbstractC0789l.m683d("Found " + this.f5407J.size() + " map triggers");
            Iterator it12 = this.f5407J.iterator();
            while (it12.hasNext()) {
                C0762a aVar7 = (C0762a) it12.next();
                int length = aVar7.f5323t.m4040a().length;
                for (int i = 0; i < length; i++) {
                    aVar7.m824g("Key was not used: " + a[i]);
                }
            }
            m795c();
            return;
        }
        throw new C0154f("win condition not set");
    }

    /* renamed from: c */
    public void m795c() {
        Iterator it = this.f5407J.iterator();
        while (it.hasNext()) {
            C0762a aVar = (C0762a) it.next();
            if (aVar.f5315g == EnumC0769e.f5359a) {
                boolean z = false;
                Iterator it2 = this.f5392g.iterator();
                while (it2.hasNext()) {
                    if (((C0788m) it2.next()).f5445a == aVar) {
                        z = true;
                    }
                }
                if (!z) {
                    C0788m mVar = new C0788m();
                    mVar.f5445a = aVar;
                    this.f5392g.add(mVar);
                    AbstractC0789l.m683d("Found objective: " + mVar.m775a());
                }
            }
        }
    }

    /* renamed from: c */
    public static void m793c(String str) {
        AbstractC0789l.m651u();
        AbstractC0789l.m694b("MissionEngine", str);
        Hcat_Multiplaye.m1261f(str);
    }

    /* renamed from: d */
    public C0762a m790d(String str) {
        String trim = str.trim();
        Iterator it = this.f5407J.iterator();
        while (it.hasNext()) {
            C0762a aVar = (C0762a) it.next();
            if (aVar.f5313b != null && aVar.f5313b.equalsIgnoreCase(trim)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public C0762a m788e(String str) {
        String trim = str.trim();
        Iterator it = this.f5407J.iterator();
        while (it.hasNext()) {
            C0762a aVar = (C0762a) it.next();
            if (aVar.f5314c.equalsIgnoreCase(trim)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public PointF m786f(String str) {
        C0157i iVar = AbstractC0789l.m651u().f5474bt.f740L;
        if (iVar == null) {
            return null;
        }
        Iterator it = iVar.f881c.iterator();
        while (it.hasNext()) {
            C0147a aVar = (C0147a) it.next();
            if ("point".equalsIgnoreCase(aVar.f712d) && aVar.f711c != null && aVar.f711c.equalsIgnoreCase(str)) {
                this.f5408K.m4474a(aVar.f713e, aVar.f714f);
                return this.f5408K;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m810a(float f) {
        AbstractC0789l.m651u();
    }

    /* renamed from: b */
    public void m798b(float f) {
        C0782g d;
        C0784i iVar;
        C0575g gVar;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (this.f5377i) {
            Iterator it = this.f5407J.iterator();
            while (it.hasNext()) {
                C0762a aVar = (C0762a) it.next();
                if (aVar.f5315g == EnumC0769e.f5365g && aVar.f5318j) {
                    float b = aVar.m835b() - u.f5508cd;
                    float c = aVar.m831c() - u.f5509ce;
                    float f2 = b * u.f5602cE;
                    float f3 = c * u.f5602cE;
                    float f4 = f2 + aVar.f5325w;
                    float f5 = f3 + aVar.f5326x;
                    if (aVar.f5330B) {
                        C0571c.f3800n[9].m2020a(2, f4, f5, aVar.f5329A);
                        f5 -= gVar.f3928c - 2;
                    }
                    if (aVar.f5328z != null && !aVar.f5328z.equals("")) {
                        u.f5477bw.mo158a(aVar.f5328z.m3314b(), f4, f5, aVar.f5329A);
                    }
                }
            }
        }
        if (this.f5379k && !this.f5390N) {
            boolean z = false;
            this.f5403B = C0654f.m1575a(this.f5403B, f);
            if (this.f5403B == 0.0f && this.f5402A != 0.0f) {
                this.f5402A = C0654f.m1575a(this.f5402A, f);
                z = true;
            }
            if (1 != 0) {
                if (z) {
                    int k = (int) (23.0f + (this.f5386E.m4482k() / 2.0f));
                    u.f5477bw.mo158a("- Wave " + this.f5393r + " -", u.f5517cm / 2.0f, k, this.f5386E);
                    if (this.f5394s != null) {
                        u.f5477bw.mo158a(this.f5394s, u.f5517cm / 2.0f, k + this.f5386E.m4482k() + 2.0f, this.f5387F);
                    }
                } else {
                    int k2 = (int) (23.0f + (this.f5388G.m4482k() / 2.0f));
                    String str = "Wave " + (this.f5393r + 1) + " in " + C0654f.m1483f(String.valueOf((int) (this.f5401z / 60.0d)), 3);
                    if (this.f5381m) {
                        str = "Defeat - Wave " + this.f5393r;
                    }
                    u.f5477bw.mo158a(str, u.f5517cm / 2.0f, k2, this.f5388G);
                    if (this.f5395t == null) {
                        if (!this.f5380l) {
                            iVar = m796b(false);
                        } else {
                            iVar = m792c(false);
                        }
                        this.f5395t = iVar.toString();
                    }
                    u.f5477bw.mo158a(this.f5395t, u.f5517cm / 2.0f, k2 + this.f5388G.m4482k() + 2.0f, this.f5389H);
                }
            }
        }
        if (this.f5379k && this.f5390N && (d = m791d()) != null) {
            int i = d.f5421e - (u.f5467bh / 1000);
            int k3 = (int) (23.0f + (this.f5388G.m4482k() / 2.0f));
            String str2 = "Wave " + (this.f5393r + 1) + " in " + C0654f.m1483f(String.valueOf(i), 3);
            if (this.f5381m) {
                str2 = "Defeat - Wave " + this.f5393r;
            }
            u.f5477bw.mo158a(str2, u.f5517cm / 2.0f, k3, this.f5388G);
            String str3 = d.f5422f;
            if (str3 != null) {
                u.f5477bw.mo158a(str3, u.f5517cm / 2.0f, k3 + this.f5388G.m4482k() + 2.0f, this.f5389H);
            }
        }
    }

    /* renamed from: g */
    public void m784g(String str) {
        String[] split;
        AbstractC0789l.m683d("Loading survival waves");
        this.f5390N = true;
        int i = 0;
        int i2 = 0;
        for (String str2 : str.split("\n")) {
            i2++;
            C0782g gVar = new C0782g(this);
            if (gVar.m779a(str2)) {
                gVar.f5421e = i + ((int) gVar.f5420d);
                i = gVar.f5421e;
                AbstractC0789l.m683d("Adding wave " + i2 + " at " + gVar.f5421e);
                this.f5411O.add(gVar);
            }
        }
    }

    /* renamed from: d */
    public C0782g m791d() {
        if (this.f5393r < this.f5411O.size()) {
            return (C0782g) this.f5411O.get(this.f5393r);
        }
        return null;
    }

    /* renamed from: e */
    public void m789e() {
        this.f5414R = true;
        this.f5412P.m4473a((PointF) this.f5405D.get(C0654f.m1565a(0, this.f5405D.size() - 1, this.f5393r)));
    }

    /* renamed from: f */
    public void m787f() {
        this.f5415S.clear();
        m801a(this.f5415S, "scout", 0.7f);
        m802a(this.f5415S, EnumC0215ak.f1592i, 2.1f);
        m801a(this.f5415S, "mechGun", 1.0f);
        m801a(this.f5415S, "lightGunship", 2.8f);
        m802a(this.f5415S, EnumC0215ak.f1593j, 1.9f);
        m802a(this.f5415S, EnumC0215ak.f1595l, 0.8f);
        m802a(this.f5415S, EnumC0215ak.f1606w, 1.0f);
        m802a(this.f5415S, EnumC0215ak.f1607x, 0.8f);
        m802a(this.f5415S, EnumC0215ak.f1597n, 0.7f);
        m801a(this.f5415S, "plasmaTank", 0.6f);
        m801a(this.f5415S, "missileAirship", 0.4f);
        this.f5416T.clear();
        m802a(this.f5416T, EnumC0215ak.f1615F, 1.0f);
        m802a(this.f5416T, EnumC0215ak.f1624O, 0.5f);
    }

    /* renamed from: a */
    public void m801a(ArrayList arrayList, String str, float f) {
        m802a(arrayList, EnumC0215ak.m3521a(str), f);
    }

    /* renamed from: a */
    public void m802a(ArrayList arrayList, AbstractC0268al alVar, float f) {
        if (alVar == null) {
            alVar = EnumC0215ak.f1592i;
        }
        AbstractC0268al c = C0368l.m2933c(alVar);
        if (c != null) {
            alVar = c;
        }
        C0786k kVar = new C0786k(this);
        kVar.f5434a = alVar;
        kVar.f5435b = f;
        arrayList.add(kVar);
    }

    /* renamed from: a */
    public void m805a(C0784i iVar, int i, float f) {
        if (i < 0) {
            i = 0;
        }
        int size = this.f5415S.size();
        if (size == 0) {
            AbstractC0789l.m695b("error maxTypeNum: " + size);
            return;
        }
        C0786k kVar = (C0786k) this.f5415S.get(i % size);
        int e = (int) C0654f.m1493e((int) ((i + 3) * 0.5d * kVar.f5435b * f), 0.8f);
        if (e < 1) {
            e = 1;
        }
        iVar.m776b(kVar.f5434a, e);
    }

    /* renamed from: b */
    public C0784i m796b(boolean z) {
        C0784i iVar = new C0784i(this);
        boolean z2 = false;
        if (this.f5396u > 50 && (this.f5396u + 1) % 100 == 0) {
            int size = this.f5416T.size();
            int i = this.f5396u / 100;
            if (size == 0) {
                AbstractC0789l.m695b("error maxTypeNum: " + size);
            } else {
                C0786k kVar = (C0786k) this.f5416T.get(i % size);
                int i2 = (int) (i * kVar.f5435b);
                if (i2 < 1) {
                    i2 = 1;
                }
                iVar.m776b(kVar.f5434a, i2);
            }
            z2 = true;
        }
        int i3 = 0;
        if (this.f5400y > 0) {
            i3 = this.f5400y;
        }
        m805a(iVar, this.f5396u + i3, 1.0f);
        if (this.f5396u > 15 && !z2) {
            m805a(iVar, ((int) ((this.f5396u + i3) * 1.1f)) - 11, 0.5f);
        }
        if (z) {
            this.f5396u++;
            this.f5397v++;
        }
        return iVar;
    }

    /* renamed from: c */
    public C0784i m792c(boolean z) {
        C0784i iVar = new C0784i(this);
        iVar.f5428a = false;
        int i = this.f5397v;
        EnumC0215ak akVar = null;
        if (this.f5384p) {
            akVar = EnumC0215ak.f1603t;
        } else {
            if (this.f5396u == 0) {
                i++;
                akVar = EnumC0215ak.f1592i;
            }
            if (this.f5396u == 1) {
                akVar = EnumC0215ak.f1593j;
            }
            if (this.f5396u == 2) {
                akVar = EnumC0215ak.f1595l;
            }
            if (this.f5396u == 3) {
                i = this.f5398w;
                akVar = EnumC0215ak.f1606w;
            }
            if (this.f5396u == 4) {
                i = this.f5398w;
                akVar = EnumC0215ak.f1607x;
                if (this.f5398w % 2 == 0) {
                    akVar = EnumC0215ak.f1597n;
                }
            }
            if (this.f5396u == 5) {
                iVar.f5428a = true;
                i = 1;
                akVar = EnumC0215ak.f1615F;
            }
            if (z) {
                this.f5396u++;
                boolean z2 = false;
                if (this.f5398w == 1) {
                    if (this.f5396u > 2) {
                        z2 = true;
                    }
                } else if (this.f5398w >= 5) {
                    if (this.f5396u > 5) {
                        z2 = true;
                    }
                    if (this.f5396u > 4 && this.f5398w % 2 == 0) {
                        z2 = true;
                    }
                } else if (this.f5396u > 4) {
                    z2 = true;
                }
                if (z2) {
                    this.f5396u = 0;
                    this.f5397v += 2;
                    this.f5398w++;
                }
            }
        }
        iVar.m777a(akVar, i);
        return iVar;
    }

    /* renamed from: c */
    public void m794c(float f) {
        C0784i iVar;
        AbstractC0789l u = AbstractC0789l.m651u();
        int i = u.f5467bh;
        this.f5410M = C0654f.m1575a(this.f5410M, f);
        if (u.f5449al && u.f5589bq) {
            C0147a aVar = null;
            if (u.f5474bt.f740L != null) {
                Iterator it = u.f5474bt.f740L.f881c.iterator();
                while (it.hasNext()) {
                    C0147a aVar2 = (C0147a) it.next();
                    if ("camera_pan".equalsIgnoreCase(aVar2.f712d) && this.f5409L == Integer.parseInt(aVar2.m4036a("index", "-1"))) {
                        aVar = aVar2;
                    }
                }
            }
            if (aVar == null) {
                this.f5409L = 0;
            } else {
                float f2 = aVar.f713e;
                float f3 = aVar.f714f;
                if (f2 < u.f5520cp + 2.0f) {
                    f2 = u.f5520cp + 2.0f;
                }
                if (f3 < u.f5521cq + 2.0f) {
                    f3 = u.f5521cq + 2.0f;
                }
                if (f2 > (u.f5474bt.m3975f() - u.f5520cp) - 2.0f) {
                    f2 = (u.f5474bt.m3975f() - u.f5520cp) - 2.0f;
                }
                if (f3 > (u.f5474bt.m3972g() - u.f5521cq) - 2.0f) {
                    f3 = (u.f5474bt.m3972g() - u.f5521cq) - 2.0f;
                }
                float d = C0654f.m1499d(u.f5510cf + u.f5520cp, u.f5511cg + u.f5521cq, f2, f3);
                float a = C0654f.m1573a(u.f5510cf + u.f5520cp, u.f5511cg + u.f5521cq, f2, f3);
                if (this.f5410M == 0.0f && (a < 225.0f || u.f5505ca)) {
                    this.f5409L++;
                    this.f5410M = 50.0f;
                }
                float f4 = 0.45f * f;
                u.f5510cf += C0654f.m1474i(d) * f4;
                u.f5511cg += C0654f.m1478h(d) * f4;
                u.m746a(u.f5510cf, u.f5511cg);
                u.m764J();
            }
        }
        if (this.f5379k) {
            if (!this.f5390N) {
                if (!this.f5381m) {
                    this.f5401z = C0654f.m1575a(this.f5401z, f);
                }
                if (this.f5401z == 0.0f && !this.f5381m) {
                    this.f5393r++;
                    this.f5402A = 180.0f;
                    PointF pointF = (PointF) this.f5405D.get(C0654f.m1565a(0, this.f5405D.size() - 1, this.f5393r));
                    if (!this.f5380l) {
                        this.f5394s = m796b(false).toString();
                        iVar = m796b(true);
                    } else {
                        this.f5394s = m792c(false).toString();
                        iVar = m792c(true);
                    }
                    this.f5401z = 1800.0f;
                    if (!this.f5380l) {
                        if (this.f5400y > 0) {
                            this.f5401z -= (this.f5400y * 3) * 60;
                        } else {
                            this.f5401z -= (this.f5400y * 9) * 60;
                        }
                    }
                    iVar.m778a(pointF.f224a, pointF.f225b);
                    this.f5395t = null;
                }
            } else if (!this.f5381m) {
                C0782g d2 = m791d();
                if (d2 != null) {
                    if (d2.f5421e * 1000 < u.f5467bh) {
                        d2.m780a();
                        this.f5393r++;
                    }
                } else if (!u.f5613cX && !u.f5490bJ.m1995h()) {
                    u.f5481bA.m1813E();
                }
            }
        }
        if (this.f5378j) {
            this.f5378j = false;
            if (this.f5376h != null) {
                u.m730a("Briefing", this.f5376h);
            }
        }
        if (i > this.f5372b + 250) {
            this.f5372b = i;
            m809a(i);
        }
        if (i > this.f5373c + 1000) {
            this.f5373c = i;
            if (m783h()) {
                m783h();
                m783h();
            }
            boolean z = false;
            boolean z2 = false;
            if (u.f5464bb != null) {
                if (u.f5464bb.m3753h()) {
                    z = true;
                }
                if (u.f5464bb.m3797b()) {
                    z2 = true;
                }
            }
            if (!u.f5613cX && !u.f5616da && !u.f5490bJ.m1995h() && !z && !z2) {
                boolean z3 = true;
                boolean z4 = true;
                if (this.f5375e == EnumC0787l.f5437a) {
                    z3 = false;
                } else if (this.f5375e == EnumC0787l.f5443g) {
                    Iterator it2 = this.f5392g.iterator();
                    while (it2.hasNext()) {
                        if (!((C0788m) it2.next()).m774b()) {
                            z3 = false;
                        }
                    }
                } else if (u.f5464bb != null) {
                    Iterator it3 = AbstractC0210af.f1473bj.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        AbstractC0210af afVar = (AbstractC0210af) it3.next();
                        if (u.f5464bb.m3778c(afVar.f1441bB) && m804a(this.f5375e, afVar)) {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (this.f5391f == EnumC0787l.f5437a) {
                    z4 = false;
                } else if (this.f5391f == EnumC0787l.f5443g) {
                    z4 = false;
                } else if (u.f5464bb != null) {
                    Iterator it4 = AbstractC0210af.f1473bj.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        AbstractC0210af afVar2 = (AbstractC0210af) it4.next();
                        if (u.f5464bb.m3768d(afVar2.f1441bB) && m804a(this.f5391f, afVar2)) {
                            z4 = false;
                            break;
                        }
                    }
                }
                if (z4 && !z3) {
                    u.f5481bA.m1812F();
                }
                if (z3) {
                    u.f5481bA.m1813E();
                    if (u.f5467bh > 1500) {
                        u.f5479by.numberOfWins++;
                        u.f5479by.save();
                    }
                }
            }
            if (this.f5379k && !this.f5381m) {
                boolean z5 = true;
                Iterator it5 = AbstractC0210af.f1473bj.iterator();
                while (it5.hasNext()) {
                    AbstractC0210af afVar3 = (AbstractC0210af) it5.next();
                    if ((afVar3 instanceof C0404d) || afVar3.f1517bu) {
                        if (!afVar3.f1520bz && !afVar3.mo1661o_() && afVar3.f1441bB == u.f5464bb) {
                            z5 = false;
                        }
                    }
                }
                if (z5) {
                    this.f5381m = true;
                    u.f5481bA.m1812F();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m804a(EnumC0787l lVar, AbstractC0210af afVar) {
        if (!(afVar instanceof AbstractC0515r) || afVar.f1520bz || afVar.mo3588cC() || lVar == EnumC0787l.f5437a) {
            return false;
        }
        if (lVar == EnumC0787l.f5438b) {
            return true;
        }
        if (lVar == EnumC0787l.f5439c) {
            return afVar.mo2797bw();
        }
        if (lVar == EnumC0787l.f5441e) {
            return (afVar instanceof C0404d) || afVar.f1517bu;
        }
        if (lVar == EnumC0787l.f5440d) {
            return afVar.mo2797bw() && afVar.mo2699bx() && !(afVar instanceof C0389b) && !(afVar instanceof C0407f);
        }
        if (lVar == EnumC0787l.f5442f) {
            if (!afVar.mo2699bx() && !afVar.mo3620ai()) {
                return false;
            }
            return true;
        } else if (lVar == EnumC0787l.f5443g) {
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: h */
    public void m782h(String str) {
        AbstractC0789l.m683d("Map Script: " + str);
    }

    /* renamed from: a */
    public void m806a(C0762a aVar) {
        if (m785g()) {
            m782h("Activiated trigger:" + aVar.f5312a + " (id:" + aVar.f5313b + ")");
        }
    }

    /* renamed from: g */
    public boolean m785g() {
        return f5371a && AbstractC0789l.m651u().f5578aV;
    }

    /* renamed from: i */
    public static void m781i(String str) {
        Hcat_Multiplaye.m1261f("Map ScriptError: " + str);
    }

    /* renamed from: a */
    public void m809a(int i) {
        Iterator it = this.f5407J.iterator();
        while (it.hasNext()) {
            C0762a aVar = (C0762a) it.next();
            if (aVar.f5318j && aVar.f5336q != -1 && i >= aVar.f5319k + aVar.f5336q) {
                aVar.f5318j = false;
                aVar.f5339u = false;
            }
            if (!aVar.f5318j && !aVar.f5339u && aVar.m828d()) {
                aVar.f5339u = true;
            }
            if ((aVar.f5318j || aVar.f5339u) && aVar.f5332e.m816b()) {
                aVar.f5318j = false;
                aVar.f5339u = false;
                aVar.f5321m = true;
            }
            if (aVar.f5318j && aVar.f5322p > 0 && i >= aVar.f5319k + aVar.f5322p) {
                aVar.f5339u = true;
            }
            if (aVar.f5339u) {
                aVar.f5339u = false;
                try {
                    C0768d.m814a(this, aVar);
                } catch (C0154f e) {
                    e.printStackTrace();
                    aVar.m824g("Error activating trigger: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: h */
    public boolean m783h() {
        boolean z;
        boolean z2 = false;
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f1441bB == AbstractC0171m.f1281g && (afVar instanceof AbstractC0515r) && afVar.m3613bG() && !afVar.mo2676o()) {
                int i2 = 0;
                int size2 = AbstractC0210af.f1473bj.size();
                while (true) {
                    if (i2 < size2) {
                        AbstractC0210af afVar2 = a[i2];
                        if (!u.m707ao()) {
                            z = afVar2.f1441bB == u.f5464bb;
                        } else {
                            z = !afVar2.f1441bB.f1239r;
                        }
                        if (z && afVar2.f1441bB != afVar.f1441bB && (afVar2 instanceof AbstractC0515r) && !afVar2.mo2423i() && afVar2.m3613bG() && C0654f.m1573a(afVar2.f5841dH, afVar2.f5842dI, afVar.f5841dH, afVar.f5842dI) < 28900.0f) {
                            afVar.mo3595c(afVar2.f1441bB);
                            afVar.f1537cl = 60.0f;
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return z2;
    }
}

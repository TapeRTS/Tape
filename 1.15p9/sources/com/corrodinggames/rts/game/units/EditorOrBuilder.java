package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.buildings.InterfaceC0501l;
import com.corrodinggames.rts.game.units.buildings.NukeLaucher;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.land.AbstractC0529j;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0207b;
import com.corrodinggames.rts.game.units.p013a.C0213h;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0765c;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0767e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0841ae;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h.class */
public class EditorOrBuilder extends AbstractC0529j implements InterfaceC0469d {

    /* renamed from: a */
    PointF[] f3757a;

    /* renamed from: b */
    PointF[] f3758b;

    /* renamed from: c */
    boolean f3759c;

    /* renamed from: d */
    static Paint f3760d;

    /* renamed from: e */
    static Paint f3761e;

    /* renamed from: f */
    static Paint f3762f;

    /* renamed from: g */
    static BitmapOrTexture f3763g;

    /* renamed from: r */
    String f3774r;

    /* renamed from: C */
    static ArrayList f3785C;

    /* renamed from: D */
    C0824b f3786D;

    /* renamed from: E */
    AbstractC0603o f3787E;

    /* renamed from: F */
    AbstractC0596n f3788F;

    /* renamed from: G */
    String f3789G;

    /* renamed from: H */
    boolean f3790H;

    /* renamed from: I */
    String f3791I;

    /* renamed from: h */
    static Action f3764h = new C05561("reloadUnits");

    /* renamed from: i */
    static Action f3765i = new C055912("reloadOnlyActiveUnits");

    /* renamed from: j */
    static Action f3766j = new C056316("unitClone");

    /* renamed from: k */
    static Action f3767k = new C056417("removeUnits");

    /* renamed from: l */
    static Action f3768l = new C056518("killUnits");

    /* renamed from: m */
    static Action f3769m = new C056619("finishQueue");

    /* renamed from: n */
    static Action f3770n = new C056920("nukeAt");

    /* renamed from: o */
    static Action f3771o = new C057021("freezeAI");

    /* renamed from: p */
    static Action f3772p = new C057122("changeAlliance");

    /* renamed from: q */
    static Action f3773q = new C05672("startRecording");

    /* renamed from: s */
    static Action f3775s = new C05723("startReplayPlayback");

    /* renamed from: t */
    static Action f3776t = new C05764("hideInterface");

    /* renamed from: u */
    static Action f3777u = new C05775("freezeAllAI");

    /* renamed from: v */
    static Action f3778v = new C05786("pauseGame");

    /* renamed from: w */
    static Action f3779w = new C05797("slowGame");

    /* renamed from: x */
    static Action f3780x = new C05808("fastForward");

    /* renamed from: y */
    static Action f3781y = new C05819("search");

    /* renamed from: z */
    static Action f3782z = new C055710("enableDebug");

    /* renamed from: A */
    static Action f3783A = new C055811("enableAIDebug");

    /* renamed from: B */
    static Action f3784B = new C056013("enableTriggerDebug");

    /* renamed from: J */
    static C0207b f3792J = new C056215();

    /* renamed from: f */
    public UnitType m3677r() {
        return UnitType.f1784Y;
    }

    /* renamed from: w */
    public static boolean m3674w() {
        if (GameEngine.getInstance().f6120cb.m2636g()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public PointF[] mo3515b() {
        return this.f3757a;
    }

    /* renamed from: c */
    public PointF[] mo3511c() {
        return this.f3758b;
    }

    /* renamed from: v */
    public BitmapOrTexture m3675v() {
        if (this.team.f1305k == -1) {
            return null;
        }
        return f3645dL[this.team.getId()];
    }

    /* renamed from: K */
    public static void load() {
        f3763g = GameEngine.getInstance().graphics.loadImage(R.drawable.icon_search);
    }

    /* renamed from: a */
    public boolean m3698a(Unit unit) {
        return true;
    }

    /* renamed from: d */
    public BitmapOrTexture m3688d() {
        if (this.isDead) {
            return Builder.f3582b;
        }
        return Builder.f3584d[this.team.getId()];
    }

    /* renamed from: k */
    public BitmapOrTexture m3680k() {
        return null;
    }

    /* renamed from: d */
    public BitmapOrTexture m3687d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean m3685e() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.m2542b(this.f6951ek, this.f6952el, this.height);
        this.image = Builder.f3582b;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.m3004a(AudioEngine.f4044o, 0.8f, this.f6951ek, this.f6952el);
        m3088bq();
        return true;
    }

    public EditorOrBuilder(boolean z) {
        super(z);
        this.f3757a = new PointF[6];
        this.f3758b = new PointF[this.f3757a.length];
        f3760d = new Paint();
        f3760d.m7267a(40, 0, 255, 0);
        f3760d.m7248a(true);
        f3760d.m7270a(2.0f);
        f3760d.m7262a(Paint.Cap.ROUND);
        f3761e = new Paint();
        f3761e.m7259a(f3760d);
        f3761e.m7267a(55, 255, 60, 60);
        f3762f = new Paint();
        f3762f.m7267a(60, 255, 255, 255);
        this.f3786D = null;
        this.f3787E = AbstractC0603o.f3860a;
        this.f3788F = AbstractC0596n.f3853a;
        this.f3790H = true;
        m2884T(20);
        m2883U(20);
        this.radius = 10.0f;
        this.f6951ek = -1000.0f;
        this.f6952el = -1000.0f;
        this.displayRadius = this.radius;
        this.f1632ct = 170000.0f;
        this.f1631cs = this.f1632ct;
        this.image = Builder.f3582b;
        for (int i = 0; i < this.f3757a.length; i++) {
            this.f3757a[i] = new PointF();
            this.f3758b[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m3703a(float f, InterfaceC0469d interfaceC0469d) {
        AbstractC0623y abstractC0623y = (AbstractC0623y) interfaceC0469d;
        PointF[] mo3515b = interfaceC0469d.mo3515b();
        PointF[] mo3511c = interfaceC0469d.mo3511c();
        Unit m3228X = abstractC0623y.m3228X();
        abstractC0623y.f3961aM = m3228X != null;
        if (m3228X != null) {
            for (int i = 0; i < mo3515b.length; i++) {
                PointF pointF = mo3515b[i];
                PointF pointF2 = mo3511c[i];
                pointF.x = CommonUtils.m2367a(pointF.x, pointF2.x, 0.1f * f);
                pointF.y = CommonUtils.m2367a(pointF.y, pointF2.y, 0.1f * f);
                pointF.x += (pointF2.x - pointF.x) * 0.04f * f;
                pointF.y += (pointF2.y - pointF.y) * 0.04f * f;
                float f2 = m3228X.radius * 0.75f;
                if (CommonUtils.m2294c(pointF.x - pointF2.x) < 1.0f) {
                    pointF2.x = CommonUtils.m2282d(-f2, f2);
                }
                if (CommonUtils.m2294c(pointF.y - pointF2.y) < 1.0f) {
                    pointF2.y = CommonUtils.m2282d(-f2, f2);
                }
            }
        } else if (mo3515b[0].x != 0.0f || mo3515b[0].y != 0.0f) {
            for (int i2 = 0; i2 < mo3515b.length; i2++) {
                PointF pointF3 = mo3515b[i2];
                PointF pointF4 = mo3511c[i2];
                pointF3.x = 0.0f;
                pointF3.y = 0.0f;
                pointF4.x = 0.0f;
                pointF4.y = 0.0f;
            }
        }
    }

    /* renamed from: a */
    public void m3704a(float f) {
        if (f < 0.3f) {
            f = 0.3f;
        }
        if (this.f3938aw && this.team.m6374b()) {
            int i = 0;
            while (true) {
                if (i < Team.f1364c) {
                    Team m6317k = Team.m6317k(i);
                    if (m6317k == null || m6317k.m6374b()) {
                        i++;
                    } else {
                        m5773e(m6317k);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        super.update(f);
        if (!this.isDead) {
            m3703a(f, this);
        }
        this.f1631cs = this.f1632ct;
    }

    /* renamed from: a */
    public void m3702a(float f, boolean z) {
        if (!this.isDead) {
        }
    }

    /* renamed from: e */
    public float m3684e(int i) {
        return 0.0f;
    }

    /* renamed from: f */
    public float m3682f(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public boolean m3691c(float f) {
        if (!super.draw(f)) {
            return false;
        }
        GameEngine.getInstance();
        return true;
    }

    /* renamed from: a */
    public void m3696a(Unit unit, int i) {
    }

    /* renamed from: x */
    public boolean m3673x() {
        return false;
    }

    /* renamed from: y */
    public int m3672y() {
        return 850000;
    }

    /* renamed from: b */
    public float m3692b(Unit unit) {
        return 1.0E7f;
    }

    /* renamed from: c */
    public float m3689c(Unit unit) {
        return 1.0E7f;
    }

    /* renamed from: m */
    public float m3678m() {
        return 30.0f;
    }

    /* renamed from: b */
    public float m3693b(int i) {
        return 100.0f;
    }

    /* renamed from: z */
    public float m3671z() {
        return 0.0f;
    }

    /* renamed from: A */
    public float m3719A() {
        return 9.8f;
    }

    /* renamed from: B */
    public float m3718B() {
        return 9.35f;
    }

    /* renamed from: c */
    public float m3690c(int i) {
        return 99.0f;
    }

    /* renamed from: l */
    public boolean m3679l() {
        return false;
    }

    /* renamed from: C */
    public float m3717C() {
        return 0.04f;
    }

    /* renamed from: D */
    public float m3716D() {
        return 0.1f;
    }

    /* renamed from: a */
    public void m3700a(Action action, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (action instanceof C0593k) {
            C0593k c0593k = (C0593k) action;
            boolean z2 = true;
            if (z) {
                z2 = 1 == 0;
            }
            if (c0593k.f3847a) {
                z2 = !z2;
            }
            if (z2) {
                C0136a c0136a = null;
                int i = this.team.f1305k + 1;
                while (true) {
                    if (i < Team.f1364c) {
                        Team m6317k = Team.m6317k(i);
                        if (m6317k == null || m6317k.m6374b()) {
                            i++;
                        } else {
                            c0136a = m6317k;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (c0136a == null && this.team.f1305k < 4) {
                    c0136a = Team.m6317k(this.team.f1305k + 1);
                    if (c0136a == null) {
                        GameEngine.PrintLog("Sandbox adding new team:" + this.team.f1305k);
                        C0136a c0136a2 = new C0136a(this.team.f1305k + 1);
                        c0136a = c0136a2;
                        c0136a.f1311q = 1;
                        c0136a.f1328E = true;
                        c0136a.f1329F = true;
                        if (!this.f3759c) {
                            c0136a2.f618bF = 0.0f;
                        } else {
                            c0136a2.f618bF = Float.MAX_VALUE;
                        }
                    }
                }
                if (c0136a == null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < Team.f1364c) {
                            Team m6317k2 = Team.m6317k(i2);
                            if (m6317k2 == null || m6317k2.m6374b()) {
                                i2++;
                            } else {
                                c0136a = m6317k2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (c0136a != null) {
                    m5773e(c0136a);
                    if (!gameEngine.f6120cb.m2635h()) {
                        gameEngine.f6093bs = c0136a;
                    }
                }
            } else {
                Team team = null;
                int i3 = this.team.f1305k - 1;
                while (true) {
                    if (i3 >= 0) {
                        Team m6317k3 = Team.m6317k(i3);
                        if (m6317k3 == null || m6317k3.m6374b()) {
                            i3--;
                        } else {
                            team = m6317k3;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (team == null) {
                    int i4 = Team.f1364c - 1;
                    while (true) {
                        if (i4 >= 0) {
                            Team m6317k4 = Team.m6317k(i4);
                            if (m6317k4 == null || m6317k4.m6374b()) {
                                i4--;
                            } else {
                                team = m6317k4;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (team != null) {
                    m5773e(team);
                    if (!gameEngine.f6120cb.m2635h()) {
                        gameEngine.f6093bs = team;
                    }
                }
            }
        }
        if (action instanceof C0592j) {
            C0592j c0592j = (C0592j) action;
            boolean z3 = true;
            if (z) {
                z3 = 1 == 0;
            }
            if (c0592j.f3845a) {
                z3 = !z3;
            }
            ArrayList m1851j = gameEngine.f6118bZ.m1851j();
            if (m1851j.size() == 0) {
                this.f3786D = null;
            } else if (z3) {
                if (this.f3786D == null) {
                    this.f3786D = (C0824b) m1851j.get(0);
                } else {
                    C0824b c0824b = null;
                    boolean z4 = false;
                    Iterator it = m1851j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C0824b c0824b2 = (C0824b) it.next();
                        if (z4) {
                            c0824b = c0824b2;
                            break;
                        } else if (c0824b2 == this.f3786D) {
                            z4 = true;
                        }
                    }
                    this.f3786D = c0824b;
                }
            } else if (this.f3786D == null) {
                this.f3786D = (C0824b) m1851j.get(m1851j.size() - 1);
            } else {
                C0824b c0824b3 = null;
                boolean z5 = false;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m1851j);
                Collections.reverse(arrayList);
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0824b c0824b4 = (C0824b) it2.next();
                    if (z5) {
                        c0824b3 = c0824b4;
                        break;
                    } else if (c0824b4 == this.f3786D) {
                        z5 = true;
                    }
                }
                this.f3786D = c0824b3;
            }
        }
        if (action instanceof C0594l) {
            C0594l c0594l = (C0594l) action;
            boolean z6 = true;
            if (z) {
                z6 = 1 == 0;
            }
            if (c0594l.f3849a) {
                z6 = !z6;
            }
            this.f3787E = this.f3787E.m3341a(!z6);
        }
        if (action instanceof C0591i) {
            this.team.m6344d(10000.0f);
        }
        if (action instanceof C0595m) {
            ((C0595m) action).m3358n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static EditorOrBuilder m3709L() {
        return GameEngine.getInstance().f6111bS.m1983i();
    }

    /* renamed from: a */
    public void m3699a(Action action, boolean z, PointF pointF, Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (action instanceof C0213h) {
            action = ((C0213h) action).m6199n_();
        }
        if (action == f3764h) {
            if (m3674w()) {
                GameEngine.m1145b("Not reloading units: Need to keep network sync");
                gameEngine.f6111bS.m2008b("Not reloading units: Need to keep network sync");
                return;
            } else if (z) {
                return;
            } else {
                if (gameEngine.f6118bZ.m1853h() == 0) {
                    gameEngine.f6111bS.m2008b("No custom units to reload");
                    return;
                }
                GameEngine.PrintLog("Reload units requested");
                gameEngine.f6118bZ.m1867a(true, false);
                Iterator it = Team.m6358c().iterator();
                while (it.hasNext()) {
                    Team team = (Team) it.next();
                    if (team instanceof C0136a) {
                        ((C0136a) team).m6858ah();
                    }
                }
                gameEngine.f6111bS.m2008b("All custom unit files reloaded");
            }
        }
        if (action == f3765i) {
            if (m3674w()) {
                GameEngine.m1145b("Not reloading units: Need to keep network sync");
                return;
            } else if (z) {
                return;
            } else {
                if (gameEngine.f6118bZ.m1853h() == 0) {
                    gameEngine.f6111bS.m2008b("No custom units to reload");
                    return;
                }
                GameEngine.PrintLog("Reload active only requested");
                gameEngine.f6118bZ.m1867a(true, true);
                Iterator it2 = Team.m6358c().iterator();
                while (it2.hasNext()) {
                    Team team2 = (Team) it2.next();
                    if (team2 instanceof C0136a) {
                        ((C0136a) team2).m6858ah();
                    }
                }
                int i = C0348af.f2192d;
                int i2 = 100;
                String str = "Quick reloaded changed data for " + i + " units active on map.";
                if (gameEngine.f6109bQ.liveReloading && i == 0) {
                    str = str + " (Note: Live reloading is currently enabled, so changed units may have already be reloaded)";
                    i2 = 170;
                }
                gameEngine.f6111bS.m2023a(str, i2);
            }
        }
        if (action == f3767k || action == f3768l || action == f3766j) {
            int i3 = 0;
            if (z) {
                return;
            }
            Iterator it3 = Unit.m5870bF().iterator();
            while (it3.hasNext()) {
                Unit unit2 = (Unit) it3.next();
                if ((unit2 instanceof Unit) && CommonUtils.m2366a(unit2.f6951ek, unit2.f6952el, pointF.x, pointF.y) < 2500.0f) {
                    if (action == f3767k) {
                        if (unit2.f1650cL == null && unit2.f1651cM == null) {
                            unit2.m5812ch();
                            if ((unit2 instanceof AbstractC0623y) && unit2.m5867bI()) {
                                gameEngine.f6113bU.m1312a((AbstractC0623y) unit2);
                            }
                        }
                    } else if (action == f3768l) {
                        if (unit2.f1650cL == null && unit2.f1651cM == null) {
                            unit2.f1631cs = -1.0f;
                        }
                    } else if (action != f3766j) {
                        continue;
                    } else if (i3 <= 4) {
                        if (!unit2.m5867bI() && !(unit2 instanceof Tree) && !unit2.isDead && unit2.f1650cL == null && unit2.f1651cM == null) {
                            i3++;
                            InterfaceC0303as unitType = unit2.getUnitType();
                            for (int i4 = -25; i4 < 25; i4++) {
                                Unit mo5717a = unitType.mo5717a();
                                mo5717a.f6951ek = unit2.f6951ek + (i4 * 0.5f) + 1.0f;
                                mo5717a.f6952el = unit2.f6952el + (i4 * 0.5f) + 1.0f;
                                mo5717a.mo3120b(unit2.team);
                                Team.m6353c(mo5717a);
                                mo5717a.direction = CommonUtils.m2345a((AbstractC1120w) unit2, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 25 + i4);
                                if (mo5717a instanceof AbstractC0623y) {
                                    ((AbstractC0623y) mo5717a).f3939ax = true;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        if (action == f3770n) {
            if (z) {
                return;
            }
            Projectile m4310a = NukeLaucher.m4310a(this, pointF.x, pointF.y, pointF.x, pointF.y);
            if (m4310a != null) {
                m4310a.height = 100.0f;
                m4310a.f983j = null;
            }
        }
        if (action == f3769m) {
            if (z) {
                return;
            }
            Iterator it4 = Unit.m5870bF().iterator();
            while (it4.hasNext()) {
                AbstractC1120w abstractC1120w = (AbstractC1120w) it4.next();
                if ((abstractC1120w instanceof AbstractC0623y) && (abstractC1120w instanceof InterfaceC0501l) && CommonUtils.m2366a(abstractC1120w.f6951ek, abstractC1120w.f6952el, pointF.x, pointF.y) < 2500.0f) {
                    ((InterfaceC0501l) abstractC1120w).mo4369dw();
                }
            }
            return;
        }
        if (action == f3771o) {
            Team team3 = this.team;
            if (team3 instanceof C0136a) {
                C0136a c0136a = (C0136a) team3;
                if (c0136a.f618bF > 0.0f) {
                    c0136a.f618bF = 0.0f;
                } else {
                    c0136a.f618bF = 10800.0f;
                }
            }
        }
        if (action == f3772p) {
            Team team4 = this.team;
            team4.f1311q++;
            if (team4.f1311q > 4) {
                team4.f1311q = 0;
            }
        }
        if (action == f3777u) {
            boolean z2 = false;
            boolean z3 = false;
            Iterator it5 = Team.m6358c().iterator();
            while (it5.hasNext()) {
                Team team5 = (Team) it5.next();
                if (team5 instanceof C0136a) {
                    if (((C0136a) team5).f618bF > 0.0f) {
                        z2 = true;
                    }
                    z3 = true;
                }
            }
            boolean z4 = !z2;
            if (!z3) {
                z4 = !this.f3759c;
            }
            this.f3759c = z4;
            m3708M();
        }
        if (action == f3778v) {
        }
        if (action == f3779w) {
        }
        if (action == f3780x) {
        }
        if (action == f3782z) {
            gameEngine.f6225bl = !gameEngine.f6225bl;
        }
        if (action == f3783A) {
            C0136a.f552ar = !C0136a.f552ar;
        }
        if (action == f3784B) {
            gameEngine.f6227bn = !gameEngine.f6227bn;
        }
        if (action instanceof C0611q) {
            C0609p.m3330a(((C0611q) action).f3870a, pointF);
        }
        super.m5892a(action, z, pointF, unit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$1.class */
    public final class C05561 extends Action {
        C05561(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            if (EditorOrBuilder.m3674w()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Reload all unit data from disk (for modding)";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Reload units";
        }

        /* renamed from: c */
        public int mo6185c() {
            return 0;
        }

        /* renamed from: b */
        public int mo6186b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: d_ */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo6184e() {
            return EnumC0226u.f1474a;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1469f;
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: h */
        public boolean m3661h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$12 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$12.class */
    final class C055912 extends Action {
        C055912(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            if (EditorOrBuilder.m3674w()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Reload data only for active units on map (for modding). This is a faster than reload but will be incomplete.";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Quick reload";
        }

        /* renamed from: c */
        public int mo6185c() {
            return 0;
        }

        /* renamed from: b */
        public int mo6186b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: k */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo6184e() {
            return EnumC0226u.f1474a;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1469f;
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: h */
        public boolean m3647h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$16 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$16.class */
    final class C056316 extends Action {
        C056316(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Clones units at point x50";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Unit Clone";
        }

        /* renamed from: c */
        public int mo6185c() {
            return 0;
        }

        /* renamed from: b */
        public int mo6186b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: k */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo6184e() {
            return EnumC0226u.f1480g;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1469f;
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return true;
        }

        /* renamed from: h */
        public boolean m3632h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$17 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$17.class */
    final class C056417 extends Action {
        C056417(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Delete all units at a point";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Delete units at";
        }

        /* renamed from: e_ */
        public boolean mo6183e_() {
            return false;
        }

        /* renamed from: c */
        public int mo6185c() {
            return 0;
        }

        /* renamed from: b */
        public int mo6186b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: f_ */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo6184e() {
            return EnumC0226u.f1480g;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1469f;
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return true;
        }

        /* renamed from: h */
        public boolean m3619h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$18 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$18.class */
    final class C056518 extends Action {
        C056518(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Kill units at a point";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Kill units at";
        }

        /* renamed from: e_ */
        public boolean mo6183e_() {
            return false;
        }

        /* renamed from: c */
        public int mo6185c() {
            return 0;
        }

        /* renamed from: b */
        public int mo6186b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: g_ */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo6184e() {
            return EnumC0226u.f1480g;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1469f;
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return true;
        }

        /* renamed from: h */
        public boolean m3607h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$19 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$19.class */
    final class C056619 extends Action {
        C056619(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Finish all unit queues at";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Finish queue at";
        }

        /* renamed from: e_ */
        public boolean mo6183e_() {
            return false;
        }

        /* renamed from: c */
        public int mo6185c() {
            return 0;
        }

        /* renamed from: b */
        public int mo6186b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: h_ */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo6184e() {
            return EnumC0226u.f1480g;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1469f;
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return true;
        }

        /* renamed from: h */
        public boolean m3596h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$20 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$20.class */
    final class C056920 extends Action {
        C056920(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Create a nuke at a point";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Nuke at";
        }

        /* renamed from: e_ */
        public boolean mo6183e_() {
            return false;
        }

        /* renamed from: c */
        public int mo6185c() {
            return 0;
        }

        /* renamed from: b */
        public int mo6186b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: i_ */
        public UnitType mo7517i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo6184e() {
            return EnumC0226u.f1480g;
        }

        /* renamed from: f */
        public EnumC0225t mo6182f() {
            return EnumC0225t.f1469f;
        }

        /* renamed from: g */
        public boolean mo6181g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return true;
        }

        /* renamed from: h */
        public boolean m3578h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$21 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$21.class */
    final class C057021 extends AbstractC0229x {
        C057021(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Freeze high level AI logic (120secs)";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Freeze AI";
        }

        /* renamed from: d */
        public String m3572d() {
            String str = "Freeze AI";
            GameEngine.getInstance();
            EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
            if (m3709L != null) {
                int i = -1;
                if (m3709L.team instanceof C0136a) {
                    i = ((int) ((C0136a) m3709L.team).f618bF) / 60;
                }
                if (i > 0) {
                    str = str + "(" + i + ")";
                }
            }
            return str;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return unit.team instanceof C0136a;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$22 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$22.class */
    final class C057122 extends AbstractC0229x {
        C057122(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Change selected player's alliance (players with the same letter are allied)";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Ally:";
        }

        /* renamed from: d */
        public String m3568d() {
            EditorOrBuilder m3709L;
            String str = "Ally";
            if (EditorOrBuilder.m3709L() != null) {
                str = "Ally: " + m3709L.team.m6325h();
            }
            return str;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$2.class */
    public final class C05672 extends AbstractC0229x {
        C05672(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Start recording a replay to file";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Start Recording";
        }

        /* renamed from: d */
        public String m3588d() {
            String str;
            if (!GameEngine.getInstance().f6120cb.m2634i()) {
                str = "Start Recording";
            } else {
                str = "Stop Recording";
            }
            return str;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            if (GameEngine.getInstance().f6120cb.m2635h()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public boolean m3592a(Unit unit) {
            return GameEngine.getInstance().f6120cb.m2634i();
        }

        /* renamed from: c */
        public boolean m3589c(Unit unit, boolean z) {
            GameEngine gameEngine = GameEngine.getInstance();
            GameEngine.PrintLog("Start recording clicked");
            if (gameEngine.f6120cb.m2635h()) {
                GameEngine.PrintLog("Already in a replay");
                return false;
            }
            gameEngine.m1194a(new RunnableC05681());
            return false;
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$2$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$2$1.class */
        class RunnableC05681 implements Runnable {
            RunnableC05681() {
            }

            public void run() {
                GameEngine gameEngine = GameEngine.getInstance();
                if (!gameEngine.f6120cb.m2634i()) {
                    EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
                    gameEngine.f6111bS.f5191b = true;
                    if (!gameEngine.networkEngine.f5564B) {
                        long j = gameEngine.networkEngine.f5561w;
                        gameEngine.networkEngine.f5476o = true;
                        gameEngine.networkEngine.m1785R();
                        gameEngine.networkEngine.f5561w = j;
                        gameEngine.networkEngine.f5533bm = true;
                        gameEngine.f6233bx = 0;
                        gameEngine.networkEngine.f5574X = gameEngine.f6233bx + 1;
                        gameEngine.networkEngine.m1615w();
                    }
                    String str = "[sandbox]" + gameEngine.m1167ak() + " [v" + gameEngine.m1098u() + "] (" + CommonUtils.m2336a("d MMM yyyy HH.mm.ss") + ").replay";
                    gameEngine.f6120cb.m2640d(str);
                    gameEngine.f6111bS.f5191b = false;
                    GameEngine.m1122f(null, "Replay started as: " + str);
                    EditorOrBuilder m3709L2 = EditorOrBuilder.m3709L();
                    if (m3709L2 != null && m3709L != null) {
                        m3709L2.m3695a(m3709L);
                        m3709L2.f3774r = str;
                        return;
                    }
                    GameEngine.m1145b("Failed copySettingsFromAnotherEditor");
                    return;
                }
                gameEngine.f6120cb.m2641d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$3.class */
    public final class C05723 extends AbstractC0229x {
        C05723(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Start playback of last a replay";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Start Playback";
        }

        /* renamed from: d */
        public String m3561d() {
            String str;
            if (!GameEngine.getInstance().f6120cb.m2635h()) {
                str = "Start Playback";
            } else {
                str = "Stop Playback";
            }
            return str;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            boolean m2634i = GameEngine.getInstance().f6120cb.m2634i();
            EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
            return (m3709L == null || m3709L.f3774r == null || m2634i) ? false : true;
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
            return (m3709L == null || m3709L.f3774r == null) ? false : true;
        }

        /* renamed from: a */
        public boolean m3566a(Unit unit) {
            return GameEngine.getInstance().f6120cb.m2635h();
        }

        /* renamed from: c */
        public boolean m3562c(Unit unit, boolean z) {
            GameEngine gameEngine = GameEngine.getInstance();
            String str = EditorOrBuilder.m3709L().f3774r;
            if (str == null) {
                gameEngine.m1116i("No last replay found");
                return false;
            } else if (!gameEngine.f6120cb.m2635h()) {
                RunnableC05731 runnableC05731 = new RunnableC05731(str);
                C0767e m2171a = C0767e.m2171a("Start playback of last recording?", true);
                m2171a.m2172a(C0820a.m1886a("menus.common.ok", new Object[0]), new C05742(m2171a, gameEngine, runnableC05731));
                gameEngine.f6111bS.m2030a(m2171a);
                return false;
            } else {
                gameEngine.m1194a(new RunnableC05753());
                return false;
            }
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$3$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$3$1.class */
        class RunnableC05731 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f3794a;

            RunnableC05731(String str) {
                this.f3794a = str;
            }

            public void run() {
                GameEngine gameEngine = GameEngine.getInstance();
                if (!gameEngine.f6120cb.m2635h()) {
                    boolean z = gameEngine.f6104bL.f840E;
                    EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
                    boolean z2 = gameEngine.f6261dp;
                    boolean z3 = gameEngine.f6262dq;
                    gameEngine.f6120cb.f4472f = true;
                    gameEngine.f6120cb.m2642c(this.f3794a);
                    gameEngine.f6120cb.f4472f = false;
                    gameEngine.f6261dp = z2;
                    gameEngine.f6262dq = z3;
                    EditorOrBuilder m3709L2 = EditorOrBuilder.m3709L();
                    if (m3709L2 != null && m3709L != null) {
                        m3709L2.m3695a(m3709L);
                    } else {
                        GameEngine.m1145b("Failed copySettingsFromAnotherEditor");
                    }
                    gameEngine.f6094bv = true;
                    if (gameEngine.f6104bL != null) {
                        gameEngine.f6104bL.f840E = z;
                    }
                    gameEngine.f6155cT = true;
                    if (m3709L2 != null) {
                        m3709L2.m3708M();
                        return;
                    }
                    return;
                }
                GameEngine.PrintLog("stopPlaybackRunnable: Already started");
            }
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$3$2 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$3$2.class */
        class C05742 extends AbstractC0772i {

            /* renamed from: a */
            final /* synthetic */ C0767e f3796a;

            /* renamed from: b */
            final /* synthetic */ GameEngine f3797b;

            /* renamed from: c */
            final /* synthetic */ Runnable f3798c;

            C05742(C0767e c0767e, GameEngine gameEngine, Runnable runnable) {
                this.f3796a = c0767e;
                this.f3797b = gameEngine;
                this.f3798c = runnable;
            }

            /* renamed from: a */
            public boolean mo2158a(C0765c c0765c) {
                this.f3796a.m2133i();
                this.f3797b.m1194a(this.f3798c);
                return true;
            }
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$3$3 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$3$3.class */
        class RunnableC05753 implements Runnable {
            RunnableC05753() {
            }

            public void run() {
                GameEngine gameEngine = GameEngine.getInstance();
                if (!gameEngine.f6120cb.m2635h()) {
                    GameEngine.PrintLog("stopPlaybackRunnable: Already stopped");
                    return;
                }
                gameEngine.f6120cb.m2641d();
                gameEngine.f6231bt = 1.0f;
                gameEngine.f6094bv = true;
                EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
                if (m3709L != null) {
                    gameEngine.f6093bs = m3709L.team;
                }
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$4.class */
    final class C05764 extends AbstractC0229x {
        C05764(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            String str = "Hide interface till the screen is clicked/pressed";
            if (GameEngine.m1157au()) {
                str = str + "\n-Enable mouse capture to also hide the mouse";
            }
            return str;
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Hide interface";
        }

        /* renamed from: c */
        public boolean m3558c(Unit unit, boolean z) {
            GameEngine.getInstance().f6155cT = true;
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$5.class */
    final class C05775 extends AbstractC0229x {
        C05775(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Freeze full high level logic for all AI forever";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Freeze AI";
        }

        /* renamed from: d */
        public String m3554d() {
            String str = "Freeze AI";
            EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
            if (m3709L != null && m3709L.f3759c) {
                str = "Unfreeze AIs";
            }
            return str;
        }

        /* renamed from: a */
        public boolean mo4247a(Unit unit, boolean z) {
            return true;
        }
    }

    /* renamed from: M */
    public void m3708M() {
        Iterator it = Team.m6358c().iterator();
        while (it.hasNext()) {
            Team team = (Team) it.next();
            if (team instanceof C0136a) {
                C0136a c0136a = (C0136a) team;
                if (!this.f3759c) {
                    c0136a.f618bF = 0.0f;
                } else {
                    c0136a.f618bF = Float.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$6.class */
    final class C05786 extends AbstractC0229x {
        C05786(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Pause Game";
        }

        /* renamed from: b */
        public String mo6187b() {
            if (GameEngine.getInstance().f6231bt != 0.0f) {
                return "Pause: Off";
            }
            return "Pause: On";
        }

        /* renamed from: c */
        public boolean m3551c(Unit unit, boolean z) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.f6120cb.m2635h()) {
            }
            if (gameEngine.f6231bt != 0.0f) {
                gameEngine.f6231bt = 0.0f;
                return false;
            }
            gameEngine.f6231bt = 1.0f;
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$7.class */
    final class C05797 extends AbstractC0229x {
        C05797(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Slow motion";
        }

        /* renamed from: b */
        public String mo6187b() {
            if (GameEngine.getInstance().f6231bt != 0.1f) {
                return "Slow motion: Off";
            }
            return "Slow motion: On";
        }

        /* renamed from: c */
        public boolean m3548c(Unit unit, boolean z) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.f6120cb.m2635h()) {
            }
            if (gameEngine.f6231bt == 1.0f) {
                gameEngine.f6231bt = 0.1f;
                return false;
            }
            gameEngine.f6231bt = 1.0f;
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$8.class */
    final class C05808 extends AbstractC0229x {
        C05808(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Fast Forward 1-5x";
        }

        /* renamed from: b */
        public String mo6187b() {
            return "Fast Forward: " + GameEngine.getInstance().f6231bt;
        }

        /* renamed from: c */
        public boolean m3545c(Unit unit, boolean z) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.f6120cb.m2635h()) {
            }
            if (gameEngine.f6231bt == 1.0f) {
                gameEngine.f6231bt = 2.0f;
                return false;
            } else if (gameEngine.f6231bt == 2.0f) {
                gameEngine.f6231bt = 3.0f;
                return false;
            } else if (gameEngine.f6231bt == 3.0f) {
                gameEngine.f6231bt = 4.0f;
                return false;
            } else if (gameEngine.f6231bt == 4.0f) {
                gameEngine.f6231bt = 5.0f;
                return false;
            } else if (gameEngine.f6231bt == 5.0f) {
                gameEngine.f6231bt = 10.0f;
                return false;
            } else {
                gameEngine.f6231bt = 1.0f;
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$9.class */
    public final class C05819 extends AbstractC0229x {
        C05819(String str) {
            super(str);
        }

        /* renamed from: j */
        public BitmapOrTexture mo6180j() {
            return EditorOrBuilder.f3763g;
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Search for units";
        }

        /* renamed from: b */
        public String mo6187b() {
            GameEngine.getInstance();
            EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
            if (m3709L != null && m3709L.f3788F == AbstractC0596n.f3857e) {
                return "Search: " + CommonUtils.m2301b(m3709L.f3789G, 8);
            }
            return "Search units";
        }

        /* renamed from: c */
        public boolean m3542c(Unit unit, boolean z) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.f6120cb.m2636g()) {
                gameEngine.m1137c("Reply active", "Changing search filter is currently not supported while recording a replay");
                return false;
            }
            C05821 c05821 = new C05821();
            c05821.f5635b = "Search units by internal name or text title.";
            c05821.f5638e = "Search units";
            c05821.f5639f = "Search";
            c05821.f5640g = "Cancel";
            C0831ad.m1762a(c05821);
            return false;
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$9$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$9$1.class */
        class C05821 extends C0841ae {
            C05821() {
            }

            /* renamed from: a */
            public void m3539a(String str) {
                GameEngine.PrintLog("Searching for: " + str);
                GameEngine gameEngine = GameEngine.getInstance();
                if (gameEngine.f6120cb.m2636g()) {
                    gameEngine.m1137c("Reply active", "Changing search filter is currently not supported while recording a replay");
                    return;
                }
                EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
                if (m3709L == null) {
                    GameEngine.PrintLog("search: No editor");
                } else if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
                    GameEngine.PrintLog("search: No text entered");
                    if (m3709L.f3788F == AbstractC0596n.f3857e) {
                        m3709L.f3788F = AbstractC0596n.f3853a;
                    }
                    m3709L.f3789G = null;
                    m3709L.f3790H = true;
                    C0797f.m2069J();
                } else {
                    m3709L.f3788F = AbstractC0596n.f3857e;
                    m3709L.f3789G = str;
                    m3709L.f3790H = true;
                    C0797f.m2069J();
                }
            }

            /* renamed from: a */
            public void m3540a() {
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$10.class */
    final class C055710 extends AbstractC0229x {
        C055710(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "Show hidden unit information in tooltips including flags, ammo, tags and resources";
        }

        /* renamed from: b */
        public String mo6187b() {
            if (!GameEngine.getInstance().f6225bl) {
                return "Debug: Off";
            }
            return "Debug: On";
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$11.class */
    final class C055811 extends AbstractC0229x {
        C055811(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "AI debug view";
        }

        /* renamed from: b */
        public String mo6187b() {
            GameEngine.getInstance();
            if (!C0136a.f552ar) {
                return "AI Debug: Off";
            }
            return "AI Debug: On";
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$13 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$13.class */
    final class C056013 extends AbstractC0229x {
        C056013(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo6189a() {
            return "For debugging autoTriggers. When enabled will log a message when any auto triggers fire on any selected units";
        }

        /* renamed from: b */
        public String mo6187b() {
            if (!GameEngine.getInstance().f6227bn) {
                return "Trigger Debug: Off";
            }
            return "Trigger Debug: On";
        }

        /* renamed from: b */
        public boolean mo4245b(Unit unit) {
            return GameEngine.getInstance().f6225bl;
        }
    }

    /* renamed from: a */
    public static boolean m3701a(Action action, Unit unit) {
        if (action instanceof C0213h) {
            action = ((C0213h) action).m6199n_();
        }
        if (action == f3771o || action == f3779w || action == f3780x || action == f3769m || action == f3767k || action == f3766j || action == f3782z || action == f3772p || action == f3773q || action == f3775s || action == f3776t || action == f3784B) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m3694a(ArrayList arrayList, int i) {
        if (i != 1) {
            return;
        }
        f3785C = new ArrayList();
        f3785C.add(new C0593k(true, false));
        f3785C.add(new C0593k(true, true));
        f3785C.add(new C0593k(false, false));
        f3785C.add(new C0595m(true, false));
        f3785C.add(new C0595m(true, true));
        f3785C.add(new C0595m(false, false));
        f3785C.add(new C0592j(true, false));
        f3785C.add(new C0592j(true, true));
        f3785C.add(new C0592j(false, false));
        f3785C.add(new C0594l(true, false));
        f3785C.add(new C0594l(true, true));
        f3785C.add(new C0594l(false, false));
        f3785C.add(new C0611q(EnumC0612r.f3871a));
        f3785C.add(new C0611q(EnumC0612r.f3872b));
        f3785C.add(new C0611q(EnumC0612r.f3873c));
        f3785C.add(new C0611q(EnumC0612r.f3874d));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0591i());
        arrayList2.add(f3781y);
        arrayList2.add(f3764h);
        arrayList2.add(f3765i);
        arrayList2.add(f3767k);
        arrayList2.add(f3766j);
        arrayList2.add(f3768l);
        arrayList2.add(f3770n);
        arrayList2.add(f3769m);
        arrayList2.add(f3777u);
        arrayList2.add(f3778v);
        arrayList2.add(f3779w);
        arrayList2.add(f3780x);
        arrayList2.add(f3782z);
        arrayList2.add(f3772p);
        arrayList2.add(f3773q);
        arrayList2.add(f3775s);
        arrayList2.add(f3776t);
        if (GameEngine.f6185at) {
            arrayList2.add(f3783A);
        }
        arrayList2.add(f3784B);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            f3785C.add(new C0213h((Action) it.next(), f3792J, true));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(UnitType.f1790ae);
        Collections.sort(arrayList3, new C056114());
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it2.next();
            if (interfaceC0303as != UnitType.f1768I && !interfaceC0303as.mo5706i().equals("test_tank") && !interfaceC0303as.mo5706i().equals("missing") && interfaceC0303as != UnitType.f1755v && interfaceC0303as != UnitType.f1750q && interfaceC0303as != UnitType.f1777R && interfaceC0303as != UnitType.f1767H && interfaceC0303as != UnitType.f1782W && interfaceC0303as != UnitType.f1783X && interfaceC0303as != UnitType.f1784Y && interfaceC0303as != UnitType.f1785Z && (Unit.m5847c(interfaceC0303as) instanceof AbstractC0623y) && (!(interfaceC0303as instanceof C0453l) || ((C0453l) interfaceC0303as).f2946aE)) {
                C0213h c0213h = new C0213h(new C0227v(interfaceC0303as, 1, null), f3792J);
                boolean z = false;
                Iterator it3 = f3785C.iterator();
                while (it3.hasNext()) {
                    if (((Action) it3.next()).equals(c0213h)) {
                        z = true;
                    }
                }
                if (!z) {
                    f3785C.add(c0213h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$14 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$14.class */
    public final class C056114 implements Comparator {
        C056114() {
        }

        /* renamed from: a */
        public int mo3478a(InterfaceC0303as interfaceC0303as, InterfaceC0303as interfaceC0303as2) {
            Unit m5847c = Unit.m5847c(interfaceC0303as);
            Unit m5847c2 = Unit.m5847c(interfaceC0303as2);
            int compareTo = Boolean.valueOf(m5847c.m5862bP()).compareTo(Boolean.valueOf(m5847c2.m5862bP()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(interfaceC0303as.mo5705j()).compareTo(Boolean.valueOf(interfaceC0303as2.mo5705j()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            int compareTo3 = Boolean.valueOf(m5847c.m5863bO()).compareTo(Boolean.valueOf(m5847c2.m5863bO()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            C0424b mo5697u = interfaceC0303as.mo5697u();
            C0424b mo5697u2 = interfaceC0303as2.mo5697u();
            C0424b mo5720B = interfaceC0303as.mo5720B();
            C0424b mo5720B2 = interfaceC0303as2.mo5720B();
            if (mo5720B != null) {
                mo5697u = C0424b.m5219a(mo5697u, mo5720B);
            }
            if (mo5720B2 != null) {
                mo5697u2 = C0424b.m5219a(mo5697u2, mo5720B2);
            }
            int m5221a = mo5697u.m5221a(mo5697u2);
            if (m5221a != 0) {
                return m5221a;
            }
            return 0;
        }
    }

    /* renamed from: N */
    public ArrayList m3707N() {
        GameEngine.getInstance();
        return f3785C;
    }

    /* renamed from: E */
    public boolean m3715E() {
        return true;
    }

    /* renamed from: g */
    public float m3681g(int i) {
        return 10.0f;
    }

    /* renamed from: F */
    public boolean m3714F() {
        return GameEngine.getInstance().f6109bQ.renderExtraShadows && !this.isDead;
    }

    /* renamed from: G */
    public float m3713G() {
        return 1.0f;
    }

    /* renamed from: H */
    public float m3712H() {
        return 1.0f;
    }

    /* renamed from: u */
    public boolean m3676u() {
        return true;
    }

    /* renamed from: I */
    public boolean mo3295I() {
        return false;
    }

    /* renamed from: d */
    public boolean m3686d(Unit unit) {
        return false;
    }

    /* renamed from: J */
    public boolean m3711J() {
        return true;
    }

    /* renamed from: a */
    public float m3697a(Unit unit, float f, Projectile projectile) {
        return super.mo4499a(unit, 0.0f, projectile);
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$15 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$15.class */
    final class C056215 extends C0207b {
        C056215() {
        }

        public boolean isAvailable(Action action, Unit unit) {
            if (action instanceof C0213h) {
                action = ((C0213h) action).m6199n_();
            }
            EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
            if (m3709L == null) {
                return true;
            }
            AbstractC0596n abstractC0596n = m3709L.f3788F;
            if (abstractC0596n == AbstractC0596n.f3853a && EditorOrBuilder.m3701a(action, unit)) {
                return false;
            }
            if (abstractC0596n == AbstractC0596n.f3856d && action == EditorOrBuilder.f3764h) {
                return true;
            }
            if (abstractC0596n == AbstractC0596n.f3856d && action == EditorOrBuilder.f3765i) {
                return true;
            }
            if (abstractC0596n == AbstractC0596n.f3857e && action == EditorOrBuilder.f3781y) {
                return true;
            }
            if (action == EditorOrBuilder.f3784B && !EditorOrBuilder.f3784B.mo4245b(unit)) {
                return false;
            }
            return abstractC0596n.m3355a(action.mo7517i());
        }
    }

    /* renamed from: O */
    public void m3706O() {
    }

    /* renamed from: P */
    public boolean m3705P() {
        return true;
    }

    /* renamed from: a */
    public void m3695a(EditorOrBuilder editorOrBuilder) {
        this.f3774r = editorOrBuilder.f3774r;
        this.f3759c = editorOrBuilder.f3759c;
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.m1554c(1);
        c0859ar.m1564a(this.f3788F);
        c0859ar.m1557b(this.f3789G);
        super.mo466a(c0859ar);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        byte m1457d = c0876k.m1457d();
        this.f3788F = (AbstractC0596n) c0876k.m1461b(AbstractC0596n.class);
        if (m1457d >= 1) {
            this.f3789G = c0876k.m1450j();
        }
        super.mo2877a(c0876k);
    }
}

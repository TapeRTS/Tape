package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;

/* renamed from: com.corrodinggames.rts.gameFramework.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ac.class */
public class C0638ac {

    /* renamed from: a */
    public static AbstractC0645aj f4077a = new C0647al();

    /* renamed from: b */
    public static C0644ai f4078b = new C0644ai();

    /* renamed from: c */
    public C0639ad f4079c;

    /* renamed from: d */
    public C0639ad f4080d;

    /* renamed from: e */
    public C0639ad f4081e;

    /* renamed from: f */
    public C0639ad f4082f;

    /* renamed from: g */
    public C0639ad f4083g;

    /* renamed from: h */
    public C0639ad f4084h;

    /* renamed from: i */
    public C0639ad f4085i;

    /* renamed from: j */
    public C0639ad f4086j;

    /* renamed from: k */
    public C0639ad f4087k;

    /* renamed from: l */
    public C0639ad f4088l = m2964a("Debug Left");

    /* renamed from: m */
    public C0639ad f4089m = m2964a("Debug Right");

    /* renamed from: n */
    public C0639ad f4090n = m2961b("Camera Up");

    /* renamed from: o */
    public C0639ad f4091o = m2961b("Camera Down");

    /* renamed from: p */
    public C0639ad f4092p = m2961b("Camera Left");

    /* renamed from: q */
    public C0639ad f4093q = m2961b("Camera Right");

    /* renamed from: r */
    public C0639ad f4094r = m2961b("Zoom In");

    /* renamed from: s */
    public C0639ad f4095s = m2961b("Zoom Out");

    /* renamed from: t */
    public C0639ad f4096t = m2961b("Send Chat");

    /* renamed from: u */
    public C0639ad f4097u = m2961b("Send Team Chat");

    /* renamed from: v */
    public C0639ad f4098v = m2961b("Ping Map");

    /* renamed from: w */
    public C0639ad f4099w = m2961b("Show Menu");

    /* renamed from: x */
    public C0639ad f4100x = m2961b("Save Game");

    /* renamed from: y */
    public C0639ad f4101y = m2961b("Deselect units");

    /* renamed from: z */
    public C0639ad f4102z = m2961b("Go to notification");

    /* renamed from: A */
    public C0639ad f4103A = m2961b("Select Whole Army");

    /* renamed from: B */
    public C0639ad f4104B = m2961b("Select Command Center");

    /* renamed from: C */
    public C0639ad f4105C = m2961b("Cycle Builders");

    /* renamed from: D */
    public C0639ad f4106D = m2961b("Cycle Extractors");

    /* renamed from: E */
    public C0639ad f4107E = m2961b("Cycle Upgradable Fabricators");

    /* renamed from: F */
    public C0639ad f4108F = m2961b("Cycle Land Factories");

    /* renamed from: G */
    public C0639ad f4109G = m2961b("Cycle Air Factories");

    /* renamed from: H */
    public C0639ad f4110H = m2961b("Next Music Track");

    /* renamed from: I */
    public C0640ae f4111I = m2960c("Game Speed (Single player)");

    /* renamed from: J */
    public C0639ad f4112J = m2961b("Slower");

    /* renamed from: K */
    public C0639ad f4113K = m2961b("Faster");

    /* renamed from: L */
    public C0639ad f4114L = m2961b("Pause Game");

    /* renamed from: M */
    public C0640ae f4115M = m2960c("Unit Actions");

    /* renamed from: N */
    public C0639ad f4116N = m2961b("Attack Move");

    /* renamed from: O */
    public C0639ad f4117O = m2961b("Stop");

    /* renamed from: P */
    public C0639ad f4118P = m2961b("Guard Unit");

    /* renamed from: Q */
    public C0639ad f4119Q = m2961b("Patrol");

    /* renamed from: R */
    public C0639ad f4120R = m2961b("Reclaim");

    /* renamed from: S */
    public C0639ad f4121S = m2961b("Action - Upgrade");

    /* renamed from: T */
    public C0639ad f4122T = m2961b("Action - Set Rally");

    /* renamed from: U */
    public C0639ad f4123U = m2964a("Debug Editor");

    /* renamed from: V */
    public C0639ad f4124V = m2964a("Debug Pause");

    /* renamed from: W */
    public C0639ad f4125W = m2964a("Debug Slow");

    /* renamed from: X */
    public C0639ad f4126X = m2964a("Debug HideInterface");

    /* renamed from: Y */
    public C0639ad f4127Y = m2964a("Debug HideInterface Temp");

    /* renamed from: Z */
    public C0639ad f4128Z = m2964a("Debug InvincibleUnits");

    /* renamed from: aa */
    public C0639ad f4129aa = m2964a("debugPrintSelectedUnit");

    /* renamed from: ab */
    public C0639ad f4130ab = m2964a("debugDevModeSwitch");

    /* renamed from: ac */
    public C0639ad f4131ac = m2964a("debugAIViewSwitch");

    /* renamed from: ad */
    public C0639ad f4132ad = m2964a("debugMapSwitch");

    /* renamed from: ae */
    public C0639ad f4133ae = m2964a("Debug Take Screenshot");

    /* renamed from: af */
    public C0639ad f4134af = m2964a("Debug Take Screenshot High");

    /* renamed from: ag */
    public C0639ad[] f4135ag;

    /* renamed from: ah */
    public C0640ae f4136ah;

    /* renamed from: ai */
    public C0639ad[] f4137ai;

    /* renamed from: aj */
    public C0639ad[] f4138aj;

    /* renamed from: ak */
    public C0639ad[] f4139ak;

    /* renamed from: al */
    public ArrayList f4140al;

    /* renamed from: am */
    Properties f4141am;

    /* renamed from: an */
    int f4142an;

    /* renamed from: ao */
    int f4143ao;

    public C0638ac() {
        this.f4090n.m2954a("UP").m2954a("NUMPAD8");
        this.f4091o.m2954a("DOWN").m2954a("NUMPAD2");
        this.f4092p.m2954a("LEFT").m2954a("NUMPAD4");
        this.f4093q.m2954a("RIGHT").m2954a("NUMPAD6");
        this.f4088l.m2954a("F5");
        this.f4089m.m2954a("F6");
        this.f4100x.m2954a("CTRL+S");
        this.f4096t.m2954a("ENTER").m2954a("T");
        this.f4097u.m2954a("SHIFT+ENTER").m2954a("Y");
        this.f4098v.m2954a("CTRL+M").m2954a("CTRL+P");
        this.f4099w.m2954a("ESCAPE").m2954a("F10");
        this.f4101y.m2954a("SPACE");
        this.f4102z.m2954a("CTRL+SPACE");
        this.f4103A.m2954a("CTRL+A");
        this.f4105C.m2954a("CTRL+B");
        this.f4106D.m2954a("CTRL+E");
        this.f4107E.m2954a("CTRL+F");
        this.f4108F.m2954a("CTRL+L");
        this.f4109G.m2954a("CTRL+K");
        this.f4104B.m2954a("CTRL+C");
        this.f4110H.m2954a("CTRL+N");
        this.f4116N.m2954a("A");
        this.f4114L.m2954a("BREAK");
        this.f4118P.m2954a("G");
        this.f4119Q.m2954a("P");
        this.f4121S.m2954a("U");
        this.f4122T.m2954a("R");
        this.f4123U.m2954a("CTRL+SHIFT+E");
        this.f4124V.m2954a("CTRL+SHIFT+P");
        this.f4125W.m2954a("CTRL+SHIFT+S");
        this.f4126X.m2954a("CTRL+SHIFT+H");
        this.f4127Y.m2954a("CTRL+H");
        this.f4128Z.m2954a("CTRL+SHIFT+I");
        this.f4129aa.m2954a("CTRL+SHIFT+L");
        this.f4130ab.m2954a("CTRL+SHIFT+D");
        this.f4131ac.m2954a("SHIFT+F3");
        this.f4132ad.m2954a("SHIFT+F4");
        this.f4133ae.m2954a("CTRL+SHIFT+ALT+S");
        this.f4134af.m2954a("CTRL+SHIFT+ALT+D");
        this.f4112J.m2954a("minus").m2954a("NUMPADSUBTRACT");
        this.f4113K.m2954a("equals").m2954a("NUMPADADD");
        int[] iArr = {54, 52, 31, 50, 30, 42, 41, 38, 39, 40, 37, 43};
        this.f4135ag = new C0639ad[10];
        for (int i = 0; i < this.f4135ag.length; i++) {
            this.f4135ag[i] = m2961b("unit action " + (i + 1));
            this.f4135ag[i].m2948c(iArr[i]);
        }
        this.f4136ah = m2960c("Unit Groups");
        this.f4139ak = new C0639ad[10];
        int i2 = 0;
        while (i2 < this.f4139ak.length) {
            this.f4139ak[i2] = m2961b("create group " + (i2 + 1));
            this.f4139ak[i2].m2956a(m2967a(i2 == 9 ? 0 : i2 + 1), 0, 1, false);
            i2++;
        }
        this.f4137ai = new C0639ad[10];
        int i3 = 0;
        while (i3 < this.f4137ai.length) {
            this.f4137ai[i3] = m2961b("select group " + (i3 + 1));
            this.f4137ai[i3].m2948c(m2967a(i3 == 9 ? 0 : i3 + 1));
            i3++;
        }
        this.f4138aj = new C0639ad[10];
        int i4 = 0;
        while (i4 < this.f4138aj.length) {
            this.f4138aj[i4] = m2961b("Add group to selection " + (i4 + 1));
            this.f4138aj[i4].m2956a(m2967a(i4 == 9 ? 0 : i4 + 1), 0, 2, false);
            i4++;
        }
        this.f4141am = new Properties();
        this.f4142an = 0;
        this.f4143ao = 0;
    }

    /* renamed from: a */
    public int m2967a(int i) {
        if (i >= 10) {
            throw new RuntimeException("number:" + i + " too high");
        }
        if (i == 0) {
            return 7;
        }
        return 8 + (i - 1);
    }

    /* renamed from: a */
    public C0639ad m2964a(String str) {
        if (this.f4140al == null) {
            this.f4140al = new ArrayList();
        }
        C0639ad c0639ad = new C0639ad();
        c0639ad.f4144a = str;
        c0639ad.f4145b = false;
        this.f4140al.add(c0639ad);
        return c0639ad;
    }

    /* renamed from: b */
    public C0639ad m2961b(String str) {
        if (this.f4140al == null) {
            this.f4140al = new ArrayList();
        }
        C0639ad c0639ad = new C0639ad();
        c0639ad.f4144a = str;
        c0639ad.f4145b = true;
        this.f4140al.add(c0639ad);
        return c0639ad;
    }

    /* renamed from: c */
    public C0640ae m2960c(String str) {
        if (this.f4140al == null) {
            this.f4140al = new ArrayList();
        }
        C0640ae c0640ae = new C0640ae();
        c0640ae.f4144a = str;
        c0640ae.f4145b = true;
        this.f4140al.add(c0640ae);
        return c0640ae;
    }

    /* renamed from: a */
    public void m2963a(String str, String str2) {
        String trim = str.toLowerCase(Locale.ENGLISH).trim();
        C0639ad c0639ad = null;
        Iterator it = this.f4140al.iterator();
        while (it.hasNext()) {
            C0639ad c0639ad2 = (C0639ad) it.next();
            if (c0639ad2.f4144a != null && c0639ad2.m2947e().equals(trim)) {
                c0639ad = c0639ad2;
            }
        }
        if (c0639ad == null) {
            GameEngine.m1145b("loadKey: could not find:" + trim);
            return;
        }
        String[] split = str2.split(",");
        for (int i = 0; i <= 1 && i < split.length; i++) {
            String str3 = split[i];
            if (!str3.equalsIgnoreCase("DEFAULT")) {
                c0639ad.m2953a(str3, i);
                if (c0639ad.f4146c.size() > i && c0639ad.f4146c.get(i) != null) {
                    ((AbstractC0641af) c0639ad.f4146c.get(i)).f4151d = true;
                } else {
                    GameEngine.m1120g("out of range");
                }
            }
        }
    }

    /* renamed from: a */
    public String m2966a(C0639ad c0639ad) {
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        Iterator it = c0639ad.f4146c.iterator();
        while (it.hasNext()) {
            AbstractC0641af abstractC0641af = (AbstractC0641af) it.next();
            if (z) {
                z = false;
            } else {
                str = str + ",";
            }
            if (abstractC0641af.f4151d) {
                if (abstractC0641af.mo2934d()) {
                    str = str + "CLEARED";
                } else {
                    str = str + abstractC0641af.mo2935c();
                }
            } else {
                str = str + "DEFAULT";
            }
        }
        return str;
    }

    /* renamed from: a */
    public boolean m2965a(C0639ad c0639ad, int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        AbstractC0641af m2957a = c0639ad.m2957a(i);
        if (m2957a == null) {
            return false;
        }
        ArrayList arrayList = gameEngine.f6112bT.f4140al;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C0639ad c0639ad2 = (C0639ad) arrayList.get(i2);
            if (c0639ad2 != c0639ad) {
                Iterator it = c0639ad2.f4146c.iterator();
                while (it.hasNext()) {
                    if (m2957a.mo2937a((AbstractC0641af) it.next())) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m2968a() {
        this.f4079c = m2964a("shoot");
        this.f4080d = m2964a("move up");
        this.f4081e = m2964a("move down");
        this.f4082f = m2964a("move left");
        this.f4083g = m2964a("move right");
        this.f4084h = m2964a("aim up");
        this.f4085i = m2964a("aim down");
        this.f4086j = m2964a("aim left");
        this.f4087k = m2964a("aim right");
        this.f4079c.m2955a(0, "enter", -1);
        this.f4079c.m2955a(0, "space", -1);
        this.f4080d.m2955a(0, "w", -1);
        this.f4081e.m2955a(0, "s", -1);
        this.f4082f.m2955a(0, "a", -1);
        this.f4083g.m2955a(0, "d", -1);
        this.f4084h.m2955a(0, "UP", -1);
        this.f4085i.m2955a(0, "DOWN", -1);
        this.f4086j.m2955a(0, "LEFT", -1);
        this.f4087k.m2955a(0, "RIGHT", -1);
        GameEngine.PrintLog("getControllerCount:" + f4078b.m2943a());
        this.f4080d.m2950b(0, 1, 0, true);
        this.f4081e.m2950b(0, 1, 0, false);
        this.f4082f.m2950b(0, 1, 1, true);
        this.f4083g.m2950b(0, 1, 1, false);
        this.f4084h.m2950b(0, 1, 2, true);
        this.f4085i.m2950b(0, 1, 2, false);
        this.f4086j.m2950b(0, 1, 3, true);
        this.f4087k.m2950b(0, 1, 3, false);
        this.f4079c.m2950b(0, 1, 4, true);
    }

    /* renamed from: b */
    public void m2962b() {
        if (f4078b.m2943a() != this.f4143ao) {
            this.f4143ao = f4078b.m2943a();
            GameEngine.PrintLog("Number of controllers changed, now:" + this.f4143ao);
        }
    }

    /* renamed from: d */
    public static int m2959d(String str) {
        if (str.equalsIgnoreCase("CLEARED")) {
            return 0;
        }
        return SlickToAndroidKeycodes.m762a(str);
    }
}

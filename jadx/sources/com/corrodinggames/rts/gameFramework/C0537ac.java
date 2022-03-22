package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;

/* renamed from: com.corrodinggames.rts.gameFramework.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ac.class */
public class C0537ac {

    /* renamed from: a */
    public static AbstractC0544aj f3608a = new C0546al();

    /* renamed from: b */
    public static C0543ai f3609b = new C0543ai();

    /* renamed from: c */
    public C0538ad f3610c;

    /* renamed from: d */
    public C0538ad f3611d;

    /* renamed from: e */
    public C0538ad f3612e;

    /* renamed from: f */
    public C0538ad f3613f;

    /* renamed from: g */
    public C0538ad f3614g;

    /* renamed from: h */
    public C0538ad f3615h;

    /* renamed from: i */
    public C0538ad f3616i;

    /* renamed from: j */
    public C0538ad f3617j;

    /* renamed from: k */
    public C0538ad f3618k;

    /* renamed from: l */
    public C0538ad f3619l = m2086a("Debug Left");

    /* renamed from: m */
    public C0538ad f3620m = m2086a("Debug Right");

    /* renamed from: n */
    public C0538ad f3621n = m2083b("Camera Up");

    /* renamed from: o */
    public C0538ad f3622o = m2083b("Camera Down");

    /* renamed from: p */
    public C0538ad f3623p = m2083b("Camera Left");

    /* renamed from: q */
    public C0538ad f3624q = m2083b("Camera Right");

    /* renamed from: r */
    public C0538ad f3625r = m2083b("Zoom In");

    /* renamed from: s */
    public C0538ad f3626s = m2083b("Zoom Out");

    /* renamed from: t */
    public C0538ad f3627t = m2083b("Send Chat");

    /* renamed from: u */
    public C0538ad f3628u = m2083b("Send Team Chat");

    /* renamed from: v */
    public C0538ad f3629v = m2083b("Ping Map");

    /* renamed from: w */
    public C0538ad f3630w = m2083b("Show Menu");

    /* renamed from: x */
    public C0538ad f3631x = m2083b("Save Game");

    /* renamed from: y */
    public C0538ad f3632y = m2083b("Deselect units");

    /* renamed from: z */
    public C0538ad f3633z = m2083b("Go to notification");

    /* renamed from: A */
    public C0538ad f3634A = m2083b("Select Whole Army");

    /* renamed from: B */
    public C0538ad f3635B = m2083b("Select Command Center");

    /* renamed from: C */
    public C0538ad f3636C = m2083b("Cycle Builders");

    /* renamed from: D */
    public C0538ad f3637D = m2083b("Cycle Extractors");

    /* renamed from: E */
    public C0538ad f3638E = m2083b("Cycle Upgradable Fabricators");

    /* renamed from: F */
    public C0538ad f3639F = m2083b("Cycle Land Factories");

    /* renamed from: G */
    public C0538ad f3640G = m2083b("Cycle Air Factories");

    /* renamed from: H */
    public C0538ad f3641H = m2083b("Next Music Track");

    /* renamed from: I */
    public C0539ae f3642I = m2082c("Game Speed (Single player)");

    /* renamed from: J */
    public C0538ad f3643J = m2083b("Slower");

    /* renamed from: K */
    public C0538ad f3644K = m2083b("Faster");

    /* renamed from: L */
    public C0538ad f3645L = m2083b("Pause Game");

    /* renamed from: M */
    public C0539ae f3646M = m2082c("Unit Actions");

    /* renamed from: N */
    public C0538ad f3647N = m2083b("Attack Move");

    /* renamed from: O */
    public C0538ad f3648O = m2083b("Stop");

    /* renamed from: P */
    public C0538ad f3649P = m2083b("Guard Unit");

    /* renamed from: Q */
    public C0538ad f3650Q = m2083b("Patrol");

    /* renamed from: R */
    public C0538ad f3651R = m2083b("Reclaim");

    /* renamed from: S */
    public C0538ad f3652S = m2083b("Action - Upgrade");

    /* renamed from: T */
    public C0538ad f3653T = m2083b("Action - Set Rally");

    /* renamed from: U */
    public C0538ad f3654U = m2086a("Debug Editor");

    /* renamed from: V */
    public C0538ad f3655V = m2086a("Debug Pause");

    /* renamed from: W */
    public C0538ad f3656W = m2086a("Debug Slow");

    /* renamed from: X */
    public C0538ad f3657X = m2086a("Debug HideInterface");

    /* renamed from: Y */
    public C0538ad f3658Y = m2086a("Debug HideInterface Temp");

    /* renamed from: Z */
    public C0538ad f3659Z = m2086a("Debug InvincibleUnits");

    /* renamed from: aa */
    public C0538ad f3660aa = m2086a("debugPrintSelectedUnit");

    /* renamed from: ab */
    public C0538ad f3661ab = m2086a("debugDevModeSwitch");

    /* renamed from: ac */
    public C0538ad f3662ac = m2086a("debugAIViewSwitch");

    /* renamed from: ad */
    public C0538ad f3663ad = m2086a("debugMapSwitch");

    /* renamed from: ae */
    public C0538ad f3664ae = m2086a("Debug Take Screenshot");

    /* renamed from: af */
    public C0538ad[] f3665af = new C0538ad[10];

    /* renamed from: ag */
    public C0539ae f3666ag;

    /* renamed from: ah */
    public C0538ad[] f3667ah;

    /* renamed from: ai */
    public C0538ad[] f3668ai;

    /* renamed from: aj */
    public C0538ad[] f3669aj;

    /* renamed from: ak */
    public ArrayList f3670ak;

    /* renamed from: al */
    Properties f3671al;

    /* renamed from: am */
    int f3672am;

    /* renamed from: an */
    int f3673an;

    public C0537ac() {
        this.f3621n.m2076a("UP").m2076a("NUMPAD8");
        this.f3622o.m2076a("DOWN").m2076a("NUMPAD2");
        this.f3623p.m2076a("LEFT").m2076a("NUMPAD4");
        this.f3624q.m2076a("RIGHT").m2076a("NUMPAD6");
        this.f3619l.m2076a("F5");
        this.f3620m.m2076a("F6");
        this.f3631x.m2076a("CTRL+S");
        this.f3627t.m2076a("ENTER").m2076a("T");
        this.f3628u.m2076a("SHIFT+ENTER").m2076a("Y");
        this.f3629v.m2076a("CTRL+M").m2076a("CTRL+P");
        this.f3630w.m2076a("ESCAPE").m2076a("F10");
        this.f3632y.m2076a("SPACE");
        this.f3633z.m2076a("CTRL+SPACE");
        this.f3634A.m2076a("CTRL+A");
        this.f3636C.m2076a("CTRL+B");
        this.f3637D.m2076a("CTRL+E");
        this.f3638E.m2076a("CTRL+F");
        this.f3639F.m2076a("CTRL+L");
        this.f3640G.m2076a("CTRL+K");
        this.f3635B.m2076a("CTRL+C");
        this.f3641H.m2076a("CTRL+N");
        this.f3647N.m2076a("A");
        this.f3649P.m2076a("G");
        this.f3650Q.m2076a("P");
        this.f3652S.m2076a("U");
        this.f3653T.m2076a("R");
        this.f3654U.m2076a("CTRL+SHIFT+E");
        this.f3655V.m2076a("CTRL+SHIFT+P");
        this.f3656W.m2076a("CTRL+SHIFT+S");
        this.f3657X.m2076a("CTRL+SHIFT+H");
        this.f3658Y.m2076a("CTRL+H");
        this.f3659Z.m2076a("CTRL+SHIFT+I");
        this.f3660aa.m2076a("CTRL+SHIFT+L");
        this.f3661ab.m2076a("CTRL+SHIFT+D");
        this.f3662ac.m2076a("SHIFT+F3");
        this.f3663ad.m2076a("SHIFT+F4");
        this.f3664ae.m2076a("CTRL+SHIFT+ALT+S");
        this.f3643J.m2076a("minus").m2076a("NUMPADSUBTRACT");
        this.f3644K.m2076a("equals").m2076a("NUMPADADD");
        int[] iArr = {54, 52, 31, 50, 30, 42, 41, 38, 39, 40, 37, 43};
        for (int i = 0; i < this.f3665af.length; i++) {
            this.f3665af[i] = m2083b("unit action " + (i + 1));
            this.f3665af[i].m2073b(iArr[i]);
        }
        this.f3666ag = m2082c("Unit Groups");
        this.f3669aj = new C0538ad[10];
        int i2 = 0;
        while (i2 < this.f3669aj.length) {
            this.f3669aj[i2] = m2083b("create group " + (i2 + 1));
            this.f3669aj[i2].m2078a(m2088a(i2 == 9 ? 0 : i2 + 1), 0, 1, false);
            i2++;
        }
        this.f3667ah = new C0538ad[10];
        int i3 = 0;
        while (i3 < this.f3667ah.length) {
            this.f3667ah[i3] = m2083b("select group " + (i3 + 1));
            this.f3667ah[i3].m2073b(m2088a(i3 == 9 ? 0 : i3 + 1));
            i3++;
        }
        this.f3668ai = new C0538ad[10];
        int i4 = 0;
        while (i4 < this.f3668ai.length) {
            this.f3668ai[i4] = m2083b("Add group to selection " + (i4 + 1));
            this.f3668ai[i4].m2078a(m2088a(i4 == 9 ? 0 : i4 + 1), 0, 2, false);
            i4++;
        }
        this.f3671al = new Properties();
        this.f3672am = 0;
        this.f3673an = 0;
    }

    /* renamed from: a */
    public int m2088a(int i) {
        if (i >= 10) {
            throw new RuntimeException("number:" + i + " too high");
        } else if (i == 0) {
            return 7;
        } else {
            return 8 + (i - 1);
        }
    }

    /* renamed from: a */
    public C0538ad m2086a(String str) {
        if (this.f3670ak == null) {
            this.f3670ak = new ArrayList();
        }
        C0538ad adVar = new C0538ad();
        adVar.f3674a = str;
        adVar.f3675b = false;
        this.f3670ak.add(adVar);
        return adVar;
    }

    /* renamed from: b */
    public C0538ad m2083b(String str) {
        if (this.f3670ak == null) {
            this.f3670ak = new ArrayList();
        }
        C0538ad adVar = new C0538ad();
        adVar.f3674a = str;
        adVar.f3675b = true;
        this.f3670ak.add(adVar);
        return adVar;
    }

    /* renamed from: c */
    public C0539ae m2082c(String str) {
        if (this.f3670ak == null) {
            this.f3670ak = new ArrayList();
        }
        C0539ae aeVar = new C0539ae();
        aeVar.f3674a = str;
        aeVar.f3675b = true;
        this.f3670ak.add(aeVar);
        return aeVar;
    }

    /* renamed from: a */
    public void m2085a(String str, String str2) {
        String trim = str.toLowerCase(Locale.ENGLISH).trim();
        C0538ad adVar = null;
        Iterator it = this.f3670ak.iterator();
        while (it.hasNext()) {
            C0538ad adVar2 = (C0538ad) it.next();
            if (adVar2.f3674a != null && adVar2.m2070e().equals(trim)) {
                adVar = adVar2;
            }
        }
        if (adVar == null) {
            AbstractC0789l.m682b("loadKey: could not find:" + trim);
            return;
        }
        String[] split = str2.split(",");
        for (int i = 0; i <= 1 && i < split.length; i++) {
            String str3 = split[i];
            if (!str3.equalsIgnoreCase("DEFAULT")) {
                adVar.m2075a(str3, i);
                if (adVar.f3676c.size() <= i || adVar.f3676c.get(i) == null) {
                    AbstractC0789l.m663f("out of range");
                } else {
                    ((AbstractC0540af) adVar.f3676c.get(i)).f3681d = true;
                }
            }
        }
    }

    /* renamed from: a */
    public String m2087a(C0538ad adVar) {
        String str = "";
        boolean z = true;
        Iterator it = adVar.f3676c.iterator();
        while (it.hasNext()) {
            AbstractC0540af afVar = (AbstractC0540af) it.next();
            if (z) {
                z = false;
            } else {
                str = str + ",";
            }
            if (!afVar.f3681d) {
                str = str + "DEFAULT";
            } else if (afVar.mo2063d()) {
                str = str + "CLEARED";
            } else {
                str = str + afVar.mo2064c();
            }
        }
        return str;
    }

    /* renamed from: a */
    public void m2089a() {
        this.f3610c = m2086a("shoot");
        this.f3611d = m2086a("move up");
        this.f3612e = m2086a("move down");
        this.f3613f = m2086a("move left");
        this.f3614g = m2086a("move right");
        this.f3615h = m2086a("aim up");
        this.f3616i = m2086a("aim down");
        this.f3617j = m2086a("aim left");
        this.f3618k = m2086a("aim right");
        this.f3610c.m2077a(0, "enter", -1);
        this.f3610c.m2077a(0, "space", -1);
        this.f3611d.m2077a(0, "w", -1);
        this.f3612e.m2077a(0, "s", -1);
        this.f3613f.m2077a(0, "a", -1);
        this.f3614g.m2077a(0, "d", -1);
        this.f3615h.m2077a(0, "UP", -1);
        this.f3616i.m2077a(0, "DOWN", -1);
        this.f3617j.m2077a(0, "LEFT", -1);
        this.f3618k.m2077a(0, "RIGHT", -1);
        AbstractC0789l.m670d("getControllerCount:" + f3609b.mo19a());
        this.f3611d.m2072b(0, 1, 0, true);
        this.f3612e.m2072b(0, 1, 0, false);
        this.f3613f.m2072b(0, 1, 1, true);
        this.f3614g.m2072b(0, 1, 1, false);
        this.f3615h.m2072b(0, 1, 2, true);
        this.f3616i.m2072b(0, 1, 2, false);
        this.f3617j.m2072b(0, 1, 3, true);
        this.f3618k.m2072b(0, 1, 3, false);
        this.f3610c.m2072b(0, 1, 4, true);
    }

    /* renamed from: b */
    public void m2084b() {
        if (f3609b.mo19a() != this.f3673an) {
            this.f3673an = f3609b.mo19a();
            AbstractC0789l.m670d("Number of controllers changed, now:" + this.f3673an);
        }
    }

    /* renamed from: d */
    public static int m2081d(String str) {
        if (str.equalsIgnoreCase("CLEARED")) {
            return 0;
        }
        return SlickToAndroidKeycodes.m621a(str);
    }
}

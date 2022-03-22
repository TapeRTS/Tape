package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f.class */
public class C0362f {

    /* renamed from: a */
    public String f2405a;

    /* renamed from: b */
    public int f2406b;

    /* renamed from: c */
    public int f2407c;

    /* renamed from: d */
    public float f2408d;

    /* renamed from: e */
    public float f2409e;

    /* renamed from: f */
    public float f2410f;

    /* renamed from: g */
    public boolean f2411g;

    /* renamed from: h */
    public float f2412h;

    /* renamed from: i */
    public float f2413i;

    /* renamed from: j */
    public C0370m f2414j;

    /* renamed from: m */
    public float f2417m;

    /* renamed from: n */
    public boolean f2418n;

    /* renamed from: p */
    public float f2420p;

    /* renamed from: k */
    public C0835m f2415k = new C0835m();

    /* renamed from: l */
    public boolean f2416l = true;

    /* renamed from: o */
    public ArrayList f2419o = new ArrayList();

    public C0362f(String str) {
        this.f2405a = str;
    }

    /* renamed from: a */
    public void m2947a(C0368l lVar) {
        Iterator it = this.f2415k.iterator();
        while (it.hasNext()) {
            C0337c cVar = (C0337c) it.next();
            if (cVar.f2304a == EnumC0344d.legX || cVar.f2304a == EnumC0344d.legY || cVar.f2304a == EnumC0344d.legHeight || cVar.f2304a == EnumC0344d.legDir || cVar.f2304a == EnumC0344d.legAlpha) {
                boolean z = false;
                C0310af[] afVarArr = lVar.f2547am;
                int length = afVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C0310af afVar = afVarArr[i];
                    if (cVar.f2306c.equals(afVar.f2010b)) {
                        cVar.f2305b = afVar.f2009a;
                        z = true;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    throw new C0324at("Cannot find leg:" + cVar.f2306c + " for animation:" + this.f2405a);
                }
            }
            if (cVar.f2305b < 0) {
                throw new C0324at("Cannot find target for:" + cVar.f2306c + " for animation:" + this.f2405a);
            }
        }
    }

    /* renamed from: a */
    public boolean m2944a(EnumC0371n nVar) {
        Iterator it = this.f2419o.iterator();
        while (it.hasNext()) {
            if (((EnumC0371n) it.next()) == nVar) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2948a() {
        return this.f2418n;
    }

    /* renamed from: a */
    public void m2946a(C0368l lVar, C0809ab abVar, String str, String str2) {
        C0362f a;
        boolean z = false;
        String str3 = null;
        String b = abVar.m579b(str, str2 + "onActions", (String) null);
        if (b != null) {
            for (String str4 : b.split(",")) {
                String trim = str4.trim();
                if (!trim.equals("")) {
                    EnumC0371n a2 = EnumC0371n.m2727a(trim);
                    if (a2 == null) {
                        throw new C0324at("Unknown action type: " + trim + " on animation:" + this.f2405a);
                    }
                    if (lVar.m2789a(a2) != null) {
                        throw new C0324at("Cannot add action: " + trim + " to:" + this.f2405a + " it already exists on:" + a.f2405a);
                    }
                    this.f2419o.add(a2);
                }
            }
        }
        this.f2420p = abVar.m592a(str, str2 + "onActionsQueuedUnitPlayAt", Float.valueOf(0.0f)).floatValue();
        this.f2406b = abVar.m580b(str, str2 + "start", (Integer) 0).intValue();
        this.f2407c = abVar.m580b(str, str2 + "end", (Integer) (-1)).intValue();
        if (this.f2407c == -1 || this.f2407c >= this.f2406b) {
            this.f2414j = C0370m.m2728a(lVar, abVar, str, "", true);
            this.f2412h = abVar.m571d(str, str2 + "blendIn", Float.valueOf(-1.0f)).floatValue();
            this.f2413i = abVar.m571d(str, str2 + "blendOut", Float.valueOf(-1.0f)).floatValue();
            this.f2408d = abVar.m592a(str, str2 + "scale_start", Float.valueOf(1.0f)).floatValue();
            this.f2409e = abVar.m592a(str, str2 + "scale_end", Float.valueOf(1.0f)).floatValue();
            Float a3 = abVar.m592a(str, str2 + "speed", (Float) null);
            if (a3 != null) {
                this.f2410f = a3.floatValue();
                z = true;
                str3 = "speed";
            } else {
                this.f2410f = 40.0f;
            }
            this.f2411g = abVar.m594a(str, str2 + "pingPong", (Boolean) false).booleanValue();
            float f = 1.0f * this.f2410f;
            float floatValue = abVar.m592a(str, str2 + "KeyframeTimeScale", Float.valueOf(1.0f)).floatValue();
            if (this.f2407c != -1) {
                z = true;
                str3 = "animationEnd";
                C0337c cVar = new C0337c();
                cVar.f2304a = EnumC0344d.frame;
                this.f2415k.add(cVar);
                f *= (this.f2407c - this.f2406b) + 1;
                cVar.m3033a(0.0f, this.f2406b);
                cVar.m3033a(f, this.f2407c + 0.99f);
            }
            if (!(this.f2408d == 1.0f && this.f2409e == 1.0f)) {
                z = true;
                str3 = "animationScaleX";
                C0337c cVar2 = new C0337c();
                cVar2.f2304a = EnumC0344d.scale;
                this.f2415k.add(cVar2);
                cVar2.m3033a(0.0f, this.f2408d);
                cVar2.m3033a(f, this.f2409e);
            }
            if (z) {
                this.f2417m = f;
            }
            C0835m f2 = abVar.m564f(str, str2 + "leg", str2 + "arm");
            f2.addAll(abVar.m556j(str, str2 + "turret"));
            f2.addAll(abVar.m556j(str, str2 + "body"));
            f2.addAll(abVar.m556j(str, str2 + "effect"));
            Iterator it = f2.iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                if (0 == 0) {
                    if (z) {
                        throw new C0324at("Cannot mix new (" + str5 + ") and old style (" + str3 + ") animations on:" + this.f2405a);
                    }
                    m2945a(lVar, abVar, str, str2, str5);
                }
            }
            C0835m mVar = new C0835m();
            this.f2416l = false;
            Iterator it2 = this.f2415k.iterator();
            while (it2.hasNext()) {
                C0337c cVar3 = (C0337c) it2.next();
                cVar3.m3034a(floatValue);
                cVar3.m3028c();
                if (this.f2417m < cVar3.f2307d) {
                    this.f2417m = cVar3.f2307d;
                }
                if (cVar3.f2308e.length > 0) {
                    this.f2418n = true;
                    if (!(cVar3.f2304a == EnumC0344d.frame || cVar3.f2304a == EnumC0344d.scale)) {
                        this.f2416l = true;
                    }
                    mVar.add(cVar3);
                }
            }
            this.f2415k = mVar;
            return;
        }
        throw new RuntimeException("animationEnd cannot before animationStart on animation:" + this.f2405a);
    }

    /* renamed from: a */
    public C0337c m2943a(String str, String str2) {
        int i;
        EnumC0344d dVar;
        if (str2.startsWith("leg") || str2.startsWith("arm")) {
            i = -1;
            if (str.equalsIgnoreCase("x")) {
                dVar = EnumC0344d.legX;
            } else if (str.equalsIgnoreCase("y")) {
                dVar = EnumC0344d.legY;
            } else if (str.equalsIgnoreCase("dir")) {
                dVar = EnumC0344d.legDir;
            } else if (str.equalsIgnoreCase("height")) {
                dVar = EnumC0344d.legHeight;
            } else if (str.equalsIgnoreCase("alpha")) {
                dVar = EnumC0344d.legAlpha;
            } else {
                throw new C0324at("Unknown leg/arm animation type:" + str + " on animation:" + this.f2405a);
            }
        } else if (str2.startsWith("turret")) {
            i = Integer.parseInt(str2.substring("turret".length())) - 1;
            if (str.equalsIgnoreCase("x")) {
                dVar = EnumC0344d.turretX;
            } else if (str.equalsIgnoreCase("y")) {
                dVar = EnumC0344d.turretY;
            } else {
                throw new C0324at("Unknown turret animation type:" + str + " on animation:" + this.f2405a);
            }
        } else if (str2.startsWith("body")) {
            i = 0;
            if (str.equalsIgnoreCase("scale")) {
                dVar = EnumC0344d.scale;
            } else if (str.equalsIgnoreCase("frame")) {
                dVar = EnumC0344d.frame;
            } else {
                throw new C0324at("Unknown body animation type:" + str + " on animation:" + this.f2405a);
            }
        } else if (str2.startsWith("effect")) {
            i = 0;
            dVar = EnumC0344d.event;
            str2 = "event";
        } else {
            throw new C0324at("Unknown animation target:" + str2 + " on animation:" + this.f2405a);
        }
        Iterator it = this.f2415k.iterator();
        while (it.hasNext()) {
            C0337c cVar = (C0337c) it.next();
            if (cVar.f2304a == dVar && str2.equals(cVar.f2306c)) {
                return cVar;
            }
        }
        C0337c cVar2 = new C0337c();
        cVar2.f2304a = dVar;
        cVar2.f2305b = i;
        cVar2.f2306c = str2;
        this.f2415k.add(cVar2);
        return cVar2;
    }

    /* renamed from: a */
    public void m2945a(C0368l lVar, C0809ab abVar, String str, String str2, String str3) {
        String[] split;
        String str4 = str3.substring(str2.length()).split("_")[0];
        String substring = str3.substring((str2 + str4 + "_").length());
        try {
            float a = C0809ab.m585a(substring, false, str, str3);
            String e = abVar.m568e(str, str3);
            if (!e.startsWith("{") || !e.endsWith("}")) {
                throw new C0324at("Unknown format:" + e, str, str3);
            }
            String substring2 = e.substring(1, e.length() - 1);
            C0337c cVar = null;
            for (String str5 : substring2.split(",")) {
                String[] split2 = str5.split(":");
                if (split2.length != 2) {
                    throw new C0324at("Unknown format on part:" + str5 + " of: " + substring2, str, str3);
                }
                String trim = split2[0].trim();
                String trim2 = split2[1].trim();
                C0337c a2 = m2943a(trim, str4);
                if (cVar != a2) {
                    if (cVar != null) {
                        cVar.m3030b();
                    }
                    cVar = a2;
                }
                try {
                    a2.m3031a(lVar, a, trim, trim2);
                } catch (C0324at e2) {
                    throw new C0324at(e2.f2199a + " (as part of key:" + str3 + " section:" + str + ")");
                }
            }
            if (cVar != null) {
                cVar.m3030b();
            }
        } catch (NumberFormatException e3) {
            throw new C0324at("Failed to read time:" + substring + " in key:" + str3 + " section:" + str + " expected a float with optional 's' or 'ms' postfix");
        }
    }
}

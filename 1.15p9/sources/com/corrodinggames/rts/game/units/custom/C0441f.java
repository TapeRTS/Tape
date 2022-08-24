package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f.class */
public class C0441f {

    /* renamed from: a */
    public String f2804a;

    /* renamed from: b */
    public int f2805b;

    /* renamed from: c */
    public int f2806c;

    /* renamed from: d */
    public float f2807d;

    /* renamed from: e */
    public float f2808e;

    /* renamed from: f */
    public float f2809f;

    /* renamed from: g */
    public boolean f2810g;

    /* renamed from: h */
    public float f2811h;

    /* renamed from: i */
    public float f2812i;

    /* renamed from: j */
    public LogicBoolean f2813j;

    /* renamed from: k */
    public C0455m f2814k;

    /* renamed from: n */
    public float f2815n;

    /* renamed from: o */
    public boolean f2816o;

    /* renamed from: q */
    public float f2817q;

    /* renamed from: l */
    public C1101m f2818l = new C1101m();

    /* renamed from: m */
    public boolean f2819m = true;

    /* renamed from: p */
    public ArrayList f2820p = new ArrayList();

    public C0441f(String str) {
        this.f2804a = str;
    }

    /* renamed from: a */
    public void m4437a(C0453l c0453l) {
        Iterator it = this.f2818l.iterator();
        while (it.hasNext()) {
            C0415c c0415c = (C0415c) it.next();
            if (c0415c.f2657a == EnumC0422d.legX || c0415c.f2657a == EnumC0422d.legY || c0415c.f2657a == EnumC0422d.legHeight || c0415c.f2657a == EnumC0422d.legDir || c0415c.f2657a == EnumC0422d.legAlpha) {
                boolean z = false;
                C0384ay[] c0384ayArr = c0453l.f3220aw;
                int length = c0384ayArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C0384ay c0384ay = c0384ayArr[i];
                    if (!c0415c.f2659c.equals(c0384ay.f2272b)) {
                        i++;
                    } else {
                        c0415c.f2658b = c0384ay.f2271a;
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    throw new C0412bm("Cannot find leg:" + c0415c.f2659c + " for animation:" + this.f2804a);
                }
            }
            if (c0415c.f2658b < 0) {
                throw new C0412bm("Cannot find target for:" + c0415c.f2659c + " for animation:" + this.f2804a);
            }
        }
    }

    /* renamed from: a */
    public boolean m4434a(EnumC0456n enumC0456n) {
        Iterator it = this.f2820p.iterator();
        while (it.hasNext()) {
            if (((EnumC0456n) it.next()) == enumC0456n) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4438a() {
        return this.f2816o;
    }

    /* renamed from: a */
    public void m4436a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        C0441f m4143a;
        boolean z = false;
        String str3 = null;
        String m675b = c1072ab.m675b(str, str2 + "onActions", (String) null);
        if (m675b != null) {
            for (String str4 : m675b.split(",")) {
                String trim = str4.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    EnumC0456n m4073a = EnumC0456n.m4073a(trim);
                    if (m4073a == null) {
                        throw new C0412bm("Unknown action type: " + trim + " on animation:" + this.f2804a);
                    }
                    if (c0453l.m4143a(m4073a) != null) {
                        throw new C0412bm("Cannot add action: " + trim + " to:" + this.f2804a + " it already exists on:" + m4143a.f2804a);
                    }
                    this.f2820p.add(m4073a);
                }
            }
        }
        this.f2817q = c1072ab.m692a(str, str2 + "onActionsQueuedUnitPlayAt", Float.valueOf(0.0f)).floatValue();
        this.f2805b = c1072ab.m676b(str, str2 + "start", (Integer) 0).intValue();
        this.f2806c = c1072ab.m676b(str, str2 + "end", (Integer) (-1)).intValue();
        if (this.f2806c != -1 && this.f2806c < this.f2805b) {
            throw new RuntimeException("animationEnd cannot before animationStart on animation:" + this.f2804a);
        }
        this.f2814k = C0455m.m4074a(c0453l, c1072ab, str, VariableScope.nullOrMissingString, true);
        this.f2811h = c1072ab.m665d(str, str2 + "blendIn", Float.valueOf(-1.0f)).floatValue();
        this.f2812i = c1072ab.m665d(str, str2 + "blendOut", Float.valueOf(-1.0f)).floatValue();
        this.f2813j = c1072ab.m712a(c0453l, str, str2 + "playbackRate", (LogicBoolean) null, LogicBoolean.ReturnType.number);
        this.f2807d = c1072ab.m692a(str, str2 + "scale_start", Float.valueOf(1.0f)).floatValue();
        this.f2808e = c1072ab.m692a(str, str2 + "scale_end", Float.valueOf(1.0f)).floatValue();
        Float m692a = c1072ab.m692a(str, str2 + "speed", (Float) null);
        if (m692a != null) {
            this.f2809f = m692a.floatValue();
            z = true;
            str3 = "speed";
        } else {
            this.f2809f = 40.0f;
        }
        this.f2810g = c1072ab.m694a(str, str2 + "pingPong", (Boolean) false).booleanValue();
        float f = 1.0f * this.f2809f;
        float floatValue = c1072ab.m692a(str, str2 + "KeyframeTimeScale", Float.valueOf(1.0f)).floatValue();
        if (this.f2806c != -1) {
            z = true;
            str3 = "animationEnd";
            C0415c c0415c = new C0415c();
            c0415c.f2657a = EnumC0422d.frame;
            this.f2818l.add(c0415c);
            f *= (this.f2806c - this.f2805b) + 1;
            c0415c.m4599a(0.0f, this.f2805b);
            c0415c.m4599a(f, this.f2806c + 0.99f);
        }
        if (this.f2807d != 1.0f || this.f2808e != 1.0f) {
            z = true;
            str3 = "animationScaleX";
            C0415c c0415c2 = new C0415c();
            c0415c2.f2657a = EnumC0422d.scale;
            this.f2818l.add(c0415c2);
            c0415c2.m4599a(0.0f, this.f2807d);
            c0415c2.m4599a(f, this.f2808e);
        }
        if (z) {
            this.f2815n = f;
        }
        C1101m m658f = c1072ab.m658f(str, str2 + "leg", str2 + "arm");
        m658f.addAll(c1072ab.m648k(str, str2 + "turret"));
        m658f.addAll(c1072ab.m648k(str, str2 + "body"));
        m658f.addAll(c1072ab.m648k(str, str2 + "effect"));
        Iterator it = m658f.iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (0 == 0) {
                if (z) {
                    throw new C0412bm("Cannot mix new (" + str5 + ") and old style (" + str3 + ") animations on:" + this.f2804a);
                }
                m4435a(c0453l, c1072ab, str, str2, str5);
            }
        }
        C1101m c1101m = new C1101m();
        this.f2819m = false;
        Iterator it2 = this.f2818l.iterator();
        while (it2.hasNext()) {
            C0415c c0415c3 = (C0415c) it2.next();
            c0415c3.m4600a(floatValue);
            c0415c3.m4594c();
            if (this.f2815n < c0415c3.f2660d) {
                this.f2815n = c0415c3.f2660d;
            }
            if (c0415c3.f2661e.length > 0) {
                this.f2816o = true;
                if (c0415c3.f2657a != EnumC0422d.frame && c0415c3.f2657a != EnumC0422d.scale) {
                    this.f2819m = true;
                }
                c1101m.add(c0415c3);
            }
        }
        this.f2818l = c1101m;
    }

    /* renamed from: a */
    public C0415c m4433a(String str, String str2) {
        int i;
        EnumC0422d enumC0422d;
        if (str2.startsWith("leg") || str2.startsWith("arm")) {
            i = -1;
            if (str.equalsIgnoreCase("x")) {
                enumC0422d = EnumC0422d.legX;
            } else if (str.equalsIgnoreCase("y")) {
                enumC0422d = EnumC0422d.legY;
            } else if (str.equalsIgnoreCase("dir")) {
                enumC0422d = EnumC0422d.legDir;
            } else if (str.equalsIgnoreCase("height")) {
                enumC0422d = EnumC0422d.legHeight;
            } else if (str.equalsIgnoreCase("alpha")) {
                enumC0422d = EnumC0422d.legAlpha;
            } else {
                throw new C0412bm("Unknown leg/arm animation type:" + str + " on animation:" + this.f2804a);
            }
        } else if (str2.startsWith("turret")) {
            i = Integer.parseInt(str2.substring("turret".length())) - 1;
            if (str.equalsIgnoreCase("x")) {
                enumC0422d = EnumC0422d.turretX;
            } else if (str.equalsIgnoreCase("y")) {
                enumC0422d = EnumC0422d.turretY;
            } else {
                throw new C0412bm("Unknown turret animation type:" + str + " on animation:" + this.f2804a);
            }
        } else if (str2.startsWith("body")) {
            i = 0;
            if (str.equalsIgnoreCase("scale")) {
                enumC0422d = EnumC0422d.scale;
            } else if (str.equalsIgnoreCase("frame")) {
                enumC0422d = EnumC0422d.frame;
            } else {
                throw new C0412bm("Unknown body animation type:" + str + " on animation:" + this.f2804a);
            }
        } else if (str2.startsWith("effect")) {
            i = 0;
            enumC0422d = EnumC0422d.event;
            str2 = "event";
        } else {
            throw new C0412bm("Unknown animation target:" + str2 + " on animation:" + this.f2804a);
        }
        Iterator it = this.f2818l.iterator();
        while (it.hasNext()) {
            C0415c c0415c = (C0415c) it.next();
            if (c0415c.f2657a == enumC0422d && str2.equals(c0415c.f2659c)) {
                return c0415c;
            }
        }
        C0415c c0415c2 = new C0415c();
        c0415c2.f2657a = enumC0422d;
        c0415c2.f2658b = i;
        c0415c2.f2659c = str2;
        this.f2818l.add(c0415c2);
        return c0415c2;
    }

    /* renamed from: a */
    public void m4435a(C0453l c0453l, C1072ab c1072ab, String str, String str2, String str3) {
        String[] split;
        String str4 = str3.substring(str2.length()).split("_")[0];
        String substring = str3.substring((str2 + str4 + "_").length());
        try {
            float m682a = C1072ab.m682a(substring, false, str, str3);
            String m662e = c1072ab.m662e(str, str3);
            if (!m662e.startsWith("{") || !m662e.endsWith("}")) {
                throw new C0412bm("Unknown format:" + m662e, str, str3);
            }
            String substring2 = m662e.substring(1, m662e.length() - 1);
            C0415c c0415c = null;
            for (String str5 : substring2.split(",")) {
                String[] split2 = str5.split(":");
                if (split2.length != 2) {
                    throw new C0412bm("Unknown format on part:" + str5 + " of: " + substring2, str, str3);
                }
                String trim = split2[0].trim();
                String trim2 = split2[1].trim();
                C0415c m4433a = m4433a(trim, str4);
                if (c0415c != m4433a) {
                    if (c0415c != null) {
                        c0415c.m4596b();
                    }
                    c0415c = m4433a;
                }
                try {
                    m4433a.m4597a(c0453l, m682a, trim, trim2);
                } catch (C0412bm e) {
                    throw new C0412bm(e.getMessage() + " (as part of key:" + str3 + " section:" + str + ")", e);
                }
            }
            if (c0415c != null) {
                c0415c.m4596b();
            }
        } catch (NumberFormatException e2) {
            throw new C0412bm("Failed to read time:" + substring + " in key:" + str3 + " section:" + str + " expected a float with optional 's' or 'ms' postfix");
        }
    }
}

package com.corrodinggames.rts.game.units.custom.p021e;

import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/d.class */
public class C0437d {

    /* renamed from: a */
    public String f2771a;

    /* renamed from: b */
    public C0428a f2772b;

    /* renamed from: c */
    public float f2773c;

    /* renamed from: d */
    public Integer f2774d;

    /* renamed from: e */
    public boolean f2775e;

    /* renamed from: f */
    public boolean f2776f;

    /* renamed from: g */
    C0385az f2777g;

    /* renamed from: h */
    C0385az f2778h;

    /* renamed from: i */
    boolean f2779i;

    /* renamed from: j */
    boolean f2780j;

    /* renamed from: k */
    public boolean f2781k;

    /* renamed from: l */
    public boolean f2782l;

    /* renamed from: m */
    public boolean f2783m;

    /* renamed from: n */
    public boolean f2784n;

    /* renamed from: o */
    public boolean f2785o;

    /* renamed from: p */
    public EnumC0435b f2786p = EnumC0435b.f2766a;

    /* renamed from: q */
    public int f2787q;

    /* renamed from: r */
    public C0385az f2788r;

    /* renamed from: s */
    public C0385az f2789s;

    /* renamed from: t */
    public String f2790t;

    /* renamed from: u */
    public C0428a f2791u;

    /* renamed from: v */
    public boolean f2792v;

    /* renamed from: w */
    public boolean f2793w;

    /* renamed from: x */
    public String f2794x;

    /* renamed from: y */
    public C0428a f2795y;

    /* renamed from: z */
    public BitmapOrTexture f2796z;

    /* renamed from: A */
    public boolean f2797A;

    public C0437d(boolean z) {
        this.f2776f = z;
    }

    /* renamed from: a */
    public void m5130a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        this.f2771a = str2;
        this.f2777g = C0348af.m5420a(c1072ab, str, "displayName", (String) null);
        this.f2778h = C0348af.m5420a(c1072ab, str, "displayNameShort", (String) null);
        if (this.f2778h == null) {
            this.f2778h = this.f2777g;
        }
        this.f2779i = c1072ab.m700a(str, "displayNameHideWhenIconShownInHUD", (Boolean) false).booleanValue();
        this.f2780j = c1072ab.m700a(str, "displayNameHideWhenIconShownInText", (Boolean) false).booleanValue();
        this.f2782l = c1072ab.m700a(str, "hidden", (Boolean) false).booleanValue();
        this.f2781k = c1072ab.m700a(str, "stackHorizontal", (Boolean) false).booleanValue();
        this.f2773c = c1072ab.m698a(str, "priority", Float.valueOf(0.0f)).floatValue();
        this.f2774d = c1072ab.m696a(str, "displayColor", (Integer) null);
        this.f2775e = c1072ab.m700a(str, "displayColorUseInText", (Boolean) true).booleanValue();
        this.f2783m = c1072ab.m700a(str, "displayWithRounding", (Boolean) true).booleanValue();
        this.f2784n = c1072ab.m700a(str, "displayRoundedDown", (Boolean) false).booleanValue();
        this.f2785o = c1072ab.m700a(str, "displayWhenZero", (Boolean) false).booleanValue();
        this.f2787q = c1072ab.m682b(str, "displayPos", (Integer) 0).intValue();
        this.f2786p = (EnumC0435b) c1072ab.m699a(str, "displayDigitGrouping", EnumC0435b.f2766a, EnumC0435b.class);
        this.f2788r = C0348af.m5420a(c1072ab, str, "displayTextPrefix", (String) null);
        this.f2789s = C0348af.m5420a(c1072ab, str, "displayTextPostfix", (String) null);
        C0385az m5420a = C0348af.m5420a(c1072ab, str, "displayPrefixInHUD", (String) null);
        if (m5420a != null) {
            if (this.f2788r != null) {
                throw new C0412bm("[" + str + "]displayPrefixInHUD and displayTextPrefix are aliases, don't use both");
            }
            this.f2788r = m5420a;
        }
        C0385az m5420a2 = C0348af.m5420a(c1072ab, str, "displayPostfixInHUD", (String) null);
        if (m5420a2 != null) {
            if (this.f2789s != null) {
                throw new C0412bm("[" + str + "]displayPostfixInHUD and displayTextPostfix are aliases, don't use both");
            }
            this.f2789s = m5420a2;
        }
        this.f2790t = c1072ab.m681b(str, "displayTextAppendResource", (String) null);
        String m681b = c1072ab.m681b(str, "appendResourceInHUD", (String) null);
        if (m681b != null) {
            if (this.f2790t != null) {
                throw new C0412bm("[" + str + "]displayTextAppendResource and appendResourceInHUD are aliases, don't use both");
            }
            this.f2790t = m681b;
        }
        this.f2792v = c1072ab.m700a(str, "displayTextAppendResourceWithGap", (Boolean) false).booleanValue();
        this.f2793w = c1072ab.m700a(str, "appendResourceInHUD_whenThisZero", (Boolean) true).booleanValue();
        this.f2796z = c0453l.m4757a(c1072ab, str, "iconImage", true);
        if (this.f2796z != null && (this.f2796z.mo396m() > 100 || this.f2796z.mo397l() > 100)) {
            throw new C0412bm("[" + str + "]iconImage: Image is too big, keep under 100x100");
        }
        this.f2797A = c1072ab.m700a(str, "iconImageUseInText", (Boolean) true).booleanValue();
        if (this.f2779i && this.f2796z == null) {
            throw new C0412bm("[" + str + "]displayNameHideWhenIconShownInHUD: Cannot use without iconImage");
        }
        if (this.f2780j && this.f2796z == null) {
            throw new C0412bm("[" + str + "]displayNameHideWhenIconShownInText: Cannot use without iconImage");
        }
        String str3 = (this.f2776f ? "g_" : "l_") + this.f2771a;
        this.f2772b = C0428a.m5153a(str3, false, this.f2776f);
        if (this.f2772b.f2752s) {
            throw new RuntimeException("Cannot define resource with a built-in name: " + str3);
        }
        if (!this.f2776f) {
            this.f2794x = c1072ab.m681b(str, "equivalentGlobalResourceForAI", (String) null);
        }
    }

    /* renamed from: a */
    public void m5131a(C0453l c0453l) {
        if (this.f2794x != null) {
            this.f2795y = c0453l.m4719k(this.f2794x);
            if (this.f2795y == null) {
                throw new C0412bm("[resource]equivalentGlobalResourceForAI: Failed to find resource: " + this.f2794x);
            }
            if (!this.f2795y.f2751r) {
                throw new C0412bm("[resource]equivalentGlobalResourceForAI: Expected global resource for: " + this.f2794x);
            }
        }
        if (this.f2790t != null) {
            this.f2791u = c0453l.m4719k(this.f2790t);
            if (this.f2791u == null) {
                throw new C0412bm("[resource]displayTextAppendResource: Failed to find resource: " + this.f2790t);
            }
        }
    }
}

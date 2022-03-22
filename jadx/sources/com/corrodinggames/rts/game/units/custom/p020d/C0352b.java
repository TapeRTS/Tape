package com.corrodinggames.rts.game.units.custom.p020d;

import com.corrodinggames.rts.game.units.custom.C0307ac;
import com.corrodinggames.rts.game.units.custom.C0311ag;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/b.class */
public class C0352b {

    /* renamed from: a */
    public String f2360a;

    /* renamed from: b */
    public C0345a f2361b;

    /* renamed from: c */
    public float f2362c;

    /* renamed from: d */
    public Integer f2363d;

    /* renamed from: e */
    public boolean f2364e;

    /* renamed from: f */
    C0311ag f2365f;

    /* renamed from: g */
    C0311ag f2366g;

    /* renamed from: h */
    public boolean f2367h;

    /* renamed from: i */
    public boolean f2368i;

    /* renamed from: j */
    public boolean f2369j;

    /* renamed from: k */
    public boolean f2370k;

    /* renamed from: l */
    public int f2371l;

    /* renamed from: m */
    public String f2372m;

    /* renamed from: n */
    public C0345a f2373n;

    public C0352b(boolean z) {
        this.f2364e = z;
    }

    /* renamed from: a */
    public void m3003a(C0368l lVar, C0809ab abVar, String str, String str2) {
        this.f2360a = str2;
        this.f2365f = C0307ac.m3142a(abVar, str, "displayName", (String) null);
        this.f2366g = C0307ac.m3142a(abVar, str, "displayNameShort", (String) null);
        if (this.f2366g == null) {
            this.f2366g = this.f2365f;
        }
        this.f2367h = abVar.m594a(str, "hidden", (Boolean) false).booleanValue();
        this.f2362c = abVar.m592a(str, "priority", Float.valueOf(0.0f)).floatValue();
        this.f2363d = abVar.m590a(str, "displayColor", (Integer) null);
        this.f2368i = abVar.m594a(str, "displayWithRounding", (Boolean) true).booleanValue();
        this.f2369j = abVar.m594a(str, "displayRoundedDown", (Boolean) false).booleanValue();
        this.f2370k = abVar.m594a(str, "displayWhenZero", (Boolean) false).booleanValue();
        this.f2371l = abVar.m580b(str, "displayPos", (Integer) 0).intValue();
        String str3 = (this.f2364e ? "g_" : "l_") + this.f2360a;
        this.f2361b = C0345a.m3016a(str3, false, this.f2364e);
        if (this.f2361b.f2351h) {
            throw new RuntimeException("Cannot define resource with a built-in name: " + str3);
        } else if (!this.f2364e) {
            this.f2372m = abVar.m579b(str, "equivalentGlobalResourceForAI", (String) null);
        }
    }

    /* renamed from: a */
    public void m3004a(C0368l lVar) {
        if (this.f2372m != null) {
            this.f2373n = lVar.m2753i(this.f2372m);
            if (this.f2373n == null) {
                throw new C0324at("[resource]equivalentGlobalResourceForAI: Failed to find resource: " + this.f2372m);
            } else if (!this.f2373n.f2350g) {
                throw new C0324at("[resource]equivalentGlobalResourceForAI: Expected global resource for: " + this.f2372m);
            }
        }
    }
}

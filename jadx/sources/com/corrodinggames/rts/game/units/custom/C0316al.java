package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.EnumC0174p;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.al */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/al.class */
public final class C0316al {

    /* renamed from: a */
    String f2067a;

    /* renamed from: b */
    C0364h f2068b;

    /* renamed from: c */
    C0365i f2069c;

    /* renamed from: d */
    EnumC0174p f2070d;

    /* renamed from: e */
    float f2071e;

    /* renamed from: f */
    float f2072f;

    /* renamed from: g */
    float f2073g;

    /* renamed from: h */
    float f2074h;

    /* renamed from: i */
    boolean f2075i;

    /* renamed from: j */
    boolean f2076j;

    /* renamed from: k */
    int f2077k;

    /* renamed from: l */
    int f2078l;

    /* renamed from: m */
    boolean f2079m;

    /* renamed from: n */
    boolean f2080n;

    /* renamed from: o */
    C0311ag f2081o;

    /* renamed from: p */
    boolean f2082p;

    /* renamed from: a */
    public boolean m3092a() {
        return this.f2080n || this.f2079m;
    }

    /* renamed from: a */
    public void m3091a(C0368l lVar, C0809ab abVar, String str) {
        this.f2068b = abVar.m596a(str, "anyRuleInGroup", (C0364h) null);
        this.f2069c = abVar.m609a(lVar, str, "searchTags", (C0365i) null);
        this.f2070d = (EnumC0174p) abVar.m593a(str, "searchTeam", EnumC0174p.own, EnumC0174p.class);
        this.f2071e = abVar.m560h(str, "searchDistance");
        this.f2072f = this.f2071e * this.f2071e;
        this.f2073g = abVar.m592a(str, "searchOffsetX", Float.valueOf(0.0f)).floatValue();
        this.f2074h = abVar.m592a(str, "searchOffsetY", Float.valueOf(0.0f)).floatValue();
        this.f2075i = abVar.m594a(str, "excludeIncompleteBuildings", (Boolean) false).booleanValue();
        this.f2076j = abVar.m594a(str, "excludeNonBuildings", (Boolean) false).booleanValue();
        this.f2077k = abVar.m580b(str, "minCount", (Integer) Integer.MIN_VALUE).intValue();
        this.f2078l = abVar.m580b(str, "maxCount", (Integer) Integer.MAX_VALUE).intValue();
        this.f2082p = abVar.m594a(str, "checkEachTile", (Boolean) true).booleanValue();
        this.f2079m = abVar.m594a(str, "aiSuggestionOnly", (Boolean) false).booleanValue();
        this.f2080n = abVar.m594a(str, "blocksPlacement", Boolean.valueOf(!this.f2079m)).booleanValue();
        if (!this.f2079m || !this.f2080n) {
            this.f2081o = C0307ac.m3142a(abVar, str, "cannotPlaceMessage", (String) null);
            return;
        }
        throw new C0324at("[" + str + "]: Cannot use aiSuggestionOnly and blocksPlacement at the same time");
    }
}

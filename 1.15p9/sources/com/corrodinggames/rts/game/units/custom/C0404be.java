package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.be */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/be.class */
public final class C0404be {

    /* renamed from: a */
    String f2497a;

    /* renamed from: b */
    C0448g f2498b;

    /* renamed from: c */
    C0449h f2499c;

    /* renamed from: d */
    EnumC0200q f2500d;

    /* renamed from: e */
    float f2501e;

    /* renamed from: f */
    float f2502f;

    /* renamed from: g */
    float f2503g;

    /* renamed from: h */
    float f2504h;

    /* renamed from: i */
    boolean f2505i;

    /* renamed from: j */
    boolean f2506j;

    /* renamed from: k */
    int f2507k;

    /* renamed from: l */
    int f2508l;

    /* renamed from: m */
    boolean f2509m;

    /* renamed from: n */
    boolean f2510n;

    /* renamed from: o */
    C0385az f2511o;

    /* renamed from: p */
    boolean f2512p;

    /* renamed from: a */
    public boolean m4633a() {
        return this.f2510n || this.f2509m;
    }

    /* renamed from: a */
    public void m4632a(C0453l c0453l, C1072ab c1072ab, String str) {
        this.f2498b = c1072ab.m696a(str, "anyRuleInGroup", (C0448g) null);
        this.f2499c = c1072ab.m714a(c0453l, str, "searchTags", (C0449h) null);
        this.f2500d = (EnumC0200q) c1072ab.m693a(str, "searchTeam", EnumC0200q.own, EnumC0200q.class);
        this.f2501e = c1072ab.m652i(str, "searchDistance");
        this.f2502f = this.f2501e * this.f2501e;
        this.f2503g = c1072ab.m692a(str, "searchOffsetX", Float.valueOf(0.0f)).floatValue();
        this.f2504h = c1072ab.m692a(str, "searchOffsetY", Float.valueOf(0.0f)).floatValue();
        this.f2505i = c1072ab.m694a(str, "excludeIncompleteBuildings", (Boolean) false).booleanValue();
        this.f2506j = c1072ab.m694a(str, "excludeNonBuildings", (Boolean) false).booleanValue();
        this.f2507k = c1072ab.m676b(str, "minCount", (Integer) Integer.MIN_VALUE).intValue();
        this.f2508l = c1072ab.m676b(str, "maxCount", (Integer) Integer.MAX_VALUE).intValue();
        this.f2512p = c1072ab.m694a(str, "checkEachTile", (Boolean) true).booleanValue();
        this.f2509m = c1072ab.m694a(str, "aiSuggestionOnly", (Boolean) false).booleanValue();
        this.f2510n = c1072ab.m694a(str, "blocksPlacement", Boolean.valueOf(!this.f2509m)).booleanValue();
        if (this.f2509m && this.f2510n) {
            throw new C0412bm("[" + str + "]: Cannot use aiSuggestionOnly and blocksPlacement at the same time");
        }
        this.f2511o = C0348af.m4769a(c1072ab, str, "cannotPlaceMessage", (String) null);
    }
}

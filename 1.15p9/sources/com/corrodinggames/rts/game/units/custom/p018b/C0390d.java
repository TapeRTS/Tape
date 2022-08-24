package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/d.class */
public class C0390d implements Comparable {

    /* renamed from: b */
    boolean f2337b;

    /* renamed from: c */
    boolean f2338c;

    /* renamed from: d */
    boolean f2339d;

    /* renamed from: e */
    boolean f2340e;

    /* renamed from: f */
    boolean f2341f;

    /* renamed from: h */
    boolean f2342h;

    /* renamed from: i */
    public float f2343i;

    /* renamed from: j */
    public boolean f2344j;

    /* renamed from: k */
    public boolean f2345k;

    /* renamed from: l */
    public boolean f2346l;

    /* renamed from: m */
    public boolean f2347m;

    /* renamed from: p */
    public boolean f2348p;

    /* renamed from: q */
    public LogicBoolean f2349q;

    /* renamed from: r */
    public LogicBoolean f2350r;

    /* renamed from: s */
    public LogicBoolean f2351s;

    /* renamed from: t */
    public boolean f2352t;

    /* renamed from: u */
    public C0391e f2353u;

    /* renamed from: v */
    public C0391e[] f2354v;

    /* renamed from: w */
    public float f2355w;

    /* renamed from: x */
    public int f2356x;

    /* renamed from: y */
    public boolean f2357y;

    /* renamed from: z */
    LogicBoolean f2358z;

    /* renamed from: A */
    LogicBoolean f2359A;

    /* renamed from: B */
    public C0934e f2360B;

    /* renamed from: C */
    public float f2361C;

    /* renamed from: D */
    public float f2362D;

    /* renamed from: E */
    public LogicBoolean f2363E;

    /* renamed from: F */
    public EnumC0392f f2364F;

    /* renamed from: G */
    public float f2365G;

    /* renamed from: H */
    public boolean f2366H;

    /* renamed from: L */
    public boolean f2367L;

    /* renamed from: M */
    public LogicBoolean f2368M;

    /* renamed from: N */
    public int f2369N;

    /* renamed from: O */
    public int f2370O;

    /* renamed from: P */
    public float f2371P;

    /* renamed from: Q */
    public float f2372Q;

    /* renamed from: R */
    public float f2373R;

    /* renamed from: S */
    public float f2374S;

    /* renamed from: T */
    public float f2375T;

    /* renamed from: U */
    public float f2376U;

    /* renamed from: V */
    public LogicBoolean f2377V;

    /* renamed from: W */
    public LogicBoolean f2378W;

    /* renamed from: X */
    public boolean f2379X;

    /* renamed from: Y */
    public boolean f2380Y;

    /* renamed from: Z */
    public float f2381Z;

    /* renamed from: aa */
    public float f2382aa;

    /* renamed from: ab */
    public LogicBoolean f2383ab;

    /* renamed from: ac */
    public LogicBoolean f2384ac;

    /* renamed from: ae */
    public boolean f2385ae;

    /* renamed from: ag */
    public C0930ag f2386ag;

    /* renamed from: ah */
    public LogicBoolean f2387ah;

    /* renamed from: a */
    boolean f2388a = false;

    /* renamed from: g */
    EnumC0200q f2389g = EnumC0200q.any;

    /* renamed from: n */
    public int f2390n = -1;

    /* renamed from: o */
    public float f2391o = 1.0f;

    /* renamed from: I */
    public int f2392I = -1;

    /* renamed from: J */
    public int f2393J = -1;

    /* renamed from: K */
    public int f2394K = -1;

    /* renamed from: ad */
    public int f2395ad = -1;

    /* renamed from: af */
    public int f2396af = -1;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int mo4666a(C0390d c0390d) {
        if (c0390d == null) {
            return 0;
        }
        float f = this.f2365G - c0390d.f2365G;
        if (f < 0.0f) {
            return -1;
        }
        return f > 0.0f ? 1 : 0;
    }
}

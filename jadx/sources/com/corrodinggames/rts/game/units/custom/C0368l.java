package com.corrodinggames.rts.game.units.custom;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.EnumC0172n;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0269am;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0272b;
import com.corrodinggames.rts.game.units.EnumC0519u;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.custom.p016a.C0304f;
import com.corrodinggames.rts.game.units.custom.p018b.AbstractC0328a;
import com.corrodinggames.rts.game.units.custom.p018b.C0336i;
import com.corrodinggames.rts.game.units.custom.p019c.C0338a;
import com.corrodinggames.rts.game.units.custom.p020d.C0345a;
import com.corrodinggames.rts.game.units.custom.p020d.C0352b;
import com.corrodinggames.rts.game.units.custom.p020d.C0354d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.C0204z;
import com.corrodinggames.rts.game.units.p025e.C0441i;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p035f.C0657b;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0812ae;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/l.class */
public final class C0368l implements AbstractC0268al {

    /* renamed from: b */
    public static C0368l f2483b;

    /* renamed from: p */
    public boolean f2484p;

    /* renamed from: q */
    public boolean f2485q;

    /* renamed from: r */
    public boolean f2486r;

    /* renamed from: s */
    public boolean f2487s;

    /* renamed from: t */
    public boolean f2488t;

    /* renamed from: u */
    public boolean f2489u;

    /* renamed from: v */
    public boolean f2490v;

    /* renamed from: w */
    public Rect f2491w;

    /* renamed from: x */
    public String f2492x;

    /* renamed from: y */
    public String f2493y;

    /* renamed from: A */
    public int f2494A;

    /* renamed from: B */
    public C0657b f2495B;

    /* renamed from: C */
    public String f2496C;

    /* renamed from: D */
    public String f2497D;

    /* renamed from: E */
    public String f2498E;

    /* renamed from: G */
    public C0365i f2499G;

    /* renamed from: H */
    public C0365i f2500H;

    /* renamed from: I */
    public String f2501I;

    /* renamed from: J */
    public int f2502J;

    /* renamed from: K */
    public EnumC0383z f2503K;

    /* renamed from: P */
    public int f2504P;

    /* renamed from: Q */
    public LogicBoolean f2505Q;

    /* renamed from: R */
    public boolean f2506R;

    /* renamed from: S */
    public boolean f2507S;

    /* renamed from: T */
    public boolean f2508T;

    /* renamed from: U */
    public EnumC0172n f2509U;

    /* renamed from: W */
    public int f2510W;

    /* renamed from: X */
    public int f2511X;

    /* renamed from: Y */
    public int f2512Y;

    /* renamed from: Z */
    public int f2513Z;

    /* renamed from: ab */
    public boolean f2514ab;

    /* renamed from: af */
    public boolean f2515af;

    /* renamed from: ah */
    public C0748e[] f2516ah;

    /* renamed from: al */
    public C0748e f2517al;

    /* renamed from: aq */
    public boolean f2518aq;

    /* renamed from: ar */
    public C0311ag f2519ar;

    /* renamed from: as */
    public C0311ag f2520as;

    /* renamed from: at */
    public String f2521at;

    /* renamed from: au */
    public boolean f2522au;

    /* renamed from: aw */
    public boolean f2523aw;

    /* renamed from: ax */
    public boolean f2524ax;

    /* renamed from: ay */
    public boolean f2525ay;

    /* renamed from: az */
    public boolean f2526az;

    /* renamed from: aA */
    public float f2527aA;

    /* renamed from: aB */
    public boolean f2528aB;

    /* renamed from: aC */
    public boolean f2529aC;

    /* renamed from: aD */
    public boolean f2530aD;

    /* renamed from: aE */
    public boolean f2531aE;

    /* renamed from: aF */
    public boolean f2532aF;

    /* renamed from: aG */
    public boolean f2533aG;

    /* renamed from: aH */
    public C0365i f2534aH;

    /* renamed from: aI */
    public boolean f2535aI;

    /* renamed from: aJ */
    public boolean f2536aJ;

    /* renamed from: aK */
    public boolean f2537aK;

    /* renamed from: aL */
    public boolean f2538aL;

    /* renamed from: aM */
    public int f2539aM;

    /* renamed from: aO */
    public boolean f2540aO;

    /* renamed from: aQ */
    public boolean f2541aQ;

    /* renamed from: aR */
    public float f2542aR;

    /* renamed from: aS */
    public float f2543aS;

    /* renamed from: aT */
    public float f2544aT;

    /* renamed from: aU */
    public boolean f2545aU;

    /* renamed from: aV */
    public float f2546aV;

    /* renamed from: aW */
    public float f2547aW;

    /* renamed from: aX */
    public boolean f2548aX;

    /* renamed from: aY */
    public boolean f2549aY;

    /* renamed from: aZ */
    public boolean f2550aZ;

    /* renamed from: ba */
    public boolean f2551ba;

    /* renamed from: bb */
    public int f2552bb;

    /* renamed from: bc */
    public boolean f2553bc;

    /* renamed from: bd */
    public float f2554bd;

    /* renamed from: be */
    public float f2555be;

    /* renamed from: bf */
    public int f2556bf;

    /* renamed from: bg */
    public boolean f2557bg;

    /* renamed from: bh */
    public boolean f2558bh;

    /* renamed from: bi */
    public EnumC0519u f2559bi;

    /* renamed from: bj */
    public boolean f2560bj;

    /* renamed from: bk */
    public boolean f2561bk;

    /* renamed from: bl */
    public C0381x f2562bl;

    /* renamed from: bm */
    public C0381x f2563bm;

    /* renamed from: bn */
    public C0381x f2564bn;

    /* renamed from: bo */
    public C0321aq f2565bo;

    /* renamed from: br */
    public C0325au f2566br;

    /* renamed from: bs */
    public boolean f2567bs;

    /* renamed from: bt */
    public boolean f2568bt;

    /* renamed from: bu */
    public boolean f2569bu;

    /* renamed from: bv */
    public boolean f2570bv;

    /* renamed from: by */
    boolean f2571by;

    /* renamed from: bz */
    boolean f2572bz;

    /* renamed from: bA */
    boolean f2573bA;

    /* renamed from: bB */
    boolean f2574bB;

    /* renamed from: bC */
    boolean f2575bC;

    /* renamed from: bD */
    C0381x f2576bD;

    /* renamed from: bE */
    C0381x f2577bE;

    /* renamed from: bF */
    boolean f2578bF;

    /* renamed from: bG */
    float f2579bG;

    /* renamed from: bH */
    boolean f2580bH;

    /* renamed from: bI */
    float f2581bI;

    /* renamed from: bJ */
    C0381x f2582bJ;

    /* renamed from: bK */
    C0381x f2583bK;

    /* renamed from: bL */
    boolean f2584bL;

    /* renamed from: bM */
    float f2585bM;

    /* renamed from: bN */
    C0381x f2586bN;

    /* renamed from: bO */
    C0381x f2587bO;

    /* renamed from: bQ */
    public int f2588bQ;

    /* renamed from: bR */
    public boolean f2589bR;

    /* renamed from: bS */
    public boolean f2590bS;

    /* renamed from: bT */
    public boolean f2591bT;

    /* renamed from: bU */
    public C0363g f2592bU;

    /* renamed from: bV */
    public C0363g f2593bV;

    /* renamed from: bX */
    public int f2594bX;

    /* renamed from: bY */
    public boolean f2595bY;

    /* renamed from: cc */
    public int f2596cc;

    /* renamed from: cd */
    public float f2597cd;

    /* renamed from: cf */
    public LogicBoolean f2598cf;

    /* renamed from: cg */
    public boolean f2599cg;

    /* renamed from: ch */
    public boolean f2600ch;

    /* renamed from: ci */
    public boolean f2601ci;

    /* renamed from: cj */
    public boolean f2602cj;

    /* renamed from: ck */
    public boolean f2603ck;

    /* renamed from: cl */
    public boolean f2604cl;

    /* renamed from: cm */
    public float f2605cm;

    /* renamed from: cn */
    public int f2606cn;

    /* renamed from: co */
    public C0365i f2607co;

    /* renamed from: cq */
    public float f2608cq;

    /* renamed from: cr */
    public float f2609cr;

    /* renamed from: cs */
    public int f2610cs;

    /* renamed from: ct */
    public int f2611ct;

    /* renamed from: cu */
    public boolean f2612cu;

    /* renamed from: cv */
    public float f2613cv;

    /* renamed from: cw */
    public float f2614cw;

    /* renamed from: cx */
    public float f2615cx;

    /* renamed from: cy */
    public float f2616cy;

    /* renamed from: cz */
    public boolean f2617cz;

    /* renamed from: cA */
    public float f2618cA;

    /* renamed from: cB */
    public float f2619cB;

    /* renamed from: cC */
    public boolean f2620cC;

    /* renamed from: cD */
    public float f2621cD;

    /* renamed from: cE */
    public C0311ag f2622cE;

    /* renamed from: cF */
    public boolean f2623cF;

    /* renamed from: cG */
    public float f2624cG;

    /* renamed from: cH */
    public int f2625cH;

    /* renamed from: cL */
    public float f2626cL;

    /* renamed from: cM */
    public float f2627cM;

    /* renamed from: cN */
    public boolean f2628cN;

    /* renamed from: cO */
    public int f2629cO;

    /* renamed from: cP */
    public float f2630cP;

    /* renamed from: cQ */
    public int f2631cQ;

    /* renamed from: cR */
    public int f2632cR;

    /* renamed from: cS */
    public int f2633cS;

    /* renamed from: cT */
    public int f2634cT;

    /* renamed from: cU */
    public float f2635cU;

    /* renamed from: cV */
    public float f2636cV;

    /* renamed from: cW */
    public Float f2637cW;

    /* renamed from: cX */
    public float f2638cX;

    /* renamed from: cY */
    public boolean f2639cY;

    /* renamed from: cZ */
    public Float f2640cZ;

    /* renamed from: da */
    public C0321aq f2641da;

    /* renamed from: db */
    public C0321aq f2642db;

    /* renamed from: dc */
    public C0321aq f2643dc;

    /* renamed from: dh */
    C0362f f2644dh;

    /* renamed from: di */
    C0362f f2645di;

    /* renamed from: dj */
    C0362f f2646dj;

    /* renamed from: dk */
    C0362f f2647dk;

    /* renamed from: dl */
    C0362f f2648dl;

    /* renamed from: dm */
    C0362f f2649dm;

    /* renamed from: dn */
    public boolean f2650dn;

    /* renamed from: do */
    public boolean f2651do;

    /* renamed from: dp */
    public boolean f2652dp;

    /* renamed from: dq */
    public boolean f2653dq;

    /* renamed from: dr */
    public C0323as f2654dr;

    /* renamed from: ds */
    public float f2655ds;

    /* renamed from: dt */
    C0370m f2656dt;

    /* renamed from: du */
    public float f2657du;

    /* renamed from: dv */
    public float f2658dv;

    /* renamed from: dw */
    public Boolean f2659dw;

    /* renamed from: dx */
    public boolean f2660dx;

    /* renamed from: dy */
    public float f2661dy;

    /* renamed from: dz */
    public float f2662dz;

    /* renamed from: dA */
    public float f2663dA;

    /* renamed from: dB */
    public float f2664dB;

    /* renamed from: dC */
    public boolean f2665dC;

    /* renamed from: dD */
    public boolean f2666dD;

    /* renamed from: dE */
    public boolean f2667dE;

    /* renamed from: dG */
    public float f2668dG;

    /* renamed from: dH */
    public float f2669dH;

    /* renamed from: dL */
    public float f2670dL;

    /* renamed from: dM */
    public boolean f2671dM;

    /* renamed from: dN */
    public boolean f2672dN;

    /* renamed from: dO */
    public int f2673dO;

    /* renamed from: dP */
    public float f2674dP;

    /* renamed from: dQ */
    public float f2675dQ;

    /* renamed from: dR */
    public EnumC0272b f2676dR;

    /* renamed from: dS */
    public float f2677dS;

    /* renamed from: dT */
    public float f2678dT;

    /* renamed from: dU */
    public boolean f2679dU;

    /* renamed from: dV */
    public boolean f2680dV;

    /* renamed from: dW */
    public boolean f2681dW;

    /* renamed from: dX */
    public boolean f2682dX;

    /* renamed from: dY */
    public float f2683dY;

    /* renamed from: dZ */
    public float f2684dZ;

    /* renamed from: ea */
    public float f2685ea;

    /* renamed from: ed */
    public float f2686ed;

    /* renamed from: ee */
    public boolean f2687ee;

    /* renamed from: ef */
    public LogicBoolean f2688ef;

    /* renamed from: eg */
    public LogicBoolean f2689eg;

    /* renamed from: eh */
    public LogicBoolean f2690eh;

    /* renamed from: ei */
    public LogicBoolean f2691ei;

    /* renamed from: ej */
    public boolean f2692ej;

    /* renamed from: ek */
    public C0365i f2693ek;

    /* renamed from: el */
    public C0365i f2694el;

    /* renamed from: em */
    public boolean f2695em;

    /* renamed from: en */
    public boolean f2696en;

    /* renamed from: eo */
    public float f2697eo;

    /* renamed from: ep */
    public boolean f2698ep;

    /* renamed from: eq */
    public int f2699eq;

    /* renamed from: er */
    public boolean f2700er;

    /* renamed from: es */
    public boolean f2701es;

    /* renamed from: et */
    public boolean f2702et;

    /* renamed from: eu */
    public boolean f2703eu;

    /* renamed from: ev */
    public float f2704ev;

    /* renamed from: ew */
    public boolean f2705ew;

    /* renamed from: ex */
    public boolean f2706ex;

    /* renamed from: eC */
    public float f2707eC;

    /* renamed from: eD */
    public boolean f2708eD;

    /* renamed from: eE */
    public C0365i f2709eE;

    /* renamed from: eG */
    public boolean f2710eG;

    /* renamed from: eH */
    public boolean f2711eH;

    /* renamed from: eI */
    public boolean f2712eI;

    /* renamed from: eJ */
    public LogicBoolean f2713eJ;

    /* renamed from: eK */
    public LogicBoolean f2714eK;

    /* renamed from: eL */
    public LogicBoolean f2715eL;

    /* renamed from: eM */
    public boolean f2716eM;

    /* renamed from: eN */
    public float f2717eN;

    /* renamed from: eR */
    public LogicBoolean f2718eR;

    /* renamed from: eS */
    public LogicBoolean f2719eS;

    /* renamed from: eU */
    public C0314aj f2720eU;

    /* renamed from: eV */
    public EnumC0212ah f2721eV;

    /* renamed from: eW */
    public EnumC0212ah f2722eW;

    /* renamed from: eX */
    public boolean f2723eX;

    /* renamed from: eY */
    public boolean f2724eY;

    /* renamed from: eZ */
    public boolean f2725eZ;

    /* renamed from: fa */
    public C0365i f2726fa;

    /* renamed from: fb */
    public int f2727fb;

    /* renamed from: fc */
    public C0365i f2728fc;

    /* renamed from: fd */
    public C0365i f2729fd;

    /* renamed from: fe */
    public boolean f2730fe;

    /* renamed from: ff */
    public boolean f2731ff;

    /* renamed from: fg */
    public boolean f2732fg;

    /* renamed from: fh */
    public boolean f2733fh;

    /* renamed from: fi */
    public boolean f2734fi;

    /* renamed from: fj */
    public boolean f2735fj;

    /* renamed from: fk */
    public boolean f2736fk;

    /* renamed from: fl */
    public int f2737fl;

    /* renamed from: fm */
    public int f2738fm;

    /* renamed from: fn */
    public float f2739fn;

    /* renamed from: fo */
    public int f2740fo;

    /* renamed from: fp */
    public float f2741fp;

    /* renamed from: fq */
    public float f2742fq;

    /* renamed from: fr */
    public float f2743fr;

    /* renamed from: fs */
    public int f2744fs;

    /* renamed from: ft */
    public int f2745ft;

    /* renamed from: fu */
    public boolean f2746fu;

    /* renamed from: fv */
    public C0365i f2747fv;

    /* renamed from: fw */
    public String f2748fw;

    /* renamed from: fx */
    public boolean f2749fx;

    /* renamed from: fA */
    public boolean f2750fA;

    /* renamed from: fB */
    public boolean f2751fB;

    /* renamed from: fC */
    public C0365i f2752fC;

    /* renamed from: fD */
    public boolean f2753fD;

    /* renamed from: fF */
    public C0317am[] f2754fF;

    /* renamed from: fL */
    C0375r[] f2755fL;

    /* renamed from: fS */
    public boolean f2756fS;

    /* renamed from: fU */
    String f2757fU;

    /* renamed from: fV */
    String f2758fV;

    /* renamed from: fW */
    HashMap f2759fW;

    /* renamed from: fX */
    C0269am[] f2760fX;

    /* renamed from: gb */
    public boolean f2761gb;

    /* renamed from: gc */
    public boolean f2762gc;

    /* renamed from: a */
    public static final Rect f2763a = new Rect();

    /* renamed from: c */
    public static final ArrayList f2764c = new ArrayList();

    /* renamed from: d */
    public static ArrayList f2765d = new ArrayList();

    /* renamed from: e */
    public static ArrayList f2766e = null;

    /* renamed from: f */
    public static final HashMap f2767f = new HashMap();

    /* renamed from: g */
    public static ArrayList f2768g = new ArrayList();

    /* renamed from: eP */
    public static LogicBoolean f2769eP = LogicBoolean.create(null, "if not self.isOverLiquid() and not self.isMoving()");

    /* renamed from: eQ */
    public static LogicBoolean f2770eQ = LogicBoolean.create(null, "if not self.isOverLiquid()");

    /* renamed from: fO */
    static final C0308ad[] f2771fO = new C0308ad[0];

    /* renamed from: fP */
    static final C0308ad[] f2772fP = new C0308ad[0];

    /* renamed from: h */
    public final C0835m f2773h = new C0835m();

    /* renamed from: i */
    public final C0835m f2774i = new C0835m();

    /* renamed from: j */
    final C0835m f2775j = new C0835m();

    /* renamed from: k */
    public final C0835m f2776k = new C0835m();

    /* renamed from: l */
    public final C0835m f2777l = new C0835m();

    /* renamed from: m */
    public final C0835m f2778m = new C0835m();

    /* renamed from: n */
    public final C0835m f2779n = new C0835m();

    /* renamed from: o */
    final C0835m f2780o = new C0835m();

    /* renamed from: z */
    public boolean f2781z = true;

    /* renamed from: F */
    public C0835m f2782F = new C0835m();

    /* renamed from: L */
    public int f2783L = 1;

    /* renamed from: M */
    public int f2784M = Integer.MAX_VALUE;

    /* renamed from: N */
    public int f2785N = -1;

    /* renamed from: O */
    public int f2786O = -1;

    /* renamed from: V */
    public C0748e f2787V = null;

    /* renamed from: aa */
    public C0748e f2788aa = null;

    /* renamed from: ac */
    public C0748e f2789ac = null;

    /* renamed from: ad */
    public C0748e f2790ad = null;

    /* renamed from: ae */
    public C0748e f2791ae = null;

    /* renamed from: ag */
    public C0748e[] f2792ag = new C0748e[10];

    /* renamed from: ai */
    public C0748e[] f2793ai = null;

    /* renamed from: aj */
    public C0748e f2794aj = null;

    /* renamed from: ak */
    public boolean f2795ak = false;

    /* renamed from: am */
    public C0310af[] f2796am = null;

    /* renamed from: an */
    public boolean f2797an = false;

    /* renamed from: ao */
    public boolean f2798ao = false;

    /* renamed from: ap */
    public final C0835m f2799ap = new C0835m();

    /* renamed from: av */
    public float f2800av = 1.0f;

    /* renamed from: aN */
    public int f2801aN = -1;

    /* renamed from: aP */
    public int f2802aP = -1;

    /* renamed from: bp */
    public int f2803bp = -1;

    /* renamed from: bq */
    public int f2804bq = -1;

    /* renamed from: bw */
    public float f2805bw = 1.0f;

    /* renamed from: bx */
    public float f2806bx = 1.0f;

    /* renamed from: bP */
    public float f2807bP = 60.0f;

    /* renamed from: bW */
    public float f2808bW = 0.001f;

    /* renamed from: bZ */
    public C0363g f2809bZ = C0363g.f2422a;

    /* renamed from: ca */
    public C0354d f2810ca = C0354d.f2376a;

    /* renamed from: cb */
    public C0354d f2811cb = C0354d.f2376a;

    /* renamed from: ce */
    public C0363g f2812ce = C0363g.f2422a;

    /* renamed from: cp */
    public int f2813cp = -2;

    /* renamed from: cI */
    public Rect f2814cI = new Rect();

    /* renamed from: cJ */
    public Rect f2815cJ = new Rect();

    /* renamed from: cK */
    public Rect f2816cK = new Rect();

    /* renamed from: dd */
    C0835m f2817dd = new C0835m();

    /* renamed from: de */
    C0362f f2818de = new C0362f("moving");

    /* renamed from: df */
    C0362f f2819df = new C0362f("idle");

    /* renamed from: dg */
    C0362f f2820dg = new C0362f("attack");

    /* renamed from: dF */
    public float f2821dF = 0.0f;

    /* renamed from: dI */
    public float f2822dI = -1.0f;

    /* renamed from: dJ */
    public float f2823dJ = 0.03f;

    /* renamed from: dK */
    public float f2824dK = 0.06f;

    /* renamed from: eb */
    public int f2825eb = -1;

    /* renamed from: ec */
    public int f2826ec = -1;

    /* renamed from: ey */
    public boolean f2827ey = false;

    /* renamed from: ez */
    public boolean f2828ez = false;

    /* renamed from: eA */
    public boolean f2829eA = false;

    /* renamed from: eB */
    public int f2830eB = 0;

    /* renamed from: eF */
    public C0835m f2831eF = new C0835m();

    /* renamed from: eO */
    public int f2832eO = 1;

    /* renamed from: eT */
    public boolean f2833eT = true;

    /* renamed from: fy */
    public float f2834fy = -1.0f;

    /* renamed from: fz */
    public C0835m f2835fz = new C0835m();

    /* renamed from: fE */
    public C0323as[] f2836fE = null;

    /* renamed from: fG */
    ArrayList f2837fG = new ArrayList();

    /* renamed from: fH */
    ArrayList f2838fH = new ArrayList();

    /* renamed from: fI */
    boolean f2839fI = false;

    /* renamed from: fJ */
    C0323as f2840fJ = null;

    /* renamed from: fK */
    C0835m f2841fK = new C0835m();

    /* renamed from: fM */
    ArrayList f2842fM = new ArrayList();

    /* renamed from: fN */
    ArrayList f2843fN = new ArrayList();

    /* renamed from: fQ */
    ArrayList f2844fQ = new ArrayList();

    /* renamed from: fR */
    ArrayList f2845fR = new ArrayList();

    /* renamed from: fT */
    int f2846fT = -1;

    /* renamed from: fY */
    C0204z f2847fY = new C0204z(this);

    /* renamed from: fZ */
    C0835m f2848fZ = new C0835m();

    /* renamed from: ga */
    C0835m f2849ga = new C0835m();

    /* renamed from: gd */
    C0835m f2850gd = new C0835m();

    /* renamed from: b */
    public String m2939b() {
        String str = this.f2492x;
        if (this.f2495B != null) {
            String str2 = this.f2495B.f4616f;
            if (str.startsWith(str2)) {
                str = str.substring(str2.length());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (str.startsWith("\\")) {
                    str = str.substring(1);
                }
            }
            str = str + " (in mod " + this.f2495B.m1441a() + ")";
        }
        return str;
    }

    /* renamed from: a */
    public C0372o m2946a(String str, C0372o oVar) {
        if (str != null) {
            C0372o oVar2 = new C0372o(this);
            oVar2.f2866a = str;
            oVar2.m2891a();
            return oVar2;
        } else if (oVar == null) {
            return null;
        } else {
            C0372o oVar3 = new C0372o(this);
            oVar3.f2866a = oVar.f2866a;
            oVar3.m2891a();
            return oVar3;
        }
    }

    /* renamed from: a */
    C0362f m2953a(EnumC0371n nVar, C0362f fVar, boolean z) {
        C0362f a = m2954a(nVar);
        if (a == null) {
            return fVar;
        }
        if (!z || fVar == null || !fVar.m3162a()) {
            return a;
        }
        throw new C0324at("Cannot define animation " + nVar.name() + " on graphics and with onAction at same time");
    }

    /* renamed from: a */
    C0362f m2954a(EnumC0371n nVar) {
        Iterator it = this.f2817dd.iterator();
        while (it.hasNext()) {
            C0362f fVar = (C0362f) it.next();
            if (fVar.m3158a(nVar)) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0381x m2945a(String str, C0381x xVar) {
        if (str == null && xVar != null) {
            return xVar;
        }
        C0381x xVar2 = new C0381x(this, str);
        xVar2.m2873c();
        return xVar2;
    }

    /* renamed from: a */
    public C0381x m2947a(String str) {
        return new C0381x(this, str);
    }

    /* renamed from: b */
    public C0308ad m2936b(String str) {
        boolean z = false;
        if (str.toUpperCase().startsWith("CUSTOM:")) {
            str = str.substring("CUSTOM:".length());
            z = true;
        }
        if (str.toUpperCase().startsWith("CUSTOM|")) {
            str = str.substring("CUSTOM|".length());
            z = true;
        }
        if (z) {
            Iterator it = this.f2843fN.iterator();
            while (it.hasNext()) {
                C0308ad adVar = (C0308ad) it.next();
                if (str.equalsIgnoreCase(adVar.name)) {
                    return adVar;
                }
            }
            throw new C0324at("Failed to find custom effect with the name:" + str);
        } else if (str.contains(":")) {
            throw new C0324at("Unknown effect format:" + str + " expected built-in effect or CUSTOM:");
        } else if ("small".equalsIgnoreCase(str)) {
            return new C0308ad(EnumC0309ae.f1999a);
        } else {
            if ("medium".equalsIgnoreCase(str)) {
                return new C0308ad(EnumC0309ae.f2000b);
            }
            if ("large".equalsIgnoreCase(str)) {
                return new C0308ad(EnumC0309ae.f2001c);
            }
            if ("smoke".equalsIgnoreCase(str)) {
                return new C0308ad(EnumC0309ae.f2002d);
            }
            if ("shockwave".equalsIgnoreCase(str)) {
                return new C0308ad(EnumC0309ae.f2003e);
            }
            if ("largeExplosion".equalsIgnoreCase(str)) {
                return new C0308ad(EnumC0309ae.f2004f);
            }
            if ("smallExplosion".equalsIgnoreCase(str)) {
                return new C0308ad(EnumC0309ae.f2005g);
            }
            if ("resourcePoolSmoke".equalsIgnoreCase(str)) {
                return new C0308ad(EnumC0309ae.f2006h);
            }
            if ("none".equalsIgnoreCase(str)) {
                return new C0308ad(EnumC0309ae.f2007i);
            }
            throw new C0324at("Failed to find built-in effect with the name:" + str);
        }
    }

    /* renamed from: B */
    public boolean mo3506B() {
        return this.f2589bR;
    }

    /* renamed from: w */
    public boolean mo3483w() {
        if (this.f2591bT) {
            AbstractC0789l u = AbstractC0789l.m651u();
            if (u.m766H() && u.f5486bF.f4763aH.f4818i) {
                return true;
            }
        }
        return this.f2590bS;
    }

    /* renamed from: c */
    public int mo3501c() {
        return this.f2592bU.m3156a();
    }

    /* renamed from: u */
    public C0363g mo3485u() {
        return this.f2592bU;
    }

    /* renamed from: d */
    public C0363g mo3499d(int i) {
        return this.f2592bU;
    }

    /* renamed from: C */
    public float mo3505C() {
        return this.f2808bW;
    }

    /* renamed from: g */
    public int mo3496g() {
        return this.f2594bX;
    }

    /* renamed from: a */
    public AbstractC0210af mo3504a() {
        return m2940a(false, this);
    }

    /* renamed from: a */
    public AbstractC0210af m2941a(boolean z) {
        return m2940a(z, this);
    }

    /* renamed from: e */
    public String mo3498e() {
        if (this.f2846fT != C0652a.f4581c || this.f2757fU == null) {
            this.f2846fT = C0652a.f4581c;
            String b = this.f2519ar != null ? this.f2519ar.m3314b() : this.f2498E;
            String str = this.f2498E;
            if (this.f2521at != null) {
                str = this.f2521at;
            }
            this.f2757fU = C0652a.m1592a("units." + str + ".name", b, new Object[0]);
        }
        return this.f2757fU;
    }

    /* renamed from: f */
    public String mo3497f() {
        if (this.f2846fT != C0652a.f4581c || this.f2758fV == null) {
            this.f2846fT = C0652a.f4581c;
            String b = this.f2520as != null ? this.f2520as.m3314b() : this.f2498E;
            String str = this.f2498E;
            if (this.f2521at != null) {
                str = this.f2521at;
            }
            this.f2758fV = C0652a.m1592a("units." + str + ".description", b, new Object[0]);
        }
        return this.f2758fV;
    }

    /* renamed from: j */
    public boolean mo3493j() {
        return this.f2523aw;
    }

    /* renamed from: k */
    public boolean mo3492k() {
        return this.f2524ax;
    }

    /* renamed from: m */
    public boolean mo3490m() {
        return this.f2731ff;
    }

    /* renamed from: n */
    public boolean mo3489n() {
        return this.f2732fg;
    }

    /* renamed from: l */
    public boolean mo3491l() {
        return this.f2730fe;
    }

    /* renamed from: o */
    public EnumC0212ah mo3488o() {
        return this.f2721eV;
    }

    /* renamed from: p */
    public boolean mo3487p() {
        return this.f2525ay;
    }

    /* renamed from: q */
    public C0314aj mo3486q() {
        return this.f2720eU;
    }

    /* renamed from: a */
    public void m2942a(ArrayList arrayList, int i) {
        if (this.f2830eB != 0 && this.f2712eI) {
            arrayList.add(C0441i.f3178i);
            arrayList.add(C0441i.f3179j);
        }
    }

    /* renamed from: h */
    public void mo3495h() {
        this.f2759fW = null;
        this.f2760fX = new C0269am[3];
        for (int i = 1; i <= 3; i++) {
            C0269am amVar = new C0269am();
            m2942a(amVar.f1644a, i);
            this.f2760fX[i - 1] = amVar;
        }
    }

    /* renamed from: a */
    public ArrayList mo3503a(int i) {
        if (this.f2760fX != null) {
            return this.f2760fX[i - 1].f1644a;
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        throw new RuntimeException("specialActionLists==null for:" + this.f2498E + " t:" + i + " networked:" + u.m767G() + " replay:" + u.f5490bJ.m1995h() + " sandbox:" + u.f5465be + " active: " + f2765d.contains(this));
    }

    /* renamed from: r */
    public void m2903r() {
        ArrayList a = mo3503a(this.f2594bX);
        if (a.size() > 4) {
            this.f2759fW = new HashMap();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                AbstractC0197s sVar = (AbstractC0197s) a.get(i);
                if (this.f2759fW.get(sVar.m3690J()) == null) {
                    this.f2759fW.put(sVar.m3690J(), sVar);
                }
            }
        }
    }

    /* renamed from: a */
    public AbstractC0197s m2962a(C0181c cVar) {
        if (this.f2759fW != null) {
            return (AbstractC0197s) this.f2759fW.get(cVar);
        }
        ArrayList a = mo3503a(this.f2594bX);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0197s sVar = (AbstractC0197s) a.get(i);
            if (sVar.m3682d(cVar)) {
                return sVar;
            }
        }
        return null;
    }

    /* renamed from: i */
    public String mo3494i() {
        return this.f2498E;
    }

    /* renamed from: v */
    public String mo3484v() {
        return this.f2498E;
    }

    /* renamed from: d */
    public C0204z mo3500d() {
        return this.f2847fY;
    }

    /* renamed from: a */
    public C0377t m2944a(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        C0377t tVar = new C0377t();
        tVar.f2882a = str2;
        tVar.f2883b = str3;
        tVar.f2884c = str;
        this.f2780o.add(tVar);
        return tVar;
    }

    /* renamed from: b */
    public C0379v m2935b(String str, String str2, String str3) {
        C0379v vVar = new C0379v();
        vVar.f2882a = str2;
        vVar.f2883b = str3;
        vVar.f2884c = "(known unit:)" + mo3494i();
        vVar.f2885d = this;
        vVar.f2886e = true;
        vVar.f2887f = str;
        this.f2780o.add(vVar);
        return vVar;
    }

    /* renamed from: c */
    public C0376s m2931c(String str, String str2, String str3) {
        if (str == null || str.trim().equals("")) {
            return null;
        }
        C0376s sVar = new C0376s();
        sVar.f2880c = str2;
        sVar.f2881d = str3;
        for (String str4 : C0654f.m1517b(str, ',')) {
            sVar.f2878a.add(str4.trim());
        }
        this.f2848fZ.add(sVar);
        return sVar;
    }

    /* renamed from: a */
    public static C0377t m2960a(AbstractC0268al alVar) {
        if (alVar == null) {
            return null;
        }
        C0377t tVar = new C0377t();
        tVar.f2882a = "known";
        tVar.f2885d = alVar;
        tVar.f2886e = true;
        return tVar;
    }

    /* renamed from: b */
    public static C0368l m2938b(int i) {
        int i2;
        if (i < 100 || (i2 = i - 100) >= f2768g.size()) {
            return null;
        }
        return (C0368l) f2768g.get(i2);
    }

    /* renamed from: s */
    public static ArrayList m2902s() {
        ArrayList arrayList = new ArrayList();
        int i = 100;
        Iterator it = f2768g.iterator();
        while (it.hasNext()) {
            C0368l lVar = (C0368l) it.next();
            arrayList.add(Integer.valueOf(i));
            i++;
        }
        return arrayList;
    }

    /* renamed from: x */
    public C0365i mo3482x() {
        return this.f2499G;
    }

    /* renamed from: c */
    public C0323as m2932c(String str) {
        Iterator it = this.f2837fG.iterator();
        while (it.hasNext()) {
            C0323as asVar = (C0323as) it.next();
            if (asVar.f2112a.equalsIgnoreCase(str)) {
                return asVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public C0317am m2928d(String str) {
        Iterator it = this.f2838fH.iterator();
        while (it.hasNext()) {
            C0317am amVar = (C0317am) it.next();
            if (amVar.f2083bf.equalsIgnoreCase(str)) {
                return amVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public C0301c m2926e(String str) {
        Iterator it = this.f2845fR.iterator();
        while (it.hasNext()) {
            C0301c cVar = (C0301c) it.next();
            if (cVar.f1873b != null && cVar.f1873b.equalsIgnoreCase(str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public AbstractC0197s m2924f(String str) {
        Iterator it = mo3503a(this.f2594bX).iterator();
        while (it.hasNext()) {
            AbstractC0197s sVar = (AbstractC0197s) it.next();
            if (sVar instanceof C0304f) {
                C0304f fVar = (C0304f) sVar;
                if (fVar.f1964a.f1873b.equalsIgnoreCase(str)) {
                    return fVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m2959a(AbstractC0328a aVar) {
        if (!this.f2773h.contains(aVar)) {
            this.f2773h.add(aVar);
        }
    }

    /* renamed from: a */
    public void m2957a(C0363g gVar) {
        if (gVar != null && gVar.f2423b != 0) {
            if (this.f2762gc) {
                AbstractC0789l.m676f("usesCreditResources:" + gVar);
            }
            this.f2761gb = true;
        }
    }

    /* renamed from: g */
    public C0336i m2922g(String str) {
        Iterator it = this.f2799ap.iterator();
        while (it.hasNext()) {
            C0336i iVar = (C0336i) it.next();
            if (iVar.m3250b().equalsIgnoreCase(str)) {
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: h */
    public C0345a m2920h(String str) {
        C0345a a = C0345a.m3231a(str);
        if (a != null) {
            return a;
        }
        return m2918i(str);
    }

    /* renamed from: i */
    public C0345a m2918i(String str) {
        Iterator it = this.f2774i.iterator();
        while (it.hasNext()) {
            C0352b bVar = (C0352b) it.next();
            if (bVar.f2360a.equalsIgnoreCase(str)) {
                return bVar.f2361b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0352b m2958a(C0345a aVar) {
        Iterator it = this.f2774i.iterator();
        while (it.hasNext()) {
            C0352b bVar = (C0352b) it.next();
            if (bVar.f2361b == aVar) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0338a m2956a(C0364h hVar) {
        Iterator it = this.f2776k.iterator();
        while (it.hasNext()) {
            C0338a aVar = (C0338a) it.next();
            if (aVar.f2316g == hVar) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    public C0338a m2916j(String str) {
        Iterator it = this.f2776k.iterator();
        while (it.hasNext()) {
            C0338a aVar = (C0338a) it.next();
            if (aVar.f2316g.f2433a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: y */
    public boolean mo3481y() {
        return this.f2761gb;
    }

    /* renamed from: t */
    public String m2901t() {
        if (this.f2495B != null) {
            return this.f2495B.m1441a();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2952a(C0690ap apVar) {
        apVar.m1170e("customUnits");
        apVar.mo1109a(1);
        apVar.mo1109a(f2765d.size());
        Iterator it = f2765d.iterator();
        while (it.hasNext()) {
            C0368l lVar = (C0368l) it.next();
            apVar.m1174c(lVar.f2498E);
            apVar.mo1109a(lVar.f2494A);
            apVar.mo1104a(true);
            apVar.m1178b(lVar.m2901t());
            ?? r8 = 0;
            if (!(lVar.f2495B == null || lVar.f2495B.f4614d == 0)) {
                r8 = lVar.f2495B.f4614d;
            }
            apVar.m1197a(r8 == true ? 1L : 0L);
            apVar.m1197a(0L);
        }
        apVar.mo1107a("customUnits");
    }

    /* renamed from: a */
    public static void m2951a(C0707k kVar) {
        kVar.m1082b("customUnits");
        try {
            ArrayList arrayList = new ArrayList();
            kVar.m1076f();
            int f = kVar.m1076f();
            for (int i = 0; i < f; i++) {
                String k = kVar.m1071k();
                int f2 = kVar.m1076f();
                kVar.m1077e();
                String j = kVar.m1072j();
                kVar.m1073i();
                kVar.m1073i();
                C0368l lVar = null;
                int i2 = -1;
                synchronized (f2764c) {
                    Iterator it = f2764c.iterator();
                    while (it.hasNext()) {
                        C0368l lVar2 = (C0368l) it.next();
                        if (k.equals(lVar2.f2498E)) {
                            if (f2 == lVar2.f2494A) {
                                lVar = lVar2;
                            } else {
                                i2 = lVar2.f2494A;
                            }
                        }
                    }
                }
                if (lVar == null) {
                    String str = "from internal units";
                    if (j != null) {
                        str = "from mod:'" + j + "'";
                    }
                    C0657b c = AbstractC0789l.m651u().f5488bH.m1452c(j);
                    if (c != null) {
                        if (!c.m1426k()) {
                            str = str + " (You seem to have this mod but it is not enabled)";
                        } else {
                            str = str + " (You seem to have this mod but it might be a different version)";
                        }
                    }
                    if (i2 == -1) {
                        throw new C0313ai("The server requires the unit:" + k + " that was not found " + str, "");
                    }
                    throw new C0313ai("Found unit:" + k + " but it does not match the server's copy " + str, "checksum c:" + i2 + " s:" + f2);
                }
                arrayList.add(lVar);
            }
            f2766e = arrayList;
            kVar.m1078d("customUnits");
        } catch (Throwable th) {
            kVar.m1078d("customUnits");
            throw th;
        }
    }

    /* renamed from: b */
    public void m2937b(AbstractC0268al alVar) {
        if (!this.f2835fz.contains(alVar) && alVar != this) {
            this.f2835fz.add(alVar);
        }
        if (alVar instanceof C0368l) {
            Iterator it = ((C0368l) alVar).f2835fz.iterator();
            while (it.hasNext()) {
                AbstractC0268al alVar2 = (AbstractC0268al) it.next();
                if (!this.f2835fz.contains(alVar2) && alVar != this) {
                    this.f2835fz.add(alVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public static C0368l m2955a(C0368l lVar) {
        Iterator it = f2765d.iterator();
        while (it.hasNext()) {
            C0368l lVar2 = (C0368l) it.next();
            if (lVar.f2492x.equals(lVar2.f2492x)) {
                return lVar2;
            }
        }
        Iterator it2 = f2765d.iterator();
        while (it2.hasNext()) {
            C0368l lVar3 = (C0368l) it2.next();
            if (lVar.f2498E.equals(lVar3.f2498E)) {
                return lVar3;
            }
        }
        return null;
    }

    /* renamed from: A */
    public static void m2968A() {
        Iterator it = AbstractC0210af.m3601bt().iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof C0367k) {
                C0367k kVar = (C0367k) afVar;
                C0368l lVar = kVar.f2454v;
                if (!f2765d.contains(lVar)) {
                    C0368l a = m2955a(lVar);
                    if (a == null) {
                        a = f2483b;
                    }
                    if (a != null) {
                        kVar.m3073a(a, false);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public C0748e[] m2950a(C0748e eVar, EnumC0172n nVar) {
        boolean z = false;
        if ((this.f2495B != null || this.f2702et) && !AbstractC0789l.m651u().f5479by.disableModLazyLoad) {
            z = true;
        }
        if ((this.f2599cg && this.f2600ch) || this.f2604cl) {
            z = true;
        }
        C0748e[] a = AbstractC0171m.m3803a(eVar, nVar, z);
        for (int i = 0; i < a.length; i++) {
            if (z && this.f2495B != null && this.f2702et && i == 1) {
                a[i].mo346v();
            }
        }
        C0307ac.m3340a(a);
        return a;
    }

    /* renamed from: a */
    public C0748e m2949a(C0809ab abVar, String str, String str2) {
        return m2948a(abVar, str, str2, this.f2508T);
    }

    /* renamed from: a */
    public C0748e m2948a(C0809ab abVar, String str, String str2, boolean z) {
        return m2943a(this.f2492x, abVar.m579b(str, str2, (String) null), z, str, str2);
    }

    /* renamed from: a */
    public C0748e m2943a(String str, String str2, boolean z, String str3, String str4) {
        return C0307ac.m3344a(str, str2, z, this, str3, str4);
    }

    /* renamed from: k */
    public static AbstractC0268al m2914k(String str) {
        for (AbstractC0268al alVar : f2767f.keySet()) {
            if (alVar.mo3494i().equals(str)) {
                return (AbstractC0268al) f2767f.get(alVar);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static AbstractC0268al m2933c(AbstractC0268al alVar) {
        return (AbstractC0268al) f2767f.get(alVar);
    }

    /* renamed from: l */
    public static C0368l m2912l(String str) {
        Iterator it = f2765d.iterator();
        while (it.hasNext()) {
            C0368l lVar = (C0368l) it.next();
            if (str.equals(lVar.f2498E)) {
                return lVar;
            }
        }
        Iterator it2 = f2765d.iterator();
        while (it2.hasNext()) {
            C0368l lVar2 = (C0368l) it2.next();
            if (lVar2.f2782F.contains(str)) {
                return lVar2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0367k m2940a(boolean z, C0368l lVar) {
        return new C0367k(z, lVar);
    }

    /* renamed from: m */
    public void m2910m(String str) {
        if (!C0812ae.m544c(str)) {
            this.f2775j.add(new C0382y(str));
        }
    }

    /* renamed from: n */
    public void m2908n(String str) {
        C0307ac.m3350a(mo3494i(), new C0324at(str), this);
    }

    /* renamed from: o */
    public void m2906o(String str) {
        String str2 = "Warning (on " + m2939b() + "): " + str;
        AbstractC0789l.m695b(str2);
        this.f2850gd.add(str);
        if (this.f2495B == null) {
            AbstractC0789l.m651u().m731a(str2, 1);
            if (AbstractC0789l.f5555aE) {
                AbstractC0789l.m683d("Crashing on allowed unit warning because automated testing is active");
                throw new RuntimeException(str2);
            }
        }
    }

    /* renamed from: z */
    public C0748e mo3480z() {
        return this.f2517al;
    }

    /* renamed from: D */
    public static void m2965D() {
        AbstractC0789l u = AbstractC0789l.m651u();
        Iterator it = f2765d.iterator();
        while (it.hasNext()) {
            C0368l lVar = (C0368l) it.next();
            EnumC0383z zVar = lVar.f2503K;
            if (zVar != null) {
                if (zVar == EnumC0383z.f2895a || zVar == EnumC0383z.f2896b) {
                    Iterator it2 = u.f5474bt.f773w.iterator();
                    while (it2.hasNext()) {
                        Point point = (Point) it2.next();
                        AbstractC0210af a = lVar.mo3504a();
                        a.mo3633a(AbstractC0171m.f1281g);
                        u.f5474bt.m4025a(point.f221a, point.f222b);
                        a.f5841dH = u.f5474bt.f741M;
                        a.f5842dI = u.f5474bt.f742N;
                        a.f5841dH += a.mo2722cH();
                        a.f5842dI += a.mo2721cI();
                        if (zVar != EnumC0383z.f2895a || !(a instanceof AbstractC0515r) || !((AbstractC0515r) a).m2205p((AbstractC0210af) null)) {
                            AbstractC0171m.m3777c(a);
                        } else {
                            a.m3608bU();
                        }
                    }
                } else if (zVar == EnumC0383z.f2897c || zVar == EnumC0383z.f2898d) {
                    if (zVar == EnumC0383z.f2897c) {
                        AbstractC0210af a2 = lVar.mo3504a();
                        a2.mo3633a(AbstractC0171m.f1281g);
                        u.f5474bt.m3996b(u.f5474bt.m3975f() / 2.0f, u.f5474bt.m3972g() / 2.0f);
                        a2.f5841dH = u.f5474bt.f741M;
                        a2.f5842dI = u.f5474bt.f742N;
                        a2.f5841dH += a2.mo2722cH();
                        a2.f5842dI += a2.mo2721cI();
                        AbstractC0171m.m3777c(a2);
                    }
                    if (zVar == EnumC0383z.f2898d) {
                        Iterator it3 = AbstractC0171m.m3782c().iterator();
                        while (it3.hasNext()) {
                            AbstractC0171m mVar = (AbstractC0171m) it3.next();
                            if (mVar.m3798a(true, false) > 0) {
                                AbstractC0210af a3 = lVar.mo3504a();
                                a3.mo3633a(mVar);
                                u.f5474bt.m3996b(u.f5474bt.m3975f() / 2.0f, u.f5474bt.m3972g() / 2.0f);
                                a3.f5841dH = u.f5474bt.f741M;
                                a3.f5842dI = u.f5474bt.f742N;
                                a3.f5841dH += a3.mo2722cH();
                                a3.f5842dI += a3.mo2721cI();
                                AbstractC0171m.m3777c(a3);
                            }
                        }
                    }
                } else if (zVar == EnumC0383z.f2899e) {
                    Iterator it4 = AbstractC0171m.m3782c().iterator();
                    while (it4.hasNext()) {
                        AbstractC0171m mVar2 = (AbstractC0171m) it4.next();
                        if (mVar2.m3798a(true, false) > 0) {
                            PointF pointF = new PointF();
                            C0851y.m430a(mVar2, pointF);
                            AbstractC0210af a4 = lVar.mo3504a();
                            a4.mo3633a(mVar2);
                            u.f5474bt.m3996b(pointF.f224a, pointF.f225b);
                            a4.f5841dH = u.f5474bt.f741M;
                            a4.f5842dI = u.f5474bt.f742N;
                            a4.f5841dH += a4.mo2722cH();
                            a4.f5842dI += a4.mo2721cI();
                            AbstractC0171m.m3777c(a4);
                        }
                    }
                } else {
                    AbstractC0789l.m695b("onNewMapSpawn unhandled: " + lVar.f2503K);
                }
            }
        }
    }

    /* renamed from: a */
    public int mo3502a(AbstractC0210af afVar) {
        int i = 0;
        if (this.f2527aA > 0.0f) {
            return (int) this.f2527aA;
        }
        if (this.f2525ay && this.f2523aw && afVar.mo2489y() < 20) {
            i = 0 + 17;
        }
        return i;
    }
}

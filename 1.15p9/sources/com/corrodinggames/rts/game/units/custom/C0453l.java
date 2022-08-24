package com.corrodinggames.rts.game.units.custom;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0304at;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0307b;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p016a.C0342g;
import com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.custom.p019c.C0416a;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0437d;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.land.Hovercraft;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0231z;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0823a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1077ag;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/l.class */
public final class C0453l implements InterfaceC0303as {

    /* renamed from: b */
    public static C0453l f2901b;

    /* renamed from: r */
    public boolean f2902r;

    /* renamed from: s */
    public boolean f2903s;

    /* renamed from: t */
    public boolean f2904t;

    /* renamed from: u */
    public boolean f2905u;

    /* renamed from: v */
    public boolean f2906v;

    /* renamed from: w */
    public boolean f2907w;

    /* renamed from: x */
    public boolean f2908x;

    /* renamed from: y */
    public boolean f2909y;

    /* renamed from: A */
    public boolean f2910A;

    /* renamed from: B */
    public Rect f2911B;

    /* renamed from: C */
    public String f2912C;

    /* renamed from: D */
    public String f2913D;

    /* renamed from: E */
    public String f2914E;

    /* renamed from: G */
    public int f2915G;

    /* renamed from: H */
    public String f2916H;

    /* renamed from: I */
    public C0824b f2917I;

    /* renamed from: J */
    public String f2918J;

    /* renamed from: K */
    public String f2919K;

    /* renamed from: L */
    public String f2920L;

    /* renamed from: N */
    public C0449h f2921N;

    /* renamed from: O */
    public C0449h f2922O;

    /* renamed from: P */
    public String f2923P;

    /* renamed from: Q */
    public int f2924Q;

    /* renamed from: R */
    public int f2925R;

    /* renamed from: S */
    public EnumC0345ac f2926S;

    /* renamed from: X */
    public int f2927X;

    /* renamed from: Y */
    public LogicBoolean f2928Y;

    /* renamed from: Z */
    public boolean f2929Z;

    /* renamed from: aa */
    public boolean f2930aa;

    /* renamed from: ab */
    public EnumC0198o f2931ab;

    /* renamed from: ae */
    public int f2932ae;

    /* renamed from: af */
    public int f2933af;

    /* renamed from: ag */
    public int f2934ag;

    /* renamed from: ah */
    public int f2935ah;

    /* renamed from: ai */
    public float f2936ai;

    /* renamed from: aj */
    public boolean f2937aj;

    /* renamed from: al */
    public boolean f2938al;

    /* renamed from: ap */
    public boolean f2939ap;

    /* renamed from: ar */
    public BitmapOrTexture[] f2940ar;

    /* renamed from: av */
    public BitmapOrTexture f2941av;

    /* renamed from: aA */
    public boolean f2942aA;

    /* renamed from: aB */
    public C0385az f2943aB;

    /* renamed from: aC */
    public C0385az f2944aC;

    /* renamed from: aD */
    public String f2945aD;

    /* renamed from: aE */
    public boolean f2946aE;

    /* renamed from: aG */
    public boolean f2947aG;

    /* renamed from: aH */
    public boolean f2948aH;

    /* renamed from: aI */
    public boolean f2949aI;

    /* renamed from: aJ */
    public boolean f2950aJ;

    /* renamed from: aK */
    public float f2951aK;

    /* renamed from: aL */
    public boolean f2952aL;

    /* renamed from: aM */
    public boolean f2953aM;

    /* renamed from: aN */
    public boolean f2954aN;

    /* renamed from: aO */
    public boolean f2955aO;

    /* renamed from: aP */
    public boolean f2956aP;

    /* renamed from: aQ */
    public boolean f2957aQ;

    /* renamed from: aR */
    public C0449h f2958aR;

    /* renamed from: aS */
    public boolean f2959aS;

    /* renamed from: aT */
    public boolean f2960aT;

    /* renamed from: aU */
    public boolean f2961aU;

    /* renamed from: aV */
    public boolean f2962aV;

    /* renamed from: aX */
    public boolean f2963aX;

    /* renamed from: aZ */
    public boolean f2964aZ;

    /* renamed from: ba */
    public float f2965ba;

    /* renamed from: bb */
    public float f2966bb;

    /* renamed from: bd */
    public float f2967bd;

    /* renamed from: be */
    public float f2968be;

    /* renamed from: bf */
    public float f2969bf;

    /* renamed from: bg */
    public boolean f2970bg;

    /* renamed from: bh */
    public float f2971bh;

    /* renamed from: bi */
    public boolean f2972bi;

    /* renamed from: bj */
    public boolean f2973bj;

    /* renamed from: bk */
    public boolean f2974bk;

    /* renamed from: bl */
    public boolean f2975bl;

    /* renamed from: bm */
    public int f2976bm;

    /* renamed from: bn */
    public boolean f2977bn;

    /* renamed from: bo */
    public float f2978bo;

    /* renamed from: bp */
    public float f2979bp;

    /* renamed from: bq */
    public int f2980bq;

    /* renamed from: br */
    public boolean f2981br;

    /* renamed from: bs */
    public boolean f2982bs;

    /* renamed from: bt */
    public EnumC0233ab f2983bt;

    /* renamed from: bu */
    public boolean f2984bu;

    /* renamed from: bv */
    public boolean f2985bv;

    /* renamed from: bw */
    public C0467y f2986bw;

    /* renamed from: bx */
    public C0467y f2987bx;

    /* renamed from: by */
    public C0467y f2988by;

    /* renamed from: bz */
    public C0409bj f2989bz;

    /* renamed from: bC */
    public C0413bn f2990bC;

    /* renamed from: bD */
    public boolean f2991bD;

    /* renamed from: bE */
    public boolean f2992bE;

    /* renamed from: bF */
    public boolean f2993bF;

    /* renamed from: bG */
    public boolean f2994bG;

    /* renamed from: bJ */
    boolean f2995bJ;

    /* renamed from: bK */
    boolean f2996bK;

    /* renamed from: bL */
    boolean f2997bL;

    /* renamed from: bM */
    boolean f2998bM;

    /* renamed from: bN */
    boolean f2999bN;

    /* renamed from: bO */
    C0467y f3000bO;

    /* renamed from: bP */
    C0467y f3001bP;

    /* renamed from: bQ */
    boolean f3002bQ;

    /* renamed from: bR */
    float f3003bR;

    /* renamed from: bS */
    boolean f3004bS;

    /* renamed from: bT */
    float f3005bT;

    /* renamed from: bU */
    C0467y f3006bU;

    /* renamed from: bV */
    C0467y f3007bV;

    /* renamed from: bW */
    boolean f3008bW;

    /* renamed from: bX */
    float f3009bX;

    /* renamed from: bY */
    C0467y f3010bY;

    /* renamed from: bZ */
    C0467y f3011bZ;

    /* renamed from: cc */
    public boolean f3012cc;

    /* renamed from: cd */
    public boolean f3013cd;

    /* renamed from: ce */
    public boolean f3014ce;

    /* renamed from: cf */
    public C0424b f3015cf;

    /* renamed from: cg */
    public C0424b f3016cg;

    /* renamed from: ch */
    public C0424b f3017ch;

    /* renamed from: cj */
    public int f3018cj;

    /* renamed from: ck */
    public boolean f3019ck;

    /* renamed from: co */
    public int f3020co;

    /* renamed from: cp */
    public float f3021cp;

    /* renamed from: cs */
    public LogicBoolean f3022cs;

    /* renamed from: ct */
    public boolean f3023ct;

    /* renamed from: cu */
    public boolean f3024cu;

    /* renamed from: cv */
    public boolean f3025cv;

    /* renamed from: cw */
    public boolean f3026cw;

    /* renamed from: cx */
    public boolean f3027cx;

    /* renamed from: cy */
    public boolean f3028cy;

    /* renamed from: cz */
    public boolean f3029cz;

    /* renamed from: cA */
    public float f3030cA;

    /* renamed from: cB */
    public int f3031cB;

    /* renamed from: cC */
    public C0449h f3032cC;

    /* renamed from: cE */
    public float f3033cE;

    /* renamed from: cF */
    public float f3034cF;

    /* renamed from: cH */
    public boolean f3035cH;

    /* renamed from: cI */
    public float f3036cI;

    /* renamed from: cJ */
    public boolean f3037cJ;

    /* renamed from: cK */
    public float f3038cK;

    /* renamed from: cL */
    public float f3039cL;

    /* renamed from: cM */
    public boolean f3040cM;

    /* renamed from: cN */
    public float f3041cN;

    /* renamed from: cO */
    public C0385az f3042cO;

    /* renamed from: cP */
    public boolean f3043cP;

    /* renamed from: cQ */
    public float f3044cQ;

    /* renamed from: cR */
    public int f3045cR;

    /* renamed from: cV */
    public float f3046cV;

    /* renamed from: cW */
    public float f3047cW;

    /* renamed from: cX */
    public boolean f3048cX;

    /* renamed from: cY */
    public int f3049cY;

    /* renamed from: cZ */
    public float f3050cZ;

    /* renamed from: da */
    public int f3051da;

    /* renamed from: db */
    public int f3052db;

    /* renamed from: dc */
    public int f3053dc;

    /* renamed from: dd */
    public float f3054dd;

    /* renamed from: de */
    public float f3055de;

    /* renamed from: df */
    public Float f3056df;

    /* renamed from: dg */
    public float f3057dg;

    /* renamed from: dh */
    public boolean f3058dh;

    /* renamed from: di */
    public Float f3059di;

    /* renamed from: dj */
    public C0409bj f3060dj;

    /* renamed from: dk */
    public C0409bj f3061dk;

    /* renamed from: dl */
    public C0409bj f3062dl;

    /* renamed from: dq */
    C0441f f3063dq;

    /* renamed from: dr */
    C0441f f3064dr;

    /* renamed from: ds */
    C0441f f3065ds;

    /* renamed from: dt */
    C0441f f3066dt;

    /* renamed from: du */
    C0441f f3067du;

    /* renamed from: dv */
    C0441f f3068dv;

    /* renamed from: dw */
    public boolean f3069dw;

    /* renamed from: dx */
    public boolean f3070dx;

    /* renamed from: dy */
    public boolean f3071dy;

    /* renamed from: dz */
    public boolean f3072dz;

    /* renamed from: dA */
    public C0411bl f3073dA;

    /* renamed from: dB */
    public float f3074dB;

    /* renamed from: dC */
    C0455m f3075dC;

    /* renamed from: dD */
    public float f3076dD;

    /* renamed from: dE */
    public Boolean f3077dE;

    /* renamed from: dF */
    public boolean f3078dF;

    /* renamed from: dG */
    public float f3079dG;

    /* renamed from: dH */
    public float f3080dH;

    /* renamed from: dI */
    public float f3081dI;

    /* renamed from: dJ */
    public boolean f3082dJ;

    /* renamed from: dK */
    public boolean f3083dK;

    /* renamed from: dL */
    public boolean f3084dL;

    /* renamed from: dN */
    public float f3085dN;

    /* renamed from: dO */
    public float f3086dO;

    /* renamed from: dS */
    public boolean f3087dS;

    /* renamed from: dT */
    public boolean f3088dT;

    /* renamed from: dU */
    public int f3089dU;

    /* renamed from: dV */
    public float f3090dV;

    /* renamed from: dW */
    public float f3091dW;

    /* renamed from: dX */
    public EnumC0307b f3092dX;

    /* renamed from: dY */
    public float f3093dY;

    /* renamed from: dZ */
    public float f3094dZ;

    /* renamed from: ea */
    public boolean f3095ea;

    /* renamed from: eb */
    public boolean f3096eb;

    /* renamed from: ec */
    public boolean f3097ec;

    /* renamed from: ed */
    public boolean f3098ed;

    /* renamed from: ee */
    public float f3099ee;

    /* renamed from: ef */
    public float f3100ef;

    /* renamed from: eg */
    public float f3101eg;

    /* renamed from: ej */
    public float f3102ej;

    /* renamed from: ek */
    public boolean f3103ek;

    /* renamed from: el */
    public LogicBoolean f3104el;

    /* renamed from: em */
    public LogicBoolean f3105em;

    /* renamed from: en */
    public LogicBoolean f3106en;

    /* renamed from: eo */
    public LogicBoolean f3107eo;

    /* renamed from: ep */
    public boolean f3108ep;

    /* renamed from: eq */
    public C0449h f3109eq;

    /* renamed from: er */
    public C0449h f3110er;

    /* renamed from: es */
    public boolean f3111es;

    /* renamed from: et */
    public boolean f3112et;

    /* renamed from: eu */
    public float f3113eu;

    /* renamed from: ev */
    public boolean f3114ev;

    /* renamed from: ew */
    public int f3115ew;

    /* renamed from: ex */
    public boolean f3116ex;

    /* renamed from: ey */
    public boolean f3117ey;

    /* renamed from: ez */
    public boolean f3118ez;

    /* renamed from: eA */
    public boolean f3119eA;

    /* renamed from: eB */
    public float f3120eB;

    /* renamed from: eC */
    public boolean f3121eC;

    /* renamed from: eD */
    public boolean f3122eD;

    /* renamed from: eI */
    public float f3123eI;

    /* renamed from: eJ */
    public boolean f3124eJ;

    /* renamed from: eK */
    public C0449h f3125eK;

    /* renamed from: eM */
    public boolean f3126eM;

    /* renamed from: eN */
    public boolean f3127eN;

    /* renamed from: eO */
    public boolean f3128eO;

    /* renamed from: eP */
    public LogicBoolean f3129eP;

    /* renamed from: eQ */
    public LogicBoolean f3130eQ;

    /* renamed from: eR */
    public LogicBoolean f3131eR;

    /* renamed from: eS */
    public boolean f3132eS;

    /* renamed from: eT */
    public float f3133eT;

    /* renamed from: eX */
    public LogicBoolean f3134eX;

    /* renamed from: eY */
    public LogicBoolean f3135eY;

    /* renamed from: fa */
    public C0402bc f3136fa;

    /* renamed from: fb */
    public EnumC0246ao f3137fb;

    /* renamed from: fc */
    public EnumC0246ao f3138fc;

    /* renamed from: fd */
    public boolean f3139fd;

    /* renamed from: fe */
    public boolean f3140fe;

    /* renamed from: ff */
    public boolean f3141ff;

    /* renamed from: fg */
    public C0449h f3142fg;

    /* renamed from: fh */
    public int f3143fh;

    /* renamed from: fi */
    public C0449h f3144fi;

    /* renamed from: fj */
    public C0449h f3145fj;

    /* renamed from: fk */
    public boolean f3146fk;

    /* renamed from: fl */
    public boolean f3147fl;

    /* renamed from: fm */
    public boolean f3148fm;

    /* renamed from: fn */
    public boolean f3149fn;

    /* renamed from: fo */
    public boolean f3150fo;

    /* renamed from: fp */
    public boolean f3151fp;

    /* renamed from: fq */
    public C0449h f3152fq;

    /* renamed from: fr */
    public boolean f3153fr;

    /* renamed from: fs */
    public int f3154fs;

    /* renamed from: ft */
    public int f3155ft;

    /* renamed from: fu */
    public float f3156fu;

    /* renamed from: fv */
    public int f3157fv;

    /* renamed from: fw */
    public float f3158fw;

    /* renamed from: fx */
    public float f3159fx;

    /* renamed from: fy */
    public float f3160fy;

    /* renamed from: fz */
    public int f3161fz;

    /* renamed from: fA */
    public int f3162fA;

    /* renamed from: fB */
    public boolean f3163fB;

    /* renamed from: fC */
    public C0449h f3164fC;

    /* renamed from: fD */
    public String f3165fD;

    /* renamed from: fE */
    public boolean f3166fE;

    /* renamed from: fH */
    public boolean f3167fH;

    /* renamed from: fI */
    public boolean f3168fI;

    /* renamed from: fJ */
    public C0449h f3169fJ;

    /* renamed from: fK */
    public boolean f3170fK;

    /* renamed from: fM */
    public C0405bf[] f3171fM;

    /* renamed from: fS */
    boolean f3172fS;

    /* renamed from: fT */
    C0460r[] f3173fT;

    /* renamed from: fU */
    C0460r[] f3174fU;

    /* renamed from: fV */
    C0460r[] f3175fV;

    /* renamed from: gc */
    public boolean f3176gc;

    /* renamed from: ge */
    String f3177ge;

    /* renamed from: gf */
    String f3178gf;

    /* renamed from: gg */
    HashMap f3179gg;

    /* renamed from: gh */
    C0304at[] f3180gh;

    /* renamed from: gl */
    public boolean f3181gl;

    /* renamed from: gm */
    public boolean f3182gm;

    /* renamed from: a */
    public static final Rect f3183a = new Rect();

    /* renamed from: c */
    public static final ArrayList f3184c = new ArrayList();

    /* renamed from: d */
    public static ArrayList f3185d = new ArrayList();

    /* renamed from: e */
    public static ArrayList f3186e = null;

    /* renamed from: f */
    public static final HashMap f3187f = new HashMap();

    /* renamed from: g */
    public static ArrayList f3188g = new ArrayList();

    /* renamed from: eV */
    public static LogicBoolean f3189eV = LogicBoolean.create(null, "if not self.isOverLiquid() and not self.isMoving()");

    /* renamed from: eW */
    public static LogicBoolean f3190eW = LogicBoolean.create(null, "if not self.isOverLiquid()");

    /* renamed from: fY */
    static final C0382aw[] f3191fY = new C0382aw[0];

    /* renamed from: fZ */
    static final C0382aw[] f3192fZ = new C0382aw[0];

    /* renamed from: h */
    public final C1101m f3193h = new C1101m();

    /* renamed from: i */
    public final C1101m f3194i = new C1101m();

    /* renamed from: j */
    public final C1101m f3195j = new C1101m();

    /* renamed from: k */
    final C1101m f3196k = new C1101m();

    /* renamed from: l */
    public final C1101m f3197l = new C1101m();

    /* renamed from: m */
    public final C1101m f3198m = new C1101m();

    /* renamed from: n */
    public final C1101m f3199n = new C1101m();

    /* renamed from: o */
    public final C1101m f3200o = new C1101m();

    /* renamed from: p */
    final C1101m f3201p = new C1101m();

    /* renamed from: q */
    public final VariableScope.VariableMapping f3202q = new VariableScope.VariableMapping();

    /* renamed from: z */
    public boolean f3203z = true;

    /* renamed from: F */
    public boolean f3204F = true;

    /* renamed from: M */
    public C1101m f3205M = new C1101m();

    /* renamed from: T */
    public int f3206T = 1;

    /* renamed from: U */
    public int f3207U = Integer.MAX_VALUE;

    /* renamed from: V */
    public int f3208V = -1;

    /* renamed from: W */
    public int f3209W = -1;

    /* renamed from: ac */
    public BitmapOrTexture f3210ac = null;

    /* renamed from: ad */
    public boolean f3211ad = true;

    /* renamed from: ak */
    public BitmapOrTexture f3212ak = null;

    /* renamed from: am */
    public BitmapOrTexture f3213am = null;

    /* renamed from: an */
    public BitmapOrTexture f3214an = null;

    /* renamed from: ao */
    public BitmapOrTexture f3215ao = null;

    /* renamed from: aq */
    public BitmapOrTexture[] f3216aq = new BitmapOrTexture[10];

    /* renamed from: as */
    public BitmapOrTexture[] f3217as = null;

    /* renamed from: at */
    public BitmapOrTexture f3218at = null;

    /* renamed from: au */
    public boolean f3219au = false;

    /* renamed from: aw */
    public C0384ay[] f3220aw = null;

    /* renamed from: ax */
    public boolean f3221ax = false;

    /* renamed from: ay */
    public boolean f3222ay = false;

    /* renamed from: az */
    public final C1101m f3223az = new C1101m();

    /* renamed from: aF */
    public float f3224aF = 1.0f;

    /* renamed from: aW */
    public int f3225aW = -1;

    /* renamed from: aY */
    public int f3226aY = -1;

    /* renamed from: bc */
    public float f3227bc = 1.0f;

    /* renamed from: bA */
    public int f3228bA = -1;

    /* renamed from: bB */
    public int f3229bB = -1;

    /* renamed from: bH */
    public float f3230bH = 1.0f;

    /* renamed from: bI */
    public float f3231bI = 1.0f;

    /* renamed from: ca */
    public float f3232ca = 60.0f;

    /* renamed from: cb */
    public EnumC0461s f3233cb = EnumC0461s.everyFrame;

    /* renamed from: ci */
    public float f3234ci = 0.001f;

    /* renamed from: cl */
    public C0424b f3235cl = C0424b.f2709a;

    /* renamed from: cm */
    public C0439f f3236cm = C0439f.f2800a;

    /* renamed from: cn */
    public C0439f f3237cn = C0439f.f2800a;

    /* renamed from: cq */
    public C0424b f3238cq = C0424b.f2709a;

    /* renamed from: cr */
    public C0424b f3239cr = C0424b.f2709a;

    /* renamed from: cD */
    public int f3240cD = -2;

    /* renamed from: cG */
    public C0359aq f3241cG = new C0359aq(true);

    /* renamed from: cS */
    public Rect f3242cS = new Rect();

    /* renamed from: cT */
    public Rect f3243cT = new Rect();

    /* renamed from: cU */
    public Rect f3244cU = new Rect();

    /* renamed from: dm */
    C1101m f3245dm = new C1101m();

    /* renamed from: dn */
    C0441f f3246dn = new C0441f("moving");

    /* renamed from: do */
    C0441f f3247do = new C0441f("idle");

    /* renamed from: dp */
    C0441f f3248dp = new C0441f("attack");

    /* renamed from: dM */
    public float f3249dM = 0.0f;

    /* renamed from: dP */
    public float f3250dP = -1.0f;

    /* renamed from: dQ */
    public float f3251dQ = 0.03f;

    /* renamed from: dR */
    public float f3252dR = 0.06f;

    /* renamed from: eh */
    public int f3253eh = -1;

    /* renamed from: ei */
    public int f3254ei = -1;

    /* renamed from: eE */
    public boolean f3255eE = false;

    /* renamed from: eF */
    public boolean f3256eF = false;

    /* renamed from: eG */
    public boolean f3257eG = false;

    /* renamed from: eH */
    public int f3258eH = 0;

    /* renamed from: eL */
    public C1101m f3259eL = new C1101m();

    /* renamed from: eU */
    public int f3260eU = 1;

    /* renamed from: eZ */
    public boolean f3261eZ = true;

    /* renamed from: fF */
    public float f3262fF = -1.0f;

    /* renamed from: fG */
    public C1101m f3263fG = new C1101m();

    /* renamed from: fL */
    public C0411bl[] f3264fL = null;

    /* renamed from: fN */
    ArrayList f3265fN = new ArrayList();

    /* renamed from: fO */
    ArrayList f3266fO = new ArrayList();

    /* renamed from: fP */
    boolean f3267fP = false;

    /* renamed from: fQ */
    C0411bl f3268fQ = null;

    /* renamed from: fR */
    C1101m f3269fR = new C1101m();

    /* renamed from: fW */
    ArrayList f3270fW = new ArrayList();

    /* renamed from: fX */
    ArrayList f3271fX = new ArrayList();

    /* renamed from: ga */
    ArrayList f3272ga = new ArrayList();

    /* renamed from: gb */
    ArrayList f3273gb = new ArrayList();

    /* renamed from: gd */
    int f3274gd = -1;

    /* renamed from: gi */
    C0231z f3275gi = new C0231z(this);

    /* renamed from: gj */
    C1101m f3276gj = new C1101m();

    /* renamed from: gk */
    C1101m f3277gk = new C1101m();

    /* renamed from: gn */
    C1101m f3278gn = new C1101m();

    /* renamed from: b */
    public String m4746b() {
        String str = this.f2912C;
        if (this.f2917I != null) {
            String str2 = this.f2917I.f5426q;
            if (str.startsWith(str2)) {
                str = str.substring(str2.length());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (str.startsWith("\\")) {
                    str = str.substring(1);
                }
            }
            str = str + " (in mod " + this.f2917I.m1846a() + ")";
        }
        return str;
    }

    /* renamed from: a */
    public C0457o m4754a(String str, C0457o c0457o) {
        if (str != null) {
            C0457o c0457o2 = new C0457o(this);
            c0457o2.f3321a = str;
            c0457o2.m4692a();
            return c0457o2;
        } else if (c0457o != null) {
            C0457o c0457o3 = new C0457o(this);
            c0457o3.f3321a = c0457o.f3321a;
            c0457o3.m4692a();
            return c0457o3;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0441f m4762a(EnumC0456n enumC0456n, C0441f c0441f, boolean z) {
        C0441f m4763a = m4763a(enumC0456n);
        if (m4763a != null) {
            if (z && c0441f != null && c0441f.m5085a()) {
                throw new C0412bm("Cannot define animation " + enumC0456n.name() + " on graphics and with onAction at same time");
            }
            return m4763a;
        }
        return c0441f;
    }

    /* renamed from: a */
    public static String m4756a(String str) {
        String trim = str.toLowerCase(Locale.ROOT).trim();
        if (trim.startsWith("arm_")) {
            trim = "arm" + trim.substring("arm_".length());
        }
        if (trim.startsWith("leg_")) {
            trim = "leg" + trim.substring("leg_".length());
        }
        return trim;
    }

    /* renamed from: b */
    public int m4742b(String str) {
        String m4756a = m4756a(str);
        GameEngine.PrintLog("name:" + m4756a);
        for (int i = 0; i < this.f3220aw.length; i++) {
            GameEngine.PrintLog("checking:" + this.f3220aw[i].f2272b);
            if (m4756a.equals(this.f3220aw[i].f2272b)) {
                GameEngine.PrintLog("got");
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0441f m4763a(EnumC0456n enumC0456n) {
        Iterator it = this.f3245dm.iterator();
        while (it.hasNext()) {
            C0441f c0441f = (C0441f) it.next();
            if (c0441f.m5081a(enumC0456n)) {
                return c0441f;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0467y m4753a(String str, C0467y c0467y) {
        if (str == null && c0467y != null) {
            return c0467y;
        }
        C0467y c0467y2 = new C0467y(this, str);
        c0467y2.m4675c();
        return c0467y2;
    }

    /* renamed from: c */
    public C0467y m4737c(String str) {
        return new C0467y(this, str);
    }

    /* renamed from: d */
    public C0382aw m4733d(String str) {
        boolean z = false;
        boolean z2 = false;
        String upperCase = str.toUpperCase();
        if (upperCase.startsWith("CUSTOM:")) {
            str = str.substring("CUSTOM:".length()).trim();
            z = true;
        }
        if (upperCase.startsWith("CUSTOM|")) {
            str = str.substring("CUSTOM|".length()).trim();
            z = true;
        }
        if (upperCase.startsWith("BUILTIN:") || upperCase.startsWith("BUILTIN|")) {
            str = str.substring("BUILTIN:".length()).trim();
            z2 = true;
        }
        if (z) {
            Iterator it = this.f3271fX.iterator();
            while (it.hasNext()) {
                C0382aw c0382aw = (C0382aw) it.next();
                if (str.equalsIgnoreCase(c0382aw.name)) {
                    return c0382aw;
                }
            }
            throw new C0412bm("Failed to find custom effect with the name:" + str);
        } else if (str.contains(":")) {
            throw new C0412bm("Unknown effect format:" + str + " expected built-in effect or CUSTOM:");
        } else {
            if (str.contains("|")) {
                throw new C0412bm("Unknown effect format:" + str + " expected built-in effect or CUSTOM|");
            }
            if (!z2) {
                Iterator it2 = this.f3271fX.iterator();
                while (it2.hasNext()) {
                    C0382aw c0382aw2 = (C0382aw) it2.next();
                    if (str.equalsIgnoreCase(c0382aw2.name)) {
                        return c0382aw2;
                    }
                }
            }
            if ("small".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2261a);
            }
            if ("medium".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2262b);
            }
            if ("large".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2263c);
            }
            if ("smoke".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2264d);
            }
            if ("shockwave".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2265e);
            }
            if ("largeExplosion".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2266f);
            }
            if ("smallExplosion".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2267g);
            }
            if ("resourcePoolSmoke".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2268h);
            }
            if ("none".equalsIgnoreCase(str)) {
                return new C0382aw(EnumC0383ax.f2269i);
            }
            throw new C0412bm("Failed to find built-in or custom effect with the name:" + str);
        }
    }

    /* renamed from: C */
    public boolean m4777C() {
        return this.f3012cc;
    }

    /* renamed from: w */
    public boolean m4699w() {
        if (this.f3014ce) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.m1221N() && gameEngine.networkEngine.f5597aO.f5656i) {
                return true;
            }
        }
        return this.f3013cd;
    }

    /* renamed from: c */
    public int m4740c() {
        return this.f3015cf.m5231a();
    }

    /* renamed from: u */
    public C0424b m4701u() {
        return this.f3015cf;
    }

    /* renamed from: B */
    public C0424b m4778B() {
        return this.f3017ch;
    }

    /* renamed from: d */
    public C0424b m4734d(int i) {
        return this.f3015cf;
    }

    /* renamed from: D */
    public float m4776D() {
        return this.f3234ci;
    }

    /* renamed from: g */
    public int m4728g() {
        return this.f3018cj;
    }

    /* renamed from: a */
    public Unit m4774a() {
        return m4747a(false, this);
    }

    /* renamed from: a */
    public Unit m4748a(boolean z) {
        return m4747a(z, this);
    }

    /* renamed from: e */
    public String m4732e() {
        if (this.f3274gd != C0820a.f5395c || this.f3177ge == null) {
            this.f3274gd = C0820a.f5395c;
            String m5339b = this.f2943aB != null ? this.f2943aB.m5339b() : this.f2920L;
            String str = this.f2920L;
            if (this.f2945aD != null) {
                str = this.f2945aD;
            }
            this.f3177ge = C0820a.m1889a("units." + str + ".name", m5339b, new Object[0]);
        }
        return this.f3177ge;
    }

    /* renamed from: f */
    public String m4730f() {
        if (this.f3274gd != C0820a.f5395c || this.f3178gf == null) {
            this.f3274gd = C0820a.f5395c;
            String m5339b = this.f2944aC != null ? this.f2944aC.m5339b() : this.f2920L;
            String str = this.f2920L;
            if (this.f2945aD != null) {
                str = this.f2945aD;
            }
            this.f3178gf = C0820a.m1889a("units." + str + ".description", m5339b, new Object[0]);
        }
        return this.f3178gf;
    }

    /* renamed from: j */
    public boolean m4722j() {
        return this.f2947aG;
    }

    /* renamed from: k */
    public boolean m4720k() {
        return this.f2948aH;
    }

    /* renamed from: m */
    public boolean m4716m() {
        return this.f3147fl;
    }

    /* renamed from: n */
    public boolean m4714n() {
        return this.f3148fm;
    }

    /* renamed from: l */
    public boolean m4718l() {
        return this.f3146fk;
    }

    /* renamed from: o */
    public EnumC0246ao m4712o() {
        return this.f3137fb;
    }

    /* renamed from: p */
    public boolean m4710p() {
        return this.f2949aI;
    }

    /* renamed from: q */
    public C0402bc m4708q() {
        return this.f3136fa;
    }

    /* renamed from: a */
    public void m4749a(ArrayList arrayList, int i) {
        if (this.f3258eH != 0 && this.f3128eO) {
            arrayList.add(Hovercraft.f3639i);
            arrayList.add(Hovercraft.f3640j);
        }
    }

    /* renamed from: h */
    public void m4726h() {
        this.f3179gg = null;
        this.f3180gh = new C0304at[3];
        for (int i = 1; i <= 3; i++) {
            C0304at c0304at = new C0304at();
            m4749a(c0304at.f1795a, i);
            this.f3180gh[i - 1] = c0304at;
        }
    }

    /* renamed from: a */
    public ArrayList m4773a(int i) {
        if (this.f3180gh == null) {
            GameEngine gameEngine = GameEngine.getInstance();
            throw new RuntimeException("specialActionLists==null for:" + this.f2920L + " t:" + i + " networked:" + gameEngine.m1222M() + " replay:" + gameEngine.f6120cb.m2635h() + " sandbox:" + gameEngine.f6094bv + " active: " + f3185d.contains(this));
        }
        return this.f3180gh[i - 1].f1795a;
    }

    /* renamed from: r */
    public void m4706r() {
        ArrayList m4773a = m4773a(this.f3018cj);
        if (m4773a.size() > 4) {
            this.f3179gg = new HashMap();
            int size = m4773a.size();
            for (int i = 0; i < size; i++) {
                Action action = (Action) m4773a.get(i);
                if (this.f3179gg.get(action.m6095N()) == null) {
                    this.f3179gg.put(action.m6095N(), action);
                }
            }
        }
    }

    /* renamed from: a */
    public Action m4772a(C0208c c0208c) {
        if (this.f3179gg != null) {
            return (Action) this.f3179gg.get(c0208c);
        }
        ArrayList m4773a = m4773a(this.f3018cj);
        int size = m4773a.size();
        for (int i = 0; i < size; i++) {
            Action action = (Action) m4773a.get(i);
            if (action.m6076d(c0208c)) {
                return action;
            }
        }
        return null;
    }

    /* renamed from: i */
    public String m4724i() {
        return this.f2920L;
    }

    /* renamed from: v */
    public String m4700v() {
        return this.f2920L;
    }

    /* renamed from: b */
    public int m4745b(int i) {
        return m4740c();
    }

    /* renamed from: d */
    public C0231z m4735d() {
        return this.f3275gi;
    }

    /* renamed from: a */
    public C0463u m4752a(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        C0463u c0463u = new C0463u();
        c0463u.f3343a = str2;
        c0463u.f3344b = str3;
        c0463u.f3345c = str;
        this.f3201p.add(c0463u);
        return c0463u;
    }

    /* renamed from: b */
    public C0465w m4741b(String str, String str2, String str3) {
        C0465w c0465w = new C0465w();
        c0465w.f3343a = str2;
        c0465w.f3344b = str3;
        c0465w.f3345c = "(known unit:)" + m4724i();
        c0465w.f3346d = this;
        c0465w.f3347e = true;
        c0465w.f3349g = str;
        this.f3201p.add(c0465w);
        return c0465w;
    }

    /* renamed from: c */
    public C0462t m4736c(String str, String str2, String str3) {
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return null;
        }
        C0462t c0462t = new C0462t();
        c0462t.f3341c = str2;
        c0462t.f3342d = str3;
        for (String str4 : CommonUtils.m2287c(str, ',')) {
            c0462t.f3339a.add(str4.trim());
        }
        this.f3276gj.add(c0462t);
        return c0462t;
    }

    /* renamed from: a */
    public static C0463u m4770a(InterfaceC0303as interfaceC0303as) {
        if (interfaceC0303as == null) {
            return null;
        }
        C0463u c0463u = new C0463u();
        c0463u.f3343a = "known";
        c0463u.f3346d = interfaceC0303as;
        c0463u.f3347e = true;
        return c0463u;
    }

    /* renamed from: c */
    public static C0453l m4739c(int i) {
        int i2;
        if (i >= 100 && (i2 = i - 100) < f3188g.size()) {
            return (C0453l) f3188g.get(i2);
        }
        return null;
    }

    /* renamed from: s */
    public static ArrayList m4704s() {
        ArrayList arrayList = new ArrayList();
        int i = 100;
        Iterator it = f3188g.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            arrayList.add(Integer.valueOf(i));
            i++;
        }
        return arrayList;
    }

    /* renamed from: x */
    public C0449h m4698x() {
        return this.f2921N;
    }

    /* renamed from: e */
    public C0411bl m4731e(String str) {
        Iterator it = this.f3265fN.iterator();
        while (it.hasNext()) {
            C0411bl c0411bl = (C0411bl) it.next();
            if (c0411bl.f2542a.equalsIgnoreCase(str)) {
                return c0411bl;
            }
        }
        return null;
    }

    /* renamed from: f */
    public C0405bf m4729f(String str) {
        Iterator it = this.f3266fO.iterator();
        while (it.hasNext()) {
            C0405bf c0405bf = (C0405bf) it.next();
            if (c0405bf.f2513bh.equalsIgnoreCase(str)) {
                return c0405bf;
            }
        }
        return null;
    }

    /* renamed from: g */
    public C0339d m4727g(String str) {
        Iterator it = this.f3273gb.iterator();
        while (it.hasNext()) {
            C0339d c0339d = (C0339d) it.next();
            if (c0339d.f2048b != null && c0339d.f2048b.equalsIgnoreCase(str)) {
                return c0339d;
            }
        }
        return null;
    }

    /* renamed from: h */
    public Action m4725h(String str) {
        Iterator it = m4773a(this.f3018cj).iterator();
        while (it.hasNext()) {
            Action action = (Action) it.next();
            if (action instanceof C0342g) {
                C0342g c0342g = (C0342g) action;
                if (c0342g.f2148a.f2048b.equalsIgnoreCase(str)) {
                    return c0342g;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m4768a(AbstractC0387a abstractC0387a) {
        if (!this.f3193h.contains(abstractC0387a)) {
            this.f3193h.add(abstractC0387a);
        }
    }

    /* renamed from: b */
    public void m4743b(AbstractC0387a abstractC0387a) {
        if (!this.f3194i.contains(abstractC0387a)) {
            this.f3194i.add(abstractC0387a);
        }
    }

    /* renamed from: a */
    public void m4767a(C0424b c0424b) {
        if (c0424b != null && c0424b.f2698b != 0) {
            if (this.f3182gm) {
                GameEngine.m1120g("usesCreditResources:" + c0424b);
            }
            this.f3181gl = true;
        }
    }

    /* renamed from: i */
    public C0399m m4723i(String str) {
        Iterator it = this.f3223az.iterator();
        while (it.hasNext()) {
            C0399m c0399m = (C0399m) it.next();
            if (c0399m.m5292b().equalsIgnoreCase(str)) {
                return c0399m;
            }
        }
        return null;
    }

    /* renamed from: j */
    public C0428a m4721j(String str) {
        C0428a m5155a = C0428a.m5155a(str);
        if (m5155a != null) {
            return m5155a;
        }
        return m4719k(str);
    }

    /* renamed from: k */
    public C0428a m4719k(String str) {
        Iterator it = this.f3195j.iterator();
        while (it.hasNext()) {
            C0437d c0437d = (C0437d) it.next();
            if (c0437d.f2771a.equalsIgnoreCase(str)) {
                return c0437d.f2772b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0437d m4766a(C0428a c0428a) {
        Iterator it = this.f3195j.iterator();
        while (it.hasNext()) {
            C0437d c0437d = (C0437d) it.next();
            if (c0437d.f2772b == c0428a) {
                return c0437d;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0416a m4765a(C0448g c0448g) {
        Iterator it = this.f3197l.iterator();
        while (it.hasNext()) {
            C0416a c0416a = (C0416a) it.next();
            if (c0416a.f2670g == c0448g) {
                return c0416a;
            }
        }
        return null;
    }

    /* renamed from: l */
    public C0416a m4717l(String str) {
        Iterator it = this.f3197l.iterator();
        while (it.hasNext()) {
            C0416a c0416a = (C0416a) it.next();
            if (c0416a.f2670g.f2833a.equals(str)) {
                return c0416a;
            }
        }
        return null;
    }

    /* renamed from: y */
    public boolean m4697y() {
        return this.f3181gl;
    }

    /* renamed from: t */
    public String m4702t() {
        if (this.f2917I != null) {
            return this.f2917I.m1846a();
        }
        return null;
    }

    /* renamed from: a */
    public static void m4761a(C0859ar c0859ar) {
        c0859ar.m1549e("customUnits");
        c0859ar.mo1487a(1);
        c0859ar.mo1487a(f3185d.size());
        Iterator it = f3185d.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            c0859ar.m1553c(c0453l.f2920L);
            c0859ar.mo1487a(c0453l.f2915G);
            c0859ar.mo1482a(true);
            c0859ar.m1557b(c0453l.m4702t());
            long j = 0;
            if (c0453l.f2917I != null && c0453l.f2917I.f5420k != 0) {
                j = c0453l.f2917I.f5420k;
            }
            c0859ar.m1577a(j);
            c0859ar.m1577a(0L);
        }
        c0859ar.mo1485a("customUnits");
    }

    /* renamed from: a */
    public static void m4769a(C0343aa c0343aa, HashMap hashMap) {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!(c0343aa.f2151a == null)) {
            for (C0344ab c0344ab : hashMap.values()) {
                if (c0344ab.f2158b == 0 && c0344ab.f2160d == 0 && c0344ab.f2159c > 0) {
                    arrayList.add(c0344ab);
                } else if (c0344ab.f2159c > 0 || c0344ab.f2160d > 0) {
                    arrayList2.add(c0344ab);
                }
            }
            String str2 = null;
            String str3 = VariableScope.nullOrMissingString;
            if (arrayList.size() > 0) {
                String str4 = VariableScope.nullOrMissingString;
                boolean z = true;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0344ab c0344ab2 = (C0344ab) it.next();
                    if (z) {
                        z = false;
                    } else {
                        str4 = str4 + ", \n";
                    }
                    str4 = str4 + "'" + c0344ab2.f2157a + "'";
                }
                String m2301b = CommonUtils.m2301b(str4, 200);
                if (arrayList.size() == 1) {
                    str2 = "Missing 1 mod.";
                    str = "Missing mod: '" + ((C0344ab) arrayList.get(0)).f2157a + "'";
                } else {
                    str2 = "Missing " + arrayList.size() + " mods";
                    str = "missing mods: " + m2301b;
                }
                str3 = str + "\n Required by this server.";
                if (arrayList2.size() > 0) {
                    str3 = str3 + "\n and " + arrayList2.size() + " mods are different.";
                }
            } else if (arrayList2.size() > 0) {
                String str5 = VariableScope.nullOrMissingString;
                boolean z2 = true;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C0344ab c0344ab3 = (C0344ab) it2.next();
                    if (z2) {
                        z2 = false;
                    } else {
                        str5 = str5 + ", \n";
                    }
                    str5 = str5 + "'" + c0344ab3.f2157a + "'";
                }
                str2 = "Different mod data.";
                str3 = "Different mod data for: " + CommonUtils.m2301b(str5, 200) + " \n Check these mods are the same version as the server you are connecting to.";
            } else {
                GameEngine.PrintLog("Skipping nice message: completelyMissedMods:" + arrayList.size() + " differentMods:" + arrayList2.size());
            }
            if (str2 != null) {
                C0401bb c0401bb = new C0401bb(str3, VariableScope.nullOrMissingString);
                c0401bb.f2487a = str2;
                throw c0401bb;
            }
        }
        String str6 = "from internal units";
        if (c0343aa.f2151a != null) {
            str6 = "from mod:'" + c0343aa.f2151a + "'";
        }
        C0824b m1858e = GameEngine.getInstance().f6118bZ.m1858e(c0343aa.f2151a);
        if (m1858e != null) {
            if (!m1858e.m1828m()) {
                str6 = str6 + " (You seem to have this mod but it is not enabled)";
            } else {
                str6 = str6 + " (You seem to have this mod but it might be a different version)";
            }
        }
        if (c0343aa.f2154d == -1) {
            throw new C0401bb("The server requires the unit:" + c0343aa.f2152b + " that was not found " + str6, VariableScope.nullOrMissingString);
        }
        throw new C0401bb("Found unit:" + c0343aa.f2152b + " but it does not match the server's copy " + str6, "checksum c:" + c0343aa.f2154d + " s:" + c0343aa.f2153c);
    }

    /* renamed from: a */
    public static void m4760a(C0876k c0876k) {
        c0876k.m1460b("customUnits");
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            boolean z = false;
            if (c0876k.m1454f() >= 2) {
                z = c0876k.m1455e();
                c0876k.m1455e();
            }
            int m1454f = c0876k.m1454f();
            for (int i = 0; i < m1454f; i++) {
                String m1448l = c0876k.m1448l();
                int m1454f2 = c0876k.m1454f();
                c0876k.m1455e();
                String m1450j = c0876k.m1450j();
                c0876k.m1451i();
                c0876k.m1451i();
                String str = null;
                if (z) {
                    str = c0876k.m1450j();
                }
                C0453l c0453l = null;
                int i2 = -1;
                C0453l c0453l2 = null;
                synchronized (f3184c) {
                    Iterator it = f3184c.iterator();
                    while (it.hasNext()) {
                        C0453l c0453l3 = (C0453l) it.next();
                        if (m1448l.equals(c0453l3.f2920L)) {
                            if (m1454f2 == c0453l3.f2915G) {
                                c0453l = c0453l3;
                            } else {
                                c0453l2 = c0453l3;
                                i2 = c0453l3.f2915G;
                            }
                        }
                    }
                }
                C0344ab c0344ab = (C0344ab) hashMap.get(m1450j);
                if (c0344ab == null) {
                    c0344ab = new C0344ab(m1450j);
                    hashMap.put(m1450j, c0344ab);
                }
                if (c0453l == null) {
                    if (c0453l2 != null) {
                        c0344ab.f2160d++;
                    } else {
                        c0344ab.f2159c++;
                    }
                    C0343aa c0343aa = new C0343aa();
                    c0343aa.f2151a = m1450j;
                    c0343aa.f2152b = m1448l;
                    c0343aa.f2154d = i2;
                    c0343aa.f2153c = m1454f2;
                    c0343aa.f2156f = c0453l2;
                    c0343aa.f2155e = str;
                    arrayList2.add(c0343aa);
                    GameEngine.m1145b(c0343aa.m5436a());
                } else {
                    c0344ab.f2158b++;
                    arrayList.add(c0453l);
                }
            }
            if (arrayList2.size() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C0343aa c0343aa2 = (C0343aa) it2.next();
                    if (c0343aa2.f2151a == null) {
                        m4769a(c0343aa2, hashMap);
                    }
                }
                m4769a((C0343aa) arrayList2.get(0), hashMap);
            }
            f3186e = arrayList;
            c0876k.m1456d("customUnits");
        } catch (Throwable th) {
            c0876k.m1456d("customUnits");
            throw th;
        }
    }

    /* renamed from: b */
    public void m4744b(InterfaceC0303as interfaceC0303as) {
        if (!this.f3263fG.contains(interfaceC0303as) && interfaceC0303as != this) {
            this.f3263fG.add(interfaceC0303as);
        }
        if (interfaceC0303as instanceof C0453l) {
            Iterator it = ((C0453l) interfaceC0303as).f3263fG.iterator();
            while (it.hasNext()) {
                InterfaceC0303as interfaceC0303as2 = (InterfaceC0303as) it.next();
                if (!this.f3263fG.contains(interfaceC0303as2) && interfaceC0303as != this) {
                    this.f3263fG.add(interfaceC0303as2);
                }
            }
        }
    }

    /* renamed from: a */
    public static C0453l m4764a(C0453l c0453l) {
        Iterator it = f3185d.iterator();
        while (it.hasNext()) {
            C0453l c0453l2 = (C0453l) it.next();
            if (c0453l.f2912C.equals(c0453l2.f2912C)) {
                return c0453l2;
            }
        }
        Iterator it2 = f3185d.iterator();
        while (it2.hasNext()) {
            C0453l c0453l3 = (C0453l) it2.next();
            if (c0453l.f2920L.equals(c0453l3.f2920L)) {
                return c0453l3;
            }
        }
        return null;
    }

    /* renamed from: A */
    public static void m4779A() {
        Iterator it = Unit.m5870bF().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof C0451j) {
                C0451j c0451j = (C0451j) unit;
                C0453l c0453l = c0451j.f2861w;
                if (!f3185d.contains(c0453l)) {
                    C0453l m4764a = m4764a(c0453l);
                    if (m4764a == null) {
                        m4764a = f2901b;
                    }
                    if (m4764a != null) {
                        c0451j.m4983a(m4764a, false, true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public BitmapOrTexture[] m4759a(BitmapOrTexture bitmapOrTexture, EnumC0198o enumC0198o) {
        boolean z = false;
        if ((this.f2917I != null || this.f3118ez) && !GameEngine.getInstance().f6109bQ.disableModLazyLoad) {
            z = true;
        }
        if ((this.f3023ct && this.f3024cu) || this.f3029cz) {
            z = true;
        }
        BitmapOrTexture[] m6380a = Team.m6380a(bitmapOrTexture, enumC0198o, z);
        for (int i = 0; i < m6380a.length; i++) {
            if (z && this.f2917I != null && this.f3118ez && i == 1) {
                m6380a[i].mo388w();
            }
        }
        C0348af.m5403a(m6380a);
        return m6380a;
    }

    /* renamed from: a */
    public BitmapOrTexture m4758a(C1072ab c1072ab, String str, String str2) {
        return m4757a(c1072ab, str, str2, this.f2930aa);
    }

    /* renamed from: a */
    public BitmapOrTexture m4757a(C1072ab c1072ab, String str, String str2, boolean z) {
        return m4751a(this.f2914E, c1072ab.m681b(str, str2, (String) null), z, str, str2);
    }

    /* renamed from: a */
    public BitmapOrTexture m4751a(String str, String str2, boolean z, String str3, String str4) {
        return C0348af.m5406a(str, str2, z, this, str3, str4);
    }

    /* renamed from: m */
    public static InterfaceC0303as m4715m(String str) {
        for (InterfaceC0303as interfaceC0303as : f3187f.keySet()) {
            if (interfaceC0303as.mo5706i().equals(str)) {
                return (InterfaceC0303as) f3187f.get(interfaceC0303as);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static InterfaceC0303as m4738c(InterfaceC0303as interfaceC0303as) {
        return (InterfaceC0303as) f3187f.get(interfaceC0303as);
    }

    /* renamed from: n */
    public static C0453l m4713n(String str) {
        Iterator it = f3185d.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            if (str.equals(c0453l.f2920L)) {
                return c0453l;
            }
        }
        Iterator it2 = f3185d.iterator();
        while (it2.hasNext()) {
            C0453l c0453l2 = (C0453l) it2.next();
            if (c0453l2.f3205M.contains(str)) {
                return c0453l2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0451j m4747a(boolean z, C0453l c0453l) {
        return new C0451j(z, c0453l);
    }

    /* renamed from: o */
    public void m4711o(String str) {
        if (C1077ag.m614i(str)) {
            return;
        }
        this.f3196k.add(new C0468z(str));
    }

    /* renamed from: p */
    public void m4709p(String str) {
        C0348af.m5413a(m4724i(), new C0412bm(str), this);
    }

    /* renamed from: q */
    public void m4707q(String str) {
        String str2 = "Warning (on " + m4746b() + "): " + str;
        GameEngine.m1145b(str2);
        this.f3278gn.add(str);
        if (this.f2917I == null) {
            GameEngine.getInstance().m1192a(str2, 1);
            if (GameEngine.f6198aT) {
                GameEngine.PrintLog("Crashing on allowed unit warning because automated testing is active");
                throw new RuntimeException(str2);
            }
        }
    }

    /* renamed from: r */
    public void m4705r(String str) {
        String str2 = "Warning (on " + m4746b() + "): " + str;
        GameEngine.m1145b(str2);
        this.f3278gn.add(str);
        if (this.f2917I == null) {
            GameEngine.getInstance().m1192a(str2, 1);
            if (GameEngine.f6198aT) {
                GameEngine.PrintLog("Crashing on allowed unit warning because automated testing is active");
                throw new RuntimeException(str2);
            }
            return;
        }
        this.f2917I.m1840b(str2);
    }

    /* renamed from: z */
    public BitmapOrTexture m4696z() {
        return this.f2941av;
    }

    /* renamed from: E */
    public static void m4775E() {
        GameEngine gameEngine = GameEngine.getInstance();
        Iterator it = f3185d.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            EnumC0345ac enumC0345ac = c0453l.f2926S;
            if (enumC0345ac != null) {
                if (enumC0345ac == EnumC0345ac.emptyResourcePools_asNeutral || enumC0345ac == EnumC0345ac.emptyOrOccupiedResourcePools_asNeutral) {
                    Iterator it2 = gameEngine.f6104bL.f837A.iterator();
                    while (it2.hasNext()) {
                        Point point = (Point) it2.next();
                        Unit m4774a = c0453l.m4774a();
                        m4774a.mo3120b(Team.f1370i);
                        gameEngine.f6104bL.m6648a(point.f224a, point.f225b);
                        m4774a.f6951ek = gameEngine.f6104bL.f800T;
                        m4774a.f6952el = gameEngine.f6104bL.f801U;
                        m4774a.f6951ek += m4774a.m5823cX();
                        m4774a.f6952el += m4774a.m5822cY();
                        if (enumC0345ac == EnumC0345ac.emptyResourcePools_asNeutral && (m4774a instanceof AbstractC0623y) && ((AbstractC0623y) m4774a).m3199a((Unit) null, (Team) null)) {
                            m4774a.m5812ch();
                        } else {
                            Team.m6353c(m4774a);
                        }
                    }
                } else if (enumC0345ac == EnumC0345ac.mapCenter_asNeutral || enumC0345ac == EnumC0345ac.mapCenter_eachActiveTeam) {
                    if (enumC0345ac == EnumC0345ac.mapCenter_asNeutral) {
                        Unit m4774a2 = c0453l.m4774a();
                        m4774a2.mo3120b(Team.f1370i);
                        gameEngine.f6104bL.m6617b(gameEngine.f6104bL.m6589i() / 2.0f, gameEngine.f6104bL.m6588j() / 2.0f);
                        m4774a2.f6951ek = gameEngine.f6104bL.f800T;
                        m4774a2.f6952el = gameEngine.f6104bL.f801U;
                        m4774a2.f6951ek += m4774a2.m5823cX();
                        m4774a2.f6952el += m4774a2.m5822cY();
                        Team.m6353c(m4774a2);
                    }
                    if (enumC0345ac == EnumC0345ac.mapCenter_eachActiveTeam) {
                        Iterator it3 = Team.m6358c().iterator();
                        while (it3.hasNext()) {
                            Team team = (Team) it3.next();
                            if (team.m6375a(true, false) > 0) {
                                Unit m4774a3 = c0453l.m4774a();
                                m4774a3.mo3120b(team);
                                gameEngine.f6104bL.m6617b(gameEngine.f6104bL.m6589i() / 2.0f, gameEngine.f6104bL.m6588j() / 2.0f);
                                m4774a3.f6951ek = gameEngine.f6104bL.f800T;
                                m4774a3.f6952el = gameEngine.f6104bL.f801U;
                                m4774a3.f6951ek += m4774a3.m5823cX();
                                m4774a3.f6952el += m4774a3.m5822cY();
                                Team.m6353c(m4774a3);
                            }
                        }
                    }
                } else if (enumC0345ac == EnumC0345ac.spawnPoint_eachActiveTeam) {
                    Iterator it4 = Team.m6358c().iterator();
                    while (it4.hasNext()) {
                        Team team2 = (Team) it4.next();
                        if (team2.m6375a(true, false) > 0) {
                            PointF pointF = new PointF();
                            C1117y.m497a(team2, pointF);
                            Unit m4774a4 = c0453l.m4774a();
                            m4774a4.mo3120b(team2);
                            gameEngine.f6104bL.m6617b(pointF.x, pointF.y);
                            m4774a4.f6951ek = gameEngine.f6104bL.f800T;
                            m4774a4.f6952el = gameEngine.f6104bL.f801U;
                            m4774a4.f6951ek += m4774a4.m5823cX();
                            m4774a4.f6952el += m4774a4.m5822cY();
                            Team.m6353c(m4774a4);
                        }
                    }
                } else {
                    GameEngine.m1145b("onNewMapSpawn unhandled: " + c0453l.f2926S);
                }
            }
        }
    }

    /* renamed from: a */
    public int m4771a(Unit unit) {
        int i = 0;
        if (this.f2951aK > 0.0f) {
            return (int) this.f2951aK;
        }
        if (this.f2949aI && this.f2947aG && unit.mo3492y() < 20) {
            i = 0 + 17;
        }
        return i;
    }

    /* renamed from: a */
    public void m4755a(String str, int i, String str2, String str3) {
        if (this.f2917I == null || this.f2917I.f5432w >= i) {
            return;
        }
        if (this.f2917I.f5431v == null) {
            throw new C0412bm("[" + str2 + "] minVersion of " + str + " is required to be set in mod-info.txt at the root of this mod to use " + str3);
        }
        try {
            C0823a.m1871a(str, this.f2917I.f5431v);
            this.f2917I.f5432w = i;
        } catch (C0412bm e) {
            throw new C0412bm("[" + str2 + "]" + str3 + " " + e.getMessage() + " to be set as minVersion in mod-info.txt");
        }
    }

    /* renamed from: s */
    public static InterfaceC0303as m4703s(String str) {
        return m4750a(str, true);
    }

    /* renamed from: a */
    public static InterfaceC0303as m4750a(String str, boolean z) {
        InterfaceC0303as m5730a = UnitType.m5730a(str, z);
        if (m5730a == UnitType.f1784Y) {
            return UnitType.f1741h;
        }
        return m5730a;
    }
}

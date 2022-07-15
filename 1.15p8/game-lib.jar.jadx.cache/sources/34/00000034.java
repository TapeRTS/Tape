package com.corrodinggames.rts.game.units.custom;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.HueColor;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.C0292an;
import com.corrodinggames.rts.game.units.EnumC0295b;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p015a.C0327d;
import com.corrodinggames.rts.game.units.custom.p015a.C0330g;
import com.corrodinggames.rts.game.units.custom.p017b.AbstractC0375a;
import com.corrodinggames.rts.game.units.custom.p017b.C0383i;
import com.corrodinggames.rts.game.units.custom.p018c.C0399a;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.custom.p020e.C0411a;
import com.corrodinggames.rts.game.units.custom.p020e.C0419c;
import com.corrodinggames.rts.game.units.custom.p020e.C0421e;
import com.corrodinggames.rts.game.units.land.LandingCraft;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.C0225z;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.ModLoader.Mod;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0915ag;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/l.class */
public final class CustomUnitMetadata implements UnitType {
    // 可能用于引擎上下文处理

    /* renamed from: b */
    public static CustomUnitMetadata frontCustomUnitMetadata;

    /* renamed from: r */
    public boolean f2999r;

    /* renamed from: s */
    public boolean f3000s;

    /* renamed from: t */
    public boolean f3001t;

    /* renamed from: u */
    public boolean f3002u;

    /* renamed from: v */
    public boolean f3003v;

    /* renamed from: w */
    public boolean f3004w;

    /* renamed from: x */
    public boolean f3005x;

    /* renamed from: y */
    public boolean f3006y;

    /* renamed from: z */
    public boolean f3007z;

    /* renamed from: A */
    public Rect f2731A;

    /* renamed from: B */
    public String f2732B;

    /* renamed from: C */
    public String f2733C;

    /* renamed from: E */
    public int f2734E;

    /* renamed from: F */
    public String f2735F;

    /* renamed from: G */
    public Mod f2736G;

    /* renamed from: H */
    public String f2737H;

    /* renamed from: I */
    public String root;

    /* renamed from: J */
    public String core_name;

    /* renamed from: L */
    public ValueList core_tags;

    /* renamed from: M */
    public ValueList f2741M;

    /* renamed from: N */
    public String f2742N;

    /* renamed from: O */
    public int core_strictLevel;

    /* renamed from: P */
    public int f2744P;

    /* renamed from: Q */
    public OnMapSpawnType core_onNewMapSpawn;

    /* renamed from: V */
    public int graphics_default_frame;

    /* renamed from: W */
    public LogicBoolean graphics_isVisible;

    /* renamed from: X */
    public boolean graphics_imageSmoothingWhenZoomedIn;

    /* renamed from: Y */
    public boolean graphics_imageSmoothing;

    /* renamed from: Z */
    public HueColor hueColor;

    /* renamed from: ab */
    public int imageWidth;

    /* renamed from: ac */
    public int imageHeight;

    /* renamed from: ad */
    public int graphics_image_offsetX;

    /* renamed from: ae */
    public int graphics_image_offsetY;

    /* renamed from: ag */
    public boolean graphics_image_back_always_use_full_image;

    /* renamed from: ak */
    public boolean graphics_image_shadow_frames;

    /* renamed from: am */
    public BitmapOrTexture[] f2779am;

    /* renamed from: aq */
    public BitmapOrTexture f2780aq;

    /* renamed from: av */
    public boolean f2781av;

    /* renamed from: aw */
    public TextWrapper core_displayText;

    /* renamed from: ax */
    public TextWrapper core_displayDescription;

    /* renamed from: ay */
    public String core_displayLocaleKey;

    /* renamed from: az */
    public boolean core_showInEditor;

    /* renamed from: aB */
    public boolean f2751aB;

    /* renamed from: aC */
    public boolean f2752aC;

    /* renamed from: aD */
    public boolean f2753aD;

    /* renamed from: aE */
    public boolean f2754aE;

    /* renamed from: aF */
    public float f2755aF;

    /* renamed from: aG */
    public boolean f2756aG;

    /* renamed from: aH */
    public boolean f2757aH;

    /* renamed from: aI */
    public boolean f2758aI;

    /* renamed from: aJ */
    public boolean f2759aJ;

    /* renamed from: aK */
    public boolean f2760aK;

    /* renamed from: aL */
    public boolean f2761aL;

    /* renamed from: aM */
    public ValueList f2762aM;

    /* renamed from: aN */
    public boolean f2763aN;

    /* renamed from: aO */
    public boolean f2764aO;

    /* renamed from: aP */
    public boolean f2765aP;

    /* renamed from: aQ */
    public boolean f2766aQ;

    /* renamed from: aS */
    public boolean f2767aS;

    /* renamed from: aU */
    public boolean f2768aU;

    /* renamed from: aV */
    public float f2769aV;

    /* renamed from: aW */
    public float f2770aW;

    /* renamed from: aY */
    public float f2771aY;

    /* renamed from: aZ */
    public float f2772aZ;

    /* renamed from: ba */
    public float f2808ba;

    /* renamed from: bb */
    public boolean f2809bb;

    /* renamed from: bc */
    public float f2810bc;

    /* renamed from: bd */
    public boolean f2811bd;

    /* renamed from: be */
    public boolean f2812be;

    /* renamed from: bf */
    public boolean f2813bf;

    /* renamed from: bg */
    public boolean f2814bg;

    /* renamed from: bh */
    public int f2815bh;

    /* renamed from: bi */
    public boolean f2816bi;

    /* renamed from: bj */
    public float f2817bj;

    /* renamed from: bk */
    public float f2818bk;

    /* renamed from: bl */
    public int f2819bl;

    /* renamed from: bm */
    public boolean f2820bm;

    /* renamed from: bn */
    public boolean f2821bn;

    /* renamed from: bo */
    public EnumC0588v f2822bo;

    /* renamed from: bp */
    public boolean f2823bp;

    /* renamed from: bq */
    public boolean f2824bq;

    /* renamed from: br */
    public C0449y f2825br;

    /* renamed from: bs */
    public C0449y f2826bs;

    /* renamed from: bt */
    public C0449y f2827bt;

    /* renamed from: bu */
    public C0392bi f2828bu;

    /* renamed from: bx */
    public C0396bm f2829bx;

    /* renamed from: by */
    public boolean f2830by;

    /* renamed from: bz */
    public boolean f2831bz;

    /* renamed from: bA */
    public boolean f2786bA;

    /* renamed from: bB */
    public boolean f2787bB;

    /* renamed from: bE */
    boolean f2788bE;

    /* renamed from: bF */
    boolean f2789bF;

    /* renamed from: bG */
    boolean f2790bG;

    /* renamed from: bH */
    boolean f2791bH;

    /* renamed from: bI */
    boolean f2792bI;

    /* renamed from: bJ */
    C0449y f2793bJ;

    /* renamed from: bK */
    C0449y f2794bK;

    /* renamed from: bL */
    boolean f2795bL;

    /* renamed from: bM */
    float f2796bM;

    /* renamed from: bN */
    boolean f2797bN;

    /* renamed from: bO */
    float f2798bO;

    /* renamed from: bP */
    C0449y f2799bP;

    /* renamed from: bQ */
    C0449y f2800bQ;

    /* renamed from: bR */
    boolean f2801bR;

    /* renamed from: bS */
    float f2802bS;

    /* renamed from: bT */
    C0449y f2803bT;

    /* renamed from: bU */
    C0449y f2804bU;

    /* renamed from: bX */
    public boolean f2805bX;

    /* renamed from: bY */
    public boolean f2806bY;

    /* renamed from: bZ */
    public boolean f2807bZ;

    /* renamed from: ca */
    public C0407b f2854ca;

    /* renamed from: cb */
    public C0407b f2855cb;

    /* renamed from: cc */
    public C0407b f2856cc;

    /* renamed from: ce */
    public int f2857ce;

    /* renamed from: cf */
    public boolean f2858cf;

    /* renamed from: cj */
    public int f2859cj;

    /* renamed from: ck */
    public float f2860ck;

    /* renamed from: cn */
    public LogicBoolean f2861cn;

    /* renamed from: co */
    public boolean core_stayNeutral;

    /* renamed from: cp */
    public boolean core_createNeutral;

    /* renamed from: cq */
    public boolean core_whileNeutralTransportAnyTeam;

    /* renamed from: cr */
    public boolean core_whileNeutralConvertToTransportedTeam;

    /* renamed from: cs */
    public boolean core_convertToNeutralIfNotTransporting;

    /* renamed from: ct */
    public boolean core_createOnAggressiveTeam;

    /* renamed from: cu */
    public float f2868cu;

    /* renamed from: cv */
    public int f2869cv;

    /* renamed from: cw */
    public ValueList f2870cw;

    /* renamed from: cy */
    public float f2871cy;

    /* renamed from: cz */
    public float f2872cz;

    /* renamed from: cB */
    public boolean f2832cB;

    /* renamed from: cC */
    public float f2833cC;

    /* renamed from: cD */
    public boolean f2834cD;

    /* renamed from: cE */
    public float f2835cE;

    /* renamed from: cF */
    public float f2836cF;

    /* renamed from: cG */
    public boolean f2837cG;

    /* renamed from: cH */
    public float f2838cH;

    /* renamed from: cI */
    public TextWrapper f2839cI;

    /* renamed from: cJ */
    public boolean f2840cJ;

    /* renamed from: cK */
    public float f2841cK;

    /* renamed from: cL */
    public int f2842cL;

    /* renamed from: cP */
    public float f2843cP;

    /* renamed from: cQ */
    public float f2844cQ;

    /* renamed from: cR */
    public boolean f2845cR;

    /* renamed from: cS */
    public int f2846cS;

    /* renamed from: cT */
    public float f2847cT;

    /* renamed from: cU */
    public int f2848cU;

    /* renamed from: cV */
    public int f2849cV;

    /* renamed from: cW */
    public int f2850cW;

    /* renamed from: cX */
    public float f2851cX;

    /* renamed from: cY */
    public float f2852cY;

    /* renamed from: cZ */
    public Float f2853cZ;

    /* renamed from: da */
    public float f2895da;

    /* renamed from: db */
    public boolean f2896db;

    /* renamed from: dc */
    public Float f2897dc;

    /* renamed from: dd */
    public C0392bi f2898dd;

    /* renamed from: de */
    public C0392bi f2899de;

    /* renamed from: df */
    public C0392bi f2900df;

    /* renamed from: dk */
    C0423f f2901dk;

    /* renamed from: dl */
    C0423f f2902dl;

    /* renamed from: dm */
    C0423f f2903dm;

    /* renamed from: dn */
    C0423f f2904dn;

    /* renamed from: do */
    C0423f f2905do;

    /* renamed from: dp */
    C0423f f2906dp;

    /* renamed from: dq */
    public boolean f2907dq;

    /* renamed from: dr */
    public boolean f2908dr;

    /* renamed from: ds */
    public boolean f2909ds;

    /* renamed from: dt */
    public boolean f2910dt;

    /* renamed from: du */
    public C0394bk f2911du;

    /* renamed from: dv */
    public float f2912dv;

    /* renamed from: dw */
    C0437m f2913dw;

    /* renamed from: dx */
    public float f2914dx;

    /* renamed from: dy */
    public Boolean f2915dy;

    /* renamed from: dz */
    public boolean f2916dz;

    /* renamed from: dA */
    public float f2873dA;

    /* renamed from: dB */
    public float f2874dB;

    /* renamed from: dC */
    public float f2875dC;

    /* renamed from: dD */
    public boolean f2876dD;

    /* renamed from: dE */
    public boolean f2877dE;

    /* renamed from: dF */
    public boolean f2878dF;

    /* renamed from: dH */
    public float f2879dH;

    /* renamed from: dI */
    public float f2880dI;

    /* renamed from: dM */
    public boolean f2881dM;

    /* renamed from: dN */
    public boolean f2882dN;

    /* renamed from: dO */
    public int f2883dO;

    /* renamed from: dP */
    public float f2884dP;

    /* renamed from: dQ */
    public float f2885dQ;

    /* renamed from: dR */
    public EnumC0295b f2886dR;

    /* renamed from: dS */
    public float f2887dS;

    /* renamed from: dT */
    public float f2888dT;

    /* renamed from: dU */
    public boolean f2889dU;

    /* renamed from: dV */
    public boolean f2890dV;

    /* renamed from: dW */
    public boolean f2891dW;

    /* renamed from: dX */
    public boolean f2892dX;

    /* renamed from: dY */
    public float f2893dY;

    /* renamed from: dZ */
    public float f2894dZ;

    /* renamed from: ea */
    public float f2936ea;

    /* renamed from: ed */
    public float f2937ed;

    /* renamed from: ee */
    public boolean f2938ee;

    /* renamed from: ef */
    public LogicBoolean f2939ef;

    /* renamed from: eg */
    public LogicBoolean f2940eg;

    /* renamed from: eh */
    public LogicBoolean f2941eh;

    /* renamed from: ei */
    public LogicBoolean f2942ei;

    /* renamed from: ej */
    public boolean f2943ej;

    /* renamed from: ek */
    public ValueList f2944ek;

    /* renamed from: el */
    public ValueList f2945el;

    /* renamed from: em */
    public boolean f2946em;

    /* renamed from: en */
    public boolean f2947en;

    /* renamed from: eo */
    public float f2948eo;

    /* renamed from: ep */
    public boolean f2949ep;

    /* renamed from: eq */
    public int f2950eq;

    /* renamed from: er */
    public boolean f2951er;

    /* renamed from: es */
    public boolean core_isBio;

    /* renamed from: et */
    public boolean core_isBug;

    /* renamed from: eu */
    public boolean f2954eu;

    /* renamed from: ev */
    public float f2955ev;

    /* renamed from: ew */
    public boolean core_isPickableStartingUnit;

    /* renamed from: ex */
    public boolean core_startFallingWhenStartingUnit;

    /* renamed from: eC */
    public float f2917eC;

    /* renamed from: eD */
    public boolean f2918eD;

    /* renamed from: eE */
    public ValueList f2919eE;

    /* renamed from: eG */
    public boolean f2920eG;

    /* renamed from: eH */
    public boolean f2921eH;

    /* renamed from: eI */
    public boolean f2922eI;

    /* renamed from: eJ */
    public LogicBoolean f2923eJ;

    /* renamed from: eK */
    public LogicBoolean f2924eK;

    /* renamed from: eL */
    public LogicBoolean f2925eL;

    /* renamed from: eM */
    public boolean f2926eM;

    /* renamed from: eN */
    public float f2927eN;

    /* renamed from: eR */
    public LogicBoolean f2928eR;

    /* renamed from: eS */
    public LogicBoolean f2929eS;

    /* renamed from: eU */
    public C0385bb f2930eU;

    /* renamed from: eV */
    public MovementType f2931eV;

    /* renamed from: eW */
    public MovementType f2932eW;

    /* renamed from: eX */
    public boolean f2933eX;

    /* renamed from: eY */
    public boolean f2934eY;

    /* renamed from: eZ */
    public boolean f2935eZ;

    /* renamed from: fa */
    public ValueList f2970fa;

    /* renamed from: fb */
    public int f2971fb;

    /* renamed from: fc */
    public ValueList f2972fc;

    /* renamed from: fd */
    public ValueList f2973fd;

    /* renamed from: fe */
    public boolean f2974fe;

    /* renamed from: ff */
    public boolean f2975ff;

    /* renamed from: fg */
    public boolean f2976fg;

    /* renamed from: fh */
    public boolean f2977fh;

    /* renamed from: fi */
    public boolean f2978fi;

    /* renamed from: fj */
    public boolean f2979fj;

    /* renamed from: fk */
    public ValueList f2980fk;

    /* renamed from: fl */
    public boolean f2981fl;

    /* renamed from: fm */
    public int f2982fm;

    /* renamed from: fn */
    public int f2983fn;

    /* renamed from: fo */
    public float f2984fo;

    /* renamed from: fp */
    public int f2985fp;

    /* renamed from: fq */
    public float f2986fq;

    /* renamed from: fr */
    public float f2987fr;

    /* renamed from: fs */
    public float f2988fs;

    /* renamed from: ft */
    public int f2989ft;

    /* renamed from: fu */
    public int f2990fu;

    /* renamed from: fv */
    public boolean f2991fv;

    /* renamed from: fw */
    public ValueList f2992fw;

    /* renamed from: fx */
    public String f2993fx;

    /* renamed from: fy */
    public boolean f2994fy;

    /* renamed from: fB */
    public boolean f2958fB;

    /* renamed from: fC */
    public boolean f2959fC;

    /* renamed from: fD */
    public ValueList f2960fD;

    /* renamed from: fE */
    public boolean f2961fE;

    /* renamed from: fG */
    public C0388be[] f2962fG;

    /* renamed from: fM */
    boolean f2963fM;

    /* renamed from: fN */
    C0442r[] f2964fN;

    /* renamed from: fO */
    C0442r[] f2965fO;

    /* renamed from: fP */
    C0442r[] f2966fP;

    /* renamed from: fW */
    public boolean f2967fW;

    /* renamed from: fY */
    String f2968fY;

    /* renamed from: fZ */
    String f2969fZ;

    /* renamed from: ga */
    HashMap f2995ga;

    /* renamed from: gb */
    C0292an[] f2996gb;

    /* renamed from: gf */
    public boolean f2997gf;

    /* renamed from: gg */
    public boolean core_logIfCreditResourceUsed;

    /* renamed from: a */
    public static final Rect f3008a = new Rect();

    /* renamed from: c */
    public static final ArrayList f3009c = new ArrayList();

    /* renamed from: d */
    public static ArrayList instances = new ArrayList();

    /* renamed from: e */
    public static ArrayList f3011e = null;

    /* renamed from: f */
    public static final HashMap f3012f = new HashMap();

    /* renamed from: g */
    public static ArrayList f3013g = new ArrayList();

    /* renamed from: eP */
    public static LogicBoolean f3014eP = LogicBoolean.create(null, "if not self.isOverLiquid() and not self.isMoving()");

    /* renamed from: eQ */
    public static LogicBoolean f3015eQ = LogicBoolean.create(null, "if not self.isOverLiquid()");

    /* renamed from: fS */
    static final Effect[] f3016fS = new Effect[0];

    /* renamed from: fT */
    static final Effect[] f3017fT = new Effect[0];

    /* renamed from: h */
    public final ObjectVector f3018h = new ObjectVector();

    /* renamed from: i */
    public final ObjectVector f3019i = new ObjectVector();

    /* renamed from: j */
    public final ObjectVector f3020j = new ObjectVector();

    /* renamed from: k */
    final ObjectVector f3021k = new ObjectVector();

    /* renamed from: l */
    public final ObjectVector f3022l = new ObjectVector();

    /* renamed from: m */
    public final ObjectVector f3023m = new ObjectVector();

    /* renamed from: n */
    public final ObjectVector f3024n = new ObjectVector();

    /* renamed from: o */
    public final ObjectVector f3025o = new ObjectVector();

    /* renamed from: p */
    final ObjectVector f3026p = new ObjectVector();

    /* renamed from: q */
    public final VariableScope.VariableMapping f3027q = new VariableScope.VariableMapping();

    /* renamed from: D */
    public boolean f3028D = true;

    /* renamed from: K */
    public ObjectVector core_altNames = new ObjectVector();

    /* renamed from: R */
    public int graphics_total_frames = 1;

    /* renamed from: S */
    public int f3031S = Integer.MAX_VALUE;

    /* renamed from: T */
    public int graphics_frame_width = -1;

    /* renamed from: U */
    public int graphics_frame_height = -1;

    /* renamed from: aa */
    public BitmapOrTexture graphics_image = null;

    /* renamed from: af */
    public BitmapOrTexture graphics_image_back = null;

    /* renamed from: ah */
    public BitmapOrTexture graphics_image_wreak = null;

    /* renamed from: ai */
    public BitmapOrTexture graphics_image_turret = null;

    /* renamed from: aj */
    public BitmapOrTexture f3038aj = null;

    /* renamed from: al */
    public BitmapOrTexture[] f3039al = new BitmapOrTexture[10];

    /* renamed from: an */
    public BitmapOrTexture[] f3040an = null;

    /* renamed from: ao */
    public BitmapOrTexture f3041ao = null;

    /* renamed from: ap */
    public boolean f3042ap = false;

    /* renamed from: ar */
    public C0371ax[] f3043ar = null;

    /* renamed from: as */
    public boolean f3044as = false;

    /* renamed from: at */
    public boolean f3045at = false;

    /* renamed from: au */
    public final ObjectVector f3046au = new ObjectVector();

    /* renamed from: aA */
    public float core_globalScale = 1.0f;

    /* renamed from: aR */
    public int f3048aR = -1;

    /* renamed from: aT */
    public int f3049aT = -1;

    /* renamed from: aX */
    public float f3050aX = 1.0f;

    /* renamed from: bv */
    public int f3051bv = -1;

    /* renamed from: bw */
    public int f3052bw = -1;

    /* renamed from: bC */
    public float f3053bC = 1.0f;

    /* renamed from: bD */
    public float f3054bD = 1.0f;

    /* renamed from: bV */
    public float f3055bV = 60.0f;

    /* renamed from: bW */
    public EnumC0443s f3056bW = EnumC0443s.f3157a;

    /* renamed from: cd */
    public float f3057cd = 0.001f;

    /* renamed from: cg */
    public C0407b f3058cg = C0407b.f2549a;

    /* renamed from: ch */
    public C0421e f3059ch = C0421e.f2634a;

    /* renamed from: ci */
    public C0421e f3060ci = C0421e.f2634a;

    /* renamed from: cl */
    public C0407b f3061cl = C0407b.f2549a;

    /* renamed from: cm */
    public C0407b f3062cm = C0407b.f2549a;

    /* renamed from: cx */
    public int f3063cx = -2;

    /* renamed from: cA */
    public C0346ap f3064cA = new C0346ap(true);

    /* renamed from: cM */
    public Rect f3065cM = new Rect();

    /* renamed from: cN */
    public Rect f3066cN = new Rect();

    /* renamed from: cO */
    public Rect f3067cO = new Rect();

    /* renamed from: dg */
    ObjectVector f3068dg = new ObjectVector();

    /* renamed from: dh */
    C0423f f3069dh = new C0423f("moving");

    /* renamed from: di */
    C0423f f3070di = new C0423f("idle");

    /* renamed from: dj */
    C0423f f3071dj = new C0423f("attack");

    /* renamed from: dG */
    public float f3072dG = 0.0f;

    /* renamed from: dJ */
    public float f3073dJ = -1.0f;

    /* renamed from: dK */
    public float f3074dK = 0.03f;

    /* renamed from: dL */
    public float f3075dL = 0.06f;

    /* renamed from: eb */
    public int f3076eb = -1;

    /* renamed from: ec */
    public int f3077ec = -1;

    /* renamed from: ey */
    public boolean f3078ey = false;

    /* renamed from: ez */
    public boolean f3079ez = false;

    /* renamed from: eA */
    public boolean f3080eA = false;

    /* renamed from: eB */
    public int f3081eB = 0;

    /* renamed from: eF */
    public ObjectVector f3082eF = new ObjectVector();

    /* renamed from: eO */
    public int f3083eO = 1;

    /* renamed from: eT */
    public boolean f3084eT = true;

    /* renamed from: fz */
    public float f3085fz = -1.0f;

    /* renamed from: fA */
    public ObjectVector f3086fA = new ObjectVector();

    /* renamed from: fF */
    public C0394bk[] f3087fF = null;

    /* renamed from: fH */
    ArrayList f3088fH = new ArrayList();

    /* renamed from: fI */
    ArrayList f3089fI = new ArrayList();

    /* renamed from: fJ */
    boolean f3090fJ = false;

    /* renamed from: fK */
    C0394bk f3091fK = null;

    /* renamed from: fL */
    ObjectVector f3092fL = new ObjectVector();

    /* renamed from: fQ */
    ArrayList f3093fQ = new ArrayList();

    /* renamed from: fR */
    ArrayList f3094fR = new ArrayList();

    /* renamed from: fU */
    ArrayList f3095fU = new ArrayList();

    /* renamed from: fV */
    ArrayList f3096fV = new ArrayList();

    /* renamed from: fX */
    int f3097fX = -1;

    /* renamed from: gc */
    C0225z f3098gc = new C0225z(this);

    /* renamed from: gd */
    ObjectVector f3099gd = new ObjectVector();

    /* renamed from: ge */
    ObjectVector f3100ge = new ObjectVector();

    /* renamed from: gh */
    ObjectVector f3101gh = new ObjectVector();

    /* renamed from: b */
    public String m3108b() {
        String str = this.f2732B;
        if (this.f2736G != null) {
            String str2 = this.f2736G.f5004m;
            if (str.startsWith(str2)) {
                str = str.substring(str2.length());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (str.startsWith("\\")) {
                    str = str.substring(1);
                }
            }
            str = str + " (in mod " + this.f2736G.getCurMods() + ")";
        }
        return str;
    }

    /* renamed from: a */
    public C0439o m3115a(String str, C0439o c0439o) {
        if (str != null) {
            C0439o c0439o2 = new C0439o(this);
            c0439o2.f3143a = str;
            c0439o2.m3058a();
            return c0439o2;
        } else if (c0439o != null) {
            C0439o c0439o3 = new C0439o(this);
            c0439o3.f3143a = c0439o.f3143a;
            c0439o3.m3058a();
            return c0439o3;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0423f m3122a(EnumC0438n enumC0438n, C0423f c0423f, boolean z) {
        C0423f m3123a = m3123a(enumC0438n);
        if (m3123a != null) {
            if (z && c0423f != null && c0423f.m3272a()) {
                throw new C0395bl("Cannot define animation " + enumC0438n.name() + " on graphics and with onAction at same time");
            }
            return m3123a;
        }
        return c0423f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0423f m3123a(EnumC0438n enumC0438n) {
        Iterator it = this.f3068dg.iterator();
        while (it.hasNext()) {
            C0423f c0423f = (C0423f) it.next();
            if (c0423f.m3268a(enumC0438n)) {
                return c0423f;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0449y m3114a(String str, C0449y c0449y) {
        if (str == null && c0449y != null) {
            return c0449y;
        }
        C0449y c0449y2 = new C0449y(this, str);
        c0449y2.m3040c();
        return c0449y2;
    }

    /* renamed from: a */
    public C0449y m3116a(String str) {
        return new C0449y(this, str);
    }

    /* renamed from: b */
    public Effect getEffect(String effectId) {
        boolean z = false;
        if (effectId.toUpperCase().startsWith("CUSTOM:")) {
            effectId = effectId.substring("CUSTOM:".length()).trim();
            z = true;
        }
        if (effectId.toUpperCase().startsWith("CUSTOM|")) {
            effectId = effectId.substring("CUSTOM|".length()).trim();
            z = true;
        }
        if (z) {
            Iterator it = this.f3094fR.iterator();
            while (it.hasNext()) {
                Effect effect = (Effect) it.next();
                if (effectId.equalsIgnoreCase(effect.name)) {
                    return effect;
                }
            }
            throw new C0395bl("Failed to find custom effect with the name:" + effectId);
        } else if (effectId.contains(":")) {
            throw new C0395bl("Unknown effect format:" + effectId + " expected built-in effect or CUSTOM:");
        } else {
            if ("small".equalsIgnoreCase(effectId)) {
                return new Effect(EnumC0370aw.f2190a);
            }
            if ("medium".equalsIgnoreCase(effectId)) {
                return new Effect(EnumC0370aw.f2191b);
            }
            if ("large".equalsIgnoreCase(effectId)) {
                return new Effect(EnumC0370aw.f2192c);
            }
            if ("smoke".equalsIgnoreCase(effectId)) {
                return new Effect(EnumC0370aw.f2193d);
            }
            if ("shockwave".equalsIgnoreCase(effectId)) {
                return new Effect(EnumC0370aw.f2194e);
            }
            if ("largeExplosion".equalsIgnoreCase(effectId)) {
                return new Effect(EnumC0370aw.f2195f);
            }
            if ("smallExplosion".equalsIgnoreCase(effectId)) {
                return new Effect(EnumC0370aw.f2196g);
            }
            if ("resourcePoolSmoke".equalsIgnoreCase(effectId)) {
                return new Effect(EnumC0370aw.f2197h);
            }
            if ("none".equalsIgnoreCase(effectId)) {
                return new Effect(EnumC0370aw.f2198i);
            }
            throw new C0395bl("Failed to find built-in effect with the name:" + effectId);
        }
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: C */
    public boolean mo3136C() {
        return this.f2805bX;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: w */
    public boolean mo3065w() {
        if (this.f2807bZ) {
            GameEngine instance = GameEngine.getInstance();
            if (instance.m919K() && instance.networkEngine.setup.noNukes) {
                return true;
            }
        }
        return this.f2806bY;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: c */
    public int getPrice() {
        return this.f2854ca.m3406a();
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: u */
    public C0407b mo3067u() {
        return this.f2854ca;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: B */
    public C0407b mo3137B() {
        return this.f2856cc;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: d */
    public C0407b mo3097d(int i) {
        return this.f2854ca;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: D */
    public float mo3135D() {
        return this.f3057cd;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: g */
    public int mo3091g() {
        return this.f2857ce;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: a */
    public Unit createUnit() {
        return m3109a(false, this);
    }

    /* renamed from: a */
    public Unit m3110a(boolean z) {
        return m3109a(z, this);
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: e */
    public String mo3095e() {
        if (this.f3097fX != LangLocale.f4969c || this.f2968fY == null) {
            this.f3097fX = LangLocale.f4969c;
            String m3488b = this.core_displayText != null ? this.core_displayText.m3488b() : this.core_name;
            String str = this.core_name;
            if (this.core_displayLocaleKey != null) {
                str = this.core_displayLocaleKey;
            }
            this.f2968fY = LangLocale.getI18NTextOrDefault("units." + str + ".name", m3488b, new Object[0]);
        }
        return this.f2968fY;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: f */
    public String mo3093f() {
        if (this.f3097fX != LangLocale.f4969c || this.f2969fZ == null) {
            this.f3097fX = LangLocale.f4969c;
            String m3488b = this.core_displayDescription != null ? this.core_displayDescription.m3488b() : this.core_name;
            String str = this.core_name;
            if (this.core_displayLocaleKey != null) {
                str = this.core_displayLocaleKey;
            }
            this.f2969fZ = LangLocale.getI18NTextOrDefault("units." + str + ".description", m3488b, new Object[0]);
        }
        return this.f2969fZ;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: j */
    public boolean mo3085j() {
        return this.f2751aB;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: k */
    public boolean mo3083k() {
        return this.f2752aC;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: m */
    public boolean mo3079m() {
        return this.f2975ff;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: n */
    public boolean mo3077n() {
        return this.f2976fg;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: l */
    public boolean mo3081l() {
        return this.f2974fe;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: o */
    public MovementType mo3075o() {
        return this.f2931eV;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: p */
    public boolean mo3073p() {
        return this.f2753aD;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: q */
    public C0385bb mo3071q() {
        return this.f2930eU;
    }

    /* renamed from: a */
    public void m3111a(ArrayList arrayList, int i) {
        if (this.f3081eB != 0 && this.f2922eI) {
            arrayList.add(LandingCraft.f3456i);
            arrayList.add(LandingCraft.f3457j);
        }
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: h */
    public void mo3089h() {
        this.f2995ga = null;
        this.f2996gb = new C0292an[3];
        for (int i = 1; i <= 3; i++) {
            C0292an c0292an = new C0292an();
            m3111a(c0292an.f1736a, i);
            this.f2996gb[i - 1] = c0292an;
        }
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: a */
    public ArrayList mo3132a(int i) {
        if (this.f2996gb == null) {
            GameEngine game = GameEngine.getInstance();
            throw new RuntimeException("specialActionLists==null for:" + this.core_name + " t:" + i + " networked:" + game.isNetworked() + " replay:" + game.replayEngine.isPlaying() + " sandbox:" + game.editorMode + " active: " + instances.contains(this));
        }
        return this.f2996gb[i - 1].f1736a;
    }

    /* renamed from: r */
    public void m3070r() {
        ArrayList mo3132a = mo3132a(this.f2857ce);
        if (mo3132a.size() > 4) {
            this.f2995ga = new HashMap();
            int size = mo3132a.size();
            for (int i = 0; i < size; i++) {
                Action action = (Action) mo3132a.get(i);
                if (this.f2995ga.get(action.m3834L()) == null) {
                    this.f2995ga.put(action.m3834L(), action);
                }
            }
        }
    }

    /* renamed from: a */
    public Action m3131a(C0202c c0202c) {
        if (this.f2995ga != null) {
            return (Action) this.f2995ga.get(c0202c);
        }
        ArrayList mo3132a = mo3132a(this.f2857ce);
        int size = mo3132a.size();
        for (int i = 0; i < size; i++) {
            Action action = (Action) mo3132a.get(i);
            if (action.m3825d(c0202c)) {
                return action;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: i */
    public String mo3087i() {
        return this.core_name;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: v */
    public String mo3066v() {
        return this.core_name;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: b */
    public int mo3107b(int i) {
        return getPrice();
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: d */
    public C0225z mo3098d() {
        return this.f3098gc;
    }

    /* renamed from: a */
    public C0445u m3113a(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        C0445u c0445u = new C0445u();
        c0445u.f3165a = str2;
        c0445u.f3166b = str3;
        c0445u.f3167c = str;
        this.f3026p.add(c0445u);
        return c0445u;
    }

    /* renamed from: b */
    public C0447w m3104b(String str, String str2, String str3) {
        C0447w c0447w = new C0447w();
        c0447w.f3165a = str2;
        c0447w.f3166b = str3;
        c0447w.f3167c = "(known unit:)" + mo3087i();
        c0447w.f3168d = this;
        c0447w.f3169e = true;
        c0447w.f3171g = str;
        this.f3026p.add(c0447w);
        return c0447w;
    }

    /* renamed from: c */
    public C0444t m3099c(String str, String str2, String str3) {
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return null;
        }
        C0444t c0444t = new C0444t();
        c0444t.f3163c = str2;
        c0444t.f3164d = str3;
        for (String str4 : CommonUtils.m1665c(str, ',')) {
            c0444t.f3161a.add(str4.trim());
        }
        this.f3099gd.add(c0444t);
        return c0444t;
    }

    /* renamed from: a */
    public static C0445u m3129a(UnitType unitType) {
        if (unitType == null) {
            return null;
        }
        C0445u c0445u = new C0445u();
        c0445u.f3165a = "known";
        c0445u.f3168d = unitType;
        c0445u.f3169e = true;
        return c0445u;
    }

    /* renamed from: c */
    public static CustomUnitMetadata m3102c(int i) {
        int i2;
        if (i >= 100 && (i2 = i - 100) < f3013g.size()) {
            return (CustomUnitMetadata) f3013g.get(i2);
        }
        return null;
    }

    /* renamed from: s */
    public static ArrayList m3069s() {
        ArrayList arrayList = new ArrayList();
        int i = 100;
        Iterator it = f3013g.iterator();
        while (it.hasNext()) {
            CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) it.next();
            arrayList.add(Integer.valueOf(i));
            i++;
        }
        return arrayList;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: x */
    public ValueList mo3064x() {
        return this.core_tags;
    }

    /* renamed from: c */
    public C0394bk m3100c(String str) {
        Iterator it = this.f3088fH.iterator();
        while (it.hasNext()) {
            C0394bk c0394bk = (C0394bk) it.next();
            if (c0394bk.f2403a.equalsIgnoreCase(str)) {
                return c0394bk;
            }
        }
        return null;
    }

    /* renamed from: d */
    public C0388be m3096d(String str) {
        Iterator it = this.f3089fI.iterator();
        while (it.hasNext()) {
            C0388be c0388be = (C0388be) it.next();
            if (c0388be.f2355bh.equalsIgnoreCase(str)) {
                return c0388be;
            }
        }
        return null;
    }

    /* renamed from: e */
    public C0327d m3094e(String str) {
        Iterator it = this.f3096fV.iterator();
        while (it.hasNext()) {
            C0327d c0327d = (C0327d) it.next();
            if (c0327d.f2035b != null && c0327d.f2035b.equalsIgnoreCase(str)) {
                return c0327d;
            }
        }
        return null;
    }

    /* renamed from: f */
    public Action m3092f(String str) {
        Iterator it = mo3132a(this.f2857ce).iterator();
        while (it.hasNext()) {
            Action action = (Action) it.next();
            if (action instanceof C0330g) {
                C0330g c0330g = (C0330g) action;
                if (c0330g.f2085a.f2035b.equalsIgnoreCase(str)) {
                    return c0330g;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m3128a(AbstractC0375a abstractC0375a) {
        if (!this.f3018h.contains(abstractC0375a)) {
            this.f3018h.add(abstractC0375a);
        }
    }

    /* renamed from: a */
    public void m3127a(C0407b c0407b) {
        if (c0407b != null && c0407b.f2538b != 0) {
            if (this.core_logIfCreditResourceUsed) {
                GameEngine.LogTrace("usesCreditResources:" + c0407b);
            }
            this.f2997gf = true;
        }
    }

    /* renamed from: g */
    public C0383i m3090g(String str) {
        Iterator it = this.f3046au.iterator();
        while (it.hasNext()) {
            C0383i c0383i = (C0383i) it.next();
            if (c0383i.m3462b().equalsIgnoreCase(str)) {
                return c0383i;
            }
        }
        return null;
    }

    /* renamed from: h */
    public C0411a m3088h(String str) {
        C0411a m3340a = C0411a.m3340a(str);
        if (m3340a != null) {
            return m3340a;
        }
        return m3086i(str);
    }

    /* renamed from: i */
    public C0411a m3086i(String str) {
        Iterator it = this.f3020j.iterator();
        while (it.hasNext()) {
            C0419c c0419c = (C0419c) it.next();
            if (c0419c.f2606a.equalsIgnoreCase(str)) {
                return c0419c.f2607b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0419c m3126a(C0411a c0411a) {
        Iterator it = this.f3020j.iterator();
        while (it.hasNext()) {
            C0419c c0419c = (C0419c) it.next();
            if (c0419c.f2607b == c0411a) {
                return c0419c;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0399a m3125a(ValueListSource valueListSource) {
        Iterator it = this.f3022l.iterator();
        while (it.hasNext()) {
            C0399a c0399a = (C0399a) it.next();
            if (c0399a.f2510g == valueListSource) {
                return c0399a;
            }
        }
        return null;
    }

    /* renamed from: j */
    public C0399a m3084j(String str) {
        Iterator it = this.f3022l.iterator();
        while (it.hasNext()) {
            C0399a c0399a = (C0399a) it.next();
            if (c0399a.f2510g.name.equals(str)) {
                return c0399a;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: y */
    public boolean mo3063y() {
        return this.f2997gf;
    }

    /* renamed from: t */
    public String m3068t() {
        if (this.f2736G != null) {
            return this.f2736G.getCurMods();
        }
        return null;
    }

    /* renamed from: a */
    public static void m3121a(OutputNetStream outputNetStream) {
        outputNetStream.mo1291e("customUnits");
        outputNetStream.writeInt(1);
        outputNetStream.writeInt(instances.size());
        Iterator it = instances.iterator();
        while (it.hasNext()) {
            CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) it.next();
            outputNetStream.writeString(customUnitMetadata.core_name);
            outputNetStream.writeInt(customUnitMetadata.f2734E);
            outputNetStream.writeBoolean(true);
            outputNetStream.m_writeString(customUnitMetadata.m3068t());
            long j = 0;
            if (customUnitMetadata.f2736G != null && customUnitMetadata.f2736G.id != 0) {
                j = customUnitMetadata.f2736G.id;
            }
            outputNetStream.writeLong(j);
            outputNetStream.writeLong(0L);
        }
        outputNetStream.endBlock("customUnits");
    }

    /* renamed from: a */
    public static void m3120a(InputNetStream inputNetStream) {
        inputNetStream.m1234b("customUnits");
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z = false;
            if (inputNetStream.readInt() >= 2) {
                z = inputNetStream.readBoolean();
                inputNetStream.readBoolean();
            }
            int readInt = inputNetStream.readInt();
            for (int i = 0; i < readInt; i++) {
                String readString = inputNetStream.readString();
                int readInt2 = inputNetStream.readInt();
                inputNetStream.readBoolean();
                String m1224j = inputNetStream.m1224j();
                inputNetStream.readLong();
                inputNetStream.readLong();
                String str = null;
                if (z) {
                    str = inputNetStream.m1224j();
                }
                CustomUnitMetadata customUnitMetadata = null;
                int i2 = -1;
                CustomUnitMetadata customUnitMetadata2 = null;
                synchronized (f3009c) {
                    Iterator it = f3009c.iterator();
                    while (it.hasNext()) {
                        CustomUnitMetadata customUnitMetadata3 = (CustomUnitMetadata) it.next();
                        if (readString.equals(customUnitMetadata3.core_name)) {
                            if (readInt2 == customUnitMetadata3.f2734E) {
                                customUnitMetadata = customUnitMetadata3;
                            } else {
                                customUnitMetadata2 = customUnitMetadata3;
                                i2 = customUnitMetadata3.f2734E;
                            }
                        }
                    }
                }
                if (customUnitMetadata == null) {
                    C0331aa c0331aa = new C0331aa();
                    c0331aa.f2088a = m1224j;
                    c0331aa.f2089b = readString;
                    c0331aa.f2091d = i2;
                    c0331aa.f2090c = readInt2;
                    c0331aa.f2093f = customUnitMetadata2;
                    c0331aa.f2092e = str;
                    arrayList2.add(c0331aa);
                    GameEngine.log(c0331aa.m3585a());
                } else {
                    arrayList.add(customUnitMetadata);
                }
            }
            if (arrayList2.size() > 0) {
                ((C0331aa) arrayList2.get(0)).m3584b();
            }
            f3011e = arrayList;
            inputNetStream.m1230d("customUnits");
        } catch (Throwable th) {
            inputNetStream.m1230d("customUnits");
            throw th;
        }
    }

    /* renamed from: b */
    public void m3106b(UnitType unitType) {
        if (!this.f3086fA.contains(unitType) && unitType != this) {
            this.f3086fA.add(unitType);
        }
        if (unitType instanceof CustomUnitMetadata) {
            Iterator it = ((CustomUnitMetadata) unitType).f3086fA.iterator();
            while (it.hasNext()) {
                UnitType unitType2 = (UnitType) it.next();
                if (!this.f3086fA.contains(unitType2) && unitType != this) {
                    this.f3086fA.add(unitType2);
                }
            }
        }
    }

    /* renamed from: a */
    public static CustomUnitMetadata m3124a(CustomUnitMetadata customUnitMetadata) {
        Iterator it = instances.iterator();
        while (it.hasNext()) {
            CustomUnitMetadata customUnitMetadata2 = (CustomUnitMetadata) it.next();
            if (customUnitMetadata.f2732B.equals(customUnitMetadata2.f2732B)) {
                return customUnitMetadata2;
            }
        }
        Iterator it2 = instances.iterator();
        while (it2.hasNext()) {
            CustomUnitMetadata customUnitMetadata3 = (CustomUnitMetadata) it2.next();
            if (customUnitMetadata.core_name.equals(customUnitMetadata3.core_name)) {
                return customUnitMetadata3;
            }
        }
        return null;
    }

    /* renamed from: A */
    public static void m3138A() {
        Iterator it = Unit.m3767bE().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof C0433j) {
                C0433j c0433j = (C0433j) unit;
                CustomUnitMetadata customUnitMetadata = c0433j.customUnitMetadataA;
                if (!instances.contains(customUnitMetadata)) {
                    CustomUnitMetadata m3124a = m3124a(customUnitMetadata);
                    if (m3124a == null) {
                        m3124a = frontCustomUnitMetadata;
                    }
                    if (m3124a != null) {
                        c0433j.m3207a(m3124a, false, true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public BitmapOrTexture[] m3119a(BitmapOrTexture bitmapOrTexture, HueColor hueColor) {
        boolean z = false;
        if ((this.f2736G != null || this.core_isBug) && !GameEngine.getInstance().curSettings.disableModLazyLoad) {
            z = true;
        }
        if ((this.core_stayNeutral && this.core_createNeutral) || this.core_createOnAggressiveTeam) {
            z = true;
        }
        BitmapOrTexture[] m3951a = Team.m3951a(bitmapOrTexture, hueColor, z);
        for (int i = 0; i < m3951a.length; i++) {
            if (z && this.f2736G != null && this.core_isBug && i == 1) {
                m3951a[i].mo371v();
            }
        }
        CustomUnitMetadataFactory.m3551a(m3951a);
        return m3951a;
    }

    /* renamed from: a */
    public BitmapOrTexture getImage(UnitConfig unitConfig, String str, String str2) {
        return m3117a(unitConfig, str, str2, this.graphics_imageSmoothing);
    }

    /* renamed from: a */
    public BitmapOrTexture m3117a(UnitConfig unitConfig, String str, String str2, boolean z) {
        return m3112a(this.f2732B, unitConfig.getStaticStringValue(str, str2, (String) null), z, str, str2);
    }

    /* renamed from: a */
    public BitmapOrTexture m3112a(String str, String str2, boolean z, String str3, String str4) {
        return CustomUnitMetadataFactory.m3555a(str, str2, z, this, str3, str4);
    }

    /* renamed from: k */
    public static UnitType m3082k(String str) {
        for (UnitType unitType : f3012f.keySet()) {
            if (unitType.mo3087i().equals(str)) {
                return (UnitType) f3012f.get(unitType);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static UnitType m3101c(UnitType unitType) {
        return (UnitType) f3012f.get(unitType);
    }

    /* renamed from: l */
    public static CustomUnitMetadata m3080l(String str) {
        Iterator it = instances.iterator();
        while (it.hasNext()) {
            CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) it.next();
            if (str.equals(customUnitMetadata.core_name)) {
                return customUnitMetadata;
            }
        }
        Iterator it2 = instances.iterator();
        while (it2.hasNext()) {
            CustomUnitMetadata customUnitMetadata2 = (CustomUnitMetadata) it2.next();
            if (customUnitMetadata2.core_altNames.contains(str)) {
                return customUnitMetadata2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0433j m3109a(boolean z, CustomUnitMetadata customUnitMetadata) {
        return new C0433j(z, customUnitMetadata);
    }

    /* renamed from: m */
    public void m3078m(String str) {
        if (C0915ag.m575i(str)) {
            return;
        }
        this.f3021k.add(new C0450z(str));
    }

    /* renamed from: n */
    public void m3076n(String str) {
        CustomUnitMetadataFactory.m3562a(mo3087i(), new C0395bl(str), this);
    }

    /* renamed from: o */
    public void m3074o(String str) {
        String str2 = "Warning (on " + m3108b() + "): " + str;
        GameEngine.log(str2);
        this.f3101gh.add(str);
        if (this.f2736G == null) {
            GameEngine.getInstance().alert(str2, 1);
            if (GameEngine.f5912aT) {
                GameEngine.PrintLOG("Crashing on allowed unit warning because automated testing is active");
                throw new RuntimeException(str2);
            }
        }
    }

    /* renamed from: p */
    public void m3072p(String str) {
        String str2 = "Warning (on " + m3108b() + "): " + str;
        GameEngine.log(str2);
        this.f3101gh.add(str);
        if (this.f2736G == null) {
            GameEngine.getInstance().alert(str2, 1);
            if (GameEngine.f5912aT) {
                GameEngine.PrintLOG("Crashing on allowed unit warning because automated testing is active");
                throw new RuntimeException(str2);
            }
            return;
        }
        this.f2736G.m1562b(str2);
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: z */
    public BitmapOrTexture mo3062z() {
        return this.f2780aq;
    }

    /* renamed from: E */
    public static void m3134E() {
        GameEngine gameEngine = GameEngine.getInstance();
        Iterator it = instances.iterator();
        while (it.hasNext()) {
            CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) it.next();
            OnMapSpawnType onMapSpawnType = customUnitMetadata.core_onNewMapSpawn;
            if (onMapSpawnType != null) {
                if (onMapSpawnType == OnMapSpawnType.f2094a || onMapSpawnType == OnMapSpawnType.f2095b) {
                    Iterator it2 = gameEngine.map.resPools.iterator();
                    while (it2.hasNext()) {
                        Point point = (Point) it2.next();
                        Unit createUnit = customUnitMetadata.createUnit();
                        createUnit.mo2537b(Team.f1346g);
                        gameEngine.map.fromGrid(point.game, point.y);
                        createUnit.x = gameEngine.map.returnX;
                        createUnit.y = gameEngine.map.returnY;
                        createUnit.x += createUnit.mo2897cV();
                        createUnit.y += createUnit.mo2896cW();
                        if (onMapSpawnType == OnMapSpawnType.f2094a && (createUnit instanceof OrderableUnit) && ((OrderableUnit) createUnit).m2617a((Unit) null, (Team) null)) {
                            createUnit.m3745cg();
                        } else {
                            Team.m3924c(createUnit);
                        }
                    }
                } else if (onMapSpawnType == OnMapSpawnType.f2096c || onMapSpawnType == OnMapSpawnType.f2097d) {
                    if (onMapSpawnType == OnMapSpawnType.f2096c) {
                        Unit createUnit2 = customUnitMetadata.createUnit();
                        createUnit2.mo2537b(Team.f1346g);
                        gameEngine.map.m4134b(gameEngine.map.getWidthInPixels() / 2.0f, gameEngine.map.getHeightInPixels() / 2.0f);
                        createUnit2.x = gameEngine.map.returnX;
                        createUnit2.y = gameEngine.map.returnY;
                        createUnit2.x += createUnit2.mo2897cV();
                        createUnit2.y += createUnit2.mo2896cW();
                        Team.m3924c(createUnit2);
                    }
                    if (onMapSpawnType == OnMapSpawnType.f2097d) {
                        Iterator it3 = Team.m3929c().iterator();
                        while (it3.hasNext()) {
                            Team team = (Team) it3.next();
                            if (team.getUnitCounts(true, false) > 0) {
                                Unit createUnit3 = customUnitMetadata.createUnit();
                                createUnit3.mo2537b(team);
                                gameEngine.map.m4134b(gameEngine.map.getWidthInPixels() / 2.0f, gameEngine.map.getHeightInPixels() / 2.0f);
                                createUnit3.x = gameEngine.map.returnX;
                                createUnit3.y = gameEngine.map.returnY;
                                createUnit3.x += createUnit3.mo2897cV();
                                createUnit3.y += createUnit3.mo2896cW();
                                Team.m3924c(createUnit3);
                            }
                        }
                    }
                } else if (onMapSpawnType == OnMapSpawnType.f2098e) {
                    Iterator it4 = Team.m3929c().iterator();
                    while (it4.hasNext()) {
                        Team team2 = (Team) it4.next();
                        if (team2.getUnitCounts(true, false) > 0) {
                            PointF pointF = new PointF();
                            C0955y.m459a(team2, pointF);
                            Unit createUnit4 = customUnitMetadata.createUnit();
                            createUnit4.mo2537b(team2);
                            gameEngine.map.m4134b(pointF.x, pointF.y);
                            createUnit4.x = gameEngine.map.returnX;
                            createUnit4.y = gameEngine.map.returnY;
                            createUnit4.x += createUnit4.mo2897cV();
                            createUnit4.y += createUnit4.mo2896cW();
                            Team.m3924c(createUnit4);
                        }
                    }
                } else {
                    GameEngine.log("onNewMapSpawn unhandled: " + customUnitMetadata.core_onNewMapSpawn);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: a */
    public int mo3130a(Unit unit) {
        int i = 0;
        if (this.f2755aF > 0.0f) {
            return (int) this.f2755aF;
        }
        if (this.f2753aD && this.f2751aB && unit.mo2719y() < 20) {
            i = 0 + 17;
        }
        return i;
    }
}
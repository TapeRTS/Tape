package com.corrodinggames.rts.gameFramework.p037f;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0248aq;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EditorOrBuilder;
import com.corrodinggames.rts.game.units.EnumC0238ag;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.InterfaceC0501l;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.C0342g;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0438e;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0431c;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0209d;
import com.corrodinggames.rts.game.units.p013a.C0210e;
import com.corrodinggames.rts.game.units.p013a.C0211f;
import com.corrodinggames.rts.game.units.p013a.C0212g;
import com.corrodinggames.rts.game.units.p013a.C0214i;
import com.corrodinggames.rts.game.units.p013a.C0215j;
import com.corrodinggames.rts.game.units.p013a.C0222q;
import com.corrodinggames.rts.game.units.p013a.C0223r;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0638ac;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0773j;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0763a;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0765c;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0767e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p045m.C1049f;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/f.class */
public final class C0797f extends AbstractC0726bk {

    /* renamed from: c */
    EditorOrBuilder f5105c;

    /* renamed from: d */
    public C0760a f5106d;

    /* renamed from: e */
    public C0800i f5107e;

    /* renamed from: f */
    public C0787af f5108f;

    /* renamed from: q */
    double f5109q;

    /* renamed from: x */
    boolean f5110x;

    /* renamed from: y */
    boolean f5111y;

    /* renamed from: z */
    float f5112z;

    /* renamed from: A */
    public float f5113A;

    /* renamed from: B */
    public float f5114B;

    /* renamed from: Q */
    public Unit f5115Q;

    /* renamed from: R */
    public float f5116R;

    /* renamed from: S */
    public int f5117S;

    /* renamed from: T */
    public float f5118T;

    /* renamed from: U */
    public Unit f5119U;

    /* renamed from: W */
    public Action f5120W;

    /* renamed from: X */
    public int f5121X;

    /* renamed from: Y */
    public boolean f5122Y;

    /* renamed from: Z */
    public float f5123Z;

    /* renamed from: aa */
    public float f5124aa;

    /* renamed from: ab */
    public float f5125ab;

    /* renamed from: ac */
    public boolean f5126ac;

    /* renamed from: ad */
    public float f5127ad;

    /* renamed from: ae */
    public float f5128ae;

    /* renamed from: af */
    public float f5129af;

    /* renamed from: ag */
    public float f5130ag;

    /* renamed from: ah */
    public float f5131ah;

    /* renamed from: ai */
    public float f5132ai;

    /* renamed from: aj */
    public boolean f5133aj;

    /* renamed from: ak */
    public float f5134ak;

    /* renamed from: al */
    public float f5135al;

    /* renamed from: am */
    public int f5136am;

    /* renamed from: ao */
    public Paint f5137ao;

    /* renamed from: ap */
    public Paint f5138ap;

    /* renamed from: aq */
    public Paint f5139aq;

    /* renamed from: ar */
    public Paint f5140ar;

    /* renamed from: as */
    public Paint f5141as;

    /* renamed from: at */
    public Paint f5142at;

    /* renamed from: au */
    public Paint f5143au;

    /* renamed from: av */
    public Paint f5144av;

    /* renamed from: aw */
    public Paint f5145aw;

    /* renamed from: ax */
    public Paint f5146ax;

    /* renamed from: ay */
    public Paint f5147ay;

    /* renamed from: az */
    public Paint f5148az;

    /* renamed from: aA */
    public Paint f5149aA;

    /* renamed from: aB */
    public Paint f5150aB;

    /* renamed from: aC */
    public Paint f5151aC;

    /* renamed from: aD */
    public Paint f5152aD;

    /* renamed from: aE */
    Paint f5153aE;

    /* renamed from: aF */
    Paint f5154aF;

    /* renamed from: aG */
    Paint f5155aG;

    /* renamed from: aH */
    Paint f5156aH;

    /* renamed from: aI */
    Paint f5157aI;

    /* renamed from: aJ */
    Paint f5158aJ;

    /* renamed from: aK */
    C0930ag f5159aK;

    /* renamed from: aL */
    C0930ag f5160aL;

    /* renamed from: aM */
    C0930ag f5161aM;

    /* renamed from: aN */
    public float f5162aN;

    /* renamed from: aR */
    int f5163aR;

    /* renamed from: aT */
    public boolean f5164aT;

    /* renamed from: aX */
    boolean f5165aX;

    /* renamed from: aY */
    float f5166aY;

    /* renamed from: aZ */
    Paint f5167aZ;

    /* renamed from: ba */
    Paint f5168ba;

    /* renamed from: bs */
    String f5169bs;

    /* renamed from: bt */
    String f5170bt;

    /* renamed from: bu */
    C0385az f5171bu;

    /* renamed from: bv */
    String f5172bv;

    /* renamed from: bw */
    String f5173bw;

    /* renamed from: bx */
    String f5174bx;

    /* renamed from: bR */
    private int f5175bR;

    /* renamed from: bS */
    private int f5176bS;

    /* renamed from: bT */
    private int f5177bT;

    /* renamed from: bU */
    private int f5178bU;

    /* renamed from: bV */
    private int f5179bV;

    /* renamed from: bW */
    private int f5180bW;

    /* renamed from: bD */
    public static boolean f5181bD;

    /* renamed from: bI */
    long f5182bI;

    /* renamed from: bJ */
    boolean f5183bJ;

    /* renamed from: bM */
    public static Unit f5184bM;

    /* renamed from: bQ */
    static boolean f5185bQ;

    /* renamed from: a */
    public static boolean f5186a = false;

    /* renamed from: bA */
    public static boolean f5187bA = false;

    /* renamed from: bB */
    public static boolean f5188bB = false;

    /* renamed from: bC */
    public static boolean f5189bC = false;

    /* renamed from: bP */
    static int f5190bP = 1;

    /* renamed from: b */
    public boolean f5191b = false;

    /* renamed from: g */
    C0210e f5192g = new C0210e();

    /* renamed from: h */
    C0211f f5193h = new C0211f();

    /* renamed from: i */
    C0214i f5194i = new C0214i();

    /* renamed from: j */
    C0209d f5195j = new C0209d();

    /* renamed from: k */
    public C0215j f5196k = new C0215j();

    /* renamed from: l */
    C0223r f5197l = new C0223r();

    /* renamed from: m */
    C0222q f5198m = new C0222q();

    /* renamed from: n */
    AbstractC0773j f5199n = new C0763a();

    /* renamed from: o */
    boolean f5200o = false;

    /* renamed from: p */
    public boolean f5201p = false;

    /* renamed from: r */
    float f5202r = 0.0f;

    /* renamed from: s */
    public float f5203s = 0.0f;

    /* renamed from: t */
    public float f5204t = 0.0f;

    /* renamed from: u */
    float f5205u = 40.0f;

    /* renamed from: v */
    float f5206v = 40.0f;

    /* renamed from: w */
    int f5207w = 0;

    /* renamed from: C */
    boolean f5208C = false;

    /* renamed from: D */
    boolean f5209D = false;

    /* renamed from: E */
    boolean f5210E = false;

    /* renamed from: F */
    boolean f5211F = false;

    /* renamed from: G */
    boolean f5212G = false;

    /* renamed from: H */
    float f5213H = 0.0f;

    /* renamed from: I */
    float f5214I = 0.0f;

    /* renamed from: J */
    float f5215J = 0.0f;

    /* renamed from: K */
    float f5216K = 0.0f;

    /* renamed from: L */
    float f5217L = 0.0f;

    /* renamed from: M */
    float f5218M = 0.0f;

    /* renamed from: N */
    boolean f5219N = false;

    /* renamed from: O */
    boolean f5220O = false;

    /* renamed from: P */
    boolean f5221P = false;

    /* renamed from: V */
    public final boolean f5222V = true;

    /* renamed from: an */
    public final Paint f5223an = new Paint();

    /* renamed from: aO */
    public float f5224aO = 0.0f;

    /* renamed from: aP */
    public float f5225aP = 0.0f;

    /* renamed from: aQ */
    public float f5226aQ = 0.0f;

    /* renamed from: aS */
    public float f5227aS = 0.0f;

    /* renamed from: aU */
    BitmapOrTexture f5228aU = null;

    /* renamed from: aV */
    BitmapOrTexture f5229aV = null;

    /* renamed from: aW */
    BitmapOrTexture f5230aW = null;

    /* renamed from: bb */
    BitmapOrTexture f5231bb = null;

    /* renamed from: bc */
    BitmapOrTexture f5232bc = null;

    /* renamed from: bd */
    public BitmapOrTexture f5233bd = null;

    /* renamed from: be */
    public BitmapOrTexture f5234be = null;

    /* renamed from: bf */
    public BitmapOrTexture f5235bf = null;

    /* renamed from: bg */
    BitmapOrTexture f5236bg = null;

    /* renamed from: bh */
    final Rect f5237bh = new Rect();

    /* renamed from: bi */
    final Rect f5238bi = new Rect();

    /* renamed from: bj */
    final Rect f5239bj = new Rect();

    /* renamed from: bk */
    final Rect f5240bk = new Rect();

    /* renamed from: bl */
    final Rect f5241bl = new Rect();

    /* renamed from: bm */
    final Paint f5242bm = new Paint();

    /* renamed from: bn */
    final Paint f5243bn = new Paint();

    /* renamed from: bo */
    final Paint f5244bo = new C0930ag();

    /* renamed from: bp */
    public final Paint f5245bp = new C0930ag();

    /* renamed from: bq */
    final Paint f5246bq = new C0930ag();

    /* renamed from: br */
    final Paint f5247br = new Paint();

    /* renamed from: by */
    public ArrayList f5248by = new ArrayList();

    /* renamed from: bz */
    public boolean f5249bz = false;

    /* renamed from: bE */
    C0765c f5250bE = C0765c.m2174b(-1, -1);

    /* renamed from: bF */
    C0439f f5251bF = new C0439f();

    /* renamed from: bG */
    long f5252bG = -1;

    /* renamed from: bH */
    long f5253bH = -1;

    /* renamed from: bK */
    public C1112u f5254bK = new C1112u();

    /* renamed from: bL */
    public C1112u f5255bL = new C1112u();

    /* renamed from: bN */
    Paint f5256bN = new Paint();

    /* renamed from: bO */
    Rect f5257bO = new Rect();

    /* renamed from: a */
    public boolean m2068a() {
        if (GameEngine.m1156av()) {
            return false;
        }
        return GameEngine.getInstance().f6109bQ.useCircleSelect;
    }

    /* renamed from: b */
    float m2018b() {
        return Math.min(this.f5202r * 2.5f, 290.0f) + 10.0f;
    }

    /* renamed from: c */
    float m2005c() {
        GameEngine gameEngine = GameEngine.getInstance();
        float f = 0.7f;
        if (GameEngine.m1157au()) {
            f = 0.9f;
        }
        if (gameEngine.f6250cW < 1.0f) {
            float f2 = gameEngine.f6250cW;
            if (f2 < 0.4d) {
                f2 = 0.4f;
            }
            f *= f2;
        }
        return f;
    }

    /* renamed from: a */
    public void m2023a(String str, int i) {
        this.f5106d.m2212a(str, i);
    }

    /* renamed from: b */
    public void m2007b(String str, int i) {
        this.f5106d.m2207b(str, i);
    }

    /* renamed from: a */
    public void m2024a(String str) {
        this.f5106d.m2213a(str);
    }

    /* renamed from: b */
    public void m2008b(String str) {
        this.f5106d.m2212a(str, 100);
    }

    /* renamed from: c */
    public void m1999c(String str) {
        this.f5106d.m2212a(str, 50);
    }

    /* renamed from: d */
    public void m1994d(String str) {
        this.f5106d.m2212a(str, 5);
    }

    /* renamed from: d */
    public void m1998d() {
        this.f5220O = false;
        this.f5221P = false;
        this.f5209D = false;
    }

    /* renamed from: a */
    public boolean m2066a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!f5187bA || this.f5106d.f4943ar) {
            return f < gameEngine.f6128ck - gameEngine.f6132cp;
        } else if (gameEngine.f6115bW.m1930c(f, f2) != null) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    public void m1993e() {
        if (this.f5106d != null) {
            this.f5106d.m2230a();
        }
    }

    /* renamed from: a */
    public void m2021a(boolean z) {
        if (z) {
            this.f5106d.m2189j();
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        this.f5106d.m2188k();
        m1979k();
        this.f5201p = false;
        this.f5248by.clear();
        if (!z) {
            gameEngine.f6231bt = 1.0f;
            gameEngine.f6095bw = false;
            gameEngine.f6094bv = false;
            gameEngine.f6225bl = false;
            gameEngine.f6227bn = false;
        }
        if (gameEngine.m1222M() && gameEngine.m1220O()) {
            gameEngine.f6094bv = gameEngine.networkEngine.f5477p;
        }
        C0785ad.m2115a();
        m2069J();
    }

    /* renamed from: f */
    public void m1990f() {
        f5187bA = false;
        f5188bB = false;
        f5189bC = false;
        if (GameEngine.m1157au()) {
            f5187bA = true;
            f5188bB = true;
            f5186a = true;
            f5189bC = true;
        }
        if (GameEngine.f6203aY) {
            f5187bA = true;
            f5188bB = true;
            f5189bC = true;
        }
        if (GameEngine.m1159as() && !GameEngine.getInstance().f6109bQ.classicInterface) {
            f5187bA = true;
            f5188bB = true;
            f5189bC = true;
        }
    }

    /* renamed from: a */
    public void m2050a(Context context) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (GameEngine.m1233B()) {
            this.f5249bz = true;
        }
        m1990f();
        this.f5169bs = C0820a.m1886a("gui.notAvailableInDemoText", new Object[0]);
        this.f5170bt = "Locked";
        this.f5171bu = C0385az.m5338b("gui.notEnoughResources");
        this.f5172bv = C0820a.m1886a("gui.cannotPlace.general", new Object[0]);
        this.f5173bw = C0820a.m1886a("gui.cannotPlace.needsResourcePool", new Object[0]);
        this.f5174bx = C0820a.m1886a("gui.cannotPlace.needsWater", new Object[0]);
        this.f5106d = new C0760a(gameEngine, this);
        m1993e();
        this.f5107e = new C0800i(gameEngine, this);
        this.f5108f = new C0787af(gameEngine);
        this.f5228aU = gameEngine.graphics.loadImage(R.drawable.button_no);
        this.f5229aV = gameEngine.graphics.loadImage(R.drawable.button_yes);
        this.f5230aW = gameEngine.graphics.loadImage(R.drawable.button_more);
        this.f5167aZ = new Paint();
        this.f5167aZ.m7231d(true);
        this.f5168ba = new Paint();
        this.f5168ba.m7231d(true);
        this.f5168ba.m7267a(40, 255, 255, 255);
        this.f5231bb = gameEngine.graphics.loadImage(R.drawable.button_add);
        this.f5232bc = gameEngine.graphics.loadImage(R.drawable.button_subtract);
        this.f5233bd = gameEngine.graphics.loadImage(R.drawable.icon_rally);
        this.f5234be = gameEngine.graphics.loadImage(R.drawable.icon_upgrade);
        this.f5235bf = gameEngine.graphics.mo926a(R.drawable.metal_dark, false);
        this.f5236bg = gameEngine.graphics.mo926a(R.drawable.touch_indicator, false);
        this.f5246bq.m7267a(145, 0, 175, 0);
        this.f5246bq.m7270a(6.0f);
        C0930ag.m1051b(this.f5246bq);
        this.f5245bp.m7248a(true);
        this.f5137ao = new Paint();
        this.f5138ap = new C0930ag();
        this.f5138ap.m7267a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f5138ap.m7248a(true);
        this.f5138ap.m7235c(true);
        this.f5138ap.m7258a(Typeface.m7174a(Typeface.f246c, 1));
        gameEngine.m1197a(this.f5138ap, 20.0f);
        this.f5138ap.m7263a(Paint.Align.LEFT);
        this.f5141as = new C0930ag();
        this.f5141as.m7267a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f5141as.m7248a(true);
        this.f5141as.m7235c(true);
        this.f5141as.m7258a(Typeface.m7174a(Typeface.f246c, 1));
        gameEngine.m1197a(this.f5141as, 18.0f);
        this.f5141as.m7263a(Paint.Align.LEFT);
        this.f5139aq = new C0930ag();
        this.f5139aq.m7259a(this.f5138ap);
        this.f5139aq.m7267a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f5140ar = new C0930ag();
        this.f5140ar.m7242b(Color.argb(100, 0, 0, 0));
        this.f5140ar.m7260a(Paint.Style.FILL_AND_STROKE);
        this.f5142at = new C0930ag();
        this.f5142at.m7267a(100, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        this.f5142at.m7263a(Paint.Align.LEFT);
        this.f5142at.m7235c(true);
        this.f5142at.m7248a(true);
        gameEngine.m1197a(this.f5142at, 12.0f);
        C0930ag.m1051b(this.f5142at);
        this.f5145aw = new C0930ag();
        if (this.f5249bz) {
            this.f5145aw.m7267a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        } else {
            this.f5145aw.m7267a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        }
        this.f5145aw.m7263a(Paint.Align.CENTER);
        this.f5145aw.m7235c(true);
        this.f5145aw.m7248a(true);
        gameEngine.m1197a(this.f5145aw, 12.0f);
        C0930ag.m1051b(this.f5145aw);
        GameEngine.PrintLog("smallTextPaint size: " + this.f5145aw.m7222k());
        this.f5144av = new C0930ag();
        this.f5144av.m7259a(this.f5145aw);
        gameEngine.m1197a(this.f5144av, 10.0f);
        C0930ag.m1051b(this.f5144av);
        this.f5143au = new C0930ag();
        this.f5143au.m7259a(this.f5145aw);
        gameEngine.m1197a(this.f5143au, 8.0f);
        C0930ag.m1051b(this.f5143au);
        this.f5146ax = new C0930ag();
        if (this.f5249bz) {
            this.f5146ax.m7267a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        } else {
            this.f5146ax.m7267a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        }
        this.f5146ax.m7263a(Paint.Align.CENTER);
        this.f5146ax.m7235c(true);
        this.f5146ax.m7248a(true);
        gameEngine.m1197a(this.f5146ax, 20.0f);
        C0930ag.m1051b(this.f5146ax);
        this.f5147ay = new C0930ag();
        this.f5147ay.m7267a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        this.f5147ay.m7263a(Paint.Align.CENTER);
        this.f5147ay.m7235c(true);
        this.f5147ay.m7248a(true);
        gameEngine.m1197a(this.f5147ay, 20.0f);
        C0930ag.m1051b(this.f5147ay);
        this.f5151aC = new C0930ag();
        this.f5151aC.m7267a(150, 20, 20, 20);
        gameEngine.m1198a(this.f5151aC);
        C0930ag.m1051b(this.f5151aC);
        this.f5148az = new C0930ag();
        this.f5148az.m7259a(this.f5146ax);
        this.f5148az.m7267a(255, 128, 0, 0);
        gameEngine.m1197a(this.f5148az, 14.0f);
        this.f5148az.m7263a(Paint.Align.CENTER);
        C0930ag.m1051b(this.f5148az);
        this.f5149aA = new C0930ag();
        this.f5149aA.m7259a(this.f5148az);
        this.f5149aA.m7267a(255, 220, 222, 49);
        this.f5150aB = new C0930ag();
        this.f5150aB.m7259a(this.f5146ax);
        gameEngine.m1197a(this.f5150aB, 12.0f);
        this.f5150aB.m7267a(125, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
        this.f5150aB.m7263a(Paint.Align.CENTER);
        C0930ag.m1051b(this.f5150aB);
        this.f5159aK = new C0930ag();
        this.f5159aK.m7242b(-16777216);
        this.f5159aK.m1053a(true);
        this.f5159aK.m7235c(true);
        this.f5159aK.m1055a(Typeface.m7174a(Typeface.f246c, 0));
        gameEngine.m1197a(this.f5159aK, 14.0f);
        this.f5160aL = new C0930ag();
        this.f5160aL.m7259a(this.f5159aK);
        this.f5160aL.m1055a(Typeface.m7174a(Typeface.f246c, 1));
        gameEngine.m1197a(this.f5160aL, 16.0f);
        this.f5161aM = new C0930ag();
        this.f5161aM.m7259a(this.f5160aL);
        this.f5161aM.m7242b(Color.m7283a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 63, 80));
        gameEngine.m1197a(this.f5161aM, 16.0f);
        this.f5153aE = new C0930ag();
        this.f5153aE.m7242b(-16777216);
        this.f5153aE.m7263a(Paint.Align.CENTER);
        this.f5153aE.m7248a(true);
        this.f5153aE.m7235c(true);
        this.f5153aE.m7258a(Typeface.m7174a(Typeface.f246c, 0));
        gameEngine.m1197a(this.f5153aE, 20.0f);
        this.f5154aF = new C0930ag();
        this.f5154aF.m7242b(-1);
        this.f5154aF.m7237c(160);
        if (GameEngine.m1157au()) {
            this.f5154aF.m7237c(140);
        }
        gameEngine.m1198a(this.f5154aF);
        this.f5155aG = new C0930ag();
        this.f5155aG.m7242b(-16777216);
        this.f5155aG.m7237c(210);
        gameEngine.m1198a(this.f5155aG);
        this.f5158aJ = new C0930ag();
        this.f5158aJ.m7242b(-7829368);
        this.f5158aJ.m7237c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        this.f5158aJ.m7260a(Paint.Style.STROKE);
        this.f5158aJ.m7270a(1.0f);
        gameEngine.m1198a(this.f5158aJ);
        this.f5156aH = new C0930ag();
        this.f5156aH.m7242b(-16711936);
        this.f5156aH.m7237c(80);
        this.f5156aH.m7260a(Paint.Style.FILL);
        this.f5156aH.m7270a(4.0f);
        gameEngine.m1198a(this.f5156aH);
        this.f5157aI = new C0930ag();
        this.f5157aI.m7242b(Color.argb(120, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 167, 49));
        this.f5157aI.m7260a(Paint.Style.FILL);
        this.f5157aI.m7270a(8.0f);
        gameEngine.m1198a(this.f5157aI);
        this.f5152aD = new C0930ag();
        this.f5152aD.m7235c(true);
        this.f5152aD.m7248a(true);
        gameEngine.m1197a(this.f5152aD, 12.0f);
        C0930ag.m1051b(this.f5152aD);
    }

    /* renamed from: g */
    public void m1987g() {
        this.f5107e.m1951b();
        this.f5108f.m2101b();
        this.f5183bJ = false;
    }

    /* renamed from: a */
    public void m2067a(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f5109q += f;
        this.f5224aO = CommonUtils.m2368a(this.f5224aO, f);
        this.f5225aP = CommonUtils.m2368a(this.f5225aP, f);
        this.f5227aS = CommonUtils.m2368a(this.f5227aS, 0.08f * f);
        this.f5226aQ = CommonUtils.m2368a(this.f5226aQ, f);
        this.f5112z += f;
        this.f5162aN += 0.05f * f;
        if (this.f5162aN > 1.0f) {
            this.f5162aN -= 1.0f;
            if (this.f5162aN > 1.0f) {
                this.f5162aN = 0.0f;
            }
        }
        gameEngine.f6267dw = 4.0f * this.f5227aS;
        float f2 = 1.0f * f;
        if (!this.f5209D) {
            float f3 = this.f5217L * f;
            float f4 = this.f5218M * f;
            float m2258g = CommonUtils.m2258g(80.0f, f3);
            float m2258g2 = CommonUtils.m2258g(80.0f, f4);
            gameEngine.f6140cx += m2258g;
            gameEngine.f6141cy += m2258g2;
        } else {
            f2 *= 4.0f;
        }
        float m2314b = CommonUtils.m2314b(0.0f, 0.0f, this.f5217L, this.f5218M);
        float m2280d = CommonUtils.m2280d(0.0f, 0.0f, this.f5217L, this.f5218M);
        if (m2314b > 30.0f) {
            m2314b = 30.0f;
        }
        float m2368a = CommonUtils.m2368a(m2314b, f2);
        this.f5217L = CommonUtils.m2249i(m2280d) * m2368a;
        this.f5218M = CommonUtils.sin(m2280d) * m2368a;
        this.f5164aT = false;
        this.f5209D = gameEngine.m1176ab() && gameEngine.f6276dL[0] && this.f5224aO == 0.0f;
        if (this.f5225aP != 0.0f) {
            if (!this.f5209D) {
                this.f5225aP = 0.0f;
            }
            this.f5209D = false;
            this.f5208C = false;
        }
        boolean z = false;
        if (this.f5226aQ > 0.0f) {
            z = true;
        }
        if (gameEngine.m1176ab() && gameEngine.m1174ad() > 1) {
            z = true;
            this.f5226aQ = 4.0f;
        }
        if (z) {
            this.f5209D = false;
            this.f5208C = false;
            this.f5219N = false;
            this.f5202r = 0.0f;
        }
        this.f5212G = gameEngine.m1173ae() > gameEngine.f6147cE;
        this.f5220O = !this.f5209D && this.f5208C;
        this.f5221P = this.f5209D && !this.f5208C;
        if (GameEngine.m1157au() && gameEngine.f6109bQ.mouseSupport) {
            this.f5205u = gameEngine.m1173ae();
            this.f5206v = gameEngine.m1172af();
        }
        if (!this.f5209D && !this.f5220O) {
            this.f5111y = false;
        }
        if (this.f5209D) {
            this.f5202r += f;
            this.f5203s = gameEngine.m1149b(0);
            this.f5204t = gameEngine.m1141c(0);
            this.f5205u = this.f5203s;
            this.f5206v = this.f5204t;
            this.f5207w = gameEngine.m1133d(0);
            this.f5110x = m2066a(this.f5203s, this.f5204t);
            boolean z2 = false;
            if (this.f5110x && !this.f5208C) {
                if (this.f5112z < 30.0f) {
                    float m2366a = CommonUtils.m2366a(this.f5113A, this.f5114B, this.f5203s, this.f5204t);
                    float f5 = 10.0f * gameEngine.f6126ci;
                    if (GameEngine.m1158at()) {
                        f5 = (float) (f5 * 1.5d);
                    }
                    if (m2366a < f5 * f5) {
                        z2 = true;
                    }
                }
                this.f5112z = 0.0f;
                this.f5113A = this.f5203s;
                this.f5114B = this.f5204t;
            }
            if (z2) {
                this.f5111y = true;
            }
            if (!this.f5208C) {
                this.f5219N = false;
                this.f5213H = this.f5203s;
                this.f5214I = this.f5204t;
                this.f5215J = this.f5203s;
                this.f5216K = this.f5204t;
                this.f5210E = gameEngine.f6115bW.m1930c(this.f5203s, this.f5204t) != null;
                this.f5211F = false;
                if (!this.f5210E) {
                    this.f5211F = this.f5203s > gameEngine.f6147cE;
                }
            }
            this.f5208C = true;
        }
        if (this.f5209D && (this.f5202r <= 20.0f || !m2068a())) {
            float m2366a2 = CommonUtils.m2366a(this.f5213H, this.f5214I, this.f5203s, this.f5204t);
            if (!this.f5210E) {
                float f6 = 30.0f * gameEngine.f6126ci;
                if (GameEngine.m1157au() && gameEngine.f6109bQ.mouseSupport && gameEngine.m1127e(3)) {
                    f6 = 0.0f;
                }
                if (!this.f5219N && m2366a2 > f6 * f6) {
                    boolean z3 = false;
                    int i = 1;
                    if (gameEngine.f6109bQ.mouseOrders == 2) {
                        i = 2;
                    }
                    if ((!gameEngine.f6109bQ.mouseSupport || this.f5207w != i) && !m2000c(gameEngine)) {
                        z3 = true;
                    }
                    if (z3) {
                        this.f5219N = true;
                    }
                    this.f5215J = this.f5203s;
                    this.f5216K = this.f5204t;
                }
            }
        }
        if (GameEngine.m1157au() && !gameEngine.f6075aq && gameEngine.f6073ao != null && ((gameEngine.f6073ao.mo6957f() || GameEngine.f6087aR) && (!this.f5209D || this.f5106d.f4951c))) {
            float f7 = (24.0f * gameEngine.f6109bQ.edgeScrollSpeed) / gameEngine.f6250cW;
            float f8 = gameEngine.f6140cx;
            float f9 = gameEngine.f6141cy;
            float f10 = 0.0f;
            float f11 = 0.0f;
            if (this.f5205u <= 1.0f) {
                f10 = 0.0f - (f7 * f);
            }
            if (this.f5205u >= gameEngine.f6128ck - 1.0f) {
                f10 += f7 * f;
            }
            if (this.f5206v <= 1.0f) {
                f11 = 0.0f - (f7 * f);
            }
            if (this.f5206v >= gameEngine.f6129cl - 1.0f) {
                f11 += f7 * f;
            }
            gameEngine.f6140cx += f10;
            gameEngine.f6141cy += f11;
            gameEngine.m1219P();
            this.f5106d.f4966B.f234a -= (gameEngine.f6140cx - f8) * gameEngine.f6250cW;
            this.f5106d.f4966B.f235b -= (gameEngine.f6141cy - f9) * gameEngine.f6250cW;
        }
        C0638ac c0638ac = gameEngine.f6112bT;
        if (gameEngine.f6109bQ.keyboardSupport) {
            if (gameEngine.m1231D()) {
                float f12 = 12.0f * gameEngine.f6109bQ.scrollSpeed;
                if (c0638ac.f4092p.m2952b()) {
                    gameEngine.f6140cx -= f12 * f;
                }
                if (c0638ac.f4093q.m2952b()) {
                    gameEngine.f6140cx += f12 * f;
                }
                if (c0638ac.f4090n.m2952b()) {
                    gameEngine.f6141cy -= f12 * f;
                }
                if (c0638ac.f4091o.m2952b()) {
                    gameEngine.f6141cy += f12 * f;
                }
                if (c0638ac.f4094r.m2952b()) {
                    gameEngine.f6248cU += 0.1f;
                }
                if (c0638ac.f4095s.m2952b()) {
                    gameEngine.f6248cU -= 0.1f;
                }
            }
            if (c0638ac.f4101y.m2958a()) {
                m1979k();
                m1958x();
            }
            if (c0638ac.f4102z.m2958a()) {
                this.f5108f.m2097d();
            }
            if (c0638ac.f4103A.m2958a()) {
                m1979k();
                m1958x();
                Iterator it = AbstractC1120w.f6956en.iterator();
                while (it.hasNext()) {
                    AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
                    if (abstractC1120w instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                        if (!abstractC0623y.isDead && abstractC0623y.team == gameEngine.f6093bs && abstractC0623y.canAttack() && !abstractC0623y.mo3142ak() && abstractC0623y.m3161aS()) {
                            m1980j(abstractC0623y);
                        }
                    }
                }
            }
            if (c0638ac.f4104B.m2958a()) {
                m1979k();
                m1958x();
                Iterator it2 = AbstractC1120w.f6956en.iterator();
                while (it2.hasNext()) {
                    AbstractC1120w abstractC1120w2 = (AbstractC1120w) it2.next();
                    if (abstractC1120w2 instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w2;
                        if (abstractC0623y2.team == gameEngine.f6093bs && abstractC0623y2.getUnitType() == UnitType.f1738e && !abstractC0623y2.isDead) {
                            m1980j(abstractC0623y2);
                            gameEngine.m1150b(abstractC0623y2.f6951ek, abstractC0623y2.f6952el);
                        }
                    }
                }
            }
            if (c0638ac.f4105C.m2958a()) {
                AbstractC0777ab.m2128a(this.f5248by, AbstractC0777ab.f5054a, AbstractC0777ab.f5055b);
            }
            if (c0638ac.f4106D.m2958a()) {
                AbstractC0777ab.m2128a(this.f5248by, AbstractC0777ab.f5056c, null);
            }
            if (c0638ac.f4107E.m2958a()) {
                AbstractC0777ab.m2128a(this.f5248by, AbstractC0777ab.f5057d, null);
            }
            if (c0638ac.f4108F.m2958a()) {
                AbstractC0777ab.m2128a(this.f5248by, AbstractC0777ab.f5058e, null);
            }
            if (c0638ac.f4109G.m2958a()) {
                AbstractC0777ab.m2128a(this.f5248by, AbstractC0777ab.f5059f, null);
            }
            if (c0638ac.f4100x.m2958a()) {
                this.f5106d.m2226a(12);
            }
            if (c0638ac.f4116N.m2958a() && m2078A() && m2077B()) {
                m1979k();
                this.f5119U = null;
                this.f5120W = this.f5192g;
                return;
            } else if (c0638ac.f4118P.m2958a() && m1956z()) {
                m1979k();
                this.f5119U = null;
                this.f5120W = this.f5193h;
                return;
            } else if (c0638ac.f4119Q.m2958a() && m2077B()) {
                m1979k();
                this.f5119U = null;
                this.f5120W = this.f5194i;
                return;
            } else {
                if (c0638ac.f4117O.m2958a()) {
                    m1961u();
                }
                if (c0638ac.f4098v.m2958a()) {
                    m2071H();
                }
                if (c0638ac.f4096t.m2958a() && gameEngine.m1222M()) {
                    GameEngine.PrintLog("showing send chat");
                    this.f5106d.m2226a(13);
                }
                if (c0638ac.f4097u.m2958a() && gameEngine.m1222M()) {
                    GameEngine.PrintLog("showing send team chat");
                    this.f5106d.m2226a(16);
                }
                if (gameEngine.m1220O() || gameEngine.f6120cb.m2635h()) {
                    if (c0638ac.f4114L.m2958a()) {
                        if (gameEngine.f6231bt != 0.0f) {
                            if (!gameEngine.f6120cb.m2635h()) {
                                C0831ad.m1743a((String) null, "Game paused");
                            }
                            gameEngine.f6231bt = 0.0f;
                        } else {
                            gameEngine.f6231bt = 1.0f;
                        }
                    }
                    boolean m2958a = c0638ac.f4112J.m2958a();
                    boolean m2958a2 = c0638ac.f4113K.m2958a();
                    if (m2958a || m2958a2) {
                        if (m2958a) {
                            boolean z4 = gameEngine.f6231bt > 1.0f;
                            if (gameEngine.f6231bt < 2.0f) {
                                gameEngine.f6231bt = (float) (gameEngine.f6231bt - 0.25d);
                            } else if (gameEngine.f6231bt < 6.0f) {
                                gameEngine.f6231bt = (float) (gameEngine.f6231bt - 0.5d);
                            } else if (gameEngine.f6231bt < 16.0f) {
                                gameEngine.f6231bt -= 2.0f;
                            } else {
                                gameEngine.f6231bt -= 4.0f;
                            }
                            if (gameEngine.f6231bt < 0.0f) {
                                gameEngine.f6231bt = 0.0f;
                            }
                            if (z4 && gameEngine.f6231bt < 1.0f) {
                                gameEngine.f6231bt = 1.0f;
                            }
                        } else if (m2958a2) {
                            boolean z5 = gameEngine.f6231bt < 1.0f;
                            if (gameEngine.f6231bt < 2.0f) {
                                gameEngine.f6231bt = (float) (gameEngine.f6231bt + 0.25d);
                            } else if (gameEngine.f6231bt < 6.0f) {
                                gameEngine.f6231bt = (float) (gameEngine.f6231bt + 0.5d);
                            } else if (gameEngine.f6231bt < 16.0f) {
                                gameEngine.f6231bt += 2.0f;
                            } else {
                                gameEngine.f6231bt += 4.0f;
                            }
                            if (gameEngine.f6120cb.m2635h()) {
                                if (gameEngine.f6231bt > 64.0f) {
                                    gameEngine.f6231bt = 64.0f;
                                }
                            } else if (gameEngine.f6231bt > 5.0f) {
                                gameEngine.f6231bt = 5.0f;
                            }
                            if (z5 && gameEngine.f6231bt > 1.0f) {
                                gameEngine.f6231bt = 1.0f;
                            }
                        }
                        if (!gameEngine.f6120cb.m2635h()) {
                            C0831ad.m1743a((String) null, "Game speed now: " + gameEngine.f6231bt);
                        }
                    }
                } else if (c0638ac.f4114L.m2958a() && gameEngine.networkEngine.f5485C && gameEngine.networkEngine.f5533bm) {
                    gameEngine.networkEngine.m1660e(!gameEngine.networkEngine.f5509al);
                }
                gameEngine.f6154cS = CommonUtils.m2368a(gameEngine.f6154cS, f);
                if (c0638ac.f4127Y.m2958a()) {
                    gameEngine.f6154cS = 180.0f;
                }
                if (gameEngine.f6094bv && c0638ac.f4130ab.m2958a()) {
                    gameEngine.f6225bl = !gameEngine.f6225bl;
                    GameEngine.PrintLog("debugTempMode now: " + gameEngine.f6225bl);
                    m2008b("debug: " + gameEngine.f6225bl);
                }
                if (gameEngine.f6094bv && gameEngine.f6225bl && c0638ac.f4131ac.m2958a()) {
                    C0136a.f552ar = !C0136a.f552ar;
                    m2008b("AI debug view: " + C0136a.f552ar);
                }
                if (gameEngine.f6094bv && gameEngine.f6225bl && c0638ac.f4132ad.m2958a()) {
                    C1049f.f6652a = !C1049f.f6652a;
                    m2008b("Map debug: " + C1049f.f6652a);
                }
                if (gameEngine.m1220O() || gameEngine.f6120cb.m2635h()) {
                    if (gameEngine.f6094bv) {
                        if (c0638ac.f4124V.m2958a()) {
                            gameEngine.f6092bp = !gameEngine.f6092bp;
                        }
                        if (c0638ac.f4125W.m2958a()) {
                            if (gameEngine.f6231bt == 1.0f) {
                                gameEngine.f6231bt = 0.1f;
                            } else {
                                gameEngine.f6231bt = 1.0f;
                            }
                        }
                        if (c0638ac.f4126X.m2958a()) {
                            GameEngine.PrintLog("Adding test popup");
                            gameEngine.networkEngine.m1782U();
                        }
                        if (c0638ac.f4128Z.m2958a()) {
                            gameEngine.f6095bw = !gameEngine.f6095bw;
                        }
                        if (c0638ac.f4129aa.m2958a()) {
                            Iterator it3 = AbstractC1120w.f6956en.iterator();
                            while (it3.hasNext()) {
                                AbstractC1120w abstractC1120w3 = (AbstractC1120w) it3.next();
                                if (abstractC1120w3 instanceof AbstractC0623y) {
                                    AbstractC0623y abstractC0623y3 = (AbstractC0623y) abstractC1120w3;
                                    if (abstractC0623y3.f1643cE) {
                                        abstractC0623y3.m3231U();
                                    }
                                }
                            }
                        }
                    }
                    if (c0638ac.f4123U.m2958a()) {
                        gameEngine.f6094bv = !gameEngine.f6094bv;
                        if (gameEngine.f6094bv) {
                            m1958x();
                        }
                    }
                }
            }
        }
        if (gameEngine.f6094bv && !gameEngine.m1220O() && !gameEngine.f6120cb.m2635h()) {
            gameEngine.f6094bv = false;
        }
        if (gameEngine.f6094bv) {
            if (this.f5105c != null && (this.f5105c.f6946ef || this.f5105c.isDead)) {
                this.f5105c = null;
            }
            if (this.f5105c == null) {
                GameEngine.PrintLog("Creating new debug editor");
                this.f5105c = new EditorOrBuilder(false);
                this.f5105c.mo3120b(gameEngine.f6093bs);
            }
            if (m1969p() == 0) {
                m1958x();
                m1980j(this.f5105c);
            }
            if (gameEngine.f6109bQ.liveReloading && gameEngine.f6233bx % 100 == 0 && !gameEngine.f6120cb.m2636g()) {
                C0348af.m5395c();
            }
        } else {
            if (this.f5105c != null && (this.f5105c.f6946ef || this.f5105c.isDead)) {
                this.f5105c = null;
            }
            if (this.f5105c != null && !gameEngine.f6120cb.m2635h()) {
                m1985h();
            }
        }
        if (this.f5219N) {
            if (this.f5211F) {
                this.f5106d.f4942aq = this.f5216K - this.f5204t;
            } else {
                int i2 = 1;
                if (gameEngine.f6109bQ.mouseOrders == 2) {
                    i2 = 2;
                }
                if ((!gameEngine.f6109bQ.mouseSupport || this.f5207w != i2) && !m2000c(gameEngine)) {
                    SettingsEngine settingsEngine = gameEngine.f6109bQ;
                    double d = this.f5215J - this.f5203s;
                    double d2 = this.f5216K - this.f5204t;
                    float m2314b2 = CommonUtils.m2314b(0.0f, 0.0f, (float) d, (float) d2);
                    double d3 = (d * settingsEngine.scrollSpeed) / gameEngine.f6250cW;
                    double d4 = (d2 * settingsEngine.scrollSpeed) / gameEngine.f6250cW;
                    if (f != 0.0f && m2314b2 > 50.0d * f) {
                        float f13 = 0.7f;
                        if (GameEngine.m1157au()) {
                            f13 = 1.7f;
                        }
                        this.f5217L = (float) (d3 * f13);
                        this.f5218M = (float) (d4 * f13);
                    }
                    gameEngine.f6140cx = (float) (gameEngine.f6140cx + (d3 * 2.0d));
                    gameEngine.f6141cy = (float) (gameEngine.f6141cy + (d4 * 2.0d));
                }
            }
            this.f5215J = this.f5203s;
            this.f5216K = this.f5204t;
        }
        if (gameEngine.f6109bQ.mouseSupport && (this.f5250bE.f5000a != ((int) gameEngine.m1173ae()) || this.f5250bE.f5001b != ((int) gameEngine.m1172af()))) {
            this.f5250bE.f5000a = (int) gameEngine.m1173ae();
            this.f5250bE.f5001b = (int) gameEngine.m1172af();
            this.f5199n.m2145b(this.f5250bE);
        }
        if (this.f5220O && m2070I()) {
            this.f5199n.m2145b(C0765c.m2176a((int) this.f5205u, (int) this.f5206v));
        }
        this.f5199n.m2147b(f);
    }

    /* renamed from: h */
    public void m1985h() {
        if (this.f5105c != null) {
            m1976l(this.f5105c);
            this.f5105c.m5812ch();
            this.f5105c = null;
        }
    }

    /* renamed from: i */
    public EditorOrBuilder m1983i() {
        return this.f5105c;
    }

    /* renamed from: a */
    public void m2036a(EditorOrBuilder editorOrBuilder) {
        this.f5105c = editorOrBuilder;
    }

    /* renamed from: a */
    public boolean m2028a(GameEngine gameEngine) {
        if (!gameEngine.f6109bQ.keyboardSupport) {
            return false;
        }
        return gameEngine.m1140c(59, 60);
    }

    /* renamed from: b */
    public boolean m2009b(GameEngine gameEngine) {
        if (!gameEngine.f6109bQ.keyboardSupport) {
            return false;
        }
        return gameEngine.m1140c(113, 114);
    }

    /* renamed from: c */
    public boolean m2000c(GameEngine gameEngine) {
        if (!gameEngine.f6109bQ.keyboardSupport) {
            return false;
        }
        return gameEngine.m1140c(57, 58);
    }

    /* renamed from: b */
    public void m2017b(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f5118T += 0.2f * f;
        if (this.f5118T > 360.0f) {
            this.f5118T -= 360.0f;
        }
        this.f5239bj.m7208a((int) (gameEngine.f6128ck - gameEngine.f6132cp), 0, (int) gameEngine.f6128ck, (int) gameEngine.f6129cl);
        if (!f5187bA) {
            if (this.f5249bz) {
                this.f5242bm.m7271a();
                this.f5242bm.m7242b(Color.argb(255, 33, 40, 52));
                this.f5242bm.m7260a(Paint.Style.FILL);
                gameEngine.graphics.mo892b(this.f5239bj, this.f5242bm);
            } else {
                gameEngine.graphics.mo912a(this.f5235bf, this.f5239bj, (Paint) null);
            }
            this.f5242bm.m7271a();
            this.f5242bm.m7242b(Color.argb(255, 0, 0, 0));
            this.f5242bm.m7260a(Paint.Style.STROKE);
            gameEngine.graphics.mo892b(this.f5239bj, this.f5242bm);
        }
        this.f5175bR = 0;
        this.f5177bT = 0;
        this.f5176bS = 0;
        this.f5179bV = this.f5180bW;
        this.f5180bW = 0;
        if (gameEngine.f6120cb.m2635h() || (gameEngine.f6093bs != null && gameEngine.f6093bs.m6374b())) {
            AbstractC0623y m1965r = m1965r();
            if (m1965r != null) {
                m2025a(gameEngine, m1965r.team, false, true);
            }
        } else {
            AbstractC0623y m1963s = m1963s();
            if (gameEngine.f6093bs != null && gameEngine.f6093bs != Team.f1370i && !gameEngine.f6093bs.m6374b() && !gameEngine.f6120cb.m2635h()) {
                m2025a(gameEngine, gameEngine.f6093bs, false, true);
            }
            if (m1963s != null && gameEngine.f6093bs != m1963s.team && m1974m(m1963s)) {
                m2025a(gameEngine, m1963s.team, true, true);
            }
        }
        if (gameEngine.f6094bv && !gameEngine.f6120cb.m2635h()) {
            String str = VariableScope.nullOrMissingString;
            if (gameEngine.f6094bv) {
                str = str + "Editor Active\n";
            }
            if (gameEngine.f6231bt != 1.0f) {
                str = str + "Game Speed: " + gameEngine.f6231bt + "x\n";
            }
            if (gameEngine.f6095bw) {
                str = str + "Invincible Units\n";
            }
            boolean z = false;
            Iterator it = Team.m6358c().iterator();
            while (it.hasNext()) {
                Team team = (Team) it.next();
                if (team instanceof C0136a) {
                    z = ((C0136a) team).f618bF > 0.0f;
                }
            }
            if (z) {
                str = str + "AIs frozen\n";
            }
            this.f5242bm.m7271a();
            this.f5242bm.m7242b(Color.argb(0, 0, 0, 0));
            this.f5242bm.m7260a(Paint.Style.FILL);
            float f2 = 70.0f * gameEngine.f6126ci;
            float f3 = 40.0f;
            if (gameEngine.f6128ck < 600.0f && gameEngine.f6129cl > 650.0f) {
                f2 = 10.0f;
                f3 = 60.0f * gameEngine.f6126ci;
            }
            gameEngine.graphics.mo902a(str, f2, f3, this.f5141as, this.f5242bm, 6.0f);
        }
        m1981j();
        this.f5199n.m2137f();
    }

    /* renamed from: j */
    public void m1981j() {
        GameEngine.getInstance();
    }

    /* renamed from: a */
    public void m2025a(GameEngine gameEngine, Team team, boolean z, boolean z2) {
        if (team.f1308n) {
            m2027a(gameEngine, team, z, C0431c.f2761B, team.m6398W() + team.f1310p, (C0439f) null, 0, (C0428a) null);
        }
        if (z2) {
            this.f5251bF.m5087g(team.m6397X());
            Iterator it = C0428a.m5147e().iterator();
            while (it.hasNext()) {
                C0428a c0428a = (C0428a) it.next();
                if (c0428a.m5149c() && c0428a.f2748o) {
                    this.f5251bF.m5099c(c0428a);
                }
            }
            this.f5251bF.m5090e();
            m2026a(gameEngine, team, z, this.f5251bF);
        }
    }

    /* renamed from: a */
    public void m2026a(GameEngine gameEngine, Team team, boolean z, C0439f c0439f) {
        Iterator it = c0439f.f2801b.iterator();
        while (it.hasNext()) {
            C0438e c0438e = (C0438e) it.next();
            if (!c0438e.f2798a.m5161a()) {
                m2027a(gameEngine, team, z, c0438e.f2798a, c0438e.f2799b, c0439f, 0, (C0428a) null);
            }
        }
    }

    /* renamed from: a */
    public boolean m2027a(GameEngine gameEngine, Team team, boolean z, C0428a c0428a, double d, C0439f c0439f, int i, C0428a c0428a2) {
        float f;
        float f2;
        C0428a c0428a3;
        if (i == 0) {
            this.f5178bU = 0;
        }
        boolean z2 = false;
        if (i < 6 && c0439f != null && (c0428a3 = c0428a.f2742i) != null && ((c0428a.f2743j || d != 0.0d) && m2027a(gameEngine, team, z, c0428a3, c0439f.m5123a(c0428a3), c0439f, i + 1, c0428a))) {
            z2 = true;
        }
        if (d == 0.0d && !c0428a.f2748o) {
            if (z2) {
                return true;
            }
            return false;
        }
        String m5159a = c0428a.m5159a(d, true);
        int m6368b = team.m6368b(c0428a);
        int m6388a = team.m6388a(c0428a);
        if (m6388a != 0) {
            m5159a = m5159a + "(+" + m6368b + ")(-" + m6388a + ")";
        } else if (m6368b != 0) {
            if (m6368b >= 0) {
                m5159a = m5159a + "(+" + m6368b + ")";
            } else {
                m5159a = m5159a + "(" + m6368b + ")";
            }
        }
        int i2 = ((int) (gameEngine.f6128ck - gameEngine.f6132cp)) - this.f5178bU;
        Paint paint = this.f5138ap;
        if (z) {
            paint = this.f5139aq;
        } else {
            Integer m5145g = c0428a.m5145g();
            if (m5145g != null) {
                this.f5223an.m7259a(paint);
                paint = this.f5223an;
                paint.m7242b(m5145g.intValue());
            }
        }
        float mo888b = gameEngine.graphics.mo888b(m5159a, paint);
        float mo901a = gameEngine.graphics.mo901a(m5159a, paint);
        if (this.f5180bW < mo888b) {
            this.f5180bW = (int) mo888b;
        }
        int i3 = this.f5177bT;
        if (c0428a.f2754u) {
            i3 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        if (i3 == 0) {
            i4 = this.f5176bS;
        } else {
            i5 = this.f5175bR;
        }
        int i6 = 0;
        int i7 = 6;
        int i8 = 6;
        int i9 = 6;
        boolean z3 = false;
        float f3 = mo888b + 6 + 6;
        if (c0428a.f2744k) {
            f3 += 80.0f;
        }
        if (i2 < f3 && c0428a.f2742i != null) {
            z3 = true;
            this.f5175bR = (int) (this.f5175bR + mo901a + 6);
            i5 = this.f5175bR;
            i2 += this.f5178bU;
            this.f5178bU = 0;
        }
        if (i3 != 0) {
            i7 = 0;
        }
        if (c0428a2 != null && !c0428a2.f2744k) {
            i8 = 0;
        }
        if (z2 && !c0428a.f2744k) {
            i2 += 6;
            i9 = 0;
        }
        if (z2 && c0428a.f2744k && !z3) {
            i6 = gameEngine.graphics.mo888b("AA", paint);
        }
        int i10 = i2 - i6;
        BitmapOrTexture m5142j = c0428a.m5142j();
        float f4 = 1.0f;
        if (m5142j != null) {
            float f5 = mo901a - 3.0f;
            if (f5 < 3.0f) {
                f5 = 3.0f;
            }
            f4 = C0795d.m2084a(m5142j, mo901a * 3.0f, f5);
            f = (m5142j.f6396p * f4) + 3.0f;
            i8 += (int) f;
        } else {
            f = 0.0f;
        }
        C0795d.m2082a(m5159a, ((i10 - mo888b) - i4) - 6, i5 + 6, paint, this.f5140ar, i8, i7, i9, 6);
        if (m5142j != null) {
            gameEngine.graphics.mo914a(m5142j, (int) (((f2 - (f / 2.0f)) - (m5142j.f6398r * f4)) - 3.0f), (int) (((i5 + 6) + (mo901a / 2.0f)) - (m5142j.f6399s * f4)), this.f5245bp, 0.0f, f4);
        }
        if (i == 0) {
            if (i3 == 0) {
                this.f5176bS = (int) (this.f5176bS + mo888b + i9 + i8);
            }
            if (this.f5177bT == i3) {
                this.f5175bR = (int) (this.f5175bR + mo901a + 6);
                this.f5177bT++;
            }
        }
        this.f5178bU = (int) (this.f5178bU + mo888b + i9 + i8 + i6);
        return true;
    }

    /* renamed from: b */
    public boolean m2006b(boolean z) {
        return m2019a(z, false, false);
    }

    /* renamed from: a */
    public boolean m2020a(boolean z, boolean z2) {
        return m2019a(z, true, z2);
    }

    /* renamed from: a */
    public boolean m2019a(boolean z, boolean z2, boolean z3) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (GameEngine.m1157au()) {
            return false;
        }
        this.f5165aX = true;
        float f = gameEngine.f6126ci * 0.6f;
        int i = (int) (100.0f * f);
        int i2 = (int) (10.0f * f);
        int i3 = (int) ((gameEngine.f6129cl - ((int) (9.0f * f))) - (i * this.f5166aY));
        if (f5181bD) {
            i3 = (int) (i3 - gameEngine.f6115bW.f5300d);
        }
        if (z3) {
            int i4 = ((int) (20.0f * f)) + i + ((int) (20.0f * f)) + i;
            this.f5240bk.m7208a(i2 + i4, i3, i2 + i4 + i, i3 + i);
            gameEngine.graphics.mo914a(this.f5230aW, this.f5240bk.f230a, this.f5240bk.f231b, this.f5167aZ, 0.0f, f);
        } else if (z) {
            this.f5240bk.m7208a(i2, i3, i2 + i, i3 + i);
            gameEngine.graphics.mo914a(this.f5229aV, this.f5240bk.f230a, this.f5240bk.f231b, this.f5167aZ, 0.0f, f);
        } else {
            int i5 = ((int) (20.0f * f)) + i;
            this.f5240bk.m7208a(i2 + i5, i3, i2 + i5 + i, i3 + i);
            gameEngine.graphics.mo914a(this.f5228aU, this.f5240bk.f230a, this.f5240bk.f231b, this.f5167aZ, 0.0f, f);
        }
        if (this.f5220O && !this.f5219N) {
            CommonUtils.m2352a(this.f5240bk, 10.0f * f);
            if (this.f5240bk.m7205b((int) this.f5203s, (int) this.f5204t)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m1979k() {
        GameEngine.getInstance();
        if (this.f5120W != null) {
            if (this.f5120W.mo6184e() == EnumC0226u.f1475b) {
                this.f5120W = null;
                this.f5122Y = false;
                this.f5126ac = false;
                this.f5119U = null;
                this.f5133aj = false;
                this.f5121X++;
            } else {
                this.f5120W = null;
            }
            this.f5136am = 0;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m2004c(float f) {
        float f2;
        float f3;
        GameEngine gameEngine = GameEngine.getInstance();
        Point m1930c = gameEngine.f6115bW.m1930c(this.f5203s, this.f5204t);
        if (m1930c != null) {
            f2 = m1930c.f224a;
            f3 = m1930c.f225b;
        } else {
            f2 = (this.f5203s / gameEngine.f6250cW) + gameEngine.f6138cv;
            f3 = (this.f5204t / gameEngine.f6250cW) + gameEngine.f6139cw;
        }
        this.f5123Z = CommonUtils.m2368a(this.f5123Z, f);
        this.f5239bj.m7208a((int) (gameEngine.f6128ck - gameEngine.f6132cp), 0, (int) gameEngine.f6128ck, (int) gameEngine.f6129cl);
        if (!f5187bA && ((this.f5220O || this.f5209D) && this.f5239bj.m7205b((int) this.f5203s, (int) this.f5204t))) {
            this.f5164aT = true;
        }
        this.f5106d.m2229a(f);
        this.f5106d.m2210b(f);
        this.f5116R += f;
        if (!gameEngine.m1095z()) {
            this.f5106d.m2228a(f, this.f5106d.m2201d(f));
            this.f5106d.m2192g(f);
            this.f5107e.m1953a(f);
            this.f5108f.m2106a(f);
            if (this.f5201p) {
                this.f5106d.m2205c(f);
            }
            this.f5106d.m2197e(f);
            this.f5106d.m2227a(f, true);
        }
        m2063a(f, f2, f3, m1930c);
        if (!gameEngine.m1095z() && !this.f5201p) {
            this.f5106d.m2205c(f);
        }
        boolean z = false;
        if (!this.f5219N) {
            boolean z2 = true;
            boolean z3 = true;
            boolean z4 = true;
            if (GameEngine.m1157au() && gameEngine.f6109bQ.mouseSupport) {
                if (gameEngine.f6109bQ.mouseOrders == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    if (gameEngine.f6109bQ.mouseOrders == 1) {
                        if (gameEngine.m1127e(1)) {
                            z3 = true;
                        } else if (gameEngine.m1127e(2)) {
                            z4 = true;
                        }
                    } else if (gameEngine.m1127e(2)) {
                        z3 = true;
                    } else if (gameEngine.m1127e(1)) {
                        z4 = true;
                    }
                }
            }
            float f4 = f2;
            float f5 = f3;
            if (this.f5209D && m1930c != null && this.f5210E) {
                boolean z5 = false;
                if (!z2 && !z4) {
                    z5 = true;
                }
                if (m1969p() == 0 || !m2077B()) {
                    z5 = true;
                }
                if (z2 && this.f5202r > 20.0f) {
                    z5 = true;
                }
                if (z5) {
                    gameEngine.m1150b(f4, f5);
                    z = true;
                }
            }
            if ((this.f5110x || (m1930c != null && (z2 || z4))) && !z && this.f5120W == null && this.f5220O) {
                if (this.f5202r > 30.0f) {
                    if (m2068a() && m1930c == null) {
                        m1958x();
                        m2015b(f4, f5, m2018b() / gameEngine.f6250cW);
                        m2075D();
                    }
                } else {
                    gameEngine.f6155cT = false;
                    if (!z2) {
                        if (z3) {
                            Unit unit = null;
                            if (m1930c == null) {
                                unit = m2058a(f4, f5, true);
                            }
                            m2039a(unit);
                        } else if (z4) {
                            Unit unit2 = null;
                            if (m1930c == null) {
                                unit2 = m2058a(f4, f5, false);
                            }
                            boolean z6 = false;
                            if (unit2 == null) {
                                z6 = true;
                            } else if (!m2037a(unit2, false, f4, f5, m1930c)) {
                                z6 = true;
                            }
                            if (z6) {
                                m2003c(f4, f5, m1930c);
                            }
                        }
                    } else {
                        Unit unit3 = null;
                        Unit unit4 = null;
                        if (m1930c == null) {
                            unit3 = m2058a(f4, f5, true);
                            unit4 = m2058a(f4, f5, false);
                        }
                        if (unit3 == null && unit4 == null) {
                            m2003c(f4, f5, m1930c);
                        } else if (unit4 != null) {
                            if (!m2037a(unit4, true, f4, f5, m1930c)) {
                                if (!unit4.m5757t()) {
                                    m2039a(unit4);
                                } else if (unit3 != null) {
                                    m2039a(unit3);
                                }
                            }
                        } else {
                            m2039a(unit3);
                        }
                    }
                }
            }
        }
        if (this.f5120W == null && this.f5209D && !this.f5219N && !this.f5210E && !this.f5164aT) {
            this.f5137ao.m7260a(Paint.Style.FILL);
            this.f5137ao.m7270a(1.0f);
            if (this.f5202r > 20.0f && m2068a()) {
                float m2018b = m2018b();
                this.f5137ao.m7267a(100, 0, 255, 0);
                gameEngine.graphics.mo931a(this.f5203s, this.f5204t, m2018b, this.f5137ao);
                this.f5137ao.m7260a(Paint.Style.STROKE);
                this.f5137ao.m7270a(1.0f);
                this.f5137ao.m7267a(200, 0, 255, 0);
                gameEngine.graphics.mo931a(this.f5203s, this.f5204t, m2018b, this.f5137ao);
            }
        }
        if (gameEngine.f6224bk && gameEngine.m1176ab() && gameEngine.m1174ad() > 0) {
            Paint paint = new Paint();
            paint.m7237c(100);
            for (int i = 0; i < gameEngine.m1174ad(); i++) {
                gameEngine.graphics.mo880i();
                gameEngine.graphics.mo933a(0.7f, 0.7f, gameEngine.m1149b(i), gameEngine.m1141c(i));
                gameEngine.graphics.mo915a(this.f5236bg, gameEngine.m1149b(i), gameEngine.m1141c(i), paint);
                gameEngine.graphics.mo879j();
            }
        }
        if (!this.f5209D) {
            this.f5202r = 0.0f;
            this.f5219N = false;
        }
        this.f5208C = this.f5209D;
        gameEngine.m1175ac();
        if (f5185bQ) {
            m2069J();
            f5185bQ = false;
        }
    }

    /* renamed from: a */
    public void m2063a(float f, float f2, float f3, Point point) {
        GameEngine gameEngine = GameEngine.getInstance();
        AbstractC0623y m2195f = this.f5106d.m2195f();
        if (this.f5165aX) {
            this.f5166aY = CommonUtils.m2367a(this.f5166aY, 1.0f, 0.05f * f);
            this.f5166aY = (float) (this.f5166aY + (0.08d * (1.0f - this.f5166aY)));
        } else {
            this.f5166aY = CommonUtils.m2367a(this.f5166aY, 0.0f, 0.3f * f);
        }
        this.f5165aX = false;
        if (this.f5120W != null) {
            if (this.f5120W instanceof C0212g) {
                C0212g c0212g = (C0212g) this.f5120W;
                if (c0212g.f1432b != null) {
                    m2195f = c0212g.f1432b;
                }
            }
            if (this.f5120W.mo6184e() == EnumC0226u.f1478e) {
                m2043a(this.f5120W, false, m2195f, false);
                if (m2006b(false) || m1975m()) {
                    m1979k();
                    this.f5220O = false;
                } else if (this.f5220O && !this.f5219N && !m1977l()) {
                    Unit m2058a = m2058a(f2, f3, false);
                    if (m2058a != null && this.f5120W.m6052o(m2058a)) {
                        m2010b(m2058a);
                        if (!m2028a(gameEngine)) {
                            m1979k();
                        }
                    } else {
                        m2065a(f2, f3, 0.0f);
                    }
                    this.f5220O = false;
                }
            } else if (this.f5120W.mo6184e() == EnumC0226u.f1479f) {
                m2043a(this.f5120W, false, m2195f, false);
                if (m2006b(false) || m1975m()) {
                    m1979k();
                    this.f5220O = false;
                } else if (this.f5220O && !this.f5219N && !m1977l()) {
                    Unit m2058a2 = m2058a(f2, f3, true);
                    if (m2058a2 != null && this.f5120W.m6052o(m2058a2)) {
                        m1995d(m2058a2);
                        if (!m2028a(gameEngine)) {
                            m1979k();
                        }
                    } else {
                        m2065a(f2, f3, 0.0f);
                    }
                    this.f5220O = false;
                }
            } else if (this.f5120W.mo6184e() == EnumC0226u.f1477d) {
                m2043a(this.f5120W, false, m2195f, false);
                if (m2006b(false) || m1975m()) {
                    m1979k();
                    this.f5220O = false;
                } else if (this.f5220O && !this.f5219N && !m1977l()) {
                    m2016b(f2, f3);
                    m1979k();
                    this.f5220O = false;
                }
            } else if (this.f5120W.mo6184e() == EnumC0226u.f1480g) {
                m2043a(this.f5120W, false, m2195f, false);
                AbstractC0623y m2195f2 = this.f5106d.m2195f();
                Action action = this.f5120W;
                if (this.f5120W instanceof C0212g) {
                    C0212g c0212g2 = (C0212g) action;
                    if (c0212g2.f1432b != null) {
                        m2195f2 = c0212g2.f1432b;
                    }
                    action = c0212g2.f1431a;
                }
                if (m2195f2 != null && (m2195f2 instanceof AbstractC0623y)) {
                    gameEngine.graphics.mo880i();
                    gameEngine.m1218Q();
                    ((AbstractC0623y) m2195f2).m3208a(action);
                    gameEngine.graphics.mo879j();
                }
                boolean z = this.f5220O && !this.f5219N && !m1977l();
                if (this.f5120W.m6050p()) {
                    if (GameEngine.m1156av()) {
                        z = m1973n() && this.f5110x && m2070I();
                    } else {
                        z = this.f5209D && this.f5110x && m2070I();
                    }
                }
                if (m2006b(false) || m1975m()) {
                    m1979k();
                    this.f5220O = false;
                } else if (z && point == null) {
                    boolean z2 = false;
                    if (m2046a(this.f5120W, f2, f3)) {
                        z2 = true;
                    }
                    if (!z2) {
                        m2011b(this.f5120W, f2, f3);
                        if (!m2028a(gameEngine) && !this.f5120W.m6053o()) {
                            m1979k();
                        }
                    } else {
                        m2065a(f2, f3, 0.0f);
                    }
                    this.f5220O = false;
                }
            } else if (this.f5120W.mo6184e() == EnumC0226u.f1481h) {
                m2043a(this.f5120W, false, m2195f, false);
                if (m2006b(false) || m1975m()) {
                    m1979k();
                    this.f5220O = false;
                } else if (this.f5220O && !this.f5219N && !m1977l()) {
                    m1997d(f2, f3, point);
                    if (!m2028a(gameEngine)) {
                        m1979k();
                        this.f5220O = false;
                    }
                }
            } else if (this.f5120W.mo6184e() == EnumC0226u.f1485l) {
                m2043a(this.f5120W, false, m2195f, false);
                if (m2006b(false) || m1975m()) {
                    m1979k();
                    this.f5220O = false;
                } else if (this.f5220O && !this.f5219N && !m1977l()) {
                    Unit m2058a3 = m2058a(f2, f3, true);
                    if (m2058a3 != null && this.f5120W.m6052o(m2058a3)) {
                        m1991e(m2058a3);
                        m1979k();
                    } else {
                        m2065a(f2, f3, 0.0f);
                    }
                    this.f5220O = false;
                }
            } else if (this.f5120W.mo6184e() == EnumC0226u.f1486m) {
                m2043a(this.f5120W, false, m2195f, false);
                if (m2006b(false) || m1975m()) {
                    m1979k();
                    this.f5220O = false;
                } else if (this.f5220O && !this.f5219N && !m1977l()) {
                    m2060a(f2, f3, point, this.f5136am == 0);
                    this.f5136am++;
                }
            } else if (this.f5120W.mo6184e() == EnumC0226u.f1483j) {
                m2043a(this.f5120W, false, m2195f, false);
                if (m2006b(false) || m1975m()) {
                    m1979k();
                    this.f5220O = false;
                } else if (this.f5220O && !this.f5219N && !m1977l() && point == null) {
                    if (this.f5120W instanceof C0215j) {
                        m2061a(f2, f3, point, (C0215j) this.f5120W);
                    } else {
                        GameEngine.m1145b("orderBuildingSpecialAction is not a PingMapAction, it is: " + this.f5120W.getClass().getName());
                    }
                    m1979k();
                    this.f5220O = false;
                }
            } else if (this.f5120W.mo7517i() != null && this.f5120W.mo6184e() == EnumC0226u.f1475b) {
                m2062a(f2, f3, point);
            }
        }
    }

    /* renamed from: a */
    public void m2062a(float f, float f2, Point point) {
        boolean z;
        Point m1955a;
        GameEngine gameEngine = GameEngine.getInstance();
        Unit m2195f = this.f5106d.m2195f();
        boolean z2 = false;
        if (m2195f != null && m2195f.m5893a(this.f5120W.m6095N()) != null) {
            z2 = this.f5120W.mo4247a(m2195f, true) && !C0760a.m2223a(this.f5120W);
            if (!this.f5120W.mo4245b(m2195f)) {
                z2 = false;
            }
        }
        m2043a(this.f5120W, false, m2195f, !z2);
        float f3 = this.f5205u / gameEngine.f6250cW;
        float f4 = this.f5206v / gameEngine.f6250cW;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        if (GameEngine.m1156av() && gameEngine.f6109bQ.mouseSupport) {
            z3 = true;
            z6 = this.f5212G;
        }
        if (z3) {
            if (m1973n()) {
                if (!this.f5133aj) {
                    this.f5133aj = true;
                    this.f5131ah = f3 + gameEngine.f6138cv;
                    this.f5132ai = f4 + gameEngine.f6139cw;
                }
            } else {
                this.f5133aj = false;
            }
            if (this.f5133aj) {
                float f5 = f3 - (this.f5131ah - gameEngine.f6138cv);
                float f6 = f4 - (this.f5132ai - gameEngine.f6139cw);
                if (CommonUtils.m2294c(f5) > 4.0f || CommonUtils.m2294c(f6) > 4.0f) {
                    z4 = true;
                }
            }
        }
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = true;
        boolean z12 = false;
        if (GameEngine.m1157au() && gameEngine.f6109bQ.mouseSupport) {
            z12 = true;
        }
        if (this.f5122Y && !z12) {
            if (z2) {
                if (!this.f5126ac && m2020a(true, false)) {
                    gameEngine.audio.m2998b(AudioEngine.f4037h, 0.5f);
                    this.f5220O = false;
                    z7 = true;
                }
                if (m2020a(true, true)) {
                    gameEngine.audio.m2998b(AudioEngine.f4037h, 0.5f);
                    this.f5220O = false;
                    z9 = true;
                }
            }
            if (m2020a(false, false)) {
                gameEngine.audio.m2998b(AudioEngine.f4038i, 0.7f);
                this.f5220O = false;
                z8 = true;
            }
        }
        boolean z13 = false;
        if (GameEngine.m1156av() && gameEngine.f6109bQ.mouseSupport) {
            z13 = true;
        }
        if (this.f5220O && !this.f5219N) {
            z13 = true;
        }
        if (GameEngine.m1158at()) {
            z5 = true;
            if (gameEngine.m1174ad() == 2) {
                z13 = true;
                f3 = gameEngine.m1149b(0) / gameEngine.f6250cW;
                f4 = gameEngine.m1141c(0) / gameEngine.f6250cW;
                float m1149b = gameEngine.m1149b(1) / gameEngine.f6250cW;
                this.f5133aj = true;
                this.f5131ah = m1149b;
                this.f5132ai = gameEngine.m1141c(1) / gameEngine.f6250cW;
            } else if (this.f5220O && !this.f5219N) {
                this.f5133aj = false;
            }
            if (this.f5133aj) {
                z4 = true;
            }
        }
        if (z13) {
            this.f5122Y = true;
            this.f5124aa = f3 * gameEngine.f6250cW;
            this.f5125ab = f4 * gameEngine.f6250cW;
            if (!m2066a(gameEngine.m1173ae(), gameEngine.m1172af())) {
                this.f5122Y = false;
                z11 = false;
            }
        }
        float f7 = this.f5131ah;
        float f8 = this.f5132ai;
        if (z5) {
            f7 += gameEngine.f6138cv + gameEngine.f6133cq;
            f8 += gameEngine.f6139cw + gameEngine.f6134cr;
        }
        InterfaceC0303as mo7517i = this.f5120W.mo7517i();
        int m6044t = this.f5120W.m6044t();
        boolean z14 = false;
        if (GameEngine.m1156av() && gameEngine.f6109bQ.mouseSupport && !gameEngine.f6241cJ.m7205b((int) this.f5205u, (int) this.f5206v)) {
            z14 = true;
        }
        Unit m5847c = Unit.m5847c(mo7517i);
        if ((m5847c == null || !(m5847c instanceof AbstractC0623y)) && C0453l.f2901b != null) {
            m5847c = Unit.m5847c(C0453l.f2901b);
        }
        if (this.f5122Y && !z14) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m5847c;
            gameEngine.f6104bL.m6617b((this.f5124aa / gameEngine.f6250cW) + gameEngine.f6138cv, (this.f5125ab / gameEngine.f6250cW) + gameEngine.f6139cw);
            abstractC0623y.f6951ek = gameEngine.f6104bL.f800T;
            abstractC0623y.f6952el = gameEngine.f6104bL.f801U;
            if (mo7517i.mo5699p()) {
                z4 = false;
                if (C0799h.m1955a((int) abstractC0623y.f6951ek, (int) abstractC0623y.f6952el, 3) != null) {
                    abstractC0623y.f6951ek = m1955a.f224a;
                    abstractC0623y.f6952el = m1955a.f225b;
                }
            }
            if (!abstractC0623y.m5867bI()) {
                abstractC0623y.direction = 0.0f;
            } else {
                abstractC0623y.direction = -90.0f;
            }
            abstractC0623y.f6951ek += abstractC0623y.m5823cX();
            abstractC0623y.f6952el += abstractC0623y.m5822cY();
            abstractC0623y.mo3120b(this.f5119U.team);
            abstractC0623y.mo4213a(m6044t);
            abstractC0623y.f1626cn = true;
            String m3110b = abstractC0623y.m3110b(false, gameEngine.f6093bs);
            if (C0741a.m2576a(gameEngine.f6093bs, abstractC0623y, this.f5121X)) {
                m3110b = "{0}";
            }
            if (m1969p() == 1 && m2195f != null && (m2195f instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m2195f;
                if (!abstractC0623y2.m3162aR()) {
                    float m2366a = CommonUtils.m2366a(abstractC0623y2.f6951ek, abstractC0623y2.f6952el, abstractC0623y.f6951ek, abstractC0623y.f6952el);
                    float f9 = abstractC0623y2.mo3503f(abstractC0623y.getUnitType());
                    if (f9 > 800000.0f) {
                        z = true;
                    } else {
                        z = m2366a <= f9 * f9;
                    }
                    if (!z) {
                        m3110b = "{0}";
                    }
                }
            }
            if (z4) {
            }
            Unit unit = null;
            if (m1969p() == 1) {
                unit = m2195f;
            }
            if (z2) {
                if (z4) {
                    if (GameEngine.m1157au() || (GameEngine.m1158at() && gameEngine.m1174ad() == 2)) {
                        gameEngine.graphics.mo932a(f3 * gameEngine.f6250cW, f4 * gameEngine.f6250cW, (f7 - gameEngine.f6138cv) * gameEngine.f6250cW, (f8 - gameEngine.f6139cw) * gameEngine.f6250cW, this.f5246bq);
                    } else {
                        gameEngine.graphics.mo932a((abstractC0623y.f6951ek - gameEngine.f6138cv) * gameEngine.f6250cW, (abstractC0623y.f6952el - gameEngine.f6139cw) * gameEngine.f6250cW, (f7 - gameEngine.f6138cv) * gameEngine.f6250cW, (f8 - gameEngine.f6139cw) * gameEngine.f6250cW, this.f5246bq);
                    }
                    m3110b = null;
                    m2035a(abstractC0623y, f7, f8, abstractC0623y.f6951ek, abstractC0623y.f6952el, true, (ArrayList) null, unit);
                } else {
                    m2034a(abstractC0623y, abstractC0623y.f6951ek, abstractC0623y.f6952el, true, z6, unit);
                }
            }
            abstractC0623y.mo4213a(1);
            if (z11 && m1971o()) {
                this.f5220O = false;
                if (m2028a(gameEngine)) {
                    z9 = true;
                    z10 = true;
                } else {
                    z7 = true;
                }
            }
            if (m1975m()) {
                this.f5220O = false;
                z8 = true;
            }
            if (this.f5220O && !this.f5219N) {
                float f10 = f4;
                float f11 = this.f5134ak;
                float f12 = this.f5135al;
                if (CommonUtils.m2294c(f11 - f3) < 15.0f && CommonUtils.m2294c(f12 - f10) < 15.0f && this.f5123Z != 0.0f) {
                    this.f5220O = false;
                    gameEngine.audio.m2998b(AudioEngine.f4037h, 0.5f);
                    if (this.f5126ac) {
                        z9 = true;
                    } else {
                        z7 = true;
                    }
                }
                this.f5123Z = 80.0f;
                this.f5134ak = f3;
                this.f5135al = f4;
            }
            if ((z7 || z9) && z2) {
                if (m3110b != null) {
                    gameEngine.audio.m2998b(AudioEngine.f4041l, 0.7f);
                    if (m3110b != "{0}") {
                        String str = m3110b;
                        if (str == "{2}") {
                            str = this.f5173bw;
                        }
                        if (str == "{3}") {
                            str = this.f5174bx;
                        }
                        if (str == "{1}") {
                            str = this.f5172bv;
                        }
                        m1999c(str);
                    }
                } else {
                    float f13 = abstractC0623y.f6951ek;
                    float f14 = abstractC0623y.f6952el;
                    ArrayList arrayList = new ArrayList();
                    if (z4) {
                        m2035a(abstractC0623y, f7, f8, abstractC0623y.f6951ek, abstractC0623y.f6952el, false, arrayList, (Unit) null);
                    } else {
                        arrayList.add(new PointF(f13, f14));
                    }
                    int i = 0;
                    boolean z15 = true;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        PointF pointF = (PointF) it.next();
                        if (this.f5120W.m6106A()) {
                            C0749e m1959w = m1959w();
                            m2033a(m1959w);
                            m1959w.m2495a(this.f5120W.m6095N(), pointF, (Unit) null);
                        } else {
                            C0749e m1959w2 = m1959w();
                            if (z15) {
                                z15 = false;
                                if (z9) {
                                    if (!m1959w2.f4849e) {
                                        m1959w2.f4850f = true;
                                    }
                                    this.f5126ac = true;
                                }
                            } else {
                                m1959w2.f4849e = true;
                            }
                            AbstractC0623y m1963s = m1963s();
                            if (this.f5120W instanceof C0212g) {
                                AbstractC0623y abstractC0623y3 = ((C0212g) this.f5120W).f1432b;
                                m1959w2.m2491a(abstractC0623y3);
                                m1963s = abstractC0623y3;
                            } else {
                                m2033a(m1959w2);
                            }
                            m1959w2.m2500a(pointF.x, pointF.y, mo7517i, m6044t);
                            if (m1963s != null) {
                                C0741a c0741a = new C0741a();
                                c0741a.f4644d = mo7517i;
                                c0741a.f4646g = pointF.x;
                                c0741a.f4647h = pointF.y;
                                c0741a.f4653n = true;
                                c0741a.f4654o = m1963s;
                                c0741a.f4645e = gameEngine.f6093bs;
                                c0741a.f4667f = m6044t;
                                c0741a.f4649j = gameEngine.f6093bs;
                                c0741a.f4655r = this.f5121X;
                                c0741a.f4656s = 1.0f + (0.15f * i);
                                if (m1963s.m3131av() >= 29) {
                                    c0741a.f4669q = true;
                                }
                            }
                            i++;
                        }
                    }
                    this.f5224aO = 5.0f;
                    if (GameEngine.m1156av()) {
                        this.f5224aO = 1.0f;
                    }
                    this.f5133aj = false;
                    if (!z9) {
                        if (i > 0) {
                            boolean z16 = true;
                            if (abstractC0623y != null && !m1968p(abstractC0623y)) {
                                z16 = false;
                            }
                            this.f5120W = null;
                            this.f5122Y = false;
                            this.f5126ac = false;
                            this.f5119U = null;
                            if (z16) {
                                m1958x();
                            }
                            this.f5121X++;
                        }
                    } else if (!z10) {
                        float f15 = abstractC0623y.f6951ek;
                        float f16 = abstractC0623y.f6952el;
                        boolean z17 = false;
                        if (CommonUtils.m2294c(f15 - this.f5127ad) < (abstractC0623y.m5817cc().m7206b() * gameEngine.f6104bL.f784n * 2.0f) + (3 * gameEngine.f6104bL.f784n) && CommonUtils.m2294c(f16 - this.f5128ae) < (abstractC0623y.m5817cc().m7202c() * gameEngine.f6104bL.f785o * 2.0f) + (3 * gameEngine.f6104bL.f785o)) {
                            this.f5129af = f15 - this.f5127ad;
                            this.f5130ag = f16 - this.f5128ae;
                            if (CommonUtils.m2294c(this.f5129af) > CommonUtils.m2294c(this.f5130ag)) {
                                this.f5130ag = 0.0f;
                            } else {
                                this.f5129af = 0.0f;
                            }
                        }
                        if (abstractC0623y.m5817cc().m7202c() > abstractC0623y.m5817cc().m7206b() + 1) {
                            this.f5130ag = 0.0f;
                        }
                        this.f5127ad = f15;
                        this.f5128ae = f16;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        if (this.f5130ag < 0.0f) {
                            f17 = -1.0f;
                        }
                        if (this.f5129af < 0.0f) {
                            f18 = -1.0f;
                        }
                        if (this.f5130ag > 0.0f) {
                            f17 = 1.0f;
                        }
                        if (this.f5129af > 0.0f) {
                            f18 = 1.0f;
                        }
                        if (f18 == 0.0f && f17 == 0.0f) {
                            f18 = 1.0f;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        float f19 = f15 + (200.0f * f18);
                        float f20 = f16 + (200.0f * f17);
                        float f21 = (-abstractC0623y.m5823cX()) + 1.0f;
                        float f22 = (-abstractC0623y.m5822cY()) + 1.0f;
                        m2035a(abstractC0623y, f15 + f21, f16 + f22, f19 + f21, f20 + f22, false, arrayList2, (Unit) null);
                        if (arrayList2.size() > 0) {
                            abstractC0623y.f6951ek = ((PointF) arrayList2.get(0)).x;
                            abstractC0623y.f6952el = ((PointF) arrayList2.get(0)).y;
                            z17 = true;
                        }
                        if (!z17) {
                            m2035a(abstractC0623y, f15 + f21, f16 + f22, f15 + (200.0f * (-f18)) + f21, f16 + (200.0f * (-f17)) + f22, false, arrayList2, (Unit) null);
                            if (arrayList2.size() > 0) {
                                abstractC0623y.f6951ek = ((PointF) arrayList2.get(0)).x;
                                abstractC0623y.f6952el = ((PointF) arrayList2.get(0)).y;
                                z17 = true;
                            }
                        }
                        if (!z17) {
                            abstractC0623y.f6951ek += 3 * gameEngine.f6104bL.f784n;
                            abstractC0623y.f6952el += gameEngine.f6104bL.f784n;
                        }
                        if (z17) {
                            float f23 = abstractC0623y.f6951ek - f15;
                            float f24 = abstractC0623y.f6952el - f16;
                            float f25 = gameEngine.f6140cx;
                            float f26 = gameEngine.f6141cy;
                            gameEngine.f6133cq += f23;
                            gameEngine.f6134cr += f24;
                            gameEngine.f6140cx += gameEngine.f6133cq;
                            gameEngine.f6141cy += gameEngine.f6134cr;
                            float f27 = gameEngine.f6140cx;
                            float f28 = gameEngine.f6141cy;
                            gameEngine.m1219P();
                            gameEngine.f6133cq += gameEngine.f6140cx - f27;
                            gameEngine.f6134cr += gameEngine.f6141cy - f28;
                            float f29 = (f25 + f23) - gameEngine.f6140cx;
                            float f30 = (f26 + f24) - gameEngine.f6141cy;
                            if (CommonUtils.m2294c(f29) > 1.0f) {
                                this.f5124aa += f29 * gameEngine.f6250cW;
                            }
                            if (CommonUtils.m2294c(f30) > 1.0f) {
                                this.f5125ab += f30 * gameEngine.f6250cW;
                            }
                            gameEngine.f6140cx -= gameEngine.f6133cq;
                            gameEngine.f6141cy -= gameEngine.f6134cr;
                        }
                    }
                }
            }
            if (z8) {
                m1979k();
                if (this.f5126ac) {
                    m1958x();
                }
            }
        }
    }

    /* renamed from: l */
    public boolean m1977l() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (GameEngine.m1156av() && gameEngine.f6109bQ.mouseSupport && !m1975m() && !m1971o()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m1975m() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (GameEngine.m1156av() && gameEngine.f6109bQ.mouseSupport && this.f5220O && !this.f5219N && !this.f5164aT) {
            int i = 1;
            int i2 = 2;
            if (gameEngine.f6109bQ.mousePlacement == 2) {
                i = 2;
                i2 = 1;
            }
            if (gameEngine.m1127e(i)) {
            }
            if (gameEngine.m1127e(i2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m1973n() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!GameEngine.m1157au() || !gameEngine.f6109bQ.mouseSupport) {
            return false;
        }
        if (this.f5220O || this.f5209D) {
            int i = 1;
            int i2 = 2;
            if (gameEngine.f6109bQ.mousePlacement == 2) {
                i = 2;
                i2 = 1;
            }
            if (gameEngine.m1127e(i)) {
                return true;
            }
            if (gameEngine.m1127e(i2)) {
            }
            return false;
        }
        return false;
    }

    /* renamed from: o */
    public boolean m1971o() {
        if (this.f5220O && !this.f5219N && !this.f5164aT) {
            return m1973n();
        }
        return false;
    }

    /* renamed from: a */
    public void m2039a(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (unit != null && this.f5115Q == unit && this.f5116R < 40.0f && !m2009b(gameEngine)) {
            if (!m2028a(gameEngine)) {
                m1958x();
            }
            m1984h(unit);
        } else if (unit != null) {
            if (!m2028a(gameEngine) && !m2009b(gameEngine)) {
                m1958x();
            }
            m2038a(unit, m2009b(gameEngine));
            this.f5115Q = unit;
            this.f5116R = 0.0f;
        }
    }

    /* renamed from: a */
    public boolean m2037a(Unit unit, boolean z, float f, float f2, Point point) {
        GameEngine.getInstance();
        Team m1967q = m1967q();
        boolean m6354c = m1967q.m6354c(unit.team);
        if (m6354c && m2078A() && m1966q(unit)) {
            m2001c(unit);
            return true;
        }
        if (m1967q.m6342d(unit.team) && ((unit.f1631cs < unit.f1632ct || unit.f1623ck < 1.0f) && m1969p() != 0)) {
            boolean z2 = true;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            if (unit.m5803cq() && m1972n(unit)) {
                z3 = true;
            }
            Iterator it = this.f5255bL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
                if (abstractC1120w instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                    if (!abstractC0623y.f1643cE) {
                        continue;
                    } else if (!m1974m(abstractC0623y)) {
                        z2 = false;
                        break;
                    } else if (!abstractC0623y.mo3518a(unit)) {
                        z2 = false;
                        break;
                    } else {
                        if (abstractC0623y.m3161aS()) {
                            z5 = true;
                        }
                        C0305au m3135ar = abstractC0623y.m3135ar();
                        if (m3135ar != null && m3135ar.m5676d() == EnumC0306av.f1813d) {
                            z4 = true;
                        }
                    }
                }
            }
            if (z2 && (!z4 || !z3)) {
                if (z5) {
                    m1995d(unit);
                    return true;
                }
                m1995d(unit);
                return true;
            }
        }
        if (unit.mo4209g() > 0.0f && m1969p() != 0) {
            boolean z6 = true;
            Iterator it2 = AbstractC1120w.f6956en.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC1120w abstractC1120w2 = (AbstractC1120w) it2.next();
                if (abstractC1120w2 instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w2;
                    if (abstractC0623y2.f1643cE) {
                        if (!m1974m(abstractC0623y2)) {
                            z6 = false;
                            break;
                        } else if (!abstractC0623y2.m5763h(unit, true)) {
                            z6 = false;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (z6) {
                m2010b(unit);
                return true;
            }
        }
        if (unit.m5803cq() && m1972n(unit)) {
            m1988f(unit);
            return true;
        } else if (GameEngine.m1157au() && m2077B() && m1970o(unit)) {
            m1986g(unit);
            return true;
        } else {
            boolean z7 = false;
            if ((!z || unit.m5757t()) && !m1967q.m6354c(unit.team)) {
                if (unit.m5867bI()) {
                    if (unit.m5818cb().m7210a()) {
                        z7 = true;
                    }
                } else if (!unit.collidable) {
                    z7 = true;
                }
                if (!z7 && !unit.mo3293i() && m2076C()) {
                    z7 = true;
                }
            }
            if (!z7 && m6354c && m2078A()) {
                m2065a(unit.f6951ek, unit.f6952el, unit.height);
                return true;
            }
            return false;
        }
    }

    /* renamed from: p */
    public int m1969p() {
        return this.f5163aR;
    }

    /* renamed from: a */
    void m2033a(C0749e c0749e) {
        Iterator it = AbstractC1120w.f6956en.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y.f1643cE && m1974m(abstractC0623y)) {
                    c0749e.m2491a(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: q */
    public Team m1967q() {
        GameEngine gameEngine = GameEngine.getInstance();
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.team == gameEngine.f6093bs) {
                    return abstractC0623y.team;
                }
            }
        }
        Iterator it2 = this.f5255bL.iterator();
        while (it2.hasNext()) {
            Unit unit2 = (Unit) it2.next();
            if (unit2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit2;
                if (m1974m(abstractC0623y2)) {
                    return abstractC0623y2.team;
                }
            }
        }
        return gameEngine.f6093bs;
    }

    /* renamed from: r */
    public AbstractC0623y m1965r() {
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                return (AbstractC0623y) unit;
            }
        }
        return null;
    }

    /* renamed from: s */
    public AbstractC0623y m1963s() {
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (m1974m(abstractC0623y)) {
                    return abstractC0623y;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2031a(C0749e c0749e, Action action, boolean z) {
        Action a;
        if (action instanceof C0212g) {
            c0749e.m2491a(((C0212g) action).f1432b);
            return;
        }
        C0208c m6095N = action.m6095N();
        AbstractC0623y abstractC0623y = null;
        int i = -99;
        Iterator it = AbstractC1120w.f6956en.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y2.f1643cE && m1974m(abstractC0623y2) && (a = abstractC0623y2.m5893a(m6095N)) != null && a.mo4245b(abstractC0623y2) && (a.mo4247a((Unit) abstractC0623y2, true) || z)) {
                    int i2 = 0;
                    if (abstractC0623y2 instanceof InterfaceC0501l) {
                        i2 = ((InterfaceC0501l) abstractC0623y2).mo4376a(m6095N, true);
                        if (abstractC0623y != null) {
                            if (!z) {
                                if (i2 >= i) {
                                    break;
                                }
                            } else if (i2 <= i) {
                                break;
                            }
                        }
                    }
                    abstractC0623y = abstractC0623y2;
                    i = i2;
                }
            }
        }
        if (abstractC0623y != null) {
            c0749e.m2491a(abstractC0623y);
        }
    }

    /* renamed from: a */
    boolean m2046a(Action action, float f, float f2) {
        Action a;
        if (action instanceof C0212g) {
            C0212g c0212g = (C0212g) action;
            AbstractC0623y abstractC0623y = c0212g.f1432b;
            Action m6227m_ = c0212g.m6227m_();
            boolean z = false;
            if (m6227m_.mo4245b(abstractC0623y) && m6227m_.mo4247a((Unit) abstractC0623y, true) && !abstractC0623y.m3207a(m6227m_, f, f2)) {
                z = true;
            }
            return z;
        }
        boolean z2 = false;
        Iterator it = AbstractC1120w.f6956en.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y2.f1643cE && m1974m(abstractC0623y2) && (a = abstractC0623y2.m5893a(action.m6095N())) != null && a.mo4245b(abstractC0623y2) && a.mo4247a((Unit) abstractC0623y2, true)) {
                    if (!abstractC0623y2.m3207a(a, f, f2)) {
                        z2 = true;
                    } else {
                        return false;
                    }
                }
            }
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2032a(C0749e c0749e, Action action) {
        Action a;
        if (action instanceof C0212g) {
            c0749e.m2491a(((C0212g) action).f1432b);
            return;
        }
        C0208c m6095N = action.m6095N();
        Iterator it = AbstractC1120w.f6956en.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y.f1643cE && m1974m(abstractC0623y) && (a = abstractC0623y.m5893a(m6095N)) != null && a.mo4245b(abstractC0623y)) {
                    c0749e.m2491a(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m2044a(Action action, boolean z) {
        Action a;
        if (action instanceof C0212g) {
            C0212g c0212g = (C0212g) action;
            return c0212g.m6248a((Unit) c0212g.f1432b, true);
        }
        C0208c m6095N = action.m6095N();
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE && m1974m(abstractC0623y) && (a = abstractC0623y.m5893a(m6095N)) != null && a.mo4247a(abstractC0623y, z)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2047a(Action action) {
        Action a;
        C0208c m6095N = action.m6095N();
        if (action.m6057l_()) {
            return false;
        }
        if (action instanceof C0212g) {
            C0212g c0212g = (C0212g) action;
            return c0212g.m6253a((Unit) c0212g.f1432b);
        }
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE && m1974m(abstractC0623y) && (a = abstractC0623y.m5893a(m6095N)) != null && a.m6088a((Unit) abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m2012b(Action action) {
        Action a;
        if (action instanceof C0212g) {
            C0212g c0212g = (C0212g) action;
            return c0212g.m6247b(c0212g.f1432b);
        }
        C0208c m6095N = action.m6095N();
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE && m1974m(abstractC0623y) && (a = abstractC0623y.m5893a(m6095N)) != null && a.mo4245b(abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m2002c(Action action) {
        Action a;
        boolean z = false;
        if (action instanceof C0212g) {
            C0212g c0212g = (C0212g) action;
            return c0212g.m6239g(c0212g.f1432b);
        }
        C0208c m6095N = action.m6095N();
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE && m1974m(abstractC0623y) && (a = abstractC0623y.m5893a(m6095N)) != null) {
                    if (!a.m6068g(abstractC0623y)) {
                        return false;
                    }
                    z = true;
                }
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public String m1996d(Action action) {
        Action a;
        String m6063j;
        if (action instanceof C0212g) {
            C0212g c0212g = (C0212g) action;
            return c0212g.m6235j(c0212g.f1432b);
        }
        C0208c m6095N = action.m6095N();
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE && m1974m(abstractC0623y) && (a = abstractC0623y.m5893a(m6095N)) != null && a.m6068g(abstractC0623y) && (m6063j = a.m6063j(abstractC0623y)) != null) {
                    return m6063j;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public C1112u m1992e(Action action) {
        if (action instanceof C0212g) {
            C0212g c0212g = (C0212g) action;
            this.f5254bK.clear();
            if (c0212g.f1432b != null) {
                this.f5254bK.m519a(c0212g.f1432b);
            }
            return this.f5254bK;
        }
        return this.f5255bL;
    }

    /* renamed from: f */
    public String m1989f(Action action) {
        Action a;
        C1112u m1992e = m1992e(action);
        C0208c m6095N = action.m6095N();
        String str = null;
        boolean z = false;
        Iterator it = m1992e.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (m1974m(abstractC0623y) && (a = abstractC0623y.m5893a(m6095N)) != null) {
                    if (a.m6105B() != null && !a.m6105B().mo5235b(abstractC0623y)) {
                        String m5224a = a.m6105B().m5224a((Unit) abstractC0623y, 4, false);
                        if (m5224a != null) {
                            str = m5224a;
                        }
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return null;
        }
        return str;
    }

    /* renamed from: t */
    public boolean m1962t() {
        if (this.f5163aR == 0) {
            return false;
        }
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (!abstractC0623y.f1643cE) {
                    continue;
                } else if (!m1974m(abstractC0623y)) {
                    return false;
                } else {
                    ArrayList N = abstractC0623y.mo3520N();
                    boolean z = false;
                    if (N != null) {
                        Iterator it2 = N.iterator();
                        while (it2.hasNext()) {
                            if (((Action) it2.next()).mo6184e() == EnumC0226u.f1477d) {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m2041a(EnumC0238ag enumC0238ag) {
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (m1974m(abstractC0623y) && m2040a(enumC0238ag, abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2040a(EnumC0238ag enumC0238ag, Unit unit) {
        if (unit instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
            if ((enumC0238ag == EnumC0238ag.f1529a || enumC0238ag == EnumC0238ag.f1530b) && !GameEngine.m1202a(this.f5252bG, 1000L)) {
                return true;
            }
            if (enumC0238ag == EnumC0238ag.f1531c) {
                if (GameEngine.getInstance().f6233bx < 10) {
                    return false;
                }
                if (!GameEngine.m1202a(this.f5253bH, 1000L)) {
                    return true;
                }
            }
            if (abstractC0623y.m3204a(enumC0238ag)) {
                if (enumC0238ag == EnumC0238ag.f1529a || enumC0238ag == EnumC0238ag.f1530b) {
                    this.f5252bG = GameEngine.m1214U();
                }
                if (enumC0238ag == EnumC0238ag.f1531c) {
                    this.f5253bH = GameEngine.m1214U();
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public void m2014b(float f, float f2, Point point) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!m2077B()) {
            if (gameEngine.f6109bQ.quickRally && m1962t()) {
                m2016b(f, f2);
                return;
            }
            return;
        }
        C0749e m1959w = m1959w();
        m1959w.f4852h = true;
        m1959w.m2501a(f, f2);
        m2033a(m1959w);
        if (!m2041a(EnumC0238ag.f1530b)) {
            gameEngine.audio.m2998b(AudioEngine.f4035f, 0.2f);
        }
        C0745e m2554a = gameEngine.effects.m2554a(f, f2, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
        if (m2554a != null) {
            m2554a.f4762ap = 8;
            m2554a.f4745W = 30.0f;
            m2554a.f4746X = m2554a.f4745W;
            m2554a.f4720s = true;
            m2554a.f4728F = 2.0f;
            m2554a.f4730H = 2.8f * m2005c();
            m2554a.f4729G = 1.6f * m2005c();
            m2554a.f4731I = true;
        }
        if (point != null) {
            Point m1933b = gameEngine.f6115bW.m1933b(point.f224a, point.f225b);
            C0745e m2554a2 = gameEngine.effects.m2554a(m1933b.f224a, m1933b.f225b, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
            if (m2554a2 != null) {
                m2554a2.f4717o = true;
                m2554a2.f4762ap = 8;
                m2554a2.f4745W = 35.0f;
                m2554a2.f4746X = m2554a.f4745W;
                m2554a2.f4720s = true;
                m2554a2.f4728F = 2.0f;
                m2554a2.f4730H = 1.3f;
                m2554a2.f4729G = 0.6f;
            }
        }
    }

    /* renamed from: c */
    public void m2003c(float f, float f2, Point point) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f5111y && gameEngine.f6109bQ.doubleClickToAttackMove && m2078A() && m2077B()) {
            m1997d(f, f2, point);
        } else {
            m2014b(f, f2, point);
        }
    }

    /* renamed from: d */
    public void m1997d(float f, float f2, Point point) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m1959w = m1959w();
        m1959w.f4852h = true;
        m1959w.m2486b(f, f2);
        m2033a(m1959w);
        if (!m2041a(EnumC0238ag.f1530b)) {
            gameEngine.audio.m2998b(AudioEngine.f4035f, 0.2f);
        }
        C0745e m2554a = gameEngine.effects.m2554a(f, f2, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
        if (m2554a != null) {
            m2554a.f4763aq = 17;
            m2554a.f4762ap = 2;
            m2554a.f4745W = 30.0f;
            m2554a.f4746X = m2554a.f4745W;
            m2554a.f4720s = true;
            m2554a.f4728F = 2.0f;
            m2554a.f4748Z = 1.0f;
            m2554a.f4730H = 1.9f * m2005c();
            m2554a.f4729G = 3.5f * m2005c();
            m2554a.f4731I = true;
        }
        if (point != null) {
            Point m1933b = gameEngine.f6115bW.m1933b(point.f224a, point.f225b);
            C0745e m2554a2 = gameEngine.effects.m2554a(m1933b.f224a, m1933b.f225b, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
            if (m2554a2 != null) {
                m2554a2.f4717o = true;
                m2554a2.f4762ap = 9;
                m2554a2.f4745W = 35.0f;
                m2554a2.f4746X = m2554a.f4745W;
                m2554a2.f4720s = true;
                m2554a2.f4728F = 2.0f;
                m2554a2.f4730H = 1.3f;
                m2554a2.f4729G = 0.6f;
            }
        }
    }

    /* renamed from: u */
    public void m1961u() {
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m1959w = m1959w();
        m1959w.m2474h();
        m2033a(m1959w);
        gameEngine.audio.m2998b(AudioEngine.f4035f, 0.2f);
    }

    /* renamed from: a */
    public void m2045a(Action action, PointF pointF, Unit unit, C0749e c0749e) {
        if (action instanceof C0342g) {
            C0342g c0342g = (C0342g) action;
            GameEngine.getInstance();
        }
    }

    /* renamed from: b */
    public void m2011b(Action action, float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        PointF pointF = new PointF(f, f2);
        C0749e m1959w = m1959w();
        if (!action.m6098I()) {
            m2032a(m1959w, action);
        } else {
            m2031a(m1959w, action, false);
        }
        m1959w.m2495a(action.m6095N(), pointF, (Unit) null);
        m2045a(action, pointF, (Unit) null, m1959w);
        if (!action.m6091a(f, f2)) {
            gameEngine.audio.m2998b(AudioEngine.f4035f, 0.2f);
            C0745e m2554a = gameEngine.effects.m2554a(f, f2, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
            if (m2554a != null) {
                m2554a.f4762ap = 9;
                m2554a.f4745W = 60.0f;
                m2554a.f4746X = m2554a.f4745W;
                m2554a.f4720s = true;
                m2554a.f4728F = 2.0f;
                m2554a.f4730H = 3.8f * m2005c();
                m2554a.f4729G = 2.0f * m2005c();
                m2554a.f4731I = true;
                m2554a.f4748Z = 1.5f;
            }
        }
    }

    /* renamed from: b */
    public void m2010b(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m1959w = m1959w();
        m2033a(m1959w);
        m1959w.m2480d(unit);
        gameEngine.audio.m2998b(AudioEngine.f4035f, 0.2f);
        C0745e m2554a = gameEngine.effects.m2554a(unit.f6951ek, unit.f6952el, unit.height, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
        if (m2554a != null) {
            m2554a.f4762ap = 12;
            m2554a.f4745W = 25.0f;
            m2554a.f4746X = m2554a.f4745W;
            m2554a.f4720s = true;
            m2554a.f4728F = 2.0f;
            m2554a.f4731I = true;
            m2554a.f4730H = 1.2f * m2005c();
            m2554a.f4729G = 1.8f * m2005c();
        }
    }

    /* renamed from: b */
    public void m2016b(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m1960v = m1960v();
        m2033a(m1960v);
        m1960v.m2498a(new PointF(f, f2));
        gameEngine.audio.m2998b(AudioEngine.f4035f, 0.2f);
        C0745e m2554a = gameEngine.effects.m2554a(f, f2, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
        if (m2554a != null) {
            m2554a.f4762ap = 8;
            m2554a.f4745W = 65.0f;
            m2554a.f4746X = m2554a.f4745W;
            m2554a.f4720s = true;
            m2554a.f4728F = 2.0f;
            m2554a.f4731I = true;
            m2554a.f4748Z = 2.0f;
            m2554a.f4730H = 2.0f * m2005c();
            m2554a.f4729G = 1.5f * m2005c();
        }
    }

    /* renamed from: a */
    public void m2061a(float f, float f2, Point point, C0215j c0215j) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!gameEngine.f6109bQ.showMapPingsOnBattlefield && !gameEngine.f6109bQ.showMapPingsOnMinimap) {
            m2008b("Cannot send map ping, you have disabled both battlefield and minimap pings in your settings");
            return;
        }
        m1959w().m2495a(c0215j.m6095N(), new PointF(f, f2), (Unit) null);
        if (this.f5182bI == 0 || this.f5182bI + 15000 < System.currentTimeMillis()) {
            this.f5182bI = System.currentTimeMillis();
            gameEngine.networkEngine.m1630l("MAP PING - [i:" + c0215j.m6190K() + "]");
        }
    }

    /* renamed from: a */
    public void m2059a(float f, float f2, Team team, C0215j c0215j) {
        C0745e m2554a;
        GameEngine gameEngine = GameEngine.getInstance();
        int ordinal = 7 + c0215j.f1442a.ordinal();
        if (!gameEngine.f6109bQ.showMapPingsOnBattlefield && !gameEngine.f6109bQ.showMapPingsOnMinimap) {
            if (!this.f5183bJ && !gameEngine.f6120cb.m2635h()) {
                this.f5183bJ = true;
                this.f5107e.m1952a(null, "[WARNING: A player send a map ping, but you have disabled both battlefield and minimap pings in your settings]");
                return;
            }
            return;
        }
        if (gameEngine.f6109bQ.showMapPingsOnBattlefield) {
            C0745e m2554a2 = gameEngine.effects.m2554a(f, f2, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
            if (m2554a2 != null) {
                m2554a2.f4763aq = 9;
                m2554a2.f4762ap = 6;
                m2554a2.f4728F = 0.7f;
                m2554a2.f4745W = 490.0f;
                m2554a2.f4746X = m2554a2.f4745W;
                m2554a2.f4720s = true;
                m2554a2.f4742T = 6.0f;
                m2554a2.f4743U = 60.0f;
                m2554a2.f4733K -= m2554a2.f4742T;
                m2554a2.f4730H = 2.0f * 1.0f;
                m2554a2.f4729G = m2554a2.f4730H;
                m2554a2.f4785ao = -0.5f;
                m2554a2.f4731I = true;
                if (team != null) {
                    m2554a2.f4725y = team.m6413H();
                    if (GameEngine.m1159as()) {
                        m2554a2.f4783C = new LightingColorFilter(m2554a2.f4725y, 0);
                    }
                }
            }
            if (ordinal != -1 && (m2554a = gameEngine.effects.m2554a(f, f2, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4830e)) != null) {
                m2554a.f4763aq = 9;
                m2554a.f4762ap = ordinal;
                m2554a.f4745W = 490.0f;
                m2554a.f4746X = m2554a.f4745W;
                m2554a.f4720s = true;
                m2554a.f4728F = 1.2f;
                m2554a.f4742T = 6.0f;
                m2554a.f4743U = 60.0f;
                m2554a.f4733K -= m2554a.f4742T;
                m2554a.f4730H = 2.0f * 1.0f;
                m2554a.f4729G = m2554a.f4730H;
                m2554a.f4785ao = -0.7f;
                m2554a.f4731I = true;
            }
        }
        if (gameEngine.f6109bQ.showMapPingsOnMinimap) {
            Point m1933b = gameEngine.f6115bW.m1933b(f, f2);
            C0745e m2554a3 = gameEngine.effects.m2554a(m1933b.f224a, m1933b.f225b, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
            if (m2554a3 != null) {
                m2554a3.f4717o = true;
                m2554a3.f4763aq = 9;
                m2554a3.f4762ap = 6;
                m2554a3.f4728F = 0.8f;
                m2554a3.f4745W = 470.0f;
                m2554a3.f4746X = m2554a3.f4745W;
                m2554a3.f4720s = true;
                m2554a3.f4733K -= 2.0f;
                m2554a3.f4742T = 2.0f;
                m2554a3.f4743U = 60.0f;
                m2554a3.f4785ao = -0.5f;
                if (team != null) {
                    m2554a3.f4725y = team.m6413H();
                    if (GameEngine.m1159as()) {
                        m2554a3.f4783C = new LightingColorFilter(m2554a3.f4725y, 0);
                    }
                }
                m2554a3.f4730H = 1.0f;
                m2554a3.f4729G = 1.0f;
            }
            C0745e m2554a4 = gameEngine.effects.m2554a(m1933b.f224a, m1933b.f225b, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
            if (m2554a4 != null) {
                m2554a4.f4717o = true;
                m2554a4.f4763aq = 9;
                m2554a4.f4762ap = ordinal;
                m2554a4.f4745W = 470.0f;
                m2554a4.f4746X = m2554a4.f4745W;
                m2554a4.f4720s = true;
                m2554a4.f4728F = 0.8f;
                m2554a4.f4733K -= 2.0f;
                m2554a4.f4742T = 2.0f;
                m2554a4.f4743U = 60.0f;
                if (team != null) {
                }
                m2554a4.f4730H = 1.0f;
                m2554a4.f4729G = 1.0f;
                m2554a4.f4785ao = -0.7f;
            }
        }
    }

    /* renamed from: v */
    public C0749e m1960v() {
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m2591b = gameEngine.f6124cf.m2591b(gameEngine.f6093bs);
        if (gameEngine.networkEngine.f5564B) {
            m2591b.f4842p = gameEngine.f6093bs;
        }
        return m2591b;
    }

    /* renamed from: w */
    public C0749e m1959w() {
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m1960v = m1960v();
        if (m2028a(gameEngine)) {
            m1960v.f4849e = true;
        }
        return m1960v;
    }

    /* renamed from: c */
    public void m2001c(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m1959w = m1959w();
        m1959w.m2493a(unit);
        m2033a(m1959w);
        if (!m2041a(EnumC0238ag.f1529a)) {
            gameEngine.audio.m2998b(AudioEngine.f4033d, 1.0f);
        }
        C0745e m2554a = gameEngine.effects.m2554a(unit.f6951ek, unit.f6952el, unit.height, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
        if (m2554a != null) {
            m2554a.f4713b = unit;
            m2554a.f4732J = 0.0f;
            m2554a.f4733K = 0.0f;
            m2554a.f4734L = 0.0f;
            m2554a.f4762ap = 9;
            m2554a.f4745W = 35.0f;
            m2554a.f4746X = m2554a.f4745W;
            m2554a.f4720s = true;
            m2554a.f4728F = 1.5f;
            m2554a.f4731I = true;
            m2554a.f4748Z = 0.8f;
            m2554a.f4730H = 1.9f * m2005c();
            m2554a.f4729G = 3.3f * m2005c();
        }
        C0745e m2554a2 = gameEngine.effects.m2554a(unit.f6951ek, unit.f6952el, unit.height, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
        if (m2554a2 != null) {
            m2554a2.f4713b = unit;
            m2554a2.f4732J = 0.0f;
            m2554a2.f4733K = 0.0f;
            m2554a2.f4734L = 0.0f;
            m2554a2.f4763aq = 17;
            m2554a2.f4762ap = 0;
            m2554a2.f4745W = 25.0f;
            m2554a2.f4746X = m2554a2.f4745W;
            m2554a2.f4720s = true;
            m2554a2.f4728F = 1.0f;
            m2554a2.f4731I = true;
            m2554a2.f4748Z = 0.8f;
            m2554a2.f4730H = 2.2f * m2005c();
            m2554a2.f4729G = 1.1f * m2005c();
        }
    }

    /* renamed from: d */
    public void m1995d(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m1959w = m1959w();
        m2033a(m1959w);
        m1959w.m2485b(unit);
        gameEngine.audio.m2998b(AudioEngine.f4033d, 1.0f);
        C0745e m2554a = gameEngine.effects.m2554a(unit.f6951ek, unit.f6952el, unit.height, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
        if (m2554a != null) {
            m2554a.f4762ap = 10;
            m2554a.f4745W = 35.0f;
            m2554a.f4746X = m2554a.f4745W;
            m2554a.f4720s = true;
            m2554a.f4728F = 2.0f;
            m2554a.f4731I = true;
            m2554a.f4730H = 1.5f * m2005c();
            m2554a.f4729G = 2.2f * m2005c();
        }
    }

    /* renamed from: e */
    public void m1991e(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m1959w = m1959w();
        m2033a(m1959w);
        m1959w.m2482c(unit);
        gameEngine.audio.m2998b(AudioEngine.f4033d, 1.0f);
        C0745e m2554a = gameEngine.effects.m2554a(unit.f6951ek, unit.f6952el, unit.height, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
        if (m2554a != null) {
            m2554a.f4763aq = 17;
            m2554a.f4762ap = 1;
            m2554a.f4745W = 40.0f;
            m2554a.f4746X = m2554a.f4745W;
            m2554a.f4720s = true;
            m2554a.f4728F = 1.0f;
            m2554a.f4731I = true;
            m2554a.f4748Z = 0.0f;
            m2554a.f4730H = 1.2f * m2005c();
            m2554a.f4729G = 1.9f * m2005c();
        }
    }

    /* renamed from: a */
    public void m2065a(float f, float f2, float f3) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.audio.m2998b(AudioEngine.f4041l, 0.2f);
        C0745e m2554a = gameEngine.effects.m2554a(f, f2, f3, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
        if (m2554a != null) {
            m2554a.f4763aq = 9;
            m2554a.f4762ap = 14;
            m2554a.f4745W = 10.0f;
            m2554a.f4746X = m2554a.f4745W;
            m2554a.f4720s = true;
            m2554a.f4728F = 2.0f;
            m2554a.f4748Z = 0.0f;
            m2554a.f4730H = 1.1f * m2005c();
            m2554a.f4729G = 1.6f * m2005c();
            m2554a.f4731I = true;
        }
    }

    /* renamed from: a */
    public void m2060a(float f, float f2, Point point, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m1959w = m1959w();
        m2033a(m1959w);
        m1959w.m2483c(f, f2);
        if (!z) {
            m1959w.f4849e = true;
        }
        gameEngine.audio.m2998b(AudioEngine.f4035f, 0.2f);
        C0745e m2554a = gameEngine.effects.m2554a(f, f2, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
        if (m2554a != null) {
            m2554a.f4763aq = 17;
            m2554a.f4762ap = 0;
            m2554a.f4745W = 40.0f;
            m2554a.f4746X = m2554a.f4745W;
            m2554a.f4720s = true;
            m2554a.f4728F = 2.0f;
            m2554a.f4748Z = 8.0f;
            m2554a.f4730H = 1.1f * m2005c();
            m2554a.f4729G = 1.9f * m2005c();
            m2554a.f4731I = true;
        }
        if (point != null) {
            Point m1933b = gameEngine.f6115bW.m1933b(point.f224a, point.f225b);
            C0745e m2554a2 = gameEngine.effects.m2554a(m1933b.f224a, m1933b.f225b, 0.0f, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
            if (m2554a2 != null) {
                m2554a2.f4717o = true;
                m2554a2.f4762ap = 9;
                m2554a2.f4745W = 35.0f;
                m2554a2.f4746X = m2554a.f4745W;
                m2554a2.f4720s = true;
                m2554a2.f4728F = 2.0f;
                m2554a2.f4730H = 1.3f;
                m2554a2.f4729G = 0.6f;
            }
        }
    }

    /* renamed from: f */
    public void m1988f(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m1959w = m1959w();
        m2033a(m1959w);
        m1959w.m2478e(unit);
        gameEngine.audio.m2998b(AudioEngine.f4033d, 1.0f);
        C0745e m2554a = gameEngine.effects.m2554a(unit.f6951ek, unit.f6952el, unit.height, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
        if (m2554a != null) {
            m2554a.f4762ap = 11;
            m2554a.f4745W = 25.0f;
            m2554a.f4746X = m2554a.f4745W;
            m2554a.f4720s = true;
            m2554a.f4728F = 2.0f;
            m2554a.f4731I = true;
            m2554a.f4730H = 1.8f * m2005c();
            m2554a.f4729G = 1.6f * m2005c();
        }
    }

    /* renamed from: g */
    public void m1986g(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0749e m1959w = m1959w();
        m2033a(m1959w);
        m1959w.m2476f(unit);
        gameEngine.audio.m2998b(AudioEngine.f4033d, 1.0f);
        C0745e m2554a = gameEngine.effects.m2554a(unit.f6951ek, unit.f6952el, unit.height, EnumC0744d.f4702a, true, EnumC0748h.f4830e);
        if (m2554a != null) {
            m2554a.f4762ap = 11;
            m2554a.f4745W = 25.0f;
            m2554a.f4746X = m2554a.f4745W;
            m2554a.f4720s = true;
            m2554a.f4728F = 2.0f;
            m2554a.f4731I = true;
            m2554a.f4730H = 1.8f * m2005c();
            m2554a.f4729G = 1.6f * m2005c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.corrodinggames.rts.game.units.Unit m2058a(float r7, float r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.p037f.C0797f.m2058a(float, float, boolean):com.corrodinggames.rts.game.units.am");
    }

    /* renamed from: b */
    public void m2015b(float f, float f2, float f3) {
        GameEngine gameEngine = GameEngine.getInstance();
        Iterator it = AbstractC1120w.f6956en.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof Unit) {
                Unit unit = (Unit) abstractC1120w;
                if (!unit.isDead && unit.f1650cL == null && unit.team == gameEngine.f6093bs && CommonUtils.m2366a(f, f2, unit.f6951ek, unit.f6952el - unit.height) < f3 * f3) {
                    m1980j(unit);
                }
            }
        }
    }

    /* renamed from: h */
    public void m1984h(Unit unit) {
        this.f5115Q = null;
        GameEngine gameEngine = GameEngine.getInstance();
        Iterator it = AbstractC1120w.f6956en.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof Unit) {
                Unit unit2 = (Unit) abstractC1120w;
                if (!unit2.isDead && unit2.f1650cL == null && unit2.team == unit.team && unit2.mo4204p_() && C0760a.m2219a(unit2, unit) && (unit2.team == gameEngine.f6093bs || unit2.m5815ce())) {
                    m1980j(unit2);
                }
            }
        }
    }

    /* renamed from: x */
    public void m1958x() {
        this.f5115Q = null;
        Iterator it = AbstractC1120w.f6956en.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof Unit) {
                ((Unit) abstractC1120w).f1643cE = false;
            }
        }
        this.f5163aR = 0;
        this.f5117S++;
        this.f5255bL.clear();
        m2069J();
    }

    /* renamed from: i */
    public boolean m1982i(Unit unit) {
        if (unit.m5757t()) {
            return false;
        }
        Team team = GameEngine.getInstance().f6093bs;
        if (team != null && team.m6354c(unit.team) && !unit.m5814cf()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean m1980j(Unit unit) {
        if (unit.f1643cE) {
            return true;
        }
        if (!m1982i(unit)) {
            return false;
        }
        m1978k(unit);
        m2040a(EnumC0238ag.f1531c, unit);
        return true;
    }

    /* renamed from: k */
    public void m1978k(Unit unit) {
        if (unit.f1643cE || !m1982i(unit)) {
            return;
        }
        unit.f1643cE = true;
        unit.f1644cF = GameEngine.getInstance().f6098bA;
        this.f5163aR++;
        if (!(unit instanceof EditorOrBuilder)) {
            f5184bM = unit;
        }
        this.f5117S++;
        this.f5255bL.m519a(unit);
        m2069J();
    }

    /* renamed from: y */
    public static C0824b m1957y() {
        InterfaceC0303as unitType;
        Unit unit = f5184bM;
        if (unit == null || (unitType = unit.getUnitType()) == null || !(unitType instanceof C0453l)) {
            return null;
        }
        return ((C0453l) unitType).f2917I;
    }

    /* renamed from: a */
    public void m2038a(Unit unit, boolean z) {
        if (!z) {
            m1980j(unit);
        } else if (unit.f1643cE) {
            m1976l(unit);
        } else {
            m1980j(unit);
        }
    }

    /* renamed from: l */
    public void m1976l(Unit unit) {
        if (unit.f1643cE) {
            unit.f1643cE = false;
            this.f5163aR--;
            this.f5255bL.remove(unit);
            this.f5117S++;
            m2069J();
        }
    }

    /* renamed from: z */
    public boolean m1956z() {
        if (m1969p() == 0) {
            return false;
        }
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE && m1974m(abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: A */
    public boolean m2078A() {
        if (m1969p() == 0) {
            return false;
        }
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE && m1974m(abstractC0623y) && abstractC0623y.canAttack()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    public boolean m2077B() {
        if (m1969p() == 0) {
            return false;
        }
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE && abstractC0623y.m3161aS() && m1974m(abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public boolean m2076C() {
        if (m1969p() == 0) {
            return true;
        }
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.f1643cE && !abstractC0623y.mo3293i()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: m */
    public boolean m1974m(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (unit.m5826cU()) {
            return false;
        }
        if (unit.team == gameEngine.f6093bs) {
            return true;
        }
        if ((unit.team != null && unit.team.m6370b(gameEngine.f6093bs)) || gameEngine.f6094bv || gameEngine.f6120cb.m2635h()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m1972n(Unit unit) {
        if (m1969p() == 0) {
            return false;
        }
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (unit2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit2;
                if (abstractC0623y.f1643cE && abstractC0623y != unit && m1974m(abstractC0623y) && unit.m5792d(abstractC0623y, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public boolean m1970o(Unit unit) {
        if (m1969p() == 0) {
            return false;
        }
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (unit2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit2;
                if (abstractC0623y.f1643cE && abstractC0623y != unit && m1974m(abstractC0623y) && abstractC0623y.m5792d(unit, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public boolean m1968p(Unit unit) {
        if (m1969p() == 0) {
            return false;
        }
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (unit2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit2;
                if (abstractC0623y.f1643cE && abstractC0623y != unit && m1974m(abstractC0623y) && abstractC0623y.mo3518a(unit)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public boolean m1966q(Unit unit) {
        if (m1969p() == 0) {
            return false;
        }
        Iterator it = this.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (unit2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit2;
                if (abstractC0623y.f1643cE && abstractC0623y != unit && m1974m(abstractC0623y) && C0248aq.m5741a(abstractC0623y, unit)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    public void m2075D() {
    }

    /* renamed from: E */
    public boolean m2074E() {
        return false;
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        this.f5106d.mo466a(c0859ar);
        c0859ar.m1554c(1);
        c0859ar.mo1487a(this.f5121X);
    }

    /* renamed from: a */
    public void m2029a(C0876k c0876k, boolean z) {
        this.f5106d.m2214a(c0876k, z);
        if (c0876k.m1457d() >= 1) {
            this.f5121X = c0876k.m1454f();
        }
    }

    /* renamed from: a */
    public void m2035a(AbstractC0623y abstractC0623y, float f, float f2, float f3, float f4, boolean z, ArrayList arrayList, Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        float f5 = abstractC0623y.f6951ek;
        float f6 = abstractC0623y.f6952el;
        AbstractC0623y abstractC0623y2 = null;
        Unit m5791d = Unit.m5791d(abstractC0623y.getUnitType());
        if (!(m5791d instanceof AbstractC0623y)) {
            GameEngine.PrintLog("buildingBlockoutUnit not OrderableUnit is: " + m5791d.getClass().getName());
        } else {
            abstractC0623y2 = (AbstractC0623y) m5791d;
        }
        boolean z2 = false;
        gameEngine.f6104bL.m6617b(f, f2);
        float f7 = gameEngine.f6104bL.f800T;
        float f8 = gameEngine.f6104bL.f801U;
        float cX = f7 + abstractC0623y.m5823cX();
        float cY = f8 + abstractC0623y.m5822cY();
        float cX2 = f3 + abstractC0623y.m5823cX();
        float cY2 = f4 + abstractC0623y.m5822cY();
        float m2314b = CommonUtils.m2314b(cX, cY, cX2, cY2);
        float m2280d = CommonUtils.m2280d(cX, cY, cX2, cY2);
        int i = 0;
        float f9 = 0.0f;
        while (true) {
            float f10 = f9;
            if (f10 <= m2314b) {
                gameEngine.f6104bL.m6617b((cX + (CommonUtils.m2249i(m2280d) * f10)) - abstractC0623y.m5823cX(), (cY + (CommonUtils.sin(m2280d) * f10)) - abstractC0623y.m5822cY());
                float f11 = gameEngine.f6104bL.f800T;
                float f12 = gameEngine.f6104bL.f801U;
                float cX3 = f11 + abstractC0623y.m5823cX();
                float cY3 = f12 + abstractC0623y.m5822cY();
                abstractC0623y.f6951ek = cX3;
                abstractC0623y.f6952el = cY3;
                if ((!z2 || abstractC0623y2 == null || (!C0741a.m2575a(abstractC0623y, abstractC0623y2) && !abstractC0623y.m3024r(abstractC0623y2))) && 0 == 0) {
                    boolean m2034a = m2034a(abstractC0623y, cX3, cY3, z, false, unit);
                    if (arrayList != null && m2034a) {
                        arrayList.add(new PointF(cX3, cY3));
                    }
                    if (m2034a) {
                        i++;
                        if (i >= 29) {
                            return;
                        }
                    }
                    z2 = true;
                    if (abstractC0623y2 != null) {
                        abstractC0623y2.f6951ek = cX3;
                        abstractC0623y2.f6952el = cY3;
                    }
                }
                f9 = f10 + gameEngine.f6104bL.f786p;
            } else {
                abstractC0623y.f6951ek = f5;
                abstractC0623y.f6952el = f6;
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean m2034a(AbstractC0623y abstractC0623y, float f, float f2, boolean z, boolean z2, Unit unit) {
        boolean z3;
        GameEngine gameEngine = GameEngine.getInstance();
        float f3 = abstractC0623y.f6951ek;
        float f4 = abstractC0623y.f6952el;
        abstractC0623y.f6951ek = f;
        abstractC0623y.f6952el = f2;
        boolean m3075c = abstractC0623y.m3075c(gameEngine.f6093bs);
        if (C0741a.m2576a(gameEngine.f6093bs, abstractC0623y, this.f5121X)) {
            m3075c = false;
        }
        if (unit != null && unit != null && (unit instanceof AbstractC0623y)) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) unit;
            if (!abstractC0623y2.m3162aR()) {
                float m2366a = CommonUtils.m2366a(abstractC0623y2.f6951ek, abstractC0623y2.f6952el, abstractC0623y.f6951ek, abstractC0623y.f6952el);
                float f5 = abstractC0623y2.mo3503f(abstractC0623y.getUnitType());
                if (f5 > 800000.0f) {
                    z3 = true;
                } else {
                    z3 = m2366a <= f5 * f5;
                }
                if (!z3) {
                    m3075c = false;
                }
            }
        }
        boolean z4 = abstractC0623y.f1626cn;
        abstractC0623y.f1626cn = true;
        abstractC0623y.f1629cq = m3075c;
        abstractC0623y.f1630cr = !m3075c;
        abstractC0623y.f1628cp = z2;
        if (z) {
            gameEngine.graphics.mo878k();
            gameEngine.m1218Q();
            abstractC0623y.mo461d(0.0f);
            abstractC0623y.draw(0.0f);
            abstractC0623y.mo469a(0.0f, false);
            float maxAttackRange = abstractC0623y.getMaxAttackRange();
            if (maxAttackRange > 30.0f) {
                C1117y.m490a((Unit) abstractC0623y, maxAttackRange, true, true);
            }
            abstractC0623y.m5819ca();
            if (!z2) {
                abstractC0623y.m3235N(-1);
            }
            gameEngine.graphics.mo877l();
        }
        abstractC0623y.f6951ek = f3;
        abstractC0623y.f6952el = f4;
        abstractC0623y.f1628cp = false;
        abstractC0623y.f1626cn = z4;
        return m3075c;
    }

    /* renamed from: F */
    public void m2073F() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6261dp = true;
        if (gameEngine.f6096by < 1500 && gameEngine.f6111bS.f5105c != null) {
            gameEngine.f6262dq = true;
        }
        this.f5106d.m2182q();
    }

    /* renamed from: G */
    public void m2072G() {
        GameEngine.getInstance().f6264ds = true;
        this.f5106d.m2181r();
    }

    /* renamed from: H */
    public void m2071H() {
        m1979k();
        this.f5119U = null;
        this.f5120W = this.f5196k;
    }

    /* renamed from: a */
    public void m2022a(String str, Rect rect, Paint paint, Paint paint2) {
        String[] m2287c;
        Paint paint3;
        GameEngine gameEngine = GameEngine.getInstance();
        int i = 0;
        for (String str2 : CommonUtils.m2287c(str, '\n')) {
            if (i == 0) {
                paint3 = paint;
            } else {
                paint3 = paint2;
            }
            Paint paint4 = paint3;
            int m2085a = C0795d.m2085a(paint4);
            gameEngine.graphics.mo903a(str2, rect.m7201d(), rect.f231b + (m2085a / 2) + (i * m2085a), paint4);
            i++;
        }
    }

    /* renamed from: a */
    public boolean m2043a(Action action, boolean z, Unit unit, boolean z2) {
        return m2042a(action, z, unit, z2, false, -1.0f);
    }

    /* renamed from: a */
    public boolean m2042a(Action action, boolean z, Unit unit, boolean z2, boolean z3, float f) {
        int i;
        int argb;
        Paint paint;
        Paint paint2;
        int argb2;
        int argb3;
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        String m1996d;
        GameEngine gameEngine = GameEngine.getInstance();
        String str = null;
        boolean z4 = false;
        boolean z5 = true;
        if (GameEngine.m1156av()) {
            z5 = false;
        }
        if (unit != null && action.m6058l(unit)) {
            z5 = false;
        }
        boolean z6 = false;
        boolean z7 = false;
        if (C0760a.m2223a(action)) {
            z6 = true;
            z7 = true;
        }
        if (m2002c(action)) {
            z6 = true;
            str = this.f5170bt;
            String m1996d2 = m1996d(action);
            if (m1996d2 != null) {
                str = m1996d2;
            }
        }
        if (!z6 && z2 && (m1996d = m1996d(action)) != null) {
            str = m1996d;
        }
        if (str == null) {
            float m2209b = this.f5106d.m2209b(action);
            if (m2209b > 0.0f) {
                str = CommonUtils.m2259g(m2209b / 1000.0f);
            }
        }
        String m1989f = m1989f(action);
        boolean z8 = m1989f != null;
        if (m1989f != null) {
        }
        if (z2 && str == null && m1989f != null) {
            str = this.f5171bu.m5339b();
        }
        C0813u c0813u = new C0813u();
        c0813u.f5371d = this.f5159aK;
        c0813u.f5372e = this.f5160aL;
        C0930ag c0930ag = null;
        if (z8) {
            c0930ag = this.f5161aM;
        }
        c0813u.m1904a(true);
        action.m6084a(unit, c0813u, null, c0930ag);
        if (str != null) {
            c0813u.m1905a("\n" + str, this.f5161aM);
        }
        c0813u.m1904a(false);
        action.m6085a(unit, c0813u);
        if (z7) {
            c0813u.m1903b();
            c0813u.m1905a(this.f5169bs, this.f5160aL);
        }
        this.f5237bh.f230a = 20;
        int i2 = (int) ((gameEngine.f6128ck - gameEngine.f6132cp) - 20);
        this.f5237bh.f232c = i2;
        boolean z9 = gameEngine.f6109bQ.showActionInfoHoverNearMouse;
        if (z) {
            i = (int) (gameEngine.f6131co - 40.0f);
        } else {
            i = 40;
        }
        if (GameEngine.m1158at() && f > 0.0f) {
            i = (int) f;
            z4 = true;
        }
        if (GameEngine.m1157au() && z9 && z3) {
            i = (int) (gameEngine.m1172af() - 40.0f);
        }
        this.f5237bh.f231b = i;
        this.f5237bh.f233d = this.f5237bh.f231b;
        boolean z10 = true;
        boolean z11 = true;
        int i3 = 7;
        if (GameEngine.m1157au()) {
            if (!z9) {
                z10 = false;
                z11 = false;
            } else if (!z3) {
                z11 = false;
                z10 = true;
                i3 = 20;
            }
        } else if (!z) {
            z11 = false;
        }
        if (!GameEngine.m1157au() || z || !z9 || !z3) {
        }
        if (str != null) {
        }
        C0930ag c0930ag2 = this.f5160aL;
        if (z2) {
            C0930ag c0930ag3 = this.f5161aM;
        }
        C0818z m1912a = c0813u.m1912a(this.f5237bh.m7206b(), z10);
        float m7201d = this.f5237bh.m7201d();
        this.f5237bh.f230a = (int) (m7201d - (m1912a.f5388b.m7206b() / 2));
        this.f5237bh.f232c = (int) (m7201d + (m1912a.f5388b.m7206b() / 2));
        this.f5237bh.f233d = this.f5237bh.f231b + m1912a.f5388b.m7202c();
        if (z10) {
            this.f5237bh.f230a = (int) (rect3.f230a - (i3 * gameEngine.f6126ci));
            this.f5237bh.f232c = (int) (rect4.f232c + (i3 * gameEngine.f6126ci));
        }
        if (z11) {
            this.f5237bh.m7209a((int) ((i2 - (7.0f * gameEngine.f6126ci)) - this.f5237bh.f232c), 0);
        }
        this.f5238bi.m7207a(this.f5237bh);
        this.f5238bi.f231b -= 20;
        this.f5238bi.f233d += 15;
        int i4 = -1;
        if (unit != null) {
            i4 = action.mo6186b(unit, true);
        }
        if (unit != null && z5 && i4 != -1) {
            this.f5238bi.f233d = (int) (rect2.f233d + (55.0f * gameEngine.f6126ci));
        }
        if (this.f5238bi.f233d > gameEngine.f6129cl) {
            int i5 = (int) (gameEngine.f6129cl - this.f5238bi.f233d);
            this.f5237bh.m7209a(0, i5);
            this.f5238bi.m7209a(0, i5);
        }
        InterfaceC0303as mo7517i = action.mo7517i();
        if (!action.m6103D()) {
            mo7517i = null;
        }
        if (mo7517i != null && unit != null) {
            this.f5238bi.f231b = (int) (rect.f231b - (40.0f * gameEngine.f6126ci));
        }
        if (z4) {
            int i6 = -this.f5237bh.m7202c();
            this.f5237bh.m7209a(0, i6);
            this.f5238bi.m7209a(0, i6);
        }
        if (0 != 0) {
            int i7 = (int) ((gameEngine.f6129cl - 30.0f) - this.f5238bi.f233d);
            this.f5238bi.m7209a(0, i7);
            this.f5237bh.m7209a(0, i7);
        }
        if (this.f5238bi.f231b < 0) {
            int i8 = 0 - this.f5238bi.f231b;
            this.f5238bi.m7209a(0, i8);
            this.f5237bh.m7209a(0, i8);
        }
        if (this.f5238bi.f233d > gameEngine.f6129cl - 20.0f) {
            int i9 = (int) ((gameEngine.f6129cl - 20.0f) - this.f5238bi.f233d);
            this.f5238bi.m7209a(0, i9);
            this.f5237bh.m7209a(0, i9);
        }
        gameEngine.graphics.mo892b(this.f5238bi, this.f5158aJ);
        gameEngine.graphics.mo892b(this.f5238bi, this.f5154aF);
        if (z6) {
        }
        if (mo7517i != null && unit != null) {
            UnitType.m5737a(mo7517i, this.f5238bi.m7201d(), this.f5238bi.f231b + (22.0f * gameEngine.f6126ci), this.f5118T, 0.0f, unit.team, 30.0f * gameEngine.f6126ci, 100.0f * gameEngine.f6126ci, false, false, action.m6044t(), null);
        }
        m1912a.m1893a(this.f5237bh.m7201d(), this.f5237bh.f231b);
        if (unit != null && i4 != -1 && z5) {
            float f2 = gameEngine.f6126ci * 0.5f;
            int i10 = (int) (60.0f * f2);
            float m2086b = C0794c.m2086b(unit, action, true);
            if (!z6 || i4 > 0) {
                this.f5153aE.m7242b(-16777216);
                if (m2086b != 0.0f) {
                    float m2315b = CommonUtils.m2315b((CommonUtils.m2294c(m2086b) * 0.5f) - 0.4f, 0.0f, 1.0f);
                    if (m2086b > 0.0f) {
                        argb = Color.argb(110, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                    } else {
                        argb = Color.argb(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30, 30);
                    }
                    CommonUtils.m2359a(argb, this.f5153aE.m7230e(), m2315b);
                }
                float m2080b = (this.f5238bi.f233d - ((65.0f * f2) / 2.0f)) + (C0795d.m2080b(this.f5153aE) / 2);
                if (m2086b > 0.5d) {
                    m2080b += 1.0f;
                }
                if (m2086b < -0.5d) {
                    m2080b -= 1.0f;
                }
                gameEngine.graphics.mo903a(VariableScope.nullOrMissingString + i4, this.f5238bi.m7201d(), m2080b, this.f5153aE);
            }
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = !z6 && m2044a(action, true);
            boolean z15 = i4 > 0 && action.m6074d(unit, true);
            int m7201d2 = (int) (this.f5238bi.m7201d() + (60.0f * f2));
            int i11 = (int) (this.f5238bi.f233d - (65.0f * f2));
            this.f5240bk.m7208a(m7201d2, i11, m7201d2 + i10, i11 + i10);
            if (z14) {
                paint = this.f5167aZ;
            } else {
                paint = this.f5168ba;
            }
            if (m2086b > 0.0f) {
                float m2315b2 = CommonUtils.m2315b((CommonUtils.m2294c(m2086b) * 0.7f) - 0.3f, 0.0f, 1.0f);
                if (m2086b > 0.0f) {
                    argb3 = Color.argb(110, 210, 210, 210);
                } else {
                    argb3 = Color.argb(110, 210, 110, 110);
                }
                int m2359a = CommonUtils.m2359a(argb3, paint.m7230e(), m2315b2);
                paint = this.f5242bm;
                paint.m7242b(m2359a);
            }
            if (m2086b > 0.5d) {
                this.f5240bk.m7209a(0, 1);
            }
            gameEngine.graphics.mo914a(this.f5231bb, this.f5240bk.f230a, this.f5240bk.f231b, paint, 0.0f, f2);
            CommonUtils.m2352a(this.f5240bk, this.f5240bk.m7206b() * 0.8f);
            if (this.f5220O && !this.f5219N && !z7 && this.f5240bk.m7205b((int) this.f5203s, (int) this.f5204t)) {
                this.f5220O = false;
                z12 = true;
            }
            int m7201d3 = (int) ((this.f5238bi.m7201d() - i10) - (60.0f * f2));
            int i12 = (int) (this.f5238bi.f233d - (65.0f * f2));
            this.f5240bk.m7208a(m7201d3, i12, m7201d3 + i10, i12 + i10);
            if (z15) {
                paint2 = this.f5167aZ;
            } else {
                paint2 = this.f5168ba;
            }
            if (m2086b < 0.0f) {
                float m2315b3 = CommonUtils.m2315b((CommonUtils.m2294c(m2086b) * 0.7f) - 0.3f, 0.0f, 1.0f);
                if (m2086b > 0.0f) {
                    argb2 = Color.argb(110, 210, 210, 210);
                } else {
                    argb2 = Color.argb(110, 210, 110, 110);
                }
                int m2359a2 = CommonUtils.m2359a(argb2, paint2.m7230e(), m2315b3);
                paint2 = this.f5242bm;
                paint2.m7242b(m2359a2);
            }
            if (m2086b < -0.5d) {
                this.f5240bk.m7209a(0, 1);
            }
            gameEngine.graphics.mo914a(this.f5232bc, this.f5240bk.f230a, this.f5240bk.f231b, paint2, 0.0f, f2);
            CommonUtils.m2352a(this.f5240bk, this.f5240bk.m7206b() * 0.8f);
            if (this.f5220O && !this.f5219N && this.f5240bk.m7205b((int) this.f5203s, (int) this.f5204t)) {
                this.f5220O = false;
                z13 = true;
            }
            int i13 = 1;
            if ((z12 || z13) && action.mo6181g()) {
                if (m2028a(gameEngine)) {
                    i13 = 5;
                }
                if (m2009b(gameEngine)) {
                    i13 = 10;
                }
            }
            if (z12) {
                if (action.mo6181g() && gameEngine.f6093bs.m6306v() <= gameEngine.f6093bs.m6307u()) {
                    m2008b(this.f5106d.f4941an);
                }
                if (z14) {
                    gameEngine.audio.m2998b(AudioEngine.f4037h, 0.5f);
                    C0794c.m2087a(unit, action, false, true);
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    C0749e m1960v = m1960v();
                    if (m2028a(gameEngine)) {
                        m1960v.f4849e = true;
                    }
                    m2032a(m1960v, action);
                    m1960v.m2496a(action.m6035z());
                    m2045a(action, (PointF) null, (Unit) null, m1960v);
                }
            }
            if (z13) {
                if (z15) {
                    C0794c.m2087a(unit, action, true, true);
                    gameEngine.audio.m2998b(AudioEngine.f4038i, 0.5f);
                }
                for (int i15 = 0; i15 < i13; i15++) {
                    C0749e m1960v2 = m1960v();
                    m2032a(m1960v2, action);
                    m1960v2.f4851g = true;
                    m1960v2.m2496a(action.m6035z());
                }
            }
            if (!z12 && !z13 && this.f5220O && !this.f5219N && !this.f5238bi.m7205b((int) this.f5203s, (int) this.f5204t)) {
                return true;
            }
        }
        if (!z5 && GameEngine.m1158at() && this.f5220O && !this.f5219N && !this.f5238bi.m7205b((int) this.f5203s, (int) this.f5204t)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m2048a(Rect rect, Paint paint, Paint paint2) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (f5187bA) {
            gameEngine.graphics.mo911a(this.f5235bf, rect, paint2, rect.f230a, rect.f231b, 0, 0);
            if (paint != null) {
                int m7228f = paint.m7228f() + 0;
                if (m7228f > 255) {
                    m7228f = 255;
                }
                paint.m7237c(m7228f);
            }
        }
        if (paint != null) {
            gameEngine.graphics.mo892b(rect, paint);
        }
    }

    /* renamed from: a */
    public void m2049a(Rect rect, int i, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f5247br.m7242b(i);
        this.f5247br.m7260a(Paint.Style.STROKE);
        this.f5247br.m7270a(1.0f);
        gameEngine.graphics.mo892b(rect, this.f5247br);
        if (this.f5249bz) {
            this.f5247br.m7242b(Color.argb(255, 116, 136, 160));
            int i2 = 1;
            if (z && rect.m7206b() > 100) {
                i2 = 2;
            }
            this.f5247br.m7270a(i2);
            this.f5241bl.m7207a(rect);
            this.f5241bl.f233d -= i2;
            this.f5241bl.f231b += i2;
            this.f5241bl.f230a += i2;
            this.f5241bl.f232c -= i2;
            gameEngine.graphics.mo892b(this.f5241bl, this.f5247br);
        }
    }

    /* renamed from: a */
    public void m2054a(int i, int i2, int i3, int i4, String str, int i5, Paint paint, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f5239bj.m7208a(i, i2, i + i3, i2 + i4);
        this.f5247br.m7242b(i5);
        if (!z) {
            this.f5247br.m7260a(Paint.Style.FILL);
            gameEngine.graphics.mo892b(this.f5239bj, this.f5247br);
        } else {
            m2048a(this.f5239bj, (Paint) null, this.f5247br);
        }
        int argb = Color.argb(255, 0, 0, 0);
        if (f5187bA) {
            argb = Color.argb(100, 0, 0, 0);
        }
        m2049a(this.f5239bj, argb, false);
        m2055a(i, i2, i3, i4, str, i5, paint);
    }

    /* renamed from: a */
    public void m2055a(int i, int i2, int i3, int i4, String str, int i5, Paint paint) {
        GameEngine gameEngine = GameEngine.getInstance();
        this.f5239bj.m7208a(i, i2, i + i3, i2 + i4);
        if (GameEngine.f6201aW) {
            gameEngine.graphics.mo903a(str, this.f5239bj.m7201d(), this.f5239bj.m7200e() + (gameEngine.graphics.mo901a(str, paint) / 2), paint);
        } else {
            gameEngine.graphics.mo903a(str, this.f5239bj.m7201d(), this.f5239bj.m7200e() - ((paint.m7221l() + paint.m7220m()) / 2.0f), paint);
        }
    }

    /* renamed from: I */
    public boolean m2070I() {
        if (this.f5219N) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m2053a(int i, int i2, int i3, int i4, String str, EnumC0798g enumC0798g, boolean z, int i5) {
        return m2051a(i, i2, i3, i4, str, enumC0798g, z, i5, this.f5145aw, false);
    }

    /* renamed from: b */
    public boolean m2013b(int i, int i2, int i3, int i4, String str, EnumC0798g enumC0798g, boolean z, int i5) {
        return m2051a(i, i2, i3, i4, str, enumC0798g, z, i5, this.f5145aw, true);
    }

    /* renamed from: a */
    public boolean m2052a(int i, int i2, int i3, int i4, String str, EnumC0798g enumC0798g, boolean z, int i5, Paint paint) {
        return m2051a(i, i2, i3, i4, str, enumC0798g, z, i5, paint, false);
    }

    /* renamed from: a */
    public boolean m2051a(int i, int i2, int i3, int i4, String str, EnumC0798g enumC0798g, boolean z, int i5, Paint paint, boolean z2) {
        m2054a(i, i2, i3, i4, str, i5, paint, z2);
        return m2056a(i, i2, i3, i4, enumC0798g, z);
    }

    /* renamed from: a */
    public void m2064a(float f, float f2, float f3, float f4) {
        this.f5257bO.m7208a((int) f, (int) f2, (int) (f + f3), (int) (f2 + f4));
        if (this.f5257bO.m7205b((int) this.f5205u, (int) this.f5206v)) {
            this.f5212G = true;
            if (this.f5221P) {
                this.f5211F = true;
            }
        }
    }

    /* renamed from: a */
    public boolean m2056a(int i, int i2, int i3, int i4, EnumC0798g enumC0798g, boolean z) {
        m2064a(i, i2, i3, i4);
        this.f5239bj.m7208a(i, i2, i + i3, i2 + i4);
        if (((z && this.f5209D) || this.f5220O) && this.f5239bj.m7205b((int) this.f5203s, (int) this.f5204t)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2057a(int i, int i2, int i3, int i4, EnumC0798g enumC0798g) {
        this.f5239bj.m7208a(i, i2, i + i3, i2 + i4);
        if (this.f5221P && this.f5239bj.m7205b((int) this.f5203s, (int) this.f5204t)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public float m1964r(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (unit.f1644cF < gameEngine.f6098bA && unit.f1644cF + 200 > gameEngine.f6098bA) {
            return (1.0f - ((gameEngine.f6098bA - unit.f1644cF) / 200.0f)) * 6.0f;
        }
        return GameEngine.getInstance().f6267dw;
    }

    /* renamed from: a */
    public void m2030a(C0767e c0767e) {
        GameEngine gameEngine = GameEngine.getInstance();
        c0767e.m2169r_();
        c0767e.m2143c(gameEngine.f6130cn);
        c0767e.m2140d(gameEngine.f6131co);
        this.f5199n.m2150a(c0767e);
    }

    /* renamed from: J */
    public static void m2069J() {
        f5190bP++;
        f5185bQ = true;
    }
}

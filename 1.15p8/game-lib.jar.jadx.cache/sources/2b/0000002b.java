package com.corrodinggames.rts.gameFramework.gui;

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
import com.corrodinggames.rts.game.ai.AI;
import com.corrodinggames.rts.game.units.C0236ak;
import com.corrodinggames.rts.game.units.EnumC0226aa;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.SandBoxAct;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.Waypoint;
import com.corrodinggames.rts.game.units.WaypointType;
import com.corrodinggames.rts.game.units.buildings.AbstractC0483l;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadataFactory;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p015a.C0330g;
import com.corrodinggames.rts.game.units.custom.p020e.C0411a;
import com.corrodinggames.rts.game.units.custom.p020e.C0420d;
import com.corrodinggames.rts.game.units.custom.p020e.C0421e;
import com.corrodinggames.rts.game.units.custom.p020e.p021a.C0414c;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.C0203d;
import com.corrodinggames.rts.game.units.p012a.C0204e;
import com.corrodinggames.rts.game.units.p012a.C0205f;
import com.corrodinggames.rts.game.units.p012a.C0206g;
import com.corrodinggames.rts.game.units.p012a.C0208i;
import com.corrodinggames.rts.game.units.p012a.C0209j;
import com.corrodinggames.rts.game.units.p012a.C0216q;
import com.corrodinggames.rts.game.units.p012a.C0217r;
import com.corrodinggames.rts.game.units.p012a.EnumC0220u;
import com.corrodinggames.rts.gameFramework.C0678e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.InputController;
import com.corrodinggames.rts.gameFramework.ModLoader.Mod;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.SyncedObject;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.UniquePaint;
import com.corrodinggames.rts.gameFramework.effect.C0661a;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.effect.EffectType;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.gui.p034a.AbstractC0692j;
import com.corrodinggames.rts.gameFramework.gui.p034a.C0682a;
import com.corrodinggames.rts.gameFramework.gui.p034a.C0684c;
import com.corrodinggames.rts.gameFramework.gui.p034a.menu_;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.mission.MissionEngine;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0950u;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.e.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/f.class */
public final class InterfaceEngine extends SyncedObject {

    /* renamed from: c */
    SandBoxAct f4734c;

    /* renamed from: d */
    public BattleInterface battleInterface;

    /* renamed from: e */
    public MessageInterface messageInterface;

    /* renamed from: f */
    public C0706af f4737f;

    /* renamed from: q */
    double f4738q;

    /* renamed from: x */
    boolean f4739x;

    /* renamed from: y */
    boolean f4740y;

    /* renamed from: z */
    float f4741z;

    /* renamed from: A */
    public float f4665A;

    /* renamed from: B */
    public float f4666B;

    /* renamed from: Q */
    public Unit f4667Q;

    /* renamed from: R */
    public float f4668R;

    /* renamed from: S */
    public int f4669S;

    /* renamed from: T */
    public float f4670T;

    /* renamed from: U */
    public Unit f4671U;

    /* renamed from: W */
    public Action f4672W;

    /* renamed from: X */
    public int f4673X;

    /* renamed from: Y */
    public boolean f4674Y;

    /* renamed from: Z */
    public float f4675Z;

    /* renamed from: aa */
    public float f4695aa;

    /* renamed from: ab */
    public float f4696ab;

    /* renamed from: ac */
    public boolean f4697ac;

    /* renamed from: ad */
    public float f4698ad;

    /* renamed from: ae */
    public float f4699ae;

    /* renamed from: af */
    public float f4700af;

    /* renamed from: ag */
    public float f4701ag;

    /* renamed from: ah */
    public float f4702ah;

    /* renamed from: ai */
    public float f4703ai;

    /* renamed from: aj */
    public boolean f4704aj;

    /* renamed from: ak */
    public float f4705ak;

    /* renamed from: al */
    public float f4706al;

    /* renamed from: am */
    public int f4707am;

    /* renamed from: ao */
    public Paint f4708ao;

    /* renamed from: ap */
    public Paint f4709ap;

    /* renamed from: aq */
    public Paint f4710aq;

    /* renamed from: ar */
    public Paint f4711ar;

    /* renamed from: as */
    public Paint f4712as;

    /* renamed from: at */
    public Paint f4713at;

    /* renamed from: au */
    public Paint f4714au;

    /* renamed from: av */
    public Paint f4715av;

    /* renamed from: aw */
    public Paint f4716aw;

    /* renamed from: ax */
    public Paint f4717ax;

    /* renamed from: ay */
    public Paint f4718ay;

    /* renamed from: az */
    public Paint f4719az;

    /* renamed from: aA */
    public Paint f4676aA;

    /* renamed from: aB */
    public Paint f4677aB;

    /* renamed from: aC */
    public Paint f4678aC;

    /* renamed from: aD */
    public Paint f4679aD;

    /* renamed from: aE */
    Paint f4680aE;

    /* renamed from: aF */
    Paint f4681aF;

    /* renamed from: aG */
    Paint f4682aG;

    /* renamed from: aH */
    Paint f4683aH;

    /* renamed from: aI */
    Paint f4684aI;

    /* renamed from: aJ */
    Paint displayTextBackgroundPaintBorder;

    /* renamed from: aK */
    UniquePaint f4686aK;

    /* renamed from: aL */
    UniquePaint f4687aL;

    /* renamed from: aM */
    UniquePaint f4688aM;

    /* renamed from: aN */
    public float f4689aN;

    /* renamed from: aR */
    int numberOfSelectedUnits;

    /* renamed from: aT */
    public boolean f4691aT;

    /* renamed from: aX */
    boolean f4692aX;

    /* renamed from: aY */
    float f4693aY;

    /* renamed from: aZ */
    Paint f4694aZ;

    /* renamed from: ba */
    Paint f4728ba;

    /* renamed from: bs */
    String f4729bs;

    /* renamed from: bt */
    String noNukeText;

    /* renamed from: bu */
    String f4731bu;

    /* renamed from: bv */
    String f4732bv;

    /* renamed from: bw */
    String f4733bw;

    /* renamed from: bN */
    private int f4722bN;

    /* renamed from: bO */
    private int f4723bO;

    /* renamed from: bP */
    private int f4724bP;

    /* renamed from: bQ */
    private int f4725bQ;

    /* renamed from: bR */
    private int f4726bR;

    /* renamed from: bS */
    private int f4727bS;

    /* renamed from: bC */
    public static boolean f4663bC;

    /* renamed from: bH */
    long f4720bH;

    /* renamed from: bI */
    boolean f4721bI;

    /* renamed from: bK */
    public static Unit f4664bK;

    /* renamed from: a */
    public static boolean f4742a = false;

    /* renamed from: bz */
    public static boolean f4743bz = false;

    /* renamed from: bA */
    public static boolean f4744bA = false;

    /* renamed from: bB */
    public static boolean f4745bB = false;

    /* renamed from: b */
    public boolean f4746b = false;

    /* renamed from: g */
    C0204e f4747g = new C0204e();

    /* renamed from: h */
    C0205f f4748h = new C0205f();

    /* renamed from: i */
    C0208i f4749i = new C0208i();

    /* renamed from: j */
    C0203d f4750j = new C0203d();

    /* renamed from: k */
    public C0209j f4751k = new C0209j();

    /* renamed from: l */
    C0217r f4752l = new C0217r();

    /* renamed from: m */
    C0216q f4753m = new C0216q();

    /* renamed from: n */
    AbstractC0692j f4754n = new C0682a();

    /* renamed from: o */
    boolean f4755o = false;

    /* renamed from: p */
    public boolean f4756p = false;

    /* renamed from: r */
    float f4757r = 0.0f;

    /* renamed from: s */
    public float gameTouchLastX = 0.0f;

    /* renamed from: t */
    public float gameTouchLastY = 0.0f;

    /* renamed from: u */
    float f4760u = 40.0f;

    /* renamed from: v */
    float f4761v = 40.0f;

    /* renamed from: w */
    int f4762w = 0;

    /* renamed from: C */
    boolean f4763C = false;

    /* renamed from: D */
    boolean gameTouching = false;

    /* renamed from: E */
    boolean f4765E = false;

    /* renamed from: F */
    boolean f4766F = false;

    /* renamed from: G */
    boolean f4767G = false;

    /* renamed from: H */
    float f4768H = 0.0f;

    /* renamed from: I */
    float f4769I = 0.0f;

    /* renamed from: J */
    float f4770J = 0.0f;

    /* renamed from: K */
    float f4771K = 0.0f;

    /* renamed from: L */
    float f4772L = 0.0f;

    /* renamed from: M */
    float f4773M = 0.0f;

    /* renamed from: N */
    boolean f4774N = false;

    /* renamed from: O */
    boolean gameTouchClick = false;

    /* renamed from: P */
    boolean gameTouchPress = false;

    /* renamed from: V */
    public final boolean f4777V = true;

    /* renamed from: an */
    public final Paint f4778an = new Paint();

    /* renamed from: aO */
    public float f4779aO = 0.0f;

    /* renamed from: aP */
    public float f4780aP = 0.0f;

    /* renamed from: aQ */
    public float f4781aQ = 0.0f;

    /* renamed from: aS */
    public float f4782aS = 0.0f;

    /* renamed from: aU */
    BitmapOrTexture button_no = null;

    /* renamed from: aV */
    BitmapOrTexture button_yes = null;

    /* renamed from: aW */
    BitmapOrTexture button_more = null;

    /* renamed from: bb */
    BitmapOrTexture f4786bb = null;

    /* renamed from: bc */
    BitmapOrTexture f4787bc = null;

    /* renamed from: bd */
    public BitmapOrTexture f4788bd = null;

    /* renamed from: be */
    public BitmapOrTexture f4789be = null;

    /* renamed from: bf */
    public BitmapOrTexture f4790bf = null;

    /* renamed from: bg */
    BitmapOrTexture f4791bg = null;

    /* renamed from: bh */
    final Rect f4792bh = new Rect();

    /* renamed from: bi */
    final Rect f4793bi = new Rect();

    /* renamed from: bj */
    final Rect _rect = new Rect();

    /* renamed from: bk */
    final Rect f4795bk = new Rect();

    /* renamed from: bl */
    final Rect f4796bl = new Rect();

    /* renamed from: bm */
    final Paint f4797bm = new Paint();

    /* renamed from: bn */
    final Paint f4798bn = new Paint();

    /* renamed from: bo */
    final Paint f4799bo = new UniquePaint();

    /* renamed from: bp */
    public final Paint f4800bp = new UniquePaint();

    /* renamed from: bq */
    final Paint f4801bq = new UniquePaint();

    /* renamed from: br */
    final Paint _paint = new Paint();

    /* renamed from: bx */
    public ArrayList f4803bx = new ArrayList();

    /* renamed from: by */
    public boolean f4804by = false;

    /* renamed from: bD */
    C0684c f4805bD = C0684c.m2017b(-1, -1);

    /* renamed from: bE */
    C0421e f4806bE = new C0421e();

    /* renamed from: bF */
    long f4807bF = -1;

    /* renamed from: bG */
    long f4808bG = -1;

    /* renamed from: bJ */
    public C0950u f4809bJ = new C0950u();

    /* renamed from: bL */
    Paint f4810bL = new Paint();

    /* renamed from: bM */
    Rect f4811bM = new Rect();

    /* renamed from: a */
    public boolean m1923a() {
        if (GameEngine.isPC_()) {
            return false;
        }
        return GameEngine.getInstance().curSettings.useCircleSelect;
    }

    /* renamed from: b */
    float m1873b() {
        return Math.min(this.f4757r * 2.5f, 290.0f) + 10.0f;
    }

    /* renamed from: c */
    float m1860c() {
        GameEngine game = GameEngine.getInstance();
        float f = 0.7f;
        if (GameEngine.isPC()) {
            f = 0.9f;
        }
        if (game.viewpointZoom < 1.0f) {
            float f2 = game.viewpointZoom;
            if (f2 < 0.4d) {
                f2 = 0.4f;
            }
            f *= f2;
        }
        return f;
    }

    /* renamed from: a */
    public void m1878a(String str, int i) {
        this.battleInterface.m2053a(str, i);
    }

    /* renamed from: b */
    public void m1862b(String str, int i) {
        this.battleInterface.m2048b(str, i);
    }

    /* renamed from: a */
    public void m1879a(String str) {
        this.battleInterface.m2053a(str, 100);
    }

    /* renamed from: b */
    public void m1863b(String str) {
        this.battleInterface.m2053a(str, 50);
    }

    /* renamed from: c */
    public void m1854c(String str) {
        this.battleInterface.m2053a(str, 5);
    }

    /* renamed from: d */
    public void m1853d() {
        this.gameTouchClick = false;
        this.gameTouchPress = false;
        this.gameTouching = false;
    }

    /* renamed from: a */
    public boolean m1921a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!f4743bz || this.battleInterface.f4492ar) {
            return f < gameEngine.f5870ck - gameEngine.f5874cp;
        } else if (gameEngine.f5836bW.m1788c(f, f2) != null) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    public void m1849e() {
        if (this.battleInterface != null) {
            this.battleInterface.m2070a();
        }
    }

    /* renamed from: a */
    public void m1876a(boolean z) {
        if (z) {
            this.battleInterface.m2031j();
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        this.battleInterface.m2030k();
        m1837k();
        this.f4756p = false;
        this.f4803bx.clear();
        if (!z) {
            gameEngine.gameSpeed = 1.0f;
            gameEngine.InvincibleUnits = false;
            gameEngine.editorMode = false;
            gameEngine.debugTempMode = false;
            gameEngine.triggerDebug = false;
        }
        if (gameEngine.isNetworked() && gameEngine.m918L()) {
            gameEngine.editorMode = gameEngine.networkEngine.f5106p;
        }
        C0704ad.m1968a();
    }

    /* renamed from: f */
    public void m1847f() {
        f4743bz = false;
        f4744bA = false;
        f4745bB = false;
        if (GameEngine.isPC()) {
            f4743bz = true;
            f4744bA = true;
            f4742a = true;
            f4745bB = true;
        }
        if (GameEngine.isLibGDX) {
            f4743bz = true;
            f4744bA = true;
            f4745bB = true;
        }
        if (GameEngine.isNonDedicatedServer() && !GameEngine.getInstance().curSettings.classicInterface) {
            f4743bz = true;
            f4744bA = true;
            f4745bB = true;
        }
    }

    /* renamed from: a */
    public void init(Context context) {
        GameEngine game = GameEngine.getInstance();
        if (GameEngine.m795y()) {
            this.f4804by = true;
        }
        m1847f();
        this.f4729bs = LangLocale.getI18NText("gui.notAvailableInDemoText", new Object[0]);
        this.noNukeText = "Locked";
        this.f4731bu = LangLocale.getI18NText("gui.cannotPlace.general", new Object[0]);
        this.f4732bv = LangLocale.getI18NText("gui.cannotPlace.needsResourcePool", new Object[0]);
        this.f4733bw = LangLocale.getI18NText("gui.cannotPlace.needsWater", new Object[0]);
        this.battleInterface = new BattleInterface(game, this);
        m1849e();
        this.messageInterface = new MessageInterface(game, this);
        this.f4737f = new C0706af(game);
        this.button_no = game.graphics.loadImage(R.drawable.button_no);
        this.button_yes = game.graphics.loadImage(R.drawable.button_yes);
        this.button_more = game.graphics.loadImage(R.drawable.button_more);
        this.f4694aZ = new Paint();
        this.f4694aZ.m4687d(true);
        this.f4728ba = new Paint();
        this.f4728ba.m4687d(true);
        this.f4728ba.m4717a(40, 255, 255, 255);
        this.f4786bb = game.graphics.loadImage(R.drawable.button_add);
        this.f4787bc = game.graphics.loadImage(R.drawable.button_subtract);
        this.f4788bd = game.graphics.loadImage(R.drawable.icon_rally);
        this.f4789be = game.graphics.loadImage(R.drawable.icon_upgrade);
        this.f4790bf = game.graphics.loadImage(R.drawable.metal_dark, false);
        this.f4791bg = game.graphics.loadImage(R.drawable.touch_indicator, false);
        this.f4801bq.m4717a(145, 0, 175, 0);
        this.f4801bq.setStrokeWidth(6.0f);
        UniquePaint.m933b(this.f4801bq);
        this.f4800bp.mo935a(true);
        this.f4708ao = new Paint();
        this.f4709ap = new UniquePaint();
        this.f4709ap.m4717a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f4709ap.mo935a(true);
        this.f4709ap.m4691c(true);
        this.f4709ap.mo937a(Typeface.m4631a(Typeface.f243c, 1));
        game.m892a(this.f4709ap, 20.0f);
        this.f4709ap.m4714a(Paint.Align.f196a);
        this.f4712as = new UniquePaint();
        this.f4712as.m4717a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f4712as.mo935a(true);
        this.f4712as.m4691c(true);
        this.f4712as.mo937a(Typeface.m4631a(Typeface.f243c, 1));
        game.m892a(this.f4712as, 18.0f);
        this.f4712as.m4714a(Paint.Align.f196a);
        this.f4710aq = new UniquePaint();
        this.f4710aq.m4711a(this.f4709ap);
        this.f4710aq.m4717a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f4711ar = new UniquePaint();
        this.f4711ar.setColor(Color.argb(100, 0, 0, 0));
        this.f4711ar.setStyle(Paint.Style.f218c);
        this.f4713at = new UniquePaint();
        this.f4713at.m4717a(100, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        this.f4713at.m4714a(Paint.Align.f196a);
        this.f4713at.m4691c(true);
        this.f4713at.mo935a(true);
        game.m892a(this.f4713at, 12.0f);
        UniquePaint.m933b(this.f4713at);
        this.f4716aw = new UniquePaint();
        if (this.f4804by) {
            this.f4716aw.m4717a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        } else {
            this.f4716aw.m4717a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        }
        this.f4716aw.m4714a(Paint.Align.f197b);
        this.f4716aw.m4691c(true);
        this.f4716aw.mo935a(true);
        game.m892a(this.f4716aw, 12.0f);
        UniquePaint.m933b(this.f4716aw);
        GameEngine.PrintLOG("smallTextPaint size: " + this.f4716aw.m4678k());
        this.f4715av = new UniquePaint();
        this.f4715av.m4711a(this.f4716aw);
        game.m892a(this.f4715av, 10.0f);
        UniquePaint.m933b(this.f4715av);
        this.f4714au = new UniquePaint();
        this.f4714au.m4711a(this.f4716aw);
        game.m892a(this.f4714au, 8.0f);
        UniquePaint.m933b(this.f4714au);
        this.f4717ax = new UniquePaint();
        if (this.f4804by) {
            this.f4717ax.m4717a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        } else {
            this.f4717ax.m4717a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        }
        this.f4717ax.m4714a(Paint.Align.f197b);
        this.f4717ax.m4691c(true);
        this.f4717ax.mo935a(true);
        game.m892a(this.f4717ax, 20.0f);
        UniquePaint.m933b(this.f4717ax);
        this.f4718ay = new UniquePaint();
        this.f4718ay.m4717a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        this.f4718ay.m4714a(Paint.Align.f197b);
        this.f4718ay.m4691c(true);
        this.f4718ay.mo935a(true);
        game.m892a(this.f4718ay, 20.0f);
        UniquePaint.m933b(this.f4718ay);
        this.f4678aC = new UniquePaint();
        this.f4678aC.m4717a(150, 20, 20, 20);
        game.m893a(this.f4678aC);
        UniquePaint.m933b(this.f4678aC);
        this.f4719az = new UniquePaint();
        this.f4719az.m4711a(this.f4717ax);
        this.f4719az.m4717a(255, 128, 0, 0);
        game.m892a(this.f4719az, 14.0f);
        this.f4719az.m4714a(Paint.Align.f197b);
        UniquePaint.m933b(this.f4719az);
        this.f4676aA = new UniquePaint();
        this.f4676aA.m4711a(this.f4719az);
        this.f4676aA.m4717a(255, 220, 222, 49);
        this.f4677aB = new UniquePaint();
        this.f4677aB.m4711a(this.f4717ax);
        game.m892a(this.f4677aB, 12.0f);
        this.f4677aB.m4717a(125, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
        this.f4677aB.m4714a(Paint.Align.f197b);
        UniquePaint.m933b(this.f4677aB);
        this.f4686aK = new UniquePaint();
        this.f4686aK.setColor(-16777216);
        this.f4686aK.mo935a(true);
        this.f4686aK.m4691c(true);
        this.f4686aK.mo937a(Typeface.m4631a(Typeface.f243c, 0));
        game.m892a(this.f4686aK, 14.0f);
        this.f4687aL = new UniquePaint();
        this.f4687aL.m4711a(this.f4686aK);
        this.f4687aL.mo937a(Typeface.m4631a(Typeface.f243c, 1));
        game.m892a(this.f4687aL, 16.0f);
        this.f4688aM = new UniquePaint();
        this.f4688aM.m4711a(this.f4687aL);
        this.f4688aM.setColor(Color.m4733a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 63, 80));
        game.m892a(this.f4688aM, 16.0f);
        this.f4680aE = new UniquePaint();
        this.f4680aE.setColor(-16777216);
        this.f4680aE.m4714a(Paint.Align.f197b);
        this.f4680aE.mo935a(true);
        this.f4680aE.m4691c(true);
        this.f4680aE.mo937a(Typeface.m4631a(Typeface.f243c, 0));
        game.m892a(this.f4680aE, 20.0f);
        this.f4681aF = new UniquePaint();
        this.f4681aF.setColor(-1);
        this.f4681aF.setAlpha(160);
        if (GameEngine.isPC()) {
            this.f4681aF.setAlpha(140);
        }
        game.m893a(this.f4681aF);
        this.f4682aG = new UniquePaint();
        this.f4682aG.setColor(-16777216);
        this.f4682aG.setAlpha(210);
        game.m893a(this.f4682aG);
        this.displayTextBackgroundPaintBorder = new UniquePaint();
        this.displayTextBackgroundPaintBorder.setColor(-7829368);
        this.displayTextBackgroundPaintBorder.setAlpha(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        this.displayTextBackgroundPaintBorder.setStyle(Paint.Style.f217b);
        this.displayTextBackgroundPaintBorder.setStrokeWidth(1.0f);
        game.m893a(this.displayTextBackgroundPaintBorder);
        this.f4683aH = new UniquePaint();
        this.f4683aH.setColor(-16711936);
        this.f4683aH.setAlpha(80);
        this.f4683aH.setStyle(Paint.Style.f216a);
        this.f4683aH.setStrokeWidth(4.0f);
        game.m893a(this.f4683aH);
        this.f4684aI = new UniquePaint();
        this.f4684aI.setColor(Color.argb(120, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 167, 49));
        this.f4684aI.setStyle(Paint.Style.f216a);
        this.f4684aI.setStrokeWidth(8.0f);
        game.m893a(this.f4684aI);
        this.f4679aD = new UniquePaint();
        this.f4679aD.m4691c(true);
        this.f4679aD.mo935a(true);
        game.m892a(this.f4679aD, 12.0f);
        UniquePaint.m933b(this.f4679aD);
    }

    /* renamed from: g */
    public void m1845g() {
        this.messageInterface.m1809b();
        this.f4737f.m1954b();
        this.f4721bI = false;
    }

    /* renamed from: a */
    public void m1922a(float f) {
        GameEngine game = GameEngine.getInstance();
        this.f4738q += f;
        this.f4779aO = CommonUtils.toZero(this.f4779aO, f);
        this.f4780aP = CommonUtils.toZero(this.f4780aP, f);
        this.f4782aS = CommonUtils.toZero(this.f4782aS, 0.08f * f);
        this.f4781aQ = CommonUtils.toZero(this.f4781aQ, f);
        this.f4741z += f;
        this.f4689aN += 0.05f * f;
        if (this.f4689aN > 1.0f) {
            this.f4689aN -= 1.0f;
            if (this.f4689aN > 1.0f) {
                this.f4689aN = 0.0f;
            }
        }
        game.f5982dx = 4.0f * this.f4782aS;
        float f2 = 1.0f * f;
        if (!this.gameTouching) {
            float f3 = this.f4772L * f;
            float f4 = this.f4773M * f;
            float minf = CommonUtils.minf(80.0f, f3);
            float minf2 = CommonUtils.minf(80.0f, f4);
            game.f5882cx += minf;
            game.f5883cy += minf2;
        } else {
            f2 *= 4.0f;
        }
        float m1691b = CommonUtils.m1691b(0.0f, 0.0f, this.f4772L, this.f4773M);
        float m1659d = CommonUtils.m1659d(0.0f, 0.0f, this.f4772L, this.f4773M);
        if (m1691b > 30.0f) {
            m1691b = 30.0f;
        }
        float zero = CommonUtils.toZero(m1691b, f2);
        this.f4772L = CommonUtils.cos(m1659d) * zero;
        this.f4773M = CommonUtils.sin(m1659d) * zero;
        this.f4691aT = false;
        this.gameTouching = game.m905Y() && game.f5991dM[0] && this.f4779aO == 0.0f;
        if (this.f4780aP != 0.0f) {
            if (!this.gameTouching) {
                this.f4780aP = 0.0f;
            }
            this.gameTouching = false;
            this.f4763C = false;
        }
        boolean z = false;
        if (this.f4781aQ > 0.0f) {
            z = true;
        }
        if (game.m905Y() && game.m877aa() > 1) {
            z = true;
            this.f4781aQ = 4.0f;
        }
        if (z) {
            this.gameTouching = false;
            this.f4763C = false;
            this.f4774N = false;
            this.f4757r = 0.0f;
        }
        this.f4767G = game.m876ab() > game.f5851cE;
        this.gameTouchClick = !this.gameTouching && this.f4763C;
        this.gameTouchPress = this.gameTouching && !this.f4763C;
        if (GameEngine.isPC() && game.curSettings.mouseSupport) {
            this.f4760u = game.m876ab();
            this.f4761v = game.m875ac();
        }
        if (!this.gameTouching && !this.gameTouchClick) {
            this.f4740y = false;
        }
        if (this.gameTouching) {
            this.f4757r += f;
            this.gameTouchLastX = game.m849b(0);
            this.gameTouchLastY = game.m841c(0);
            this.f4760u = this.gameTouchLastX;
            this.f4761v = this.gameTouchLastY;
            this.f4762w = game.m833d(0);
            this.f4739x = m1921a(this.gameTouchLastX, this.gameTouchLastY);
            boolean z2 = false;
            if (this.f4739x && !this.f4763C) {
                if (this.f4741z < 30.0f) {
                    float distanceSq = CommonUtils.distanceSq(this.f4665A, this.f4666B, this.gameTouchLastX, this.gameTouchLastY);
                    float f5 = 10.0f * game.densityScale;
                    if (GameEngine.isIOS()) {
                        f5 = (float) (f5 * 1.5d);
                    }
                    if (distanceSq < f5 * f5) {
                        z2 = true;
                    }
                }
                this.f4741z = 0.0f;
                this.f4665A = this.gameTouchLastX;
                this.f4666B = this.gameTouchLastY;
            }
            if (z2) {
                this.f4740y = true;
            }
            if (!this.f4763C) {
                this.f4774N = false;
                this.f4768H = this.gameTouchLastX;
                this.f4769I = this.gameTouchLastY;
                this.f4770J = this.gameTouchLastX;
                this.f4771K = this.gameTouchLastY;
                this.f4765E = game.f5836bW.m1788c(this.gameTouchLastX, this.gameTouchLastY) != null;
                this.f4766F = false;
                if (!this.f4765E) {
                    this.f4766F = this.gameTouchLastX > game.f5851cE;
                }
            }
            this.f4763C = true;
        }
        if (this.gameTouching && (this.f4757r <= 20.0f || !m1923a())) {
            float distanceSq2 = CommonUtils.distanceSq(this.f4768H, this.f4769I, this.gameTouchLastX, this.gameTouchLastY);
            if (!this.f4765E) {
                float f6 = 30.0f * game.densityScale;
                if (GameEngine.isPC() && game.curSettings.mouseSupport && game.m828e(3)) {
                    f6 = 0.0f;
                }
                if (!this.f4774N && distanceSq2 > f6 * f6) {
                    boolean z3 = false;
                    int i = 1;
                    if (game.curSettings.mouseOrders == 2) {
                        i = 2;
                    }
                    if ((!game.curSettings.mouseSupport || this.f4762w != i) && !m1855c(game)) {
                        z3 = true;
                    }
                    if (z3) {
                        this.f4774N = true;
                    }
                    this.f4770J = this.gameTouchLastX;
                    this.f4771K = this.gameTouchLastY;
                }
            }
        }
        if (GameEngine.isPC() && !game.f5818as && game.gameViewA != null && ((game.gameViewA.mo240f() || GameEngine.f5804aR) && (!this.gameTouching || this.battleInterface.f4509c))) {
            float f7 = (24.0f * game.curSettings.edgeScrollSpeed) / game.viewpointZoom;
            float f8 = game.f5882cx;
            float f9 = game.f5883cy;
            float f10 = 0.0f;
            float f11 = 0.0f;
            if (this.f4760u <= 1.0f) {
                f10 = 0.0f - (f7 * f);
            }
            if (this.f4760u >= game.f5870ck - 1.0f) {
                f10 += f7 * f;
            }
            if (this.f4761v <= 1.0f) {
                f11 = 0.0f - (f7 * f);
            }
            if (this.f4761v >= game.f5871cl - 1.0f) {
                f11 += f7 * f;
            }
            game.f5882cx += f10;
            game.f5883cy += f11;
            game.m917M();
            this.battleInterface.f4524B.left -= (game.f5882cx - f8) * game.viewpointZoom;
            this.battleInterface.f4524B.top -= (game.f5883cy - f9) * game.viewpointZoom;
        }
        InputController inputController = game.f5833bT;
        if (game.curSettings.keyboardSupport) {
            if (game.m929A()) {
                float f12 = 12.0f * game.curSettings.scrollSpeed;
                if (inputController.f3921p.m2373b()) {
                    game.f5882cx -= f12 * f;
                }
                if (inputController.f3922q.m2373b()) {
                    game.f5882cx += f12 * f;
                }
                if (inputController.f3919n.m2373b()) {
                    game.f5883cy -= f12 * f;
                }
                if (inputController.f3920o.m2373b()) {
                    game.f5883cy += f12 * f;
                }
                if (inputController.f3923r.m2373b()) {
                    game.f5962cU += 0.1f;
                }
                if (inputController.f3924s.m2373b()) {
                    game.f5962cU -= 0.1f;
                }
            }
            if (inputController.f3930y.m2379a()) {
                m1837k();
                m1817w();
            }
            if (inputController.f3931z.m2379a()) {
                this.f4737f.m1950d();
            }
            if (inputController.f3932A.m2379a()) {
                m1837k();
                m1817w();
                Iterator it = GameObject.fastGameObjectList.iterator();
                while (it.hasNext()) {
                    GameObject gameObject = (GameObject) it.next();
                    if (gameObject instanceof OrderableUnit) {
                        OrderableUnit orderableUnit = (OrderableUnit) gameObject;
                        if (!orderableUnit.dead && orderableUnit.team == game.playerTeam && orderableUnit.canAttack() && !orderableUnit.mo2560aj() && orderableUnit.mo2579aR()) {
                            m1838j(orderableUnit);
                        }
                    }
                }
            }
            if (inputController.f3933B.m2379a()) {
                m1837k();
                m1817w();
                Iterator it2 = GameObject.fastGameObjectList.iterator();
                while (it2.hasNext()) {
                    GameObject gameObject2 = (GameObject) it2.next();
                    if (gameObject2 instanceof OrderableUnit) {
                        OrderableUnit orderableUnit2 = (OrderableUnit) gameObject2;
                        if (orderableUnit2.team == game.playerTeam && orderableUnit2.getUnitType() == UnitType.f1708e && !orderableUnit2.dead) {
                            m1838j(orderableUnit2);
                            game.m851b(orderableUnit2.x, orderableUnit2.y);
                        }
                    }
                }
            }
            if (inputController.f3934C.m2379a()) {
                AbstractC0696ab.m1976a(this.f4803bx, AbstractC0696ab.f4612a, AbstractC0696ab.f4613b);
            }
            if (inputController.f3935D.m2379a()) {
                AbstractC0696ab.m1976a(this.f4803bx, AbstractC0696ab.f4614c, null);
            }
            if (inputController.f3936E.m2379a()) {
                AbstractC0696ab.m1976a(this.f4803bx, AbstractC0696ab.f4615d, null);
            }
            if (inputController.f3937F.m2379a()) {
                AbstractC0696ab.m1976a(this.f4803bx, AbstractC0696ab.f4616e, null);
            }
            if (inputController.f3938G.m2379a()) {
                AbstractC0696ab.m1976a(this.f4803bx, AbstractC0696ab.f4617f, null);
            }
            if (inputController.f3929x.m2379a()) {
                this.battleInterface.m2066a(12);
            }
            if (inputController.f3945N.m2379a() && m1814z() && m1931A()) {
                m1837k();
                this.f4671U = null;
                this.f4672W = this.f4747g;
                return;
            } else if (inputController.f3947P.m2379a() && m1815y()) {
                m1837k();
                this.f4671U = null;
                this.f4672W = this.f4748h;
                return;
            } else if (inputController.f3948Q.m2379a() && m1931A()) {
                m1837k();
                this.f4671U = null;
                this.f4672W = this.f4749i;
                return;
            } else {
                if (inputController.f3946O.m2379a()) {
                    m1820t();
                }
                if (inputController.f3927v.m2379a()) {
                    m1925G();
                }
                if (inputController.f3925t.m2379a() && game.isNetworked()) {
                    GameEngine.PrintLOG("showing send chat");
                    this.battleInterface.m2066a(13);
                }
                if (inputController.f3926u.m2379a() && game.isNetworked()) {
                    GameEngine.PrintLOG("showing send team chat");
                    this.battleInterface.m2066a(16);
                }
                if (game.m918L() || game.replayEngine.isPlaying()) {
                    if (inputController.f3943L.m2379a()) {
                        if (game.gameSpeed != 0.0f) {
                            if (!game.replayEngine.isPlaying()) {
                                NetworkEngine.m1468a((String) null, "Game paused");
                            }
                            game.gameSpeed = 0.0f;
                        } else {
                            game.gameSpeed = 1.0f;
                        }
                    }
                    boolean m2379a = inputController.f3941J.m2379a();
                    boolean m2379a2 = inputController.f3942K.m2379a();
                    if (m2379a || m2379a2) {
                        if (m2379a) {
                            boolean multipleSpeed = game.gameSpeed > 1.0f;
                            boolean z4 = multipleSpeed;
                            if (game.gameSpeed < 2.0f) {
                                game.gameSpeed = (float) (game.gameSpeed - 0.25d);
                            } else if (game.gameSpeed < 6.0f) {
                                game.gameSpeed = (float) (game.gameSpeed - 0.5d); // sub Game speed
                            } else if (game.gameSpeed < 16.0f) {
                                game.gameSpeed -= 2.0f;
                            } else {
                                game.gameSpeed -= 4.0f;
                            }
                            if (game.gameSpeed < 0.0f) {
                                game.gameSpeed = 0.0f;
                            }
                            if (z4 && game.gameSpeed < 1.0f) {
                                game.gameSpeed = 1.0f;
                            }
                        } else if (m2379a2) {
                            boolean z5 = game.gameSpeed < 1.0f;
                            if (game.gameSpeed < 2.0f) {
                                game.gameSpeed = (float) (game.gameSpeed + 0.25d);
                            } else if (game.gameSpeed < 6.0f) {
                                game.gameSpeed = (float) (game.gameSpeed + 0.5d);
                            } else if (game.gameSpeed < 16.0f) {
                                game.gameSpeed += 2.0f;
                            } else {
                                game.gameSpeed += 4.0f;
                            }
                            if (game.replayEngine.isPlaying()) {
                                if (game.gameSpeed > 64.0f) {
                                    game.gameSpeed = 64.0f;
                                }
                            } else if (game.gameSpeed > 5.0f) {
                                game.gameSpeed = 5.0f;
                            }
                            if (z5 && game.gameSpeed > 1.0f) {
                                game.gameSpeed = 1.0f;
                            }
                        }
                        if (!game.replayEngine.isPlaying()) {
                            NetworkEngine.m1468a((String) null, "Game speed now: " + game.gameSpeed);
                        }
                    }
                }
                game.f5858cS = CommonUtils.toZero(game.f5858cS, f);
                if (inputController.f3956Y.m2379a()) {
                    game.f5858cS = 180.0f;
                }
                if (game.editorMode && inputController.f3959ab.m2379a()) {
                    game.debugTempMode = !game.debugTempMode;
                    GameEngine.PrintLOG("debugTempMode now: " + game.debugTempMode);
                    m1879a("debug: " + game.debugTempMode);
                }
                if (game.editorMode && game.debugTempMode && inputController.f3960ac.m2379a()) {
                    AI.f535ap = !AI.f535ap;
                    m1879a("AI debug view: " + AI.f535ap);
                }
                if (game.editorMode && game.debugTempMode && inputController.f3961ad.m2379a()) {
                    MissionEngine.f6066a = !MissionEngine.f6066a;
                    m1879a("Map debug: " + MissionEngine.f6066a);
                }
                if (game.m918L() || game.replayEngine.isPlaying()) {
                    if (game.editorMode) {
                        if (inputController.f3953V.m2379a()) {
                            game.f5841bp = !game.f5841bp;
                        }
                        if (inputController.f3954W.m2379a()) {
                            if (game.gameSpeed == 1.0f) {
                                game.gameSpeed = 0.1f;
                            } else {
                                game.gameSpeed = 1.0f;
                            }
                        }
                        if (inputController.f3955X.m2379a()) {
                            GameEngine.PrintLOG("Adding test popup");
                            game.networkEngine.m1511Q();
                        }
                        if (inputController.f3957Z.m2379a()) {
                            game.InvincibleUnits = !game.InvincibleUnits;
                        }
                        if (inputController.f3958aa.m2379a()) {
                            Iterator it3 = GameObject.fastGameObjectList.iterator();
                            while (it3.hasNext()) {
                                GameObject gameObject3 = (GameObject) it3.next();
                                if (gameObject3 instanceof OrderableUnit) {
                                    OrderableUnit orderableUnit3 = (OrderableUnit) gameObject3;
                                    if (orderableUnit3.selected) {
                                        orderableUnit3.mo2648T();
                                    }
                                }
                            }
                        }
                    }
                    if (inputController.f3952U.m2379a()) {
                        game.editorMode = !game.editorMode;
                        if (game.editorMode) {
                            m1817w();
                        }
                    }
                }
            }
        }
        if (game.editorMode && !game.m918L() && !game.replayEngine.isPlaying()) {
            game.editorMode = false;
        }
        if (game.editorMode) {
            if (this.f4734c != null && (this.f4734c.deleted || this.f4734c.dead)) {
                this.f4734c = null;
            }
            if (this.f4734c == null) {
                GameEngine.PrintLOG("Creating new debug editor");
                this.f4734c = new SandBoxAct(false);
                this.f4734c.mo2537b(game.playerTeam);
            }
            if (m1827p() == 0) {
                m1817w();
                m1838j(this.f4734c);
            }
            if (game.curSettings.liveReloading && game.frameNumber % 100 == 0 && !game.replayEngine.m2303g()) {
                CustomUnitMetadataFactory.m3543c();
            }
        } else {
            if (this.f4734c != null && (this.f4734c.deleted || this.f4734c.dead)) {
                this.f4734c = null;
            }
            if (this.f4734c != null && !game.replayEngine.isPlaying()) {
                m1843h();
            }
        }
        if (this.f4774N) {
            if (this.f4766F) {
                this.battleInterface.f4491aq = this.f4771K - this.gameTouchLastY;
            } else {
                int i2 = 1;
                if (game.curSettings.mouseOrders == 2) {
                    i2 = 2;
                }
                if ((!game.curSettings.mouseSupport || this.f4762w != i2) && !m1855c(game)) {
                    SettingsEngine settingsEngine = game.curSettings;
                    double d = this.f4770J - this.gameTouchLastX;
                    double d2 = this.f4771K - this.gameTouchLastY;
                    float m1691b2 = CommonUtils.m1691b(0.0f, 0.0f, (float) d, (float) d2);
                    double d3 = (d * settingsEngine.scrollSpeed) / game.viewpointZoom;
                    double d4 = (d2 * settingsEngine.scrollSpeed) / game.viewpointZoom;
                    if (f != 0.0f && m1691b2 > 50.0d * f) {
                        float f13 = 0.7f;
                        if (GameEngine.isPC()) {
                            f13 = 1.7f;
                        }
                        this.f4772L = (float) (d3 * f13);
                        this.f4773M = (float) (d4 * f13);
                    }
                    game.f5882cx = (float) (game.f5882cx + (d3 * 2.0d));
                    game.f5883cy = (float) (game.f5883cy + (d4 * 2.0d));
                }
            }
            this.f4770J = this.gameTouchLastX;
            this.f4771K = this.gameTouchLastY;
        }
        if (game.curSettings.mouseSupport && (this.f4805bD.f4558a != ((int) game.m876ab()) || this.f4805bD.f4559b != ((int) game.m875ac()))) {
            this.f4805bD.f4558a = (int) game.m876ab();
            this.f4805bD.f4559b = (int) game.m875ac();
            this.f4754n.m1992b(this.f4805bD);
        }
        if (this.gameTouchClick && m1924H()) {
            this.f4754n.m1992b(C0684c.m2019a((int) this.f4760u, (int) this.f4761v));
        }
        this.f4754n.m1994b(f);
    }

    /* renamed from: h */
    public void m1843h() {
        if (this.f4734c != null) {
            unselectUnit(this.f4734c);
            this.f4734c.m3745cg();
            this.f4734c = null;
        }
    }

    /* renamed from: i */
    public SandBoxAct m1841i() {
        return this.f4734c;
    }

    /* renamed from: a */
    public void m1891a(SandBoxAct sandBoxAct) {
        this.f4734c = sandBoxAct;
    }

    /* renamed from: a */
    public boolean m1883a(GameEngine gameEngine) {
        if (!gameEngine.curSettings.keyboardSupport) {
            return false;
        }
        return gameEngine.m840c(59, 60);
    }

    /* renamed from: b */
    public boolean m1864b(GameEngine gameEngine) {
        if (!gameEngine.curSettings.keyboardSupport) {
            return false;
        }
        return gameEngine.m840c(113, 114);
    }

    /* renamed from: c */
    public boolean m1855c(GameEngine gameEngine) {
        if (!gameEngine.curSettings.keyboardSupport) {
            return false;
        }
        return gameEngine.m840c(57, 58);
    }

    /* renamed from: b */
    public void m1872b(float f) {
        GameEngine game = GameEngine.getInstance();
        this.f4670T += 0.2f * f;
        if (this.f4670T > 360.0f) {
            this.f4670T -= 360.0f;
        }
        this._rect.set((int) (game.f5870ck - game.f5874cp), 0, (int) game.f5870ck, (int) game.f5871cl);
        if (!f4743bz) {
            if (this.f4804by) {
                this.f4797bm.m4721a();
                this.f4797bm.setColor(Color.argb(255, 33, 40, 52));
                this.f4797bm.setStyle(Paint.Style.f216a);
                game.graphics.drawRect(this._rect, this.f4797bm);
            } else {
                game.graphics.mo193a(this.f4790bf, this._rect, (Paint) null);
            }
            this.f4797bm.m4721a();
            this.f4797bm.setColor(Color.argb(255, 0, 0, 0));
            this.f4797bm.setStyle(Paint.Style.f217b);
            game.graphics.drawRect(this._rect, this.f4797bm);
        }
        this.f4722bN = 0;
        this.f4724bP = 0;
        this.f4723bO = 0;
        this.f4726bR = this.f4727bS;
        this.f4727bS = 0;
        OrderableUnit m1823r = m1823r();
        if (game.playerTeam != null && game.playerTeam != Team.f1346g) {
            m1880a(game, game.playerTeam, false, true);
        }
        if (m1823r != null && game.playerTeam != m1823r.team && m1832m(m1823r)) {
            m1880a(game, m1823r.team, true, true);
        }
        if (game.editorMode && !game.replayEngine.isPlaying()) {
            String str = VariableScope.nullOrMissingString;
            if (game.editorMode) {
                str = str + "Editor Active\n";
            }
            if (game.gameSpeed != 1.0f) {
                str = str + "Game Speed: " + game.gameSpeed + "x\n";
            }
            if (game.InvincibleUnits) {
                str = str + "Invincible Units\n";
            }
            boolean AIsFrozen = false;
            Iterator it = Team.m3929c().iterator();
            while (it.hasNext()) {
                Team team = (Team) it.next();
                if (team instanceof AI) {
                    AIsFrozen = ((AI) team).f575bD > 0.0f;
                }
            }
            if (AIsFrozen) {
                str = str + "AIs frozen\n";
            }
            Paint team2 = this.f4797bm;
            team2.m4721a();
            this.f4797bm.setColor(Color.argb(0, 0, 0, 0));
            this.f4797bm.setStyle(Paint.Style.f216a);
            float f2 = 70.0f * game.densityScale;
            float f3 = 40.0f;
            if (game.f5870ck < 600.0f && game.f5871cl > 650.0f) {
                f2 = 10.0f;
                f3 = 60.0f * game.densityScale;
            }
            game.graphics.mo176a(str, f2, f3, this.f4712as, this.f4797bm, 6.0f);
        }
        m1839j();
        this.f4754n.m1984f();
    }

    /* renamed from: j */
    public void m1839j() {
        GameEngine.getInstance();
    }

    /* renamed from: a */
    public void m1880a(GameEngine gameEngine, Team team, boolean z, boolean z2) {
        if (team.f1325l) {
            m1882a(gameEngine, team, z, C0414c.f2600A, team.m3968T() + team.f1327n, (C0421e) null, 0, (C0411a) null);
        }
        if (z2) {
            this.f4806bE.m3274g(team.m3967U());
            Iterator it = C0411a.m3333e().iterator();
            while (it.hasNext()) {
                C0411a c0411a = (C0411a) it.next();
                if (c0411a.m3335c() && c0411a.f2588o) {
                    this.f4806bE.m3286c(c0411a);
                }
            }
            this.f4806bE.m3277e();
            m1881a(gameEngine, team, z, this.f4806bE);
        }
    }

    /* renamed from: a */
    public void m1881a(GameEngine gameEngine, Team team, boolean z, C0421e c0421e) {
        Iterator it = c0421e.f2635b.iterator();
        while (it.hasNext()) {
            C0420d c0420d = (C0420d) it.next();
            if (!c0420d.f2632a.m3344a()) {
                m1882a(gameEngine, team, z, c0420d.f2632a, c0420d.f2633b, c0421e, 0, (C0411a) null);
            }
        }
    }

    /* renamed from: a */
    public boolean m1882a(GameEngine gameEngine, Team team, boolean z, C0411a c0411a, double d, C0421e c0421e, int i, C0411a c0411a2) {
        float f;
        float f2;
        C0411a c0411a3;
        if (i == 0) {
            this.f4725bQ = 0;
        }
        boolean z2 = false;
        if (i < 6 && c0421e != null && (c0411a3 = c0411a.f2582i) != null && ((c0411a.f2583j || d != 0.0d) && m1882a(gameEngine, team, z, c0411a3, c0421e.m3310a(c0411a3), c0421e, i + 1, c0411a))) {
            z2 = true;
        }
        if (d == 0.0d && !c0411a.f2588o) {
            if (z2) {
                return true;
            }
            return false;
        }
        String m3343a = c0411a.m3343a(d, true);
        int m3939b = team.m3939b(c0411a);
        int m3959a = team.m3959a(c0411a);
        if (m3959a != 0) {
            m3343a = m3343a + "(+" + m3939b + ")(-" + m3959a + ")";
        } else if (m3939b != 0) {
            if (m3939b >= 0) {
                m3343a = m3343a + "(+" + m3939b + ")";
            } else {
                m3343a = m3343a + "(" + m3939b + ")";
            }
        }
        int i2 = ((int) (gameEngine.f5870ck - gameEngine.f5874cp)) - this.f4725bQ;
        Paint paint = this.f4709ap;
        if (z) {
            paint = this.f4710aq;
        } else {
            Integer m3331g = c0411a.m3331g();
            if (m3331g != null) {
                this.f4778an.m4711a(paint);
                paint = this.f4778an;
                paint.setColor(m3331g.intValue());
            }
        }
        float mo153b = gameEngine.graphics.mo153b(m3343a, paint);
        float mo175a = gameEngine.graphics.mo175a(m3343a, paint);
        if (this.f4727bS < mo153b) {
            this.f4727bS = (int) mo153b;
        }
        int i3 = this.f4724bP;
        if (c0411a.f2593t) {
            i3 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        if (i3 == 0) {
            i4 = this.f4723bO;
        } else {
            i5 = this.f4722bN;
        }
        int i6 = 0;
        int i7 = 6;
        int i8 = 6;
        int i9 = 6;
        boolean z3 = false;
        float f3 = mo153b + 6 + 6;
        if (c0411a.f2584k) {
            f3 += 80.0f;
        }
        if (i2 < f3 && c0411a.f2582i != null) {
            z3 = true;
            this.f4722bN = (int) (this.f4722bN + mo175a + 6);
            i5 = this.f4722bN;
            i2 += this.f4725bQ;
            this.f4725bQ = 0;
        }
        if (i3 != 0) {
            i7 = 0;
        }
        if (c0411a2 != null && !c0411a2.f2584k) {
            i8 = 0;
        }
        if (z2 && !c0411a.f2584k) {
            i2 += 6;
            i9 = 0;
        }
        if (z2 && c0411a.f2584k && !z3) {
            i6 = gameEngine.graphics.mo153b("AA", paint);
        }
        int i10 = i2 - i6;
        BitmapOrTexture m3328j = c0411a.m3328j();
        float f4 = 1.0f;
        if (m3328j != null) {
            float f5 = mo175a - 3.0f;
            if (f5 < 3.0f) {
                f5 = 3.0f;
            }
            f4 = C0714d.m1937a(m3328j, mo175a * 3.0f, f5);
            f = (m3328j.width * f4) + 3.0f;
            i8 += (int) f;
        } else {
            f = 0.0f;
        }
        C0714d.m1935a(m3343a, ((i10 - mo153b) - i4) - 6, i5 + 6, paint, this.f4711ar, i8, i7, i9, 6);
        if (m3328j != null) {
            gameEngine.graphics.mo195a(m3328j, (int) (((f2 - (f / 2.0f)) - (m3328j.f5668q * f4)) - 3.0f), (int) (((i5 + 6) + (mo175a / 2.0f)) - (m3328j.f5669r * f4)), this.f4800bp, 0.0f, f4);
        }
        if (i == 0) {
            if (i3 == 0) {
                this.f4723bO = (int) (this.f4723bO + mo153b + i9 + i8);
            }
            if (this.f4724bP == i3) {
                this.f4722bN = (int) (this.f4722bN + mo175a + 6);
                this.f4724bP++;
            }
        }
        this.f4725bQ = (int) (this.f4725bQ + mo153b + i9 + i8 + i6);
        return true;
    }

    /* renamed from: b */
    public boolean m1861b(boolean z) {
        return m1874a(z, false, false);
    }

    /* renamed from: a */
    public boolean m1875a(boolean z, boolean z2) {
        return m1874a(z, true, z2);
    }

    /* renamed from: a */
    public boolean m1874a(boolean z, boolean z2, boolean z3) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (GameEngine.isPC()) {
            return false;
        }
        this.f4692aX = true;
        float f = gameEngine.densityScale * 0.6f;
        int i = (int) (100.0f * f);
        int i2 = (int) (10.0f * f);
        int i3 = (int) ((gameEngine.f5871cl - ((int) (9.0f * f))) - (i * this.f4693aY));
        if (f4663bC) {
            i3 = (int) (i3 - gameEngine.f5836bW.f4854d);
        }
        if (z3) {
            int i4 = ((int) (20.0f * f)) + i + ((int) (20.0f * f)) + i;
            this.f4795bk.set(i2 + i4, i3, i2 + i4 + i, i3 + i);
            gameEngine.graphics.mo195a(this.button_more, this.f4795bk.left, this.f4795bk.top, this.f4694aZ, 0.0f, f);
        } else if (z) {
            this.f4795bk.set(i2, i3, i2 + i, i3 + i);
            gameEngine.graphics.mo195a(this.button_yes, this.f4795bk.left, this.f4795bk.top, this.f4694aZ, 0.0f, f);
        } else {
            int i5 = ((int) (20.0f * f)) + i;
            this.f4795bk.set(i2 + i5, i3, i2 + i5 + i, i3 + i);
            gameEngine.graphics.mo195a(this.button_no, this.f4795bk.left, this.f4795bk.top, this.f4694aZ, 0.0f, f);
        }
        if (this.gameTouchClick && !this.f4774N) {
            CommonUtils.m1729a(this.f4795bk, 10.0f * f);
            if (this.f4795bk.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m1837k() {
        GameEngine.getInstance();
        if (this.f4672W != null) {
            if (this.f4672W.mo2698e() == EnumC0220u.f1448b) {
                this.f4672W = null;
                this.f4674Y = false;
                this.f4697ac = false;
                this.f4671U = null;
                this.f4704aj = false;
                this.f4673X++;
            } else {
                this.f4672W = null;
            }
            this.f4707am = 0;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m1859c(float f) {
        float f2;
        float f3;
        GameEngine gameEngine = GameEngine.getInstance();
        Point m1788c = gameEngine.f5836bW.m1788c(this.gameTouchLastX, this.gameTouchLastY);
        if (m1788c != null) {
            f3 = m1788c.game;
            f2 = m1788c.y;
        } else {
            f3 = (this.gameTouchLastX / gameEngine.viewpointZoom) + gameEngine.viewpointX_rounded;
            f2 = (this.gameTouchLastY / gameEngine.viewpointZoom) + gameEngine.viewpointY_rounded;
        }
        this.f4675Z = CommonUtils.toZero(this.f4675Z, f);
        this._rect.set((int) (gameEngine.f5870ck - gameEngine.f5874cp), 0, (int) gameEngine.f5870ck, (int) gameEngine.f5871cl);
        if (!f4743bz && ((this.gameTouchClick || this.gameTouching) && this._rect.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY))) {
            this.f4691aT = true;
        }
        this.battleInterface.m2069a(f);
        this.battleInterface.m2051b(f);
        this.f4668R += f;
        if (!gameEngine.m797w()) {
            this.battleInterface.m2068a(f, this.battleInterface.m2042d(f));
            this.battleInterface.m2034g(f);
            this.messageInterface.m1811a(f);
            this.f4737f.m1959a(f);
            if (this.f4756p) {
                this.battleInterface.m2046c(f);
            }
            this.battleInterface.m2039e(f);
            this.battleInterface.m2067a(f, true);
        }
        m1918a(f, f3, f2, m1788c);
        if (!gameEngine.m797w() && !this.f4756p) {
            this.battleInterface.m2046c(f);
        }
        boolean z = false;
        if (!this.f4774N) {
            boolean z2 = true;
            boolean z3 = true;
            boolean z4 = true;
            if (GameEngine.isPC() && gameEngine.curSettings.mouseSupport) {
                if (gameEngine.curSettings.mouseOrders == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    if (gameEngine.curSettings.mouseOrders == 1) {
                        if (gameEngine.m828e(1)) {
                            z3 = true;
                        } else if (gameEngine.m828e(2)) {
                            z4 = true;
                        }
                    } else if (gameEngine.m828e(2)) {
                        z3 = true;
                    } else if (gameEngine.m828e(1)) {
                        z4 = true;
                    }
                }
            }
            float f4 = f3;
            float f5 = f2;
            if (this.gameTouching && m1788c != null && this.f4765E) {
                boolean z5 = false;
                if (!z2 && !z4) {
                    z5 = true;
                }
                if (m1827p() == 0 || !m1931A()) {
                    z5 = true;
                }
                if (z2 && this.f4757r > 20.0f) {
                    z5 = true;
                }
                if (z5) {
                    gameEngine.m851b(f4, f5);
                    z = true;
                }
            }
            if ((this.f4739x || (m1788c != null && (z2 || z4))) && !z && this.f4672W == null && this.gameTouchClick) {
                if (this.f4757r > 30.0f) {
                    if (m1923a() && m1788c == null) {
                        m1817w();
                        m1870b(f4, f5, m1873b() / gameEngine.viewpointZoom);
                        m1929C();
                    }
                } else {
                    gameEngine.f5859cT = false;
                    if (!z2) {
                        if (z3) {
                            Unit unit = null;
                            if (m1788c == null) {
                                unit = m1913a(f4, f5, true);
                            }
                            m1894a(unit);
                        } else if (z4) {
                            Unit unit2 = null;
                            if (m1788c == null) {
                                unit2 = m1913a(f4, f5, false);
                            }
                            boolean z6 = false;
                            if (unit2 == null) {
                                z6 = true;
                            } else if (!m1892a(unit2, false, f4, f5, m1788c)) {
                                z6 = true;
                            }
                            if (z6) {
                                m1858c(f4, f5, m1788c);
                            }
                        }
                    } else {
                        Unit unit3 = null;
                        Unit unit4 = null;
                        if (m1788c == null) {
                            unit3 = m1913a(f4, f5, true);
                            unit4 = m1913a(f4, f5, false);
                        }
                        if (unit3 == null && unit4 == null) {
                            m1858c(f4, f5, m1788c);
                        } else if (unit4 != null) {
                            if (!m1892a(unit4, true, f4, f5, m1788c)) {
                                if (!unit4.mo1774t()) {
                                    m1894a(unit4);
                                } else if (unit3 != null) {
                                    m1894a(unit3);
                                }
                            }
                        } else {
                            m1894a(unit3);
                        }
                    }
                }
            }
        }
        if (this.f4672W == null && this.gameTouching && !this.f4774N && !this.f4765E && !this.f4691aT) {
            this.f4708ao.setStyle(Paint.Style.f216a);
            this.f4708ao.setStrokeWidth(1.0f);
            if (this.f4757r > 20.0f && m1923a()) {
                float m1873b = m1873b();
                this.f4708ao.m4717a(100, 0, 255, 0);
                gameEngine.graphics.mo219a(this.gameTouchLastX, this.gameTouchLastY, m1873b, this.f4708ao);
                this.f4708ao.setStyle(Paint.Style.f217b);
                this.f4708ao.setStrokeWidth(1.0f);
                this.f4708ao.m4717a(200, 0, 255, 0);
                gameEngine.graphics.mo219a(this.gameTouchLastX, this.gameTouchLastY, m1873b, this.f4708ao);
            }
        }
        if (gameEngine.f5938bk && gameEngine.m905Y() && gameEngine.m877aa() > 0) {
            Paint paint = new Paint();
            paint.setAlpha(100);
            for (int i = 0; i < gameEngine.m877aa(); i++) {
                gameEngine.graphics.mo137h();
                gameEngine.graphics.mo222a(0.7f, 0.7f, gameEngine.m849b(i), gameEngine.m841c(i));
                gameEngine.graphics.mo196a(this.f4791bg, gameEngine.m849b(i), gameEngine.m841c(i), paint);
                gameEngine.graphics.mo136i();
            }
        }
        if (!this.gameTouching) {
            this.f4757r = 0.0f;
            this.f4774N = false;
        }
        this.f4763C = this.gameTouching;
        gameEngine.m904Z();
    }

    /* renamed from: a */
    public void m1918a(float f, float f2, float f3, Point point) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f4692aX) {
            this.f4693aY = CommonUtils.m1744a(this.f4693aY, 1.0f, 0.05f * f);
            this.f4693aY = (float) (this.f4693aY + (0.08d * (1.0f - this.f4693aY)));
        } else {
            this.f4693aY = CommonUtils.m1744a(this.f4693aY, 0.0f, 0.3f * f);
        }
        this.f4692aX = false;
        if (this.f4672W != null) {
            if (this.f4672W.mo2698e() == EnumC0220u.f1451e) {
                m1898a(this.f4672W, false, (Unit) null, false);
                if (m1861b(false) || m1833m()) {
                    m1837k();
                    this.gameTouchClick = false;
                } else if (this.gameTouchClick && !this.f4774N && !m1835l()) {
                    Unit m1913a = m1913a(f2, f3, false);
                    if (m1913a != null && this.f4672W.mo3823o(m1913a)) {
                        m1865b(m1913a);
                        if (!m1883a(gameEngine)) {
                            m1837k();
                        }
                    } else {
                        m1920a(f2, f3, 0.0f);
                    }
                    this.gameTouchClick = false;
                }
            } else if (this.f4672W.mo2698e() == EnumC0220u.f1452f) {
                m1898a(this.f4672W, false, (Unit) null, false);
                if (m1861b(false) || m1833m()) {
                    m1837k();
                    this.gameTouchClick = false;
                } else if (this.gameTouchClick && !this.f4774N && !m1835l()) {
                    Unit m1913a2 = m1913a(f2, f3, true);
                    if (m1913a2 != null && this.f4672W.mo3823o(m1913a2)) {
                        m1850d(m1913a2);
                        if (!m1883a(gameEngine)) {
                            m1837k();
                        }
                    } else {
                        m1920a(f2, f3, 0.0f);
                    }
                    this.gameTouchClick = false;
                }
            } else if (this.f4672W.mo2698e() == EnumC0220u.f1450d) {
                m1898a(this.f4672W, false, (Unit) null, false);
                if (m1861b(false) || m1833m()) {
                    m1837k();
                    this.gameTouchClick = false;
                } else if (this.gameTouchClick && !this.f4774N && !m1835l()) {
                    m1871b(f2, f3);
                    m1837k();
                    this.gameTouchClick = false;
                }
            } else if (this.f4672W.mo2698e() == EnumC0220u.f1453g) {
                m1898a(this.f4672W, false, (Unit) null, false);
                Unit m2037f = this.battleInterface.m2037f();
                if (m2037f != null && (m2037f instanceof OrderableUnit)) {
                    gameEngine.graphics.mo137h();
                    gameEngine.m916N();
                    ((OrderableUnit) m2037f).mo2624a(this.f4672W);
                    gameEngine.graphics.mo136i();
                }
                if (m1861b(false) || m1833m()) {
                    m1837k();
                    this.gameTouchClick = false;
                } else if (this.gameTouchClick && !this.f4774N && !m1835l() && point == null) {
                    boolean z = false;
                    if (m1901a(this.f4672W, f2, f3)) {
                        z = true;
                    }
                    if (!z) {
                        m1866b(this.f4672W, f2, f3);
                        if (!m1883a(gameEngine)) {
                            m1837k();
                        }
                    } else {
                        m1920a(f2, f3, 0.0f);
                    }
                    this.gameTouchClick = false;
                }
            } else if (this.f4672W.mo2698e() == EnumC0220u.f1454h) {
                m1898a(this.f4672W, false, (Unit) null, false);
                if (m1861b(false) || m1833m()) {
                    m1837k();
                    this.gameTouchClick = false;
                } else if (this.gameTouchClick && !this.f4774N && !m1835l()) {
                    m1852d(f2, f3, point);
                    if (!m1883a(gameEngine)) {
                        m1837k();
                        this.gameTouchClick = false;
                    }
                }
            } else if (this.f4672W.mo2698e() == EnumC0220u.f1458l) {
                m1898a(this.f4672W, false, (Unit) null, false);
                if (m1861b(false) || m1833m()) {
                    m1837k();
                    this.gameTouchClick = false;
                } else if (this.gameTouchClick && !this.f4774N && !m1835l()) {
                    Unit m1913a3 = m1913a(f2, f3, true);
                    if (m1913a3 != null && this.f4672W.mo3823o(m1913a3)) {
                        m1848e(m1913a3);
                        m1837k();
                    } else {
                        m1920a(f2, f3, 0.0f);
                    }
                    this.gameTouchClick = false;
                }
            } else if (this.f4672W.mo2698e() == EnumC0220u.f1459m) {
                m1898a(this.f4672W, false, (Unit) null, false);
                if (m1861b(false) || m1833m()) {
                    m1837k();
                    this.gameTouchClick = false;
                } else if (this.gameTouchClick && !this.f4774N && !m1835l()) {
                    m1915a(f2, f3, point, this.f4707am == 0);
                    this.f4707am++;
                }
            } else if (this.f4672W.mo2698e() == EnumC0220u.f1456j) {
                m1898a(this.f4672W, false, (Unit) null, false);
                if (m1861b(false) || m1833m()) {
                    m1837k();
                    this.gameTouchClick = false;
                } else if (this.gameTouchClick && !this.f4774N && !m1835l() && point == null) {
                    if (this.f4672W instanceof C0209j) {
                        m1916a(f2, f3, point, (C0209j) this.f4672W);
                    } else {
                        GameEngine.log("orderBuildingSpecialAction is not a PingMapAction, it is: " + this.f4672W.getClass().getName());
                    }
                    m1837k();
                    this.gameTouchClick = false;
                }
            } else if (this.f4672W.mo2734i() != null && this.f4672W.mo2698e() == EnumC0220u.f1448b) {
                m1917a(f2, f3, point);
            }
        }
    }

    /* renamed from: a */
    public void m1917a(float f, float f2, Point point) {
        boolean z;
        Point m1813a;
        GameEngine gameEngine = GameEngine.getInstance();
        Unit m2037f = this.battleInterface.m2037f();
        boolean z2 = false;
        if (m2037f != null) {
            z2 = this.f4672W.isActive(m2037f, true) && !BattleInterface.m2063a(this.f4672W);
            if (!this.f4672W.isAvailable(m2037f)) {
                z2 = false;
            }
        }
        m1898a(this.f4672W, false, (Unit) null, !z2);
        float f3 = this.f4760u / gameEngine.viewpointZoom;
        float f4 = this.f4761v / gameEngine.viewpointZoom;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        if (GameEngine.isPC_() && gameEngine.curSettings.mouseSupport) {
            z3 = true;
            z6 = this.f4767G;
        }
        if (z3) {
            if (m1831n()) {
                if (!this.f4704aj) {
                    this.f4704aj = true;
                    this.f4702ah = f3 + gameEngine.viewpointX_rounded;
                    this.f4703ai = f4 + gameEngine.viewpointY_rounded;
                }
            } else {
                this.f4704aj = false;
            }
            if (this.f4704aj) {
                float f5 = f3 - (this.f4702ah - gameEngine.viewpointX_rounded);
                float f6 = f4 - (this.f4703ai - gameEngine.viewpointY_rounded);
                if (CommonUtils.absf(f5) > 4.0f || CommonUtils.absf(f6) > 4.0f) {
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
        if (GameEngine.isPC() && gameEngine.curSettings.mouseSupport) {
            z12 = true;
        }
        if (this.f4674Y && !z12) {
            if (z2) {
                if (!this.f4697ac && m1875a(true, false)) {
                    gameEngine.audio.m2411b(AudioEngine.f3862h, 0.5f);
                    this.gameTouchClick = false;
                    z7 = true;
                }
                if (m1875a(true, true)) {
                    gameEngine.audio.m2411b(AudioEngine.f3862h, 0.5f);
                    this.gameTouchClick = false;
                    z9 = true;
                }
            }
            if (m1875a(false, false)) {
                gameEngine.audio.m2411b(AudioEngine.f3863i, 0.7f);
                this.gameTouchClick = false;
                z8 = true;
            }
        }
        boolean z13 = false;
        if (GameEngine.isPC_() && gameEngine.curSettings.mouseSupport) {
            z13 = true;
        }
        if (this.gameTouchClick && !this.f4774N) {
            z13 = true;
        }
        if (GameEngine.isIOS()) {
            z5 = true;
            if (gameEngine.m877aa() == 2) {
                z13 = true;
                f3 = gameEngine.m849b(0) / gameEngine.viewpointZoom;
                f4 = gameEngine.m841c(0) / gameEngine.viewpointZoom;
                float m849b = gameEngine.m849b(1) / gameEngine.viewpointZoom;
                this.f4704aj = true;
                this.f4702ah = m849b;
                this.f4703ai = gameEngine.m841c(1) / gameEngine.viewpointZoom;
            } else if (this.gameTouchClick && !this.f4774N) {
                this.f4704aj = false;
            }
            if (this.f4704aj) {
                z4 = true;
            }
        }
        if (z13) {
            this.f4674Y = true;
            this.f4695aa = f3 * gameEngine.viewpointZoom;
            this.f4696ab = f4 * gameEngine.viewpointZoom;
            if (!m1921a(gameEngine.m876ab(), gameEngine.m875ac())) {
                this.f4674Y = false;
                z11 = false;
            }
        }
        float f7 = this.f4702ah;
        float f8 = this.f4703ai;
        if (z5) {
            f7 += gameEngine.viewpointX_rounded + gameEngine.f5875cq;
            f8 += gameEngine.viewpointY_rounded + gameEngine.f5876cr;
        }
        com.corrodinggames.rts.game.units.UnitType mo2734i = this.f4672W.mo2734i();
        int mo3816q = this.f4672W.mo3816q();
        boolean z14 = false;
        if (GameEngine.isPC_() && gameEngine.curSettings.mouseSupport && !gameEngine.f5955cJ.contains((int) this.f4760u, (int) this.f4761v)) {
            z14 = true;
        }
        Unit m3756c = Unit.m3756c(mo2734i);
        if ((m3756c == null || !(m3756c instanceof OrderableUnit)) && CustomUnitMetadata.frontCustomUnitMetadata != null) {
            m3756c = Unit.m3756c(CustomUnitMetadata.frontCustomUnitMetadata);
        }
        if (this.f4674Y && !z14) {
            OrderableUnit orderableUnit = (OrderableUnit) m3756c;
            gameEngine.map.m4134b((this.f4695aa / gameEngine.viewpointZoom) + gameEngine.viewpointX_rounded, (this.f4696ab / gameEngine.viewpointZoom) + gameEngine.viewpointY_rounded);
            orderableUnit.x = gameEngine.map.returnX;
            orderableUnit.y = gameEngine.map.returnY;
            if (mo2734i.mo3073p()) {
                z4 = false;
                if (C0718h.m1813a((int) orderableUnit.x, (int) orderableUnit.y, 3) != null) {
                    orderableUnit.x = m1813a.game;
                    orderableUnit.y = m1813a.y;
                }
            }
            if (!orderableUnit.mo2975bH()) {
                orderableUnit.direction = 0.0f;
            } else {
                orderableUnit.direction = -90.0f;
            }
            orderableUnit.x += orderableUnit.mo2897cV();
            orderableUnit.y += orderableUnit.mo2896cW();
            orderableUnit.mo2537b(this.f4671U.team);
            orderableUnit.upgrade(mo3816q);
            orderableUnit.f1621cg = true;
            String m2527b = orderableUnit.m2527b(false, gameEngine.playerTeam);
            if (C0661a.m2250a(gameEngine.playerTeam, orderableUnit, this.f4673X)) {
                m2527b = "{0}";
            }
            if (m1827p() == 1 && m2037f != null && (m2037f instanceof OrderableUnit)) {
                OrderableUnit orderableUnit2 = (OrderableUnit) m2037f;
                if (!orderableUnit2.mo2580aQ()) {
                    float distanceSq = CommonUtils.distanceSq(orderableUnit2.x, orderableUnit2.y, orderableUnit.x, orderableUnit.y);
                    float f9 = orderableUnit2.mo2723f(orderableUnit.getUnitType());
                    if (f9 > 800000.0f) {
                        z = true;
                    } else {
                        z = distanceSq <= f9 * f9;
                    }
                    if (!z) {
                        m2527b = "{0}";
                    }
                }
            }
            if (z4) {
            }
            Unit unit = null;
            if (m1827p() == 1) {
                unit = m2037f;
            }
            if (z2) {
                if (z4) {
                    if (GameEngine.isPC() || (GameEngine.isIOS() && gameEngine.m877aa() == 2)) {
                        gameEngine.graphics.mo221a(f3 * gameEngine.viewpointZoom, f4 * gameEngine.viewpointZoom, (f7 - gameEngine.viewpointX_rounded) * gameEngine.viewpointZoom, (f8 - gameEngine.viewpointY_rounded) * gameEngine.viewpointZoom, this.f4801bq);
                    } else {
                        gameEngine.graphics.mo221a((orderableUnit.x - gameEngine.viewpointX_rounded) * gameEngine.viewpointZoom, (orderableUnit.y - gameEngine.viewpointY_rounded) * gameEngine.viewpointZoom, (f7 - gameEngine.viewpointX_rounded) * gameEngine.viewpointZoom, (f8 - gameEngine.viewpointY_rounded) * gameEngine.viewpointZoom, this.f4801bq);
                    }
                    m2527b = null;
                    m1890a(orderableUnit, f7, f8, orderableUnit.x, orderableUnit.y, true, (ArrayList) null, unit);
                } else {
                    m1889a(orderableUnit, orderableUnit.x, orderableUnit.y, true, z6, unit);
                }
            }
            orderableUnit.upgrade(1);
            if (z11 && m1829o()) {
                this.gameTouchClick = false;
                if (m1883a(gameEngine)) {
                    z9 = true;
                    z10 = true;
                } else {
                    z7 = true;
                }
            }
            if (m1833m()) {
                this.gameTouchClick = false;
                z8 = true;
            }
            if (this.gameTouchClick && !this.f4774N) {
                float f10 = f4;
                float f11 = this.f4705ak;
                float f12 = this.f4706al;
                if (CommonUtils.absf(f11 - f3) < 15.0f && CommonUtils.absf(f12 - f10) < 15.0f && this.f4675Z != 0.0f) {
                    this.gameTouchClick = false;
                    gameEngine.audio.m2411b(AudioEngine.f3862h, 0.5f);
                    if (this.f4697ac) {
                        z9 = true;
                    } else {
                        z7 = true;
                    }
                }
                this.f4675Z = 80.0f;
                this.f4705ak = f3;
                this.f4706al = f4;
            }
            if ((z7 || z9) && z2) {
                if (m2527b != null) {
                    gameEngine.audio.m2411b(AudioEngine.f3866l, 0.7f);
                    if (m2527b != "{0}") {
                        String str = m2527b;
                        if (str == "{2}") {
                            str = this.f4732bv;
                        }
                        if (str == "{3}") {
                            str = this.f4733bw;
                        }
                        if (str == "{1}") {
                            str = this.f4731bu;
                        }
                        m1863b(str);
                    }
                } else {
                    float f13 = orderableUnit.x;
                    float f14 = orderableUnit.y;
                    ArrayList arrayList = new ArrayList();
                    if (z4) {
                        m1890a(orderableUnit, f7, f8, orderableUnit.x, orderableUnit.y, false, arrayList, (Unit) null);
                    } else {
                        arrayList.add(new PointF(f13, f14));
                    }
                    int i = 0;
                    boolean z15 = true;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        PointF pointF = (PointF) it.next();
                        if (this.f4672W.mo3587y()) {
                            C0678e m1818v = m1818v();
                            m1887a(m1818v);
                            m1818v.m2096a(this.f4672W.m3834L(), pointF, (Unit) null);
                        } else {
                            C0678e m1818v2 = m1818v();
                            if (z15) {
                                z15 = false;
                                if (z9) {
                                    if (!m1818v2.f4451e) {
                                        m1818v2.f4452f = true;
                                    }
                                    this.f4697ac = true;
                                }
                            } else {
                                m1818v2.f4451e = true;
                            }
                            OrderableUnit m1823r = m1823r();
                            if (this.f4672W instanceof C0206g) {
                                OrderableUnit orderableUnit3 = ((C0206g) this.f4672W).f1409b;
                                m1818v2.m2092a(orderableUnit3);
                                m1823r = orderableUnit3;
                            } else {
                                m1887a(m1818v2);
                            }
                            m1818v2.m2101a(pointF.x, pointF.y, mo2734i, mo3816q);
                            if (m1823r != null) {
                                C0661a c0661a = new C0661a();
                                c0661a.f4218d = mo2734i;
                                c0661a.f4220g = pointF.x;
                                c0661a.f4221h = pointF.y;
                                c0661a.f4227n = true;
                                c0661a.f4228o = m1823r;
                                c0661a.f4219e = gameEngine.playerTeam;
                                c0661a.f4241f = mo3816q;
                                c0661a.f4223j = gameEngine.playerTeam;
                                c0661a.f4229r = this.f4673X;
                                c0661a.f4230s = 1.0f + (0.15f * i);
                                if (m1823r.m2549au() >= 29) {
                                    c0661a.f4243q = true;
                                }
                            }
                            i++;
                        }
                    }
                    this.f4779aO = 5.0f;
                    if (GameEngine.isPC_()) {
                        this.f4779aO = 1.0f;
                    }
                    this.f4704aj = false;
                    if (!z9) {
                        if (i > 0) {
                            boolean z16 = true;
                            if (orderableUnit != null && !m1826p(orderableUnit)) {
                                z16 = false;
                            }
                            this.f4672W = null;
                            this.f4674Y = false;
                            this.f4697ac = false;
                            this.f4671U = null;
                            if (z16) {
                                m1817w();
                            }
                            this.f4673X++;
                        }
                    } else if (!z10) {
                        float f15 = orderableUnit.x;
                        float f16 = orderableUnit.y;
                        boolean z17 = false;
                        if (CommonUtils.absf(f15 - this.f4698ad) < (orderableUnit.mo2973cb().width() * gameEngine.map.pixel_Width * 2.0f) + (3 * gameEngine.map.pixel_Width) && CommonUtils.absf(f16 - this.f4699ae) < (orderableUnit.mo2973cb().height() * gameEngine.map.pixel_Height * 2.0f) + (3 * gameEngine.map.pixel_Height)) {
                            this.f4700af = f15 - this.f4698ad;
                            this.f4701ag = f16 - this.f4699ae;
                            if (CommonUtils.absf(this.f4700af) > CommonUtils.absf(this.f4701ag)) {
                                this.f4701ag = 0.0f;
                            } else {
                                this.f4700af = 0.0f;
                            }
                        }
                        if (orderableUnit.mo2973cb().height() > orderableUnit.mo2973cb().width() + 1) {
                            this.f4701ag = 0.0f;
                        }
                        this.f4698ad = f15;
                        this.f4699ae = f16;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        if (this.f4701ag < 0.0f) {
                            f17 = -1.0f;
                        }
                        if (this.f4700af < 0.0f) {
                            f18 = -1.0f;
                        }
                        if (this.f4701ag > 0.0f) {
                            f17 = 1.0f;
                        }
                        if (this.f4700af > 0.0f) {
                            f18 = 1.0f;
                        }
                        if (f18 == 0.0f && f17 == 0.0f) {
                            f18 = 1.0f;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        float f19 = f15 + (200.0f * f18);
                        float f20 = f16 + (200.0f * f17);
                        float f21 = (-orderableUnit.mo2897cV()) + 1.0f;
                        float f22 = (-orderableUnit.mo2896cW()) + 1.0f;
                        m1890a(orderableUnit, f15 + f21, f16 + f22, f19 + f21, f20 + f22, false, arrayList2, (Unit) null);
                        if (arrayList2.size() > 0) {
                            orderableUnit.x = ((PointF) arrayList2.get(0)).x;
                            orderableUnit.y = ((PointF) arrayList2.get(0)).y;
                            z17 = true;
                        }
                        if (!z17) {
                            m1890a(orderableUnit, f15 + f21, f16 + f22, f15 + (200.0f * (-f18)) + f21, f16 + (200.0f * (-f17)) + f22, false, arrayList2, (Unit) null);
                            if (arrayList2.size() > 0) {
                                orderableUnit.x = ((PointF) arrayList2.get(0)).x;
                                orderableUnit.y = ((PointF) arrayList2.get(0)).y;
                                z17 = true;
                            }
                        }
                        if (!z17) {
                            orderableUnit.x += 3 * gameEngine.map.pixel_Width;
                            orderableUnit.y += gameEngine.map.pixel_Width;
                        }
                        if (z17) {
                            float f23 = orderableUnit.x - f15;
                            float f24 = orderableUnit.y - f16;
                            float f25 = gameEngine.f5882cx;
                            float f26 = gameEngine.f5883cy;
                            gameEngine.f5875cq += f23;
                            gameEngine.f5876cr += f24;
                            gameEngine.f5882cx += gameEngine.f5875cq;
                            gameEngine.f5883cy += gameEngine.f5876cr;
                            float f27 = gameEngine.f5882cx;
                            float f28 = gameEngine.f5883cy;
                            gameEngine.m917M();
                            gameEngine.f5875cq += gameEngine.f5882cx - f27;
                            gameEngine.f5876cr += gameEngine.f5883cy - f28;
                            float f29 = (f25 + f23) - gameEngine.f5882cx;
                            float f30 = (f26 + f24) - gameEngine.f5883cy;
                            if (CommonUtils.absf(f29) > 1.0f) {
                                this.f4695aa += f29 * gameEngine.viewpointZoom;
                            }
                            if (CommonUtils.absf(f30) > 1.0f) {
                                this.f4696ab += f30 * gameEngine.viewpointZoom;
                            }
                            gameEngine.f5882cx -= gameEngine.f5875cq;
                            gameEngine.f5883cy -= gameEngine.f5876cr;
                        }
                    }
                }
            }
            if (z8) {
                m1837k();
                if (this.f4697ac) {
                    m1817w();
                }
            }
        }
    }

    /* renamed from: l */
    public boolean m1835l() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (GameEngine.isPC_() && gameEngine.curSettings.mouseSupport && !m1833m() && !m1829o()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m1833m() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (GameEngine.isPC_() && gameEngine.curSettings.mouseSupport && this.gameTouchClick && !this.f4774N && !this.f4691aT) {
            int i = 1;
            int i2 = 2;
            if (gameEngine.curSettings.mousePlacement == 2) {
                i = 2;
                i2 = 1;
            }
            if (gameEngine.m828e(i)) {
            }
            if (gameEngine.m828e(i2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m1831n() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!GameEngine.isPC() || !gameEngine.curSettings.mouseSupport) {
            return false;
        }
        if (this.gameTouchClick || this.gameTouching) {
            int i = 1;
            int i2 = 2;
            if (gameEngine.curSettings.mousePlacement == 2) {
                i = 2;
                i2 = 1;
            }
            if (gameEngine.m828e(i)) {
                return true;
            }
            if (gameEngine.m828e(i2)) {
            }
            return false;
        }
        return false;
    }

    /* renamed from: o */
    public boolean m1829o() {
        if (this.gameTouchClick && !this.f4774N && !this.f4691aT) {
            return m1831n();
        }
        return false;
    }

    /* renamed from: a */
    public void m1894a(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (unit != null && this.f4667Q == unit && this.f4668R < 40.0f && !m1864b(gameEngine)) {
            if (!m1883a(gameEngine)) {
                m1817w();
            }
            m1842h(unit);
        } else if (unit != null) {
            if (!m1883a(gameEngine) && !m1864b(gameEngine)) {
                m1817w();
            }
            m1893a(unit, m1864b(gameEngine));
            this.f4667Q = unit;
            this.f4668R = 0.0f;
        }
    }

    /* renamed from: a */
    public boolean m1892a(Unit unit, boolean z, float f, float f2, Point point) {
        GameEngine.getInstance();
        Team m1825q = m1825q();
        boolean m3925c = m1825q.m3925c(unit.team);
        if (m3925c && m1814z() && m1824q(unit)) {
            m1856c(unit);
            return true;
        }
        if (m1825q.m3913d(unit.team) && ((unit.hp < unit.maxHp || unit.built < 1.0f) && m1827p() != 0)) {
            boolean z2 = true;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            if (unit.mo2823cp() && m1830n(unit)) {
                z3 = true;
            }
            Iterator it = this.f4809bJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GameObject gameObject = (GameObject) it.next();
                if (gameObject instanceof OrderableUnit) {
                    OrderableUnit orderableUnit = (OrderableUnit) gameObject;
                    if (!orderableUnit.selected) {
                        continue;
                    } else if (!m1832m(orderableUnit)) {
                        z2 = false;
                        break;
                    } else if (!orderableUnit.mo2621a(unit)) {
                        z2 = false;
                        break;
                    } else {
                        if (orderableUnit.mo2579aR()) {
                            z5 = true;
                        }
                        Waypoint activeWaypoint = orderableUnit.getActiveWaypoint();
                        if (activeWaypoint != null && activeWaypoint.getType() == WaypointType.f1754d) {
                            z4 = true;
                        }
                    }
                }
            }
            if (z2 && (!z4 || !z3)) {
                if (z5) {
                    m1850d(unit);
                    return true;
                }
                m1850d(unit);
                return true;
            }
        }
        if (unit.mo2862g() > 0.0f && m1827p() != 0) {
            boolean z6 = true;
            Iterator it2 = GameObject.fastGameObjectList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                GameObject gameObject2 = (GameObject) it2.next();
                if (gameObject2 instanceof OrderableUnit) {
                    OrderableUnit orderableUnit2 = (OrderableUnit) gameObject2;
                    if (orderableUnit2.selected) {
                        if (!m1832m(orderableUnit2)) {
                            z6 = false;
                            break;
                        } else if (!orderableUnit2.mo3232D(unit)) {
                            z6 = false;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (z6) {
                m1865b(unit);
                return true;
            }
        }
        if (unit.mo2823cp() && m1830n(unit)) {
            m1846f(unit);
            return true;
        } else if (GameEngine.isPC() && m1931A() && m1828o(unit)) {
            m1844g(unit);
            return true;
        } else {
            boolean z7 = false;
            if ((!z || unit.mo1774t()) && !m1825q.m3925c(unit.team)) {
                if (unit.mo2975bH()) {
                    if (unit.mo2974ca().m4667a()) {
                        z7 = true;
                    }
                } else if (!unit.collidable) {
                    z7 = true;
                }
                if (!z7 && !unit.mo2676i() && m1930B()) {
                    z7 = true;
                }
            }
            if (!z7 && m3925c && m1814z()) {
                m1920a(unit.x, unit.y, unit.height);
                return true;
            }
            return false;
        }
    }

    /* renamed from: p */
    public int m1827p() {
        return this.numberOfSelectedUnits;
    }

    /* renamed from: a */
    void m1887a(C0678e c0678e) {
        Iterator it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject gameObject = (GameObject) it.next();
            if (gameObject instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) gameObject;
                if (orderableUnit.selected && m1832m(orderableUnit)) {
                    c0678e.m2092a(orderableUnit);
                }
            }
        }
    }

    /* renamed from: q */
    public Team m1825q() {
        GameEngine gameEngine = GameEngine.getInstance();
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.team == gameEngine.playerTeam) {
                    return orderableUnit.team;
                }
            }
        }
        Iterator it2 = this.f4809bJ.iterator();
        while (it2.hasNext()) {
            Unit unit2 = (Unit) it2.next();
            if (unit2 instanceof OrderableUnit) {
                OrderableUnit orderableUnit2 = (OrderableUnit) unit2;
                if (m1832m(orderableUnit2)) {
                    return orderableUnit2.team;
                }
            }
        }
        return gameEngine.playerTeam;
    }

    /* renamed from: r */
    public OrderableUnit m1823r() {
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (m1832m(orderableUnit)) {
                    return orderableUnit;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1886a(C0678e c0678e, C0202c c0202c, boolean z) {
        Action a;
        OrderableUnit orderableUnit = null;
        int i = -99;
        Iterator it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject gameObject = (GameObject) it.next();
            if (gameObject instanceof OrderableUnit) {
                OrderableUnit orderableUnit2 = (OrderableUnit) gameObject;
                if (orderableUnit2.selected && m1832m(orderableUnit2) && (a = orderableUnit2.mo3219a(c0202c)) != null && a.isAvailable(orderableUnit2) && (a.isActive((Unit) orderableUnit2, true) || z)) {
                    int i2 = 0;
                    if (orderableUnit2 instanceof AbstractC0483l) {
                        i2 = ((AbstractC0483l) orderableUnit2).mo2915a(c0202c, true);
                        if (orderableUnit != null) {
                            if (!z) {
                                if (i2 >= i) {
                                    break;
                                }
                            } else if (i2 <= i) {
                                break;
                            }
                        }
                    }
                    orderableUnit = orderableUnit2;
                    i = i2;
                }
            }
        }
        if (orderableUnit != null) {
            c0678e.m2092a(orderableUnit);
        }
    }

    /* renamed from: a */
    boolean m1901a(Action action, float f, float f2) {
        Action a;
        if (action instanceof C0206g) {
            C0206g c0206g = (C0206g) action;
            OrderableUnit orderableUnit = c0206g.f1409b;
            Action m3849m_ = c0206g.m3849m_();
            boolean z = false;
            if (m3849m_.isAvailable(orderableUnit) && m3849m_.isActive((Unit) orderableUnit, true) && !orderableUnit.mo2623a(m3849m_, f, f2)) {
                z = true;
            }
            return z;
        }
        boolean z2 = false;
        Iterator it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject gameObject = (GameObject) it.next();
            if (gameObject instanceof OrderableUnit) {
                OrderableUnit orderableUnit2 = (OrderableUnit) gameObject;
                if (orderableUnit2.selected && m1832m(orderableUnit2) && (a = orderableUnit2.mo3219a(action.m3834L())) != null && a.isAvailable(orderableUnit2) && a.isActive((Unit) orderableUnit2, true)) {
                    if (!orderableUnit2.mo2623a(a, f, f2)) {
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
    public void m1885a(C0678e c0678e, Action action) {
        Action a;
        if (action instanceof C0206g) {
            c0678e.m2092a(((C0206g) action).f1409b);
            return;
        }
        C0202c m3834L = action.m3834L();
        Iterator it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject gameObject = (GameObject) it.next();
            if (gameObject instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) gameObject;
                if (orderableUnit.selected && m1832m(orderableUnit) && (a = orderableUnit.mo3219a(m3834L)) != null && a.isAvailable(orderableUnit)) {
                    c0678e.m2092a(orderableUnit);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m1899a(Action action, boolean z) {
        Action a;
        if (action instanceof C0206g) {
            C0206g c0206g = (C0206g) action;
            return c0206g.isActive((Unit) c0206g.f1409b, true);
        }
        C0202c m3834L = action.m3834L();
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.selected && m1832m(orderableUnit) && (a = orderableUnit.mo3219a(m3834L)) != null && a.isActive(orderableUnit, z)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1902a(Action action) {
        Action a;
        C0202c m3834L = action.m3834L();
        if (action.mo3806l_()) {
            return false;
        }
        if (action instanceof C0206g) {
            C0206g c0206g = (C0206g) action;
            return c0206g.mo2732a((Unit) c0206g.f1409b);
        }
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.selected && m1832m(orderableUnit) && (a = orderableUnit.mo3219a(m3834L)) != null && a.mo2732a((Unit) orderableUnit)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m1867b(Action action) {
        Action a;
        if (action instanceof C0206g) {
            C0206g c0206g = (C0206g) action;
            return c0206g.isAvailable(c0206g.f1409b);
        }
        C0202c m3834L = action.m3834L();
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.selected && m1832m(orderableUnit) && (a = orderableUnit.mo3219a(m3834L)) != null && a.isAvailable(orderableUnit)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m1857c(Action action) {
        Action a;
        boolean z = false;
        if (action instanceof C0206g) {
            C0206g c0206g = (C0206g) action;
            return c0206g.mo3603g(c0206g.f1409b);
        }
        C0202c m3834L = action.m3834L();
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.selected && m1832m(orderableUnit) && (a = orderableUnit.mo3219a(m3834L)) != null) {
                    if (!a.mo3603g(orderableUnit)) {
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
    public String m1851d(Action action) {
        Action a;
        String mo3600j;
        if (action instanceof C0206g) {
            C0206g c0206g = (C0206g) action;
            return c0206g.mo3600j(c0206g.f1409b);
        }
        C0202c m3834L = action.m3834L();
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.selected && m1832m(orderableUnit) && (a = orderableUnit.mo3219a(m3834L)) != null && a.mo3603g(orderableUnit) && (mo3600j = a.mo3600j(orderableUnit)) != null) {
                    return mo3600j;
                }
            }
        }
        return null;
    }

    /* renamed from: s */
    public boolean m1821s() {
        if (this.numberOfSelectedUnits == 0) {
            return false;
        }
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (!orderableUnit.selected) {
                    continue;
                } else if (!m1832m(orderableUnit)) {
                    return false;
                } else {
                    ArrayList M = orderableUnit.mo2712M();
                    boolean z = false;
                    if (M != null) {
                        Iterator it2 = M.iterator();
                        while (it2.hasNext()) {
                            if (((Action) it2.next()).mo2698e() == EnumC0220u.f1450d) {
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
    public boolean m1896a(EnumC0226aa enumC0226aa) {
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (m1832m(orderableUnit) && m1895a(enumC0226aa, orderableUnit)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1895a(EnumC0226aa enumC0226aa, Unit unit) {
        if (unit instanceof OrderableUnit) {
            OrderableUnit orderableUnit = (OrderableUnit) unit;
            if ((enumC0226aa == EnumC0226aa.f1470a || enumC0226aa == EnumC0226aa.f1471b) && !GameEngine.m897a(this.f4807bF, 1000L)) {
                return true;
            }
            if (enumC0226aa == EnumC0226aa.f1472c) {
                if (GameEngine.getInstance().frameNumber < 10) {
                    return false;
                }
                if (!GameEngine.m897a(this.f4808bG, 1000L)) {
                    return true;
                }
            }
            if (orderableUnit.mo2622a(enumC0226aa)) {
                if (enumC0226aa == EnumC0226aa.f1470a || enumC0226aa == EnumC0226aa.f1471b) {
                    this.f4807bF = GameEngine.curTimeMs();
                }
                if (enumC0226aa == EnumC0226aa.f1472c) {
                    this.f4808bG = GameEngine.curTimeMs();
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public void m1869b(float f, float f2, Point point) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!m1931A()) {
            if (gameEngine.curSettings.quickRally && m1821s()) {
                m1871b(f, f2);
                return;
            }
            return;
        }
        C0678e m1818v = m1818v();
        m1818v.f4454h = true;
        m1818v.m2102a(f, f2);
        m1887a(m1818v);
        if (!m1896a(EnumC0226aa.f1471b)) {
            gameEngine.audio.m2411b(AudioEngine.f3860f, 0.2f);
        }
        EffectObject m2228a = gameEngine.effects.m2228a(f, f2, 0.0f, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a != null) {
            m2228a.frameIndex = 8;
            m2228a.timer = 30.0f;
            m2228a.startTimer = m2228a.timer;
            m2228a.fadeOut = true;
            m2228a.startingAlpha = 2.0f;
            m2228a.f4287H = 2.8f * m1860c();
            m2228a.f4286G = 1.6f * m1860c();
            m2228a.f4288I = true;
        }
        if (point != null) {
            Point m1791b = gameEngine.f5836bW.m1791b(point.game, point.y);
            EffectObject m2228a2 = gameEngine.effects.m2228a(m1791b.game, m1791b.y, 0.0f, EffectType.f4274a, true, EnumC0668h.f4401e);
            if (m2228a2 != null) {
                m2228a2.f4328o = true;
                m2228a2.frameIndex = 8;
                m2228a2.timer = 35.0f;
                m2228a2.startTimer = m2228a.timer;
                m2228a2.fadeOut = true;
                m2228a2.startingAlpha = 2.0f;
                m2228a2.f4287H = 1.3f;
                m2228a2.f4286G = 0.6f;
            }
        }
    }

    /* renamed from: c */
    public void m1858c(float f, float f2, Point point) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f4740y && gameEngine.curSettings.doubleClickToAttackMove && m1814z() && m1931A()) {
            m1852d(f, f2, point);
        } else {
            m1869b(f, f2, point);
        }
    }

    /* renamed from: d */
    public void m1852d(float f, float f2, Point point) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0678e m1818v = m1818v();
        m1818v.f4454h = true;
        m1818v.m2087b(f, f2);
        m1887a(m1818v);
        if (!m1896a(EnumC0226aa.f1471b)) {
            gameEngine.audio.m2411b(AudioEngine.f3860f, 0.2f);
        }
        EffectObject m2228a = gameEngine.effects.m2228a(f, f2, 0.0f, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a != null) {
            m2228a.stripIndex = 17;
            m2228a.frameIndex = 2;
            m2228a.timer = 30.0f;
            m2228a.startTimer = m2228a.timer;
            m2228a.fadeOut = true;
            m2228a.startingAlpha = 2.0f;
            m2228a.f4305Z = 1.0f;
            m2228a.f4287H = 1.9f * m1860c();
            m2228a.f4286G = 3.5f * m1860c();
            m2228a.f4288I = true;
        }
        if (point != null) {
            Point m1791b = gameEngine.f5836bW.m1791b(point.game, point.y);
            EffectObject m2228a2 = gameEngine.effects.m2228a(m1791b.game, m1791b.y, 0.0f, EffectType.f4274a, true, EnumC0668h.f4401e);
            if (m2228a2 != null) {
                m2228a2.f4328o = true;
                m2228a2.frameIndex = 9;
                m2228a2.timer = 35.0f;
                m2228a2.startTimer = m2228a.timer;
                m2228a2.fadeOut = true;
                m2228a2.startingAlpha = 2.0f;
                m2228a2.f4287H = 1.3f;
                m2228a2.f4286G = 0.6f;
            }
        }
    }

    /* renamed from: t */
    public void m1820t() {
        GameEngine gameEngine = GameEngine.getInstance();
        C0678e m1818v = m1818v();
        m1818v.m2075h();
        m1887a(m1818v);
        gameEngine.audio.m2411b(AudioEngine.f3860f, 0.2f);
    }

    /* renamed from: a */
    public void m1900a(Action action, PointF pointF, Unit unit, C0678e c0678e) {
        if (action instanceof C0330g) {
            C0330g c0330g = (C0330g) action;
            GameEngine.getInstance();
        }
    }

    /* renamed from: b */
    public void m1866b(Action action, float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        PointF pointF = new PointF(f, f2);
        C0678e m1818v = m1818v();
        if (!action.mo3613G()) {
            m1885a(m1818v, action);
        } else {
            m1886a(m1818v, action.m3834L(), false);
        }
        m1818v.m2096a(action.m3834L(), pointF, (Unit) null);
        m1900a(action, pointF, (Unit) null, m1818v);
        gameEngine.audio.m2411b(AudioEngine.f3860f, 0.2f);
        EffectObject m2228a = gameEngine.effects.m2228a(f, f2, 0.0f, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a != null) {
            m2228a.frameIndex = 9;
            m2228a.timer = 60.0f;
            m2228a.startTimer = m2228a.timer;
            m2228a.fadeOut = true;
            m2228a.startingAlpha = 2.0f;
            m2228a.f4287H = 3.8f * m1860c();
            m2228a.f4286G = 2.0f * m1860c();
            m2228a.f4288I = true;
            m2228a.f4305Z = 1.5f;
        }
    }

    /* renamed from: b */
    public void m1865b(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0678e m1818v = m1818v();
        m1887a(m1818v);
        m1818v.m2081d(unit);
        gameEngine.audio.m2411b(AudioEngine.f3860f, 0.2f);
        EffectObject m2228a = gameEngine.effects.m2228a(unit.x, unit.y, unit.height, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a != null) {
            m2228a.frameIndex = 12;
            m2228a.timer = 25.0f;
            m2228a.startTimer = m2228a.timer;
            m2228a.fadeOut = true;
            m2228a.startingAlpha = 2.0f;
            m2228a.f4288I = true;
            m2228a.f4287H = 1.2f * m1860c();
            m2228a.f4286G = 1.8f * m1860c();
        }
    }

    /* renamed from: b */
    public void m1871b(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0678e m1819u = m1819u();
        m1887a(m1819u);
        m1819u.m2099a(new PointF(f, f2));
        gameEngine.audio.m2411b(AudioEngine.f3860f, 0.2f);
        EffectObject m2228a = gameEngine.effects.m2228a(f, f2, 0.0f, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a != null) {
            m2228a.frameIndex = 8;
            m2228a.timer = 65.0f;
            m2228a.startTimer = m2228a.timer;
            m2228a.fadeOut = true;
            m2228a.startingAlpha = 2.0f;
            m2228a.f4288I = true;
            m2228a.f4305Z = 2.0f;
            m2228a.f4287H = 2.0f * m1860c();
            m2228a.f4286G = 1.5f * m1860c();
        }
    }

    /* renamed from: a */
    public void m1916a(float f, float f2, Point point, C0209j c0209j) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!gameEngine.curSettings.showMapPingsOnBattlefield && !gameEngine.curSettings.showMapPingsOnMinimap) {
            m1879a("Cannot send map ping, you have disabled both battlefield and minimap pings in your settings");
            return;
        }
        m1818v().m2096a(c0209j.m3834L(), new PointF(f, f2), (Unit) null);
        if (this.f4720bH == 0 || this.f4720bH + 15000 < System.currentTimeMillis()) {
            this.f4720bH = System.currentTimeMillis();
            gameEngine.networkEngine.m1370j("MAP PING - [i:" + c0209j.m3846I() + "]");
        }
    }

    /* renamed from: a */
    public void m1914a(float f, float f2, Team team, C0209j c0209j) {
        EffectObject m2228a;
        GameEngine gameEngine = GameEngine.getInstance();
        int ordinal = 7 + c0209j.f1417a.ordinal();
        if (!gameEngine.curSettings.showMapPingsOnBattlefield && !gameEngine.curSettings.showMapPingsOnMinimap) {
            if (!this.f4721bI && !gameEngine.replayEngine.isPlaying()) {
                this.f4721bI = true;
                this.messageInterface.m1810a(null, "[WARNING: A player send a map ping, but you have disabled both battlefield and minimap pings in your settings]");
                return;
            }
            return;
        }
        if (gameEngine.curSettings.showMapPingsOnBattlefield) {
            EffectObject m2228a2 = gameEngine.effects.m2228a(f, f2, 0.0f, EffectType.f4274a, true, EnumC0668h.f4401e);
            if (m2228a2 != null) {
                m2228a2.stripIndex = 9;
                m2228a2.frameIndex = 6;
                m2228a2.startingAlpha = 0.7f;
                m2228a2.timer = 490.0f;
                m2228a2.startTimer = m2228a2.timer;
                m2228a2.fadeOut = true;
                m2228a2.f4299T = 6.0f;
                m2228a2.f4300U = 60.0f;
                m2228a2.f4290K -= m2228a2.f4299T;
                m2228a2.f4287H = 2.0f * 1.0f;
                m2228a2.f4286G = m2228a2.f4287H;
                m2228a2.f4356an = -0.5f;
                m2228a2.f4288I = true;
                if (team != null) {
                    m2228a2.f4336y = team.m3983E();
                    if (GameEngine.isNonDedicatedServer()) {
                        m2228a2.lightingColorFilter = new LightingColorFilter(m2228a2.f4336y, 0);
                    }
                }
            }
            if (ordinal != -1 && (m2228a = gameEngine.effects.m2228a(f, f2, 0.0f, EffectType.f4274a, true, EnumC0668h.f4401e)) != null) {
                m2228a.stripIndex = 9;
                m2228a.frameIndex = ordinal;
                m2228a.timer = 490.0f;
                m2228a.startTimer = m2228a.timer;
                m2228a.fadeOut = true;
                m2228a.startingAlpha = 1.2f;
                m2228a.f4299T = 6.0f;
                m2228a.f4300U = 60.0f;
                m2228a.f4290K -= m2228a.f4299T;
                m2228a.f4287H = 2.0f * 1.0f;
                m2228a.f4286G = m2228a.f4287H;
                m2228a.f4356an = -0.7f;
                m2228a.f4288I = true;
            }
        }
        if (gameEngine.curSettings.showMapPingsOnMinimap) {
            Point m1791b = gameEngine.f5836bW.m1791b(f, f2);
            EffectObject m2228a3 = gameEngine.effects.m2228a(m1791b.game, m1791b.y, 0.0f, EffectType.f4274a, true, EnumC0668h.f4401e);
            if (m2228a3 != null) {
                m2228a3.f4328o = true;
                m2228a3.stripIndex = 9;
                m2228a3.frameIndex = 6;
                m2228a3.startingAlpha = 0.8f;
                m2228a3.timer = 470.0f;
                m2228a3.startTimer = m2228a3.timer;
                m2228a3.fadeOut = true;
                m2228a3.f4290K -= 2.0f;
                m2228a3.f4299T = 2.0f;
                m2228a3.f4300U = 60.0f;
                m2228a3.f4356an = -0.5f;
                if (team != null) {
                    m2228a3.f4336y = team.m3983E();
                    if (GameEngine.isNonDedicatedServer()) {
                        m2228a3.lightingColorFilter = new LightingColorFilter(m2228a3.f4336y, 0);
                    }
                }
                m2228a3.f4287H = 1.0f;
                m2228a3.f4286G = 1.0f;
            }
            EffectObject m2228a4 = gameEngine.effects.m2228a(m1791b.game, m1791b.y, 0.0f, EffectType.f4274a, true, EnumC0668h.f4401e);
            if (m2228a4 != null) {
                m2228a4.f4328o = true;
                m2228a4.stripIndex = 9;
                m2228a4.frameIndex = ordinal;
                m2228a4.timer = 470.0f;
                m2228a4.startTimer = m2228a4.timer;
                m2228a4.fadeOut = true;
                m2228a4.startingAlpha = 0.8f;
                m2228a4.f4290K -= 2.0f;
                m2228a4.f4299T = 2.0f;
                m2228a4.f4300U = 60.0f;
                if (team != null) {
                }
                m2228a4.f4287H = 1.0f;
                m2228a4.f4286G = 1.0f;
                m2228a4.f4356an = -0.7f;
            }
        }
    }

    /* renamed from: u */
    public C0678e m1819u() {
        GameEngine gameEngine = GameEngine.getInstance();
        C0678e m2259b = gameEngine.f5867cf.m2259b(gameEngine.playerTeam);
        if (gameEngine.networkEngine.networked) {
            m2259b.f4443p = gameEngine.playerTeam;
        }
        return m2259b;
    }

    /* renamed from: v */
    public C0678e m1818v() {
        GameEngine gameEngine = GameEngine.getInstance();
        C0678e m1819u = m1819u();
        if (m1883a(gameEngine)) {
            m1819u.f4451e = true;
        }
        return m1819u;
    }

    /* renamed from: c */
    public void m1856c(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0678e m1818v = m1818v();
        m1818v.m2094a(unit);
        m1887a(m1818v);
        if (!m1896a(EnumC0226aa.f1470a)) {
            gameEngine.audio.m2411b(AudioEngine.f3858d, 1.0f);
        }
        EffectObject m2228a = gameEngine.effects.m2228a(unit.x, unit.y, unit.height, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a != null) {
            m2228a.f4324b = unit;
            m2228a.f4289J = 0.0f;
            m2228a.f4290K = 0.0f;
            m2228a.f4291L = 0.0f;
            m2228a.frameIndex = 9;
            m2228a.timer = 35.0f;
            m2228a.startTimer = m2228a.timer;
            m2228a.fadeOut = true;
            m2228a.startingAlpha = 1.5f;
            m2228a.f4288I = true;
            m2228a.f4305Z = 0.8f;
            m2228a.f4287H = 1.9f * m1860c();
            m2228a.f4286G = 3.3f * m1860c();
        }
        EffectObject m2228a2 = gameEngine.effects.m2228a(unit.x, unit.y, unit.height, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a2 != null) {
            m2228a2.f4324b = unit;
            m2228a2.f4289J = 0.0f;
            m2228a2.f4290K = 0.0f;
            m2228a2.f4291L = 0.0f;
            m2228a2.stripIndex = 17;
            m2228a2.frameIndex = 0;
            m2228a2.timer = 25.0f;
            m2228a2.startTimer = m2228a2.timer;
            m2228a2.fadeOut = true;
            m2228a2.startingAlpha = 1.0f;
            m2228a2.f4288I = true;
            m2228a2.f4305Z = 0.8f;
            m2228a2.f4287H = 2.2f * m1860c();
            m2228a2.f4286G = 1.1f * m1860c();
        }
    }

    /* renamed from: d */
    public void m1850d(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0678e m1818v = m1818v();
        m1887a(m1818v);
        m1818v.m2086b(unit);
        gameEngine.audio.m2411b(AudioEngine.f3858d, 1.0f);
        EffectObject m2228a = gameEngine.effects.m2228a(unit.x, unit.y, unit.height, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a != null) {
            m2228a.frameIndex = 10;
            m2228a.timer = 35.0f;
            m2228a.startTimer = m2228a.timer;
            m2228a.fadeOut = true;
            m2228a.startingAlpha = 2.0f;
            m2228a.f4288I = true;
            m2228a.f4287H = 1.5f * m1860c();
            m2228a.f4286G = 2.2f * m1860c();
        }
    }

    /* renamed from: e */
    public void m1848e(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0678e m1818v = m1818v();
        m1887a(m1818v);
        m1818v.m2083c(unit);
        gameEngine.audio.m2411b(AudioEngine.f3858d, 1.0f);
        EffectObject m2228a = gameEngine.effects.m2228a(unit.x, unit.y, unit.height, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a != null) {
            m2228a.stripIndex = 17;
            m2228a.frameIndex = 1;
            m2228a.timer = 40.0f;
            m2228a.startTimer = m2228a.timer;
            m2228a.fadeOut = true;
            m2228a.startingAlpha = 1.0f;
            m2228a.f4288I = true;
            m2228a.f4305Z = 0.0f;
            m2228a.f4287H = 1.2f * m1860c();
            m2228a.f4286G = 1.9f * m1860c();
        }
    }

    /* renamed from: a */
    public void m1920a(float f, float f2, float f3) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.audio.m2411b(AudioEngine.f3866l, 0.2f);
        EffectObject m2228a = gameEngine.effects.m2228a(f, f2, f3, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a != null) {
            m2228a.stripIndex = 9;
            m2228a.frameIndex = 14;
            m2228a.timer = 10.0f;
            m2228a.startTimer = m2228a.timer;
            m2228a.fadeOut = true;
            m2228a.startingAlpha = 2.0f;
            m2228a.f4305Z = 0.0f;
            m2228a.f4287H = 1.1f * m1860c();
            m2228a.f4286G = 1.6f * m1860c();
            m2228a.f4288I = true;
        }
    }

    /* renamed from: a */
    public void m1915a(float f, float f2, Point point, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0678e m1818v = m1818v();
        m1887a(m1818v);
        m1818v.m2084c(f, f2);
        if (!z) {
            m1818v.f4451e = true;
        }
        gameEngine.audio.m2411b(AudioEngine.f3860f, 0.2f);
        EffectObject m2228a = gameEngine.effects.m2228a(f, f2, 0.0f, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a != null) {
            m2228a.stripIndex = 17;
            m2228a.frameIndex = 0;
            m2228a.timer = 40.0f;
            m2228a.startTimer = m2228a.timer;
            m2228a.fadeOut = true;
            m2228a.startingAlpha = 2.0f;
            m2228a.f4305Z = 8.0f;
            m2228a.f4287H = 1.1f * m1860c();
            m2228a.f4286G = 1.9f * m1860c();
            m2228a.f4288I = true;
        }
        if (point != null) {
            Point m1791b = gameEngine.f5836bW.m1791b(point.game, point.y);
            EffectObject m2228a2 = gameEngine.effects.m2228a(m1791b.game, m1791b.y, 0.0f, EffectType.f4274a, true, EnumC0668h.f4401e);
            if (m2228a2 != null) {
                m2228a2.f4328o = true;
                m2228a2.frameIndex = 9;
                m2228a2.timer = 35.0f;
                m2228a2.startTimer = m2228a.timer;
                m2228a2.fadeOut = true;
                m2228a2.startingAlpha = 2.0f;
                m2228a2.f4287H = 1.3f;
                m2228a2.f4286G = 0.6f;
            }
        }
    }

    /* renamed from: f */
    public void m1846f(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0678e m1818v = m1818v();
        m1887a(m1818v);
        m1818v.m2079e(unit);
        gameEngine.audio.m2411b(AudioEngine.f3858d, 1.0f);
        EffectObject m2228a = gameEngine.effects.m2228a(unit.x, unit.y, unit.height, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a != null) {
            m2228a.frameIndex = 11;
            m2228a.timer = 25.0f;
            m2228a.startTimer = m2228a.timer;
            m2228a.fadeOut = true;
            m2228a.startingAlpha = 2.0f;
            m2228a.f4288I = true;
            m2228a.f4287H = 1.8f * m1860c();
            m2228a.f4286G = 1.6f * m1860c();
        }
    }

    /* renamed from: g */
    public void m1844g(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0678e m1818v = m1818v();
        m1887a(m1818v);
        m1818v.m2077f(unit);
        gameEngine.audio.m2411b(AudioEngine.f3858d, 1.0f);
        EffectObject m2228a = gameEngine.effects.m2228a(unit.x, unit.y, unit.height, EffectType.f4274a, true, EnumC0668h.f4401e);
        if (m2228a != null) {
            m2228a.frameIndex = 11;
            m2228a.timer = 25.0f;
            m2228a.startTimer = m2228a.timer;
            m2228a.fadeOut = true;
            m2228a.startingAlpha = 2.0f;
            m2228a.f4288I = true;
            m2228a.f4287H = 1.8f * m1860c();
            m2228a.f4286G = 1.6f * m1860c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.corrodinggames.rts.game.units.Unit m1913a(float r7, float r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.gui.InterfaceEngine.m1913a(float, float, boolean):com.corrodinggames.rts.game.units.ag");
    }

    /* renamed from: b */
    public void m1870b(float f, float f2, float f3) {
        GameEngine gameEngine = GameEngine.getInstance();
        Iterator it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject gameObject = (GameObject) it.next();
            if (gameObject instanceof Unit) {
                Unit unit = (Unit) gameObject;
                if (!unit.dead && unit.transportedBy == null && unit.team == gameEngine.playerTeam && CommonUtils.distanceSq(f, f2, unit.x, unit.y - unit.height) < f3 * f3) {
                    m1838j(unit);
                }
            }
        }
    }

    /* renamed from: h */
    public void m1842h(Unit unit) {
        this.f4667Q = null;
        GameEngine gameEngine = GameEngine.getInstance();
        Iterator it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject gameObject = (GameObject) it.next();
            if (gameObject instanceof Unit) {
                Unit unit2 = (Unit) gameObject;
                if (!unit2.dead && unit2.transportedBy == null && unit2.team == unit.team && unit2.isOnScreen() && BattleInterface.m2059a(unit2, unit) && (unit2.team == gameEngine.playerTeam || unit2.m3746cd())) {
                    m1838j(unit2);
                }
            }
        }
    }

    /* renamed from: w */
    public void m1817w() {
        this.f4667Q = null;
        Iterator it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject gameObject = (GameObject) it.next();
            if (gameObject instanceof Unit) {
                ((Unit) gameObject).selected = false;
            }
        }
        this.numberOfSelectedUnits = 0;
        this.f4669S++;
        this.f4809bJ.clear();
    }

    /* renamed from: i */
    public boolean m1840i(Unit unit) {
        if (unit.mo1774t()) {
            return false;
        }
        Team team = GameEngine.getInstance().playerTeam;
        if (team != null && team.m3925c(unit.team) && !unit.mo3181ce()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean m1838j(Unit unit) {
        if (unit.selected) {
            return true;
        }
        if (!m1840i(unit)) {
            return false;
        }
        m1836k(unit);
        m1895a(EnumC0226aa.f1472c, unit);
        return true;
    }

    /* renamed from: k */
    public void m1836k(Unit unit) {
        if (unit.selected || !m1840i(unit)) {
            return;
        }
        unit.selected = true;
        unit.f1626cy = GameEngine.getInstance().f5819bA;
        this.numberOfSelectedUnits++;
        if (!(unit instanceof SandBoxAct)) {
            f4664bK = unit;
        }
        this.f4669S++;
        this.f4809bJ.m481a(unit);
    }

    /* renamed from: x */
    public static Mod m1816x() {
        com.corrodinggames.rts.game.units.UnitType unitType;
        Unit unit = f4664bK;
        if (unit == null || (unitType = unit.getUnitType()) == null || !(unitType instanceof CustomUnitMetadata)) {
            return null;
        }
        return ((CustomUnitMetadata) unitType).f2736G;
    }

    /* renamed from: a */
    public void m1893a(Unit unit, boolean z) {
        if (!z) {
            m1838j(unit);
        } else if (unit.selected) {
            unselectUnit(unit);
        } else {
            m1838j(unit);
        }
    }

    /* renamed from: l */
    public void unselectUnit(Unit unit) {
        if (unit.selected) {
            unit.selected = false;
            this.numberOfSelectedUnits--;
            this.f4809bJ.remove(unit);
            this.f4669S++;
        }
    }

    /* renamed from: y */
    public boolean m1815y() {
        if (m1827p() == 0) {
            return false;
        }
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.selected && m1832m(orderableUnit)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: z */
    public boolean m1814z() {
        if (m1827p() == 0) {
            return false;
        }
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.selected && m1832m(orderableUnit) && orderableUnit.canAttack()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: A */
    public boolean m1931A() {
        if (m1827p() == 0) {
            return false;
        }
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.selected && orderableUnit.mo2579aR() && m1832m(orderableUnit)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    public boolean m1930B() {
        if (m1827p() == 0) {
            return true;
        }
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.selected && !orderableUnit.mo2676i()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: m */
    public boolean m1832m(Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (unit.mo3185cS()) {
            return false;
        }
        if (unit.team == gameEngine.playerTeam) {
            return true;
        }
        if ((unit.team != null && unit.team.m3941b(gameEngine.playerTeam)) || gameEngine.editorMode || gameEngine.replayEngine.isPlaying()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m1830n(Unit unit) {
        if (m1827p() == 0) {
            return false;
        }
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (unit2 instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit2;
                if (orderableUnit.selected && orderableUnit != unit && m1832m(orderableUnit) && unit.mo2822d(orderableUnit, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public boolean m1828o(Unit unit) {
        if (m1827p() == 0) {
            return false;
        }
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (unit2 instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit2;
                if (orderableUnit.selected && orderableUnit != unit && m1832m(orderableUnit) && orderableUnit.mo2822d(unit, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public boolean m1826p(Unit unit) {
        if (m1827p() == 0) {
            return false;
        }
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (unit2 instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit2;
                if (orderableUnit.selected && orderableUnit != unit && m1832m(orderableUnit) && orderableUnit.mo2621a(unit)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public boolean m1824q(Unit unit) {
        if (m1827p() == 0) {
            return false;
        }
        Iterator it = this.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (unit2 instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit2;
                if (orderableUnit.selected && orderableUnit != unit && m1832m(orderableUnit) && C0236ak.m3716a(orderableUnit, unit)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public void m1929C() {
    }

    /* renamed from: D */
    public boolean m1928D() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        this.battleInterface.writeOut(outputNetStream);
        outputNetStream.writeByte(1);
        outputNetStream.writeInt(this.f4673X);
    }

    /* renamed from: a */
    public void m1884a(InputNetStream inputNetStream, boolean z) {
        this.battleInterface.m2054a(inputNetStream, z);
        if (inputNetStream.readByte() >= 1) {
            this.f4673X = inputNetStream.readInt();
        }
    }

    /* renamed from: a */
    public void m1890a(OrderableUnit orderableUnit, float f, float f2, float f3, float f4, boolean z, ArrayList arrayList, Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        float f5 = orderableUnit.x;
        float f6 = orderableUnit.y;
        OrderableUnit orderableUnit2 = null;
        Unit m3738d = Unit.m3738d(orderableUnit.getUnitType());
        if (!(m3738d instanceof OrderableUnit)) {
            GameEngine.PrintLOG("buildingBlockoutUnit not OrderableUnit is: " + m3738d.getClass().getName());
        } else {
            orderableUnit2 = (OrderableUnit) m3738d;
        }
        boolean z2 = false;
        gameEngine.map.m4134b(f, f2);
        float f7 = gameEngine.map.returnX;
        float f8 = gameEngine.map.returnY;
        float cV = f7 + orderableUnit.mo2897cV();
        float cW = f8 + orderableUnit.mo2896cW();
        float cV2 = f3 + orderableUnit.mo2897cV();
        float cW2 = f4 + orderableUnit.mo2896cW();
        float m1691b = CommonUtils.m1691b(cV, cW, cV2, cW2);
        float m1659d = CommonUtils.m1659d(cV, cW, cV2, cW2);
        int i = 0;
        float f9 = 0.0f;
        while (true) {
            float f10 = f9;
            if (f10 <= m1691b) {
                gameEngine.map.m4134b((cV + (CommonUtils.cos(m1659d) * f10)) - orderableUnit.mo2897cV(), (cW + (CommonUtils.sin(m1659d) * f10)) - orderableUnit.mo2896cW());
                float f11 = gameEngine.map.returnX;
                float f12 = gameEngine.map.returnY;
                float cV3 = f11 + orderableUnit.mo2897cV();
                float cW3 = f12 + orderableUnit.mo2896cW();
                orderableUnit.x = cV3;
                orderableUnit.y = cW3;
                if ((!z2 || orderableUnit2 == null || (!C0661a.m2249a(orderableUnit, orderableUnit2) && !orderableUnit.m2442r(orderableUnit2))) && 0 == 0) {
                    boolean m1889a = m1889a(orderableUnit, cV3, cW3, z, false, unit);
                    if (arrayList != null && m1889a) {
                        arrayList.add(new PointF(cV3, cW3));
                    }
                    if (m1889a) {
                        i++;
                        if (i >= 29) {
                            return;
                        }
                    }
                    z2 = true;
                    if (orderableUnit2 != null) {
                        orderableUnit2.x = cV3;
                        orderableUnit2.y = cW3;
                    }
                }
                f9 = f10 + gameEngine.map.f792p;
            } else {
                orderableUnit.x = f5;
                orderableUnit.y = f6;
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean m1889a(OrderableUnit orderableUnit, float f, float f2, boolean z, boolean z2, Unit unit) {
        boolean z3;
        GameEngine gameEngine = GameEngine.getInstance();
        float f3 = orderableUnit.x;
        float f4 = orderableUnit.y;
        orderableUnit.x = f;
        orderableUnit.y = f2;
        boolean mo2493c = orderableUnit.mo2493c(gameEngine.playerTeam);
        if (C0661a.m2250a(gameEngine.playerTeam, orderableUnit, this.f4673X)) {
            mo2493c = false;
        }
        if (unit != null && unit != null && (unit instanceof OrderableUnit)) {
            OrderableUnit orderableUnit2 = (OrderableUnit) unit;
            if (!orderableUnit2.mo2580aQ()) {
                float distanceSq = CommonUtils.distanceSq(orderableUnit2.x, orderableUnit2.y, orderableUnit.x, orderableUnit.y);
                float f5 = orderableUnit2.mo2723f(orderableUnit.getUnitType());
                if (f5 > 800000.0f) {
                    z3 = true;
                } else {
                    z3 = distanceSq <= f5 * f5;
                }
                if (!z3) {
                    mo2493c = false;
                }
            }
        }
        boolean z4 = orderableUnit.f1621cg;
        orderableUnit.f1621cg = true;
        orderableUnit.f1624cj = mo2493c;
        orderableUnit.f1625ck = !mo2493c;
        orderableUnit.f1623ci = z2;
        if (z) {
            gameEngine.graphics.mo135j();
            gameEngine.m916N();
            orderableUnit.mo423d(0.0f);
            orderableUnit.draw(0.0f);
            orderableUnit.mo431a(0.0f, false);
            float maxAttackRange = orderableUnit.getMaxAttackRange();
            if (maxAttackRange > 30.0f) {
                C0955y.m452a((Unit) orderableUnit, maxAttackRange, true, true);
            }
            orderableUnit.mo2985bZ();
            if (!z2) {
                orderableUnit.m2652M(-1);
            }
            gameEngine.graphics.mo134k();
        }
        orderableUnit.x = f3;
        orderableUnit.y = f4;
        orderableUnit.f1623ci = false;
        orderableUnit.f1621cg = z4;
        return mo2493c;
    }

    /* renamed from: E */
    public void m1927E() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f5976dq = true;
        if (gameEngine.f5845by < 1500 && gameEngine.interfaceEngine.f4734c != null) {
            gameEngine.f5977dr = true;
        }
        this.battleInterface.m2025p();
    }

    /* renamed from: F */
    public void m1926F() {
        GameEngine.getInstance().f5979dt = true;
        this.battleInterface.m2024q();
    }

    /* renamed from: G */
    public void m1925G() {
        m1837k();
        this.f4671U = null;
        this.f4672W = this.f4751k;
    }

    /* renamed from: a */
    public void m1877a(String str, Rect rect, Paint paint, Paint paint2) {
        String[] m1665c;
        Paint paint3;
        GameEngine gameEngine = GameEngine.getInstance();
        int i = 0;
        for (String str2 : CommonUtils.m1665c(str, '\n')) {
            if (i == 0) {
                paint3 = paint;
            } else {
                paint3 = paint2;
            }
            Paint paint4 = paint3;
            int m1938a = C0714d.m1938a(paint4);
            gameEngine.graphics.drawText(str2, rect.centerX(), rect.top + (m1938a / 2) + (i * m1938a), paint4);
            i++;
        }
    }

    /* renamed from: a */
    public boolean m1898a(Action action, boolean z, Unit unit, boolean z2) {
        return m1897a(action, z, unit, z2, false, -1.0f);
    }

    /* renamed from: a */
    public boolean m1897a(Action action, boolean z, Unit unit, boolean z2, boolean z3, float f) {
        int i;
        Paint paint;
        Paint paint2;
        int i2;
        int i3;
        int i4;
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        String m1851d;
        GameEngine gameEngine = GameEngine.getInstance();
        C0732u c0732u = new C0732u();
        c0732u.f4927d = this.f4686aK;
        c0732u.f4928e = this.f4687aL;
        action.mo3811a(unit, c0732u);
        String str = null;
        boolean z4 = false;
        boolean z5 = true;
        if (GameEngine.isPC_()) {
            z5 = false;
        }
        if (unit != null && action.mo3598l(unit)) {
            z5 = false;
        }
        boolean z6 = false;
        boolean z7 = false;
        if (BattleInterface.m2063a(action)) {
            z6 = true;
            z7 = true;
            c0732u.m1761b();
            c0732u.m1763a(this.f4729bs, this.f4687aL);
        }
        if (m1857c(action)) {
            z6 = true;
            str = this.noNukeText;
            String m1851d2 = m1851d(action);
            if (m1851d2 != null) {
                str = m1851d2;
            }
        }
        if (!z6 && z2 && (m1851d = m1851d(action)) != null) {
            str = m1851d;
        }
        if (str == null) {
            float m2050b = this.battleInterface.m2050b(action);
            if (m2050b > 0.0f) {
                str = CommonUtils.m1638g(m2050b / 1000.0f);
            }
        }
        this.f4792bh.left = 20;
        int i5 = (int) ((gameEngine.f5870ck - gameEngine.f5874cp) - 20);
        this.f4792bh.right = i5;
        boolean z8 = gameEngine.curSettings.showActionInfoHoverNearMouse;
        if (z) {
            i = (int) (gameEngine.f5873co - 40.0f);
        } else {
            i = 40;
        }
        if (GameEngine.isIOS() && f > 0.0f) {
            i = (int) f;
            z4 = true;
        }
        if (GameEngine.isPC() && z8 && z3) {
            i = (int) (gameEngine.m875ac() - 40.0f);
        }
        this.f4792bh.top = i;
        this.f4792bh.bottom = this.f4792bh.top;
        boolean z9 = true;
        boolean z10 = true;
        int i6 = 7;
        if (GameEngine.isPC()) {
            if (!z8) {
                z9 = false;
                z10 = false;
            } else if (!z3) {
                z10 = false;
                z9 = true;
                i6 = 20;
            }
        } else if (!z) {
            z10 = false;
        }
        if (!GameEngine.isPC() || z || !z8 || !z3) {
        }
        if (str != null) {
            C0732u m1758d = c0732u.m1758d();
            c0732u.m1761b();
            c0732u.m1769a(m1758d);
            c0732u.m1763a(str, this.f4688aM);
        }
        UniquePaint uniquePaint = this.f4687aL;
        if (z2) {
            UniquePaint uniquePaint2 = this.f4688aM;
        }
        C0737z m1770a = c0732u.m1770a(this.f4792bh.width(), z9);
        float centerX = this.f4792bh.centerX();
        this.f4792bh.left = (int) (centerX - (m1770a.f4942b.width() / 2));
        this.f4792bh.right = (int) (centerX + (m1770a.f4942b.width() / 2));
        this.f4792bh.bottom = this.f4792bh.top + m1770a.f4942b.height();
        if (z9) {
            this.f4792bh.left = (int) (rect3.left - (i6 * gameEngine.densityScale));
            this.f4792bh.right = (int) (rect4.right + (i6 * gameEngine.densityScale));
        }
        if (z10) {
            this.f4792bh.m4666a((int) ((i5 - (7.0f * gameEngine.densityScale)) - this.f4792bh.right), 0);
        }
        this.f4793bi.m4664a(this.f4792bh);
        this.f4793bi.top -= 20;
        this.f4793bi.bottom += 15;
        int i7 = -1;
        if (unit != null) {
            i7 = action.mo2738b(unit, true);
        }
        if (unit != null && z5 && i7 != -1) {
            this.f4793bi.bottom = (int) (rect2.bottom + (55.0f * gameEngine.densityScale));
        }
        if (this.f4793bi.bottom > gameEngine.f5871cl) {
            int i8 = (int) (gameEngine.f5871cl - this.f4793bi.bottom);
            this.f4792bh.m4666a(0, i8);
            this.f4793bi.m4666a(0, i8);
        }
        com.corrodinggames.rts.game.units.UnitType mo2734i = action.mo2734i();
        if (!action.mo3818B()) {
            mo2734i = null;
        }
        if (mo2734i != null && unit != null) {
            this.f4793bi.top = (int) (rect.top - (40.0f * gameEngine.densityScale));
        }
        if (z4) {
            int i9 = -this.f4792bh.height();
            this.f4792bh.m4666a(0, i9);
            this.f4793bi.m4666a(0, i9);
        }
        if (0 != 0) {
            int i10 = (int) ((gameEngine.f5871cl - 30.0f) - this.f4793bi.bottom);
            this.f4793bi.m4666a(0, i10);
            this.f4792bh.m4666a(0, i10);
        }
        if (this.f4793bi.top < 0) {
            int i11 = 0 - this.f4793bi.top;
            this.f4793bi.m4666a(0, i11);
            this.f4792bh.m4666a(0, i11);
        }
        if (this.f4793bi.bottom > gameEngine.f5871cl - 20.0f) {
            int i12 = (int) ((gameEngine.f5871cl - 20.0f) - this.f4793bi.bottom);
            this.f4793bi.m4666a(0, i12);
            this.f4792bh.m4666a(0, i12);
        }
        gameEngine.graphics.drawRect(this.f4793bi, this.displayTextBackgroundPaintBorder);
        gameEngine.graphics.drawRect(this.f4793bi, this.f4681aF);
        if (z6) {
        }
        if (mo2734i != null && unit != null) {
            UnitType.m3712a(mo2734i, this.f4793bi.centerX(), this.f4793bi.top + (22.0f * gameEngine.densityScale), this.f4670T, 0.0f, unit.team, 30.0f * gameEngine.densityScale, 100.0f * gameEngine.densityScale, false, false, action.mo3816q());
        }
        m1770a.m1751a(this.f4792bh.centerX(), this.f4792bh.top);
        if (unit != null && i7 != -1 && z5) {
            float f2 = gameEngine.densityScale * 0.5f;
            int i13 = (int) (60.0f * f2);
            float m1939b = C0713c.m1939b(unit, action, true);
            if (!z6 || i7 > 0) {
                this.f4680aE.setColor(-16777216);
                if (m1939b != 0.0f) {
                    float m1692b = CommonUtils.m1692b((CommonUtils.absf(m1939b) * 0.5f) - 0.4f, 0.0f, 1.0f);
                    if (m1939b > 0.0f) {
                        i4 = Color.argb(110, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                    } else {
                        i4 = Color.argb(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30, 30);
                    }
                    CommonUtils.m1736a(i4, this.f4680aE.m4686e(), m1692b);
                }
                float m1933b = (this.f4793bi.bottom - ((65.0f * f2) / 2.0f)) + (C0714d.m1933b(this.f4680aE) / 2);
                if (m1939b > 0.5d) {
                    m1933b += 1.0f;
                }
                if (m1939b < -0.5d) {
                    m1933b -= 1.0f;
                }
                gameEngine.graphics.drawText(VariableScope.nullOrMissingString + i7, this.f4793bi.centerX(), m1933b, this.f4680aE);
            }
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = !z6 && m1899a(action, true);
            boolean z14 = i7 > 0 && action.mo3605d(unit, true);
            int centerX2 = (int) (this.f4793bi.centerX() + (60.0f * f2));
            int i14 = (int) (this.f4793bi.bottom - (65.0f * f2));
            this.f4795bk.set(centerX2, i14, centerX2 + i13, i14 + i13);
            if (z13) {
                paint = this.f4694aZ;
            } else {
                paint = this.f4728ba;
            }
            if (m1939b > 0.0f) {
                float m1692b2 = CommonUtils.m1692b((CommonUtils.absf(m1939b) * 0.7f) - 0.3f, 0.0f, 1.0f);
                if (m1939b > 0.0f) {
                    i3 = Color.argb(110, 210, 210, 210);
                } else {
                    i3 = Color.argb(110, 210, 110, 110);
                }
                int m1736a = CommonUtils.m1736a(i3, paint.m4686e(), m1692b2);
                paint = this.f4797bm;
                paint.setColor(m1736a);
            }
            if (m1939b > 0.5d) {
                this.f4795bk.m4666a(0, 1);
            }
            gameEngine.graphics.mo195a(this.f4786bb, this.f4795bk.left, this.f4795bk.top, paint, 0.0f, f2);
            CommonUtils.m1729a(this.f4795bk, this.f4795bk.width() * 0.8f);
            if (this.gameTouchClick && !this.f4774N && !z7 && this.f4795bk.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
                this.gameTouchClick = false;
                z11 = true;
            }
            int centerX3 = (int) ((this.f4793bi.centerX() - i13) - (60.0f * f2));
            int i15 = (int) (this.f4793bi.bottom - (65.0f * f2));
            this.f4795bk.set(centerX3, i15, centerX3 + i13, i15 + i13);
            if (z14) {
                paint2 = this.f4694aZ;
            } else {
                paint2 = this.f4728ba;
            }
            if (m1939b < 0.0f) {
                float m1692b3 = CommonUtils.m1692b((CommonUtils.absf(m1939b) * 0.7f) - 0.3f, 0.0f, 1.0f);
                if (m1939b > 0.0f) {
                    i2 = Color.argb(110, 210, 210, 210);
                } else {
                    i2 = Color.argb(110, 210, 110, 110);
                }
                int m1736a2 = CommonUtils.m1736a(i2, paint2.m4686e(), m1692b3);
                paint2 = this.f4797bm;
                paint2.setColor(m1736a2);
            }
            if (m1939b < -0.5d) {
                this.f4795bk.m4666a(0, 1);
            }
            gameEngine.graphics.mo195a(this.f4787bc, this.f4795bk.left, this.f4795bk.top, paint2, 0.0f, f2);
            CommonUtils.m1729a(this.f4795bk, this.f4795bk.width() * 0.8f);
            if (this.gameTouchClick && !this.f4774N && this.f4795bk.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
                this.gameTouchClick = false;
                z12 = true;
            }
            int i16 = 1;
            if ((z11 || z12) && action.mo2735g()) {
                if (m1883a(gameEngine)) {
                    i16 = 5;
                }
                if (m1864b(gameEngine)) {
                    i16 = 10;
                }
            }
            if (z11) {
                if (action.mo2735g() && gameEngine.playerTeam.m3880s() <= gameEngine.playerTeam.m3881r()) {
                    m1879a(this.battleInterface.f4490an);
                }
                if (z13) {
                    gameEngine.audio.m2411b(AudioEngine.f3862h, 0.5f);
                    C0713c.m1940a(unit, action, false, true);
                }
                for (int i17 = 0; i17 < i16; i17++) {
                    C0678e m1819u = m1819u();
                    if (m1883a(gameEngine)) {
                        m1819u.f4451e = true;
                    }
                    m1885a(m1819u, action);
                    m1819u.m2097a(action.mo3819x());
                    m1900a(action, (PointF) null, (Unit) null, m1819u);
                }
            }
            if (z12) {
                if (z14) {
                    C0713c.m1940a(unit, action, true, true);
                    gameEngine.audio.m2411b(AudioEngine.f3863i, 0.5f);
                }
                for (int i18 = 0; i18 < i16; i18++) {
                    C0678e m1819u2 = m1819u();
                    m1885a(m1819u2, action);
                    m1819u2.f4453g = true;
                    m1819u2.m2097a(action.mo3819x());
                }
            }
            if (!z11 && !z12 && this.gameTouchClick && !this.f4774N && !this.f4793bi.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
                return true;
            }
        }
        if (!z5 && GameEngine.isIOS() && this.gameTouchClick && !this.f4774N && !this.f4793bi.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m1903a(Rect rect, Paint paint, Paint paint2) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (f4743bz) {
            gameEngine.graphics.mo192a(this.f4790bf, rect, paint2, rect.left, rect.top, 0, 0);
            if (paint != null) {
                int m4684f = paint.m4684f() + 0;
                if (m4684f > 255) {
                    m4684f = 255;
                }
                paint.setAlpha(m4684f);
            }
        }
        if (paint != null) {
            gameEngine.graphics.drawRect(rect, paint);
        }
    }

    /* renamed from: a */
    public void m1904a(Rect rect, int i, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        this._paint.setColor(i);
        this._paint.setStyle(Paint.Style.f217b);
        this._paint.setStrokeWidth(1.0f);
        gameEngine.graphics.drawRect(rect, this._paint);
        if (this.f4804by) {
            this._paint.setColor(Color.argb(255, 116, 136, 160));
            int i2 = 1;
            if (z && rect.width() > 100) {
                i2 = 2;
            }
            this._paint.setStrokeWidth(i2);
            this.f4796bl.m4664a(rect);
            this.f4796bl.bottom -= i2;
            this.f4796bl.top += i2;
            this.f4796bl.left += i2;
            this.f4796bl.right -= i2;
            gameEngine.graphics.drawRect(this.f4796bl, this._paint);
        }
    }

    /* renamed from: a */
    public void drawButton(int text, int color, int i, int i2, String str, int i3, Paint paint, boolean z) {
        GameEngine game = GameEngine.getInstance();
        this._rect.set(text, color, text + i, color + i2);
        this._paint.setColor(i3);
        if (!z) {
            this._paint.setStyle(Paint.Style.f216a);
            game.graphics.drawRect(this._rect, this._paint);
        } else {
            m1903a(this._rect, (Paint) null, this._paint);
        }
        int argb = Color.argb(255, 0, 0, 0);
        if (f4743bz) {
            argb = Color.argb(100, 0, 0, 0);
        }
        m1904a(this._rect, argb, false);
        drawText(text, color, i, i2, str, i3, paint);
    }

    /* renamed from: a */
    public void drawText(int h, int text, int color, int i, String str, int i2, Paint paint) {
        GameEngine game = GameEngine.getInstance();
        this._rect.set(h, text, h + color, text + i);
        if (GameEngine.isPC_Device) {
            game.graphics.drawText(str, this._rect.centerX(), this._rect.centerY() + (game.graphics.mo175a(str, paint) / 2), paint);
        } else {
            game.graphics.drawText(str, this._rect.centerX(), this._rect.centerY() - ((paint.m4677l() + paint.m4676m()) / 2.0f), paint);
        }
    }

    /* renamed from: H */
    public boolean m1924H() {
        if (this.f4774N) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m1908a(int y, int w, int h, int text, String id, ButtonIds holdButton, boolean z, int i) {
        return addButton(y, w, h, text, id, holdButton, z, i, this.f4716aw, false);
    }

    /* renamed from: b */
    public boolean m1868b(int y, int w, int h, int text, String id, ButtonIds holdButton, boolean z, int i) {
        return addButton(y, w, h, text, id, holdButton, z, i, this.f4716aw, true);
    }

    /* renamed from: a */
    public boolean m1907a(int i, int i2, int i3, int text, String id, ButtonIds holdButton, boolean z, int i4, Paint paint) {
        return addButton(i, i2, i3, text, id, holdButton, z, i4, paint, false);
    }

    /* renamed from: a */
    public boolean addButton(int y, int w, int h, int text, String id, ButtonIds holdButton, boolean color, int i, Paint paint, boolean z) {
        drawButton(y, w, h, text, id, i, paint, z);
        return getButtonState(y, w, h, text, holdButton, color);
    }

    /* renamed from: a */
    public void m1919a(float f, float f2, float f3, float f4) {
        this.f4811bM.set((int) f, (int) f2, (int) (f + f3), (int) (f2 + f4));
        if (this.f4811bM.contains((int) this.f4760u, (int) this.f4761v)) {
            this.f4767G = true;
            if (this.gameTouchPress) {
                this.f4766F = true;
            }
        }
    }

    /* renamed from: a */
    public boolean getButtonState(int h, int id, int holdButton, int i, ButtonIds buttonIds, boolean z) {
        m1919a(h, id, holdButton, i);
        this._rect.set(h, id, h + holdButton, id + i);
        if (((z && this.gameTouching) || this.gameTouchClick) && this._rect.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean getPressButtonState(int id, int i, int i2, int i3, ButtonIds buttonIds) {
        this._rect.set(id, i, id + i2, i + i3);
        if (this.gameTouchPress && this._rect.contains((int) this.gameTouchLastX, (int) this.gameTouchLastY)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public float m1822r(Unit unit) {
        GameEngine game = GameEngine.getInstance();
        if (unit.f1626cy < game.f5819bA && unit.f1626cy + 200 > game.f5819bA) {
            return (1.0f - ((game.f5819bA - unit.f1626cy) / 200.0f)) * 6.0f;
        }
        return GameEngine.getInstance().f5982dx;
    }

    /* renamed from: a */
    public void m1888a(menu_ menu_Var) {
        GameEngine game = GameEngine.getInstance();
        menu_Var.m2012r_();
        menu_Var.m1990c(game.f5872cn);
        menu_Var.m1987d(game.f5873co);
        this.f4754n.m1997a(menu_Var);
    }
}
package com.corrodinggames.rts.gameFramework.gui;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Menu;
import android.view.MenuItem;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.appFramework.gameView;
import com.corrodinggames.rts.appFramework.inGameActivity;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.ActiveUnit;
import com.corrodinggames.rts.game.units.C0587u;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.SandBoxAct;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0433j;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.ValueListSource;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.custom.p020e.C0420d;
import com.corrodinggames.rts.game.units.custom.p020e.C0421e;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.C0203d;
import com.corrodinggames.rts.game.units.p012a.C0206g;
import com.corrodinggames.rts.game.units.p012a.C0213n;
import com.corrodinggames.rts.game.units.p012a.C0224y;
import com.corrodinggames.rts.game.units.p012a.C0225z;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.game.units.p012a.EnumC0220u;
import com.corrodinggames.rts.game.units.p027g.C0531c;
import com.corrodinggames.rts.gameFramework.C0678e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.InputControllerB;
import com.corrodinggames.rts.gameFramework.SyncedObject;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.C0853s;
import com.corrodinggames.rts.gameFramework.draw.UniquePaint;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.p039j.C0831a;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/a.class */
public class BattleInterface extends SyncedObject {

    /* renamed from: a */
    InterfaceEngine f4476a;

    /* renamed from: b */
    GameEngine curGameEngine;

    /* renamed from: e */
    public boolean f4494e;

    /* renamed from: f */
    public float f4495f;

    /* renamed from: n */
    UniquePaint f4496n;

    /* renamed from: o */
    UniquePaint f4497o;

    /* renamed from: q */
    Paint f4498q;

    /* renamed from: r */
    Paint f4499r;

    /* renamed from: s */
    Paint f4500s;

    /* renamed from: t */
    Paint f4501t;

    /* renamed from: u */
    Paint f4502u;

    /* renamed from: v */
    Paint f4503v;

    /* renamed from: G */
    boolean f4461G;

    /* renamed from: H */
    float f4462H;

    /* renamed from: I */
    float f4463I;

    /* renamed from: J */
    float f4464J;

    /* renamed from: K */
    int f4465K;

    /* renamed from: L */
    boolean f4466L;

    /* renamed from: M */
    float f4467M;

    /* renamed from: N */
    float f4468N;

    /* renamed from: O */
    float f4469O;

    /* renamed from: P */
    float f4470P;

    /* renamed from: Q */
    float f4471Q;

    /* renamed from: R */
    float f4472R;

    /* renamed from: S */
    int f4473S;

    /* renamed from: T */
    float f4474T;

    /* renamed from: U */
    float f4475U;

    /* renamed from: ac */
    Unit f4479ac;

    /* renamed from: ad */
    Action f4480ad;

    /* renamed from: ae */
    float f4481ae;

    /* renamed from: af */
    long f4482af;

    /* renamed from: ag */
    float f4483ag;

    /* renamed from: ah */
    float f4484ah;

    /* renamed from: ai */
    String f4485ai;

    /* renamed from: aj */
    String f4486aj;

    /* renamed from: ak */
    String f4487ak;

    /* renamed from: al */
    String f4488al;

    /* renamed from: am */
    String f4489am;

    /* renamed from: an */
    public String f4490an;

    /* renamed from: aq */
    public float f4491aq;

    /* renamed from: ar */
    public boolean f4492ar;

    /* renamed from: aE */
    float f4477aE;

    /* renamed from: aJ */
    int f4478aJ;

    /* renamed from: aa */
    static Paint f4504aa = new Paint();

    /* renamed from: ab */
    static PorterDuffColorFilter f4505ab = new PorterDuffColorFilter(Color.m4733a(200, 255, 200), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aK */
    static String f4506aK = LangLocale.getI18NText("gui.rategame.text", new Object[0]);

    /* renamed from: aL */
    static String f4507aL = LangLocale.getI18NText("gui.rategame.yes", new Object[0]);

    /* renamed from: aM */
    static String f4508aM = LangLocale.getI18NText("gui.rategame.no", new Object[0]);

    /* renamed from: c */
    public boolean f4509c = false;

    /* renamed from: d */
    public boolean f4510d = false;

    /* renamed from: g */
    Paint f4511g = new Paint();

    /* renamed from: h */
    Paint f4512h = new Paint();

    /* renamed from: i */
    Paint f4513i = new Paint();

    /* renamed from: j */
    Paint f4514j = new Paint();

    /* renamed from: k */
    Paint f4515k = new Paint();

    /* renamed from: l */
    Paint f4516l = new Paint();

    /* renamed from: m */
    Paint f4517m = new Paint();

    /* renamed from: p */
    Paint f4518p = new Paint();

    /* renamed from: w */
    Rect f4519w = new Rect();

    /* renamed from: x */
    RectF f4520x = new RectF();

    /* renamed from: y */
    Rect f4521y = new Rect();

    /* renamed from: z */
    Rect f4522z = new Rect();

    /* renamed from: A */
    RectF f4523A = new RectF();

    /* renamed from: B */
    RectF f4524B = new RectF();

    /* renamed from: C */
    Rect f4525C = new Rect();

    /* renamed from: D */
    RectF f4526D = new RectF();

    /* renamed from: E */
    Rect f4527E = new Rect();

    /* renamed from: F */
    RectF f4528F = new RectF();

    /* renamed from: V */
    BitmapOrTexture button_zoom = null;

    /* renamed from: W */
    BitmapOrTexture lock_icon_menu = null;

    /* renamed from: X */
    BitmapOrTexture pause = null;

    /* renamed from: Y */
    BitmapOrTexture replay_pause = null;

    /* renamed from: Z */
    BitmapOrTexture fast = null;

    /* renamed from: ao */
    String f4534ao = null;

    /* renamed from: ap */
    float f4535ap = 0.0f;

    /* renamed from: as */
    ArrayList f4536as = new ArrayList();

    /* renamed from: at */
    C0224y f4537at = new C0224y(false);

    /* renamed from: au */
    C0224y f4538au = new C0224y(true);

    /* renamed from: av */
    C0203d f4539av = new C0203d();

    /* renamed from: aw */
    ArrayList f4540aw = new ArrayList();

    /* renamed from: ax */
    ArrayList f4541ax = new ArrayList();

    /* renamed from: ay */
    ObjectVector f4542ay = new ObjectVector();

    /* renamed from: az */
    ArrayList f4543az = new ArrayList();

    /* renamed from: aA */
    RectF f4544aA = new RectF();

    /* renamed from: aB */
    HashMap f4545aB = new HashMap();

    /* renamed from: aC */
    ArrayList f4546aC = new ArrayList();

    /* renamed from: aD */
    Rect f4547aD = new Rect();

    /* renamed from: aF */
    ArrayList f4548aF = new ArrayList();

    /* renamed from: aG */
    boolean f4549aG = false;

    /* renamed from: aH */
    float f4550aH = 0.0f;

    /* renamed from: aI */
    float f4551aI = 0.0f;

    /* renamed from: aN */
    boolean f4552aN = false;

    /* renamed from: aO */
    float f4553aO = 0.0f;

    /* renamed from: aP */
    MenuC0729r f4554aP = new MenuC0729r();

    /* renamed from: aQ */
    ArrayList f4555aQ = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BattleInterface(GameEngine gameEngine, InterfaceEngine interfaceEngine) {
        this.f4476a = interfaceEngine;
        this.curGameEngine = gameEngine;
        init();
    }

    /* renamed from: a */
    public void m2070a() {
        this.f4485ai = LangLocale.getI18NText("gui.unselectall", new Object[0]);
        this.f4486aj = LangLocale.getI18NText("gui.common.allyUnit", new Object[0]);
        this.f4487ak = LangLocale.getI18NText("gui.common.enemyUnit", new Object[0]);
        this.f4488al = LangLocale.getI18NText("gui.common.neutralUnit", new Object[0]);
        this.f4489am = LangLocale.getI18NText("gui.infoText.ownedBy", new Object[0]);
        this.f4490an = LangLocale.getI18NText("gui.infoText.unitCapReached", new Object[0]);
    }

    /* renamed from: b */
    public void init() {
        m2070a();
        this.button_zoom = this.curGameEngine.graphics.loadImage(R.drawable.zoom_button);
        this.lock_icon_menu = this.curGameEngine.graphics.loadImage(R.drawable.lock_icon_menu);
        this.pause = this.curGameEngine.graphics.loadImage(R.drawable.pause);
        this.replay_pause = this.curGameEngine.graphics.loadImage(R.drawable.replay_pause);
        this.fast = this.curGameEngine.graphics.loadImage(R.drawable.fast);
        f4504aa.m4717a(255, 30, 30, 30);
        f4504aa.m4715a(f4505ab);
        f4504aa.m4687d(true);
        this.f4498q = new Paint();
        this.f4498q.mo935a(true);
        this.f4498q.m4714a(Paint.Align.f197b);
        this.f4498q.m4717a(255, 0, 255, 0);
        this.curGameEngine.m892a(this.f4498q, 34.0f);
        this.f4499r = new Paint();
        this.f4499r.mo935a(true);
        this.f4499r.m4714a(Paint.Align.f197b);
        this.f4499r.m4717a(255, 255, 0, 0);
        this.curGameEngine.m892a(this.f4499r, 32.0f);
        this.f4500s = new Paint();
        this.f4500s.mo935a(true);
        this.f4500s.m4714a(Paint.Align.f196a);
        this.f4500s.m4717a(255, 0, 255, 0);
        this.curGameEngine.m892a(this.f4500s, 16.0f);
        this.f4501t = new Paint();
        this.f4501t.mo935a(true);
        this.f4501t.m4714a(Paint.Align.f198c);
        this.f4501t.m4717a(255, 0, 255, 0);
        this.curGameEngine.m892a(this.f4501t, 16.0f);
        this.f4502u = new Paint();
        this.f4502u.m4717a(255, 255, 255, 255);
        this.f4502u.m4714a(Paint.Align.f196a);
        this.f4502u.m4691c(true);
        this.f4502u.mo935a(true);
        this.f4503v = new Paint();
        this.f4503v.m4717a(255, 255, 255, 255);
        this.f4503v.m4714a(Paint.Align.f196a);
        this.f4503v.m4691c(true);
        this.f4503v.mo935a(true);
        this.f4496n = new UniquePaint();
        this.f4496n.setColor(Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 255, 255, 255));
        this.f4496n.m931n();
        this.f4497o = new UniquePaint();
        this.f4497o.setColor(Color.argb(133, 255, 255, 255));
        this.f4497o.m931n();
        this.f4546aC.clear();
        int i = 0;
        while (i < 10) {
            this.f4546aC.add(new C0703ac(this, i < 3));
            i++;
        }
        m2029l();
    }

    /* renamed from: r */
    private float m2023r() {
        float f = 4.6f / this.curGameEngine.f5965cX;
        if (f > 4.6f) {
            f = 4.6f;
        }
        return f;
    }

    /* renamed from: s */
    private float m2022s() {
        return m2021t() / this.curGameEngine.f5965cX;
    }

    /* renamed from: t */
    private float m2021t() {
        if (this.curGameEngine.f5851cE / this.curGameEngine.map.getWidthInPixels() < this.curGameEngine.f5853cG / this.curGameEngine.map.getHeightInPixels()) {
            return this.curGameEngine.f5851cE / this.curGameEngine.map.getWidthInPixels();
        }
        return this.curGameEngine.f5853cG / this.curGameEngine.map.getHeightInPixels();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2069a(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.curGameEngine.curSettings.showZoomButton) {
            float f6 = this.curGameEngine.densityScale * 0.7f;
            int i = (int) (50.0f * f6);
            int i2 = (int) this.curGameEngine.f5873co;
            float m1025c = C0831a.m1025c();
            if (m1025c > 20.0f) {
                i = (int) (i + (m1025c - 20.0f));
            }
            if (this.f4461G) {
                this.f4519w.set(i - 4, (int) (i2 - (50.0f * this.curGameEngine.densityScale)), i + 4, (int) (i2 + (50.0f * this.curGameEngine.densityScale)));
                this.f4513i.m4721a();
                this.f4513i.setColor(Color.argb(255, 0, 0, 0));
                this.curGameEngine.graphics.drawRect(this.f4519w, this.f4513i);
            }
            float f7 = i2;
            if (this.curGameEngine.f5962cU > 1.0f) {
                f5 = f7 - (((this.curGameEngine.f5962cU - 1.0f) * 3.0f) * this.curGameEngine.densityScale);
            } else {
                f5 = f7 + (((this.curGameEngine.f5962cU * (-20.0f)) + 20.0f + 1.0f) * this.curGameEngine.densityScale);
            }
            float f8 = 48.0f * f6;
            float f9 = 54.0f * f6;
            float f10 = f8 / 2.0f;
            float f11 = f9 / 2.0f;
            if (f5 < f11) {
                f5 = f11;
            }
            if (f5 > this.curGameEngine.f5871cl - f11) {
                f5 = (int) (this.curGameEngine.f5871cl - f11);
            }
            this.f4519w.set((int) (i - f10), (int) (f5 - f11), (int) (i + f10), (int) (f5 + f11));
            if (!this.f4461G) {
                f4504aa.m4717a(140, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA);
            } else {
                f4504aa.m4717a(255, 255, 255, 255);
            }
            this.curGameEngine.graphics.mo195a(this.button_zoom, this.f4519w.left, this.f4519w.top, f4504aa, 0.0f, f6);
            boolean z = this.f4461G;
            if (!this.f4461G && this.f4476a.getPressButtonState(this.f4519w.left, this.f4519w.top, this.f4519w.width(), this.f4519w.height(), ButtonIds.zoomButton)) {
                this.f4461G = true;
                this.f4462H = this.f4476a.gameTouchLastY;
            }
            if (!this.f4476a.gameTouching) {
                this.f4461G = false;
            }
            if (this.f4461G) {
                this.f4463I += f;
                this.f4476a.m1853d();
                float f12 = this.f4476a.gameTouchLastY - this.f4462H;
                if (f12 > 180.0f) {
                    f12 = 180.0f;
                }
                if (f12 < -180.0f) {
                    f12 = -180.0f;
                }
                float f13 = f12 * this.curGameEngine.f5962cU;
                if (f13 > 2.0f) {
                    this.curGameEngine.f5962cU -= (5.0E-4f * CommonUtils.absf(f13)) * f;
                    this.curGameEngine.f5963cV = false;
                    if (this.curGameEngine.f5962cU < m2022s()) {
                        this.curGameEngine.f5962cU = m2022s();
                        this.curGameEngine.f5963cV = true;
                    }
                } else if (f13 < -2.0f) {
                    this.curGameEngine.f5962cU += 5.0E-4f * CommonUtils.absf(f13) * f;
                    this.curGameEngine.f5963cV = false;
                    if (this.curGameEngine.f5962cU > m2023r()) {
                        this.curGameEngine.f5962cU = m2023r();
                        this.curGameEngine.f5963cV = true;
                    }
                }
            } else {
                if (!z || this.f4463I < 12.0f) {
                }
                this.f4463I = 0.0f;
            }
        }
        if (this.curGameEngine.curSettings.mouseSupport) {
            if (this.f4476a.m1921a(this.curGameEngine.m876ab(), this.curGameEngine.m875ac()) && !this.f4476a.f4767G) {
                int m873ae = this.curGameEngine.m873ae();
                if (m873ae != 0) {
                    this.f4464J += (m873ae / 120.0f) * 0.18f;
                }
                if (this.f4464J > 1.0f) {
                    this.f4464J = 1.0f;
                }
                if (this.f4464J < -1.0f) {
                    this.f4464J = -1.0f;
                }
            }
            if (this.f4464J != 0.0f) {
                float f14 = 0.0032f * f;
                if (this.f4464J < 0.0f) {
                    f14 = -f14;
                }
                float f15 = f14 + (this.f4464J * 0.18f * f);
                float f16 = this.f4464J;
                this.f4464J = CommonUtils.toZero(this.f4464J, CommonUtils.absf(f15));
                if (this.f4464J == 0.0f) {
                    f15 = f16;
                }
                float f17 = f15 * this.curGameEngine.f5962cU;
                this.curGameEngine.f5962cU += f17;
                this.curGameEngine.f5860cY = true;
                this.curGameEngine.f5861cZ = this.curGameEngine.m876ab();
                this.curGameEngine.f5891da = this.curGameEngine.m875ac();
                if (f17 != 0.0f) {
                    this.curGameEngine.f5963cV = false;
                }
            }
        }
        if (this.curGameEngine.curSettings.gestureZoom && this.curGameEngine.m905Y() && this.curGameEngine.m877aa() >= 3) {
            this.f4475U = 20.0f;
        }
        if (this.f4475U < 10.0f) {
            this.f4466L = false;
        }
        if (this.f4475U > 0.0f) {
            this.f4475U = CommonUtils.toZero(this.f4475U, f);
            boolean z2 = this.curGameEngine.m905Y() && this.curGameEngine.m877aa() >= 3;
            this.f4476a.f4779aO = 3.0f;
            float f18 = 0.0f;
            float f19 = 0.0f;
            if (z2) {
                for (int i3 = 0; i3 < this.curGameEngine.m877aa(); i3++) {
                    f18 += this.curGameEngine.m849b(i3);
                    f19 += this.curGameEngine.m841c(i3);
                }
                f4 = f18 / this.curGameEngine.m877aa();
                f3 = f19 / this.curGameEngine.m877aa();
                f2 = 0.0f;
                for (int i4 = 0; i4 < this.curGameEngine.m877aa(); i4++) {
                    f2 += CommonUtils.m1691b(f4, f3, this.curGameEngine.m849b(i4), this.curGameEngine.m841c(i4));
                }
            } else {
                f4 = this.f4470P;
                f3 = this.f4471Q;
                f2 = this.f4472R;
            }
            if (this.f4466L && this.f4473S != this.curGameEngine.m877aa()) {
                this.f4466L = false;
            }
            if (!this.f4466L && z2) {
                this.f4466L = true;
                this.f4467M = f4;
                this.f4468N = f3;
                this.f4469O = f2;
                this.f4474T = this.curGameEngine.f5962cU;
                this.f4470P = f4;
                this.f4471Q = f3;
                this.f4472R = f2;
                this.f4473S = this.curGameEngine.m877aa();
            }
            if (z2) {
                float f20 = (this.f4471Q - f3) * 2.0f * this.curGameEngine.f5962cU;
                this.curGameEngine.f5962cU += (f20 / 250.0f) / this.curGameEngine.densityScale;
                this.curGameEngine.f5963cV = false;
                float f21 = this.f4472R - f2;
                if (0 != 0) {
                    this.curGameEngine.f5962cU -= (f21 / 350.0f) / this.curGameEngine.densityScale;
                    this.curGameEngine.f5963cV = false;
                }
                this.f4470P = f4;
                this.f4471Q = f3;
                this.f4472R = f2;
                this.f4473S = this.curGameEngine.m877aa();
                for (int i5 = 0; i5 < this.curGameEngine.m877aa(); i5++) {
                    this.curGameEngine.graphics.mo221a(f4, f3, this.curGameEngine.m849b(i5), this.curGameEngine.m841c(i5), this.f4476a.f4683aH);
                }
                this.curGameEngine.graphics.mo221a(f4, f3, f4, this.f4468N, this.f4476a.f4684aI);
                this.curGameEngine.graphics.mo219a(f4, f3, 6.0f, this.f4476a.f4683aH);
            }
        }
        if (this.curGameEngine.f5962cU > m2023r()) {
            this.curGameEngine.f5962cU = m2023r();
            this.curGameEngine.f5963cV = true;
        }
        if (this.curGameEngine.f5962cU < m2022s()) {
            this.curGameEngine.f5962cU = m2022s();
            this.curGameEngine.f5963cV = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2051b(float f) {
        this.f4494e = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 7;
        if (GameEngine.isPC_()) {
            i = 14;
        }
        if (this.curGameEngine.m905Y() && this.f4476a.f4672W == null) {
            boolean m1855c = this.f4476a.m1855c(this.curGameEngine);
            int i2 = 1;
            if (this.curGameEngine.curSettings.mouseOrders == 2) {
                i2 = 2;
            }
            int m825f = this.curGameEngine.m825f(i2);
            if (m1855c || (this.curGameEngine.curSettings.mouseSupport && m825f != -1 && !this.f4476a.f4765E && !this.f4476a.f4766F)) {
                float m849b = this.curGameEngine.m849b(0);
                float m841c = this.curGameEngine.m841c(0);
                if (m825f != -1) {
                    m849b = this.curGameEngine.m849b(m825f);
                    m841c = this.curGameEngine.m841c(m825f);
                }
                if (!this.f4509c) {
                    z2 = true;
                    this.f4524B.left = (int) m849b;
                    this.f4524B.top = (int) m841c;
                }
                this.f4524B.right = (int) m849b;
                this.f4524B.bottom = (int) m841c;
                if (Math.abs(this.f4524B.left - this.f4524B.right) > i || Math.abs(this.f4524B.top - this.f4524B.bottom) > i) {
                    this.f4510d = true;
                }
                z = true;
            } else if (this.curGameEngine.m877aa() == 2 && this.f4475U == 0.0f) {
                this.f4524B.left = (int) this.curGameEngine.m849b(0);
                this.f4524B.top = (int) this.curGameEngine.m841c(0);
                this.f4524B.right = (int) this.curGameEngine.m849b(1);
                this.f4524B.bottom = (int) this.curGameEngine.m841c(1);
                this.f4510d = false;
                z = true;
            }
            if (z) {
                this.f4495f += f;
                if (this.f4495f < 18.0f) {
                    z3 = true;
                }
            } else {
                this.f4495f = 0.0f;
            }
            if (z) {
                this.f4509c = true;
                if (Math.abs(this.f4524B.left - this.f4524B.right) > i || Math.abs(this.f4524B.top - this.f4524B.bottom) > i) {
                    this.f4525C.bottom = (int) this.f4524B.bottom;
                    this.f4525C.top = (int) this.f4524B.top;
                    this.f4525C.left = (int) this.f4524B.left;
                    this.f4525C.right = (int) this.f4524B.right;
                    CommonUtils.m1730a(this.f4525C);
                    this.f4511g.setColor(Color.argb(255, 0, 255, 0));
                    this.f4511g.setStyle(Paint.Style.f217b);
                    this.f4511g.setStrokeWidth(1.0f);
                    this.curGameEngine.graphics.drawRect(this.f4525C, this.f4511g);
                    this.f4494e = true;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        if (this.f4509c && !z) {
            if (z3 && this.curGameEngine.m877aa() == 3) {
                z5 = true;
            } else {
                z4 = true;
            }
        }
        if (z5) {
            this.f4510d = false;
            this.f4509c = false;
        }
        if ((z && !z3) || z4) {
            if (z2) {
                Iterator it = GameObject.fastGameObjectList.iterator();
                while (it.hasNext()) {
                    GameObject gameObject = (GameObject) it.next();
                    if (gameObject instanceof ActiveUnit) {
                        ActiveUnit activeUnit = (ActiveUnit) gameObject;
                        activeUnit.f1555cz = activeUnit.selected;
                    }
                }
            }
            if (z4) {
                this.f4510d = false;
                this.f4509c = false;
            }
            this.f4526D.m4650a(this.f4524B);
            CommonUtils.m1727a(this.f4526D);
            if (Math.abs(this.f4526D.left - this.f4526D.right) > i || Math.abs(this.f4526D.top - this.f4526D.bottom) > i) {
                this.f4526D.bottom /= this.curGameEngine.viewpointZoom;
                this.f4526D.top /= this.curGameEngine.viewpointZoom;
                this.f4526D.left /= this.curGameEngine.viewpointZoom;
                this.f4526D.right /= this.curGameEngine.viewpointZoom;
                this.f4526D.m4653a(this.curGameEngine.f5878ct, this.curGameEngine.f5879cu);
                this.f4476a.f4779aO = 4.0f;
                this.f4476a.f4780aP = 40.0f;
                this.f4476a.gameTouchClick = false;
                boolean m1883a = this.f4476a.m1883a(this.curGameEngine);
                boolean m1864b = this.f4476a.m1864b(this.curGameEngine);
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = false;
                if (this.curGameEngine.curSettings.smartSelection_v2) {
                    Iterator it2 = GameObject.fastGameObjectList.iterator();
                    while (it2.hasNext()) {
                        GameObject gameObject2 = (GameObject) it2.next();
                        if (gameObject2 instanceof OrderableUnit) {
                            OrderableUnit orderableUnit = (OrderableUnit) gameObject2;
                            if (m2055a(orderableUnit) && (!m1883a || !orderableUnit.f1555cz)) {
                                if (!orderableUnit.mo2975bH()) {
                                    z6 = false;
                                }
                                if (orderableUnit.mo2579aR() && orderableUnit.canAttack()) {
                                    z7 = false;
                                }
                            }
                        }
                    }
                }
                if (m1864b) {
                    z6 = true;
                }
                Iterator it3 = GameObject.fastGameObjectList.iterator();
                while (it3.hasNext()) {
                    GameObject gameObject3 = (GameObject) it3.next();
                    if (gameObject3 instanceof ActiveUnit) {
                        ActiveUnit activeUnit2 = (ActiveUnit) gameObject3;
                        boolean z9 = false;
                        if (m2055a(activeUnit2)) {
                            z9 = true;
                            if (!z6 && activeUnit2.mo2975bH()) {
                                z9 = false;
                            }
                            if (!z7 && activeUnit2.mo2560aj() && !activeUnit2.canAttack()) {
                                z9 = false;
                            }
                        }
                        if (m1864b) {
                            if (z9) {
                                z9 = !activeUnit2.f1555cz;
                            } else if (activeUnit2.f1555cz) {
                                z9 = true;
                            }
                        } else if (m1883a && activeUnit2.f1555cz) {
                            z9 = true;
                        }
                        if (z9) {
                            this.f4476a.m1838j(activeUnit2);
                            if (z4 && activeUnit2.f1626cy + 900 < this.curGameEngine.f5819bA && ((!m1883a && !m1864b) || !activeUnit2.f1555cz)) {
                                z8 = true;
                            }
                        } else {
                            this.f4476a.unselectUnit(activeUnit2);
                        }
                    }
                }
                if (z8) {
                    Iterator it4 = GameObject.fastGameObjectList.iterator();
                    while (it4.hasNext()) {
                        GameObject gameObject4 = (GameObject) it4.next();
                        if (gameObject4 instanceof ActiveUnit) {
                            ((ActiveUnit) gameObject4).f1626cy = this.curGameEngine.f5819bA;
                        }
                    }
                }
                this.f4476a.m1929C();
            }
        }
    }

    /* renamed from: a */
    private boolean m2055a(ActiveUnit activeUnit) {
        if (!activeUnit.dead && activeUnit.transportedBy == null) {
            float f = activeUnit.x;
            float f2 = activeUnit.y - activeUnit.height;
            if (f2 <= 0.0f) {
                f2 += activeUnit.height;
            }
            if (this.f4526D.m4646b(f, f2)) {
                if ((this.f4476a.m1832m(activeUnit) || this.curGameEngine.playerTeam.m3945b()) && !activeUnit.mo1774t()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void m2053a(String str, int i) {
        this.f4534ao = str;
        this.f4535ap = i;
    }

    /* renamed from: b */
    public void m2048b(String str, int i) {
        if (this.f4535ap <= 0.0f || str.equals(this.f4534ao)) {
            this.f4534ao = str;
            this.f4535ap = i;
        }
    }

    /* renamed from: c */
    public void m2046c(float f) {
        if (this.f4535ap > 0.0f && this.f4534ao != null) {
            this.f4535ap = CommonUtils.toZero(this.f4535ap, f);
            this.curGameEngine.graphics.mo176a(this.f4534ao, this.curGameEngine.f5872cn, this.curGameEngine.f5873co, this.f4476a.f4717ax, this.f4476a.f4678aC, 8.0f);
        }
    }

    /* renamed from: a */
    public static boolean m2063a(Action action) {
        return GameEngine.getInstance().f5936at && action.mo3817k_();
    }

    /* renamed from: c */
    public void m2047c() {
        this.f4465K = 0;
    }

    /* renamed from: a */
    public InputControllerB m2062a(Action action, int i, ArrayList arrayList) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!GameEngine.isPC()) {
            return null;
        }
        if (action.mo3835K() != null) {
            return action.mo3835K();
        }
        if ((action instanceof C0213n) || (action instanceof C0203d)) {
            return null;
        }
        if (action.mo2697f() == EnumC0219t.f1438b) {
            return gameEngine.f5833bT.f3951T;
        }
        if (action.mo2698e() == EnumC0220u.f1459m) {
            return gameEngine.f5833bT.f3948Q;
        }
        if (action.mo2698e() == EnumC0220u.f1458l) {
            return gameEngine.f5833bT.f3947P;
        }
        if (action.mo2698e() == EnumC0220u.f1451e) {
            return gameEngine.f5833bT.f3949R;
        }
        if (action.mo2697f() == EnumC0219t.f1439c) {
            int i2 = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Action action2 = (Action) it.next();
                if (action2 != action && action2.mo2697f() == EnumC0219t.f1439c && this.f4476a.m1867b(action2)) {
                    i2++;
                }
            }
            if (i2 == 0) {
                return gameEngine.f5833bT.f3950S;
            }
        }
        EnumC0219t mo2697f = action.mo2697f();
        if (mo2697f == EnumC0219t.f1443g || mo2697f == EnumC0219t.f1444h || mo2697f == EnumC0219t.f1445i) {
            return null;
        }
        InputControllerB inputControllerB = null;
        InputControllerB[] inputControllerBArr = gameEngine.f5833bT.f3963af;
        if (this.f4465K < inputControllerBArr.length) {
            inputControllerB = inputControllerBArr[this.f4465K];
            this.f4465K++;
        }
        return inputControllerB;
    }

    /* renamed from: d */
    public ArrayList m2043d() {
        this.f4540aw.clear();
        Unit[] m485a = this.f4476a.f4809bJ.m485a();
        int size = this.f4476a.f4809bJ.size();
        for (int i = 0; i < size; i++) {
            UnitType unitType = m485a[i].getUnitType();
            if (!this.f4540aw.contains(unitType)) {
                this.f4540aw.add(unitType);
            }
        }
        return this.f4540aw;
    }

    /* renamed from: a */
    public ArrayList m2058a(Unit unit, ArrayList arrayList) {
        ObjectVector mo3150e;
        ArrayList mo2712M;
        int i = 0;
        this.f4536as.clear();
        int m1827p = this.f4476a.m1827p();
        if (m1827p == 0) {
            if (this.curGameEngine.curSettings.showChatAndPingShortcuts && this.curGameEngine.m921I()) {
                this.f4536as.add(0, this.f4476a.f4752l);
                this.f4536as.add(0, this.f4476a.f4753m);
            }
            return this.f4536as;
        }
        if (InterfaceEngine.f4743bz && unit != null && !(unit instanceof SandBoxAct)) {
            this.f4536as.add(this.f4537at);
            this.f4536as.add(this.f4538au);
        }
        if (unit == null) {
        }
        if (unit != null) {
            i = this.f4536as.size();
            if (unit.selected) {
                if (this.f4476a.m1832m(unit)) {
                    ArrayList mo2712M2 = unit.mo2712M();
                    if (mo2712M2 != null) {
                        this.f4536as.addAll(mo2712M2);
                    }
                } else {
                    ArrayList mo2712M3 = unit.mo2712M();
                    if (mo2712M3 != null) {
                        this.f4536as.addAll(mo2712M3);
                    }
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Unit unit2 = (Unit) arrayList.get(i2);
                if (this.f4476a.m1832m(unit2) && ((unit2.getUnitType() != unit.getUnitType() || unit2.mo2647U() != unit.mo2647U()) && (mo2712M = unit2.mo2712M()) != null)) {
                    Iterator it = mo2712M.iterator();
                    while (it.hasNext()) {
                        Action action = (Action) it.next();
                        boolean z = false;
                        Iterator it2 = this.f4536as.iterator();
                        while (it2.hasNext()) {
                            if (((Action) it2.next()).m3834L().equals(action.m3834L())) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f4536as.add(action);
                        }
                    }
                }
            }
        }
        boolean z2 = false;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Unit unit3 = (Unit) arrayList.get(i3);
            if (this.f4476a.m1832m(unit3) && (unit3 instanceof OrderableUnit) && !((OrderableUnit) unit3).mo2579aR()) {
                z2 = true;
            }
        }
        Unit m2040e = m2040e();
        if (!z2 && m2040e != null && this.f4476a.m1832m(m2040e)) {
            this.f4536as.add(i, this.f4476a.f4748h);
            this.f4536as.add(i, this.f4476a.f4749i);
        }
        boolean z3 = false;
        if (InterfaceEngine.f4743bz && (this.curGameEngine.curSettings.showSelectedUnitsList || m1827p == 1)) {
            z3 = true;
        }
        if (GameEngine.isNonDedicatedServer() && m1827p > 0) {
            z3 = true;
        }
        if (z3 && !(unit instanceof SandBoxAct)) {
            if (m1827p == 1 && m2040e != null && (mo3150e = m2040e.mo3150e(true)) != null && mo3150e.size() > 0) {
                for (int i4 = 0; i4 < mo3150e.size; i4++) {
                    Action action2 = (Action) mo3150e.get(i4);
                    if (action2 instanceof C0206g) {
                        C0206g c0206g = (C0206g) action2;
                        Iterator it3 = this.f4542ay.iterator();
                        while (it3.hasNext()) {
                            C0206g c0206g2 = (C0206g) it3.next();
                            if (c0206g2.m3850a(c0206g)) {
                                mo3150e.set(i4, c0206g2);
                            }
                        }
                    }
                }
                this.f4542ay.clear();
                Iterator it4 = mo3150e.iterator();
                while (it4.hasNext()) {
                    Action action3 = (Action) it4.next();
                    if (action3 instanceof C0206g) {
                        this.f4542ay.add((C0206g) action3);
                    }
                    this.f4536as.add(action3);
                }
            }
            ArrayList m2043d = m2043d();
            this.f4541ax.clear();
            Iterator it5 = m2043d.iterator();
            while (it5.hasNext()) {
                C0225z mo3098d = ((UnitType) it5.next()).mo3098d();
                mo3098d.m3808I();
                this.f4541ax.add(mo3098d);
            }
            Collections.sort(this.f4541ax);
            if (InterfaceEngine.f4743bz) {
                Collections.reverse(this.f4541ax);
            }
            Iterator it6 = this.f4541ax.iterator();
            while (it6.hasNext()) {
                C0225z c0225z = (C0225z) it6.next();
                if (InterfaceEngine.f4743bz) {
                    this.f4536as.add(0, c0225z);
                } else {
                    this.f4536as.add(c0225z);
                }
            }
        }
        return this.f4536as;
    }

    /* renamed from: e */
    Unit m2040e() {
        if (this.f4476a.f4809bJ.size() > 0) {
            return this.f4476a.f4809bJ.m484a(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Unit m2037f() {
        Unit unit = null;
        if (this.f4476a.numberOfSelectedUnits > 0) {
            Unit[] m485a = this.f4476a.f4809bJ.m485a();
            int i = 0;
            int size = this.f4476a.f4809bJ.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                Unit unit2 = m485a[i];
                if (unit2.selected) {
                    if (unit == null) {
                        unit = unit2;
                    } else if (!m2059a(unit, unit2)) {
                        unit = null;
                        break;
                    } else if (unit.mo2647U() > unit2.mo2647U()) {
                        unit = unit2;
                    }
                }
                i++;
            }
        }
        return unit;
    }

    /* renamed from: a */
    public static boolean m2059a(Unit unit, Unit unit2) {
        UnitType unitType = unit.getUnitType();
        UnitType unitType2 = unit2.getUnitType();
        if (unitType == unitType2) {
            return true;
        }
        if ((unitType instanceof CustomUnitMetadata) && (unitType2 instanceof CustomUnitMetadata)) {
            CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) unitType;
            CustomUnitMetadata customUnitMetadata2 = (CustomUnitMetadata) unitType2;
            if (customUnitMetadata.f3086fA.contains(unitType2)) {
                return true;
            }
            if (customUnitMetadata.f2960fD != null && ValueListSource.m3248a(customUnitMetadata.f2960fD, customUnitMetadata2.mo3064x())) {
                return true;
            }
            if (customUnitMetadata2.f2960fD != null && ValueListSource.m3248a(customUnitMetadata2.f2960fD, customUnitMetadata.mo3064x())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    ArrayList m2035g() {
        this.f4543az.clear();
        Unit[] m485a = this.f4476a.f4809bJ.m485a();
        int size = this.f4476a.f4809bJ.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m485a[i];
            if (unit instanceof OrderableUnit) {
                this.f4543az.add((OrderableUnit) unit);
            }
        }
        return this.f4543az;
    }

    /* renamed from: h */
    float m2033h() {
        return CommonUtils.m1692b((this.curGameEngine.f5871cl / 14.0f) / this.curGameEngine.densityScale, 25.0f * this.curGameEngine.densityScale, 40.0f * this.curGameEngine.densityScale);
    }

    /* renamed from: c */
    private boolean m2045c(Action action) {
        if (action.mo3805p()) {
            return true;
        }
        if (action instanceof C0206g) {
            return this.f4476a.m1832m(((C0206g) action).f1409b);
        }
        ArrayList m2035g = m2035g();
        C0202c m3834L = action.m3834L();
        Iterator it = m2035g.iterator();
        while (it.hasNext()) {
            OrderableUnit orderableUnit = (OrderableUnit) it.next();
            if (orderableUnit.mo3219a(m3834L) != null && this.f4476a.m1832m(orderableUnit)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2061a(Action action, ArrayList arrayList) {
        if (action.mo3805p()) {
            return true;
        }
        if (action instanceof C0206g) {
            C0206g c0206g = (C0206g) action;
            if (!c0206g.mo3593r(c0206g.f1409b)) {
                return false;
            }
            if (this.f4476a.m1832m(c0206g.f1409b) || c0206g.mo3608a(c0206g.f1409b, this.curGameEngine.playerTeam)) {
                return true;
            }
            return false;
        }
        C0202c m3834L = action.m3834L();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Unit unit = (OrderableUnit) it.next();
            Action a = unit.mo3219a(m3834L);
            if (a != null && a.mo3593r(unit) && (this.f4476a.m1832m(unit) || a.mo3608a(unit, this.curGameEngine.playerTeam))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m2049b(Action action, ArrayList arrayList) {
        if (action.mo3805p()) {
            return true;
        }
        if (action instanceof C0206g) {
            C0206g c0206g = (C0206g) action;
            if (c0206g.isActive((Unit) c0206g.f1409b, true)) {
                return true;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Unit unit = (OrderableUnit) it.next();
            Action a = unit.mo3219a(action.m3834L());
            if (a != null && a.isActive(unit, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private float m2044c(Action action, ArrayList arrayList) {
        int i = 0;
        float f = -1.0f;
        if (action.mo3806l_()) {
            return -1.0f;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Unit unit = (OrderableUnit) it.next();
            Action a = unit.mo3219a(action.m3834L());
            if (a != null) {
                float mo3815p = a.mo3815p(unit);
                if (mo3815p > f) {
                    f = mo3815p;
                    i++;
                }
            }
        }
        return f;
    }

    /* renamed from: d */
    private C0531c m2041d(Action action) {
        float f = -1.0f;
        C0531c c0531c = null;
        if (action.mo3806l_()) {
            return null;
        }
        if (action instanceof C0206g) {
            C0531c m2760b = C0531c.m2760b(((C0206g) action).f1409b, action.m3834L());
            if (m2760b != null) {
                if (-1.0f < m2760b.m2768a()) {
                    f = m2760b.m2768a();
                    c0531c = m2760b;
                }
            } else {
                return null;
            }
        }
        Iterator it = this.f4476a.f4809bJ.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.mo3219a(action.m3834L()) == null) {
                    continue;
                } else {
                    C0531c m2760b2 = C0531c.m2760b(orderableUnit, action.m3834L());
                    if (m2760b2 != null) {
                        if (f < m2760b2.m2768a()) {
                            f = m2760b2.m2768a();
                            c0531c = m2760b2;
                        }
                    } else {
                        return null;
                    }
                }
            }
        }
        if (c0531c == null) {
            return null;
        }
        return c0531c;
    }

    /* renamed from: e */
    private float m2038e(Action action) {
        C0531c m2041d = m2041d(action);
        if (m2041d == null) {
            return 0.0f;
        }
        return m2041d.m2761b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m2050b(Action action) {
        C0531c m2041d = m2041d(action);
        if (m2041d == null) {
            return 0.0f;
        }
        return m2041d.m2759c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m2042d(float f) {
        ArrayList arrayList;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        UniquePaint uniquePaint;
        Rect rect;
        Rect rect2;
        int i;
        int m873ae;
        this.f4492ar = false;
        int i2 = 1;
        if (InterfaceEngine.f4744bA) {
            i2 = 2;
        }
        int i3 = 0;
        boolean z = false;
        C0713c.m1942a(f);
        ArrayList m2035g = m2035g();
        Unit m2037f = m2037f();
        ArrayList arrayList2 = null;
        if (this.f4476a.f4672W != null) {
            arrayList2 = this.f4476a.f4672W.mo3822q(m2037f);
        }
        if (arrayList2 != null) {
            arrayList = arrayList2;
        } else {
            arrayList = m2058a(m2037f, m2035g);
        }
        if (m2037f == null && arrayList.size() > 0) {
            m2037f = m2040e();
            if (m2037f == null && CustomUnitMetadata.frontCustomUnitMetadata != null) {
                m2037f = Unit.m3756c(CustomUnitMetadata.frontCustomUnitMetadata);
            }
        }
        this.f4476a.f4755o = false;
        if (arrayList.contains(this.f4476a.f4748h)) {
            this.f4476a.f4755o = true;
        }
        if (m2037f == null) {
            m2037f = m2040e();
        }
        boolean z2 = true;
        if (m2037f == null) {
            this.f4482af = -1L;
        }
        if (m2037f != null && arrayList.size() > 0) {
            ArrayList arrayList3 = arrayList;
            float f8 = 2.0f;
            float m2033h = m2033h();
            float f9 = 2.0f;
            float f10 = m2033h + 2.0f;
            boolean z3 = false;
            if (!InterfaceEngine.f4663bC) {
                f2 = this.curGameEngine.f5836bW.m1793b() + 2;
                f3 = this.curGameEngine.f5870ck - this.curGameEngine.f5836bW.f4853c;
                f4 = this.curGameEngine.f5836bW.f4853c;
            } else {
                f2 = this.curGameEngine.f5836bW.f4843b;
                f3 = this.curGameEngine.f5836bW.f4853c;
                f4 = this.curGameEngine.f5836bW.f4853c;
                z3 = true;
            }
            if (InterfaceEngine.f4743bz) {
                m2033h += 15.0f * this.curGameEngine.densityScale;
                float f11 = f10 + (15.0f * this.curGameEngine.densityScale);
                f8 = 5.0f;
                if (GameEngine.isIOS()) {
                    f8 = 2.0f;
                }
                f10 = f11 + 2.0f;
                f9 = 2.0f + 2.0f;
                f2 += 3.0f;
            }
            if (!InterfaceEngine.f4742a) {
                boolean z4 = true;
                if (this.f4476a.f4734c != null && this.f4476a.numberOfSelectedUnits == 1 && this.f4476a.f4734c.selected) {
                    z4 = false;
                }
                if (z4) {
                    f2 = f2 + m2032i() + 2.0f;
                }
            }
            int i4 = 0;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                Action action = (Action) it.next();
                if (m2061a(action, m2035g)) {
                    i4++;
                    float mo2696k = f10 * action.mo2696k();
                    int i5 = i2;
                    if (action.mo2695l() > 0) {
                        i5 = action.mo2695l();
                    }
                    float f15 = f4 / i5;
                    boolean z5 = false;
                    if ((f13 + f15) - 0.1f >= f4) {
                        z5 = true;
                    }
                    if (!z5 && f12 > 0.0f && mo2696k + 0.1f < f12) {
                        z5 = true;
                    }
                    if (z5) {
                        f14 += f12;
                        f12 = 0.0f;
                        f13 = 0.0f;
                    }
                    if (f12 < mo2696k) {
                        f12 = mo2696k;
                    }
                    f13 += f15;
                }
            }
            if (f13 > 0.0f) {
                f14 += f12;
            }
            float f16 = f2 + f14;
            float f17 = f2;
            float f18 = f2 + 1.0f;
            if (this.curGameEngine.curSettings.showUnitGroups) {
                f5 = this.curGameEngine.f5853cG - (34.0f * this.curGameEngine.densityScale);
            } else {
                f5 = this.curGameEngine.f5853cG;
            }
            this.f4482af = m2037f.GameObjectID;
            float f19 = f18 - ((int) m2037f.f1525bj);
            float f20 = 0.0f;
            float f21 = 1.0f + (m2033h * 0.25f);
            boolean z6 = f16 - m2037f.f1525bj > f5 + f21;
            boolean z7 = m2037f.f1525bj > f21;
            this.f4492ar = z6 || z7;
            if (this.curGameEngine.curSettings.mouseSupport && !this.f4476a.m1921a(this.curGameEngine.m876ab(), this.curGameEngine.m875ac()) && (m873ae = this.curGameEngine.m873ae()) != 0) {
                f20 = -(m873ae / 120.0f);
            }
            float f22 = 0.0f;
            if (z6) {
                this.f4519w.left = (int) (f3 + 2.0f);
                this.f4519w.right = (int) ((f3 + f4) - 2.0f);
                this.f4519w.top = (int) (f5 - (m2033h * 0.4f));
                this.f4519w.bottom = (int) (this.f4519w.top + (m2033h * 0.4f));
                if (this.f4476a.m1907a(this.f4519w.left, this.f4519w.top, this.f4519w.width(), this.f4519w.height(), "\\/", ButtonIds.none, false, Color.argb(80, 100, 150, 100), this.f4476a.f4716aw) && this.f4476a.m1924H()) {
                    f22 = 0.0f + (3.0f * f10);
                    this.f4476a.gameTouchClick = false;
                }
                if (f20 > 0.0f) {
                    this.f4491aq = (float) (this.f4491aq + (0.5d * f10));
                }
                f5 -= (f10 * 0.4f) + 2.0f;
            }
            if (z7) {
                this.f4519w.left = (int) (f3 + 2.0f);
                this.f4519w.right = (int) ((f3 + f4) - 2.0f);
                this.f4519w.top = (int) f17;
                this.f4519w.bottom = (int) (this.f4519w.top + (m2033h * 0.4f));
                if (this.f4476a.m1907a(this.f4519w.left, this.f4519w.top, this.f4519w.width(), this.f4519w.height(), "/\\", ButtonIds.none, false, Color.argb(80, 100, 150, 100), this.f4476a.f4716aw) && this.f4476a.m1924H()) {
                    f22 -= 3.0f * f10;
                    this.f4476a.gameTouchClick = false;
                }
                if (f20 < 0.0f) {
                    this.f4491aq = (float) (this.f4491aq - (0.5d * f10));
                }
                f17 += (f10 * 0.4f) + 2.0f;
            }
            this.curGameEngine.graphics.mo137h();
            this.f4544aA.m4652a(0.0f, f17 - 1.0f, this.curGameEngine.f5870ck, f5 + 1.0f);
            this.curGameEngine.graphics.mo202a(this.f4544aA);
            if (GameEngine.isIOS()) {
                if (this.f4482af != m2037f.GameObjectID) {
                    this.f4483ag = 0.0f;
                    this.f4484ah = m2037f.f1525bj;
                } else if (this.f4491aq != 0.0f) {
                    this.f4483ag = this.f4491aq;
                } else {
                    if (!this.f4476a.gameTouching) {
                        this.f4491aq += this.f4483ag * f;
                    }
                    this.f4483ag = CommonUtils.toZero(this.f4483ag, f);
                }
            }
            m2037f.f1525bj += this.f4491aq + f22;
            this.f4491aq = 0.0f;
            int i6 = (int) (f16 - f5);
            if (i6 > 0) {
                if (m2037f.f1525bj > i6 + 0.0f) {
                    m2037f.f1525bj = i6 + 0.0f;
                }
                if (m2037f.f1525bj < 0.0f - 0.0f) {
                    m2037f.f1525bj = 0.0f - 0.0f;
                }
            } else {
                m2037f.f1525bj = 0.0f;
            }
            int i7 = -1;
            float f23 = 0.0f;
            float f24 = 0.0f;
            float f25 = 0.0f;
            m2047c();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Action action2 = (Action) it2.next();
                if (m2061a(action2, m2035g)) {
                    i3++;
                    boolean m2049b = m2049b(action2, m2035g);
                    i7++;
                    float mo2696k2 = m2033h * action2.mo2696k();
                    int i8 = i2;
                    if (action2.mo2695l() > 0) {
                        i8 = action2.mo2695l();
                    }
                    float f26 = f4 / i8;
                    if (!z3) {
                        f7 = mo2696k2;
                        f6 = f26;
                    } else {
                        f7 = f26;
                        f6 = mo2696k2;
                    }
                    boolean z8 = false;
                    if ((f25 + f6) - 0.1f > f4) {
                        z8 = true;
                    }
                    if (!z8 && f24 > 0.0f && f7 + 0.1f < f24) {
                        z8 = true;
                    }
                    if (z8) {
                        f23 += f24 + f9;
                        f24 = 0.0f;
                        f25 = 0.0f;
                    }
                    if (f24 < f7) {
                        f24 = f7;
                    }
                    if (!z3) {
                        this.f4519w.left = (int) (f3 + f8);
                        this.f4519w.right = (int) ((this.f4519w.left + f26) - (f8 * 2.0f));
                        this.f4519w.top = (int) (f23 + f19);
                        this.f4519w.bottom = (int) (this.f4519w.top + mo2696k2);
                        this.f4519w.m4666a((int) f25, 0);
                    } else {
                        this.f4519w.left = (int) (f3 + f8 + f23);
                        this.f4519w.right = (int) ((this.f4519w.left + f26) - (f8 * 2.0f));
                        this.f4519w.top = (int) f19;
                        this.f4519w.bottom = (int) (this.f4519w.top + mo2696k2);
                        this.f4519w.m4666a(0, (int) f25);
                    }
                    boolean z9 = true;
                    this.f4520x.m4651a(this.f4519w);
                    if (!this.f4520x.m4644b(this.f4544aA)) {
                        z9 = false;
                    }
                    f25 += f6;
                    EnumC0219t mo2697f = action2.mo2697f();
                    boolean z10 = false;
                    if (mo2697f == EnumC0219t.f1443g || mo2697f == EnumC0219t.f1444h || mo2697f == EnumC0219t.f1445i) {
                        z10 = true;
                    }
                    boolean m2063a = m2063a(action2);
                    boolean mo3809E = action2.mo3809E();
                    Paint paint = this.f4514j;
                    boolean z11 = m2049b;
                    if (mo2697f == EnumC0219t.f1445i) {
                        z11 = true;
                    }
                    if (z11) {
                        paint.setColor(Color.argb(70, 100, 100, 100));
                    } else {
                        paint.setColor(Color.argb(50, 170, 100, 100));
                    }
                    if (m2063a) {
                        paint.setColor(Color.argb(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100));
                    }
                    boolean z12 = false;
                    boolean z13 = false;
                    if (this.f4479ac == m2037f && this.f4480ad == action2) {
                        z12 = true;
                    }
                    if (this.f4476a.f4672W == action2) {
                        z12 = true;
                        z13 = true;
                    }
                    if (z12) {
                        paint.setColor(Color.argb(80, 100, 100, 200));
                    }
                    if (z13) {
                        paint.setColor(Color.argb(80, 100, 200, 100));
                    }
                    if (mo3809E) {
                        paint.setAlpha((int) (paint.m4684f() * 0.7f));
                        uniquePaint = this.f4497o;
                    } else {
                        uniquePaint = this.f4496n;
                    }
                    float f27 = 0.0f;
                    if (z9) {
                        f27 = C0713c.m1939b(m2037f, action2, false);
                        if (action2.mo2697f() != EnumC0219t.f1444h) {
                            boolean m1902a = this.f4476a.m1902a(action2);
                            float f28 = 0.0f;
                            if (m1902a) {
                                f28 = CommonUtils.absf(CommonUtils.cos((((float) (GameEngine.curTimeMs() % 1000)) / 1000.0f) * 180.0f));
                            }
                            if (f27 != 0.0f) {
                                float m1692b = CommonUtils.m1692b((CommonUtils.absf(f27) * 0.7f) - 0.3f, 0.0f, 1.0f);
                                if (f27 > 0.0f) {
                                    i = Color.argb(110, 210, 210, 210);
                                } else {
                                    i = Color.argb(110, 210, 110, 110);
                                }
                                int m1736a = CommonUtils.m1736a(i, paint.m4686e(), m1692b);
                                paint = this.f4513i;
                                paint.setColor(m1736a);
                            }
                            this.f4476a.m1903a(this.f4519w, paint, uniquePaint);
                            float m2044c = m2044c(action2, m2035g);
                            if (m2044c >= 0.0f) {
                                this.f4516l.m4717a(80, 0, 0, 100);
                                this.f4527E.m4664a(this.f4519w);
                                this.f4527E.right = (int) (rect2.right - ((1.0f - m2044c) * this.f4527E.width()));
                                this.curGameEngine.graphics.drawRect(this.f4527E, this.f4516l);
                                this.f4517m.m4717a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                this.curGameEngine.graphics.mo221a(this.f4527E.right, this.f4527E.top, this.f4527E.right, this.f4527E.bottom, this.f4516l);
                            } else {
                                float m2038e = m2038e(action2);
                                if (m2038e >= 0.0f) {
                                    this.f4516l.m4717a(80, 100, 0, 0);
                                    this.f4527E.m4664a(this.f4519w);
                                    this.f4527E.right = (int) (rect.right - ((1.0f - m2038e) * this.f4527E.width()));
                                    this.curGameEngine.graphics.drawRect(this.f4527E, this.f4516l);
                                    this.f4517m.m4717a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                    this.curGameEngine.graphics.mo221a(this.f4527E.right, this.f4527E.top, this.f4527E.right, this.f4527E.bottom, this.f4516l);
                                }
                            }
                            int argb = Color.argb(255, 0, 0, 0);
                            if (InterfaceEngine.f4743bz) {
                                argb = Color.argb(100, 0, 0, 0);
                                if (mo3809E) {
                                    argb = Color.argb(50, 155, 155, 155);
                                }
                            }
                            boolean z14 = false;
                            if (m1902a) {
                                z14 = true;
                                argb = Color.argb((int) (100.0f + (150.0f * f28)), 255, 255, 255);
                            }
                            this.f4476a.m1904a(this.f4519w, argb, z14);
                        }
                    }
                    InputControllerB m2062a = m2062a(action2, i7, arrayList3);
                    if (m2062a != null && z9) {
                        this.curGameEngine.graphics.drawText(m2062a.m2370c(), this.f4519w.left + 3, this.f4519w.top + this.curGameEngine.graphics.mo175a("A", this.f4476a.f4713at) + 1.0f, this.f4476a.f4713at);
                    }
                    boolean z15 = false;
                    UnitType mo2734i = action2.mo2734i();
                    BitmapOrTexture mo3592s = action2.mo3592s();
                    Unit mo3601i = action2.mo3601i(m2037f);
                    if (mo3601i != null) {
                        mo2734i = mo3601i.getUnitType();
                    }
                    if (mo3592s == null && mo2734i != null) {
                        mo3592s = mo2734i.mo3062z();
                    }
                    if (mo3592s != null) {
                        Rect mo3821t = action2.mo3821t();
                        if (mo3821t == null) {
                            mo3821t = this.f4527E;
                            mo3821t.set(0, 0, mo3592s.getWidth(), mo3592s.getHeight());
                        }
                        float height = (this.f4519w.height() * 0.7f) / mo3821t.height();
                        int centerX = (int) (this.f4519w.centerX() - ((mo3821t.width() * 0.5f) * height));
                        int centerY = (int) (this.f4519w.centerY() - ((mo3821t.height() * 0.5f) * height));
                        this.f4518p.m4717a(100, 255, 255, 255);
                        RectF rectF = this.f4528F;
                        rectF.m4652a(centerX, centerY, centerX + (mo3821t.width() * height), centerY + (mo3821t.height() * height));
                        this.curGameEngine.graphics.mo190a(mo3592s, mo3821t, rectF, this.f4518p);
                        z15 = true;
                    } else if (mo2734i != null) {
                        float centerX2 = this.f4519w.centerX();
                        float centerY2 = this.f4519w.centerY();
                        if (f27 > 0.5d) {
                            centerY2 += 1.0f;
                        }
                        if (f27 < -0.5d) {
                            centerY2 -= 1.0f;
                        }
                        float height2 = this.f4519w.height() * 0.7f;
                        float height3 = this.f4519w.height() * 0.95f;
                        if (InterfaceEngine.f4743bz) {
                            height2 = this.f4519w.height() * 0.4f;
                            height3 = this.f4519w.height() * 0.85f;
                        }
                        this.f4523A.m4651a(this.f4519w);
                        if (this.f4523A.m4644b(this.f4544aA)) {
                            this.curGameEngine.graphics.mo137h();
                            this.curGameEngine.graphics.mo202a(this.f4523A);
                            com.corrodinggames.rts.game.units.UnitType.m3712a(mo2734i, centerX2, centerY2, 0.0f, 0.0f, m2037f.team, height2, height3, false, false, action2.mo3816q());
                            if (mo3601i != null) {
                                float hpBar = mo3601i.getHpBar();
                                float secBar = mo3601i.getSecBar();
                                if (secBar != -1.0f && action2.mo3590t(m2037f)) {
                                    int m1686b = CommonUtils.m1686b(200, 0, 0, 150);
                                    int m1686b2 = CommonUtils.m1686b(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
                                    Paint m460a = C0955y.m460a(m1686b, Paint.Style.f216a);
                                    Paint m460a2 = C0955y.m460a(m1686b2, Paint.Style.f217b);
                                    int m4647b = ((int) (this.f4523A.m4647b() / 3.0f)) - 3;
                                    int i9 = m4647b * 2;
                                    this.f4528F.m4652a(centerX2 - m4647b, centerY2 + 0, (centerX2 - m4647b) + (i9 * secBar), centerY2 + 0 + 3);
                                    this.curGameEngine.graphics.mo201a(this.f4528F, m460a);
                                    this.f4528F.m4652a(centerX2 - m4647b, centerY2 + 0, (centerX2 - m4647b) + i9, centerY2 + 0 + 3);
                                    this.curGameEngine.graphics.mo201a(this.f4528F, m460a2);
                                } else if (hpBar != -1.0f && action2.mo3591s(m2037f)) {
                                    int m1686b3 = CommonUtils.m1686b(200, 0, 150, 0);
                                    int m1686b4 = CommonUtils.m1686b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                                    Paint m460a3 = C0955y.m460a(m1686b3, Paint.Style.f216a);
                                    Paint m460a4 = C0955y.m460a(m1686b4, Paint.Style.f217b);
                                    int m4647b2 = ((int) (this.f4523A.m4647b() / 3.0f)) - 3;
                                    int i10 = m4647b2 * 2;
                                    this.f4528F.m4652a(centerX2 - m4647b2, centerY2 + 0, (centerX2 - m4647b2) + (i10 * hpBar), centerY2 + 0 + 3);
                                    this.curGameEngine.graphics.mo201a(this.f4528F, m460a3);
                                    this.f4528F.m4652a(centerX2 - m4647b2, centerY2 + 0, (centerX2 - m4647b2) + i10, centerY2 + 0 + 3);
                                    this.curGameEngine.graphics.mo201a(this.f4528F, m460a4);
                                }
                            }
                            this.curGameEngine.graphics.mo136i();
                        }
                        z15 = true;
                    }
                    BitmapOrTexture mo3602h = action2.mo3602h(m2037f);
                    if (mo3602h != null) {
                        Rect mo3821t2 = action2.mo3821t();
                        if (mo3821t2 == null) {
                            mo3821t2 = this.f4527E;
                            mo3821t2.set(0, 0, mo3602h.getWidth(), mo3602h.getHeight());
                        }
                        float height4 = (this.f4519w.height() * 0.7f) / mo3821t2.height();
                        int centerX3 = (int) (this.f4519w.centerX() - ((mo3821t2.width() * 0.5f) * height4));
                        int centerY3 = (int) (this.f4519w.centerY() - ((mo3821t2.height() * 0.5f) * height4));
                        this.f4518p.setColor(action2.mo3612H());
                        RectF rectF2 = this.f4528F;
                        rectF2.m4652a(centerX3, centerY3, centerX3 + (mo3821t2.width() * height4), centerY3 + (mo3821t2.height() * height4));
                        this.curGameEngine.graphics.mo190a(mo3602h, mo3821t2, rectF2, this.f4518p);
                        z15 = true;
                    }
                    if (z9) {
                        String mo2699d = action2.mo2699d();
                        if (m2063a) {
                            this.curGameEngine.graphics.mo196a(this.lock_icon_menu, this.f4519w.left + 25, this.f4519w.m4655g(), (Paint) null);
                        }
                        if (this.curGameEngine.graphics.mo153b(mo2699d, this.f4476a.f4716aw) > this.f4519w.width() - 2) {
                            if (this.curGameEngine.graphics.mo153b(mo2699d, this.f4476a.f4715av) > this.f4519w.width() - 2) {
                                this.f4513i.m4711a(this.f4476a.f4714au);
                            } else {
                                this.f4513i.m4711a(this.f4476a.f4715av);
                            }
                        } else {
                            this.f4513i.m4711a(this.f4476a.f4716aw);
                        }
                        if (!z11) {
                            this.f4513i.setColor(Color.argb(255, 0, 100, 0));
                        }
                        if (mo2697f == EnumC0219t.f1438b) {
                            this.f4513i.m4717a(255, 255, 255, 255);
                        } else if (mo2697f == EnumC0219t.f1439c || mo2697f == EnumC0219t.f1442f) {
                            if (!z11) {
                                this.f4513i.m4717a(255, 19, 101, 94);
                            } else {
                                this.f4513i.m4717a(255, 39, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2);
                            }
                        } else if (mo2697f == EnumC0219t.f1440d) {
                            UnitType mo2734i2 = action2.mo2734i();
                            if (mo2734i2 != null && mo2734i2.mo3091g() > 1) {
                                if (!z11) {
                                    this.f4513i.m4717a(255, 117, 120, 15);
                                } else {
                                    this.f4513i.m4717a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                                }
                            }
                        } else if (z10) {
                            this.f4513i.m4717a(155, 255, 255, 255);
                        }
                        int mo175a = this.curGameEngine.graphics.mo175a(mo2699d, this.f4513i);
                        float m4655g = this.f4519w.m4655g() + (mo175a / 2);
                        if (z10) {
                            m4655g = this.f4519w.m4655g();
                        }
                        if (z15 && !mo2699d.contains("\n")) {
                            if (z10) {
                                m4655g = (this.f4519w.bottom - (mo175a / 2)) - 1;
                            } else {
                                m4655g = this.f4519w.bottom - 6;
                            }
                        }
                        if (z10) {
                            C0853s.m965a(mo2699d, this.f4519w.m4656f(), m4655g, this.f4513i);
                        } else {
                            this.curGameEngine.graphics.drawText(mo2699d, this.f4519w.m4656f(), m4655g, this.f4513i);
                        }
                    }
                    boolean z16 = false;
                    boolean z17 = false;
                    boolean z18 = false;
                    if (m2062a != null && m2062a.m2379a()) {
                        z16 = true;
                        z18 = true;
                    }
                    this.f4521y.m4664a(this.f4519w);
                    if (GameEngine.isIOS()) {
                        CommonUtils.m1684b(this.f4521y, 2.0f);
                    }
                    this.f4476a.m1919a(this.f4521y.left, this.f4521y.top, this.f4521y.width(), this.f4521y.height());
                    if (!this.f4510d && this.f4521y.contains((int) this.f4476a.f4760u, (int) this.f4476a.f4761v) && this.f4544aA.m4646b((int) this.f4476a.f4760u, (int) this.f4476a.f4761v)) {
                        z = true;
                        if (GameEngine.isPC()) {
                            z17 = true;
                        }
                        if ((this.f4476a.gameTouchClick || this.f4476a.gameTouching) && this.f4476a.gameTouchClick && this.f4476a.m1924H()) {
                            this.f4476a.gameTouchClick = false;
                            z16 = true;
                        }
                    }
                    if (GameEngine.isPC() && this.f4476a.f4672W == null) {
                        if (z17) {
                            this.f4479ac = m2037f;
                            this.f4480ad = action2;
                            this.f4481ae = f23 + f19;
                        } else if (Action.m3831a(this.f4480ad, action2)) {
                            this.f4479ac = null;
                            this.f4480ad = null;
                        }
                    }
                    boolean z19 = false;
                    if (z16 && !z18 && this.curGameEngine.curSettings.mouseSupport && this.curGameEngine.m828e(2)) {
                        z19 = true;
                    }
                    if (z16) {
                        if (action2.mo2731c(m2037f, z19)) {
                            z16 = false;
                        }
                        if (this.curGameEngine.replayEngine.isPlaying()) {
                            z16 = false;
                        }
                        if (!m2045c(action2)) {
                            z16 = false;
                        }
                    }
                    if (z16) {
                        if (action2.mo2698e() == EnumC0220u.f1447a || action2.mo2698e() == EnumC0220u.f1449c) {
                            this.f4476a.f4672W = null;
                            boolean z20 = false;
                            if (z18) {
                                z20 = true;
                            } else if (!action2.mo3594r()) {
                                z20 = true;
                            } else {
                                if (action2.mo3599k(m2037f)) {
                                    z20 = true;
                                } else if (this.f4479ac == m2037f && Action.m3831a(this.f4480ad, action2)) {
                                    z20 = true;
                                }
                                this.f4479ac = m2037f;
                                this.f4480ad = action2;
                                this.f4481ae = f23 + f19;
                            }
                            if (z20) {
                                int i11 = 1;
                                if (action2.mo2735g()) {
                                    if (this.f4476a.m1883a(this.curGameEngine)) {
                                        i11 = 5;
                                    }
                                    if (this.f4476a.m1864b(this.curGameEngine)) {
                                        i11 = 10;
                                    }
                                }
                                boolean z21 = false;
                                if (!z18) {
                                    boolean z22 = false;
                                    if (m2037f != null && action2.mo2738b(m2037f, false) != -1) {
                                        z22 = true;
                                    }
                                    if (z19 && z22) {
                                        z21 = true;
                                    }
                                }
                                if (m2063a(action2)) {
                                    this.curGameEngine.audio.m2411b(AudioEngine.f3866l, 0.8f);
                                } else if (!m2049b && !z21) {
                                    this.curGameEngine.audio.m2411b(AudioEngine.f3866l, 0.8f);
                                } else {
                                    boolean mo2735g = action2.mo2735g();
                                    if (mo2735g && !z21 && this.curGameEngine.playerTeam.m3880s() <= this.curGameEngine.playerTeam.m3881r()) {
                                        this.f4476a.m1879a(this.f4490an);
                                    }
                                    if (mo2735g) {
                                        if (!z21) {
                                            this.curGameEngine.audio.m2411b(AudioEngine.f3862h, 0.5f);
                                        } else {
                                            this.curGameEngine.audio.m2411b(AudioEngine.f3863i, 0.5f);
                                        }
                                    } else {
                                        this.curGameEngine.audio.m2411b(AudioEngine.f3861g, 0.8f);
                                    }
                                    C0713c.m1940a(m2037f, action2, z21, false);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        C0678e m1818v = this.f4476a.m1818v();
                                        if (!action2.mo3613G()) {
                                            this.f4476a.m1885a(m1818v, action2);
                                        } else {
                                            this.f4476a.m1886a(m1818v, action2.m3834L(), z21);
                                        }
                                        if (z21) {
                                            m1818v.f4453g = true;
                                        }
                                        m1818v.m2097a(action2.mo3819x());
                                        if (!z21) {
                                            this.f4476a.m1900a(action2, (PointF) null, (Unit) null, m1818v);
                                        }
                                    }
                                }
                            }
                        } else if (action2.mo2698e() == EnumC0220u.f1459m || action2.mo2698e() == EnumC0220u.f1458l || action2.mo2698e() == EnumC0220u.f1456j) {
                            if (z19) {
                                if (action2 != null && action2.equals(this.f4476a.f4672W)) {
                                    this.f4476a.m1837k();
                                }
                            } else if (!m2049b) {
                                this.curGameEngine.audio.m2411b(AudioEngine.f3866l, 0.8f);
                            } else {
                                C0713c.m1940a(m2037f, action2, false, false);
                                this.f4479ac = null;
                                this.f4480ad = null;
                                this.f4476a.f4672W = action2;
                            }
                        } else if (action2.mo2698e() == EnumC0220u.f1450d || action2.mo2698e() == EnumC0220u.f1451e || action2.mo2698e() == EnumC0220u.f1452f || action2.mo2698e() == EnumC0220u.f1453g) {
                            boolean z23 = false;
                            boolean z24 = false;
                            if (action2.mo2698e() == EnumC0220u.f1453g) {
                                z24 = true;
                            }
                            if (z19 && z24) {
                                z23 = true;
                            }
                            if (!z23) {
                                GameEngine.PrintLOG("Clicked button: actionActive: " + m2049b);
                                if (!m2049b) {
                                    this.curGameEngine.audio.m2411b(AudioEngine.f3866l, 0.8f);
                                } else {
                                    C0713c.m1940a(m2037f, action2, false, false);
                                    this.f4479ac = null;
                                    this.f4480ad = null;
                                    this.f4476a.f4672W = action2;
                                }
                            } else {
                                C0678e m1818v2 = this.f4476a.m1818v();
                                if (!action2.mo3613G()) {
                                    this.f4476a.m1885a(m1818v2, action2);
                                } else {
                                    this.f4476a.m1886a(m1818v2, action2.m3834L(), z23);
                                }
                                m1818v2.f4453g = true;
                                m1818v2.m2097a(action2.mo3819x());
                            }
                        } else if (action2.mo2698e() == EnumC0220u.f1448b) {
                            if (m2063a(action2)) {
                                this.curGameEngine.audio.m2411b(AudioEngine.f3866l, 0.8f);
                            } else if (!m2049b) {
                                this.curGameEngine.audio.m2411b(AudioEngine.f3866l, 0.8f);
                            } else {
                                this.curGameEngine.audio.m2411b(AudioEngine.f3861g, 0.8f);
                            }
                            C0713c.m1940a(m2037f, action2, false, false);
                            this.f4479ac = null;
                            this.f4480ad = null;
                            if (this.f4476a.f4672W == null) {
                                this.f4476a.f4697ac = false;
                            }
                            this.f4476a.f4671U = m2037f;
                            this.f4476a.f4672W = action2;
                            this.f4476a.f4675Z = 0.0f;
                            this.f4476a.f4705ak = -99.0f;
                            this.f4476a.f4706al = -99.0f;
                            if (!this.f4476a.f4674Y) {
                                this.f4476a.f4695aa = this.curGameEngine.f5854cH * this.curGameEngine.viewpointZoom;
                                this.f4476a.f4696ab = this.curGameEngine.f5855cI * this.curGameEngine.viewpointZoom;
                            }
                            this.f4476a.f4674Y = true;
                            this.curGameEngine.map.m4122d();
                        } else if (action2.mo2698e() == EnumC0220u.f1457k) {
                            C0713c.m1940a(m2037f, action2, false, false);
                            action2.mo3826c(m2037f);
                        } else if (action2.mo2698e() == EnumC0220u.f1455i) {
                            if (action2.mo3810A()) {
                                this.f4479ac = m2037f;
                                this.f4480ad = action2;
                                this.f4481ae = f23 + f19;
                                this.f4476a.f4672W = null;
                            }
                        } else {
                            throw new RuntimeException("unknown gui action:" + action2.mo2698e());
                        }
                    }
                    if (this.f4480ad == action2) {
                        z2 = m2049b;
                    }
                }
            }
            this.curGameEngine.graphics.mo136i();
            this.f4544aA.m4639f();
        }
        if (m2037f != null && m2037f == this.f4479ac) {
            if (this.f4480ad != null) {
                boolean z25 = true;
                if (GameEngine.isPC()) {
                    z25 = false;
                }
                boolean z26 = false;
                if (this.f4480ad.mo3594r()) {
                    z26 = true;
                }
                if (GameEngine.isPC() && this.f4480ad.mo2703h()) {
                    z26 = true;
                }
                if (z26) {
                    boolean z27 = true;
                    if (!z2) {
                        z27 = false;
                    }
                    if (this.f4476a.m1897a(this.f4480ad, z25, this.f4479ac, !z27, true, this.f4481ae)) {
                        this.f4479ac = null;
                    }
                }
            }
        } else {
            this.f4479ac = null;
        }
        if (GameEngine.isPC() && !z) {
            this.f4479ac = null;
            this.f4480ad = null;
        }
        return i3;
    }

    /* renamed from: i */
    float m2032i() {
        return (float) (CommonUtils.m1692b((this.curGameEngine.f5871cl / 14.0f) / this.curGameEngine.densityScale, 25.0f * this.curGameEngine.densityScale, 40.0f * this.curGameEngine.densityScale) * 0.9d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2068a(float f, int i) {
        boolean z = true;
        if (i == 0) {
            z = true;
        }
        if (InterfaceEngine.f4742a) {
            z = false;
        }
        if (this.f4476a.numberOfSelectedUnits > 0) {
            if (this.f4476a.f4734c != null && this.f4476a.numberOfSelectedUnits == 1 && this.f4476a.f4734c.selected) {
                z = false;
            }
            if (z) {
                if (this.f4476a.m1868b((int) ((this.curGameEngine.f5870ck - this.curGameEngine.f5836bW.f4853c) + 2.0f), this.curGameEngine.f5836bW.m1793b() + 2, (int) (this.curGameEngine.f5836bW.f4853c - 4.0f), (int) m2032i(), this.f4485ai, ButtonIds.unselectAllButton, false, Color.argb(140, 100, 100, 100)) && !this.f4476a.f4774N) {
                    this.f4476a.m1853d();
                    this.f4476a.m1837k();
                    this.f4476a.m1817w();
                }
            }
            Team team = null;
            boolean z2 = false;
            this.f4545aB.clear();
            Unit unit = null;
            Unit[] m485a = this.f4476a.f4809bJ.m485a();
            int size = this.f4476a.f4809bJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                Unit unit2 = m485a[i2];
                if (unit2.selected) {
                    unit = unit2;
                    if (this.f4476a.m1832m(unit2)) {
                        UnitType unitType = unit2.getUnitType();
                        Integer num = (Integer) this.f4545aB.get(unitType);
                        if (num == null) {
                            this.f4545aB.put(unitType, 1);
                        } else {
                            this.f4545aB.put(unitType, Integer.valueOf(num.intValue() + 1));
                        }
                        z2 = true;
                    } else {
                        team = unit2.team;
                    }
                }
            }
            boolean z3 = this.curGameEngine.editorMode;
            if (team != null && this.curGameEngine.playerTeam != null && team.m3941b(this.curGameEngine.playerTeam)) {
                z3 = true;
            }
            int m2033h = (int) m2033h();
            int i3 = m2033h + 2;
            int i4 = (int) (10.0f * this.curGameEngine.densityScale);
            float m1793b = this.curGameEngine.f5836bW.m1793b() + m2033h + 30;
            float f2 = (this.curGameEngine.f5870ck - this.curGameEngine.f5874cp) + i4;
            float f3 = m1793b + 5.0f;
            if (unit != null) {
                f3 = f3 + i3 + (i3 * i);
                if (this.f4476a.f4755o) {
                    f3 -= (2 * i3) * 0.4f;
                }
            }
            this.f4519w.set((int) f2, (int) f3, (int) ((f2 + this.curGameEngine.f5874cp) - (i4 * 2)), (int) (f3 + m2033h));
            boolean z4 = false;
            if (!InterfaceEngine.f4745bB) {
                if (i < 3 && !z2 && team != null) {
                    Paint paint = this.f4476a.f4719az;
                    if (this.curGameEngine.playerTeam.m3913d(team)) {
                        paint = this.f4476a.f4676aA;
                    }
                    this.f4476a.m1877a(m2064a(team), this.f4519w, paint, paint);
                    z4 = true;
                }
                if (this.f4476a.m1827p() == 1 && unit != null) {
                    if (unit.m3742co() <= 3 || (team != null && !z3)) {
                        String m2057a = m2057a(unit, false);
                        if (z4) {
                            m2057a = "\n" + ("\n" + ("\n" + m2057a));
                        }
                        Paint paint2 = this.f4513i;
                        paint2.m4721a();
                        paint2.setColor(Color.argb(50, 100, 100, 100));
                        this.f4476a.m1877a(m2057a, this.f4519w, this.f4476a.f4677aB, this.f4476a.f4677aB);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public String m2064a(Team team) {
        String str = VariableScope.nullOrMissingString;
        boolean z = false;
        if (this.curGameEngine.playerTeam.m3945b()) {
            z = true;
        } else if (this.curGameEngine.playerTeam.m3913d(team)) {
            str = str + this.f4486aj;
        } else if (this.curGameEngine.playerTeam.m3925c(team)) {
            str = str + this.f4487ak;
        } else {
            z = true;
        }
        if (z) {
            if (team == Team.f1346g) {
                str = str + this.f4488al;
            } else {
                str = str + "Team - " + team.getTeam();
            }
        }
        String str2 = str + "\n";
        if (team.playerName != null) {
            str2 = str2 + team.playerName;
        }
        if (!team.f1333t && this.curGameEngine.isNetworked() && team.m3876w()) {
            str2 = (str2 + "\n") + "(disconnected)";
        }
        return str2;
    }

    /* renamed from: a */
    public String m2057a(Unit unit, boolean z) {
        String str;
        String str2 = VariableScope.nullOrMissingString;
        if (z) {
            str2 = str2 + unit.getUnitType().mo3095e() + "\n";
        }
        if (unit.mo2862g() > 0.0f) {
            str = str2 + C0407b.m3398a(unit.m3748cK(), unit.hp / unit.maxHp).m3389a(true, true, 3, false);
        } else {
            str = str2 + ((int) Math.ceil(unit.hp)) + "/" + ((int) unit.maxHp) + "\n";
        }
        if (unit.maxShield != 0.0f) {
            str = str + "(" + ((int) unit.shield) + "/" + ((int) unit.maxShield) + ")\n";
        }
        C0407b m3734dm = unit.m3734dm();
        C0421e mo3174cw = unit.mo3174cw();
        if (m3734dm != null) {
            mo3174cw = C0421e.m3279d(mo3174cw);
            mo3174cw.m3312a(m3734dm);
        }
        if (!mo3174cw.m3287c()) {
            Iterator it = mo3174cw.f2635b.iterator();
            while (it.hasNext()) {
                C0420d c0420d = (C0420d) it.next();
                if (c0420d.f2633b != 0.0d && !c0420d.f2632a.m3344a()) {
                    str = str + c0420d.f2632a.m3342a(c0420d.f2633b, true, false) + "\n";
                }
            }
        }
        return CommonUtils.m1625j(str);
    }

    /* renamed from: a */
    public static String m2060a(Action action, boolean z) {
        String str;
        AbstractC0222w abstractC0222w;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = VariableScope.nullOrMissingString;
        if (action instanceof AbstractC0222w) {
            if (((AbstractC0222w) action).getBuildSpeed() < 1.0f) {
                GameEngine game = GameEngine.getInstance();
                float f = -1.0f;
                Unit[] m485a = game.interfaceEngine.f4809bJ.m485a();
                int size = game.interfaceEngine.f4809bJ.size();
                for (int i = 0; i < size; i++) {
                    float mo3175cu = m485a[i].mo3175cu();
                    if (f == -1.0f || mo3175cu < f) {
                        f = mo3175cu;
                    }
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                str2 = str2 + CommonUtils.m1638g((1.0f / ((abstractC0222w.getBuildSpeed() * f) * 60.0f)) + 1.0E-4f) + str;
            }
        }
        return CommonUtils.m1708a(str2, str);
    }

    /* renamed from: a */
    public static String m2056a(Unit unit, boolean unit2, boolean z, boolean z2) {
        String str;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = VariableScope.nullOrMissingString;
        C0433j c0433j = null;
        CustomUnitMetadata customUnitMetadata = null;
        if (unit instanceof C0433j) {
            c0433j = (C0433j) unit;
            customUnitMetadata = c0433j.customUnitMetadataA;
        }
        if (unit2) {
            str2 = str2 + unit.getUnitType().mo3095e() + str;
        }
        if (customUnitMetadata == null || !customUnitMetadata.f2758aI) {
            if (!z2) {
                str2 = str2 + "HP: " + ((int) Math.ceil(unit.hp)) + "/" + ((int) unit.maxHp) + str;
            } else {
                str2 = str2 + "HP: " + ((int) unit.maxHp) + str;
            }
        }
        if (unit.maxShield != 0.0f) {
            if (!z2) {
                str2 = str2 + "Shield: " + ((int) unit.shield) + "/" + ((int) unit.maxShield) + str;
            } else {
                str2 = str2 + "Shield: " + ((int) unit.maxShield) + str;
            }
        }
        if (c0433j != null) {
            float armour = c0433j.f2703x.armour;
            if (armour >= 1.0f) {
                str2 = str2 + "Armour: " + ((int) armour) + str;
            }
        }
        C0407b m3734dm = unit.m3734dm();
        float income = unit.getIncome();
        if (m3734dm != null) {
            income += m3734dm.m3406a();
        }
        if (income != 0.0f) {
            if (income < 0.0f) {
                str2 = str2 + "Income: -$" + CommonUtils.m1740a(-income, 1) + str;
            } else {
                str2 = str2 + "Income: +$" + CommonUtils.m1740a(income, 1) + str;
            }
        }
        if (unit instanceof OrderableUnit) {
            OrderableUnit orderableUnit = (OrderableUnit) unit;
            if (orderableUnit.mo2520bc() != 0.0f && !z2) {
                str2 = str2 + "Energy: " + CommonUtils.m1645f(unit.f1549cs) + "/" + CommonUtils.m1645f(orderableUnit.mo2520bc()) + str;
            }
            float moveSpeed = orderableUnit.getMoveSpeed();
            if (!orderableUnit.mo2580aQ()) {
                moveSpeed = 0.0f;
            }
            if (moveSpeed != 0.0f) {
                str2 = str2 + "Speed: " + CommonUtils.m1645f(moveSpeed) + str;
            }
            if (orderableUnit.canAttack()) {
                ArrayList m2574aW = orderableUnit.m2574aW();
                if (m2574aW.size() > 0) {
                    String str3 = str2 + "Attack: ";
                    boolean z3 = true;
                    Iterator it = m2574aW.iterator();
                    while (it.hasNext()) {
                        C0587u c0587u = (C0587u) it.next();
                        if (!z3) {
                            str3 = str3 + ", ";
                        }
                        z3 = false;
                        String str4 = str3 + CommonUtils.m1645f(c0587u.directDamage);
                        if (c0587u.f3791d > 1) {
                            str4 = str4 + "x" + c0587u.f3791d;
                        }
                        str3 = str4 + "/" + CommonUtils.m1645f(c0587u.m2429a()) + "s";
                    }
                    str2 = str3 + str;
                }
            }
            float maxAttackRange = orderableUnit.getMaxAttackRange();
            if (!orderableUnit.canAttack()) {
                maxAttackRange = 0.0f;
            }
            if (maxAttackRange != 0.0f) {
                String Armour = str;
                str2 = str2 + "Range: " + CommonUtils.m1645f(maxAttackRange) + Armour;
            }
            if (z2 && orderableUnit.mo2983ci()) {
                str2 = str2 + "Upgradable" + str;
            }
        }
        if (!z2 && unit.f1537cL > 0) {
            str2 = str2 + "Kills: " + unit.f1537cL + str;
        }
        boolean z4 = false;
        if (GameEngine.getInstance().debugTempMode) {
            str2 = ((str2 + "\n") + "--Debug--" + str) + "name: " + unit.getUnitType().mo3087i() + str;
            if (unit.GameObjectID != 0) {
                str2 = str2 + "id: " + unit.GameObjectID + str;
            }
            if (unit.f1553cw != 0) {
                String str5 = VariableScope.nullOrMissingString;
                for (int i = 0; i < 32; i++) {
                    if (C0407b.m3404a(unit.f1553cw, i)) {
                        if (str5.length() > 0) {
                            str5 = str5 + ",";
                        }
                        str5 = str5 + i;
                    }
                }
                str2 = str2 + "flags: " + str5 + str;
            }
            if (unit.f1552cv != 0) {
                str2 = str2 + "ammo: " + unit.f1552cv + str;
            }
            if (!unit.f1621cg) {
                str2 = (str2 + "x: " + CommonUtils.m1645f(unit.x) + str) + "y: " + CommonUtils.m1645f(unit.y) + str;
            }
            if (unit.f1614bT != 0.0f || unit.f1615bU != 0.0f) {
                str2 = str2 + "x/y speed: " + CommonUtils.m1645f(unit.f1614bT) + ", " + CommonUtils.m1645f(unit.f1615bU) + str;
            }
            if (!unit.f1621cg) {
                str2 = (str2 + "height: " + CommonUtils.m1645f(unit.height) + str) + "dir: " + CommonUtils.m1645f(unit.direction) + str;
            }
            if (unit.built < 1.0f) {
                str2 = str2 + "built: " + CommonUtils.m1645f(unit.built) + str;
            }
            if (unit instanceof C0433j) {
                C0433j c0433j2 = (C0433j) unit;
                str2 = (str2 + "frame: " + c0433j2.f2681a + str) + "drawLayer: " + c0433j2.f6366ed + str;
                if (c0433j2.mo3167da() != null) {
                    str2 = str2 + "tags: " + c0433j2.mo3167da() + str;
                }
                if (c0433j2.f1630cF != null) {
                    str2 = str2 + "attachedTo: " + c0433j2.f1630cF.m3741cy() + str;
                }
                if (c0433j2.f1599bm != null && !c0433j2.f1599bm.dead) {
                    str2 = str2 + "customTarget1: " + c0433j2.f1599bm.m3741cy() + str;
                }
                if (c0433j2.f1600bn != null && !c0433j2.f1600bn.dead) {
                    str2 = str2 + "customTarget2: " + c0433j2.f1600bn.m3741cy() + str;
                }
                if (c0433j2.f1601bs != -9999) {
                    str2 = str2 + "customTimer: " + CommonUtils.m1638g(c0433j2.f1601bs / 1000.0f) + str;
                }
                if (c0433j2.f1526bo != null && !c0433j2.f1526bo.isEmpty()) {
                    str2 = str2 + "-- memory --: " + str + c0433j2.f1526bo.debugMemory(true, true) + str;
                }
            }
            z4 = true;
        }
        C0421e mo1776db = unit.mo1776db();
        if (mo1776db != null && !mo1776db.m3287c()) {
            String m3298a = mo1776db.m3298a(z, true, 10, z4, false);
            if (!m3298a.equals(VariableScope.nullOrMissingString)) {
                str2 = str2 + m3298a + str;
            }
        }
        return CommonUtils.m1708a(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m2031j() {
        Iterator it = this.f4546aC.iterator();
        while (it.hasNext()) {
            ((C0703ac) it.next()).f4625h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m2030k() {
        Iterator it = this.f4546aC.iterator();
        while (it.hasNext()) {
            ((C0703ac) it.next()).m1972b();
        }
        this.f4534ao = null;
        this.f4535ap = 0.0f;
    }

    /* renamed from: a */
    void m2065a(int i, int i2, int i3, String str, String str2, Paint paint, float f) {
        int i4 = (int) (i3 * 2.5d);
        int i5 = (int) (40.0f * this.curGameEngine.densityScale);
        int i6 = i + (i3 / 2);
        int i7 = (int) ((i2 - i5) - (35.0f * this.curGameEngine.densityScale));
        this.f4547aD.set(i6 - (i4 / 2), i7, i4, i5);
        this.f4476a.drawButton(this.f4547aD.left, this.f4547aD.top, this.f4547aD.right, this.f4547aD.bottom, VariableScope.nullOrMissingString, Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100, 100), this.f4476a.f4716aw, false);
        this.f4519w.set(this.f4547aD.left, this.f4547aD.top, this.f4547aD.right, this.f4547aD.bottom);
        Rect rect = this.f4519w;
        rect.right = (int) (rect.right * f);
        this.curGameEngine.graphics.mo147c(this.f4519w, paint);
        this.curGameEngine.graphics.drawText(str, i6, i7 + ((this.f4476a.f4716aw.m4678k() + 5.0f) * 1.0f), this.f4476a.f4716aw);
        this.curGameEngine.graphics.drawText(str2, i6, i7 + ((this.f4476a.f4716aw.m4678k() + 5.0f) * 2.0f), this.f4476a.f4716aw);
    }

    /* renamed from: l */
    void m2029l() {
        this.f4548aF.clear();
        this.f4548aF.add(new AbstractC0712b("Finish game") { // from class: com.corrodinggames.rts.gameFramework.e.a.1
            @Override // com.corrodinggames.rts.gameFramework.gui.AbstractC0712b
            /* renamed from: a */
            void mo1944a() {
                BattleInterface.this.curGameEngine.f5980du = true;
            }
        });
        this.f4548aF.add(new AbstractC0712b("Keep playing") { // from class: com.corrodinggames.rts.gameFramework.e.a.2
            @Override // com.corrodinggames.rts.gameFramework.gui.AbstractC0712b
            /* renamed from: a */
            void mo1944a() {
                BattleInterface.this.curGameEngine.f5977dr = true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2039e(float f) {
        String str;
        boolean z = false;
        if ((this.curGameEngine.f5976dq || this.curGameEngine.f5979dt) && !this.curGameEngine.f5977dr) {
            z = true;
        }
        if (!this.curGameEngine.f5976dq) {
            this.f4549aG = false;
        } else if (!this.f4549aG) {
            this.f4549aG = true;
            if (!this.curGameEngine.f5936at && this.curGameEngine.curSettings.numberOfWins >= 5 && !this.curGameEngine.curSettings.rateGameShown && GameEngine.f5902aw) {
                this.f4552aN = true;
                this.curGameEngine.curSettings.rateGameShown = true;
                this.curGameEngine.curSettings.save();
            }
        }
        if (!z) {
            this.f4550aH = 0.0f;
            this.f4478aJ = 0;
        }
        if (!z || this.curGameEngine.frameNumber >= 120 || this.curGameEngine.interfaceEngine.f4734c != null) {
        }
        if (z && !this.f4476a.f4756p) {
            this.f4550aH += f;
            if (this.curGameEngine.frameNumber < 120) {
                this.f4550aH = 100000.0f;
            }
            boolean z2 = this.f4550aH > 80.0f;
            boolean z3 = this.f4550aH > 100.0f;
            boolean z4 = this.f4550aH > 160.0f;
            if (this.f4478aJ == 0) {
                this.f4478aJ = 1;
            }
            int m899a = this.curGameEngine.m899a(210);
            this.f4519w.left = (int) ((this.curGameEngine.f5851cE / 2.0f) - (m899a / 2));
            this.f4519w.right = (int) ((this.curGameEngine.f5851cE / 2.0f) + (m899a / 2));
            int m899a2 = this.curGameEngine.m899a(30);
            int m899a3 = m899a2 + this.curGameEngine.m899a(30);
            int m899a4 = this.curGameEngine.m899a(40) + (m899a3 * this.f4548aF.size());
            float f2 = this.curGameEngine.f5873co - (m899a4 / 2);
            if (f2 > 50.0f) {
                f2 /= 2.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            this.f4519w.top = (int) f2;
            this.f4519w.bottom = this.f4519w.top + m899a4;
            if (z2) {
                this.curGameEngine.graphics.mo193a(this.f4476a.f4790bf, this.f4519w, (Paint) null);
                this.curGameEngine.graphics.drawRect(this.f4519w, this.f4476a.displayTextBackgroundPaintBorder);
            }
            Rect rect = new Rect(this.f4519w);
            int m899a5 = this.f4519w.top + this.curGameEngine.m899a(20);
            int m899a6 = this.curGameEngine.m899a(140);
            int i = (int) ((this.curGameEngine.f5851cE / 2.0f) - (m899a6 / 2));
            int argb = Color.argb(140, 100, 100, 100);
            int i2 = i + (m899a6 / 2);
            Paint paint = this.f4498q;
            String str2 = "Victory!";
            if (this.curGameEngine.f5979dt) {
                str2 = "Defeat";
            }
            float f3 = 1.0f;
            if (this.f4550aH < 95.0f) {
                f3 = this.f4550aH / 95.0f;
            }
            int cos = (int) (m899a5 - (CommonUtils.cos(f3 * 90.0f) * 100.0f));
            paint.m4705a(str2, 0, str2.length(), this.f4522z);
            this.curGameEngine.graphics.drawText(str2, i2, cos - ((paint.m4677l() + paint.m4676m()) / 2.0f), paint);
            if (this.f4550aH < 100.0f && !this.curGameEngine.f5979dt) {
                this.f4551aI += f;
                if (this.f4551aI > 0.5f) {
                    this.f4551aI = 0.0f;
                    this.curGameEngine.effects.m2210b(EnumC0668h.f4401e);
                    this.curGameEngine.effects.m2218b();
                    EffectObject _emitLight = this.curGameEngine.effects._emitLight(0.0f, 0.0f, 0.0f, Color.argb(255, CommonUtils.m1737a(0, 255), CommonUtils.m1737a(0, 255), CommonUtils.m1737a(0, 255)));
                    if (_emitLight != null) {
                        _emitLight.f4328o = true;
                        _emitLight.f4289J = i2 + CommonUtils.rnd(-70.0f, 70.0f);
                        _emitLight.f4290K = cos + CommonUtils.rnd(-15.0f, 15.0f);
                        _emitLight.f4290K += this.curGameEngine.f5873co / 2.0f;
                        _emitLight.f4291L += this.curGameEngine.f5873co / 2.0f;
                        _emitLight.timer = CommonUtils.rnd(140.0f, 380.0f);
                        _emitLight.startTimer = _emitLight.timer;
                        _emitLight.fadeOut = true;
                        _emitLight.f4332t = true;
                        _emitLight.f4333u = 5.0f;
                        _emitLight.startingAlpha = 2.0f;
                        _emitLight.ySpeed = CommonUtils.rnd(-2.7f, 2.7f);
                        _emitLight.f4296Q = CommonUtils.rnd(-12.7f, 12.7f);
                        _emitLight.f4287H = 0.4f;
                        _emitLight.f4286G = 0.2f;
                        _emitLight.f4298S = CommonUtils.rnd(2.0f, 4.0f);
                        _emitLight.f4352x = 2.0f;
                        _emitLight.f4335w = true;
                    }
                }
            }
            int height = m899a5 + this.f4522z.height();
            int i3 = rect.bottom + 30;
            this.f4500s.m4705a("123|", 0, "123|".length(), this.f4522z);
            float height2 = this.f4522z.height() + 6;
            float f4 = 1.5f;
            Iterator it = this.f4555aQ.iterator();
            while (it.hasNext()) {
                C0715e c0715e = (C0715e) it.next();
                if (z4) {
                    if (c0715e.f4662d != 1.0f && f4 > 0.0f) {
                        c0715e.f4662d = CommonUtils.m1744a(c0715e.f4662d, 1.0f, 0.01f * f4 * f);
                        f4 -= 1.0f - c0715e.f4662d;
                    }
                    float m1692b = CommonUtils.m1692b(c0715e.f4662d, 0.0f, 1.0f);
                    if (c0715e.f4660b != null) {
                        str = c0715e.f4660b;
                    } else {
                        str = VariableScope.nullOrMissingString + ((int) (c0715e.f4661c * m1692b));
                        if (m1692b <= 0.0f) {
                            str = " ";
                        }
                    }
                    String str3 = c0715e.f4659a;
                    float m1692b2 = CommonUtils.m1692b(c0715e.f4662d * 2.2f, 0.0f, 1.0f);
                    int i4 = 0;
                    if (m1692b2 > 0.0f) {
                        i4 = (int) (str3.length() * m1692b2);
                    }
                    int m1687b = CommonUtils.m1687b(i4, 0, str3.length());
                    String str4 = VariableScope.nullOrMissingString;
                    if (m1687b > 0 && m1687b < str3.length() - 1) {
                        str4 = "_";
                    }
                    this.curGameEngine.graphics.drawText(str3.substring(0, m1687b) + str4 + CommonUtils.m1655d(" ", (str3.length() + str4.length()) - m1687b), i2 - (8.0f * this.f4500s.m4678k()), i3, this.f4500s);
                    this.curGameEngine.graphics.drawText(str, i2 + (8.0f * this.f4500s.m4678k()), i3, this.f4501t);
                    i3 = (int) (i3 + height2);
                }
            }
            for (int i5 = 0; i5 < this.f4548aF.size(); i5++) {
                if (z3) {
                    AbstractC0712b abstractC0712b = (AbstractC0712b) this.f4548aF.get(i5);
                    if (this.f4476a.m1907a(i, height, m899a6, m899a2, abstractC0712b.m1943b(), ButtonIds.none, false, argb, this.f4476a.f4717ax)) {
                        this.f4552aN = false;
                        abstractC0712b.mo1944a();
                    }
                }
                height += m899a3;
            }
            if (this.f4552aN) {
                m2036f(f);
            }
        }
    }

    /* renamed from: f */
    void m2036f(float f) {
        int m899a = this.curGameEngine.m899a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        int i = (int) ((this.curGameEngine.f5851cE / 2.0f) - (m899a / 2));
        int m899a2 = this.curGameEngine.m899a(120);
        int i2 = (int) (this.curGameEngine.f5853cG - m899a2);
        this.f4519w.set(i, i2, m899a, m899a2);
        this.curGameEngine.graphics.drawRect(this.f4519w, this.f4476a.displayTextBackgroundPaintBorder);
        int i3 = i + (m899a / 2);
        Paint paint = this.f4498q;
        String str = f4506aK;
        paint.m4705a(str, 0, str.length(), this.f4522z);
        this.curGameEngine.graphics.drawText(str, i3, i2 - ((paint.m4677l() + paint.m4676m()) / 2.0f), paint);
        int height = i2 + this.f4522z.height();
        int m899a3 = this.curGameEngine.m899a(70);
        int m899a4 = this.curGameEngine.m899a(30);
        int m899a5 = ((i + (m899a / 2)) - this.curGameEngine.m899a(10)) - m899a3;
        int argb = Color.argb(140, 100, 100, 100);
        if (this.f4476a.m1907a(m899a5, height, m899a3, m899a4, f4507aL, ButtonIds.none, false, argb, this.f4476a.f4717ax)) {
            this.f4552aN = false;
            gameView gameView = this.curGameEngine.gameViewA;
            if (gameView == null) {
                GameEngine.log("showRateNow: gameView==null");
                return;
            }
            inGameActivity inGameActivity = gameView.getInGameActivity();
            if (inGameActivity == null) {
                GameEngine.log("showRateNow: inGameActivity==null");
                return;
            }
            inGameActivity.m4420l();
        }
        if (this.f4476a.m1907a(i + (m899a / 2) + this.curGameEngine.m899a(10), height, m899a3, m899a4, f4508aM, ButtonIds.none, false, argb, this.f4476a.f4717ax)) {
            this.f4552aN = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2067a(float f, boolean z) {
        int i;
        int i2;
        float f2 = this.curGameEngine.densityScale * 0.7f;
        if (GameEngine.isIOS() && f2 < 0.7d) {
            f2 = 0.7f;
        }
        int width = (int) (this.pause.getWidth() * f2);
        int i3 = 4 + (width / 2);
        int i4 = 4 + (width / 2);
        if (this.curGameEngine.m822g(111)) {
            boolean z2 = false;
            if (!this.f4476a.f4756p) {
                z2 = this.f4476a.m1837k();
            }
            if (!z2) {
                this.f4476a.f4756p = !this.f4476a.f4756p;
            }
        }
        if (this.f4476a.f4756p) {
            this.f4477aE += 0.008f * f;
            if (this.f4477aE > 1.0f) {
                this.f4477aE = 0.0f;
            }
            this.f4512h.setAlpha(150 + ((int) (100.0f * CommonUtils.sin(this.f4477aE * 180.0f))));
        } else {
            this.f4477aE = 0.0f;
            this.f4512h.setAlpha(80);
        }
        this.f4522z.set(i3, i4, i3 + width, i4 + width);
        this.f4522z.m4666a(-(width / 2), -(width / 2));
        if (z) {
            this.curGameEngine.graphics.mo195a(this.pause, this.f4522z.left, this.f4522z.top, this.f4512h, 0.0f, f2);
            if (this.curGameEngine.curSettings.newRender) {
                this.f4527E.set(this.f4522z.centerX() - 4, this.f4522z.centerY() - 4, this.f4522z.centerX() + 4, this.f4522z.centerY() + 4);
                this.f4518p.m4717a(100, 0, 155, 0);
                this.curGameEngine.graphics.drawRect(this.f4527E, this.f4518p);
            }
        }
        if (GameEngine.isIOS()) {
            CommonUtils.m1729a(this.f4522z, 4.0f);
        }
        if (this.f4476a.gameTouchClick && !this.f4476a.f4774N && this.f4522z.contains((int) this.f4476a.gameTouchLastX, (int) this.f4476a.gameTouchLastY)) {
            this.f4476a.gameTouchClick = false;
            this.f4476a.f4756p = !this.f4476a.f4756p;
        }
        if (this.curGameEngine.replayEngine.isPlaying()) {
            this.f4512h.setAlpha(80);
            if (this.curGameEngine.replayEngine.f4101t != 1) {
                this.f4512h.setAlpha(200);
            }
            int i5 = (int) (this.fast.height * this.curGameEngine.densityScale * 1.6f);
            int i6 = (int) (this.curGameEngine.f5851cE / 2.0f);
            int m4678k = 7 + ((int) this.f4476a.f4718ay.m4678k());
            this.curGameEngine.graphics.drawText(CommonUtils.m1733a(this.curGameEngine.f5845by / 1000), i6, m4678k, this.f4476a.f4718ay);
            int i7 = m4678k + (i5 / 2) + 10;
            int i8 = i6 + (i5 / 2) + 5;
            this.f4522z.set(i8, i7, i8 + i5, i7 + i5);
            this.f4522z.m4666a((-this.f4522z.width()) / 2, (-this.f4522z.height()) / 2);
            if (z) {
                this.curGameEngine.graphics.mo195a(this.fast, this.f4522z.left, this.f4522z.top, this.f4512h, 0.0f, i5 / i);
            }
            if (this.f4476a.gameTouchClick && !this.f4476a.f4774N && this.f4522z.contains((int) this.f4476a.gameTouchLastX, (int) this.f4476a.gameTouchLastY)) {
                this.f4476a.gameTouchClick = false;
                this.curGameEngine.replayEngine.m2312b();
            }
            if (this.curGameEngine.gameSpeed != 1.0f && z) {
                this.curGameEngine.graphics.drawText("x" + this.curGameEngine.gameSpeed, this.f4522z.centerX() + (i5 / 2), this.f4522z.centerY(), this.f4476a.f4716aw);
            }
            BitmapOrTexture bitmapOrTexture = this.replay_pause;
            int i9 = (int) (bitmapOrTexture.height * this.curGameEngine.densityScale * 1.6f);
            int i10 = i8 - (i9 + 5);
            this.f4522z.set(i10, i7, i10 + i9, i7 + i9);
            this.f4522z.m4666a((-this.f4522z.width()) / 2, (-this.f4522z.height()) / 2);
            if (z) {
                this.curGameEngine.graphics.mo195a(bitmapOrTexture, this.f4522z.left, this.f4522z.top, this.f4512h, 0.0f, i9 / i2);
            }
            if (this.f4476a.gameTouchClick && !this.f4476a.f4774N && this.f4522z.contains((int) this.f4476a.gameTouchLastX, (int) this.f4476a.gameTouchLastY)) {
                this.f4476a.gameTouchClick = false;
                this.curGameEngine.replayEngine.pause();
            }
        }
        if (this.f4476a.f4756p) {
            this.curGameEngine.f5859cT = false;
            int m899a = this.curGameEngine.m899a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
            this.f4519w.left = (int) ((this.curGameEngine.f5851cE / 2.0f) - (m899a / 2));
            this.f4519w.right = (int) ((this.curGameEngine.f5851cE / 2.0f) + (m899a / 2));
            int m899a2 = this.curGameEngine.m899a(30);
            int m899a3 = m899a2 + this.curGameEngine.m899a(15);
            Menu m2026o = m2026o();
            int m899a4 = this.curGameEngine.m899a(40) + (m899a3 * (1 + m2026o.size()));
            this.f4519w.top = (int) (this.curGameEngine.f5873co - (m899a4 / 2));
            this.f4519w.bottom = (int) (this.curGameEngine.f5873co + (m899a4 / 2));
            if (z) {
                this.curGameEngine.graphics.mo193a(this.f4476a.f4790bf, this.f4519w, (Paint) null);
                this.curGameEngine.graphics.drawRect(this.f4519w, this.f4476a.displayTextBackgroundPaintBorder);
            }
            int m899a5 = this.f4519w.top + this.curGameEngine.m899a(40);
            int m899a6 = this.curGameEngine.m899a(140);
            int i11 = (int) ((this.curGameEngine.f5851cE / 2.0f) - (m899a6 / 2));
            int argb = Color.argb(140, 100, 100, 100);
            if (this.f4476a.m1907a(i11, m899a5, m899a6, m899a2, LangLocale.getI18NText("menus.ingame.resume", new Object[0]), ButtonIds.none, false, argb, this.f4476a.f4717ax)) {
                this.f4476a.gameTouchClick = false;
                this.f4476a.f4780aP = 40.0f;
                this.f4476a.f4756p = false;
            }
            int i12 = m899a5 + m899a3;
            for (int i13 = 0; i13 < m2026o.size(); i13++) {
                MenuItem item = m2026o.getItem(i13);
                if (this.f4476a.m1907a(i11, i12, m899a6, m899a2, item.getTitle().toString(), ButtonIds.none, false, argb, this.f4476a.f4717ax)) {
                    m2066a(item.getItemId());
                    this.f4476a.gameTouchClick = false;
                    this.f4476a.f4780aP = 40.0f;
                }
                i12 += m899a3;
            }
        }
    }

    /* renamed from: m */
    public void m2028m() {
        m2066a(20);
    }

    /* renamed from: n */
    public void m2027n() {
        m2066a(16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2066a(int i) {
        gameView gameview = this.curGameEngine.gameViewA;
        if (gameview == null) {
            GameEngine.log("selectMenuOption: gameView==null");
            return;
        }
        inGameActivity inGameActivity = gameview.getInGameActivity();
        if (inGameActivity == null) {
            GameEngine.log("selectMenuOption: inGameActivity==null");
        } else {
            inGameActivity.mo114c(i);
        }
    }

    /* renamed from: o */
    Menu m2026o() {
        this.f4554aP.clear();
        gameView gameview = this.curGameEngine.gameViewA;
        if (gameview == null) {
            GameEngine.log("selectMenuOption: gameView==null");
            return this.f4554aP;
        }
        inGameActivity inGameActivity = gameview.getInGameActivity();
        if (inGameActivity == null) {
            GameEngine.log("selectMenuOption: inGameActivity==null");
            return this.f4554aP;
        }
        inGameActivity.mo4428a(this.f4554aP);
        return this.f4554aP;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m2034g(float f) {
        String str;
        int i = (int) (this.curGameEngine.f5853cG - (30.0f * this.curGameEngine.densityScale));
        int i2 = (int) ((this.curGameEngine.f5870ck - this.curGameEngine.f5874cp) + 10.0f);
        int i3 = ((int) (this.curGameEngine.f5874cp - 20.0f)) / 3;
        int i4 = i3 - 5;
        for (int i5 = 0; i5 < this.f4546aC.size(); i5++) {
            C0703ac c0703ac = (C0703ac) this.f4546aC.get(i5);
            if (c0703ac.f4625h) {
                c0703ac.m1969e();
                c0703ac.f4625h = false;
            }
            c0703ac.m1970d();
            if (this.curGameEngine.curSettings.keyboardSupport && i5 < this.curGameEngine.f5833bT.f3901ah.length) {
                if (this.curGameEngine.f5833bT.f3903aj[i5].m2379a()) {
                    c0703ac.m1972b();
                    c0703ac.m1971c();
                }
                if (this.curGameEngine.f5833bT.f3902ai[i5].m2379a()) {
                    this.f4476a.m1837k();
                    c0703ac.m1974a();
                }
                if (this.curGameEngine.f5833bT.f3901ah[i5].m2379a()) {
                    this.f4476a.m1837k();
                    this.f4476a.m1817w();
                    c0703ac.m1974a();
                }
            }
            if (this.curGameEngine.curSettings.showUnitGroups && i5 < 3) {
                if (c0703ac.f4618a.size() == 0) {
                    if (this.f4476a.f4804by) {
                        str = "Empty";
                    } else {
                        str = "(" + (i5 + 1) + ")";
                    }
                } else {
                    str = VariableScope.nullOrMissingString + c0703ac.f4618a.size();
                }
                boolean z = false;
                c0703ac.f4621d = CommonUtils.toZero(c0703ac.f4621d, 0.01f * f);
                c0703ac.f4622e = CommonUtils.toZero(c0703ac.f4622e, 0.01f * f);
                c0703ac.f4623f = CommonUtils.toZero(c0703ac.f4623f, 0.01f * f);
                if (this.f4476a.m1908a(i2, i, i4, (int) (31.0f * this.curGameEngine.densityScale), str, ButtonIds.none, true, Color.argb(50, (int) (100.0f + (c0703ac.f4623f * 100.0f)), (int) (100.0f + (c0703ac.f4622e * 100.0f)), (int) (100.0f + (c0703ac.f4621d * 100.0f)))) && this.f4476a.f4672W == null && !this.f4476a.f4774N) {
                    z = true;
                    c0703ac.f4619b += f;
                    this.f4476a.m1853d();
                    float f2 = 1.0f;
                    this.f4513i.m4721a();
                    this.f4513i.setColor(Color.argb(120, 200, 0, 0));
                    if (c0703ac.f4619b < 50.0f) {
                        f2 = c0703ac.f4619b / 50.0f;
                        this.f4513i.setColor(Color.argb((int) (150.0f + (f2 * 40.0f)), 0, 200, 0));
                        m2065a(i2, i, i4, "Select Group", "(Hold for more..)", this.f4513i, f2);
                    } else if (c0703ac.f4619b < 100.0f) {
                        f2 = (c0703ac.f4619b - 50.0f) / 50.0f;
                        this.f4513i.setColor(Color.argb((int) (150.0f + (f2 * 40.0f)), 200, 0, 0));
                        m2065a(i2, i, i4, "Add to Group", "(Hold for more..)", this.f4513i, f2);
                    } else {
                        m2065a(i2, i, i4, "Replace Group", VariableScope.nullOrMissingString, this.f4513i, 0.0f);
                    }
                    int i6 = (int) (31.0f * this.curGameEngine.densityScale);
                    this.f4519w.set(i2, (int) ((i + i6) - (i6 * f2)), i2 + i4, i + i6);
                    this.curGameEngine.graphics.drawRect(this.f4519w, this.f4513i);
                }
                if (!z) {
                    if (c0703ac.f4619b != 0.0f && !this.f4476a.gameTouching) {
                        if (c0703ac.f4619b > 100.0f) {
                            c0703ac.m1972b();
                            c0703ac.m1971c();
                            c0703ac.f4623f = 1.0f;
                        } else if (c0703ac.f4619b > 50.0f) {
                            c0703ac.m1971c();
                            this.f4476a.m1837k();
                            this.f4476a.m1817w();
                            c0703ac.m1974a();
                            c0703ac.f4622e = 1.0f;
                        } else if (c0703ac.f4618a.size() != 0) {
                            this.f4476a.m1837k();
                            this.f4476a.m1817w();
                            c0703ac.m1974a();
                            c0703ac.f4621d = 1.0f;
                        } else {
                            c0703ac.m1972b();
                            c0703ac.m1971c();
                            c0703ac.f4622e = 1.0f;
                        }
                    }
                    if (!z) {
                        c0703ac.f4619b = 0.0f;
                    }
                }
                i2 += i3;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeInt(this.f4546aC.size());
        Iterator it = this.f4546aC.iterator();
        while (it.hasNext()) {
            ((C0703ac) it.next()).writeOut(outputNetStream);
        }
        outputNetStream.writeByte(0);
    }

    /* renamed from: a */
    public void m2054a(InputNetStream inputNetStream, boolean z) {
        if (!z) {
            this.f4546aC.clear();
        }
        int readInt = inputNetStream.readInt();
        int i = 0;
        while (i < readInt) {
            C0703ac c0703ac = new C0703ac(this, i < 3);
            c0703ac.m1973a(inputNetStream);
            if (!z) {
                this.f4546aC.add(c0703ac);
            }
            i++;
        }
        inputNetStream.readByte();
    }

    /* renamed from: p */
    public void m2025p() {
        this.f4555aQ = C0715e.m1932a();
    }

    /* renamed from: q */
    public void m2024q() {
        this.f4555aQ = C0715e.m1932a();
    }
}
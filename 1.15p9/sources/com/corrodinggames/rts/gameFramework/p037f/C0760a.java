package com.corrodinggames.rts.gameFramework.p037f;

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
import com.corrodinggames.rts.appFramework.ActivityC0097g;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0318c;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0232aa;
import com.corrodinggames.rts.game.units.EditorOrBuilder;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0438e;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0209d;
import com.corrodinggames.rts.game.units.p013a.C0212g;
import com.corrodinggames.rts.game.units.p013a.C0213h;
import com.corrodinggames.rts.game.units.p013a.C0219n;
import com.corrodinggames.rts.game.units.p013a.C0230y;
import com.corrodinggames.rts.game.units.p013a.C0231z;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.game.units.p028g.C0554e;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0639ad;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AudioEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p043k.C0913a;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0924aa;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a.class */
public class C0760a extends AbstractC0726bk {

    /* renamed from: a */
    C0797f f4903a;

    /* renamed from: b */
    GameEngine f4904b;

    /* renamed from: e */
    public boolean f4905e;

    /* renamed from: f */
    public float f4906f;

    /* renamed from: n */
    C0930ag f4907n;

    /* renamed from: o */
    C0930ag f4908o;

    /* renamed from: q */
    Paint f4909q;

    /* renamed from: r */
    Paint f4910r;

    /* renamed from: s */
    Paint f4911s;

    /* renamed from: t */
    Paint f4912t;

    /* renamed from: u */
    Paint f4913u;

    /* renamed from: v */
    Paint f4914v;

    /* renamed from: G */
    boolean f4915G;

    /* renamed from: H */
    float f4916H;

    /* renamed from: I */
    float f4917I;

    /* renamed from: J */
    float f4918J;

    /* renamed from: K */
    int f4919K;

    /* renamed from: L */
    boolean f4920L;

    /* renamed from: M */
    float f4921M;

    /* renamed from: N */
    float f4922N;

    /* renamed from: O */
    float f4923O;

    /* renamed from: P */
    float f4924P;

    /* renamed from: Q */
    float f4925Q;

    /* renamed from: R */
    float f4926R;

    /* renamed from: S */
    int f4927S;

    /* renamed from: T */
    float f4928T;

    /* renamed from: U */
    float f4929U;

    /* renamed from: ac */
    Unit f4930ac;

    /* renamed from: ad */
    Action f4931ad;

    /* renamed from: ae */
    float f4932ae;

    /* renamed from: af */
    long f4933af;

    /* renamed from: ag */
    float f4934ag;

    /* renamed from: ah */
    float f4935ah;

    /* renamed from: ai */
    String f4936ai;

    /* renamed from: aj */
    String f4937aj;

    /* renamed from: ak */
    String f4938ak;

    /* renamed from: al */
    String f4939al;

    /* renamed from: am */
    String f4940am;

    /* renamed from: an */
    public String f4941an;

    /* renamed from: aq */
    public float f4942aq;

    /* renamed from: ar */
    public boolean f4943ar;

    /* renamed from: aE */
    float f4944aE;

    /* renamed from: aJ */
    int f4945aJ;

    /* renamed from: aa */
    static Paint f4946aa = new Paint();

    /* renamed from: ab */
    static PorterDuffColorFilter f4947ab = new PorterDuffColorFilter(Color.m7283a(200, 255, 200), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aK */
    static String f4948aK = C0820a.m1886a("gui.rategame.text", new Object[0]);

    /* renamed from: aL */
    static String f4949aL = C0820a.m1886a("gui.rategame.yes", new Object[0]);

    /* renamed from: aM */
    static String f4950aM = C0820a.m1886a("gui.rategame.no", new Object[0]);

    /* renamed from: c */
    public boolean f4951c = false;

    /* renamed from: d */
    public boolean f4952d = false;

    /* renamed from: g */
    Paint f4953g = new Paint();

    /* renamed from: h */
    Paint f4954h = new Paint();

    /* renamed from: i */
    Paint f4955i = new Paint();

    /* renamed from: j */
    Paint f4956j = new Paint();

    /* renamed from: k */
    Paint f4957k = new Paint();

    /* renamed from: l */
    Paint f4958l = new Paint();

    /* renamed from: m */
    Paint f4959m = new Paint();

    /* renamed from: p */
    Paint f4960p = new Paint();

    /* renamed from: w */
    Rect f4961w = new Rect();

    /* renamed from: x */
    RectF f4962x = new RectF();

    /* renamed from: y */
    Rect f4963y = new Rect();

    /* renamed from: z */
    Rect f4964z = new Rect();

    /* renamed from: A */
    RectF f4965A = new RectF();

    /* renamed from: B */
    RectF f4966B = new RectF();

    /* renamed from: C */
    Rect f4967C = new Rect();

    /* renamed from: D */
    RectF f4968D = new RectF();

    /* renamed from: E */
    Rect f4969E = new Rect();

    /* renamed from: F */
    RectF f4970F = new RectF();

    /* renamed from: V */
    BitmapOrTexture f4971V = null;

    /* renamed from: W */
    BitmapOrTexture f4972W = null;

    /* renamed from: X */
    BitmapOrTexture f4973X = null;

    /* renamed from: Y */
    BitmapOrTexture f4974Y = null;

    /* renamed from: Z */
    BitmapOrTexture f4975Z = null;

    /* renamed from: ao */
    String f4976ao = null;

    /* renamed from: ap */
    float f4977ap = 0.0f;

    /* renamed from: as */
    ArrayList f4978as = new ArrayList();

    /* renamed from: at */
    C0230y f4979at = new C0230y(false);

    /* renamed from: au */
    C0230y f4980au = new C0230y(true);

    /* renamed from: av */
    C0209d f4981av = new C0209d();

    /* renamed from: aw */
    ArrayList f4982aw = new ArrayList();

    /* renamed from: ax */
    ArrayList f4983ax = new ArrayList();

    /* renamed from: ay */
    C1101m f4984ay = new C1101m();

    /* renamed from: az */
    ArrayList f4985az = new ArrayList();

    /* renamed from: aA */
    RectF f4986aA = new RectF();

    /* renamed from: aB */
    HashMap f4987aB = new HashMap();

    /* renamed from: aC */
    ArrayList f4988aC = new ArrayList();

    /* renamed from: aD */
    Rect f4989aD = new Rect();

    /* renamed from: aF */
    ArrayList f4990aF = new ArrayList();

    /* renamed from: aG */
    boolean f4991aG = false;

    /* renamed from: aH */
    float f4992aH = 0.0f;

    /* renamed from: aI */
    float f4993aI = 0.0f;

    /* renamed from: aN */
    boolean f4994aN = false;

    /* renamed from: aO */
    float f4995aO = 0.0f;

    /* renamed from: aP */
    MenuC0810r f4996aP = new MenuC0810r();

    /* renamed from: aQ */
    ArrayList f4997aQ = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0760a(GameEngine gameEngine, C0797f c0797f) {
        this.f4903a = c0797f;
        this.f4904b = gameEngine;
        m2211b();
    }

    /* renamed from: a */
    public void m2230a() {
        this.f4936ai = C0820a.m1886a("gui.unselectall", new Object[0]);
        this.f4937aj = C0820a.m1886a("gui.common.allyUnit", new Object[0]);
        this.f4938ak = C0820a.m1886a("gui.common.enemyUnit", new Object[0]);
        this.f4939al = C0820a.m1886a("gui.common.neutralUnit", new Object[0]);
        this.f4940am = C0820a.m1886a("gui.infoText.ownedBy", new Object[0]);
        this.f4941an = C0820a.m1886a("gui.infoText.unitCapReached", new Object[0]);
    }

    /* renamed from: b */
    public void m2211b() {
        m2230a();
        this.f4971V = this.f4904b.graphics.loadImage(R.drawable.zoom_button);
        this.f4972W = this.f4904b.graphics.loadImage(R.drawable.lock_icon_menu);
        this.f4973X = this.f4904b.graphics.loadImage(R.drawable.pause);
        this.f4974Y = this.f4904b.graphics.loadImage(R.drawable.replay_pause);
        this.f4975Z = this.f4904b.graphics.loadImage(R.drawable.fast);
        f4946aa.m7267a(255, 30, 30, 30);
        f4946aa.m7264a(f4947ab);
        f4946aa.m7231d(true);
        this.f4909q = new Paint();
        this.f4909q.m7248a(true);
        this.f4909q.m7263a(Paint.Align.CENTER);
        this.f4909q.m7267a(255, 0, 255, 0);
        this.f4904b.m1197a(this.f4909q, 34.0f);
        this.f4910r = new Paint();
        this.f4910r.m7248a(true);
        this.f4910r.m7263a(Paint.Align.CENTER);
        this.f4910r.m7267a(255, 255, 0, 0);
        this.f4904b.m1197a(this.f4910r, 32.0f);
        this.f4911s = new Paint();
        this.f4911s.m7248a(true);
        this.f4911s.m7263a(Paint.Align.LEFT);
        this.f4911s.m7267a(255, 0, 255, 0);
        this.f4904b.m1197a(this.f4911s, 16.0f);
        this.f4912t = new Paint();
        this.f4912t.m7248a(true);
        this.f4912t.m7263a(Paint.Align.RIGHT);
        this.f4912t.m7267a(255, 0, 255, 0);
        this.f4904b.m1197a(this.f4912t, 16.0f);
        this.f4913u = new Paint();
        this.f4913u.m7267a(255, 255, 255, 255);
        this.f4913u.m7263a(Paint.Align.LEFT);
        this.f4913u.m7235c(true);
        this.f4913u.m7248a(true);
        this.f4914v = new Paint();
        this.f4914v.m7267a(255, 255, 255, 255);
        this.f4914v.m7263a(Paint.Align.LEFT);
        this.f4914v.m7235c(true);
        this.f4914v.m7248a(true);
        this.f4907n = new C0930ag();
        this.f4907n.m7242b(Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 255, 255, 255));
        this.f4907n.m1049o();
        this.f4908o = new C0930ag();
        this.f4908o.m7242b(Color.argb(133, 255, 255, 255));
        this.f4908o.m1049o();
        this.f4988aC.clear();
        int i = 0;
        while (i < 10) {
            this.f4988aC.add(new C0784ac(this, i < 3));
            i++;
        }
        m2187l();
    }

    /* renamed from: s */
    private float m2180s() {
        float f = 4.6f / this.f4904b.f6251cX;
        if (f > 4.6f) {
            f = 4.6f;
        }
        return f;
    }

    /* renamed from: t */
    private float m2179t() {
        return m2178u() / this.f4904b.f6251cX;
    }

    /* renamed from: u */
    private float m2178u() {
        if (this.f4904b.f6147cE / this.f4904b.f6104bL.m6589i() < this.f4904b.f6149cG / this.f4904b.f6104bL.m6588j()) {
            return this.f4904b.f6147cE / this.f4904b.f6104bL.m6589i();
        }
        return this.f4904b.f6149cG / this.f4904b.f6104bL.m6588j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2229a(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.f4904b.f6109bQ.showZoomButton) {
            float f6 = this.f4904b.f6126ci * 0.7f;
            int i = (int) (50.0f * f6);
            int i2 = (int) this.f4904b.f6131co;
            float m1240c = C0913a.m1240c();
            if (m1240c > 20.0f) {
                i = (int) (i + (m1240c - 20.0f));
            }
            if (this.f4915G) {
                this.f4961w.m7208a(i - 4, (int) (i2 - (50.0f * this.f4904b.f6126ci)), i + 4, (int) (i2 + (50.0f * this.f4904b.f6126ci)));
                this.f4955i.m7271a();
                this.f4955i.m7242b(Color.argb(255, 0, 0, 0));
                this.f4904b.graphics.mo892b(this.f4961w, this.f4955i);
            }
            float f7 = i2;
            if (this.f4904b.f6248cU > 1.0f) {
                f5 = f7 - (((this.f4904b.f6248cU - 1.0f) * 3.0f) * this.f4904b.f6126ci);
            } else {
                f5 = f7 + (((this.f4904b.f6248cU * (-20.0f)) + 20.0f + 1.0f) * this.f4904b.f6126ci);
            }
            float f8 = 48.0f * f6;
            float f9 = 54.0f * f6;
            float f10 = f8 / 2.0f;
            float f11 = f9 / 2.0f;
            if (f5 < f11) {
                f5 = f11;
            }
            if (f5 > this.f4904b.f6129cl - f11) {
                f5 = (int) (this.f4904b.f6129cl - f11);
            }
            this.f4961w.m7208a((int) (i - f10), (int) (f5 - f11), (int) (i + f10), (int) (f5 + f11));
            if (!this.f4915G) {
                f4946aa.m7267a(140, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA);
            } else {
                f4946aa.m7267a(255, 255, 255, 255);
            }
            this.f4904b.graphics.mo914a(this.f4971V, this.f4961w.f230a, this.f4961w.f231b, f4946aa, 0.0f, f6);
            boolean z = this.f4915G;
            if (!this.f4915G && this.f4903a.m2057a(this.f4961w.f230a, this.f4961w.f231b, this.f4961w.m7206b(), this.f4961w.m7202c(), EnumC0798g.zoomButton)) {
                this.f4915G = true;
                this.f4916H = this.f4903a.f5204t;
            }
            if (!this.f4903a.f5209D) {
                this.f4915G = false;
            }
            if (this.f4915G) {
                this.f4917I += f;
                this.f4903a.m1998d();
                float f12 = this.f4903a.f5204t - this.f4916H;
                if (f12 > 180.0f) {
                    f12 = 180.0f;
                }
                if (f12 < -180.0f) {
                    f12 = -180.0f;
                }
                float f13 = f12 * this.f4904b.f6248cU;
                if (f13 > 2.0f) {
                    this.f4904b.f6248cU -= (5.0E-4f * CommonUtils.m2294c(f13)) * f;
                    this.f4904b.f6249cV = false;
                    if (this.f4904b.f6248cU < m2179t()) {
                        this.f4904b.f6248cU = m2179t();
                        this.f4904b.f6249cV = true;
                    }
                } else if (f13 < -2.0f) {
                    this.f4904b.f6248cU += 5.0E-4f * CommonUtils.m2294c(f13) * f;
                    this.f4904b.f6249cV = false;
                    if (this.f4904b.f6248cU > m2180s()) {
                        this.f4904b.f6248cU = m2180s();
                        this.f4904b.f6249cV = true;
                    }
                }
            } else {
                if (!z || this.f4917I < 12.0f) {
                }
                this.f4917I = 0.0f;
            }
        }
        if (this.f4904b.f6109bQ.mouseSupport) {
            if (this.f4903a.m2066a(this.f4904b.m1173ae(), this.f4904b.m1172af()) && !this.f4903a.f5212G) {
                int m1170ah = this.f4904b.m1170ah();
                if (m1170ah != 0) {
                    this.f4918J += (m1170ah / 120.0f) * 0.18f;
                }
                if (this.f4918J > 1.0f) {
                    this.f4918J = 1.0f;
                }
                if (this.f4918J < -1.0f) {
                    this.f4918J = -1.0f;
                }
            }
            if (this.f4918J != 0.0f) {
                float f14 = 0.0032f * f;
                if (this.f4918J < 0.0f) {
                    f14 = -f14;
                }
                float f15 = f14 + (this.f4918J * 0.18f * f);
                float f16 = this.f4918J;
                this.f4918J = CommonUtils.m2368a(this.f4918J, CommonUtils.m2294c(f15));
                if (this.f4918J == 0.0f) {
                    f15 = f16;
                }
                float f17 = f15 * this.f4904b.f6248cU;
                this.f4904b.f6248cU += f17;
                this.f4904b.f6156cY = true;
                this.f4904b.f6157cZ = this.f4904b.m1173ae();
                this.f4904b.f6158da = this.f4904b.m1172af();
                if (f17 != 0.0f) {
                    this.f4904b.f6249cV = false;
                }
            }
        }
        if (this.f4904b.f6109bQ.gestureZoom && this.f4904b.m1176ab() && this.f4904b.m1174ad() >= 3) {
            this.f4929U = 20.0f;
        }
        if (this.f4929U < 10.0f) {
            this.f4920L = false;
        }
        if (this.f4929U > 0.0f) {
            this.f4929U = CommonUtils.m2368a(this.f4929U, f);
            boolean z2 = this.f4904b.m1176ab() && this.f4904b.m1174ad() >= 3;
            this.f4903a.f5224aO = 3.0f;
            float f18 = 0.0f;
            float f19 = 0.0f;
            if (z2) {
                for (int i3 = 0; i3 < this.f4904b.m1174ad(); i3++) {
                    f18 += this.f4904b.m1149b(i3);
                    f19 += this.f4904b.m1141c(i3);
                }
                f2 = f18 / this.f4904b.m1174ad();
                f3 = f19 / this.f4904b.m1174ad();
                f4 = 0.0f;
                for (int i4 = 0; i4 < this.f4904b.m1174ad(); i4++) {
                    f4 += CommonUtils.m2314b(f2, f3, this.f4904b.m1149b(i4), this.f4904b.m1141c(i4));
                }
            } else {
                f2 = this.f4924P;
                f3 = this.f4925Q;
                f4 = this.f4926R;
            }
            if (this.f4920L && this.f4927S != this.f4904b.m1174ad()) {
                this.f4920L = false;
            }
            if (!this.f4920L && z2) {
                this.f4920L = true;
                this.f4921M = f2;
                this.f4922N = f3;
                this.f4923O = f4;
                this.f4928T = this.f4904b.f6248cU;
                this.f4924P = f2;
                this.f4925Q = f3;
                this.f4926R = f4;
                this.f4927S = this.f4904b.m1174ad();
            }
            if (z2) {
                float f20 = (this.f4925Q - f3) * 2.0f * this.f4904b.f6248cU;
                this.f4904b.f6248cU += (f20 / 250.0f) / this.f4904b.f6126ci;
                this.f4904b.f6249cV = false;
                float f21 = this.f4926R - f4;
                if (0 != 0) {
                    this.f4904b.f6248cU -= (f21 / 350.0f) / this.f4904b.f6126ci;
                    this.f4904b.f6249cV = false;
                }
                this.f4924P = f2;
                this.f4925Q = f3;
                this.f4926R = f4;
                this.f4927S = this.f4904b.m1174ad();
                for (int i5 = 0; i5 < this.f4904b.m1174ad(); i5++) {
                    this.f4904b.graphics.mo932a(f2, f3, this.f4904b.m1149b(i5), this.f4904b.m1141c(i5), this.f4903a.f5156aH);
                }
                this.f4904b.graphics.mo932a(f2, f3, f2, this.f4922N, this.f4903a.f5157aI);
                this.f4904b.graphics.mo931a(f2, f3, 6.0f, this.f4903a.f5156aH);
            }
        }
        if (this.f4904b.f6248cU > m2180s()) {
            this.f4904b.f6248cU = m2180s();
            this.f4904b.f6249cV = true;
        }
        if (this.f4904b.f6248cU < m2179t()) {
            this.f4904b.f6248cU = m2179t();
            this.f4904b.f6249cV = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2210b(float f) {
        this.f4905e = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 7;
        if (GameEngine.m1156av()) {
            i = 14;
        }
        if (this.f4904b.m1176ab() && this.f4903a.f5120W == null) {
            boolean m2000c = this.f4903a.m2000c(this.f4904b);
            int i2 = 1;
            if (this.f4904b.f6109bQ.mouseOrders == 2) {
                i2 = 2;
            }
            int m1124f = this.f4904b.m1124f(i2);
            if (m2000c || (this.f4904b.f6109bQ.mouseSupport && m1124f != -1 && !this.f4903a.f5210E && !this.f4903a.f5211F)) {
                float m1149b = this.f4904b.m1149b(0);
                float m1141c = this.f4904b.m1141c(0);
                if (m1124f != -1) {
                    m1149b = this.f4904b.m1149b(m1124f);
                    m1141c = this.f4904b.m1141c(m1124f);
                }
                if (!this.f4951c) {
                    z2 = true;
                    this.f4966B.f234a = (int) m1149b;
                    this.f4966B.f235b = (int) m1141c;
                }
                this.f4966B.f236c = (int) m1149b;
                this.f4966B.f237d = (int) m1141c;
                if (Math.abs(this.f4966B.f234a - this.f4966B.f236c) > i || Math.abs(this.f4966B.f235b - this.f4966B.f237d) > i) {
                    this.f4952d = true;
                }
                z = true;
            } else if (this.f4904b.m1174ad() == 2 && this.f4929U == 0.0f) {
                this.f4966B.f234a = (int) this.f4904b.m1149b(0);
                this.f4966B.f235b = (int) this.f4904b.m1141c(0);
                this.f4966B.f236c = (int) this.f4904b.m1149b(1);
                this.f4966B.f237d = (int) this.f4904b.m1141c(1);
                this.f4952d = false;
                z = true;
            }
            if (z) {
                this.f4906f += f;
                if (this.f4906f < 18.0f) {
                    z3 = true;
                }
            } else {
                this.f4906f = 0.0f;
            }
            if (z) {
                this.f4951c = true;
                if (Math.abs(this.f4966B.f234a - this.f4966B.f236c) > i || Math.abs(this.f4966B.f235b - this.f4966B.f237d) > i) {
                    this.f4967C.f233d = (int) this.f4966B.f237d;
                    this.f4967C.f231b = (int) this.f4966B.f235b;
                    this.f4967C.f230a = (int) this.f4966B.f234a;
                    this.f4967C.f232c = (int) this.f4966B.f236c;
                    CommonUtils.m2353a(this.f4967C);
                    this.f4953g.m7242b(Color.argb(255, 0, 255, 0));
                    this.f4953g.m7260a(Paint.Style.STROKE);
                    this.f4953g.m7270a(1.0f);
                    this.f4904b.graphics.mo892b(this.f4967C, this.f4953g);
                    this.f4905e = true;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        if (this.f4951c && !z) {
            if (z3 && this.f4904b.m1174ad() == 3) {
                z5 = true;
            } else {
                z4 = true;
            }
        }
        if (z5) {
            this.f4952d = false;
            this.f4951c = false;
        }
        if ((z && !z3) || z4) {
            if (z2) {
                Iterator it = AbstractC1120w.f6956en.iterator();
                while (it.hasNext()) {
                    AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
                    if (abstractC1120w instanceof AbstractC0318c) {
                        AbstractC0318c abstractC0318c = (AbstractC0318c) abstractC1120w;
                        abstractC0318c.f1645cG = abstractC0318c.f1643cE;
                    }
                }
            }
            if (z4) {
                this.f4952d = false;
                this.f4951c = false;
            }
            this.f4968D.m7193a(this.f4966B);
            CommonUtils.m2350a(this.f4968D);
            if (Math.abs(this.f4968D.f234a - this.f4968D.f236c) > i || Math.abs(this.f4968D.f235b - this.f4968D.f237d) > i) {
                this.f4968D.f237d /= this.f4904b.f6250cW;
                this.f4968D.f235b /= this.f4904b.f6250cW;
                this.f4968D.f234a /= this.f4904b.f6250cW;
                this.f4968D.f236c /= this.f4904b.f6250cW;
                this.f4968D.m7196a(this.f4904b.f6136ct, this.f4904b.f6137cu);
                this.f4903a.f5224aO = 4.0f;
                this.f4903a.f5225aP = 40.0f;
                this.f4903a.f5220O = false;
                boolean m2028a = this.f4903a.m2028a(this.f4904b);
                boolean m2009b = this.f4903a.m2009b(this.f4904b);
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = false;
                if (this.f4904b.f6109bQ.smartSelection_v2) {
                    Iterator it2 = AbstractC1120w.f6956en.iterator();
                    while (it2.hasNext()) {
                        AbstractC1120w abstractC1120w2 = (AbstractC1120w) it2.next();
                        if (abstractC1120w2 instanceof AbstractC0623y) {
                            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w2;
                            if (m2215a(abstractC0623y) && (!m2028a || !abstractC0623y.f1645cG)) {
                                if (!abstractC0623y.m5867bI()) {
                                    z6 = false;
                                }
                                if (abstractC0623y.m3161aS() && abstractC0623y.canAttack()) {
                                    z7 = false;
                                }
                            }
                        }
                    }
                }
                if (m2009b) {
                    z6 = true;
                }
                Iterator it3 = AbstractC1120w.f6956en.iterator();
                while (it3.hasNext()) {
                    AbstractC1120w abstractC1120w3 = (AbstractC1120w) it3.next();
                    if (abstractC1120w3 instanceof AbstractC0318c) {
                        AbstractC0318c abstractC0318c2 = (AbstractC0318c) abstractC1120w3;
                        boolean z9 = false;
                        if (m2215a(abstractC0318c2)) {
                            z9 = true;
                            if (!z6 && abstractC0318c2.m5867bI()) {
                                z9 = false;
                            }
                            if (!z7 && abstractC0318c2.mo3142ak() && !abstractC0318c2.canAttack()) {
                                z9 = false;
                            }
                        }
                        if (m2009b) {
                            if (z9) {
                                z9 = !abstractC0318c2.f1645cG;
                            } else if (abstractC0318c2.f1645cG) {
                                z9 = true;
                            }
                        } else if (m2028a && abstractC0318c2.f1645cG) {
                            z9 = true;
                        }
                        if (z9) {
                            this.f4903a.m1980j(abstractC0318c2);
                            if (z4 && abstractC0318c2.f1644cF + 900 < this.f4904b.f6098bA && ((!m2028a && !m2009b) || !abstractC0318c2.f1645cG)) {
                                z8 = true;
                            }
                        } else {
                            this.f4903a.m1976l(abstractC0318c2);
                        }
                    }
                }
                if (z8) {
                    Iterator it4 = AbstractC1120w.f6956en.iterator();
                    while (it4.hasNext()) {
                        AbstractC1120w abstractC1120w4 = (AbstractC1120w) it4.next();
                        if (abstractC1120w4 instanceof AbstractC0318c) {
                            ((AbstractC0318c) abstractC1120w4).f1644cF = this.f4904b.f6098bA;
                        }
                    }
                }
                this.f4903a.m2075D();
            }
        }
    }

    /* renamed from: a */
    private boolean m2215a(AbstractC0318c abstractC0318c) {
        if (!abstractC0318c.isDead && abstractC0318c.f1650cL == null) {
            float f = abstractC0318c.f6951ek;
            float f2 = abstractC0318c.f6952el - abstractC0318c.height;
            if (f2 <= 0.0f) {
                f2 += abstractC0318c.height;
            }
            if (this.f4968D.m7189b(f, f2)) {
                if ((this.f4903a.m1974m(abstractC0318c) || this.f4904b.f6093bs.m6374b()) && !abstractC0318c.m5757t()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void m2212a(String str, int i) {
        this.f4976ao = str;
        this.f4977ap = i;
    }

    /* renamed from: b */
    public void m2207b(String str, int i) {
        if (this.f4977ap <= 0.0f || str.equals(this.f4976ao)) {
            this.f4976ao = str;
            this.f4977ap = i;
        }
    }

    /* renamed from: a */
    public void m2213a(String str) {
        if (this.f4977ap > 0.0f && str.equals(this.f4976ao)) {
            this.f4977ap = 0.0f;
        }
    }

    /* renamed from: c */
    public void m2205c(float f) {
        if (this.f4977ap > 0.0f && this.f4976ao != null) {
            this.f4977ap = CommonUtils.m2368a(this.f4977ap, f);
            this.f4904b.graphics.mo902a(this.f4976ao, this.f4904b.f6130cn, this.f4904b.f6131co, this.f4903a.f5146ax, this.f4903a.f5151aC, 8.0f);
        }
    }

    /* renamed from: a */
    public static boolean m2223a(Action action) {
        return GameEngine.getInstance().f6222ar && action.m6060k_();
    }

    /* renamed from: c */
    public void m2206c() {
        this.f4919K = 0;
    }

    /* renamed from: a */
    public C0639ad m2222a(Action action, int i, ArrayList arrayList) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!GameEngine.m1157au()) {
            return null;
        }
        if (action.m6096M() != null) {
            return action.m6096M();
        }
        if ((action instanceof C0219n) || (action instanceof C0209d)) {
            return null;
        }
        if (action.mo6182f() == EnumC0225t.f1465b) {
            return gameEngine.f6112bT.f4122T;
        }
        if (action.mo6184e() == EnumC0226u.f1486m) {
            return gameEngine.f6112bT.f4119Q;
        }
        if (action.mo6184e() == EnumC0226u.f1485l) {
            return gameEngine.f6112bT.f4118P;
        }
        if (action.mo6184e() == EnumC0226u.f1478e) {
            return gameEngine.f6112bT.f4120R;
        }
        if (action.mo6182f() == EnumC0225t.f1466c) {
            int i2 = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Action action2 = (Action) it.next();
                if (action2 != action && action2.mo6182f() == EnumC0225t.f1466c && this.f4903a.m2012b(action2)) {
                    i2++;
                }
            }
            if (i2 == 0) {
                return gameEngine.f6112bT.f4121S;
            }
        }
        EnumC0225t mo6182f = action.mo6182f();
        if (mo6182f == EnumC0225t.f1470g || mo6182f == EnumC0225t.f1471h || mo6182f == EnumC0225t.f1472i) {
            return null;
        }
        C0639ad c0639ad = null;
        C0639ad[] c0639adArr = gameEngine.f6112bT.f4135ag;
        if (this.f4919K < c0639adArr.length) {
            c0639ad = c0639adArr[this.f4919K];
            this.f4919K++;
        }
        return c0639ad;
    }

    /* renamed from: d */
    public ArrayList m2202d() {
        this.f4982aw.clear();
        Unit[] m523a = this.f4903a.f5255bL.m523a();
        int size = this.f4903a.f5255bL.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0303as unitType = m523a[i].getUnitType();
            if (!this.f4982aw.contains(unitType)) {
                this.f4982aw.add(unitType);
            }
        }
        return this.f4982aw;
    }

    /* renamed from: a */
    public ArrayList m2218a(Unit unit, ArrayList arrayList) {
        C1101m m5769e;
        ArrayList mo3520N;
        int i = 0;
        this.f4978as.clear();
        int m1969p = this.f4903a.m1969p();
        if (m1969p == 0) {
            if (this.f4904b.f6109bQ.showChatAndPingShortcuts && this.f4904b.m1223L()) {
                this.f4978as.add(0, this.f4903a.f5197l);
                this.f4978as.add(0, this.f4903a.f5198m);
            }
            return this.f4978as;
        }
        if (C0797f.f5187bA && unit != null && !(unit instanceof EditorOrBuilder)) {
            this.f4978as.add(this.f4979at);
            this.f4978as.add(this.f4980au);
        }
        if (unit == null) {
        }
        if (unit != null) {
            i = this.f4978as.size();
            if (unit.f1643cE) {
                if (this.f4903a.m1974m(unit)) {
                    ArrayList mo3520N2 = unit.mo3520N();
                    if (mo3520N2 != null) {
                        this.f4978as.addAll(mo3520N2);
                    }
                } else {
                    ArrayList mo3520N3 = unit.mo3520N();
                    if (mo3520N3 != null) {
                        this.f4978as.addAll(mo3520N3);
                    }
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Unit unit2 = (Unit) arrayList.get(i2);
                if (this.f4903a.m1974m(unit2) && ((unit2.getUnitType() != unit.getUnitType() || unit2.mo3230V() != unit.mo3230V()) && (mo3520N = unit2.mo3520N()) != null)) {
                    Iterator it = mo3520N.iterator();
                    while (it.hasNext()) {
                        Action action = (Action) it.next();
                        boolean z = false;
                        Iterator it2 = this.f4978as.iterator();
                        while (it2.hasNext()) {
                            if (((Action) it2.next()).m6095N().equals(action.m6095N())) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f4978as.add(action);
                        }
                    }
                }
            }
        }
        boolean z2 = false;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Unit unit3 = (Unit) arrayList.get(i3);
            if (this.f4903a.m1974m(unit3) && (unit3 instanceof AbstractC0623y) && !((AbstractC0623y) unit3).m3161aS()) {
                z2 = true;
            }
        }
        Unit m2198e = m2198e();
        if (!z2 && m2198e != null && this.f4903a.m1974m(m2198e)) {
            this.f4978as.add(i, this.f4903a.f5193h);
            this.f4978as.add(i, this.f4903a.f5194i);
        }
        boolean z3 = false;
        if (C0797f.f5187bA && (this.f4904b.f6109bQ.showSelectedUnitsList || m1969p == 1)) {
            z3 = true;
        }
        if (GameEngine.m1159as() && m1969p > 0) {
            z3 = true;
        }
        if (z3 && !(unit instanceof EditorOrBuilder)) {
            if (m1969p == 1 && m2198e != null && (m5769e = m2198e.m5769e(true)) != null && m5769e.size() > 0) {
                for (int i4 = 0; i4 < m5769e.f6888a; i4++) {
                    Action action2 = (Action) m5769e.get(i4);
                    if (action2 instanceof C0212g) {
                        C0212g c0212g = (C0212g) action2;
                        Iterator it3 = this.f4984ay.iterator();
                        while (it3.hasNext()) {
                            C0212g c0212g2 = (C0212g) it3.next();
                            if (c0212g2.m6255a(c0212g)) {
                                m5769e.set(i4, c0212g2);
                            }
                        }
                    }
                }
                this.f4984ay.clear();
                Iterator it4 = m5769e.iterator();
                while (it4.hasNext()) {
                    Action action3 = (Action) it4.next();
                    if (action3 instanceof C0212g) {
                        this.f4984ay.add((C0212g) action3);
                    }
                    this.f4978as.add(action3);
                }
            }
            ArrayList m2202d = m2202d();
            this.f4983ax.clear();
            Iterator it5 = m2202d.iterator();
            while (it5.hasNext()) {
                C0231z mo5712d = ((InterfaceC0303as) it5.next()).mo5712d();
                mo5712d.m5984K();
                this.f4983ax.add(mo5712d);
            }
            Collections.sort(this.f4983ax);
            if (C0797f.f5187bA) {
                Collections.reverse(this.f4983ax);
            }
            Iterator it6 = this.f4983ax.iterator();
            while (it6.hasNext()) {
                C0231z c0231z = (C0231z) it6.next();
                if (C0797f.f5187bA) {
                    this.f4978as.add(0, c0231z);
                } else {
                    this.f4978as.add(c0231z);
                }
            }
        }
        return this.f4978as;
    }

    /* renamed from: e */
    Unit m2198e() {
        if (this.f4903a.f5255bL.size() > 0) {
            return this.f4903a.f5255bL.m522a(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Unit m2195f() {
        Unit unit = null;
        if (this.f4903a.f5163aR > 0) {
            Unit[] m523a = this.f4903a.f5255bL.m523a();
            int i = 0;
            int size = this.f4903a.f5255bL.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                Unit unit2 = m523a[i];
                if (unit2.f1643cE) {
                    if (unit == null) {
                        unit = unit2;
                    } else if (!m2219a(unit, unit2)) {
                        unit = null;
                        break;
                    } else if (unit.mo3230V() > unit2.mo3230V()) {
                        unit = unit2;
                    }
                }
                i++;
            }
        }
        return unit;
    }

    /* renamed from: a */
    public static boolean m2219a(Unit unit, Unit unit2) {
        InterfaceC0303as unitType = unit.getUnitType();
        InterfaceC0303as unitType2 = unit2.getUnitType();
        if (unitType == unitType2) {
            return true;
        }
        if ((unitType instanceof C0453l) && (unitType2 instanceof C0453l)) {
            C0453l c0453l = (C0453l) unitType;
            C0453l c0453l2 = (C0453l) unitType2;
            if (c0453l.f3263fG.contains(unitType2)) {
                return true;
            }
            if (c0453l.f3169fJ != null && C0448g.m5061a(c0453l.f3169fJ, c0453l2.m4698x())) {
                return true;
            }
            if (c0453l2.f3169fJ != null && C0448g.m5061a(c0453l2.f3169fJ, c0453l.m4698x())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    ArrayList m2193g() {
        this.f4985az.clear();
        Unit[] m523a = this.f4903a.f5255bL.m523a();
        int size = this.f4903a.f5255bL.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m523a[i];
            if (unit instanceof AbstractC0623y) {
                this.f4985az.add((AbstractC0623y) unit);
            }
        }
        return this.f4985az;
    }

    /* renamed from: h */
    float m2191h() {
        return CommonUtils.m2315b((this.f4904b.f6129cl / 14.0f) / this.f4904b.f6126ci, 25.0f * this.f4904b.f6126ci, 40.0f * this.f4904b.f6126ci);
    }

    /* renamed from: c */
    private boolean m2204c(Action action) {
        if (action.mo6178s()) {
            return true;
        }
        if (action instanceof C0212g) {
            return this.f4903a.m1974m(((C0212g) action).f1432b);
        }
        ArrayList m2193g = m2193g();
        C0208c m6095N = action.m6095N();
        Iterator it = m2193g.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y.m5893a(m6095N) != null && this.f4903a.m1974m(abstractC0623y)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2221a(Action action, ArrayList arrayList) {
        C0213h c0213h = null;
        if (action instanceof C0213h) {
            c0213h = (C0213h) action;
        }
        if (c0213h != null && c0213h.f1439d == C0797f.f5190bP) {
            return c0213h.f1440e;
        }
        boolean m2208b = m2208b(action, arrayList);
        if (c0213h != null) {
            c0213h.f1439d = C0797f.f5190bP;
            c0213h.f1440e = m2208b;
        }
        return m2208b;
    }

    /* renamed from: b */
    private boolean m2208b(Action action, ArrayList arrayList) {
        if (action.mo6178s()) {
            return true;
        }
        if (action instanceof C0212g) {
            C0212g c0212g = (C0212g) action;
            if (!c0212g.m6223r(c0212g.f1432b)) {
                return false;
            }
            if (this.f4903a.m1974m(c0212g.f1432b) || c0212g.m6252a(c0212g.f1432b, this.f4904b.f6093bs)) {
                return true;
            }
            return false;
        }
        C0208c m6095N = action.m6095N();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Unit unit = (AbstractC0623y) it.next();
            Action a = unit.m5893a(m6095N);
            if (a != null && a.m6047r(unit) && (this.f4903a.m1974m(unit) || a.m6087a(unit, this.f4904b.f6093bs))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m2203c(Action action, ArrayList arrayList) {
        if (action.mo6178s()) {
            return true;
        }
        if (action instanceof C0212g) {
            C0212g c0212g = (C0212g) action;
            if (c0212g.m6248a((Unit) c0212g.f1432b, true)) {
                return true;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Unit unit = (AbstractC0623y) it.next();
            Action a = unit.m5893a(action.m6095N());
            if (a != null && a.mo4247a(unit, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private float m2199d(Action action, ArrayList arrayList) {
        int i = 0;
        float f = -1.0f;
        if (action.m6057l_()) {
            return -1.0f;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Unit unit = (AbstractC0623y) it.next();
            Action a = unit.m5893a(action.m6095N());
            if (a != null) {
                float m6049p = a.m6049p(unit);
                if (m6049p > f) {
                    f = m6049p;
                    i++;
                }
            }
        }
        return f;
    }

    /* renamed from: d */
    private C0554e m2200d(Action action) {
        float f = -1.0f;
        C0554e c0554e = null;
        if (action.m6057l_()) {
            return null;
        }
        if (action instanceof C0212g) {
            C0554e m3723b = C0554e.m3723b(((C0212g) action).f1432b, action.m6095N());
            if (m3723b != null) {
                if (-1.0f < m3723b.m3739a()) {
                    f = m3723b.m3739a();
                    c0554e = m3723b;
                }
            } else {
                return null;
            }
        }
        Iterator it = this.f4903a.f5255bL.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
                if (abstractC0623y.m5893a(action.m6095N()) == null) {
                    continue;
                } else {
                    C0554e m3723b2 = C0554e.m3723b(abstractC0623y, action.m6095N());
                    if (m3723b2 != null) {
                        if (f < m3723b2.m3739a()) {
                            f = m3723b2.m3739a();
                            c0554e = m3723b2;
                        }
                    } else {
                        return null;
                    }
                }
            }
        }
        if (c0554e == null) {
            return null;
        }
        return c0554e;
    }

    /* renamed from: e */
    private float m2196e(Action action) {
        C0554e m2200d = m2200d(action);
        if (m2200d == null) {
            return 0.0f;
        }
        return m2200d.m3722c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m2209b(Action action) {
        C0554e m2200d = m2200d(action);
        if (m2200d == null) {
            return 0.0f;
        }
        return m2200d.m3720d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m2201d(float f) {
        ArrayList m2218a;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        C0930ag c0930ag;
        Rect rect;
        Rect rect2;
        int argb;
        int m1170ah;
        this.f4943ar = false;
        int i = 1;
        if (C0797f.f5188bB) {
            i = 2;
        }
        int i2 = 0;
        boolean z = false;
        C0794c.m2089a(f);
        ArrayList m2193g = m2193g();
        Unit m2195f = m2195f();
        ArrayList arrayList = null;
        if (this.f4903a.f5120W != null) {
            arrayList = this.f4903a.f5120W.mo6179q(m2195f);
        }
        if (arrayList != null) {
            m2218a = arrayList;
        } else {
            m2218a = m2218a(m2195f, m2193g);
        }
        if (m2195f == null && m2218a.size() > 0) {
            m2195f = m2198e();
            if (m2195f == null && C0453l.f2901b != null) {
                m2195f = Unit.m5847c(C0453l.f2901b);
            }
        }
        this.f4903a.f5200o = false;
        if (m2218a.contains(this.f4903a.f5193h)) {
            this.f4903a.f5200o = true;
        }
        if (m2195f == null) {
            m2195f = m2198e();
        }
        boolean z2 = true;
        if (m2195f == null) {
            this.f4933af = -1L;
        }
        if (m2195f != null && m2218a.size() > 0) {
            ArrayList arrayList2 = m2218a;
            float f8 = 2.0f;
            float m2191h = m2191h();
            float f9 = 2.0f;
            float f10 = m2191h + 2.0f;
            boolean z3 = false;
            if (!C0797f.f5181bD) {
                f2 = this.f4904b.f6115bW.m1935b() + 2;
                f3 = this.f4904b.f6128ck - this.f4904b.f6115bW.f5299c;
                f4 = this.f4904b.f6115bW.f5299c;
            } else {
                f2 = this.f4904b.f6115bW.f5275b;
                f3 = this.f4904b.f6115bW.f5299c;
                f4 = this.f4904b.f6115bW.f5299c;
                z3 = true;
            }
            if (C0797f.f5187bA) {
                m2191h += 15.0f * this.f4904b.f6126ci;
                float f11 = f10 + (15.0f * this.f4904b.f6126ci);
                f8 = 5.0f;
                if (GameEngine.m1158at()) {
                    f8 = 2.0f;
                }
                f10 = f11 + 2.0f;
                f9 = 2.0f + 2.0f;
                f2 += 3.0f;
            }
            if (!C0797f.f5186a) {
                boolean z4 = true;
                if (this.f4903a.f5105c != null && this.f4903a.f5163aR == 1 && this.f4903a.f5105c.f1643cE) {
                    z4 = false;
                }
                if (z4) {
                    f2 = f2 + m2190i() + 2.0f;
                }
            }
            int i3 = 0;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Action action = (Action) it.next();
                if (m2221a(action, m2193g)) {
                    i3++;
                    float m6059l = f10 * action.m6059l();
                    int i4 = i;
                    if (action.m6056m() > 0) {
                        i4 = action.m6056m();
                    }
                    float f15 = f4 / i4;
                    boolean z5 = false;
                    if ((f13 + f15) - 0.1f >= f4) {
                        z5 = true;
                    }
                    if (!z5 && f12 > 0.0f && m6059l + 0.1f < f12) {
                        z5 = true;
                    }
                    if (z5) {
                        f14 += f12;
                        f12 = 0.0f;
                        f13 = 0.0f;
                    }
                    if (f12 < m6059l) {
                        f12 = m6059l;
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
            if (this.f4904b.f6109bQ.showUnitGroups) {
                f5 = this.f4904b.f6149cG - (34.0f * this.f4904b.f6126ci);
            } else {
                f5 = this.f4904b.f6149cG;
            }
            this.f4933af = m2195f.f6945ed;
            float f19 = f18 - ((int) m2195f.f1576bq);
            float f20 = 0.0f;
            float f21 = 1.0f + (m2191h * 0.25f);
            boolean z6 = f16 - m2195f.f1576bq > f5 + f21;
            boolean z7 = m2195f.f1576bq > f21;
            this.f4943ar = z6 || z7;
            if (this.f4904b.f6109bQ.mouseSupport && !this.f4903a.m2066a(this.f4904b.m1173ae(), this.f4904b.m1172af()) && (m1170ah = this.f4904b.m1170ah()) != 0) {
                f20 = -(m1170ah / 120.0f);
            }
            float f22 = 0.0f;
            if (z6) {
                this.f4961w.f230a = (int) (f3 + 2.0f);
                this.f4961w.f232c = (int) ((f3 + f4) - 2.0f);
                this.f4961w.f231b = (int) (f5 - (m2191h * 0.4f));
                this.f4961w.f233d = (int) (this.f4961w.f231b + (m2191h * 0.4f));
                if (this.f4903a.m2052a(this.f4961w.f230a, this.f4961w.f231b, this.f4961w.m7206b(), this.f4961w.m7202c(), "\\/", EnumC0798g.none, false, Color.argb(80, 100, 150, 100), this.f4903a.f5145aw) && this.f4903a.m2070I()) {
                    f22 = 0.0f + (3.0f * f10);
                    this.f4903a.f5220O = false;
                }
                if (f20 > 0.0f) {
                    this.f4942aq = (float) (this.f4942aq + (0.5d * f10));
                }
                f5 -= (f10 * 0.4f) + 2.0f;
            }
            if (z7) {
                this.f4961w.f230a = (int) (f3 + 2.0f);
                this.f4961w.f232c = (int) ((f3 + f4) - 2.0f);
                this.f4961w.f231b = (int) f17;
                this.f4961w.f233d = (int) (this.f4961w.f231b + (m2191h * 0.4f));
                if (this.f4903a.m2052a(this.f4961w.f230a, this.f4961w.f231b, this.f4961w.m7206b(), this.f4961w.m7202c(), "/\\", EnumC0798g.none, false, Color.argb(80, 100, 150, 100), this.f4903a.f5145aw) && this.f4903a.m2070I()) {
                    f22 -= 3.0f * f10;
                    this.f4903a.f5220O = false;
                }
                if (f20 < 0.0f) {
                    this.f4942aq = (float) (this.f4942aq - (0.5d * f10));
                }
                f17 += (f10 * 0.4f) + 2.0f;
            }
            this.f4904b.graphics.mo880i();
            this.f4986aA.m7195a(0.0f, f17 - 1.0f, this.f4904b.f6128ck, f5 + 1.0f);
            this.f4904b.graphics.mo921a(this.f4986aA);
            if (GameEngine.m1158at()) {
                if (this.f4933af != m2195f.f6945ed) {
                    this.f4934ag = 0.0f;
                    this.f4935ah = m2195f.f1576bq;
                } else if (this.f4942aq != 0.0f) {
                    this.f4934ag = this.f4942aq;
                } else {
                    if (!this.f4903a.f5209D) {
                        this.f4942aq += this.f4934ag * f;
                    }
                    this.f4934ag = CommonUtils.m2368a(this.f4934ag, f);
                }
            }
            m2195f.f1576bq += this.f4942aq + f22;
            this.f4942aq = 0.0f;
            int i5 = (int) (f16 - f5);
            if (i5 > 0) {
                if (m2195f.f1576bq > i5 + 0.0f) {
                    m2195f.f1576bq = i5 + 0.0f;
                }
                if (m2195f.f1576bq < 0.0f - 0.0f) {
                    m2195f.f1576bq = 0.0f - 0.0f;
                }
            } else {
                m2195f.f1576bq = 0.0f;
            }
            int i6 = -1;
            float f23 = 0.0f;
            float f24 = 0.0f;
            float f25 = 0.0f;
            m2206c();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Action action2 = (Action) it2.next();
                if (m2221a(action2, m2193g)) {
                    i2++;
                    boolean m2203c = m2203c(action2, m2193g);
                    i6++;
                    float m6059l2 = m2191h * action2.m6059l();
                    int i7 = i;
                    if (action2.m6056m() > 0) {
                        i7 = action2.m6056m();
                    }
                    float f26 = f4 / i7;
                    if (!z3) {
                        f6 = m6059l2;
                        f7 = f26;
                    } else {
                        f6 = f26;
                        f7 = m6059l2;
                    }
                    boolean z8 = false;
                    if ((f25 + f7) - 0.1f > f4) {
                        z8 = true;
                    }
                    if (!z8 && f24 > 0.0f && f6 + 0.1f < f24) {
                        z8 = true;
                    }
                    if (z8) {
                        f23 += f24 + f9;
                        f24 = 0.0f;
                        f25 = 0.0f;
                    }
                    if (f24 < f6) {
                        f24 = f6;
                    }
                    if (!z3) {
                        this.f4961w.f230a = (int) (f3 + f8);
                        this.f4961w.f232c = (int) ((this.f4961w.f230a + f26) - (f8 * 2.0f));
                        this.f4961w.f231b = (int) (f23 + f19);
                        this.f4961w.f233d = (int) (this.f4961w.f231b + m6059l2);
                        this.f4961w.m7209a((int) f25, 0);
                    } else {
                        this.f4961w.f230a = (int) (f3 + f8 + f23);
                        this.f4961w.f232c = (int) ((this.f4961w.f230a + f26) - (f8 * 2.0f));
                        this.f4961w.f231b = (int) f19;
                        this.f4961w.f233d = (int) (this.f4961w.f231b + m6059l2);
                        this.f4961w.m7209a(0, (int) f25);
                    }
                    boolean z9 = true;
                    this.f4962x.m7194a(this.f4961w);
                    if (!this.f4962x.m7187b(this.f4986aA)) {
                        z9 = false;
                    }
                    f25 += f7;
                    EnumC0225t mo6182f = action2.mo6182f();
                    boolean z10 = false;
                    if (mo6182f == EnumC0225t.f1470g || mo6182f == EnumC0225t.f1471h || mo6182f == EnumC0225t.f1472i) {
                        z10 = true;
                    }
                    boolean m2223a = m2223a(action2);
                    boolean m6100G = action2.m6100G();
                    Paint paint = this.f4956j;
                    boolean z11 = m2203c;
                    if (mo6182f == EnumC0225t.f1472i) {
                        z11 = true;
                    }
                    if (z11) {
                        paint.m7242b(Color.argb(70, 100, 100, 100));
                    } else {
                        paint.m7242b(Color.argb(50, 170, 100, 100));
                    }
                    if (m2223a) {
                        paint.m7242b(Color.argb(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100));
                    }
                    boolean z12 = false;
                    boolean z13 = false;
                    if (this.f4930ac == m2195f && this.f4931ad == action2) {
                        z12 = true;
                    }
                    if (this.f4903a.f5120W == action2) {
                        z12 = true;
                        z13 = true;
                    }
                    if (z12) {
                        paint.m7242b(Color.argb(80, 100, 100, 200));
                    }
                    if (z13) {
                        paint.m7242b(Color.argb(80, 100, 200, 100));
                    }
                    if (m6100G) {
                        paint.m7237c((int) (paint.m7228f() * 0.7f));
                        c0930ag = this.f4908o;
                    } else {
                        c0930ag = this.f4907n;
                    }
                    float f27 = 0.0f;
                    if (z9) {
                        f27 = C0794c.m2086b(m2195f, action2, false);
                        if (action2.mo6182f() != EnumC0225t.f1471h) {
                            boolean m2047a = this.f4903a.m2047a(action2);
                            float f28 = 0.0f;
                            if (m2047a) {
                                f28 = CommonUtils.m2294c(CommonUtils.m2249i((((float) (GameEngine.m1214U() % 1000)) / 1000.0f) * 180.0f));
                            }
                            if (f27 != 0.0f) {
                                float m2315b = CommonUtils.m2315b((CommonUtils.m2294c(f27) * 0.7f) - 0.3f, 0.0f, 1.0f);
                                if (f27 > 0.0f) {
                                    argb = Color.argb(110, 210, 210, 210);
                                } else {
                                    argb = Color.argb(110, 210, 110, 110);
                                }
                                int m2359a = CommonUtils.m2359a(argb, paint.m7230e(), m2315b);
                                paint = this.f4955i;
                                paint.m7242b(m2359a);
                            }
                            this.f4903a.m2048a(this.f4961w, paint, c0930ag);
                            float m2199d = m2199d(action2, m2193g);
                            if (m2199d >= 0.0f) {
                                this.f4958l.m7267a(80, 0, 0, 100);
                                this.f4969E.m7207a(this.f4961w);
                                this.f4969E.f232c = (int) (rect2.f232c - ((1.0f - m2199d) * this.f4969E.m7206b()));
                                this.f4904b.graphics.mo892b(this.f4969E, this.f4958l);
                                this.f4959m.m7267a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                this.f4904b.graphics.mo932a(this.f4969E.f232c, this.f4969E.f231b, this.f4969E.f232c, this.f4969E.f233d, this.f4958l);
                            } else {
                                float m2196e = m2196e(action2);
                                if (m2196e > 0.0f) {
                                    this.f4958l.m7267a(80, 100, 0, 0);
                                    this.f4969E.m7207a(this.f4961w);
                                    this.f4969E.f232c = (int) (rect.f232c - ((1.0f - m2196e) * this.f4969E.m7206b()));
                                    this.f4904b.graphics.mo892b(this.f4969E, this.f4958l);
                                    this.f4959m.m7267a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                    this.f4904b.graphics.mo932a(this.f4969E.f232c, this.f4969E.f231b, this.f4969E.f232c, this.f4969E.f233d, this.f4958l);
                                }
                            }
                            int argb2 = Color.argb(255, 0, 0, 0);
                            if (C0797f.f5187bA) {
                                argb2 = Color.argb(100, 0, 0, 0);
                                if (m6100G) {
                                    argb2 = Color.argb(50, 155, 155, 155);
                                }
                            }
                            boolean z14 = false;
                            if (m2047a) {
                                z14 = true;
                                argb2 = Color.argb((int) (100.0f + (150.0f * f28)), 255, 255, 255);
                            }
                            this.f4903a.m2049a(this.f4961w, argb2, z14);
                        }
                    }
                    C0639ad m2222a = m2222a(action2, i6, arrayList2);
                    if (m2222a != null && z9) {
                        this.f4904b.graphics.mo903a(m2222a.m2949c(), this.f4961w.f230a + 3, this.f4961w.f231b + this.f4904b.graphics.mo901a("A", this.f4903a.f5142at) + 1.0f, this.f4903a.f5142at);
                    }
                    boolean z15 = false;
                    InterfaceC0303as mo7517i = action2.mo7517i();
                    BitmapOrTexture mo6180j = action2.mo6180j();
                    Unit m6065i = action2.m6065i(m2195f);
                    if (m6065i != null) {
                        mo7517i = m6065i.getUnitType();
                    }
                    if (mo6180j == null && mo7517i != null) {
                        mo6180j = mo7517i.mo5692z();
                    }
                    if (mo6180j != null) {
                        Rect mo6177v = action2.mo6177v();
                        if (mo6177v == null) {
                            mo6177v = this.f4969E;
                            mo6177v.m7208a(0, 0, mo6180j.mo396m(), mo6180j.mo397l());
                        }
                        float m7202c = (this.f4961w.m7202c() * 0.7f) / mo6177v.m7202c();
                        int m7201d = (int) (this.f4961w.m7201d() - ((mo6177v.m7206b() * 0.5f) * m7202c));
                        int m7200e = (int) (this.f4961w.m7200e() - ((mo6177v.m7202c() * 0.5f) * m7202c));
                        this.f4960p.m7267a(100, 255, 255, 255);
                        RectF rectF = this.f4970F;
                        rectF.m7195a(m7201d, m7200e, m7201d + (mo6177v.m7206b() * m7202c), m7200e + (mo6177v.m7202c() * m7202c));
                        this.f4904b.graphics.mo909a(mo6180j, mo6177v, rectF, this.f4960p);
                        z15 = true;
                    } else if (mo7517i != null) {
                        float m7201d2 = this.f4961w.m7201d();
                        float m7200e2 = this.f4961w.m7200e();
                        if (f27 > 0.5d) {
                            m7200e2 += 1.0f;
                        }
                        if (f27 < -0.5d) {
                            m7200e2 -= 1.0f;
                        }
                        float m7202c2 = this.f4961w.m7202c() * 0.7f;
                        float m7202c3 = this.f4961w.m7202c() * 0.95f;
                        if (C0797f.f5187bA) {
                            m7202c2 = this.f4961w.m7202c() * 0.4f;
                            m7202c3 = this.f4961w.m7202c() * 0.85f;
                        }
                        this.f4965A.m7194a(this.f4961w);
                        if (this.f4965A.m7187b(this.f4986aA)) {
                            this.f4904b.graphics.mo880i();
                            this.f4904b.graphics.mo921a(this.f4965A);
                            UnitType.m5737a(mo7517i, m7201d2, m7200e2, 0.0f, 0.0f, m2195f.team, m7202c2, m7202c3, false, false, action2.m6044t(), m6065i);
                            if (m6065i != null) {
                                float m5878a_ = m6065i.m5878a_();
                                float m5857bU = m6065i.m5857bU();
                                if (m5857bU != -1.0f && action2.m6043t(m2195f)) {
                                    int m2309b = CommonUtils.m2309b(200, 0, 0, 150);
                                    int m2309b2 = CommonUtils.m2309b(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
                                    Paint m498a = C1117y.m498a(m2309b, Paint.Style.FILL);
                                    Paint m498a2 = C1117y.m498a(m2309b2, Paint.Style.STROKE);
                                    int m7190b = ((int) (this.f4965A.m7190b() / 3.0f)) - 3;
                                    int i8 = m7190b * 2;
                                    this.f4970F.m7195a(m7201d2 - m7190b, m7200e2 + 0, (m7201d2 - m7190b) + (i8 * m5857bU), m7200e2 + 0 + 3);
                                    this.f4904b.graphics.mo920a(this.f4970F, m498a);
                                    this.f4970F.m7195a(m7201d2 - m7190b, m7200e2 + 0, (m7201d2 - m7190b) + i8, m7200e2 + 0 + 3);
                                    this.f4904b.graphics.mo920a(this.f4970F, m498a2);
                                } else if (m5878a_ != -1.0f && action2.m6045s(m2195f)) {
                                    int m2309b3 = CommonUtils.m2309b(200, 0, 150, 0);
                                    int m2309b4 = CommonUtils.m2309b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                                    Paint m498a3 = C1117y.m498a(m2309b3, Paint.Style.FILL);
                                    Paint m498a4 = C1117y.m498a(m2309b4, Paint.Style.STROKE);
                                    int m7190b2 = ((int) (this.f4965A.m7190b() / 3.0f)) - 3;
                                    int i9 = m7190b2 * 2;
                                    this.f4970F.m7195a(m7201d2 - m7190b2, m7200e2 + 0, (m7201d2 - m7190b2) + (i9 * m5878a_), m7200e2 + 0 + 3);
                                    this.f4904b.graphics.mo920a(this.f4970F, m498a3);
                                    this.f4970F.m7195a(m7201d2 - m7190b2, m7200e2 + 0, (m7201d2 - m7190b2) + i9, m7200e2 + 0 + 3);
                                    this.f4904b.graphics.mo920a(this.f4970F, m498a4);
                                }
                            }
                            this.f4904b.graphics.mo879j();
                        }
                        z15 = true;
                    }
                    BitmapOrTexture m6066h = action2.m6066h(m2195f);
                    if (m6066h != null) {
                        Rect mo6177v2 = action2.mo6177v();
                        if (mo6177v2 == null) {
                            mo6177v2 = this.f4969E;
                            mo6177v2.m7208a(0, 0, m6066h.mo396m(), m6066h.mo397l());
                        }
                        float m7202c4 = (this.f4961w.m7202c() * 0.7f) / mo6177v2.m7202c();
                        int m7201d3 = (int) (this.f4961w.m7201d() - ((mo6177v2.m7206b() * 0.5f) * m7202c4));
                        int m7200e3 = (int) (this.f4961w.m7200e() - ((mo6177v2.m7202c() * 0.5f) * m7202c4));
                        this.f4960p.m7242b(action2.m6097J());
                        RectF rectF2 = this.f4970F;
                        rectF2.m7195a(m7201d3, m7200e3, m7201d3 + (mo6177v2.m7206b() * m7202c4), m7200e3 + (mo6177v2.m7202c() * m7202c4));
                        this.f4904b.graphics.mo909a(m6066h, mo6177v2, rectF2, this.f4960p);
                        z15 = true;
                    }
                    if (z9) {
                        String m6077d = action2.m6077d();
                        if (m2223a) {
                            this.f4904b.graphics.mo915a(this.f4972W, this.f4961w.f230a + 25, this.f4961w.m7198g(), (Paint) null);
                        }
                        if (this.f4904b.graphics.mo888b(m6077d, this.f4903a.f5145aw) > this.f4961w.m7206b() - 2) {
                            if (this.f4904b.graphics.mo888b(m6077d, this.f4903a.f5144av) > this.f4961w.m7206b() - 2) {
                                this.f4955i.m7259a(this.f4903a.f5143au);
                            } else {
                                this.f4955i.m7259a(this.f4903a.f5144av);
                            }
                        } else {
                            this.f4955i.m7259a(this.f4903a.f5145aw);
                        }
                        if (!z11) {
                            this.f4955i.m7242b(Color.argb(255, 0, 100, 0));
                        }
                        if (mo6182f == EnumC0225t.f1465b) {
                            this.f4955i.m7267a(255, 255, 255, 255);
                        } else if (mo6182f == EnumC0225t.f1466c || mo6182f == EnumC0225t.f1469f) {
                            if (!z11) {
                                this.f4955i.m7267a(255, 19, 101, 94);
                            } else {
                                this.f4955i.m7267a(255, 39, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2);
                            }
                        } else if (mo6182f == EnumC0225t.f1467d) {
                            InterfaceC0303as mo7517i2 = action2.mo7517i();
                            if (mo7517i2 != null && mo7517i2.mo5708g() > 1) {
                                if (!z11) {
                                    this.f4955i.m7267a(255, 117, 120, 15);
                                } else {
                                    this.f4955i.m7267a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                                }
                            }
                        } else if (z10) {
                            this.f4955i.m7267a(155, 255, 255, 255);
                        }
                        int mo901a = this.f4904b.graphics.mo901a(m6077d, this.f4955i);
                        float m7198g = this.f4961w.m7198g() + (mo901a / 2);
                        if (z10) {
                            m7198g = this.f4961w.m7198g();
                        }
                        if (z15 && !m6077d.contains("\n")) {
                            if (z10) {
                                m7198g = (this.f4961w.f233d - (mo901a / 2)) - 1;
                            } else {
                                m7198g = this.f4961w.f233d - 6;
                            }
                        }
                        if (z10) {
                            C0924aa.m1085a(m6077d, this.f4961w.m7199f(), m7198g, this.f4955i);
                        } else {
                            this.f4904b.graphics.mo903a(m6077d, this.f4961w.m7199f(), m7198g, this.f4955i);
                        }
                    }
                    boolean z16 = false;
                    boolean z17 = false;
                    boolean z18 = false;
                    if (m2222a != null && m2222a.m2958a()) {
                        z16 = true;
                        z18 = true;
                    }
                    this.f4963y.m7207a(this.f4961w);
                    if (GameEngine.m1158at()) {
                        CommonUtils.m2307b(this.f4963y, 2.0f);
                    }
                    this.f4903a.m2064a(this.f4963y.f230a, this.f4963y.f231b, this.f4963y.m7206b(), this.f4963y.m7202c());
                    if (!this.f4952d && this.f4963y.m7205b((int) this.f4903a.f5205u, (int) this.f4903a.f5206v) && this.f4986aA.m7189b((int) this.f4903a.f5205u, (int) this.f4903a.f5206v)) {
                        z = true;
                        if (GameEngine.m1157au()) {
                            z17 = true;
                        }
                        if ((this.f4903a.f5220O || this.f4903a.f5209D) && this.f4903a.f5220O && this.f4903a.m2070I()) {
                            this.f4903a.f5220O = false;
                            z16 = true;
                        }
                    }
                    if (GameEngine.m1157au() && this.f4903a.f5120W == null) {
                        if (z17) {
                            this.f4930ac = m2195f;
                            this.f4931ad = action2;
                            this.f4932ae = f23 + f19;
                        } else if (Action.m6089a(this.f4931ad, action2)) {
                            this.f4930ac = null;
                            this.f4931ad = null;
                        }
                    }
                    boolean z19 = false;
                    if (z16 && !z18 && this.f4904b.f6109bQ.mouseSupport && this.f4904b.m1127e(2)) {
                        z19 = true;
                    }
                    if (z16) {
                        C0797f.m2069J();
                        if (action2.m6078c(m2195f, z19)) {
                            z16 = false;
                        }
                        if (this.f4904b.f6120cb.m2635h()) {
                            z16 = false;
                        }
                        if (!m2204c(action2)) {
                            z16 = false;
                        }
                    }
                    if (z16) {
                        if (action2.mo6184e() == EnumC0226u.f1474a || action2.mo6184e() == EnumC0226u.f1476c) {
                            this.f4903a.f5120W = null;
                            boolean z20 = false;
                            if (z18) {
                                z20 = true;
                            } else if (!action2.m6042u()) {
                                z20 = true;
                            } else {
                                if (action2.m6061k(m2195f)) {
                                    z20 = true;
                                } else if (this.f4930ac == m2195f && Action.m6089a(this.f4931ad, action2)) {
                                    z20 = true;
                                }
                                this.f4930ac = m2195f;
                                this.f4931ad = action2;
                                this.f4932ae = f23 + f19;
                            }
                            if (z20) {
                                int i10 = 1;
                                if (action2.mo6181g()) {
                                    if (this.f4903a.m2028a(this.f4904b)) {
                                        i10 = 5;
                                    }
                                    if (this.f4903a.m2009b(this.f4904b)) {
                                        i10 = 10;
                                    }
                                }
                                boolean z21 = false;
                                if (!z18) {
                                    boolean z22 = false;
                                    if (m2195f != null && action2.mo6186b(m2195f, false) != -1) {
                                        z22 = true;
                                    }
                                    if (z19 && z22) {
                                        z21 = true;
                                    }
                                }
                                if (m2223a(action2)) {
                                    this.f4904b.audio.m2998b(AudioEngine.f4041l, 0.8f);
                                } else if (!m2203c && !z21) {
                                    this.f4904b.audio.m2998b(AudioEngine.f4041l, 0.8f);
                                } else {
                                    boolean mo6181g = action2.mo6181g();
                                    if (mo6181g && !z21 && this.f4904b.f6093bs.m6306v() <= this.f4904b.f6093bs.m6307u()) {
                                        this.f4903a.m2008b(this.f4941an);
                                    }
                                    if (mo6181g) {
                                        if (!z21) {
                                            this.f4904b.audio.m2998b(AudioEngine.f4037h, 0.5f);
                                        } else {
                                            this.f4904b.audio.m2998b(AudioEngine.f4038i, 0.5f);
                                        }
                                    } else {
                                        this.f4904b.audio.m2998b(AudioEngine.f4036g, 0.8f);
                                    }
                                    C0794c.m2087a(m2195f, action2, z21, false);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        C0749e m1959w = this.f4903a.m1959w();
                                        if (!action2.m6098I()) {
                                            this.f4903a.m2032a(m1959w, action2);
                                        } else {
                                            this.f4903a.m2031a(m1959w, action2, z21);
                                        }
                                        if (z21) {
                                            m1959w.f4851g = true;
                                        }
                                        m1959w.m2496a(action2.m6035z());
                                        if (!z21) {
                                            this.f4903a.m2045a(action2, (PointF) null, (Unit) null, m1959w);
                                        }
                                    }
                                }
                            }
                        } else if (action2.mo6184e() == EnumC0226u.f1486m || action2.mo6184e() == EnumC0226u.f1485l || action2.mo6184e() == EnumC0226u.f1483j) {
                            if (z19) {
                                if (action2 != null && action2.equals(this.f4903a.f5120W)) {
                                    this.f4903a.m1979k();
                                }
                            } else if (!m2203c) {
                                this.f4904b.audio.m2998b(AudioEngine.f4041l, 0.8f);
                            } else {
                                C0794c.m2087a(m2195f, action2, false, false);
                                this.f4930ac = null;
                                this.f4931ad = null;
                                this.f4903a.f5120W = action2;
                            }
                        } else if (action2.mo6184e() == EnumC0226u.f1477d || action2.mo6184e() == EnumC0226u.f1478e || action2.mo6184e() == EnumC0226u.f1479f || action2.mo6184e() == EnumC0226u.f1480g) {
                            boolean z23 = false;
                            boolean z24 = false;
                            if (action2.mo6184e() == EnumC0226u.f1480g) {
                                z24 = true;
                            }
                            if (z19 && z24) {
                                z23 = true;
                            }
                            if (!z23) {
                                GameEngine.PrintLog("Clicked button: actionActive: " + m2203c);
                                if (!m2203c) {
                                    this.f4904b.audio.m2998b(AudioEngine.f4041l, 0.8f);
                                } else {
                                    C0794c.m2087a(m2195f, action2, false, false);
                                    this.f4930ac = null;
                                    this.f4931ad = null;
                                    this.f4903a.f5120W = action2;
                                }
                            } else {
                                C0749e m1959w2 = this.f4903a.m1959w();
                                if (!action2.m6098I()) {
                                    this.f4903a.m2032a(m1959w2, action2);
                                } else {
                                    this.f4903a.m2031a(m1959w2, action2, z23);
                                }
                                m1959w2.f4851g = true;
                                m1959w2.m2496a(action2.m6035z());
                            }
                        } else if (action2.mo6184e() == EnumC0226u.f1475b) {
                            if (m2223a(action2)) {
                                this.f4904b.audio.m2998b(AudioEngine.f4041l, 0.8f);
                            } else if (!m2203c) {
                                this.f4904b.audio.m2998b(AudioEngine.f4041l, 0.8f);
                            } else {
                                this.f4904b.audio.m2998b(AudioEngine.f4036g, 0.8f);
                            }
                            C0794c.m2087a(m2195f, action2, false, false);
                            this.f4930ac = null;
                            this.f4931ad = null;
                            if (this.f4903a.f5120W == null) {
                                this.f4903a.f5126ac = false;
                            }
                            this.f4903a.f5119U = m2195f;
                            this.f4903a.f5120W = action2;
                            this.f4903a.f5123Z = 0.0f;
                            this.f4903a.f5134ak = -99.0f;
                            this.f4903a.f5135al = -99.0f;
                            if (!this.f4903a.f5122Y) {
                                this.f4903a.f5124aa = this.f4904b.f6150cH * this.f4904b.f6250cW;
                                this.f4903a.f5125ab = this.f4904b.f6151cI * this.f4904b.f6250cW;
                            }
                            this.f4903a.f5122Y = true;
                            this.f4904b.f6104bL.m6600e();
                        } else if (action2.mo6184e() == EnumC0226u.f1484k) {
                            C0794c.m2087a(m2195f, action2, false, false);
                            action2.m6079c(m2195f);
                        } else if (action2.mo6184e() == EnumC0226u.f1482i) {
                            if (action2.m6104C()) {
                                this.f4930ac = m2195f;
                                this.f4931ad = action2;
                                this.f4932ae = f23 + f19;
                                this.f4903a.f5120W = null;
                            }
                        } else {
                            throw new RuntimeException("unknown gui action:" + action2.mo6184e());
                        }
                    }
                    if (this.f4931ad == action2) {
                        z2 = m2203c;
                    }
                }
            }
            this.f4904b.graphics.mo879j();
            this.f4986aA.m7182f();
        }
        if (m2195f != null && m2195f == this.f4930ac) {
            if (this.f4931ad != null) {
                boolean z25 = true;
                if (GameEngine.m1157au()) {
                    z25 = false;
                }
                boolean z26 = false;
                if (this.f4931ad.m6042u()) {
                    z26 = true;
                }
                if (GameEngine.m1157au() && this.f4931ad.m6067h()) {
                    z26 = true;
                }
                if (z26) {
                    boolean z27 = true;
                    if (!z2) {
                        z27 = false;
                    }
                    if (this.f4903a.m2042a(this.f4931ad, z25, this.f4930ac, !z27, true, this.f4932ae)) {
                        this.f4930ac = null;
                    }
                }
            }
        } else {
            this.f4930ac = null;
        }
        if (GameEngine.m1157au() && !z) {
            this.f4930ac = null;
            this.f4931ad = null;
        }
        return i2;
    }

    /* renamed from: i */
    float m2190i() {
        return (float) (CommonUtils.m2315b((this.f4904b.f6129cl / 14.0f) / this.f4904b.f6126ci, 25.0f * this.f4904b.f6126ci, 40.0f * this.f4904b.f6126ci) * 0.9d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2228a(float f, int i) {
        boolean z = true;
        if (i == 0) {
            z = true;
        }
        if (C0797f.f5186a) {
            z = false;
        }
        if (this.f4903a.f5163aR > 0) {
            if (this.f4903a.f5105c != null && this.f4903a.f5163aR == 1 && this.f4903a.f5105c.f1643cE) {
                z = false;
            }
            if (z) {
                if (this.f4903a.m2013b((int) ((this.f4904b.f6128ck - this.f4904b.f6115bW.f5299c) + 2.0f), this.f4904b.f6115bW.m1935b() + 2, (int) (this.f4904b.f6115bW.f5299c - 4.0f), (int) m2190i(), this.f4936ai, EnumC0798g.unselectAllButton, false, Color.argb(140, 100, 100, 100)) && !this.f4903a.f5219N) {
                    this.f4903a.m1998d();
                    this.f4903a.m1979k();
                    this.f4903a.m1958x();
                }
            }
            Team team = null;
            boolean z2 = false;
            this.f4987aB.clear();
            Unit unit = null;
            Unit[] m523a = this.f4903a.f5255bL.m523a();
            int size = this.f4903a.f5255bL.size();
            for (int i2 = 0; i2 < size; i2++) {
                Unit unit2 = m523a[i2];
                if (unit2.f1643cE) {
                    unit = unit2;
                    if (this.f4903a.m1974m(unit2)) {
                        InterfaceC0303as unitType = unit2.getUnitType();
                        Integer num = (Integer) this.f4987aB.get(unitType);
                        if (num == null) {
                            this.f4987aB.put(unitType, 1);
                        } else {
                            this.f4987aB.put(unitType, Integer.valueOf(num.intValue() + 1));
                        }
                        z2 = true;
                    } else {
                        team = unit2.team;
                    }
                }
            }
            boolean z3 = this.f4904b.f6094bv;
            if (team != null && this.f4904b.f6093bs != null && team.m6370b(this.f4904b.f6093bs)) {
                z3 = true;
            }
            int m2191h = (int) m2191h();
            int i3 = m2191h + 2;
            int i4 = (int) (10.0f * this.f4904b.f6126ci);
            float m1935b = this.f4904b.f6115bW.m1935b() + m2191h + 30;
            float f2 = (this.f4904b.f6128ck - this.f4904b.f6132cp) + i4;
            float f3 = m1935b + 5.0f;
            if (unit != null) {
                f3 = f3 + i3 + (i3 * i);
                if (this.f4903a.f5200o) {
                    f3 -= (2 * i3) * 0.4f;
                }
            }
            this.f4961w.m7208a((int) f2, (int) f3, (int) ((f2 + this.f4904b.f6132cp) - (i4 * 2)), (int) (f3 + m2191h));
            boolean z4 = false;
            if (!C0797f.f5189bC) {
                if (i < 3 && !z2 && team != null) {
                    Paint paint = this.f4903a.f5148az;
                    if (this.f4904b.f6093bs.m6342d(team)) {
                        paint = this.f4903a.f5149aA;
                    }
                    this.f4903a.m2022a(m2224a(team), this.f4961w, paint, paint);
                    z4 = true;
                }
                if (this.f4903a.m1969p() == 1 && unit != null) {
                    if (unit.m5804cp() <= 3 || (team != null && !z3)) {
                        String m2217a = m2217a(unit, false);
                        if (z4) {
                            m2217a = "\n" + ("\n" + ("\n" + m2217a));
                        }
                        Paint paint2 = this.f4955i;
                        paint2.m7271a();
                        paint2.m7242b(Color.argb(50, 100, 100, 100));
                        this.f4903a.m2022a(m2217a, this.f4961w, this.f4903a.f5150aB, this.f4903a.f5150aB);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public String m2224a(Team team) {
        String str = VariableScope.nullOrMissingString;
        boolean z = false;
        if (this.f4904b.f6093bs.m6374b()) {
            z = true;
        } else if (this.f4904b.f6093bs.m6342d(team)) {
            str = str + this.f4937aj;
        } else if (this.f4904b.f6093bs.m6354c(team)) {
            str = str + this.f4938ak;
        } else {
            z = true;
        }
        if (z) {
            if (team == Team.f1370i) {
                str = str + this.f4939al;
            } else {
                str = str + "Team - " + team.m6325h();
            }
        }
        String str2 = str + "\n";
        if (team.f1315u != null) {
            str2 = str2 + team.f1315u;
        }
        if (!team.f1316v && this.f4904b.m1222M() && team.m6302z()) {
            str2 = (str2 + "\n") + "(disconnected)";
        }
        return str2;
    }

    /* renamed from: a */
    public String m2217a(Unit unit, boolean z) {
        String str;
        String str2 = VariableScope.nullOrMissingString;
        if (z) {
            str2 = str2 + unit.getUnitType().mo5710e() + "\n";
        }
        if (unit.mo4209g() > 0.0f) {
            str = str2 + C0424b.m5220a(unit.m5835cL(), unit.f1631cs / unit.f1632ct).m5210a(true, true, 3, false);
        } else {
            str = str2 + ((int) Math.ceil(unit.f1631cs)) + "/" + ((int) unit.f1632ct) + "\n";
        }
        if (unit.f1637cy != 0.0f) {
            str = str + "(" + ((int) unit.f1634cv) + "/" + ((int) unit.f1637cy) + ")\n";
        }
        C0424b m5775do = unit.m5775do();
        C0439f m5797cx = unit.m5797cx();
        if (m5775do != null) {
            m5797cx = C0439f.m5092d(m5797cx);
            m5797cx.m5125a(m5775do);
        }
        if (!m5797cx.m5100c()) {
            Iterator it = m5797cx.f2801b.iterator();
            while (it.hasNext()) {
                C0438e c0438e = (C0438e) it.next();
                if (c0438e.f2799b != 0.0d && !c0438e.f2798a.m5161a()) {
                    str = str + c0438e.f2798a.m5158a(c0438e.f2799b, true, false) + "\n";
                }
            }
        }
        return CommonUtils.m2245j(str);
    }

    /* renamed from: a */
    public static String m2220a(Action action, boolean z) {
        String str;
        AbstractC0228w abstractC0228w;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = VariableScope.nullOrMissingString;
        if (action instanceof AbstractC0228w) {
            if (((AbstractC0228w) action).mo4250K() < 1.0f) {
                GameEngine gameEngine = GameEngine.getInstance();
                float f = -1.0f;
                Unit[] m523a = gameEngine.f6111bS.f5255bL.m523a();
                int size = gameEngine.f6111bS.f5255bL.size();
                for (int i = 0; i < size; i++) {
                    float m5798cv = m523a[i].m5798cv();
                    if (f == -1.0f || m5798cv < f) {
                        f = m5798cv;
                    }
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                str2 = str2 + CommonUtils.m2259g((1.0f / ((abstractC0228w.mo4250K() * f) * 60.0f)) + 1.0E-4f) + str;
            }
        }
        return CommonUtils.m2331a(str2, str);
    }

    /* renamed from: a */
    public static String m2216a(Unit unit, boolean z, boolean z2, boolean z3) {
        String str;
        C0824b c0824b;
        float f;
        if (z2) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = VariableScope.nullOrMissingString;
        C0451j c0451j = null;
        C0453l c0453l = null;
        if (unit instanceof C0451j) {
            c0451j = (C0451j) unit;
            c0453l = c0451j.f2861w;
        }
        if (z) {
            str2 = str2 + unit.getUnitType().mo5710e() + str;
        }
        if (c0453l == null || !c0453l.f2954aN) {
            if (!z3) {
                str2 = str2 + "HP: " + ((int) Math.ceil(unit.f1631cs)) + "/" + ((int) unit.f1632ct) + str;
            } else {
                str2 = str2 + "HP: " + ((int) unit.f1632ct) + str;
            }
        }
        if (unit.f1637cy != 0.0f) {
            if (!z3) {
                str2 = str2 + "Shield: " + ((int) unit.f1634cv) + "/" + ((int) unit.f1637cy) + str;
            } else {
                str2 = str2 + "Shield: " + ((int) unit.f1637cy) + str;
            }
        }
        if (c0451j != null) {
            if (c0451j.f2862x.f2248l >= 1.0f) {
                str2 = str2 + "Armour: " + ((int) f) + str;
            }
        }
        C0424b m5775do = unit.m5775do();
        float mo4491cw = unit.mo4491cw();
        if (m5775do != null) {
            mo4491cw += m5775do.m5231a();
        }
        if (mo4491cw != 0.0f) {
            if (mo4491cw < 0.0f) {
                str2 = str2 + "Income: -$" + CommonUtils.m2363a(-mo4491cw, 1) + str;
            } else {
                str2 = str2 + "Income: +$" + CommonUtils.m2363a(mo4491cw, 1) + str;
            }
        }
        if (unit instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
            if (abstractC0623y.mo3101bd() != 0.0f && !z3) {
                str2 = str2 + "Energy: " + CommonUtils.m2266f(unit.f1638cz) + "/" + CommonUtils.m2266f(abstractC0623y.mo3101bd()) + str;
            }
            float moveSpeed = abstractC0623y.getMoveSpeed();
            if (!abstractC0623y.m3162aR()) {
                moveSpeed = 0.0f;
            }
            if (moveSpeed != 0.0f) {
                str2 = str2 + "Speed: " + CommonUtils.m2266f(moveSpeed) + str;
            }
            if (abstractC0623y.canAttack()) {
                ArrayList m3156aX = abstractC0623y.m3156aX();
                if (m3156aX.size() > 0) {
                    String str3 = str2 + "Attack: ";
                    boolean z4 = true;
                    Iterator it = m3156aX.iterator();
                    while (it.hasNext()) {
                        C0232aa c0232aa = (C0232aa) it.next();
                        if (!z4) {
                            str3 = str3 + ", ";
                        }
                        z4 = false;
                        String str4 = str3 + CommonUtils.m2266f(c0232aa.f1497a);
                        if (c0232aa.f1500d > 1) {
                            str4 = str4 + "x" + c0232aa.f1500d;
                        }
                        str3 = str4 + "/" + CommonUtils.m2266f(c0232aa.m5967a()) + "s";
                    }
                    str2 = str3 + str;
                }
            }
            float maxAttackRange = abstractC0623y.getMaxAttackRange();
            if (!abstractC0623y.canAttack()) {
                maxAttackRange = 0.0f;
            }
            if (maxAttackRange != 0.0f) {
                str2 = str2 + "Range: " + CommonUtils.m2266f(maxAttackRange) + str;
            }
            if (z3 && abstractC0623y.m5810cj()) {
                str2 = str2 + "Upgradable" + str;
            }
        }
        if (!z3 && unit.f1657cS > 0) {
            str2 = str2 + "Kills: " + unit.f1657cS + str;
        }
        boolean z5 = false;
        if (GameEngine.getInstance().f6225bl) {
            InterfaceC0303as unitType = unit.getUnitType();
            str2 = ((str2 + "\n") + "--Debug--" + str) + "name: " + unitType.mo5706i() + str;
            if ((unitType instanceof C0453l) && (c0824b = ((C0453l) unitType).f2917I) != null) {
                str2 = str2 + "(mod: " + CommonUtils.m2334a(c0824b.m1846a(), 30) + ")" + str;
            }
            if (unit.f6945ed != 0) {
                str2 = str2 + "id: " + unit.f6945ed + str;
            }
            if (unit.f1642cD != 0) {
                String str5 = VariableScope.nullOrMissingString;
                for (int i = 0; i < 32; i++) {
                    if (C0424b.m5229a(unit.f1642cD, i)) {
                        if (str5.length() > 0) {
                            str5 = str5 + ",";
                        }
                        str5 = str5 + i;
                    }
                }
                str2 = str2 + "flags: " + str5 + str;
            }
            if (unit.f1641cC != 0) {
                str2 = str2 + "ammo: " + unit.f1641cC + str;
            }
            if (!unit.f1626cn) {
                str2 = (str2 + "x: " + CommonUtils.m2266f(unit.f6951ek) + str) + "y: " + CommonUtils.m2266f(unit.f6952el) + str;
            }
            if (unit.f1613ca != 0.0f || unit.f1614cb != 0.0f) {
                str2 = str2 + "x/y speed: " + CommonUtils.m2266f(unit.f1613ca) + ", " + CommonUtils.m2266f(unit.f1614cb) + str;
            }
            if (!unit.f1626cn) {
                str2 = (str2 + "height: " + CommonUtils.m2266f(unit.height) + str) + "dir: " + CommonUtils.m2266f(unit.direction) + str;
            }
            if (unit.f1623ck < 1.0f) {
                str2 = str2 + "built: " + CommonUtils.m2266f(unit.f1623ck) + str;
            }
            if (unit instanceof C0451j) {
                C0451j c0451j2 = (C0451j) unit;
                str2 = (str2 + "frame: " + c0451j2.f2839a + str) + "drawLayer: " + c0451j2.f6949ei + str;
                if (c0451j2.m4854dc() != null) {
                    str2 = str2 + "tags: " + c0451j2.m4854dc() + str;
                }
                if (c0451j2.f1651cM != null) {
                    str2 = str2 + "attachedTo: " + c0451j2.f1651cM.m5795cz() + str;
                }
                if (c0451j2.f1579bt != null && !c0451j2.f1579bt.isDead) {
                    str2 = str2 + "customTarget1: " + c0451j2.f1579bt.m5795cz() + str;
                }
                if (c0451j2.f1580bu != null && !c0451j2.f1580bu.isDead) {
                    str2 = str2 + "customTarget2: " + c0451j2.f1580bu.m5795cz() + str;
                }
                if (c0451j2.f1585bz != -9999) {
                    str2 = str2 + "customTimer: " + CommonUtils.m2259g(c0451j2.f1585bz / 1000.0f) + str;
                }
                if (c0451j2.f1581bv != null && !c0451j2.f1581bv.isEmpty()) {
                    str2 = str2 + "-- memory --: " + str + c0451j2.f1581bv.debugMemory(true, true) + str;
                }
            }
            z5 = true;
        }
        C0439f m5786dd = unit.m5786dd();
        if (m5786dd != null && !m5786dd.m5100c()) {
            String m5111a = m5786dd.m5111a(z2, true, 10, z5, false);
            if (!m5111a.equals(VariableScope.nullOrMissingString)) {
                str2 = str2 + m5111a + str;
            }
        }
        return CommonUtils.m2331a(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m2189j() {
        Iterator it = this.f4988aC.iterator();
        while (it.hasNext()) {
            ((C0784ac) it.next()).f5068h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m2188k() {
        Iterator it = this.f4988aC.iterator();
        while (it.hasNext()) {
            ((C0784ac) it.next()).m2119b();
        }
        this.f4976ao = null;
        this.f4977ap = 0.0f;
    }

    /* renamed from: a */
    void m2225a(int i, int i2, int i3, String str, String str2, Paint paint, float f) {
        int i4 = (int) (i3 * 2.5d);
        int i5 = (int) (40.0f * this.f4904b.f6126ci);
        int i6 = i + (i3 / 2);
        int i7 = (int) ((i2 - i5) - (35.0f * this.f4904b.f6126ci));
        this.f4989aD.m7208a(i6 - (i4 / 2), i7, i4, i5);
        this.f4903a.m2054a(this.f4989aD.f230a, this.f4989aD.f231b, this.f4989aD.f232c, this.f4989aD.f233d, VariableScope.nullOrMissingString, Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100, 100), this.f4903a.f5145aw, false);
        this.f4961w.m7208a(this.f4989aD.f230a, this.f4989aD.f231b, this.f4989aD.f232c, this.f4989aD.f233d);
        Rect rect = this.f4961w;
        rect.f232c = (int) (rect.f232c * f);
        this.f4904b.graphics.mo886c(this.f4961w, paint);
        this.f4904b.graphics.mo903a(str, i6, i7 + ((this.f4903a.f5145aw.m7222k() + 5.0f) * 1.0f), this.f4903a.f5145aw);
        this.f4904b.graphics.mo903a(str2, i6, i7 + ((this.f4903a.f5145aw.m7222k() + 5.0f) * 2.0f), this.f4903a.f5145aw);
    }

    /* renamed from: l */
    void m2187l() {
        this.f4990aF.clear();
        this.f4990aF.add(new C07611("Finish game"));
        this.f4990aF.add(new C07622("Keep playing"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.f.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a$1.class */
    public class C07611 extends AbstractC0793b {
        C07611(String str) {
            super(C0760a.this, str);
        }

        /* renamed from: a */
        void mo2091a() {
            C0760a.this.f4904b.f6265dt = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.f.a$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a$2.class */
    public class C07622 extends AbstractC0793b {
        C07622(String str) {
            super(C0760a.this, str);
        }

        /* renamed from: a */
        void mo2091a() {
            C0760a.this.f4904b.f6262dq = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2197e(float f) {
        String str;
        boolean z = false;
        if ((this.f4904b.f6261dp || this.f4904b.f6264ds) && !this.f4904b.f6262dq) {
            z = true;
        }
        if (!this.f4904b.f6261dp) {
            this.f4991aG = false;
        } else if (!this.f4991aG) {
            this.f4991aG = true;
            if (!this.f4904b.f6222ar && this.f4904b.f6109bQ.numberOfWins >= 5 && !this.f4904b.f6109bQ.rateGameShown && GameEngine.f6186au) {
                this.f4994aN = true;
                this.f4904b.f6109bQ.rateGameShown = true;
                this.f4904b.f6109bQ.save();
            }
        }
        if (!z) {
            this.f4992aH = 0.0f;
            this.f4945aJ = 0;
        }
        if (!z || this.f4904b.f6233bx >= 120 || this.f4904b.f6111bS.f5105c != null) {
        }
        if (z && !this.f4903a.f5201p) {
            this.f4992aH += f;
            if (this.f4904b.f6233bx < 120) {
                this.f4992aH = 100000.0f;
            }
            boolean z2 = this.f4992aH > 80.0f;
            boolean z3 = this.f4992aH > 100.0f;
            boolean z4 = this.f4992aH > 160.0f;
            if (this.f4945aJ == 0) {
                this.f4945aJ = 1;
            }
            int m1204a = this.f4904b.m1204a(210);
            this.f4961w.f230a = (int) ((this.f4904b.f6147cE / 2.0f) - (m1204a / 2));
            this.f4961w.f232c = (int) ((this.f4904b.f6147cE / 2.0f) + (m1204a / 2));
            int m1204a2 = this.f4904b.m1204a(30);
            int m1204a3 = m1204a2 + this.f4904b.m1204a(30);
            int m1204a4 = this.f4904b.m1204a(40) + (m1204a3 * this.f4990aF.size());
            float f2 = this.f4904b.f6131co - (m1204a4 / 2);
            if (f2 > 50.0f) {
                f2 /= 2.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            this.f4961w.f231b = (int) f2;
            this.f4961w.f233d = this.f4961w.f231b + m1204a4;
            if (z2) {
                this.f4904b.graphics.mo912a(this.f4903a.f5235bf, this.f4961w, (Paint) null);
                this.f4904b.graphics.mo892b(this.f4961w, this.f4903a.f5158aJ);
            }
            Rect rect = new Rect(this.f4961w);
            int m1204a5 = this.f4961w.f231b + this.f4904b.m1204a(20);
            int m1204a6 = this.f4904b.m1204a(140);
            int i = (int) ((this.f4904b.f6147cE / 2.0f) - (m1204a6 / 2));
            int argb = Color.argb(140, 100, 100, 100);
            int i2 = i + (m1204a6 / 2);
            Paint paint = this.f4909q;
            String str2 = "Victory!";
            if (this.f4904b.f6264ds) {
                str2 = "Defeat";
            }
            float f3 = 1.0f;
            if (this.f4992aH < 95.0f) {
                f3 = this.f4992aH / 95.0f;
            }
            int m2249i = (int) (m1204a5 - (CommonUtils.m2249i(f3 * 90.0f) * 100.0f));
            paint.m7252a(str2, 0, str2.length(), this.f4964z);
            this.f4904b.graphics.mo903a(str2, i2, m2249i - ((paint.m7221l() + paint.m7220m()) / 2.0f), paint);
            if (this.f4992aH < 100.0f && !this.f4904b.f6264ds) {
                this.f4993aI += f;
                if (this.f4993aI > 0.5f) {
                    this.f4993aI = 0.0f;
                    this.f4904b.effects.m2536b(EnumC0748h.f4830e);
                    this.f4904b.effects.m2544b();
                    C0745e m2538b = this.f4904b.effects.m2538b(0.0f, 0.0f, 0.0f, Color.argb(255, CommonUtils.m2360a(0, 255), CommonUtils.m2360a(0, 255), CommonUtils.m2360a(0, 255)));
                    if (m2538b != null) {
                        m2538b.f4717o = true;
                        m2538b.f4732J = i2 + CommonUtils.rnd(-70.0f, 70.0f);
                        m2538b.f4733K = m2249i + CommonUtils.rnd(-15.0f, 15.0f);
                        m2538b.f4733K += this.f4904b.f6131co / 2.0f;
                        m2538b.f4734L += this.f4904b.f6131co / 2.0f;
                        m2538b.f4745W = CommonUtils.rnd(140.0f, 380.0f);
                        m2538b.f4746X = m2538b.f4745W;
                        m2538b.f4720s = true;
                        m2538b.f4721t = true;
                        m2538b.f4722u = 5.0f;
                        m2538b.f4728F = 2.0f;
                        m2538b.f4740R = CommonUtils.rnd(-2.7f, 2.7f);
                        m2538b.f4739Q = CommonUtils.rnd(-12.7f, 12.7f);
                        m2538b.f4730H = 0.4f;
                        m2538b.f4729G = 0.2f;
                        m2538b.f4741S = CommonUtils.rnd(2.0f, 4.0f);
                        m2538b.f4781x = 2.0f;
                        m2538b.f4724w = true;
                    }
                }
            }
            int m7202c = m1204a5 + this.f4964z.m7202c();
            int i3 = rect.f233d + 30;
            this.f4911s.m7252a("123|", 0, "123|".length(), this.f4964z);
            float m7202c2 = this.f4964z.m7202c() + 6;
            float f4 = 1.5f;
            Iterator it = this.f4997aQ.iterator();
            while (it.hasNext()) {
                C0796e c0796e = (C0796e) it.next();
                if (z4) {
                    if (c0796e.f5104d != 1.0f && f4 > 0.0f) {
                        c0796e.f5104d = CommonUtils.m2367a(c0796e.f5104d, 1.0f, 0.01f * f4 * f);
                        f4 -= 1.0f - c0796e.f5104d;
                    }
                    float m2315b = CommonUtils.m2315b(c0796e.f5104d, 0.0f, 1.0f);
                    if (c0796e.f5102b != null) {
                        str = c0796e.f5102b;
                    } else {
                        str = VariableScope.nullOrMissingString + ((int) (c0796e.f5103c * m2315b));
                        if (m2315b <= 0.0f) {
                            str = " ";
                        }
                    }
                    String str3 = c0796e.f5101a;
                    float m2315b2 = CommonUtils.m2315b(c0796e.f5104d * 2.2f, 0.0f, 1.0f);
                    int i4 = 0;
                    if (m2315b2 > 0.0f) {
                        i4 = (int) (str3.length() * m2315b2);
                    }
                    int m2310b = CommonUtils.m2310b(i4, 0, str3.length());
                    String str4 = VariableScope.nullOrMissingString;
                    if (m2310b > 0 && m2310b < str3.length() - 1) {
                        str4 = "_";
                    }
                    this.f4904b.graphics.mo903a(str3.substring(0, m2310b) + str4 + CommonUtils.m2276d(" ", (str3.length() + str4.length()) - m2310b), i2 - (8.0f * this.f4911s.m7222k()), i3, this.f4911s);
                    this.f4904b.graphics.mo903a(str, i2 + (8.0f * this.f4911s.m7222k()), i3, this.f4912t);
                    i3 = (int) (i3 + m7202c2);
                }
            }
            for (int i5 = 0; i5 < this.f4990aF.size(); i5++) {
                if (z3) {
                    AbstractC0793b abstractC0793b = (AbstractC0793b) this.f4990aF.get(i5);
                    if (this.f4903a.m2052a(i, m7202c, m1204a6, m1204a2, abstractC0793b.m2090b(), EnumC0798g.none, false, argb, this.f4903a.f5146ax)) {
                        this.f4994aN = false;
                        abstractC0793b.mo2091a();
                    }
                }
                m7202c += m1204a3;
            }
            if (this.f4994aN) {
                m2194f(f);
            }
        }
    }

    /* renamed from: f */
    void m2194f(float f) {
        int m1204a = this.f4904b.m1204a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        int i = (int) ((this.f4904b.f6147cE / 2.0f) - (m1204a / 2));
        int m1204a2 = this.f4904b.m1204a(120);
        int i2 = (int) (this.f4904b.f6149cG - m1204a2);
        this.f4961w.m7208a(i, i2, m1204a, m1204a2);
        this.f4904b.graphics.mo892b(this.f4961w, this.f4903a.f5158aJ);
        int i3 = i + (m1204a / 2);
        Paint paint = this.f4909q;
        String str = f4948aK;
        paint.m7252a(str, 0, str.length(), this.f4964z);
        this.f4904b.graphics.mo903a(str, i3, i2 - ((paint.m7221l() + paint.m7220m()) / 2.0f), paint);
        int m7202c = i2 + this.f4964z.m7202c();
        int m1204a3 = this.f4904b.m1204a(70);
        int m1204a4 = this.f4904b.m1204a(30);
        int m1204a5 = ((i + (m1204a / 2)) - this.f4904b.m1204a(10)) - m1204a3;
        int argb = Color.argb(140, 100, 100, 100);
        if (this.f4903a.m2052a(m1204a5, m7202c, m1204a3, m1204a4, f4949aL, EnumC0798g.none, false, argb, this.f4903a.f5146ax)) {
            this.f4994aN = false;
            InterfaceC0096f interfaceC0096f = this.f4904b.f6073ao;
            if (interfaceC0096f == null) {
                GameEngine.m1145b("showRateNow: gameView==null");
                return;
            }
            ActivityC0097g mo6954i = interfaceC0096f.mo6954i();
            if (mo6954i == null) {
                GameEngine.m1145b("showRateNow: inGameActivity==null");
                return;
            }
            mo6954i.m6938l();
        }
        if (this.f4903a.m2052a(i + (m1204a / 2) + this.f4904b.m1204a(10), m7202c, m1204a3, m1204a4, f4950aM, EnumC0798g.none, false, argb, this.f4903a.f5146ax)) {
            this.f4994aN = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2227a(float f, boolean z) {
        int i;
        int i2;
        float f2 = this.f4904b.f6126ci * 0.7f;
        if (GameEngine.m1158at() && f2 < 0.7d) {
            f2 = 0.7f;
        }
        int mo396m = (int) (this.f4973X.mo396m() * f2);
        int i3 = 4 + (mo396m / 2);
        int i4 = 4 + (mo396m / 2);
        if (this.f4904b.m1121g(111)) {
            boolean z2 = false;
            if (!this.f4903a.f5201p) {
                z2 = this.f4903a.m1979k();
            }
            if (!z2) {
                this.f4903a.f5201p = !this.f4903a.f5201p;
            }
        }
        if (this.f4903a.f5201p) {
            this.f4944aE += 0.008f * f;
            if (this.f4944aE > 1.0f) {
                this.f4944aE = 0.0f;
            }
            this.f4954h.m7237c(150 + ((int) (100.0f * CommonUtils.sin(this.f4944aE * 180.0f))));
        } else {
            this.f4944aE = 0.0f;
            this.f4954h.m7237c(80);
        }
        this.f4964z.m7208a(i3, i4, i3 + mo396m, i4 + mo396m);
        this.f4964z.m7209a(-(mo396m / 2), -(mo396m / 2));
        if (z) {
            this.f4904b.graphics.mo914a(this.f4973X, this.f4964z.f230a, this.f4964z.f231b, this.f4954h, 0.0f, f2);
            if (this.f4904b.f6109bQ.newRender) {
                this.f4969E.m7208a(this.f4964z.m7201d() - 4, this.f4964z.m7200e() - 4, this.f4964z.m7201d() + 4, this.f4964z.m7200e() + 4);
                this.f4960p.m7267a(100, 0, 155, 0);
                this.f4904b.graphics.mo892b(this.f4969E, this.f4960p);
            }
        }
        if (GameEngine.m1158at()) {
            CommonUtils.m2352a(this.f4964z, 4.0f);
        }
        if (this.f4903a.f5220O && !this.f4903a.f5219N && this.f4964z.m7205b((int) this.f4903a.f5203s, (int) this.f4903a.f5204t)) {
            this.f4903a.f5220O = false;
            this.f4903a.f5201p = !this.f4903a.f5201p;
        }
        if (this.f4904b.f6120cb.m2635h()) {
            this.f4954h.m7237c(80);
            if (this.f4904b.f6120cb.f4505t != 1) {
                this.f4954h.m7237c(200);
            }
            int i5 = (int) (this.f4975Z.f6397q * this.f4904b.f6126ci * 1.6f);
            int i6 = (int) (this.f4904b.f6147cE / 2.0f);
            int m7222k = 7 + ((int) this.f4903a.f5147ay.m7222k());
            this.f4904b.graphics.mo903a(CommonUtils.m2356a(this.f4904b.f6096by / 1000), i6, m7222k, this.f4903a.f5147ay);
            int i7 = m7222k + (i5 / 2) + 10;
            int i8 = i6 + (i5 / 2) + 5;
            this.f4964z.m7208a(i8, i7, i8 + i5, i7 + i5);
            this.f4964z.m7209a((-this.f4964z.m7206b()) / 2, (-this.f4964z.m7202c()) / 2);
            if (z) {
                this.f4904b.graphics.mo914a(this.f4975Z, this.f4964z.f230a, this.f4964z.f231b, this.f4954h, 0.0f, i5 / i);
            }
            if (this.f4903a.f5220O && !this.f4903a.f5219N && this.f4964z.m7205b((int) this.f4903a.f5203s, (int) this.f4903a.f5204t)) {
                this.f4903a.f5220O = false;
                this.f4904b.f6120cb.m2645b();
            }
            if (this.f4904b.f6231bt != 1.0f && z) {
                this.f4904b.graphics.mo903a("x" + this.f4904b.f6231bt, this.f4964z.m7201d() + (i5 / 2), this.f4964z.m7200e(), this.f4903a.f5145aw);
            }
            BitmapOrTexture bitmapOrTexture = this.f4974Y;
            int i9 = (int) (bitmapOrTexture.f6397q * this.f4904b.f6126ci * 1.6f);
            int i10 = i8 - (i9 + 5);
            this.f4964z.m7208a(i10, i7, i10 + i9, i7 + i9);
            this.f4964z.m7209a((-this.f4964z.m7206b()) / 2, (-this.f4964z.m7202c()) / 2);
            if (z) {
                this.f4904b.graphics.mo914a(bitmapOrTexture, this.f4964z.f230a, this.f4964z.f231b, this.f4954h, 0.0f, i9 / i2);
            }
            if (this.f4903a.f5220O && !this.f4903a.f5219N && this.f4964z.m7205b((int) this.f4903a.f5203s, (int) this.f4903a.f5204t)) {
                this.f4903a.f5220O = false;
                this.f4904b.f6120cb.m2658a();
            }
        }
        if (this.f4903a.f5201p) {
            this.f4904b.f6155cT = false;
            int m1204a = this.f4904b.m1204a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
            this.f4961w.f230a = (int) ((this.f4904b.f6147cE / 2.0f) - (m1204a / 2));
            this.f4961w.f232c = (int) ((this.f4904b.f6147cE / 2.0f) + (m1204a / 2));
            int m1204a2 = this.f4904b.m1204a(30);
            int m1204a3 = m1204a2 + this.f4904b.m1204a(15);
            Menu m2183p = m2183p();
            int m1204a4 = this.f4904b.m1204a(40) + (m1204a3 * (1 + m2183p.size()));
            this.f4961w.f231b = (int) (this.f4904b.f6131co - (m1204a4 / 2));
            this.f4961w.f233d = (int) (this.f4904b.f6131co + (m1204a4 / 2));
            if (z) {
                this.f4904b.graphics.mo912a(this.f4903a.f5235bf, this.f4961w, (Paint) null);
                this.f4904b.graphics.mo892b(this.f4961w, this.f4903a.f5158aJ);
            }
            int m1204a5 = this.f4961w.f231b + this.f4904b.m1204a(40);
            int m1204a6 = this.f4904b.m1204a(140);
            int i11 = (int) ((this.f4904b.f6147cE / 2.0f) - (m1204a6 / 2));
            int argb = Color.argb(140, 100, 100, 100);
            if (this.f4903a.m2052a(i11, m1204a5, m1204a6, m1204a2, C0820a.m1886a("menus.ingame.resume", new Object[0]), EnumC0798g.none, false, argb, this.f4903a.f5146ax)) {
                this.f4903a.f5220O = false;
                this.f4903a.f5225aP = 40.0f;
                this.f4903a.f5201p = false;
            }
            int i12 = m1204a5 + m1204a3;
            for (int i13 = 0; i13 < m2183p.size(); i13++) {
                MenuItem item = m2183p.getItem(i13);
                if (this.f4903a.m2052a(i11, i12, m1204a6, m1204a2, item.getTitle().toString(), EnumC0798g.none, false, argb, this.f4903a.f5146ax)) {
                    m2226a(item.getItemId());
                    this.f4903a.f5220O = false;
                    this.f4903a.f5225aP = 40.0f;
                }
                i12 += m1204a3;
            }
        }
    }

    /* renamed from: m */
    public void m2186m() {
        m2226a(20);
    }

    /* renamed from: n */
    public void m2185n() {
        m2226a(21);
    }

    /* renamed from: o */
    public void m2184o() {
        m2226a(16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2226a(int i) {
        InterfaceC0096f interfaceC0096f = this.f4904b.f6073ao;
        if (interfaceC0096f == null) {
            GameEngine.m1145b("selectMenuOption: gameView==null");
            return;
        }
        ActivityC0097g mo6954i = interfaceC0096f.mo6954i();
        if (mo6954i == null) {
            GameEngine.m1145b("selectMenuOption: inGameActivity==null");
        } else {
            mo6954i.m6943c(i);
        }
    }

    /* renamed from: p */
    Menu m2183p() {
        this.f4996aP.clear();
        InterfaceC0096f interfaceC0096f = this.f4904b.f6073ao;
        if (interfaceC0096f == null) {
            GameEngine.m1145b("selectMenuOption: gameView==null");
            return this.f4996aP;
        }
        ActivityC0097g mo6954i = interfaceC0096f.mo6954i();
        if (mo6954i == null) {
            GameEngine.m1145b("selectMenuOption: inGameActivity==null");
            return this.f4996aP;
        }
        mo6954i.mo7358a(this.f4996aP);
        return this.f4996aP;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m2192g(float f) {
        String str;
        int i = (int) (this.f4904b.f6149cG - (30.0f * this.f4904b.f6126ci));
        int i2 = (int) ((this.f4904b.f6128ck - this.f4904b.f6132cp) + 10.0f);
        int i3 = ((int) (this.f4904b.f6132cp - 20.0f)) / 3;
        int i4 = i3 - 5;
        for (int i5 = 0; i5 < this.f4988aC.size(); i5++) {
            C0784ac c0784ac = (C0784ac) this.f4988aC.get(i5);
            if (c0784ac.f5068h) {
                c0784ac.m2116e();
                c0784ac.f5068h = false;
            }
            c0784ac.m2117d();
            if (this.f4904b.f6109bQ.keyboardSupport && i5 < this.f4904b.f6112bT.f4137ai.length) {
                if (this.f4904b.f6112bT.f4139ak[i5].m2958a()) {
                    c0784ac.m2119b();
                    c0784ac.m2118c();
                }
                if (this.f4904b.f6112bT.f4138aj[i5].m2958a()) {
                    this.f4903a.m1979k();
                    c0784ac.m2121a();
                }
                if (this.f4904b.f6112bT.f4137ai[i5].m2958a()) {
                    this.f4903a.m1979k();
                    this.f4903a.m1958x();
                    c0784ac.m2121a();
                }
            }
            if (this.f4904b.f6109bQ.showUnitGroups && i5 < 3) {
                if (c0784ac.f5061a.size() == 0) {
                    if (this.f4903a.f5249bz) {
                        str = "Empty";
                    } else {
                        str = "(" + (i5 + 1) + ")";
                    }
                } else {
                    str = VariableScope.nullOrMissingString + c0784ac.f5061a.size();
                }
                boolean z = false;
                c0784ac.f5064d = CommonUtils.m2368a(c0784ac.f5064d, 0.01f * f);
                c0784ac.f5065e = CommonUtils.m2368a(c0784ac.f5065e, 0.01f * f);
                c0784ac.f5066f = CommonUtils.m2368a(c0784ac.f5066f, 0.01f * f);
                if (this.f4903a.m2053a(i2, i, i4, (int) (31.0f * this.f4904b.f6126ci), str, EnumC0798g.none, true, Color.argb(50, (int) (100.0f + (c0784ac.f5066f * 100.0f)), (int) (100.0f + (c0784ac.f5065e * 100.0f)), (int) (100.0f + (c0784ac.f5064d * 100.0f)))) && this.f4903a.f5120W == null && !this.f4903a.f5219N) {
                    z = true;
                    c0784ac.f5062b += f;
                    this.f4903a.m1998d();
                    float f2 = 1.0f;
                    this.f4955i.m7271a();
                    this.f4955i.m7242b(Color.argb(120, 200, 0, 0));
                    if (c0784ac.f5062b < 50.0f) {
                        f2 = c0784ac.f5062b / 50.0f;
                        this.f4955i.m7242b(Color.argb((int) (150.0f + (f2 * 40.0f)), 0, 200, 0));
                        m2225a(i2, i, i4, "Select Group", "(Hold for more..)", this.f4955i, f2);
                    } else if (c0784ac.f5062b < 100.0f) {
                        f2 = (c0784ac.f5062b - 50.0f) / 50.0f;
                        this.f4955i.m7242b(Color.argb((int) (150.0f + (f2 * 40.0f)), 200, 0, 0));
                        m2225a(i2, i, i4, "Add to Group", "(Hold for more..)", this.f4955i, f2);
                    } else {
                        m2225a(i2, i, i4, "Replace Group", VariableScope.nullOrMissingString, this.f4955i, 0.0f);
                    }
                    int i6 = (int) (31.0f * this.f4904b.f6126ci);
                    this.f4961w.m7208a(i2, (int) ((i + i6) - (i6 * f2)), i2 + i4, i + i6);
                    this.f4904b.graphics.mo892b(this.f4961w, this.f4955i);
                }
                if (!z) {
                    if (c0784ac.f5062b != 0.0f && !this.f4903a.f5209D) {
                        if (c0784ac.f5062b > 100.0f) {
                            c0784ac.m2119b();
                            c0784ac.m2118c();
                            c0784ac.f5066f = 1.0f;
                        } else if (c0784ac.f5062b > 50.0f) {
                            c0784ac.m2118c();
                            this.f4903a.m1979k();
                            this.f4903a.m1958x();
                            c0784ac.m2121a();
                            c0784ac.f5065e = 1.0f;
                        } else if (c0784ac.f5061a.size() != 0) {
                            this.f4903a.m1979k();
                            this.f4903a.m1958x();
                            c0784ac.m2121a();
                            c0784ac.f5064d = 1.0f;
                        } else {
                            c0784ac.m2119b();
                            c0784ac.m2118c();
                            c0784ac.f5065e = 1.0f;
                        }
                    }
                    if (!z) {
                        c0784ac.f5062b = 0.0f;
                    }
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1487a(this.f4988aC.size());
        Iterator it = this.f4988aC.iterator();
        while (it.hasNext()) {
            ((C0784ac) it.next()).mo466a(c0859ar);
        }
        c0859ar.m1554c(0);
    }

    /* renamed from: a */
    public void m2214a(C0876k c0876k, boolean z) {
        if (!z) {
            this.f4988aC.clear();
        }
        int m1454f = c0876k.m1454f();
        int i = 0;
        while (i < m1454f) {
            C0784ac c0784ac = new C0784ac(this, i < 3);
            c0784ac.m2120a(c0876k);
            if (!z) {
                this.f4988aC.add(c0784ac);
            }
            i++;
        }
        c0876k.m1457d();
    }

    /* renamed from: q */
    public void m2182q() {
        this.f4997aQ = C0796e.m2079a();
    }

    /* renamed from: r */
    public void m2181r() {
        this.f4997aQ = C0796e.m2079a();
    }
}
